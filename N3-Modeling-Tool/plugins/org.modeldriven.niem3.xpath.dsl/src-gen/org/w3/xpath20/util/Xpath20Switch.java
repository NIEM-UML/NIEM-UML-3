/**
 */
package org.w3.xpath20.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.w3.xpath20.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Package
 * @generated
 */
public class Xpath20Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Xpath20Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xpath20Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = Xpath20Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Xpath20Package.XPATH:
      {
        XPath xPath = (XPath)theEObject;
        T result = caseXPath(xPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseNumericLiteral(integerLiteral);
        if (result == null) result = caseLiteral(integerLiteral);
        if (result == null) result = casePrimaryExpr(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.DECIMAL_LITERAL:
      {
        DecimalLiteral decimalLiteral = (DecimalLiteral)theEObject;
        T result = caseDecimalLiteral(decimalLiteral);
        if (result == null) result = caseNumericLiteral(decimalLiteral);
        if (result == null) result = caseLiteral(decimalLiteral);
        if (result == null) result = casePrimaryExpr(decimalLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseNumericLiteral(doubleLiteral);
        if (result == null) result = caseLiteral(doubleLiteral);
        if (result == null) result = casePrimaryExpr(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = casePrimaryExpr(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.QNAME:
      {
        QName qName = (QName)theEObject;
        T result = caseQName(qName);
        if (result == null) result = caseVarName(qName);
        if (result == null) result = caseAtomicType(qName);
        if (result == null) result = caseNameTest(qName);
        if (result == null) result = caseAttributeName(qName);
        if (result == null) result = caseElementName(qName);
        if (result == null) result = caseTypeName(qName);
        if (result == null) result = caseNodeTest(qName);
        if (result == null) result = caseAttributeDeclaration(qName);
        if (result == null) result = caseElementDeclaration(qName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PREFIXED_NAME:
      {
        PrefixedName prefixedName = (PrefixedName)theEObject;
        T result = casePrefixedName(prefixedName);
        if (result == null) result = caseQName(prefixedName);
        if (result == null) result = caseVarName(prefixedName);
        if (result == null) result = caseAtomicType(prefixedName);
        if (result == null) result = caseNameTest(prefixedName);
        if (result == null) result = caseAttributeName(prefixedName);
        if (result == null) result = caseElementName(prefixedName);
        if (result == null) result = caseTypeName(prefixedName);
        if (result == null) result = caseNodeTest(prefixedName);
        if (result == null) result = caseAttributeDeclaration(prefixedName);
        if (result == null) result = caseElementDeclaration(prefixedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.UNPREFIXED_NAME:
      {
        UnprefixedName unprefixedName = (UnprefixedName)theEObject;
        T result = caseUnprefixedName(unprefixedName);
        if (result == null) result = caseQName(unprefixedName);
        if (result == null) result = caseVarName(unprefixedName);
        if (result == null) result = caseAtomicType(unprefixedName);
        if (result == null) result = caseNameTest(unprefixedName);
        if (result == null) result = caseAttributeName(unprefixedName);
        if (result == null) result = caseElementName(unprefixedName);
        if (result == null) result = caseTypeName(unprefixedName);
        if (result == null) result = caseNodeTest(unprefixedName);
        if (result == null) result = caseAttributeDeclaration(unprefixedName);
        if (result == null) result = caseElementDeclaration(unprefixedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.EXPR_SINGLE:
      {
        ExprSingle exprSingle = (ExprSingle)theEObject;
        T result = caseExprSingle(exprSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.FOR_EXPR:
      {
        ForExpr forExpr = (ForExpr)theEObject;
        T result = caseForExpr(forExpr);
        if (result == null) result = caseExprSingle(forExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.SIMPLE_FOR_CLAUSE:
      {
        SimpleForClause simpleForClause = (SimpleForClause)theEObject;
        T result = caseSimpleForClause(simpleForClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.VAR_NAME:
      {
        VarName varName = (VarName)theEObject;
        T result = caseVarName(varName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.QUANTIFIED_EXPR:
      {
        QuantifiedExpr quantifiedExpr = (QuantifiedExpr)theEObject;
        T result = caseQuantifiedExpr(quantifiedExpr);
        if (result == null) result = caseExprSingle(quantifiedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.IF_EXPR:
      {
        IfExpr ifExpr = (IfExpr)theEObject;
        T result = caseIfExpr(ifExpr);
        if (result == null) result = caseExprSingle(ifExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.OR_EXPR:
      {
        OrExpr orExpr = (OrExpr)theEObject;
        T result = caseOrExpr(orExpr);
        if (result == null) result = caseExprSingle(orExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.AND_EXPR:
      {
        AndExpr andExpr = (AndExpr)theEObject;
        T result = caseAndExpr(andExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.COMPARISON_EXPR:
      {
        ComparisonExpr comparisonExpr = (ComparisonExpr)theEObject;
        T result = caseComparisonExpr(comparisonExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.RANGE_EXPR:
      {
        RangeExpr rangeExpr = (RangeExpr)theEObject;
        T result = caseRangeExpr(rangeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ADDITIVE_EXPR:
      {
        AdditiveExpr additiveExpr = (AdditiveExpr)theEObject;
        T result = caseAdditiveExpr(additiveExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.MULTIPLICATIVE_EXPR:
      {
        MultiplicativeExpr multiplicativeExpr = (MultiplicativeExpr)theEObject;
        T result = caseMultiplicativeExpr(multiplicativeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.UNION_EXPR:
      {
        UnionExpr unionExpr = (UnionExpr)theEObject;
        T result = caseUnionExpr(unionExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.INTERSECT_EXCEPT_EXPR:
      {
        IntersectExceptExpr intersectExceptExpr = (IntersectExceptExpr)theEObject;
        T result = caseIntersectExceptExpr(intersectExceptExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.INSTANCEOF_EXPR:
      {
        InstanceofExpr instanceofExpr = (InstanceofExpr)theEObject;
        T result = caseInstanceofExpr(instanceofExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.TREAT_EXPR:
      {
        TreatExpr treatExpr = (TreatExpr)theEObject;
        T result = caseTreatExpr(treatExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.SEQUENCE_TYPE:
      {
        SequenceType sequenceType = (SequenceType)theEObject;
        T result = caseSequenceType(sequenceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ITEM_TYPE:
      {
        ItemType itemType = (ItemType)theEObject;
        T result = caseItemType(itemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ATOMIC_TYPE:
      {
        AtomicType atomicType = (AtomicType)theEObject;
        T result = caseAtomicType(atomicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.CASTABLE_EXPR:
      {
        CastableExpr castableExpr = (CastableExpr)theEObject;
        T result = caseCastableExpr(castableExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.CAST_EXPR:
      {
        CastExpr castExpr = (CastExpr)theEObject;
        T result = caseCastExpr(castExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.VALUE_EXPR:
      {
        ValueExpr valueExpr = (ValueExpr)theEObject;
        T result = caseValueExpr(valueExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.SINGLE_TYPE:
      {
        SingleType singleType = (SingleType)theEObject;
        T result = caseSingleType(singleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.RELATIVE_PATH_EXPR:
      {
        RelativePathExpr relativePathExpr = (RelativePathExpr)theEObject;
        T result = caseRelativePathExpr(relativePathExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PREDICATE_LIST:
      {
        PredicateList predicateList = (PredicateList)theEObject;
        T result = casePredicateList(predicateList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.REVERSE_STEP:
      {
        ReverseStep reverseStep = (ReverseStep)theEObject;
        T result = caseReverseStep(reverseStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.REVERSE_AXIS:
      {
        ReverseAxis reverseAxis = (ReverseAxis)theEObject;
        T result = caseReverseAxis(reverseAxis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.NODE_TEST:
      {
        NodeTest nodeTest = (NodeTest)theEObject;
        T result = caseNodeTest(nodeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.NAME_TEST:
      {
        NameTest nameTest = (NameTest)theEObject;
        T result = caseNameTest(nameTest);
        if (result == null) result = caseNodeTest(nameTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.FORWARD_STEP:
      {
        ForwardStep forwardStep = (ForwardStep)theEObject;
        T result = caseForwardStep(forwardStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.FORWARD_AXIS:
      {
        ForwardAxis forwardAxis = (ForwardAxis)theEObject;
        T result = caseForwardAxis(forwardAxis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ABBREV_FORWARD_STEP:
      {
        AbbrevForwardStep abbrevForwardStep = (AbbrevForwardStep)theEObject;
        T result = caseAbbrevForwardStep(abbrevForwardStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = casePrimaryExpr(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.NUMERIC_LITERAL:
      {
        NumericLiteral numericLiteral = (NumericLiteral)theEObject;
        T result = caseNumericLiteral(numericLiteral);
        if (result == null) result = caseLiteral(numericLiteral);
        if (result == null) result = casePrimaryExpr(numericLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.VAR_REF:
      {
        VarRef varRef = (VarRef)theEObject;
        T result = caseVarRef(varRef);
        if (result == null) result = casePrimaryExpr(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PARENTHESIZED_EXPR:
      {
        ParenthesizedExpr parenthesizedExpr = (ParenthesizedExpr)theEObject;
        T result = caseParenthesizedExpr(parenthesizedExpr);
        if (result == null) result = casePrimaryExpr(parenthesizedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.CONTEXT_ITEM_EXPR:
      {
        ContextItemExpr contextItemExpr = (ContextItemExpr)theEObject;
        T result = caseContextItemExpr(contextItemExpr);
        if (result == null) result = casePrimaryExpr(contextItemExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = casePrimaryExpr(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.KIND_TEST:
      {
        KindTest kindTest = (KindTest)theEObject;
        T result = caseKindTest(kindTest);
        if (result == null) result = caseNodeTest(kindTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ELEMENT_DECLARATION:
      {
        ElementDeclaration elementDeclaration = (ElementDeclaration)theEObject;
        T result = caseElementDeclaration(elementDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ATTRIBUTE_NAME:
      {
        AttributeName attributeName = (AttributeName)theEObject;
        T result = caseAttributeName(attributeName);
        if (result == null) result = caseAttributeDeclaration(attributeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ELEMENT_NAME:
      {
        ElementName elementName = (ElementName)theEObject;
        T result = caseElementName(elementName);
        if (result == null) result = caseElementDeclaration(elementName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.TYPE_NAME:
      {
        TypeName typeName = (TypeName)theEObject;
        T result = caseTypeName(typeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ANY_KIND_TEST:
      {
        AnyKindTest anyKindTest = (AnyKindTest)theEObject;
        T result = caseAnyKindTest(anyKindTest);
        if (result == null) result = caseKindTest(anyKindTest);
        if (result == null) result = caseNodeTest(anyKindTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.DOCUMENT_TEST:
      {
        DocumentTest documentTest = (DocumentTest)theEObject;
        T result = caseDocumentTest(documentTest);
        if (result == null) result = caseKindTest(documentTest);
        if (result == null) result = caseNodeTest(documentTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.TEXT_TEST:
      {
        TextTest textTest = (TextTest)theEObject;
        T result = caseTextTest(textTest);
        if (result == null) result = caseKindTest(textTest);
        if (result == null) result = caseNodeTest(textTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.COMMENT_TEST:
      {
        CommentTest commentTest = (CommentTest)theEObject;
        T result = caseCommentTest(commentTest);
        if (result == null) result = caseKindTest(commentTest);
        if (result == null) result = caseNodeTest(commentTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PI_TEST:
      {
        PITest piTest = (PITest)theEObject;
        T result = casePITest(piTest);
        if (result == null) result = caseKindTest(piTest);
        if (result == null) result = caseNodeTest(piTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST:
      {
        SchemaAttributeTest schemaAttributeTest = (SchemaAttributeTest)theEObject;
        T result = caseSchemaAttributeTest(schemaAttributeTest);
        if (result == null) result = caseKindTest(schemaAttributeTest);
        if (result == null) result = caseNodeTest(schemaAttributeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ATTRIBUTE_DECLARATION:
      {
        AttributeDeclaration attributeDeclaration = (AttributeDeclaration)theEObject;
        T result = caseAttributeDeclaration(attributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.SCHEMA_ELEMENT_TEST:
      {
        SchemaElementTest schemaElementTest = (SchemaElementTest)theEObject;
        T result = caseSchemaElementTest(schemaElementTest);
        if (result == null) result = caseKindTest(schemaElementTest);
        if (result == null) result = caseNodeTest(schemaElementTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.WILDCARD:
      {
        Wildcard wildcard = (Wildcard)theEObject;
        T result = caseWildcard(wildcard);
        if (result == null) result = caseNameTest(wildcard);
        if (result == null) result = caseNodeTest(wildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ELEMENT_TEST:
      {
        ElementTest elementTest = (ElementTest)theEObject;
        T result = caseElementTest(elementTest);
        if (result == null) result = caseKindTest(elementTest);
        if (result == null) result = caseNodeTest(elementTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ATTRIBUTE_TEST:
      {
        AttributeTest attributeTest = (AttributeTest)theEObject;
        T result = caseAttributeTest(attributeTest);
        if (result == null) result = caseKindTest(attributeTest);
        if (result == null) result = caseNodeTest(attributeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.AXIS_STEP:
      {
        AxisStep axisStep = (AxisStep)theEObject;
        T result = caseAxisStep(axisStep);
        if (result == null) result = caseStepExpr(axisStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.STEP_EXPR:
      {
        StepExpr stepExpr = (StepExpr)theEObject;
        T result = caseStepExpr(stepExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.FILTER_EXPR:
      {
        FilterExpr filterExpr = (FilterExpr)theEObject;
        T result = caseFilterExpr(filterExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PATH_EXPR:
      {
        PathExpr pathExpr = (PathExpr)theEObject;
        T result = casePathExpr(pathExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD:
      {
        AttribNameOrWildcard attribNameOrWildcard = (AttribNameOrWildcard)theEObject;
        T result = caseAttribNameOrWildcard(attribNameOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD:
      {
        ElementNameOrWildcard elementNameOrWildcard = (ElementNameOrWildcard)theEObject;
        T result = caseElementNameOrWildcard(elementNameOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Xpath20Package.PRIMARY_EXPR:
      {
        PrimaryExpr primaryExpr = (PrimaryExpr)theEObject;
        T result = casePrimaryExpr(primaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPath</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPath</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPath(XPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalLiteral(DecimalLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQName(QName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefixed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefixed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixedName(PrefixedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unprefixed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unprefixed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnprefixedName(UnprefixedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprSingle(ExprSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForExpr(ForExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple For Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple For Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleForClause(SimpleForClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarName(VarName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedExpr(QuantifiedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpr(IfExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpr(OrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpr(AndExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpr(ComparisonExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeExpr(RangeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpr(AdditiveExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpr(MultiplicativeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnionExpr(UnionExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersect Except Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersect Except Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntersectExceptExpr(IntersectExceptExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instanceof Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instanceof Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceofExpr(InstanceofExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Treat Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treat Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreatExpr(TreatExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceType(SequenceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemType(ItemType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicType(AtomicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Castable Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Castable Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastableExpr(CastableExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpr(CastExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpr(ValueExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleType(SingleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Path Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Path Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativePathExpr(RelativePathExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateList(PredicateList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reverse Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reverse Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReverseStep(ReverseStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reverse Axis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reverse Axis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReverseAxis(ReverseAxis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeTest(NodeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameTest(NameTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardStep(ForwardStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward Axis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward Axis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardAxis(ForwardAxis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abbrev Forward Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abbrev Forward Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbbrevForwardStep(AbbrevForwardStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericLiteral(NumericLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRef(VarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedExpr(ParenthesizedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Item Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Item Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextItemExpr(ContextItemExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kind Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kind Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKindTest(KindTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDeclaration(ElementDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeName(AttributeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementName(ElementName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeName(TypeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Kind Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Kind Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyKindTest(AnyKindTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentTest(DocumentTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextTest(TextTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommentTest(CommentTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PI Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PI Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePITest(PITest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Attribute Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaAttributeTest(SchemaAttributeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDeclaration(AttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Element Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Element Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaElementTest(SchemaElementTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcard(Wildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementTest(ElementTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeTest(AttributeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axis Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axis Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxisStep(AxisStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStepExpr(StepExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterExpr(FilterExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathExpr(PathExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attrib Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attrib Name Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribNameOrWildcard(AttribNameOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Name Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementNameOrWildcard(ElementNameOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpr(PrimaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Xpath20Switch
