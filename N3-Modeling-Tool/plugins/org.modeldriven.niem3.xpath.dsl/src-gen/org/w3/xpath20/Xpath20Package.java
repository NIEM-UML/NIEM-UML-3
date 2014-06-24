/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Factory
 * @model kind="package"
 * @generated
 */
public interface Xpath20Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xpath20";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.w3.org/Xpath20";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xpath20";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Xpath20Package eINSTANCE = org.w3.xpath20.impl.Xpath20PackageImpl.init();

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.XPathImpl <em>XPath</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.XPathImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getXPath()
   * @generated
   */
  int XPATH = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>XPath</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PrimaryExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPrimaryExpr()
   * @generated
   */
  int PRIMARY_EXPR = 71;

  /**
   * The number of structural features of the '<em>Primary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.LiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 42;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.NumericLiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 43;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.IntegerLiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.DecimalLiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDecimalLiteral()
   * @generated
   */
  int DECIMAL_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.DoubleLiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.StringLiteralImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.VarNameImpl <em>Var Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.VarNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getVarName()
   * @generated
   */
  int VAR_NAME = 12;

  /**
   * The number of structural features of the '<em>Var Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.QNameImpl <em>QName</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.QNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getQName()
   * @generated
   */
  int QNAME = 5;

  /**
   * The feature id for the '<em><b>Local Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__LOCAL_PART = VAR_NAME_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QName</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_FEATURE_COUNT = VAR_NAME_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PrefixedNameImpl <em>Prefixed Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PrefixedNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPrefixedName()
   * @generated
   */
  int PREFIXED_NAME = 6;

  /**
   * The feature id for the '<em><b>Local Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIXED_NAME__LOCAL_PART = QNAME__LOCAL_PART;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIXED_NAME__PREFIX = QNAME_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prefixed Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIXED_NAME_FEATURE_COUNT = QNAME_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.UnprefixedNameImpl <em>Unprefixed Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.UnprefixedNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnprefixedName()
   * @generated
   */
  int UNPREFIXED_NAME = 7;

  /**
   * The feature id for the '<em><b>Local Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPREFIXED_NAME__LOCAL_PART = QNAME__LOCAL_PART;

  /**
   * The number of structural features of the '<em>Unprefixed Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPREFIXED_NAME_FEATURE_COUNT = QNAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getExpr()
   * @generated
   */
  int EXPR = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ExprSingleImpl <em>Expr Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ExprSingleImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getExprSingle()
   * @generated
   */
  int EXPR_SINGLE = 9;

  /**
   * The number of structural features of the '<em>Expr Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SINGLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ForExprImpl <em>For Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ForExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForExpr()
   * @generated
   */
  int FOR_EXPR = 10;

  /**
   * The feature id for the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR__FOR = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR__RETURN = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.SimpleForClauseImpl <em>Simple For Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.SimpleForClauseImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSimpleForClause()
   * @generated
   */
  int SIMPLE_FOR_CLAUSE = 11;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Simple For Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.QuantifiedExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getQuantifiedExpr()
   * @generated
   */
  int QUANTIFIED_EXPR = 13;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__QUANTIFIER = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__VARIABLE = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__EXPRESSION = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Satisfies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__SATISFIES = EXPR_SINGLE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Quantified Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.IfExprImpl <em>If Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.IfExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIfExpr()
   * @generated
   */
  int IF_EXPR = 14;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__IF = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__THEN = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__ELSE = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.OrExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 15;

  /**
   * The feature id for the '<em><b>Or</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__OR = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AndExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 16;

  /**
   * The feature id for the '<em><b>And</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__AND = 0;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ComparisonExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getComparisonExpr()
   * @generated
   */
  int COMPARISON_EXPR = 17;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__OPERAND1 = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__VALUE = 1;

  /**
   * The feature id for the '<em><b>General</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__GENERAL = 2;

  /**
   * The feature id for the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__NODE = 3;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__RANGE = 4;

  /**
   * The number of structural features of the '<em>Comparison Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.RangeExprImpl <em>Range Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.RangeExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getRangeExpr()
   * @generated
   */
  int RANGE_EXPR = 18;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__RANGE = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__TO = 1;

  /**
   * The number of structural features of the '<em>Range Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AdditiveExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAdditiveExpr()
   * @generated
   */
  int ADDITIVE_EXPR = 19;

  /**
   * The feature id for the '<em><b>Add</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__ADD = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Additive Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.MultiplicativeExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getMultiplicativeExpr()
   * @generated
   */
  int MULTIPLICATIVE_EXPR = 20;

  /**
   * The feature id for the '<em><b>Multiply</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__MULTIPLY = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.UnionExprImpl <em>Union Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.UnionExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnionExpr()
   * @generated
   */
  int UNION_EXPR = 21;

  /**
   * The feature id for the '<em><b>Union</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR__UNION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Union Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.IntersectExceptExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntersectExceptExpr()
   * @generated
   */
  int INTERSECT_EXCEPT_EXPR = 22;

  /**
   * The feature id for the '<em><b>Intersect</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR__INTERSECT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Intersect Except Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.InstanceofExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getInstanceofExpr()
   * @generated
   */
  int INSTANCEOF_EXPR = 23;

  /**
   * The feature id for the '<em><b>Treat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR__TREAT = 0;

  /**
   * The feature id for the '<em><b>Instance Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR__INSTANCE_OF = 1;

  /**
   * The number of structural features of the '<em>Instanceof Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.TreatExprImpl <em>Treat Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.TreatExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTreatExpr()
   * @generated
   */
  int TREAT_EXPR = 24;

  /**
   * The feature id for the '<em><b>Castable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR__CASTABLE = 0;

  /**
   * The feature id for the '<em><b>Treat As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR__TREAT_AS = 1;

  /**
   * The number of structural features of the '<em>Treat Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.SequenceTypeImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSequenceType()
   * @generated
   */
  int SEQUENCE_TYPE = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Occurrence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__OCCURRENCE = 1;

  /**
   * The number of structural features of the '<em>Sequence Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ItemTypeImpl <em>Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ItemTypeImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getItemType()
   * @generated
   */
  int ITEM_TYPE = 26;

  /**
   * The feature id for the '<em><b>Kind Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__KIND_TEST = 0;

  /**
   * The feature id for the '<em><b>Atomic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__ATOMIC_TYPE = 1;

  /**
   * The number of structural features of the '<em>Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AtomicTypeImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAtomicType()
   * @generated
   */
  int ATOMIC_TYPE = 27;

  /**
   * The number of structural features of the '<em>Atomic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.CastableExprImpl <em>Castable Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.CastableExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCastableExpr()
   * @generated
   */
  int CASTABLE_EXPR = 28;

  /**
   * The feature id for the '<em><b>Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR__CAST = 0;

  /**
   * The feature id for the '<em><b>Castable As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR__CASTABLE_AS = 1;

  /**
   * The number of structural features of the '<em>Castable Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.CastExprImpl <em>Cast Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.CastExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCastExpr()
   * @generated
   */
  int CAST_EXPR = 29;

  /**
   * The feature id for the '<em><b>Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__CAST = 0;

  /**
   * The feature id for the '<em><b>Cast As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__CAST_AS = 1;

  /**
   * The number of structural features of the '<em>Cast Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ValueExprImpl <em>Value Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ValueExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getValueExpr()
   * @generated
   */
  int VALUE_EXPR = 30;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPR__PATH = 0;

  /**
   * The number of structural features of the '<em>Value Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.SingleTypeImpl <em>Single Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.SingleTypeImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSingleType()
   * @generated
   */
  int SINGLE_TYPE = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_TYPE__QUESTION = 1;

  /**
   * The number of structural features of the '<em>Single Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.RelativePathExprImpl <em>Relative Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.RelativePathExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getRelativePathExpr()
   * @generated
   */
  int RELATIVE_PATH_EXPR = 32;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR__STEP = 0;

  /**
   * The feature id for the '<em><b>Separator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR__SEPARATOR = 1;

  /**
   * The number of structural features of the '<em>Relative Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PredicateListImpl <em>Predicate List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PredicateListImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPredicateList()
   * @generated
   */
  int PREDICATE_LIST = 33;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_LIST__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Predicate List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PredicateImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 34;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ReverseStepImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseStep()
   * @generated
   */
  int REVERSE_STEP = 35;

  /**
   * The feature id for the '<em><b>Axis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__AXIS = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__TEST = 1;

  /**
   * The feature id for the '<em><b>Abbrev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__ABBREV = 2;

  /**
   * The number of structural features of the '<em>Reverse Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ReverseAxisImpl <em>Reverse Axis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ReverseAxisImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseAxis()
   * @generated
   */
  int REVERSE_AXIS = 36;

  /**
   * The feature id for the '<em><b>Axis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_AXIS__AXIS = 0;

  /**
   * The number of structural features of the '<em>Reverse Axis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_AXIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.NodeTestImpl <em>Node Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.NodeTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNodeTest()
   * @generated
   */
  int NODE_TEST = 37;

  /**
   * The number of structural features of the '<em>Node Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TEST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.NameTestImpl <em>Name Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.NameTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNameTest()
   * @generated
   */
  int NAME_TEST = 38;

  /**
   * The number of structural features of the '<em>Name Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TEST_FEATURE_COUNT = NODE_TEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ForwardStepImpl <em>Forward Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ForwardStepImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardStep()
   * @generated
   */
  int FORWARD_STEP = 39;

  /**
   * The feature id for the '<em><b>Axis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__AXIS = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__TEST = 1;

  /**
   * The feature id for the '<em><b>Abbrev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__ABBREV = 2;

  /**
   * The number of structural features of the '<em>Forward Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ForwardAxisImpl <em>Forward Axis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ForwardAxisImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardAxis()
   * @generated
   */
  int FORWARD_AXIS = 40;

  /**
   * The feature id for the '<em><b>Axis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_AXIS__AXIS = 0;

  /**
   * The number of structural features of the '<em>Forward Axis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_AXIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AbbrevForwardStepImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAbbrevForwardStep()
   * @generated
   */
  int ABBREV_FORWARD_STEP = 41;

  /**
   * The feature id for the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_FORWARD_STEP__AT = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_FORWARD_STEP__TEST = 1;

  /**
   * The number of structural features of the '<em>Abbrev Forward Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_FORWARD_STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.VarRefImpl <em>Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.VarRefImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getVarRef()
   * @generated
   */
  int VAR_REF = 44;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__VAR = PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ParenthesizedExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getParenthesizedExpr()
   * @generated
   */
  int PARENTHESIZED_EXPR = 45;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPRESSION = PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesized Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ContextItemExprImpl <em>Context Item Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ContextItemExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getContextItemExpr()
   * @generated
   */
  int CONTEXT_ITEM_EXPR = 46;

  /**
   * The number of structural features of the '<em>Context Item Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_ITEM_EXPR_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.FunctionCallImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 47;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMETER = PRIMARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = PRIMARY_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.KindTestImpl <em>Kind Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.KindTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getKindTest()
   * @generated
   */
  int KIND_TEST = 48;

  /**
   * The number of structural features of the '<em>Kind Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST_FEATURE_COUNT = NODE_TEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ElementDeclarationImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementDeclaration()
   * @generated
   */
  int ELEMENT_DECLARATION = 49;

  /**
   * The number of structural features of the '<em>Element Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AttributeDeclarationImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeDeclaration()
   * @generated
   */
  int ATTRIBUTE_DECLARATION = 59;

  /**
   * The number of structural features of the '<em>Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AttributeNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 50;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = ATTRIBUTE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ElementNameImpl <em>Element Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ElementNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementName()
   * @generated
   */
  int ELEMENT_NAME = 51;

  /**
   * The number of structural features of the '<em>Element Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_FEATURE_COUNT = ELEMENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.TypeNameImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 52;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AnyKindTestImpl <em>Any Kind Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AnyKindTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAnyKindTest()
   * @generated
   */
  int ANY_KIND_TEST = 53;

  /**
   * The number of structural features of the '<em>Any Kind Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_KIND_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.DocumentTestImpl <em>Document Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.DocumentTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDocumentTest()
   * @generated
   */
  int DOCUMENT_TEST = 54;

  /**
   * The feature id for the '<em><b>Element Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST__ELEMENT_TEST = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Schema Element Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST__SCHEMA_ELEMENT_TEST = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Document Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.TextTestImpl <em>Text Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.TextTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTextTest()
   * @generated
   */
  int TEXT_TEST = 55;

  /**
   * The number of structural features of the '<em>Text Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.CommentTestImpl <em>Comment Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.CommentTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCommentTest()
   * @generated
   */
  int COMMENT_TEST = 56;

  /**
   * The number of structural features of the '<em>Comment Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PITestImpl <em>PI Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PITestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPITest()
   * @generated
   */
  int PI_TEST = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_TEST__NAME = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_TEST__STRING = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PI Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.SchemaAttributeTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSchemaAttributeTest()
   * @generated
   */
  int SCHEMA_ATTRIBUTE_TEST = 58;

  /**
   * The feature id for the '<em><b>Attribute Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Schema Attribute Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ATTRIBUTE_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.SchemaElementTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSchemaElementTest()
   * @generated
   */
  int SCHEMA_ELEMENT_TEST = 60;

  /**
   * The feature id for the '<em><b>Element Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Schema Element Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ELEMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.UnaryExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 61;

  /**
   * The feature id for the '<em><b>Unary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__UNARY = 0;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.WildcardImpl <em>Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.WildcardImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getWildcard()
   * @generated
   */
  int WILDCARD = 62;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__PREFIX = NAME_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__ANY = NAME_TEST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_FEATURE_COUNT = NAME_TEST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ElementTestImpl <em>Element Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ElementTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementTest()
   * @generated
   */
  int ELEMENT_TEST = 63;

  /**
   * The feature id for the '<em><b>Element Name Or Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST__TYPE_NAME = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST__QUESTION = KIND_TEST_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Element Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AttributeTestImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeTest()
   * @generated
   */
  int ATTRIBUTE_TEST = 64;

  /**
   * The feature id for the '<em><b>Attribute Name Or Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD = KIND_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST__TYPE_NAME = KIND_TEST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST_FEATURE_COUNT = KIND_TEST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.StepExprImpl <em>Step Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.StepExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getStepExpr()
   * @generated
   */
  int STEP_EXPR = 66;

  /**
   * The number of structural features of the '<em>Step Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AxisStepImpl <em>Axis Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AxisStepImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAxisStep()
   * @generated
   */
  int AXIS_STEP = 65;

  /**
   * The feature id for the '<em><b>Reverse Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__REVERSE_STEP = STEP_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Forward Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__FORWARD_STEP = STEP_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__PREDICATE = STEP_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Axis Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP_FEATURE_COUNT = STEP_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.FilterExprImpl <em>Filter Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.FilterExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getFilterExpr()
   * @generated
   */
  int FILTER_EXPR = 67;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR__FILTER = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR__PREDICATE = 1;

  /**
   * The number of structural features of the '<em>Filter Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.PathExprImpl <em>Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.PathExprImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPathExpr()
   * @generated
   */
  int PATH_EXPR = 68;

  /**
   * The feature id for the '<em><b>Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__SEPARATOR = 0;

  /**
   * The feature id for the '<em><b>Relative Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__RELATIVE_PATH = 1;

  /**
   * The number of structural features of the '<em>Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.AttribNameOrWildcardImpl <em>Attrib Name Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.AttribNameOrWildcardImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttribNameOrWildcard()
   * @generated
   */
  int ATTRIB_NAME_OR_WILDCARD = 69;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME = 0;

  /**
   * The number of structural features of the '<em>Attrib Name Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIB_NAME_OR_WILDCARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.impl.ElementNameOrWildcardImpl <em>Element Name Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.impl.ElementNameOrWildcardImpl
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementNameOrWildcard()
   * @generated
   */
  int ELEMENT_NAME_OR_WILDCARD = 70;

  /**
   * The feature id for the '<em><b>Element Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME = 0;

  /**
   * The number of structural features of the '<em>Element Name Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_OR_WILDCARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.w3.xpath20.IntersectExcept <em>Intersect Except</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.IntersectExcept
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntersectExcept()
   * @generated
   */
  int INTERSECT_EXCEPT = 72;

  /**
   * The meta object id for the '{@link org.w3.xpath20.Union <em>Union</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.Union
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnion()
   * @generated
   */
  int UNION = 73;

  /**
   * The meta object id for the '{@link org.w3.xpath20.Additive <em>Additive</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.Additive
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAdditive()
   * @generated
   */
  int ADDITIVE = 74;

  /**
   * The meta object id for the '{@link org.w3.xpath20.GeneralComp <em>General Comp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.GeneralComp
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getGeneralComp()
   * @generated
   */
  int GENERAL_COMP = 75;

  /**
   * The meta object id for the '{@link org.w3.xpath20.ValueComp <em>Value Comp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.ValueComp
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getValueComp()
   * @generated
   */
  int VALUE_COMP = 76;

  /**
   * The meta object id for the '{@link org.w3.xpath20.NodeComp <em>Node Comp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.NodeComp
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNodeComp()
   * @generated
   */
  int NODE_COMP = 77;

  /**
   * The meta object id for the '{@link org.w3.xpath20.Separator <em>Separator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.Separator
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSeparator()
   * @generated
   */
  int SEPARATOR = 78;

  /**
   * The meta object id for the '{@link org.w3.xpath20.ReverseAxisEnum <em>Reverse Axis Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.ReverseAxisEnum
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseAxisEnum()
   * @generated
   */
  int REVERSE_AXIS_ENUM = 79;

  /**
   * The meta object id for the '{@link org.w3.xpath20.ForwardAxisEnum <em>Forward Axis Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.ForwardAxisEnum
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardAxisEnum()
   * @generated
   */
  int FORWARD_AXIS_ENUM = 80;

  /**
   * The meta object id for the '{@link org.w3.xpath20.OccurrenceIndicator <em>Occurrence Indicator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.OccurrenceIndicator
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getOccurrenceIndicator()
   * @generated
   */
  int OCCURRENCE_INDICATOR = 81;

  /**
   * The meta object id for the '{@link org.w3.xpath20.Multiplicative <em>Multiplicative</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3.xpath20.Multiplicative
   * @see org.w3.xpath20.impl.Xpath20PackageImpl#getMultiplicative()
   * @generated
   */
  int MULTIPLICATIVE = 82;


  /**
   * Returns the meta object for class '{@link org.w3.xpath20.XPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPath</em>'.
   * @see org.w3.xpath20.XPath
   * @generated
   */
  EClass getXPath();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.XPath#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.w3.xpath20.XPath#getExpressions()
   * @see #getXPath()
   * @generated
   */
  EReference getXPath_Expressions();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.w3.xpath20.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.w3.xpath20.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.DecimalLiteral <em>Decimal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Literal</em>'.
   * @see org.w3.xpath20.DecimalLiteral
   * @generated
   */
  EClass getDecimalLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.DecimalLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.w3.xpath20.DecimalLiteral#getValue()
   * @see #getDecimalLiteral()
   * @generated
   */
  EAttribute getDecimalLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see org.w3.xpath20.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.DoubleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.w3.xpath20.DoubleLiteral#getValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.w3.xpath20.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.w3.xpath20.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QName</em>'.
   * @see org.w3.xpath20.QName
   * @generated
   */
  EClass getQName();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.QName#getLocalPart <em>Local Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Part</em>'.
   * @see org.w3.xpath20.QName#getLocalPart()
   * @see #getQName()
   * @generated
   */
  EAttribute getQName_LocalPart();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.PrefixedName <em>Prefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefixed Name</em>'.
   * @see org.w3.xpath20.PrefixedName
   * @generated
   */
  EClass getPrefixedName();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.PrefixedName#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.w3.xpath20.PrefixedName#getPrefix()
   * @see #getPrefixedName()
   * @generated
   */
  EAttribute getPrefixedName_Prefix();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.UnprefixedName <em>Unprefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unprefixed Name</em>'.
   * @see org.w3.xpath20.UnprefixedName
   * @generated
   */
  EClass getUnprefixedName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.w3.xpath20.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.Expr#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.w3.xpath20.Expr#getExpression()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Expression();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ExprSingle <em>Expr Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Single</em>'.
   * @see org.w3.xpath20.ExprSingle
   * @generated
   */
  EClass getExprSingle();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ForExpr <em>For Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Expr</em>'.
   * @see org.w3.xpath20.ForExpr
   * @generated
   */
  EClass getForExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ForExpr#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For</em>'.
   * @see org.w3.xpath20.ForExpr#getFor()
   * @see #getForExpr()
   * @generated
   */
  EReference getForExpr_For();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ForExpr#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see org.w3.xpath20.ForExpr#getReturn()
   * @see #getForExpr()
   * @generated
   */
  EReference getForExpr_Return();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.SimpleForClause <em>Simple For Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple For Clause</em>'.
   * @see org.w3.xpath20.SimpleForClause
   * @generated
   */
  EClass getSimpleForClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.SimpleForClause#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.w3.xpath20.SimpleForClause#getVariable()
   * @see #getSimpleForClause()
   * @generated
   */
  EReference getSimpleForClause_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.SimpleForClause#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.w3.xpath20.SimpleForClause#getExpression()
   * @see #getSimpleForClause()
   * @generated
   */
  EReference getSimpleForClause_Expression();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Name</em>'.
   * @see org.w3.xpath20.VarName
   * @generated
   */
  EClass getVarName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Expr</em>'.
   * @see org.w3.xpath20.QuantifiedExpr
   * @generated
   */
  EClass getQuantifiedExpr();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.QuantifiedExpr#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantifier</em>'.
   * @see org.w3.xpath20.QuantifiedExpr#getQuantifier()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EAttribute getQuantifiedExpr_Quantifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.QuantifiedExpr#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.w3.xpath20.QuantifiedExpr#getVariable()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.QuantifiedExpr#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.w3.xpath20.QuantifiedExpr#getExpression()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.QuantifiedExpr#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Satisfies</em>'.
   * @see org.w3.xpath20.QuantifiedExpr#getSatisfies()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Satisfies();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.IfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Expr</em>'.
   * @see org.w3.xpath20.IfExpr
   * @generated
   */
  EClass getIfExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.IfExpr#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.w3.xpath20.IfExpr#getIf()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_If();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.IfExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.w3.xpath20.IfExpr#getThen()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.IfExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.w3.xpath20.IfExpr#getElse()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_Else();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see org.w3.xpath20.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.OrExpr#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Or</em>'.
   * @see org.w3.xpath20.OrExpr#getOr()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Or();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see org.w3.xpath20.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.AndExpr#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And</em>'.
   * @see org.w3.xpath20.AndExpr#getAnd()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_And();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ComparisonExpr <em>Comparison Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Expr</em>'.
   * @see org.w3.xpath20.ComparisonExpr
   * @generated
   */
  EClass getComparisonExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ComparisonExpr#getOperand1 <em>Operand1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand1</em>'.
   * @see org.w3.xpath20.ComparisonExpr#getOperand1()
   * @see #getComparisonExpr()
   * @generated
   */
  EReference getComparisonExpr_Operand1();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ComparisonExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.w3.xpath20.ComparisonExpr#getValue()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_Value();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ComparisonExpr#getGeneral <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>General</em>'.
   * @see org.w3.xpath20.ComparisonExpr#getGeneral()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_General();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ComparisonExpr#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node</em>'.
   * @see org.w3.xpath20.ComparisonExpr#getNode()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_Node();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ComparisonExpr#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.w3.xpath20.ComparisonExpr#getRange()
   * @see #getComparisonExpr()
   * @generated
   */
  EReference getComparisonExpr_Range();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.RangeExpr <em>Range Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Expr</em>'.
   * @see org.w3.xpath20.RangeExpr
   * @generated
   */
  EClass getRangeExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.RangeExpr#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.w3.xpath20.RangeExpr#getRange()
   * @see #getRangeExpr()
   * @generated
   */
  EReference getRangeExpr_Range();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.RangeExpr#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.w3.xpath20.RangeExpr#getTo()
   * @see #getRangeExpr()
   * @generated
   */
  EReference getRangeExpr_To();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expr</em>'.
   * @see org.w3.xpath20.AdditiveExpr
   * @generated
   */
  EClass getAdditiveExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.AdditiveExpr#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Add</em>'.
   * @see org.w3.xpath20.AdditiveExpr#getAdd()
   * @see #getAdditiveExpr()
   * @generated
   */
  EReference getAdditiveExpr_Add();

  /**
   * Returns the meta object for the attribute list '{@link org.w3.xpath20.AdditiveExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.w3.xpath20.AdditiveExpr#getOperator()
   * @see #getAdditiveExpr()
   * @generated
   */
  EAttribute getAdditiveExpr_Operator();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr</em>'.
   * @see org.w3.xpath20.MultiplicativeExpr
   * @generated
   */
  EClass getMultiplicativeExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.MultiplicativeExpr#getMultiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiply</em>'.
   * @see org.w3.xpath20.MultiplicativeExpr#getMultiply()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Multiply();

  /**
   * Returns the meta object for the attribute list '{@link org.w3.xpath20.MultiplicativeExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.w3.xpath20.MultiplicativeExpr#getOperator()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EAttribute getMultiplicativeExpr_Operator();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.UnionExpr <em>Union Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Expr</em>'.
   * @see org.w3.xpath20.UnionExpr
   * @generated
   */
  EClass getUnionExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.UnionExpr#getUnion <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Union</em>'.
   * @see org.w3.xpath20.UnionExpr#getUnion()
   * @see #getUnionExpr()
   * @generated
   */
  EReference getUnionExpr_Union();

  /**
   * Returns the meta object for the attribute list '{@link org.w3.xpath20.UnionExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.w3.xpath20.UnionExpr#getOperator()
   * @see #getUnionExpr()
   * @generated
   */
  EAttribute getUnionExpr_Operator();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intersect Except Expr</em>'.
   * @see org.w3.xpath20.IntersectExceptExpr
   * @generated
   */
  EClass getIntersectExceptExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.IntersectExceptExpr#getIntersect <em>Intersect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intersect</em>'.
   * @see org.w3.xpath20.IntersectExceptExpr#getIntersect()
   * @see #getIntersectExceptExpr()
   * @generated
   */
  EReference getIntersectExceptExpr_Intersect();

  /**
   * Returns the meta object for the attribute list '{@link org.w3.xpath20.IntersectExceptExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.w3.xpath20.IntersectExceptExpr#getOperator()
   * @see #getIntersectExceptExpr()
   * @generated
   */
  EAttribute getIntersectExceptExpr_Operator();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.InstanceofExpr <em>Instanceof Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instanceof Expr</em>'.
   * @see org.w3.xpath20.InstanceofExpr
   * @generated
   */
  EClass getInstanceofExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.InstanceofExpr#getTreat <em>Treat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Treat</em>'.
   * @see org.w3.xpath20.InstanceofExpr#getTreat()
   * @see #getInstanceofExpr()
   * @generated
   */
  EReference getInstanceofExpr_Treat();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.InstanceofExpr#getInstanceOf <em>Instance Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instance Of</em>'.
   * @see org.w3.xpath20.InstanceofExpr#getInstanceOf()
   * @see #getInstanceofExpr()
   * @generated
   */
  EReference getInstanceofExpr_InstanceOf();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.TreatExpr <em>Treat Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treat Expr</em>'.
   * @see org.w3.xpath20.TreatExpr
   * @generated
   */
  EClass getTreatExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.TreatExpr#getCastable <em>Castable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Castable</em>'.
   * @see org.w3.xpath20.TreatExpr#getCastable()
   * @see #getTreatExpr()
   * @generated
   */
  EReference getTreatExpr_Castable();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.TreatExpr#getTreatAs <em>Treat As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Treat As</em>'.
   * @see org.w3.xpath20.TreatExpr#getTreatAs()
   * @see #getTreatExpr()
   * @generated
   */
  EReference getTreatExpr_TreatAs();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Type</em>'.
   * @see org.w3.xpath20.SequenceType
   * @generated
   */
  EClass getSequenceType();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.SequenceType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.w3.xpath20.SequenceType#getType()
   * @see #getSequenceType()
   * @generated
   */
  EReference getSequenceType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.SequenceType#getOccurrence <em>Occurrence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Occurrence</em>'.
   * @see org.w3.xpath20.SequenceType#getOccurrence()
   * @see #getSequenceType()
   * @generated
   */
  EAttribute getSequenceType_Occurrence();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Type</em>'.
   * @see org.w3.xpath20.ItemType
   * @generated
   */
  EClass getItemType();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ItemType#getKindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kind Test</em>'.
   * @see org.w3.xpath20.ItemType#getKindTest()
   * @see #getItemType()
   * @generated
   */
  EReference getItemType_KindTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ItemType#getAtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic Type</em>'.
   * @see org.w3.xpath20.ItemType#getAtomicType()
   * @see #getItemType()
   * @generated
   */
  EReference getItemType_AtomicType();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Type</em>'.
   * @see org.w3.xpath20.AtomicType
   * @generated
   */
  EClass getAtomicType();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.CastableExpr <em>Castable Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Castable Expr</em>'.
   * @see org.w3.xpath20.CastableExpr
   * @generated
   */
  EClass getCastableExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.CastableExpr#getCast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast</em>'.
   * @see org.w3.xpath20.CastableExpr#getCast()
   * @see #getCastableExpr()
   * @generated
   */
  EReference getCastableExpr_Cast();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.CastableExpr#getCastableAs <em>Castable As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Castable As</em>'.
   * @see org.w3.xpath20.CastableExpr#getCastableAs()
   * @see #getCastableExpr()
   * @generated
   */
  EReference getCastableExpr_CastableAs();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expr</em>'.
   * @see org.w3.xpath20.CastExpr
   * @generated
   */
  EClass getCastExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.CastExpr#getCast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast</em>'.
   * @see org.w3.xpath20.CastExpr#getCast()
   * @see #getCastExpr()
   * @generated
   */
  EReference getCastExpr_Cast();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.CastExpr#getCastAs <em>Cast As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast As</em>'.
   * @see org.w3.xpath20.CastExpr#getCastAs()
   * @see #getCastExpr()
   * @generated
   */
  EReference getCastExpr_CastAs();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expr</em>'.
   * @see org.w3.xpath20.ValueExpr
   * @generated
   */
  EClass getValueExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ValueExpr#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.w3.xpath20.ValueExpr#getPath()
   * @see #getValueExpr()
   * @generated
   */
  EReference getValueExpr_Path();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.SingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Type</em>'.
   * @see org.w3.xpath20.SingleType
   * @generated
   */
  EClass getSingleType();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.SingleType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.w3.xpath20.SingleType#getType()
   * @see #getSingleType()
   * @generated
   */
  EReference getSingleType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.SingleType#isQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see org.w3.xpath20.SingleType#isQuestion()
   * @see #getSingleType()
   * @generated
   */
  EAttribute getSingleType_Question();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.RelativePathExpr <em>Relative Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Path Expr</em>'.
   * @see org.w3.xpath20.RelativePathExpr
   * @generated
   */
  EClass getRelativePathExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.RelativePathExpr#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Step</em>'.
   * @see org.w3.xpath20.RelativePathExpr#getStep()
   * @see #getRelativePathExpr()
   * @generated
   */
  EReference getRelativePathExpr_Step();

  /**
   * Returns the meta object for the attribute list '{@link org.w3.xpath20.RelativePathExpr#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Separator</em>'.
   * @see org.w3.xpath20.RelativePathExpr#getSeparator()
   * @see #getRelativePathExpr()
   * @generated
   */
  EAttribute getRelativePathExpr_Separator();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.PredicateList <em>Predicate List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate List</em>'.
   * @see org.w3.xpath20.PredicateList
   * @generated
   */
  EClass getPredicateList();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.PredicateList#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate</em>'.
   * @see org.w3.xpath20.PredicateList#getPredicate()
   * @see #getPredicateList()
   * @generated
   */
  EReference getPredicateList_Predicate();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see org.w3.xpath20.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.Predicate#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.w3.xpath20.Predicate#getPredicate()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Predicate();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ReverseStep <em>Reverse Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reverse Step</em>'.
   * @see org.w3.xpath20.ReverseStep
   * @generated
   */
  EClass getReverseStep();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ReverseStep#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Axis</em>'.
   * @see org.w3.xpath20.ReverseStep#getAxis()
   * @see #getReverseStep()
   * @generated
   */
  EReference getReverseStep_Axis();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ReverseStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.w3.xpath20.ReverseStep#getTest()
   * @see #getReverseStep()
   * @generated
   */
  EReference getReverseStep_Test();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ReverseStep#getAbbrev <em>Abbrev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbrev</em>'.
   * @see org.w3.xpath20.ReverseStep#getAbbrev()
   * @see #getReverseStep()
   * @generated
   */
  EAttribute getReverseStep_Abbrev();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ReverseAxis <em>Reverse Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reverse Axis</em>'.
   * @see org.w3.xpath20.ReverseAxis
   * @generated
   */
  EClass getReverseAxis();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ReverseAxis#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Axis</em>'.
   * @see org.w3.xpath20.ReverseAxis#getAxis()
   * @see #getReverseAxis()
   * @generated
   */
  EAttribute getReverseAxis_Axis();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.NodeTest <em>Node Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Test</em>'.
   * @see org.w3.xpath20.NodeTest
   * @generated
   */
  EClass getNodeTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.NameTest <em>Name Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Test</em>'.
   * @see org.w3.xpath20.NameTest
   * @generated
   */
  EClass getNameTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ForwardStep <em>Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forward Step</em>'.
   * @see org.w3.xpath20.ForwardStep
   * @generated
   */
  EClass getForwardStep();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ForwardStep#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Axis</em>'.
   * @see org.w3.xpath20.ForwardStep#getAxis()
   * @see #getForwardStep()
   * @generated
   */
  EReference getForwardStep_Axis();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ForwardStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.w3.xpath20.ForwardStep#getTest()
   * @see #getForwardStep()
   * @generated
   */
  EReference getForwardStep_Test();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ForwardStep#getAbbrev <em>Abbrev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abbrev</em>'.
   * @see org.w3.xpath20.ForwardStep#getAbbrev()
   * @see #getForwardStep()
   * @generated
   */
  EReference getForwardStep_Abbrev();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ForwardAxis <em>Forward Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forward Axis</em>'.
   * @see org.w3.xpath20.ForwardAxis
   * @generated
   */
  EClass getForwardAxis();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ForwardAxis#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Axis</em>'.
   * @see org.w3.xpath20.ForwardAxis#getAxis()
   * @see #getForwardAxis()
   * @generated
   */
  EAttribute getForwardAxis_Axis();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbrev Forward Step</em>'.
   * @see org.w3.xpath20.AbbrevForwardStep
   * @generated
   */
  EClass getAbbrevForwardStep();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.AbbrevForwardStep#isAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At</em>'.
   * @see org.w3.xpath20.AbbrevForwardStep#isAt()
   * @see #getAbbrevForwardStep()
   * @generated
   */
  EAttribute getAbbrevForwardStep_At();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AbbrevForwardStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.w3.xpath20.AbbrevForwardStep#getTest()
   * @see #getAbbrevForwardStep()
   * @generated
   */
  EReference getAbbrevForwardStep_Test();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.w3.xpath20.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see org.w3.xpath20.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref</em>'.
   * @see org.w3.xpath20.VarRef
   * @generated
   */
  EClass getVarRef();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.VarRef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.w3.xpath20.VarRef#getVar()
   * @see #getVarRef()
   * @generated
   */
  EReference getVarRef_Var();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expr</em>'.
   * @see org.w3.xpath20.ParenthesizedExpr
   * @generated
   */
  EClass getParenthesizedExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ParenthesizedExpr#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.w3.xpath20.ParenthesizedExpr#getExpression()
   * @see #getParenthesizedExpr()
   * @generated
   */
  EReference getParenthesizedExpr_Expression();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ContextItemExpr <em>Context Item Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Item Expr</em>'.
   * @see org.w3.xpath20.ContextItemExpr
   * @generated
   */
  EClass getContextItemExpr();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.w3.xpath20.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.FunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.w3.xpath20.FunctionCall#getFunction()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.FunctionCall#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.w3.xpath20.FunctionCall#getParameter()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Parameter();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.KindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kind Test</em>'.
   * @see org.w3.xpath20.KindTest
   * @generated
   */
  EClass getKindTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Declaration</em>'.
   * @see org.w3.xpath20.ElementDeclaration
   * @generated
   */
  EClass getElementDeclaration();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see org.w3.xpath20.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Name</em>'.
   * @see org.w3.xpath20.ElementName
   * @generated
   */
  EClass getElementName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see org.w3.xpath20.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AnyKindTest <em>Any Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Kind Test</em>'.
   * @see org.w3.xpath20.AnyKindTest
   * @generated
   */
  EClass getAnyKindTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.DocumentTest <em>Document Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Test</em>'.
   * @see org.w3.xpath20.DocumentTest
   * @generated
   */
  EClass getDocumentTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.DocumentTest#getElementTest <em>Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Test</em>'.
   * @see org.w3.xpath20.DocumentTest#getElementTest()
   * @see #getDocumentTest()
   * @generated
   */
  EReference getDocumentTest_ElementTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.DocumentTest#getSchemaElementTest <em>Schema Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema Element Test</em>'.
   * @see org.w3.xpath20.DocumentTest#getSchemaElementTest()
   * @see #getDocumentTest()
   * @generated
   */
  EReference getDocumentTest_SchemaElementTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.TextTest <em>Text Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Test</em>'.
   * @see org.w3.xpath20.TextTest
   * @generated
   */
  EClass getTextTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.CommentTest <em>Comment Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment Test</em>'.
   * @see org.w3.xpath20.CommentTest
   * @generated
   */
  EClass getCommentTest();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.PITest <em>PI Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PI Test</em>'.
   * @see org.w3.xpath20.PITest
   * @generated
   */
  EClass getPITest();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.PITest#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.w3.xpath20.PITest#getName()
   * @see #getPITest()
   * @generated
   */
  EAttribute getPITest_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.PITest#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>String</em>'.
   * @see org.w3.xpath20.PITest#getString()
   * @see #getPITest()
   * @generated
   */
  EReference getPITest_String();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Attribute Test</em>'.
   * @see org.w3.xpath20.SchemaAttributeTest
   * @generated
   */
  EClass getSchemaAttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.SchemaAttributeTest#getAttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Declaration</em>'.
   * @see org.w3.xpath20.SchemaAttributeTest#getAttributeDeclaration()
   * @see #getSchemaAttributeTest()
   * @generated
   */
  EReference getSchemaAttributeTest_AttributeDeclaration();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Declaration</em>'.
   * @see org.w3.xpath20.AttributeDeclaration
   * @generated
   */
  EClass getAttributeDeclaration();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.SchemaElementTest <em>Schema Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Element Test</em>'.
   * @see org.w3.xpath20.SchemaElementTest
   * @generated
   */
  EClass getSchemaElementTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.SchemaElementTest#getElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Declaration</em>'.
   * @see org.w3.xpath20.SchemaElementTest#getElementDeclaration()
   * @see #getSchemaElementTest()
   * @generated
   */
  EReference getSchemaElementTest_ElementDeclaration();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see org.w3.xpath20.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.UnaryExpr#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary</em>'.
   * @see org.w3.xpath20.UnaryExpr#getUnary()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Unary();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard</em>'.
   * @see org.w3.xpath20.Wildcard
   * @generated
   */
  EClass getWildcard();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.Wildcard#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.w3.xpath20.Wildcard#getPrefix()
   * @see #getWildcard()
   * @generated
   */
  EAttribute getWildcard_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.Wildcard#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see org.w3.xpath20.Wildcard#getAny()
   * @see #getWildcard()
   * @generated
   */
  EAttribute getWildcard_Any();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ElementTest <em>Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Test</em>'.
   * @see org.w3.xpath20.ElementTest
   * @generated
   */
  EClass getElementTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ElementTest#getElementNameOrWildcard <em>Element Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Name Or Wildcard</em>'.
   * @see org.w3.xpath20.ElementTest#getElementNameOrWildcard()
   * @see #getElementTest()
   * @generated
   */
  EReference getElementTest_ElementNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ElementTest#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.w3.xpath20.ElementTest#getTypeName()
   * @see #getElementTest()
   * @generated
   */
  EReference getElementTest_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.ElementTest#isQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see org.w3.xpath20.ElementTest#isQuestion()
   * @see #getElementTest()
   * @generated
   */
  EAttribute getElementTest_Question();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AttributeTest <em>Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Test</em>'.
   * @see org.w3.xpath20.AttributeTest
   * @generated
   */
  EClass getAttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AttributeTest#getAttributeNameOrWildcard <em>Attribute Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Name Or Wildcard</em>'.
   * @see org.w3.xpath20.AttributeTest#getAttributeNameOrWildcard()
   * @see #getAttributeTest()
   * @generated
   */
  EReference getAttributeTest_AttributeNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AttributeTest#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.w3.xpath20.AttributeTest#getTypeName()
   * @see #getAttributeTest()
   * @generated
   */
  EReference getAttributeTest_TypeName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AxisStep <em>Axis Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axis Step</em>'.
   * @see org.w3.xpath20.AxisStep
   * @generated
   */
  EClass getAxisStep();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AxisStep#getReverseStep <em>Reverse Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reverse Step</em>'.
   * @see org.w3.xpath20.AxisStep#getReverseStep()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_ReverseStep();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AxisStep#getForwardStep <em>Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forward Step</em>'.
   * @see org.w3.xpath20.AxisStep#getForwardStep()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_ForwardStep();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.AxisStep#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate</em>'.
   * @see org.w3.xpath20.AxisStep#getPredicate()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_Predicate();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.StepExpr <em>Step Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step Expr</em>'.
   * @see org.w3.xpath20.StepExpr
   * @generated
   */
  EClass getStepExpr();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.FilterExpr <em>Filter Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Expr</em>'.
   * @see org.w3.xpath20.FilterExpr
   * @generated
   */
  EClass getFilterExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.FilterExpr#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.w3.xpath20.FilterExpr#getFilter()
   * @see #getFilterExpr()
   * @generated
   */
  EReference getFilterExpr_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link org.w3.xpath20.FilterExpr#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate</em>'.
   * @see org.w3.xpath20.FilterExpr#getPredicate()
   * @see #getFilterExpr()
   * @generated
   */
  EReference getFilterExpr_Predicate();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr</em>'.
   * @see org.w3.xpath20.PathExpr
   * @generated
   */
  EClass getPathExpr();

  /**
   * Returns the meta object for the attribute '{@link org.w3.xpath20.PathExpr#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separator</em>'.
   * @see org.w3.xpath20.PathExpr#getSeparator()
   * @see #getPathExpr()
   * @generated
   */
  EAttribute getPathExpr_Separator();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.PathExpr#getRelativePath <em>Relative Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relative Path</em>'.
   * @see org.w3.xpath20.PathExpr#getRelativePath()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_RelativePath();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.AttribNameOrWildcard <em>Attrib Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attrib Name Or Wildcard</em>'.
   * @see org.w3.xpath20.AttribNameOrWildcard
   * @generated
   */
  EClass getAttribNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.AttribNameOrWildcard#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Name</em>'.
   * @see org.w3.xpath20.AttribNameOrWildcard#getAttributeName()
   * @see #getAttribNameOrWildcard()
   * @generated
   */
  EReference getAttribNameOrWildcard_AttributeName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.ElementNameOrWildcard <em>Element Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Name Or Wildcard</em>'.
   * @see org.w3.xpath20.ElementNameOrWildcard
   * @generated
   */
  EClass getElementNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.w3.xpath20.ElementNameOrWildcard#getElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Name</em>'.
   * @see org.w3.xpath20.ElementNameOrWildcard#getElementName()
   * @see #getElementNameOrWildcard()
   * @generated
   */
  EReference getElementNameOrWildcard_ElementName();

  /**
   * Returns the meta object for class '{@link org.w3.xpath20.PrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expr</em>'.
   * @see org.w3.xpath20.PrimaryExpr
   * @generated
   */
  EClass getPrimaryExpr();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.IntersectExcept <em>Intersect Except</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Intersect Except</em>'.
   * @see org.w3.xpath20.IntersectExcept
   * @generated
   */
  EEnum getIntersectExcept();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Union</em>'.
   * @see org.w3.xpath20.Union
   * @generated
   */
  EEnum getUnion();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.Additive <em>Additive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Additive</em>'.
   * @see org.w3.xpath20.Additive
   * @generated
   */
  EEnum getAdditive();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.GeneralComp <em>General Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>General Comp</em>'.
   * @see org.w3.xpath20.GeneralComp
   * @generated
   */
  EEnum getGeneralComp();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.ValueComp <em>Value Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Comp</em>'.
   * @see org.w3.xpath20.ValueComp
   * @generated
   */
  EEnum getValueComp();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.NodeComp <em>Node Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Comp</em>'.
   * @see org.w3.xpath20.NodeComp
   * @generated
   */
  EEnum getNodeComp();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.Separator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Separator</em>'.
   * @see org.w3.xpath20.Separator
   * @generated
   */
  EEnum getSeparator();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.ReverseAxisEnum <em>Reverse Axis Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reverse Axis Enum</em>'.
   * @see org.w3.xpath20.ReverseAxisEnum
   * @generated
   */
  EEnum getReverseAxisEnum();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.ForwardAxisEnum <em>Forward Axis Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Forward Axis Enum</em>'.
   * @see org.w3.xpath20.ForwardAxisEnum
   * @generated
   */
  EEnum getForwardAxisEnum();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.OccurrenceIndicator <em>Occurrence Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Occurrence Indicator</em>'.
   * @see org.w3.xpath20.OccurrenceIndicator
   * @generated
   */
  EEnum getOccurrenceIndicator();

  /**
   * Returns the meta object for enum '{@link org.w3.xpath20.Multiplicative <em>Multiplicative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative</em>'.
   * @see org.w3.xpath20.Multiplicative
   * @generated
   */
  EEnum getMultiplicative();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Xpath20Factory getXpath20Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.XPathImpl <em>XPath</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.XPathImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getXPath()
     * @generated
     */
    EClass XPATH = eINSTANCE.getXPath();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH__EXPRESSIONS = eINSTANCE.getXPath_Expressions();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.IntegerLiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.DecimalLiteralImpl <em>Decimal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.DecimalLiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDecimalLiteral()
     * @generated
     */
    EClass DECIMAL_LITERAL = eINSTANCE.getDecimalLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_LITERAL__VALUE = eINSTANCE.getDecimalLiteral_Value();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.DoubleLiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.StringLiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.QNameImpl <em>QName</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.QNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getQName()
     * @generated
     */
    EClass QNAME = eINSTANCE.getQName();

    /**
     * The meta object literal for the '<em><b>Local Part</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QNAME__LOCAL_PART = eINSTANCE.getQName_LocalPart();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PrefixedNameImpl <em>Prefixed Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PrefixedNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPrefixedName()
     * @generated
     */
    EClass PREFIXED_NAME = eINSTANCE.getPrefixedName();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIXED_NAME__PREFIX = eINSTANCE.getPrefixedName_Prefix();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.UnprefixedNameImpl <em>Unprefixed Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.UnprefixedNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnprefixedName()
     * @generated
     */
    EClass UNPREFIXED_NAME = eINSTANCE.getUnprefixedName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPRESSION = eINSTANCE.getExpr_Expression();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ExprSingleImpl <em>Expr Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ExprSingleImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getExprSingle()
     * @generated
     */
    EClass EXPR_SINGLE = eINSTANCE.getExprSingle();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ForExprImpl <em>For Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ForExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForExpr()
     * @generated
     */
    EClass FOR_EXPR = eINSTANCE.getForExpr();

    /**
     * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPR__FOR = eINSTANCE.getForExpr_For();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPR__RETURN = eINSTANCE.getForExpr_Return();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.SimpleForClauseImpl <em>Simple For Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.SimpleForClauseImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSimpleForClause()
     * @generated
     */
    EClass SIMPLE_FOR_CLAUSE = eINSTANCE.getSimpleForClause();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FOR_CLAUSE__VARIABLE = eINSTANCE.getSimpleForClause_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FOR_CLAUSE__EXPRESSION = eINSTANCE.getSimpleForClause_Expression();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.VarNameImpl <em>Var Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.VarNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getVarName()
     * @generated
     */
    EClass VAR_NAME = eINSTANCE.getVarName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.QuantifiedExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getQuantifiedExpr()
     * @generated
     */
    EClass QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExpr();

    /**
     * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIED_EXPR__QUANTIFIER = eINSTANCE.getQuantifiedExpr_Quantifier();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__VARIABLE = eINSTANCE.getQuantifiedExpr_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__EXPRESSION = eINSTANCE.getQuantifiedExpr_Expression();

    /**
     * The meta object literal for the '<em><b>Satisfies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__SATISFIES = eINSTANCE.getQuantifiedExpr_Satisfies();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.IfExprImpl <em>If Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.IfExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIfExpr()
     * @generated
     */
    EClass IF_EXPR = eINSTANCE.getIfExpr();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__IF = eINSTANCE.getIfExpr_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__THEN = eINSTANCE.getIfExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__ELSE = eINSTANCE.getIfExpr_Else();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.OrExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__OR = eINSTANCE.getOrExpr_Or();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AndExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__AND = eINSTANCE.getAndExpr_And();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ComparisonExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getComparisonExpr()
     * @generated
     */
    EClass COMPARISON_EXPR = eINSTANCE.getComparisonExpr();

    /**
     * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__OPERAND1 = eINSTANCE.getComparisonExpr_Operand1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__VALUE = eINSTANCE.getComparisonExpr_Value();

    /**
     * The meta object literal for the '<em><b>General</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__GENERAL = eINSTANCE.getComparisonExpr_General();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__NODE = eINSTANCE.getComparisonExpr_Node();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__RANGE = eINSTANCE.getComparisonExpr_Range();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.RangeExprImpl <em>Range Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.RangeExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getRangeExpr()
     * @generated
     */
    EClass RANGE_EXPR = eINSTANCE.getRangeExpr();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__RANGE = eINSTANCE.getRangeExpr_Range();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__TO = eINSTANCE.getRangeExpr_To();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AdditiveExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAdditiveExpr()
     * @generated
     */
    EClass ADDITIVE_EXPR = eINSTANCE.getAdditiveExpr();

    /**
     * The meta object literal for the '<em><b>Add</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPR__ADD = eINSTANCE.getAdditiveExpr_Add();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPR__OPERATOR = eINSTANCE.getAdditiveExpr_Operator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.MultiplicativeExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getMultiplicativeExpr()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

    /**
     * The meta object literal for the '<em><b>Multiply</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__MULTIPLY = eINSTANCE.getMultiplicativeExpr_Multiply();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPR__OPERATOR = eINSTANCE.getMultiplicativeExpr_Operator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.UnionExprImpl <em>Union Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.UnionExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnionExpr()
     * @generated
     */
    EClass UNION_EXPR = eINSTANCE.getUnionExpr();

    /**
     * The meta object literal for the '<em><b>Union</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_EXPR__UNION = eINSTANCE.getUnionExpr_Union();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNION_EXPR__OPERATOR = eINSTANCE.getUnionExpr_Operator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.IntersectExceptExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntersectExceptExpr()
     * @generated
     */
    EClass INTERSECT_EXCEPT_EXPR = eINSTANCE.getIntersectExceptExpr();

    /**
     * The meta object literal for the '<em><b>Intersect</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERSECT_EXCEPT_EXPR__INTERSECT = eINSTANCE.getIntersectExceptExpr_Intersect();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERSECT_EXCEPT_EXPR__OPERATOR = eINSTANCE.getIntersectExceptExpr_Operator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.InstanceofExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getInstanceofExpr()
     * @generated
     */
    EClass INSTANCEOF_EXPR = eINSTANCE.getInstanceofExpr();

    /**
     * The meta object literal for the '<em><b>Treat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCEOF_EXPR__TREAT = eINSTANCE.getInstanceofExpr_Treat();

    /**
     * The meta object literal for the '<em><b>Instance Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCEOF_EXPR__INSTANCE_OF = eINSTANCE.getInstanceofExpr_InstanceOf();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.TreatExprImpl <em>Treat Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.TreatExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTreatExpr()
     * @generated
     */
    EClass TREAT_EXPR = eINSTANCE.getTreatExpr();

    /**
     * The meta object literal for the '<em><b>Castable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREAT_EXPR__CASTABLE = eINSTANCE.getTreatExpr_Castable();

    /**
     * The meta object literal for the '<em><b>Treat As</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREAT_EXPR__TREAT_AS = eINSTANCE.getTreatExpr_TreatAs();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.SequenceTypeImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSequenceType()
     * @generated
     */
    EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_TYPE__TYPE = eINSTANCE.getSequenceType_Type();

    /**
     * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_TYPE__OCCURRENCE = eINSTANCE.getSequenceType_Occurrence();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ItemTypeImpl <em>Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ItemTypeImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getItemType()
     * @generated
     */
    EClass ITEM_TYPE = eINSTANCE.getItemType();

    /**
     * The meta object literal for the '<em><b>Kind Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE__KIND_TEST = eINSTANCE.getItemType_KindTest();

    /**
     * The meta object literal for the '<em><b>Atomic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE__ATOMIC_TYPE = eINSTANCE.getItemType_AtomicType();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AtomicTypeImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAtomicType()
     * @generated
     */
    EClass ATOMIC_TYPE = eINSTANCE.getAtomicType();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.CastableExprImpl <em>Castable Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.CastableExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCastableExpr()
     * @generated
     */
    EClass CASTABLE_EXPR = eINSTANCE.getCastableExpr();

    /**
     * The meta object literal for the '<em><b>Cast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTABLE_EXPR__CAST = eINSTANCE.getCastableExpr_Cast();

    /**
     * The meta object literal for the '<em><b>Castable As</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTABLE_EXPR__CASTABLE_AS = eINSTANCE.getCastableExpr_CastableAs();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.CastExprImpl <em>Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.CastExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCastExpr()
     * @generated
     */
    EClass CAST_EXPR = eINSTANCE.getCastExpr();

    /**
     * The meta object literal for the '<em><b>Cast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPR__CAST = eINSTANCE.getCastExpr_Cast();

    /**
     * The meta object literal for the '<em><b>Cast As</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPR__CAST_AS = eINSTANCE.getCastExpr_CastAs();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ValueExprImpl <em>Value Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ValueExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getValueExpr()
     * @generated
     */
    EClass VALUE_EXPR = eINSTANCE.getValueExpr();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_EXPR__PATH = eINSTANCE.getValueExpr_Path();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.SingleTypeImpl <em>Single Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.SingleTypeImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSingleType()
     * @generated
     */
    EClass SINGLE_TYPE = eINSTANCE.getSingleType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_TYPE__TYPE = eINSTANCE.getSingleType_Type();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_TYPE__QUESTION = eINSTANCE.getSingleType_Question();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.RelativePathExprImpl <em>Relative Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.RelativePathExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getRelativePathExpr()
     * @generated
     */
    EClass RELATIVE_PATH_EXPR = eINSTANCE.getRelativePathExpr();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_PATH_EXPR__STEP = eINSTANCE.getRelativePathExpr_Step();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIVE_PATH_EXPR__SEPARATOR = eINSTANCE.getRelativePathExpr_Separator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PredicateListImpl <em>Predicate List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PredicateListImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPredicateList()
     * @generated
     */
    EClass PREDICATE_LIST = eINSTANCE.getPredicateList();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_LIST__PREDICATE = eINSTANCE.getPredicateList_Predicate();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PredicateImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PREDICATE = eINSTANCE.getPredicate_Predicate();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ReverseStepImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseStep()
     * @generated
     */
    EClass REVERSE_STEP = eINSTANCE.getReverseStep();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REVERSE_STEP__AXIS = eINSTANCE.getReverseStep_Axis();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REVERSE_STEP__TEST = eINSTANCE.getReverseStep_Test();

    /**
     * The meta object literal for the '<em><b>Abbrev</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REVERSE_STEP__ABBREV = eINSTANCE.getReverseStep_Abbrev();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ReverseAxisImpl <em>Reverse Axis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ReverseAxisImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseAxis()
     * @generated
     */
    EClass REVERSE_AXIS = eINSTANCE.getReverseAxis();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REVERSE_AXIS__AXIS = eINSTANCE.getReverseAxis_Axis();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.NodeTestImpl <em>Node Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.NodeTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNodeTest()
     * @generated
     */
    EClass NODE_TEST = eINSTANCE.getNodeTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.NameTestImpl <em>Name Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.NameTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNameTest()
     * @generated
     */
    EClass NAME_TEST = eINSTANCE.getNameTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ForwardStepImpl <em>Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ForwardStepImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardStep()
     * @generated
     */
    EClass FORWARD_STEP = eINSTANCE.getForwardStep();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_STEP__AXIS = eINSTANCE.getForwardStep_Axis();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_STEP__TEST = eINSTANCE.getForwardStep_Test();

    /**
     * The meta object literal for the '<em><b>Abbrev</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_STEP__ABBREV = eINSTANCE.getForwardStep_Abbrev();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ForwardAxisImpl <em>Forward Axis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ForwardAxisImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardAxis()
     * @generated
     */
    EClass FORWARD_AXIS = eINSTANCE.getForwardAxis();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORWARD_AXIS__AXIS = eINSTANCE.getForwardAxis_Axis();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AbbrevForwardStepImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAbbrevForwardStep()
     * @generated
     */
    EClass ABBREV_FORWARD_STEP = eINSTANCE.getAbbrevForwardStep();

    /**
     * The meta object literal for the '<em><b>At</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABBREV_FORWARD_STEP__AT = eINSTANCE.getAbbrevForwardStep_At();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABBREV_FORWARD_STEP__TEST = eINSTANCE.getAbbrevForwardStep_Test();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.LiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.NumericLiteralImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNumericLiteral()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.VarRefImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getVarRef()
     * @generated
     */
    EClass VAR_REF = eINSTANCE.getVarRef();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_REF__VAR = eINSTANCE.getVarRef_Var();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ParenthesizedExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getParenthesizedExpr()
     * @generated
     */
    EClass PARENTHESIZED_EXPR = eINSTANCE.getParenthesizedExpr();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPR__EXPRESSION = eINSTANCE.getParenthesizedExpr_Expression();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ContextItemExprImpl <em>Context Item Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ContextItemExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getContextItemExpr()
     * @generated
     */
    EClass CONTEXT_ITEM_EXPR = eINSTANCE.getContextItemExpr();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.FunctionCallImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__PARAMETER = eINSTANCE.getFunctionCall_Parameter();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.KindTestImpl <em>Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.KindTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getKindTest()
     * @generated
     */
    EClass KIND_TEST = eINSTANCE.getKindTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ElementDeclarationImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementDeclaration()
     * @generated
     */
    EClass ELEMENT_DECLARATION = eINSTANCE.getElementDeclaration();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AttributeNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ElementNameImpl <em>Element Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ElementNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementName()
     * @generated
     */
    EClass ELEMENT_NAME = eINSTANCE.getElementName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.TypeNameImpl <em>Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.TypeNameImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTypeName()
     * @generated
     */
    EClass TYPE_NAME = eINSTANCE.getTypeName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AnyKindTestImpl <em>Any Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AnyKindTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAnyKindTest()
     * @generated
     */
    EClass ANY_KIND_TEST = eINSTANCE.getAnyKindTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.DocumentTestImpl <em>Document Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.DocumentTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getDocumentTest()
     * @generated
     */
    EClass DOCUMENT_TEST = eINSTANCE.getDocumentTest();

    /**
     * The meta object literal for the '<em><b>Element Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_TEST__ELEMENT_TEST = eINSTANCE.getDocumentTest_ElementTest();

    /**
     * The meta object literal for the '<em><b>Schema Element Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_TEST__SCHEMA_ELEMENT_TEST = eINSTANCE.getDocumentTest_SchemaElementTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.TextTestImpl <em>Text Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.TextTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getTextTest()
     * @generated
     */
    EClass TEXT_TEST = eINSTANCE.getTextTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.CommentTestImpl <em>Comment Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.CommentTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getCommentTest()
     * @generated
     */
    EClass COMMENT_TEST = eINSTANCE.getCommentTest();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PITestImpl <em>PI Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PITestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPITest()
     * @generated
     */
    EClass PI_TEST = eINSTANCE.getPITest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_TEST__NAME = eINSTANCE.getPITest_Name();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PI_TEST__STRING = eINSTANCE.getPITest_String();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.SchemaAttributeTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSchemaAttributeTest()
     * @generated
     */
    EClass SCHEMA_ATTRIBUTE_TEST = eINSTANCE.getSchemaAttributeTest();

    /**
     * The meta object literal for the '<em><b>Attribute Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION = eINSTANCE.getSchemaAttributeTest_AttributeDeclaration();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AttributeDeclarationImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeDeclaration()
     * @generated
     */
    EClass ATTRIBUTE_DECLARATION = eINSTANCE.getAttributeDeclaration();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.SchemaElementTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSchemaElementTest()
     * @generated
     */
    EClass SCHEMA_ELEMENT_TEST = eINSTANCE.getSchemaElementTest();

    /**
     * The meta object literal for the '<em><b>Element Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION = eINSTANCE.getSchemaElementTest_ElementDeclaration();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.UnaryExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__UNARY = eINSTANCE.getUnaryExpr_Unary();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.WildcardImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getWildcard()
     * @generated
     */
    EClass WILDCARD = eINSTANCE.getWildcard();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WILDCARD__PREFIX = eINSTANCE.getWildcard_Prefix();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WILDCARD__ANY = eINSTANCE.getWildcard_Any();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ElementTestImpl <em>Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ElementTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementTest()
     * @generated
     */
    EClass ELEMENT_TEST = eINSTANCE.getElementTest();

    /**
     * The meta object literal for the '<em><b>Element Name Or Wildcard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD = eINSTANCE.getElementTest_ElementNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TEST__TYPE_NAME = eINSTANCE.getElementTest_TypeName();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TEST__QUESTION = eINSTANCE.getElementTest_Question();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AttributeTestImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttributeTest()
     * @generated
     */
    EClass ATTRIBUTE_TEST = eINSTANCE.getAttributeTest();

    /**
     * The meta object literal for the '<em><b>Attribute Name Or Wildcard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD = eINSTANCE.getAttributeTest_AttributeNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_TEST__TYPE_NAME = eINSTANCE.getAttributeTest_TypeName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AxisStepImpl <em>Axis Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AxisStepImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAxisStep()
     * @generated
     */
    EClass AXIS_STEP = eINSTANCE.getAxisStep();

    /**
     * The meta object literal for the '<em><b>Reverse Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__REVERSE_STEP = eINSTANCE.getAxisStep_ReverseStep();

    /**
     * The meta object literal for the '<em><b>Forward Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__FORWARD_STEP = eINSTANCE.getAxisStep_ForwardStep();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__PREDICATE = eINSTANCE.getAxisStep_Predicate();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.StepExprImpl <em>Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.StepExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getStepExpr()
     * @generated
     */
    EClass STEP_EXPR = eINSTANCE.getStepExpr();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.FilterExprImpl <em>Filter Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.FilterExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getFilterExpr()
     * @generated
     */
    EClass FILTER_EXPR = eINSTANCE.getFilterExpr();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_EXPR__FILTER = eINSTANCE.getFilterExpr_Filter();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_EXPR__PREDICATE = eINSTANCE.getFilterExpr_Predicate();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PathExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPathExpr()
     * @generated
     */
    EClass PATH_EXPR = eINSTANCE.getPathExpr();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_EXPR__SEPARATOR = eINSTANCE.getPathExpr_Separator();

    /**
     * The meta object literal for the '<em><b>Relative Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__RELATIVE_PATH = eINSTANCE.getPathExpr_RelativePath();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.AttribNameOrWildcardImpl <em>Attrib Name Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.AttribNameOrWildcardImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAttribNameOrWildcard()
     * @generated
     */
    EClass ATTRIB_NAME_OR_WILDCARD = eINSTANCE.getAttribNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME = eINSTANCE.getAttribNameOrWildcard_AttributeName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.ElementNameOrWildcardImpl <em>Element Name Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.ElementNameOrWildcardImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getElementNameOrWildcard()
     * @generated
     */
    EClass ELEMENT_NAME_OR_WILDCARD = eINSTANCE.getElementNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Element Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME = eINSTANCE.getElementNameOrWildcard_ElementName();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.impl.PrimaryExprImpl
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getPrimaryExpr()
     * @generated
     */
    EClass PRIMARY_EXPR = eINSTANCE.getPrimaryExpr();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.IntersectExcept <em>Intersect Except</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.IntersectExcept
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getIntersectExcept()
     * @generated
     */
    EEnum INTERSECT_EXCEPT = eINSTANCE.getIntersectExcept();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.Union <em>Union</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.Union
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getUnion()
     * @generated
     */
    EEnum UNION = eINSTANCE.getUnion();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.Additive <em>Additive</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.Additive
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getAdditive()
     * @generated
     */
    EEnum ADDITIVE = eINSTANCE.getAdditive();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.GeneralComp <em>General Comp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.GeneralComp
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getGeneralComp()
     * @generated
     */
    EEnum GENERAL_COMP = eINSTANCE.getGeneralComp();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.ValueComp <em>Value Comp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.ValueComp
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getValueComp()
     * @generated
     */
    EEnum VALUE_COMP = eINSTANCE.getValueComp();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.NodeComp <em>Node Comp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.NodeComp
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getNodeComp()
     * @generated
     */
    EEnum NODE_COMP = eINSTANCE.getNodeComp();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.Separator <em>Separator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.Separator
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getSeparator()
     * @generated
     */
    EEnum SEPARATOR = eINSTANCE.getSeparator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.ReverseAxisEnum <em>Reverse Axis Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.ReverseAxisEnum
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getReverseAxisEnum()
     * @generated
     */
    EEnum REVERSE_AXIS_ENUM = eINSTANCE.getReverseAxisEnum();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.ForwardAxisEnum <em>Forward Axis Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.ForwardAxisEnum
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getForwardAxisEnum()
     * @generated
     */
    EEnum FORWARD_AXIS_ENUM = eINSTANCE.getForwardAxisEnum();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.OccurrenceIndicator <em>Occurrence Indicator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.OccurrenceIndicator
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getOccurrenceIndicator()
     * @generated
     */
    EEnum OCCURRENCE_INDICATOR = eINSTANCE.getOccurrenceIndicator();

    /**
     * The meta object literal for the '{@link org.w3.xpath20.Multiplicative <em>Multiplicative</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3.xpath20.Multiplicative
     * @see org.w3.xpath20.impl.Xpath20PackageImpl#getMultiplicative()
     * @generated
     */
    EEnum MULTIPLICATIVE = eINSTANCE.getMultiplicative();

  }

} //Xpath20Package
