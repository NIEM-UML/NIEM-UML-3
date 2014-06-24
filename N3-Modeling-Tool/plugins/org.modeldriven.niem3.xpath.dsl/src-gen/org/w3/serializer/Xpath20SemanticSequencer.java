package org.w3.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.w3.services.Xpath20GrammarAccess;
import org.w3.xpath20.AbbrevForwardStep;
import org.w3.xpath20.AdditiveExpr;
import org.w3.xpath20.AndExpr;
import org.w3.xpath20.AnyKindTest;
import org.w3.xpath20.AttribNameOrWildcard;
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
import org.w3.xpath20.ElementNameOrWildcard;
import org.w3.xpath20.ElementTest;
import org.w3.xpath20.Expr;
import org.w3.xpath20.FilterExpr;
import org.w3.xpath20.ForExpr;
import org.w3.xpath20.ForwardAxis;
import org.w3.xpath20.ForwardStep;
import org.w3.xpath20.FunctionCall;
import org.w3.xpath20.IfExpr;
import org.w3.xpath20.InstanceofExpr;
import org.w3.xpath20.IntegerLiteral;
import org.w3.xpath20.IntersectExceptExpr;
import org.w3.xpath20.ItemType;
import org.w3.xpath20.MultiplicativeExpr;
import org.w3.xpath20.OrExpr;
import org.w3.xpath20.PITest;
import org.w3.xpath20.ParenthesizedExpr;
import org.w3.xpath20.PathExpr;
import org.w3.xpath20.Predicate;
import org.w3.xpath20.PredicateList;
import org.w3.xpath20.PrefixedName;
import org.w3.xpath20.QuantifiedExpr;
import org.w3.xpath20.RangeExpr;
import org.w3.xpath20.RelativePathExpr;
import org.w3.xpath20.ReverseAxis;
import org.w3.xpath20.ReverseStep;
import org.w3.xpath20.SchemaAttributeTest;
import org.w3.xpath20.SchemaElementTest;
import org.w3.xpath20.SequenceType;
import org.w3.xpath20.SimpleForClause;
import org.w3.xpath20.SingleType;
import org.w3.xpath20.StringLiteral;
import org.w3.xpath20.TextTest;
import org.w3.xpath20.TreatExpr;
import org.w3.xpath20.UnaryExpr;
import org.w3.xpath20.UnionExpr;
import org.w3.xpath20.UnprefixedName;
import org.w3.xpath20.ValueExpr;
import org.w3.xpath20.VarRef;
import org.w3.xpath20.Wildcard;
import org.w3.xpath20.XPath;
import org.w3.xpath20.Xpath20Package;

