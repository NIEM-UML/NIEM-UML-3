/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.w3.xpath20.AbbrevForwardStep;
import org.w3.xpath20.Additive;
import org.w3.xpath20.AdditiveExpr;
import org.w3.xpath20.AndExpr;
import org.w3.xpath20.AnyKindTest;
import org.w3.xpath20.AtomicType;
import org.w3.xpath20.AttribNameOrWildcard;
import org.w3.xpath20.AttributeDeclaration;
import org.w3.xpath20.AttributeName;
import org.w3.xpath20.AttributeTest;
import org.w3.xpath20.AxisStep;
import org.w3.xpath20.CastExpr;
import org.w3.xpath20.CastableExpr;
import org.w3.xpath20.CommentTest;
import org.w3.xpath20.ComparisonExpr;
import org.w3.xpath20.ContextItemExpr;
import org.w3.xpath20.DecimalLiteral;
import org.w3.xpath20.DocumentTest;
import org.w3.xpath20.DoubleLiteral;
import org.w3.xpath20.ElementDeclaration;
import org.w3.xpath20.ElementName;
import org.w3.xpath20.ElementNameOrWildcard;
import org.w3.xpath20.ElementTest;
import org.w3.xpath20.Expr;
import org.w3.xpath20.ExprSingle;
import org.w3.xpath20.FilterExpr;
import org.w3.xpath20.ForExpr;
import org.w3.xpath20.ForwardAxis;
import org.w3.xpath20.ForwardAxisEnum;
import org.w3.xpath20.ForwardStep;
import org.w3.xpath20.FunctionCall;
import org.w3.xpath20.GeneralComp;
import org.w3.xpath20.IfExpr;
import org.w3.xpath20.InstanceofExpr;
import org.w3.xpath20.IntegerLiteral;
import org.w3.xpath20.IntersectExcept;
import org.w3.xpath20.IntersectExceptExpr;
import org.w3.xpath20.ItemType;
import org.w3.xpath20.KindTest;
import org.w3.xpath20.Literal;
import org.w3.xpath20.Multiplicative;
import org.w3.xpath20.MultiplicativeExpr;
import org.w3.xpath20.NameTest;
import org.w3.xpath20.NodeComp;
import org.w3.xpath20.NodeTest;
import org.w3.xpath20.NumericLiteral;
import org.w3.xpath20.OccurrenceIndicator;
import org.w3.xpath20.OrExpr;
import org.w3.xpath20.PITest;
import org.w3.xpath20.ParenthesizedExpr;
import org.w3.xpath20.PathExpr;
import org.w3.xpath20.Predicate;
import org.w3.xpath20.PredicateList;
import org.w3.xpath20.PrefixedName;
import org.w3.xpath20.PrimaryExpr;
import org.w3.xpath20.QName;
import org.w3.xpath20.QuantifiedExpr;
import org.w3.xpath20.RangeExpr;
import org.w3.xpath20.RelativePathExpr;
import org.w3.xpath20.ReverseAxis;
import org.w3.xpath20.ReverseAxisEnum;
import org.w3.xpath20.ReverseStep;
import org.w3.xpath20.SchemaAttributeTest;
import org.w3.xpath20.SchemaElementTest;
import org.w3.xpath20.Separator;
import org.w3.xpath20.SequenceType;
import org.w3.xpath20.SimpleForClause;
import org.w3.xpath20.SingleType;
import org.w3.xpath20.StepExpr;
import org.w3.xpath20.StringLiteral;
import org.w3.xpath20.TextTest;
import org.w3.xpath20.TreatExpr;
import org.w3.xpath20.TypeName;
import org.w3.xpath20.UnaryExpr;
import org.w3.xpath20.Union;
import org.w3.xpath20.UnionExpr;
import org.w3.xpath20.UnprefixedName;
import org.w3.xpath20.ValueComp;
import org.w3.xpath20.ValueExpr;
import org.w3.xpath20.VarName;
import org.w3.xpath20.VarRef;
import org.w3.xpath20.Wildcard;
import org.w3.xpath20.XPath;
import org.w3.xpath20.Xpath20Factory;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xpath20PackageImpl extends EPackageImpl implements Xpath20Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

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
  private EClass prefixedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unprefixedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprSingleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleForClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intersectExceptExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceofExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass treatExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castableExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativePathExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reverseStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reverseAxisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardAxisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbrevForwardStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextItemExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kindTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyKindTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass piTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaAttributeTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaElementTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass axisStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attribNameOrWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementNameOrWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum intersectExceptEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum additiveEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum generalCompEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valueCompEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeCompEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum separatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum reverseAxisEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum forwardAxisEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum occurrenceIndicatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicativeEEnum = null;

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
   * @see org.w3.xpath20.Xpath20Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Xpath20PackageImpl()
  {
    super(eNS_URI, Xpath20Factory.eINSTANCE);
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
   * <p>This method is used to initialize {@link Xpath20Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Xpath20Package init()
  {
    if (isInited) return (Xpath20Package)EPackage.Registry.INSTANCE.getEPackage(Xpath20Package.eNS_URI);

    // Obtain or create and register package
    Xpath20PackageImpl theXpath20Package = (Xpath20PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Xpath20PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Xpath20PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXpath20Package.createPackageContents();

    // Initialize created meta-data
    theXpath20Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXpath20Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Xpath20Package.eNS_URI, theXpath20Package);
    return theXpath20Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXPath()
  {
    return xPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPath_Expressions()
  {
    return (EReference)xPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_Value()
  {
    return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecimalLiteral()
  {
    return decimalLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecimalLiteral_Value()
  {
    return (EAttribute)decimalLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleLiteral()
  {
    return doubleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleLiteral_Value()
  {
    return (EAttribute)doubleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQName()
  {
    return qNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQName_LocalPart()
  {
    return (EAttribute)qNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixedName()
  {
    return prefixedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixedName_Prefix()
  {
    return (EAttribute)prefixedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnprefixedName()
  {
    return unprefixedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Expression()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprSingle()
  {
    return exprSingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForExpr()
  {
    return forExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForExpr_For()
  {
    return (EReference)forExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForExpr_Return()
  {
    return (EReference)forExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleForClause()
  {
    return simpleForClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleForClause_Variable()
  {
    return (EReference)simpleForClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleForClause_Expression()
  {
    return (EReference)simpleForClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarName()
  {
    return varNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedExpr()
  {
    return quantifiedExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifiedExpr_Quantifier()
  {
    return (EAttribute)quantifiedExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpr_Variable()
  {
    return (EReference)quantifiedExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpr_Expression()
  {
    return (EReference)quantifiedExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpr_Satisfies()
  {
    return (EReference)quantifiedExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfExpr()
  {
    return ifExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_If()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_Then()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_Else()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpr()
  {
    return orExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpr_Or()
  {
    return (EReference)orExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpr()
  {
    return andExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpr_And()
  {
    return (EReference)andExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonExpr()
  {
    return comparisonExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpr_Operand1()
  {
    return (EReference)comparisonExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpr_Value()
  {
    return (EAttribute)comparisonExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpr_General()
  {
    return (EAttribute)comparisonExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpr_Node()
  {
    return (EAttribute)comparisonExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpr_Range()
  {
    return (EReference)comparisonExprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeExpr()
  {
    return rangeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeExpr_Range()
  {
    return (EReference)rangeExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeExpr_To()
  {
    return (EReference)rangeExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpr()
  {
    return additiveExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpr_Add()
  {
    return (EReference)additiveExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpr_Operator()
  {
    return (EAttribute)additiveExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpr()
  {
    return multiplicativeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpr_Multiply()
  {
    return (EReference)multiplicativeExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpr_Operator()
  {
    return (EAttribute)multiplicativeExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnionExpr()
  {
    return unionExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnionExpr_Union()
  {
    return (EReference)unionExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnionExpr_Operator()
  {
    return (EAttribute)unionExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntersectExceptExpr()
  {
    return intersectExceptExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntersectExceptExpr_Intersect()
  {
    return (EReference)intersectExceptExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntersectExceptExpr_Operator()
  {
    return (EAttribute)intersectExceptExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceofExpr()
  {
    return instanceofExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceofExpr_Treat()
  {
    return (EReference)instanceofExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceofExpr_InstanceOf()
  {
    return (EReference)instanceofExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTreatExpr()
  {
    return treatExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTreatExpr_Castable()
  {
    return (EReference)treatExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTreatExpr_TreatAs()
  {
    return (EReference)treatExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceType()
  {
    return sequenceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceType_Type()
  {
    return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSequenceType_Occurrence()
  {
    return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemType()
  {
    return itemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemType_KindTest()
  {
    return (EReference)itemTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemType_AtomicType()
  {
    return (EReference)itemTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicType()
  {
    return atomicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastableExpr()
  {
    return castableExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastableExpr_Cast()
  {
    return (EReference)castableExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastableExpr_CastableAs()
  {
    return (EReference)castableExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpr()
  {
    return castExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpr_Cast()
  {
    return (EReference)castExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpr_CastAs()
  {
    return (EReference)castExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueExpr()
  {
    return valueExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueExpr_Path()
  {
    return (EReference)valueExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleType()
  {
    return singleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleType_Type()
  {
    return (EReference)singleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleType_Question()
  {
    return (EAttribute)singleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativePathExpr()
  {
    return relativePathExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativePathExpr_Step()
  {
    return (EReference)relativePathExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelativePathExpr_Separator()
  {
    return (EAttribute)relativePathExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateList()
  {
    return predicateListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateList_Predicate()
  {
    return (EReference)predicateListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicate()
  {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicate_Predicate()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReverseStep()
  {
    return reverseStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReverseStep_Axis()
  {
    return (EReference)reverseStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReverseStep_Test()
  {
    return (EReference)reverseStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReverseStep_Abbrev()
  {
    return (EAttribute)reverseStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReverseAxis()
  {
    return reverseAxisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReverseAxis_Axis()
  {
    return (EAttribute)reverseAxisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTest()
  {
    return nodeTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameTest()
  {
    return nameTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForwardStep()
  {
    return forwardStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForwardStep_Axis()
  {
    return (EReference)forwardStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForwardStep_Test()
  {
    return (EReference)forwardStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForwardStep_Abbrev()
  {
    return (EReference)forwardStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForwardAxis()
  {
    return forwardAxisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForwardAxis_Axis()
  {
    return (EAttribute)forwardAxisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbrevForwardStep()
  {
    return abbrevForwardStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbrevForwardStep_At()
  {
    return (EAttribute)abbrevForwardStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbrevForwardStep_Test()
  {
    return (EReference)abbrevForwardStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarRef()
  {
    return varRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarRef_Var()
  {
    return (EReference)varRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesizedExpr()
  {
    return parenthesizedExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesizedExpr_Expression()
  {
    return (EReference)parenthesizedExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextItemExpr()
  {
    return contextItemExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_Function()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_Parameter()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKindTest()
  {
    return kindTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDeclaration()
  {
    return elementDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeName()
  {
    return attributeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementName()
  {
    return elementNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeName()
  {
    return typeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyKindTest()
  {
    return anyKindTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentTest()
  {
    return documentTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentTest_ElementTest()
  {
    return (EReference)documentTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentTest_SchemaElementTest()
  {
    return (EReference)documentTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextTest()
  {
    return textTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommentTest()
  {
    return commentTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPITest()
  {
    return piTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPITest_Name()
  {
    return (EAttribute)piTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPITest_String()
  {
    return (EReference)piTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaAttributeTest()
  {
    return schemaAttributeTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaAttributeTest_AttributeDeclaration()
  {
    return (EReference)schemaAttributeTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDeclaration()
  {
    return attributeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaElementTest()
  {
    return schemaElementTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaElementTest_ElementDeclaration()
  {
    return (EReference)schemaElementTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpr()
  {
    return unaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpr_Unary()
  {
    return (EReference)unaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcard()
  {
    return wildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcard_Prefix()
  {
    return (EAttribute)wildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcard_Any()
  {
    return (EAttribute)wildcardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementTest()
  {
    return elementTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementTest_ElementNameOrWildcard()
  {
    return (EReference)elementTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementTest_TypeName()
  {
    return (EReference)elementTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementTest_Question()
  {
    return (EAttribute)elementTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeTest()
  {
    return attributeTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeTest_AttributeNameOrWildcard()
  {
    return (EReference)attributeTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeTest_TypeName()
  {
    return (EReference)attributeTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAxisStep()
  {
    return axisStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxisStep_ReverseStep()
  {
    return (EReference)axisStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxisStep_ForwardStep()
  {
    return (EReference)axisStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxisStep_Predicate()
  {
    return (EReference)axisStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStepExpr()
  {
    return stepExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterExpr()
  {
    return filterExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterExpr_Filter()
  {
    return (EReference)filterExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterExpr_Predicate()
  {
    return (EReference)filterExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathExpr()
  {
    return pathExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathExpr_Separator()
  {
    return (EAttribute)pathExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathExpr_RelativePath()
  {
    return (EReference)pathExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribNameOrWildcard()
  {
    return attribNameOrWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribNameOrWildcard_AttributeName()
  {
    return (EReference)attribNameOrWildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementNameOrWildcard()
  {
    return elementNameOrWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementNameOrWildcard_ElementName()
  {
    return (EReference)elementNameOrWildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpr()
  {
    return primaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIntersectExcept()
  {
    return intersectExceptEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnion()
  {
    return unionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAdditive()
  {
    return additiveEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGeneralComp()
  {
    return generalCompEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValueComp()
  {
    return valueCompEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeComp()
  {
    return nodeCompEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSeparator()
  {
    return separatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getReverseAxisEnum()
  {
    return reverseAxisEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getForwardAxisEnum()
  {
    return forwardAxisEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOccurrenceIndicator()
  {
    return occurrenceIndicatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicative()
  {
    return multiplicativeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xpath20Factory getXpath20Factory()
  {
    return (Xpath20Factory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xPathEClass = createEClass(XPATH);
    createEReference(xPathEClass, XPATH__EXPRESSIONS);

    integerLiteralEClass = createEClass(INTEGER_LITERAL);
    createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

    decimalLiteralEClass = createEClass(DECIMAL_LITERAL);
    createEAttribute(decimalLiteralEClass, DECIMAL_LITERAL__VALUE);

    doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
    createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    qNameEClass = createEClass(QNAME);
    createEAttribute(qNameEClass, QNAME__LOCAL_PART);

    prefixedNameEClass = createEClass(PREFIXED_NAME);
    createEAttribute(prefixedNameEClass, PREFIXED_NAME__PREFIX);

    unprefixedNameEClass = createEClass(UNPREFIXED_NAME);

    exprEClass = createEClass(EXPR);
    createEReference(exprEClass, EXPR__EXPRESSION);

    exprSingleEClass = createEClass(EXPR_SINGLE);

    forExprEClass = createEClass(FOR_EXPR);
    createEReference(forExprEClass, FOR_EXPR__FOR);
    createEReference(forExprEClass, FOR_EXPR__RETURN);

    simpleForClauseEClass = createEClass(SIMPLE_FOR_CLAUSE);
    createEReference(simpleForClauseEClass, SIMPLE_FOR_CLAUSE__VARIABLE);
    createEReference(simpleForClauseEClass, SIMPLE_FOR_CLAUSE__EXPRESSION);

    varNameEClass = createEClass(VAR_NAME);

    quantifiedExprEClass = createEClass(QUANTIFIED_EXPR);
    createEAttribute(quantifiedExprEClass, QUANTIFIED_EXPR__QUANTIFIER);
    createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__VARIABLE);
    createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__EXPRESSION);
    createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__SATISFIES);

    ifExprEClass = createEClass(IF_EXPR);
    createEReference(ifExprEClass, IF_EXPR__IF);
    createEReference(ifExprEClass, IF_EXPR__THEN);
    createEReference(ifExprEClass, IF_EXPR__ELSE);

    orExprEClass = createEClass(OR_EXPR);
    createEReference(orExprEClass, OR_EXPR__OR);

    andExprEClass = createEClass(AND_EXPR);
    createEReference(andExprEClass, AND_EXPR__AND);

    comparisonExprEClass = createEClass(COMPARISON_EXPR);
    createEReference(comparisonExprEClass, COMPARISON_EXPR__OPERAND1);
    createEAttribute(comparisonExprEClass, COMPARISON_EXPR__VALUE);
    createEAttribute(comparisonExprEClass, COMPARISON_EXPR__GENERAL);
    createEAttribute(comparisonExprEClass, COMPARISON_EXPR__NODE);
    createEReference(comparisonExprEClass, COMPARISON_EXPR__RANGE);

    rangeExprEClass = createEClass(RANGE_EXPR);
    createEReference(rangeExprEClass, RANGE_EXPR__RANGE);
    createEReference(rangeExprEClass, RANGE_EXPR__TO);

    additiveExprEClass = createEClass(ADDITIVE_EXPR);
    createEReference(additiveExprEClass, ADDITIVE_EXPR__ADD);
    createEAttribute(additiveExprEClass, ADDITIVE_EXPR__OPERATOR);

    multiplicativeExprEClass = createEClass(MULTIPLICATIVE_EXPR);
    createEReference(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__MULTIPLY);
    createEAttribute(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__OPERATOR);

    unionExprEClass = createEClass(UNION_EXPR);
    createEReference(unionExprEClass, UNION_EXPR__UNION);
    createEAttribute(unionExprEClass, UNION_EXPR__OPERATOR);

    intersectExceptExprEClass = createEClass(INTERSECT_EXCEPT_EXPR);
    createEReference(intersectExceptExprEClass, INTERSECT_EXCEPT_EXPR__INTERSECT);
    createEAttribute(intersectExceptExprEClass, INTERSECT_EXCEPT_EXPR__OPERATOR);

    instanceofExprEClass = createEClass(INSTANCEOF_EXPR);
    createEReference(instanceofExprEClass, INSTANCEOF_EXPR__TREAT);
    createEReference(instanceofExprEClass, INSTANCEOF_EXPR__INSTANCE_OF);

    treatExprEClass = createEClass(TREAT_EXPR);
    createEReference(treatExprEClass, TREAT_EXPR__CASTABLE);
    createEReference(treatExprEClass, TREAT_EXPR__TREAT_AS);

    sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
    createEReference(sequenceTypeEClass, SEQUENCE_TYPE__TYPE);
    createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__OCCURRENCE);

    itemTypeEClass = createEClass(ITEM_TYPE);
    createEReference(itemTypeEClass, ITEM_TYPE__KIND_TEST);
    createEReference(itemTypeEClass, ITEM_TYPE__ATOMIC_TYPE);

    atomicTypeEClass = createEClass(ATOMIC_TYPE);

    castableExprEClass = createEClass(CASTABLE_EXPR);
    createEReference(castableExprEClass, CASTABLE_EXPR__CAST);
    createEReference(castableExprEClass, CASTABLE_EXPR__CASTABLE_AS);

    castExprEClass = createEClass(CAST_EXPR);
    createEReference(castExprEClass, CAST_EXPR__CAST);
    createEReference(castExprEClass, CAST_EXPR__CAST_AS);

    valueExprEClass = createEClass(VALUE_EXPR);
    createEReference(valueExprEClass, VALUE_EXPR__PATH);

    singleTypeEClass = createEClass(SINGLE_TYPE);
    createEReference(singleTypeEClass, SINGLE_TYPE__TYPE);
    createEAttribute(singleTypeEClass, SINGLE_TYPE__QUESTION);

    relativePathExprEClass = createEClass(RELATIVE_PATH_EXPR);
    createEReference(relativePathExprEClass, RELATIVE_PATH_EXPR__STEP);
    createEAttribute(relativePathExprEClass, RELATIVE_PATH_EXPR__SEPARATOR);

    predicateListEClass = createEClass(PREDICATE_LIST);
    createEReference(predicateListEClass, PREDICATE_LIST__PREDICATE);

    predicateEClass = createEClass(PREDICATE);
    createEReference(predicateEClass, PREDICATE__PREDICATE);

    reverseStepEClass = createEClass(REVERSE_STEP);
    createEReference(reverseStepEClass, REVERSE_STEP__AXIS);
    createEReference(reverseStepEClass, REVERSE_STEP__TEST);
    createEAttribute(reverseStepEClass, REVERSE_STEP__ABBREV);

    reverseAxisEClass = createEClass(REVERSE_AXIS);
    createEAttribute(reverseAxisEClass, REVERSE_AXIS__AXIS);

    nodeTestEClass = createEClass(NODE_TEST);

    nameTestEClass = createEClass(NAME_TEST);

    forwardStepEClass = createEClass(FORWARD_STEP);
    createEReference(forwardStepEClass, FORWARD_STEP__AXIS);
    createEReference(forwardStepEClass, FORWARD_STEP__TEST);
    createEReference(forwardStepEClass, FORWARD_STEP__ABBREV);

    forwardAxisEClass = createEClass(FORWARD_AXIS);
    createEAttribute(forwardAxisEClass, FORWARD_AXIS__AXIS);

    abbrevForwardStepEClass = createEClass(ABBREV_FORWARD_STEP);
    createEAttribute(abbrevForwardStepEClass, ABBREV_FORWARD_STEP__AT);
    createEReference(abbrevForwardStepEClass, ABBREV_FORWARD_STEP__TEST);

    literalEClass = createEClass(LITERAL);

    numericLiteralEClass = createEClass(NUMERIC_LITERAL);

    varRefEClass = createEClass(VAR_REF);
    createEReference(varRefEClass, VAR_REF__VAR);

    parenthesizedExprEClass = createEClass(PARENTHESIZED_EXPR);
    createEReference(parenthesizedExprEClass, PARENTHESIZED_EXPR__EXPRESSION);

    contextItemExprEClass = createEClass(CONTEXT_ITEM_EXPR);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION);
    createEReference(functionCallEClass, FUNCTION_CALL__PARAMETER);

    kindTestEClass = createEClass(KIND_TEST);

    elementDeclarationEClass = createEClass(ELEMENT_DECLARATION);

    attributeNameEClass = createEClass(ATTRIBUTE_NAME);

    elementNameEClass = createEClass(ELEMENT_NAME);

    typeNameEClass = createEClass(TYPE_NAME);

    anyKindTestEClass = createEClass(ANY_KIND_TEST);

    documentTestEClass = createEClass(DOCUMENT_TEST);
    createEReference(documentTestEClass, DOCUMENT_TEST__ELEMENT_TEST);
    createEReference(documentTestEClass, DOCUMENT_TEST__SCHEMA_ELEMENT_TEST);

    textTestEClass = createEClass(TEXT_TEST);

    commentTestEClass = createEClass(COMMENT_TEST);

    piTestEClass = createEClass(PI_TEST);
    createEAttribute(piTestEClass, PI_TEST__NAME);
    createEReference(piTestEClass, PI_TEST__STRING);

    schemaAttributeTestEClass = createEClass(SCHEMA_ATTRIBUTE_TEST);
    createEReference(schemaAttributeTestEClass, SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION);

    attributeDeclarationEClass = createEClass(ATTRIBUTE_DECLARATION);

    schemaElementTestEClass = createEClass(SCHEMA_ELEMENT_TEST);
    createEReference(schemaElementTestEClass, SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION);

    unaryExprEClass = createEClass(UNARY_EXPR);
    createEReference(unaryExprEClass, UNARY_EXPR__UNARY);

    wildcardEClass = createEClass(WILDCARD);
    createEAttribute(wildcardEClass, WILDCARD__PREFIX);
    createEAttribute(wildcardEClass, WILDCARD__ANY);

    elementTestEClass = createEClass(ELEMENT_TEST);
    createEReference(elementTestEClass, ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD);
    createEReference(elementTestEClass, ELEMENT_TEST__TYPE_NAME);
    createEAttribute(elementTestEClass, ELEMENT_TEST__QUESTION);

    attributeTestEClass = createEClass(ATTRIBUTE_TEST);
    createEReference(attributeTestEClass, ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD);
    createEReference(attributeTestEClass, ATTRIBUTE_TEST__TYPE_NAME);

    axisStepEClass = createEClass(AXIS_STEP);
    createEReference(axisStepEClass, AXIS_STEP__REVERSE_STEP);
    createEReference(axisStepEClass, AXIS_STEP__FORWARD_STEP);
    createEReference(axisStepEClass, AXIS_STEP__PREDICATE);

    stepExprEClass = createEClass(STEP_EXPR);

    filterExprEClass = createEClass(FILTER_EXPR);
    createEReference(filterExprEClass, FILTER_EXPR__FILTER);
    createEReference(filterExprEClass, FILTER_EXPR__PREDICATE);

    pathExprEClass = createEClass(PATH_EXPR);
    createEAttribute(pathExprEClass, PATH_EXPR__SEPARATOR);
    createEReference(pathExprEClass, PATH_EXPR__RELATIVE_PATH);

    attribNameOrWildcardEClass = createEClass(ATTRIB_NAME_OR_WILDCARD);
    createEReference(attribNameOrWildcardEClass, ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME);

    elementNameOrWildcardEClass = createEClass(ELEMENT_NAME_OR_WILDCARD);
    createEReference(elementNameOrWildcardEClass, ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME);

    primaryExprEClass = createEClass(PRIMARY_EXPR);

    // Create enums
    intersectExceptEEnum = createEEnum(INTERSECT_EXCEPT);
    unionEEnum = createEEnum(UNION);
    additiveEEnum = createEEnum(ADDITIVE);
    generalCompEEnum = createEEnum(GENERAL_COMP);
    valueCompEEnum = createEEnum(VALUE_COMP);
    nodeCompEEnum = createEEnum(NODE_COMP);
    separatorEEnum = createEEnum(SEPARATOR);
    reverseAxisEnumEEnum = createEEnum(REVERSE_AXIS_ENUM);
    forwardAxisEnumEEnum = createEEnum(FORWARD_AXIS_ENUM);
    occurrenceIndicatorEEnum = createEEnum(OCCURRENCE_INDICATOR);
    multiplicativeEEnum = createEEnum(MULTIPLICATIVE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    integerLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
    decimalLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
    doubleLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getLiteral());
    qNameEClass.getESuperTypes().add(this.getVarName());
    qNameEClass.getESuperTypes().add(this.getAtomicType());
    qNameEClass.getESuperTypes().add(this.getNameTest());
    qNameEClass.getESuperTypes().add(this.getAttributeName());
    qNameEClass.getESuperTypes().add(this.getElementName());
    qNameEClass.getESuperTypes().add(this.getTypeName());
    prefixedNameEClass.getESuperTypes().add(this.getQName());
    unprefixedNameEClass.getESuperTypes().add(this.getQName());
    forExprEClass.getESuperTypes().add(this.getExprSingle());
    quantifiedExprEClass.getESuperTypes().add(this.getExprSingle());
    ifExprEClass.getESuperTypes().add(this.getExprSingle());
    orExprEClass.getESuperTypes().add(this.getExprSingle());
    nameTestEClass.getESuperTypes().add(this.getNodeTest());
    literalEClass.getESuperTypes().add(this.getPrimaryExpr());
    numericLiteralEClass.getESuperTypes().add(this.getLiteral());
    varRefEClass.getESuperTypes().add(this.getPrimaryExpr());
    parenthesizedExprEClass.getESuperTypes().add(this.getPrimaryExpr());
    contextItemExprEClass.getESuperTypes().add(this.getPrimaryExpr());
    functionCallEClass.getESuperTypes().add(this.getPrimaryExpr());
    kindTestEClass.getESuperTypes().add(this.getNodeTest());
    attributeNameEClass.getESuperTypes().add(this.getAttributeDeclaration());
    elementNameEClass.getESuperTypes().add(this.getElementDeclaration());
    anyKindTestEClass.getESuperTypes().add(this.getKindTest());
    documentTestEClass.getESuperTypes().add(this.getKindTest());
    textTestEClass.getESuperTypes().add(this.getKindTest());
    commentTestEClass.getESuperTypes().add(this.getKindTest());
    piTestEClass.getESuperTypes().add(this.getKindTest());
    schemaAttributeTestEClass.getESuperTypes().add(this.getKindTest());
    schemaElementTestEClass.getESuperTypes().add(this.getKindTest());
    wildcardEClass.getESuperTypes().add(this.getNameTest());
    elementTestEClass.getESuperTypes().add(this.getKindTest());
    attributeTestEClass.getESuperTypes().add(this.getKindTest());
    axisStepEClass.getESuperTypes().add(this.getStepExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(xPathEClass, XPath.class, "XPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXPath_Expressions(), this.getExpr(), null, "expressions", null, 0, 1, XPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalLiteralEClass, DecimalLiteral.class, "DecimalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, DecimalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNameEClass, QName.class, "QName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQName_LocalPart(), ecorePackage.getEString(), "localPart", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixedNameEClass, PrefixedName.class, "PrefixedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixedName_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, PrefixedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unprefixedNameEClass, UnprefixedName.class, "UnprefixedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpr_Expression(), this.getExprSingle(), null, "expression", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprSingleEClass, ExprSingle.class, "ExprSingle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forExprEClass, ForExpr.class, "ForExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForExpr_For(), this.getSimpleForClause(), null, "for", null, 0, 1, ForExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForExpr_Return(), this.getExprSingle(), null, "return", null, 0, 1, ForExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleForClauseEClass, SimpleForClause.class, "SimpleForClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleForClause_Variable(), this.getVarName(), null, "variable", null, 0, -1, SimpleForClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleForClause_Expression(), this.getExprSingle(), null, "expression", null, 0, -1, SimpleForClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varNameEClass, VarName.class, "VarName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quantifiedExprEClass, QuantifiedExpr.class, "QuantifiedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantifiedExpr_Quantifier(), ecorePackage.getEString(), "quantifier", null, 0, 1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExpr_Variable(), this.getVarName(), null, "variable", null, 0, -1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExpr_Expression(), this.getExprSingle(), null, "expression", null, 0, -1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExpr_Satisfies(), this.getExprSingle(), null, "satisfies", null, 0, 1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifExprEClass, IfExpr.class, "IfExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfExpr_If(), this.getExpr(), null, "if", null, 0, 1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpr_Then(), this.getExprSingle(), null, "then", null, 0, 1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpr_Else(), this.getExprSingle(), null, "else", null, 0, 1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExprEClass, OrExpr.class, "OrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpr_Or(), this.getAndExpr(), null, "or", null, 0, -1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExprEClass, AndExpr.class, "AndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpr_And(), this.getComparisonExpr(), null, "and", null, 0, -1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonExprEClass, ComparisonExpr.class, "ComparisonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparisonExpr_Operand1(), this.getRangeExpr(), null, "operand1", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonExpr_Value(), this.getValueComp(), "value", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonExpr_General(), this.getGeneralComp(), "general", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonExpr_Node(), this.getNodeComp(), "node", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparisonExpr_Range(), this.getRangeExpr(), null, "range", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeExprEClass, RangeExpr.class, "RangeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRangeExpr_Range(), this.getAdditiveExpr(), null, "range", null, 0, 1, RangeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRangeExpr_To(), this.getAdditiveExpr(), null, "to", null, 0, 1, RangeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExprEClass, AdditiveExpr.class, "AdditiveExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpr_Add(), this.getMultiplicativeExpr(), null, "add", null, 0, -1, AdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpr_Operator(), this.getAdditive(), "operator", null, 0, -1, AdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExprEClass, MultiplicativeExpr.class, "MultiplicativeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpr_Multiply(), this.getUnionExpr(), null, "multiply", null, 0, -1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpr_Operator(), this.getMultiplicative(), "operator", null, 0, -1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unionExprEClass, UnionExpr.class, "UnionExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnionExpr_Union(), this.getIntersectExceptExpr(), null, "union", null, 0, -1, UnionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnionExpr_Operator(), this.getUnion(), "operator", null, 0, -1, UnionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intersectExceptExprEClass, IntersectExceptExpr.class, "IntersectExceptExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntersectExceptExpr_Intersect(), this.getInstanceofExpr(), null, "intersect", null, 0, -1, IntersectExceptExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntersectExceptExpr_Operator(), this.getIntersectExcept(), "operator", null, 0, -1, IntersectExceptExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceofExprEClass, InstanceofExpr.class, "InstanceofExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceofExpr_Treat(), this.getTreatExpr(), null, "treat", null, 0, 1, InstanceofExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstanceofExpr_InstanceOf(), this.getSequenceType(), null, "instanceOf", null, 0, 1, InstanceofExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(treatExprEClass, TreatExpr.class, "TreatExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTreatExpr_Castable(), this.getCastableExpr(), null, "castable", null, 0, 1, TreatExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTreatExpr_TreatAs(), this.getSequenceType(), null, "treatAs", null, 0, 1, TreatExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceType_Type(), this.getItemType(), null, "type", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceType_Occurrence(), this.getOccurrenceIndicator(), "occurrence", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemType_KindTest(), this.getKindTest(), null, "kindTest", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemType_AtomicType(), this.getAtomicType(), null, "atomicType", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicTypeEClass, AtomicType.class, "AtomicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(castableExprEClass, CastableExpr.class, "CastableExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastableExpr_Cast(), this.getCastExpr(), null, "cast", null, 0, 1, CastableExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastableExpr_CastableAs(), this.getSingleType(), null, "castableAs", null, 0, 1, CastableExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castExprEClass, CastExpr.class, "CastExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastExpr_Cast(), this.getUnaryExpr(), null, "cast", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastExpr_CastAs(), this.getSingleType(), null, "castAs", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueExprEClass, ValueExpr.class, "ValueExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueExpr_Path(), this.getPathExpr(), null, "path", null, 0, 1, ValueExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleTypeEClass, SingleType.class, "SingleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleType_Type(), this.getAtomicType(), null, "type", null, 0, 1, SingleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleType_Question(), ecorePackage.getEBoolean(), "question", null, 0, 1, SingleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relativePathExprEClass, RelativePathExpr.class, "RelativePathExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelativePathExpr_Step(), this.getStepExpr(), null, "step", null, 0, -1, RelativePathExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelativePathExpr_Separator(), this.getSeparator(), "separator", null, 0, -1, RelativePathExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateListEClass, PredicateList.class, "PredicateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateList_Predicate(), this.getPredicate(), null, "predicate", null, 0, -1, PredicateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicate_Predicate(), this.getExpr(), null, "predicate", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reverseStepEClass, ReverseStep.class, "ReverseStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReverseStep_Axis(), this.getReverseAxis(), null, "axis", null, 0, 1, ReverseStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReverseStep_Test(), this.getNodeTest(), null, "test", null, 0, 1, ReverseStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReverseStep_Abbrev(), ecorePackage.getEString(), "abbrev", null, 0, 1, ReverseStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reverseAxisEClass, ReverseAxis.class, "ReverseAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReverseAxis_Axis(), this.getReverseAxisEnum(), "axis", null, 0, 1, ReverseAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTestEClass, NodeTest.class, "NodeTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameTestEClass, NameTest.class, "NameTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forwardStepEClass, ForwardStep.class, "ForwardStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForwardStep_Axis(), this.getForwardAxis(), null, "axis", null, 0, 1, ForwardStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForwardStep_Test(), this.getNodeTest(), null, "test", null, 0, 1, ForwardStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForwardStep_Abbrev(), this.getAbbrevForwardStep(), null, "abbrev", null, 0, 1, ForwardStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forwardAxisEClass, ForwardAxis.class, "ForwardAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForwardAxis_Axis(), this.getForwardAxisEnum(), "axis", null, 0, 1, ForwardAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abbrevForwardStepEClass, AbbrevForwardStep.class, "AbbrevForwardStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbbrevForwardStep_At(), ecorePackage.getEBoolean(), "at", null, 0, 1, AbbrevForwardStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbbrevForwardStep_Test(), this.getNodeTest(), null, "test", null, 0, 1, AbbrevForwardStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varRefEClass, VarRef.class, "VarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarRef_Var(), this.getVarName(), null, "var", null, 0, 1, VarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesizedExprEClass, ParenthesizedExpr.class, "ParenthesizedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesizedExpr_Expression(), this.getExpr(), null, "expression", null, 0, 1, ParenthesizedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextItemExprEClass, ContextItemExpr.class, "ContextItemExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionCall_Function(), this.getQName(), null, "function", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCall_Parameter(), this.getExprSingle(), null, "parameter", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kindTestEClass, KindTest.class, "KindTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementDeclarationEClass, ElementDeclaration.class, "ElementDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeNameEClass, AttributeName.class, "AttributeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementNameEClass, ElementName.class, "ElementName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeNameEClass, TypeName.class, "TypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyKindTestEClass, AnyKindTest.class, "AnyKindTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(documentTestEClass, DocumentTest.class, "DocumentTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentTest_ElementTest(), this.getElementTest(), null, "elementTest", null, 0, 1, DocumentTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentTest_SchemaElementTest(), this.getSchemaElementTest(), null, "schemaElementTest", null, 0, 1, DocumentTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textTestEClass, TextTest.class, "TextTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commentTestEClass, CommentTest.class, "CommentTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(piTestEClass, PITest.class, "PITest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPITest_Name(), ecorePackage.getEString(), "name", null, 0, 1, PITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPITest_String(), this.getStringLiteral(), null, "string", null, 0, 1, PITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaAttributeTestEClass, SchemaAttributeTest.class, "SchemaAttributeTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaAttributeTest_AttributeDeclaration(), this.getAttributeDeclaration(), null, "attributeDeclaration", null, 0, 1, SchemaAttributeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeDeclarationEClass, AttributeDeclaration.class, "AttributeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(schemaElementTestEClass, SchemaElementTest.class, "SchemaElementTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaElementTest_ElementDeclaration(), this.getElementDeclaration(), null, "elementDeclaration", null, 0, 1, SchemaElementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryExpr_Unary(), this.getValueExpr(), null, "unary", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardEClass, Wildcard.class, "Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcard_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcard_Any(), ecorePackage.getEString(), "any", null, 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementTestEClass, ElementTest.class, "ElementTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementTest_ElementNameOrWildcard(), this.getElementNameOrWildcard(), null, "elementNameOrWildcard", null, 0, 1, ElementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementTest_TypeName(), this.getTypeName(), null, "typeName", null, 0, 1, ElementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementTest_Question(), ecorePackage.getEBoolean(), "question", null, 0, 1, ElementTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeTestEClass, AttributeTest.class, "AttributeTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeTest_AttributeNameOrWildcard(), this.getAttribNameOrWildcard(), null, "attributeNameOrWildcard", null, 0, 1, AttributeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeTest_TypeName(), this.getTypeName(), null, "typeName", null, 0, 1, AttributeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(axisStepEClass, AxisStep.class, "AxisStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAxisStep_ReverseStep(), this.getReverseStep(), null, "reverseStep", null, 0, 1, AxisStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAxisStep_ForwardStep(), this.getForwardStep(), null, "forwardStep", null, 0, 1, AxisStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAxisStep_Predicate(), this.getPredicate(), null, "predicate", null, 0, -1, AxisStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stepExprEClass, StepExpr.class, "StepExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(filterExprEClass, FilterExpr.class, "FilterExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterExpr_Filter(), this.getPrimaryExpr(), null, "filter", null, 0, 1, FilterExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterExpr_Predicate(), this.getPredicate(), null, "predicate", null, 0, -1, FilterExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathExprEClass, PathExpr.class, "PathExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathExpr_Separator(), ecorePackage.getEString(), "separator", null, 0, 1, PathExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathExpr_RelativePath(), this.getRelativePathExpr(), null, "relativePath", null, 0, 1, PathExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attribNameOrWildcardEClass, AttribNameOrWildcard.class, "AttribNameOrWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribNameOrWildcard_AttributeName(), this.getAttributeName(), null, "attributeName", null, 0, 1, AttribNameOrWildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementNameOrWildcardEClass, ElementNameOrWildcard.class, "ElementNameOrWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementNameOrWildcard_ElementName(), this.getElementName(), null, "elementName", null, 0, 1, ElementNameOrWildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExprEClass, PrimaryExpr.class, "PrimaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(intersectExceptEEnum, IntersectExcept.class, "IntersectExcept");
    addEEnumLiteral(intersectExceptEEnum, IntersectExcept.INTERSECT);
    addEEnumLiteral(intersectExceptEEnum, IntersectExcept.EXCEPT);

    initEEnum(unionEEnum, Union.class, "Union");
    addEEnumLiteral(unionEEnum, Union.UNION);
    addEEnumLiteral(unionEEnum, Union.OR);

    initEEnum(additiveEEnum, Additive.class, "Additive");
    addEEnumLiteral(additiveEEnum, Additive.PLUS);
    addEEnumLiteral(additiveEEnum, Additive.MINUS);

    initEEnum(generalCompEEnum, GeneralComp.class, "GeneralComp");
    addEEnumLiteral(generalCompEEnum, GeneralComp.EQ);
    addEEnumLiteral(generalCompEEnum, GeneralComp.NE);
    addEEnumLiteral(generalCompEEnum, GeneralComp.LT);
    addEEnumLiteral(generalCompEEnum, GeneralComp.LE);
    addEEnumLiteral(generalCompEEnum, GeneralComp.GT);
    addEEnumLiteral(generalCompEEnum, GeneralComp.GE);

    initEEnum(valueCompEEnum, ValueComp.class, "ValueComp");
    addEEnumLiteral(valueCompEEnum, ValueComp.EQ);
    addEEnumLiteral(valueCompEEnum, ValueComp.NE);
    addEEnumLiteral(valueCompEEnum, ValueComp.LT);
    addEEnumLiteral(valueCompEEnum, ValueComp.LE);
    addEEnumLiteral(valueCompEEnum, ValueComp.GT);
    addEEnumLiteral(valueCompEEnum, ValueComp.GE);

    initEEnum(nodeCompEEnum, NodeComp.class, "NodeComp");
    addEEnumLiteral(nodeCompEEnum, NodeComp.IS);
    addEEnumLiteral(nodeCompEEnum, NodeComp.LEFT);
    addEEnumLiteral(nodeCompEEnum, NodeComp.RIGHT);

    initEEnum(separatorEEnum, Separator.class, "Separator");
    addEEnumLiteral(separatorEEnum, Separator.DOUBLE);
    addEEnumLiteral(separatorEEnum, Separator.SINGLE);

    initEEnum(reverseAxisEnumEEnum, ReverseAxisEnum.class, "ReverseAxisEnum");
    addEEnumLiteral(reverseAxisEnumEEnum, ReverseAxisEnum.PARENT);
    addEEnumLiteral(reverseAxisEnumEEnum, ReverseAxisEnum.ANCESTOR);
    addEEnumLiteral(reverseAxisEnumEEnum, ReverseAxisEnum.PRECEDING_SIBLING);
    addEEnumLiteral(reverseAxisEnumEEnum, ReverseAxisEnum.PRECEDING);
    addEEnumLiteral(reverseAxisEnumEEnum, ReverseAxisEnum.ANCESTOR_OR_SELF);

    initEEnum(forwardAxisEnumEEnum, ForwardAxisEnum.class, "ForwardAxisEnum");
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.CHILD);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.DESCENDANT);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.ATTRIBUTEX);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.SELF);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.DESCENDANT_OR_SELF);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.FOLLOWING_SIBLING);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.FOLLOWING);
    addEEnumLiteral(forwardAxisEnumEEnum, ForwardAxisEnum.NAMESPACE);

    initEEnum(occurrenceIndicatorEEnum, OccurrenceIndicator.class, "OccurrenceIndicator");
    addEEnumLiteral(occurrenceIndicatorEEnum, OccurrenceIndicator.OPTIONAL);
    addEEnumLiteral(occurrenceIndicatorEEnum, OccurrenceIndicator.ONE_OR_MORE);

    initEEnum(multiplicativeEEnum, Multiplicative.class, "Multiplicative");
    addEEnumLiteral(multiplicativeEEnum, Multiplicative.DIV);
    addEEnumLiteral(multiplicativeEEnum, Multiplicative.IDIV);
    addEEnumLiteral(multiplicativeEEnum, Multiplicative.MOD);

    // Create resource
    createResource(eNS_URI);
  }

} //Xpath20PackageImpl
