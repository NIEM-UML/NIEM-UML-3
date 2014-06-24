/**
 */
package org.w3.xpath20.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3.xpath20.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Package
 * @generated
 */
public class Xpath20AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Xpath20Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xpath20AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Xpath20Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Xpath20Switch<Adapter> modelSwitch =
    new Xpath20Switch<Adapter>()
    {
      @Override
      public Adapter caseXPath(XPath object)
      {
        return createXPathAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalLiteral(DecimalLiteral object)
      {
        return createDecimalLiteralAdapter();
      }
      @Override
      public Adapter caseDoubleLiteral(DoubleLiteral object)
      {
        return createDoubleLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseQName(QName object)
      {
        return createQNameAdapter();
      }
      @Override
      public Adapter casePrefixedName(PrefixedName object)
      {
        return createPrefixedNameAdapter();
      }
      @Override
      public Adapter caseUnprefixedName(UnprefixedName object)
      {
        return createUnprefixedNameAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExprSingle(ExprSingle object)
      {
        return createExprSingleAdapter();
      }
      @Override
      public Adapter caseForExpr(ForExpr object)
      {
        return createForExprAdapter();
      }
      @Override
      public Adapter caseSimpleForClause(SimpleForClause object)
      {
        return createSimpleForClauseAdapter();
      }
      @Override
      public Adapter caseVarName(VarName object)
      {
        return createVarNameAdapter();
      }
      @Override
      public Adapter caseQuantifiedExpr(QuantifiedExpr object)
      {
        return createQuantifiedExprAdapter();
      }
      @Override
      public Adapter caseIfExpr(IfExpr object)
      {
        return createIfExprAdapter();
      }
      @Override
      public Adapter caseOrExpr(OrExpr object)
      {
        return createOrExprAdapter();
      }
      @Override
      public Adapter caseAndExpr(AndExpr object)
      {
        return createAndExprAdapter();
      }
      @Override
      public Adapter caseComparisonExpr(ComparisonExpr object)
      {
        return createComparisonExprAdapter();
      }
      @Override
      public Adapter caseRangeExpr(RangeExpr object)
      {
        return createRangeExprAdapter();
      }
      @Override
      public Adapter caseAdditiveExpr(AdditiveExpr object)
      {
        return createAdditiveExprAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpr(MultiplicativeExpr object)
      {
        return createMultiplicativeExprAdapter();
      }
      @Override
      public Adapter caseUnionExpr(UnionExpr object)
      {
        return createUnionExprAdapter();
      }
      @Override
      public Adapter caseIntersectExceptExpr(IntersectExceptExpr object)
      {
        return createIntersectExceptExprAdapter();
      }
      @Override
      public Adapter caseInstanceofExpr(InstanceofExpr object)
      {
        return createInstanceofExprAdapter();
      }
      @Override
      public Adapter caseTreatExpr(TreatExpr object)
      {
        return createTreatExprAdapter();
      }
      @Override
      public Adapter caseSequenceType(SequenceType object)
      {
        return createSequenceTypeAdapter();
      }
      @Override
      public Adapter caseItemType(ItemType object)
      {
        return createItemTypeAdapter();
      }
      @Override
      public Adapter caseAtomicType(AtomicType object)
      {
        return createAtomicTypeAdapter();
      }
      @Override
      public Adapter caseCastableExpr(CastableExpr object)
      {
        return createCastableExprAdapter();
      }
      @Override
      public Adapter caseCastExpr(CastExpr object)
      {
        return createCastExprAdapter();
      }
      @Override
      public Adapter caseValueExpr(ValueExpr object)
      {
        return createValueExprAdapter();
      }
      @Override
      public Adapter caseSingleType(SingleType object)
      {
        return createSingleTypeAdapter();
      }
      @Override
      public Adapter caseRelativePathExpr(RelativePathExpr object)
      {
        return createRelativePathExprAdapter();
      }
      @Override
      public Adapter casePredicateList(PredicateList object)
      {
        return createPredicateListAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter caseReverseStep(ReverseStep object)
      {
        return createReverseStepAdapter();
      }
      @Override
      public Adapter caseReverseAxis(ReverseAxis object)
      {
        return createReverseAxisAdapter();
      }
      @Override
      public Adapter caseNodeTest(NodeTest object)
      {
        return createNodeTestAdapter();
      }
      @Override
      public Adapter caseNameTest(NameTest object)
      {
        return createNameTestAdapter();
      }
      @Override
      public Adapter caseForwardStep(ForwardStep object)
      {
        return createForwardStepAdapter();
      }
      @Override
      public Adapter caseForwardAxis(ForwardAxis object)
      {
        return createForwardAxisAdapter();
      }
      @Override
      public Adapter caseAbbrevForwardStep(AbbrevForwardStep object)
      {
        return createAbbrevForwardStepAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseVarRef(VarRef object)
      {
        return createVarRefAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpr(ParenthesizedExpr object)
      {
        return createParenthesizedExprAdapter();
      }
      @Override
      public Adapter caseContextItemExpr(ContextItemExpr object)
      {
        return createContextItemExprAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseKindTest(KindTest object)
      {
        return createKindTestAdapter();
      }
      @Override
      public Adapter caseElementDeclaration(ElementDeclaration object)
      {
        return createElementDeclarationAdapter();
      }
      @Override
      public Adapter caseAttributeName(AttributeName object)
      {
        return createAttributeNameAdapter();
      }
      @Override
      public Adapter caseElementName(ElementName object)
      {
        return createElementNameAdapter();
      }
      @Override
      public Adapter caseTypeName(TypeName object)
      {
        return createTypeNameAdapter();
      }
      @Override
      public Adapter caseAnyKindTest(AnyKindTest object)
      {
        return createAnyKindTestAdapter();
      }
      @Override
      public Adapter caseDocumentTest(DocumentTest object)
      {
        return createDocumentTestAdapter();
      }
      @Override
      public Adapter caseTextTest(TextTest object)
      {
        return createTextTestAdapter();
      }
      @Override
      public Adapter caseCommentTest(CommentTest object)
      {
        return createCommentTestAdapter();
      }
      @Override
      public Adapter casePITest(PITest object)
      {
        return createPITestAdapter();
      }
      @Override
      public Adapter caseSchemaAttributeTest(SchemaAttributeTest object)
      {
        return createSchemaAttributeTestAdapter();
      }
      @Override
      public Adapter caseAttributeDeclaration(AttributeDeclaration object)
      {
        return createAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseSchemaElementTest(SchemaElementTest object)
      {
        return createSchemaElementTestAdapter();
      }
      @Override
      public Adapter caseUnaryExpr(UnaryExpr object)
      {
        return createUnaryExprAdapter();
      }
      @Override
      public Adapter caseWildcard(Wildcard object)
      {
        return createWildcardAdapter();
      }
      @Override
      public Adapter caseElementTest(ElementTest object)
      {
        return createElementTestAdapter();
      }
      @Override
      public Adapter caseAttributeTest(AttributeTest object)
      {
        return createAttributeTestAdapter();
      }
      @Override
      public Adapter caseAxisStep(AxisStep object)
      {
        return createAxisStepAdapter();
      }
      @Override
      public Adapter caseStepExpr(StepExpr object)
      {
        return createStepExprAdapter();
      }
      @Override
      public Adapter caseFilterExpr(FilterExpr object)
      {
        return createFilterExprAdapter();
      }
      @Override
      public Adapter casePathExpr(PathExpr object)
      {
        return createPathExprAdapter();
      }
      @Override
      public Adapter caseAttribNameOrWildcard(AttribNameOrWildcard object)
      {
        return createAttribNameOrWildcardAdapter();
      }
      @Override
      public Adapter caseElementNameOrWildcard(ElementNameOrWildcard object)
      {
        return createElementNameOrWildcardAdapter();
      }
      @Override
      public Adapter casePrimaryExpr(PrimaryExpr object)
      {
        return createPrimaryExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.XPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.XPath
   * @generated
   */
  public Adapter createXPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.DecimalLiteral <em>Decimal Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.DecimalLiteral
   * @generated
   */
  public Adapter createDecimalLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.DoubleLiteral
   * @generated
   */
  public Adapter createDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.QName
   * @generated
   */
  public Adapter createQNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.PrefixedName <em>Prefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.PrefixedName
   * @generated
   */
  public Adapter createPrefixedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.UnprefixedName <em>Unprefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.UnprefixedName
   * @generated
   */
  public Adapter createUnprefixedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ExprSingle <em>Expr Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ExprSingle
   * @generated
   */
  public Adapter createExprSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ForExpr <em>For Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ForExpr
   * @generated
   */
  public Adapter createForExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.SimpleForClause <em>Simple For Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.SimpleForClause
   * @generated
   */
  public Adapter createSimpleForClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.VarName
   * @generated
   */
  public Adapter createVarNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.QuantifiedExpr
   * @generated
   */
  public Adapter createQuantifiedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.IfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.IfExpr
   * @generated
   */
  public Adapter createIfExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.OrExpr
   * @generated
   */
  public Adapter createOrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AndExpr
   * @generated
   */
  public Adapter createAndExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ComparisonExpr <em>Comparison Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ComparisonExpr
   * @generated
   */
  public Adapter createComparisonExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.RangeExpr <em>Range Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.RangeExpr
   * @generated
   */
  public Adapter createRangeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AdditiveExpr
   * @generated
   */
  public Adapter createAdditiveExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.MultiplicativeExpr
   * @generated
   */
  public Adapter createMultiplicativeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.UnionExpr <em>Union Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.UnionExpr
   * @generated
   */
  public Adapter createUnionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.IntersectExceptExpr
   * @generated
   */
  public Adapter createIntersectExceptExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.InstanceofExpr <em>Instanceof Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.InstanceofExpr
   * @generated
   */
  public Adapter createInstanceofExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.TreatExpr <em>Treat Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.TreatExpr
   * @generated
   */
  public Adapter createTreatExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.SequenceType
   * @generated
   */
  public Adapter createSequenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ItemType
   * @generated
   */
  public Adapter createItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AtomicType
   * @generated
   */
  public Adapter createAtomicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.CastableExpr <em>Castable Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.CastableExpr
   * @generated
   */
  public Adapter createCastableExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.CastExpr
   * @generated
   */
  public Adapter createCastExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ValueExpr
   * @generated
   */
  public Adapter createValueExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.SingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.SingleType
   * @generated
   */
  public Adapter createSingleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.RelativePathExpr <em>Relative Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.RelativePathExpr
   * @generated
   */
  public Adapter createRelativePathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.PredicateList <em>Predicate List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.PredicateList
   * @generated
   */
  public Adapter createPredicateListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ReverseStep <em>Reverse Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ReverseStep
   * @generated
   */
  public Adapter createReverseStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ReverseAxis <em>Reverse Axis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ReverseAxis
   * @generated
   */
  public Adapter createReverseAxisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.NodeTest <em>Node Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.NodeTest
   * @generated
   */
  public Adapter createNodeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.NameTest <em>Name Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.NameTest
   * @generated
   */
  public Adapter createNameTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ForwardStep <em>Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ForwardStep
   * @generated
   */
  public Adapter createForwardStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ForwardAxis <em>Forward Axis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ForwardAxis
   * @generated
   */
  public Adapter createForwardAxisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AbbrevForwardStep
   * @generated
   */
  public Adapter createAbbrevForwardStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.VarRef
   * @generated
   */
  public Adapter createVarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ParenthesizedExpr
   * @generated
   */
  public Adapter createParenthesizedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ContextItemExpr <em>Context Item Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ContextItemExpr
   * @generated
   */
  public Adapter createContextItemExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.KindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.KindTest
   * @generated
   */
  public Adapter createKindTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ElementDeclaration
   * @generated
   */
  public Adapter createElementDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AttributeName
   * @generated
   */
  public Adapter createAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ElementName
   * @generated
   */
  public Adapter createElementNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.TypeName
   * @generated
   */
  public Adapter createTypeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AnyKindTest <em>Any Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AnyKindTest
   * @generated
   */
  public Adapter createAnyKindTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.DocumentTest <em>Document Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.DocumentTest
   * @generated
   */
  public Adapter createDocumentTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.TextTest <em>Text Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.TextTest
   * @generated
   */
  public Adapter createTextTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.CommentTest <em>Comment Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.CommentTest
   * @generated
   */
  public Adapter createCommentTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.PITest <em>PI Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.PITest
   * @generated
   */
  public Adapter createPITestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.SchemaAttributeTest
   * @generated
   */
  public Adapter createSchemaAttributeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AttributeDeclaration
   * @generated
   */
  public Adapter createAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.SchemaElementTest <em>Schema Element Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.SchemaElementTest
   * @generated
   */
  public Adapter createSchemaElementTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.UnaryExpr
   * @generated
   */
  public Adapter createUnaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.Wildcard
   * @generated
   */
  public Adapter createWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ElementTest <em>Element Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ElementTest
   * @generated
   */
  public Adapter createElementTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AttributeTest <em>Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AttributeTest
   * @generated
   */
  public Adapter createAttributeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AxisStep <em>Axis Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AxisStep
   * @generated
   */
  public Adapter createAxisStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.StepExpr <em>Step Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.StepExpr
   * @generated
   */
  public Adapter createStepExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.FilterExpr <em>Filter Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.FilterExpr
   * @generated
   */
  public Adapter createFilterExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.PathExpr
   * @generated
   */
  public Adapter createPathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.AttribNameOrWildcard <em>Attrib Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.AttribNameOrWildcard
   * @generated
   */
  public Adapter createAttribNameOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.ElementNameOrWildcard <em>Element Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.ElementNameOrWildcard
   * @generated
   */
  public Adapter createElementNameOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.w3.xpath20.PrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.w3.xpath20.PrimaryExpr
   * @generated
   */
  public Adapter createPrimaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Xpath20AdapterFactory