@SuppressWarnings("all")
public class Xpath20SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Xpath20GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Xpath20Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Xpath20Package.ABBREV_FORWARD_STEP:
				if(context == grammarAccess.getAbbrevForwardStepRule()) {
					sequence_AbbrevForwardStep(context, (AbbrevForwardStep) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ADDITIVE_EXPR:
				if(context == grammarAccess.getAdditiveExprRule()) {
					sequence_AdditiveExpr(context, (AdditiveExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.AND_EXPR:
				if(context == grammarAccess.getAndExprRule()) {
					sequence_AndExpr(context, (AndExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ANY_KIND_TEST:
				if(context == grammarAccess.getAnyKindTestRule() ||
				   context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_AnyKindTest(context, (AnyKindTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ATTRIB_NAME_OR_WILDCARD:
				if(context == grammarAccess.getAttribNameOrWildcardRule()) {
					sequence_AttribNameOrWildcard(context, (AttribNameOrWildcard) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ATTRIBUTE_TEST:
				if(context == grammarAccess.getAttributeTestRule() ||
				   context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_AttributeTest(context, (AttributeTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.AXIS_STEP:
				if(context == grammarAccess.getAxisStepRule() ||
				   context == grammarAccess.getStepExprRule()) {
					sequence_AxisStep(context, (AxisStep) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.CAST_EXPR:
				if(context == grammarAccess.getCastExprRule()) {
					sequence_CastExpr(context, (CastExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.CASTABLE_EXPR:
				if(context == grammarAccess.getCastableExprRule()) {
					sequence_CastableExpr(context, (CastableExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.COMMENT_TEST:
				if(context == grammarAccess.getCommentTestRule() ||
				   context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_CommentTest(context, (CommentTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.COMPARISON_EXPR:
				if(context == grammarAccess.getComparisonExprRule()) {
					sequence_ComparisonExpr(context, (ComparisonExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.CONTEXT_ITEM_EXPR:
				if(context == grammarAccess.getContextItemExprRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_ContextItemExpr(context, (ContextItemExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.DECIMAL_LITERAL:
				if(context == grammarAccess.getDecimalLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumericLiteralRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_DecimalLiteral(context, (DecimalLiteral) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.DOCUMENT_TEST:
				if(context == grammarAccess.getDocumentTestRule() ||
				   context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_DocumentTest(context, (DocumentTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.DOUBLE_LITERAL:
				if(context == grammarAccess.getDoubleLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumericLiteralRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ELEMENT_NAME_OR_WILDCARD:
				if(context == grammarAccess.getElementNameOrWildcardRule()) {
					sequence_ElementNameOrWildcard(context, (ElementNameOrWildcard) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ELEMENT_TEST:
				if(context == grammarAccess.getElementTestRule() ||
				   context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_ElementTest(context, (ElementTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.FILTER_EXPR:
				if(context == grammarAccess.getFilterExprRule()) {
					sequence_FilterExpr(context, (FilterExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.FOR_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getForExprRule()) {
					sequence_ForExpr(context, (ForExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.FORWARD_AXIS:
				if(context == grammarAccess.getForwardAxisRule()) {
					sequence_ForwardAxis(context, (ForwardAxis) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.FORWARD_STEP:
				if(context == grammarAccess.getForwardStepRule()) {
					sequence_ForwardStep(context, (ForwardStep) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.IF_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getIfExprRule()) {
					sequence_IfExpr(context, (IfExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.INSTANCEOF_EXPR:
				if(context == grammarAccess.getInstanceofExprRule()) {
					sequence_InstanceofExpr(context, (InstanceofExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.INTEGER_LITERAL:
				if(context == grammarAccess.getIntegerLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumericLiteralRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.INTERSECT_EXCEPT_EXPR:
				if(context == grammarAccess.getIntersectExceptExprRule()) {
					sequence_IntersectExceptExpr(context, (IntersectExceptExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.ITEM_TYPE:
				if(context == grammarAccess.getItemTypeRule()) {
					sequence_ItemType(context, (ItemType) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.MULTIPLICATIVE_EXPR:
				if(context == grammarAccess.getMultiplicativeExprRule()) {
					sequence_MultiplicativeExpr(context, (MultiplicativeExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.OR_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getOrExprRule()) {
					sequence_OrExpr(context, (OrExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PI_TEST:
				if(context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getPITestRule()) {
					sequence_PITest(context, (PITest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PARENTHESIZED_EXPR:
				if(context == grammarAccess.getParenthesizedExprRule() ||
				   context == grammarAccess.getPrimaryExprRule()) {
					sequence_ParenthesizedExpr(context, (ParenthesizedExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PATH_EXPR:
				if(context == grammarAccess.getPathExprRule()) {
					sequence_PathExpr(context, (PathExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PREDICATE_LIST:
				if(context == grammarAccess.getPredicateListRule()) {
					sequence_PredicateList(context, (PredicateList) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.PREFIXED_NAME:
				if(context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getAttributeNameRule() ||
				   context == grammarAccess.getElementDeclarationRule() ||
				   context == grammarAccess.getElementNameRule() ||
				   context == grammarAccess.getNameTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getPrefixedNameRule() ||
				   context == grammarAccess.getQNameRule() ||
				   context == grammarAccess.getTypeNameRule() ||
				   context == grammarAccess.getVarNameRule()) {
					sequence_PrefixedName(context, (PrefixedName) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.QUANTIFIED_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getQuantifiedExprRule()) {
					sequence_QuantifiedExpr(context, (QuantifiedExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.RANGE_EXPR:
				if(context == grammarAccess.getRangeExprRule()) {
					sequence_RangeExpr(context, (RangeExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.RELATIVE_PATH_EXPR:
				if(context == grammarAccess.getRelativePathExprRule()) {
					sequence_RelativePathExpr(context, (RelativePathExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.REVERSE_AXIS:
				if(context == grammarAccess.getReverseAxisRule()) {
					sequence_ReverseAxis(context, (ReverseAxis) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.REVERSE_STEP:
				if(context == grammarAccess.getReverseStepRule()) {
					sequence_ReverseStep(context, (ReverseStep) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.SCHEMA_ATTRIBUTE_TEST:
				if(context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getSchemaAttributeTestRule()) {
					sequence_SchemaAttributeTest(context, (SchemaAttributeTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.SCHEMA_ELEMENT_TEST:
				if(context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getSchemaElementTestRule()) {
					sequence_SchemaElementTest(context, (SchemaElementTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.SEQUENCE_TYPE:
				if(context == grammarAccess.getSequenceTypeRule()) {
					sequence_SequenceType(context, (SequenceType) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.SIMPLE_FOR_CLAUSE:
				if(context == grammarAccess.getSimpleForClauseRule()) {
					sequence_SimpleForClause(context, (SimpleForClause) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.SINGLE_TYPE:
				if(context == grammarAccess.getSingleTypeRule()) {
					sequence_SingleType(context, (SingleType) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getPrimaryExprRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.TEXT_TEST:
				if(context == grammarAccess.getKindTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getTextTestRule()) {
					sequence_TextTest(context, (TextTest) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.TREAT_EXPR:
				if(context == grammarAccess.getTreatExprRule()) {
					sequence_TreatExpr(context, (TreatExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.UNARY_EXPR:
				if(context == grammarAccess.getUnaryExprRule()) {
					sequence_UnaryExpr(context, (UnaryExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.UNION_EXPR:
				if(context == grammarAccess.getUnionExprRule()) {
					sequence_UnionExpr(context, (UnionExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.UNPREFIXED_NAME:
				if(context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getAttributeNameRule() ||
				   context == grammarAccess.getElementDeclarationRule() ||
				   context == grammarAccess.getElementNameRule() ||
				   context == grammarAccess.getNameTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getQNameRule() ||
				   context == grammarAccess.getTypeNameRule() ||
				   context == grammarAccess.getUnprefixedNameRule() ||
				   context == grammarAccess.getVarNameRule()) {
					sequence_UnprefixedName(context, (UnprefixedName) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.VALUE_EXPR:
				if(context == grammarAccess.getValueExprRule()) {
					sequence_ValueExpr(context, (ValueExpr) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.VAR_REF:
				if(context == grammarAccess.getPrimaryExprRule() ||
				   context == grammarAccess.getVarRefRule()) {
					sequence_VarRef(context, (VarRef) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.WILDCARD:
				if(context == grammarAccess.getNameTestRule() ||
				   context == grammarAccess.getNodeTestRule() ||
				   context == grammarAccess.getWildcardRule()) {
					sequence_Wildcard(context, (Wildcard) semanticObject); 
					return; 
				}
				else break;
			case Xpath20Package.XPATH:
				if(context == grammarAccess.getXPathRule()) {
					sequence_XPath(context, (XPath) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (at?='@'? test=NodeTest)
	 */
	protected void sequence_AbbrevForwardStep(EObject context, AbbrevForwardStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (add+=MultiplicativeExpr (operator+=Additive add+=MultiplicativeExpr)*)
	 */
	protected void sequence_AdditiveExpr(EObject context, AdditiveExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (and+=ComparisonExpr and+=ComparisonExpr*)
	 */
	protected void sequence_AndExpr(EObject context, AndExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AnyKindTest}
	 */
	protected void sequence_AnyKindTest(EObject context, AnyKindTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributeName=AttributeName
	 */
	protected void sequence_AttribNameOrWildcard(EObject context, AttribNameOrWildcard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttribNameOrWildcardAccess().getAttributeNameAttributeNameParserRuleCall_1_0(), semanticObject.getAttributeName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((attributeNameOrWildcard=AttribNameOrWildcard typeName=TypeName?)?)
	 */
	protected void sequence_AttributeTest(EObject context, AttributeTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((reverseStep=ReverseStep | forwardStep=ForwardStep) predicate+=Predicate*)
	 */
	protected void sequence_AxisStep(EObject context, AxisStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cast=UnaryExpr castAs=SingleType?)
	 */
	protected void sequence_CastExpr(EObject context, CastExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cast=CastExpr castableAs=SingleType?)
	 */
	protected void sequence_CastableExpr(EObject context, CastableExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CommentTest}
	 */
	protected void sequence_CommentTest(EObject context, CommentTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operand1=RangeExpr (value=ValueComp | general=GeneralComp | (node=NodeComp range=RangeExpr))?)
	 */
	protected void sequence_ComparisonExpr(EObject context, ComparisonExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ContextItemExpr}
	 */
	protected void sequence_ContextItemExpr(EObject context, ContextItemExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DECIMAL
	 */
	protected void sequence_DecimalLiteral(EObject context, DecimalLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.DECIMAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.DECIMAL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elementTest=ElementTest | schemaElementTest=SchemaElementTest)?)
	 */
	protected void sequence_DocumentTest(EObject context, DocumentTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_DoubleLiteral(EObject context, DoubleLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.DOUBLE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.DOUBLE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elementName=ElementName
	 */
	protected void sequence_ElementNameOrWildcard(EObject context, ElementNameOrWildcard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementNameOrWildcardAccess().getElementNameElementNameParserRuleCall_1_0(), semanticObject.getElementName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elementNameOrWildcard=ElementNameOrWildcard (typeName=TypeName question?='?'?)?)?)
	 */
	protected void sequence_ElementTest(EObject context, ElementTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=ExprSingle expression+=ExprSingle*)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (filter=PrimaryExpr predicate+=Predicate*)
	 */
	protected void sequence_FilterExpr(EObject context, FilterExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (for=SimpleForClause return=ExprSingle)
	 */
	protected void sequence_ForExpr(EObject context, ForExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.FOR_EXPR__FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.FOR_EXPR__FOR));
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.FOR_EXPR__RETURN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.FOR_EXPR__RETURN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForExprAccess().getForSimpleForClauseParserRuleCall_0_0(), semanticObject.getFor());
		feeder.accept(grammarAccess.getForExprAccess().getReturnExprSingleParserRuleCall_2_0(), semanticObject.getReturn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     axis=ForwardAxisEnum
	 */
	protected void sequence_ForwardAxis(EObject context, ForwardAxis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.FORWARD_AXIS__AXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.FORWARD_AXIS__AXIS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForwardAxisAccess().getAxisForwardAxisEnumEnumRuleCall_0_0(), semanticObject.getAxis());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((axis=ForwardAxis test=NodeTest) | abbrev=AbbrevForwardStep)
	 */
	protected void sequence_ForwardStep(EObject context, ForwardStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=QName (parameter+=ExprSingle parameter+=ExprSingle*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=Expr then=ExprSingle else=ExprSingle)
	 */
	protected void sequence_IfExpr(EObject context, IfExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.IF_EXPR__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.IF_EXPR__IF));
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.IF_EXPR__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.IF_EXPR__THEN));
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.IF_EXPR__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.IF_EXPR__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfExprAccess().getIfExprParserRuleCall_2_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getIfExprAccess().getThenExprSingleParserRuleCall_5_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getIfExprAccess().getElseExprSingleParserRuleCall_7_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (treat=TreatExpr instanceOf=SequenceType?)
	 */
	protected void sequence_InstanceofExpr(EObject context, InstanceofExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerLiteral(EObject context, IntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.INTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (intersect+=InstanceofExpr (operator+=IntersectExcept intersect+=InstanceofExpr)*)
	 */
	protected void sequence_IntersectExceptExpr(EObject context, IntersectExceptExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((kindTest=KindTest | atomicType=AtomicType)?)
	 */
	protected void sequence_ItemType(EObject context, ItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiply+=UnionExpr (operator+=Multiplicative multiply+=UnionExpr)*)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, MultiplicativeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (or+=AndExpr or+=AndExpr*)
	 */
	protected void sequence_OrExpr(EObject context, OrExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=NCNAME | string=StringLiteral)?)
	 */
	protected void sequence_PITest(EObject context, PITest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expr?)
	 */
	protected void sequence_ParenthesizedExpr(EObject context, ParenthesizedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((separator='/' relativePath=RelativePathExpr?) | (separator='//' relativePath=RelativePathExpr) | relativePath=RelativePathExpr)
	 */
	protected void sequence_PathExpr(EObject context, PathExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (predicate+=Predicate*)
	 */
	protected void sequence_PredicateList(EObject context, PredicateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     predicate=Expr
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.PREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.PREDICATE__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAccess().getPredicateExprParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=Prefix localPart=LocalPart)
	 */
	protected void sequence_PrefixedName(EObject context, PrefixedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.QNAME__LOCAL_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.QNAME__LOCAL_PART));
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.PREFIXED_NAME__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.PREFIXED_NAME__PREFIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixedNameAccess().getPrefixPrefixParserRuleCall_0_0(), semanticObject.getPrefix());
		feeder.accept(grammarAccess.getPrefixedNameAccess().getLocalPartLocalPartParserRuleCall_2_0(), semanticObject.getLocalPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (quantifier='some' | quantifier='every') 
	 *         variable+=VarName 
	 *         expression+=ExprSingle 
	 *         (variable+=VarName expression+=ExprSingle)* 
	 *         satisfies=ExprSingle
	 *     )
	 */
	protected void sequence_QuantifiedExpr(EObject context, QuantifiedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (range=AdditiveExpr to=AdditiveExpr?)
	 */
	protected void sequence_RangeExpr(EObject context, RangeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (step+=StepExpr (separator+=Separator step+=StepExpr)*)
	 */
	protected void sequence_RelativePathExpr(EObject context, RelativePathExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     axis=ReverseAxisEnum
	 */
	protected void sequence_ReverseAxis(EObject context, ReverseAxis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.REVERSE_AXIS__AXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.REVERSE_AXIS__AXIS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReverseAxisAccess().getAxisReverseAxisEnumEnumRuleCall_0_0(), semanticObject.getAxis());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((axis=ReverseAxis test=NodeTest) | abbrev=AbbrevReverseStep)
	 */
	protected void sequence_ReverseStep(EObject context, ReverseStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributeDeclaration=AttributeDeclaration
	 */
	protected void sequence_SchemaAttributeTest(EObject context, SchemaAttributeTest semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemaAttributeTestAccess().getAttributeDeclarationAttributeDeclarationParserRuleCall_2_0(), semanticObject.getAttributeDeclaration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elementDeclaration=ElementDeclaration
	 */
	protected void sequence_SchemaElementTest(EObject context, SchemaElementTest semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemaElementTestAccess().getElementDeclarationElementDeclarationParserRuleCall_2_0(), semanticObject.getElementDeclaration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type=ItemType occurrence=OccurrenceIndicator?)?)
	 */
	protected void sequence_SequenceType(EObject context, SequenceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=VarName expression+=ExprSingle (variable+=VarName expression+=ExprSingle)*)
	 */
	protected void sequence_SimpleForClause(EObject context, SimpleForClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AtomicType question?='?'?)
	 */
	protected void sequence_SingleType(EObject context, SingleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {TextTest}
	 */
	protected void sequence_TextTest(EObject context, TextTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (castable=CastableExpr treatAs=SequenceType?)
	 */
	protected void sequence_TreatExpr(EObject context, TreatExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     unary=ValueExpr
	 */
	protected void sequence_UnaryExpr(EObject context, UnaryExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.UNARY_EXPR__UNARY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.UNARY_EXPR__UNARY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExprAccess().getUnaryValueExprParserRuleCall_0(), semanticObject.getUnary());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (union+=IntersectExceptExpr (operator+=Union union+=IntersectExceptExpr)*)
	 */
	protected void sequence_UnionExpr(EObject context, UnionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     localPart=LocalPart
	 */
	protected void sequence_UnprefixedName(EObject context, UnprefixedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.QNAME__LOCAL_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.QNAME__LOCAL_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnprefixedNameAccess().getLocalPartLocalPartParserRuleCall_0(), semanticObject.getLocalPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     path=PathExpr
	 */
	protected void sequence_ValueExpr(EObject context, ValueExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.VALUE_EXPR__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.VALUE_EXPR__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueExprAccess().getPathPathExprParserRuleCall_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     var=VarName
	 */
	protected void sequence_VarRef(EObject context, VarRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.VAR_REF__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.VAR_REF__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarRefAccess().getVarVarNameParserRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=NCNAME | any='*')
	 */
	protected void sequence_Wildcard(EObject context, Wildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressions=Expr
	 */
	protected void sequence_XPath(EObject context, XPath semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Xpath20Package.Literals.XPATH__EXPRESSIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Xpath20Package.Literals.XPATH__EXPRESSIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXPathAccess().getExpressionsExprParserRuleCall_0(), semanticObject.getExpressions());
		feeder.finish();
	}
}
