package org.w3.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.w3.services.Xpath20GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXpath20Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DECIMAL", "RULE_DOUBLE", "RULE_STRING", "RULE_NCNAME", "RULE_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "','", "'return'", "'for'", "'$'", "'in'", "'some'", "'every'", "'satisfies'", "'if'", "'('", "')'", "'then'", "'else'", "'or'", "'and'", "'to'", "'instance'", "'of'", "'treat'", "'as'", "'empty-sequence'", "'item'", "'castable'", "'cast'", "'?'", "'['", "']'", "'::'", "'..'", "'@'", "'.'", "'node'", "'document-node'", "'text'", "'comment'", "'processing-instruction'", "'schema-attribute'", "'schema-element'", "'*'", "'elementx'", "'attributex'", "'/'", "'//'", "'intersect'", "'except'", "'union'", "'|'", "'+'", "'-'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'eq'", "'ne'", "'lt'", "'le'", "'gt'", "'ge'", "'is'", "'<<'", "'>>'", "'parent'", "'ancestor'", "'preceding-sibling'", "'preceding'", "'ancestor-or-self'", "'child'", "'descendant'", "'self'", "'descendant-or-self'", "'following-sibling'", "'following'", "'namespace'", "'div'", "'idiv'", "'mod'"
    };
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NCNAME=8;
    public static final int RULE_DECIMAL=5;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_COMMENT=9;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=7;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalXpath20Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXpath20Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXpath20Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g"; }



     	private Xpath20GrammarAccess grammarAccess;
     	
        public InternalXpath20Parser(TokenStream input, Xpath20GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XPath";	
       	}
       	
       	@Override
       	protected Xpath20GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXPath"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:68:1: entryRuleXPath returns [EObject current=null] : iv_ruleXPath= ruleXPath EOF ;
    public final EObject entryRuleXPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPath = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:69:2: (iv_ruleXPath= ruleXPath EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:70:2: iv_ruleXPath= ruleXPath EOF
            {
             newCompositeNode(grammarAccess.getXPathRule()); 
            pushFollow(FOLLOW_ruleXPath_in_entryRuleXPath75);
            iv_ruleXPath=ruleXPath();

            state._fsp--;

             current =iv_ruleXPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPath85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPath"


    // $ANTLR start "ruleXPath"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:77:1: ruleXPath returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpr ) ) ;
    public final EObject ruleXPath() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:80:28: ( ( (lv_expressions_0_0= ruleExpr ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:81:1: ( (lv_expressions_0_0= ruleExpr ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:81:1: ( (lv_expressions_0_0= ruleExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:82:1: (lv_expressions_0_0= ruleExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:82:1: (lv_expressions_0_0= ruleExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:83:3: lv_expressions_0_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getXPathAccess().getExpressionsExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleXPath130);
            lv_expressions_0_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXPathRule());
            	        }
                   		set(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPath"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:107:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:108:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:109:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral165);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:116:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:119:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:120:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:120:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:121:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:121:1: (lv_value_0_0= RULE_INT )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:122:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral216); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:146:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:147:2: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:148:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
            {
             newCompositeNode(grammarAccess.getDecimalLiteralRule()); 
            pushFollow(FOLLOW_ruleDecimalLiteral_in_entryRuleDecimalLiteral256);
            iv_ruleDecimalLiteral=ruleDecimalLiteral();

            state._fsp--;

             current =iv_ruleDecimalLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalLiteral266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:155:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:158:28: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:159:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:159:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:160:1: (lv_value_0_0= RULE_DECIMAL )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:160:1: (lv_value_0_0= RULE_DECIMAL )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:161:3: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteral307); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecimalLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DECIMAL");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:185:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:186:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:187:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral347);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:194:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:197:28: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:198:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:198:1: ( (lv_value_0_0= RULE_DOUBLE ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:199:1: (lv_value_0_0= RULE_DOUBLE )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:199:1: (lv_value_0_0= RULE_DOUBLE )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:200:3: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleDoubleLiteral398); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DOUBLE");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:224:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:225:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:226:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral438);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:233:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:236:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:237:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:237:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:238:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:238:1: (lv_value_0_0= RULE_STRING )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:239:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral489); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleQName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:263:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:264:2: (iv_ruleQName= ruleQName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:265:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName529);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:272:1: ruleQName returns [EObject current=null] : (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedName_0 = null;

        EObject this_UnprefixedName_1 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:275:28: ( (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:276:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:276:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NCNAME) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=16 && LA1_1<=17)||LA1_1==20||LA1_1==23||(LA1_1>=25 && LA1_1<=26)||(LA1_1>=28 && LA1_1<=32)||LA1_1==34||(LA1_1>=38 && LA1_1<=42)||(LA1_1>=57 && LA1_1<=79)||(LA1_1>=92 && LA1_1<=94)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==15) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:277:5: this_PrefixedName_0= rulePrefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getPrefixedNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrefixedName_in_ruleQName586);
                    this_PrefixedName_0=rulePrefixedName();

                    state._fsp--;

                     
                            current = this_PrefixedName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:287:5: this_UnprefixedName_1= ruleUnprefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getUnprefixedNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnprefixedName_in_ruleQName613);
                    this_UnprefixedName_1=ruleUnprefixedName();

                    state._fsp--;

                     
                            current = this_UnprefixedName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRulePrefixedName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:303:1: entryRulePrefixedName returns [EObject current=null] : iv_rulePrefixedName= rulePrefixedName EOF ;
    public final EObject entryRulePrefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:304:2: (iv_rulePrefixedName= rulePrefixedName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:305:2: iv_rulePrefixedName= rulePrefixedName EOF
            {
             newCompositeNode(grammarAccess.getPrefixedNameRule()); 
            pushFollow(FOLLOW_rulePrefixedName_in_entryRulePrefixedName648);
            iv_rulePrefixedName=rulePrefixedName();

            state._fsp--;

             current =iv_rulePrefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixedName658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedName"


    // $ANTLR start "rulePrefixedName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:312:1: rulePrefixedName returns [EObject current=null] : ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleLocalPart ) ) ) ;
    public final EObject rulePrefixedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_prefix_0_0 = null;

        AntlrDatatypeRuleToken lv_localPart_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:315:28: ( ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleLocalPart ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:316:1: ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleLocalPart ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:316:1: ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleLocalPart ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:316:2: ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleLocalPart ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:316:2: ( (lv_prefix_0_0= rulePrefix ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:317:1: (lv_prefix_0_0= rulePrefix )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:317:1: (lv_prefix_0_0= rulePrefix )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:318:3: lv_prefix_0_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getPrefixPrefixParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_rulePrefixedName704);
            lv_prefix_0_0=rulePrefix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"prefix",
                    		lv_prefix_0_0, 
                    		"Prefix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePrefixedName716); 

                	newLeafNode(otherlv_1, grammarAccess.getPrefixedNameAccess().getColonKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:338:1: ( (lv_localPart_2_0= ruleLocalPart ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:339:1: (lv_localPart_2_0= ruleLocalPart )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:339:1: (lv_localPart_2_0= ruleLocalPart )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:340:3: lv_localPart_2_0= ruleLocalPart
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getLocalPartLocalPartParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLocalPart_in_rulePrefixedName737);
            lv_localPart_2_0=ruleLocalPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"localPart",
                    		lv_localPart_2_0, 
                    		"LocalPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedName"


    // $ANTLR start "entryRuleUnprefixedName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:364:1: entryRuleUnprefixedName returns [EObject current=null] : iv_ruleUnprefixedName= ruleUnprefixedName EOF ;
    public final EObject entryRuleUnprefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnprefixedName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:365:2: (iv_ruleUnprefixedName= ruleUnprefixedName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:366:2: iv_ruleUnprefixedName= ruleUnprefixedName EOF
            {
             newCompositeNode(grammarAccess.getUnprefixedNameRule()); 
            pushFollow(FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName773);
            iv_ruleUnprefixedName=ruleUnprefixedName();

            state._fsp--;

             current =iv_ruleUnprefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnprefixedName783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnprefixedName"


    // $ANTLR start "ruleUnprefixedName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:373:1: ruleUnprefixedName returns [EObject current=null] : ( (lv_localPart_0_0= ruleLocalPart ) ) ;
    public final EObject ruleUnprefixedName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_localPart_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:376:28: ( ( (lv_localPart_0_0= ruleLocalPart ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:377:1: ( (lv_localPart_0_0= ruleLocalPart ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:377:1: ( (lv_localPart_0_0= ruleLocalPart ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:378:1: (lv_localPart_0_0= ruleLocalPart )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:378:1: (lv_localPart_0_0= ruleLocalPart )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:379:3: lv_localPart_0_0= ruleLocalPart
            {
             
            	        newCompositeNode(grammarAccess.getUnprefixedNameAccess().getLocalPartLocalPartParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLocalPart_in_ruleUnprefixedName828);
            lv_localPart_0_0=ruleLocalPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnprefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"localPart",
                    		lv_localPart_0_0, 
                    		"LocalPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnprefixedName"


    // $ANTLR start "entryRulePrefix"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:403:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:404:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:405:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix864);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:412:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NCNAME_0= RULE_NCNAME ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NCNAME_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:415:28: (this_NCNAME_0= RULE_NCNAME )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:416:5: this_NCNAME_0= RULE_NCNAME
            {
            this_NCNAME_0=(Token)match(input,RULE_NCNAME,FOLLOW_RULE_NCNAME_in_rulePrefix914); 

            		current.merge(this_NCNAME_0);
                
             
                newLeafNode(this_NCNAME_0, grammarAccess.getPrefixAccess().getNCNAMETerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleLocalPart"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:431:1: entryRuleLocalPart returns [String current=null] : iv_ruleLocalPart= ruleLocalPart EOF ;
    public final String entryRuleLocalPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocalPart = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:432:2: (iv_ruleLocalPart= ruleLocalPart EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:433:2: iv_ruleLocalPart= ruleLocalPart EOF
            {
             newCompositeNode(grammarAccess.getLocalPartRule()); 
            pushFollow(FOLLOW_ruleLocalPart_in_entryRuleLocalPart959);
            iv_ruleLocalPart=ruleLocalPart();

            state._fsp--;

             current =iv_ruleLocalPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalPart970); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalPart"


    // $ANTLR start "ruleLocalPart"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:440:1: ruleLocalPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NCNAME_0= RULE_NCNAME ;
    public final AntlrDatatypeRuleToken ruleLocalPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NCNAME_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:443:28: (this_NCNAME_0= RULE_NCNAME )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:444:5: this_NCNAME_0= RULE_NCNAME
            {
            this_NCNAME_0=(Token)match(input,RULE_NCNAME,FOLLOW_RULE_NCNAME_in_ruleLocalPart1009); 

            		current.merge(this_NCNAME_0);
                
             
                newLeafNode(this_NCNAME_0, grammarAccess.getLocalPartAccess().getNCNAMETerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalPart"


    // $ANTLR start "entryRuleExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:459:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:460:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:461:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1053);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1063); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:468:1: ruleExpr returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:471:28: ( ( ( (lv_expression_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:472:1: ( ( (lv_expression_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:472:1: ( ( (lv_expression_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:472:2: ( (lv_expression_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:472:2: ( (lv_expression_0_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:473:1: (lv_expression_0_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:473:1: (lv_expression_0_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:474:3: lv_expression_0_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getExpressionExprSingleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr1109);
            lv_expression_0_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:490:2: (otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:490:4: otherlv_1= ',' ( (lv_expression_2_0= ruleExprSingle ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExpr1122); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:494:1: ( (lv_expression_2_0= ruleExprSingle ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:495:1: (lv_expression_2_0= ruleExprSingle )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:495:1: (lv_expression_2_0= ruleExprSingle )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:496:3: lv_expression_2_0= ruleExprSingle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getExpressionExprSingleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr1143);
            	    lv_expression_2_0=ruleExprSingle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expression",
            	            		lv_expression_2_0, 
            	            		"ExprSingle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSingle"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:520:1: entryRuleExprSingle returns [EObject current=null] : iv_ruleExprSingle= ruleExprSingle EOF ;
    public final EObject entryRuleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSingle = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:521:2: (iv_ruleExprSingle= ruleExprSingle EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:522:2: iv_ruleExprSingle= ruleExprSingle EOF
            {
             newCompositeNode(grammarAccess.getExprSingleRule()); 
            pushFollow(FOLLOW_ruleExprSingle_in_entryRuleExprSingle1181);
            iv_ruleExprSingle=ruleExprSingle();

            state._fsp--;

             current =iv_ruleExprSingle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSingle1191); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSingle"


    // $ANTLR start "ruleExprSingle"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:529:1: ruleExprSingle returns [EObject current=null] : (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) ;
    public final EObject ruleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject this_ForExpr_0 = null;

        EObject this_QuantifiedExpr_1 = null;

        EObject this_IfExpr_2 = null;

        EObject this_OrExpr_3 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:532:28: ( (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:533:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:533:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 21:
            case 22:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case RULE_NCNAME:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:534:5: this_ForExpr_0= ruleForExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getForExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForExpr_in_ruleExprSingle1238);
                    this_ForExpr_0=ruleForExpr();

                    state._fsp--;

                     
                            current = this_ForExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:544:5: this_QuantifiedExpr_1= ruleQuantifiedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getQuantifiedExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle1265);
                    this_QuantifiedExpr_1=ruleQuantifiedExpr();

                    state._fsp--;

                     
                            current = this_QuantifiedExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:554:5: this_IfExpr_2= ruleIfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getIfExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfExpr_in_ruleExprSingle1292);
                    this_IfExpr_2=ruleIfExpr();

                    state._fsp--;

                     
                            current = this_IfExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:564:5: this_OrExpr_3= ruleOrExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getOrExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrExpr_in_ruleExprSingle1319);
                    this_OrExpr_3=ruleOrExpr();

                    state._fsp--;

                     
                            current = this_OrExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSingle"


    // $ANTLR start "entryRuleForExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:580:1: entryRuleForExpr returns [EObject current=null] : iv_ruleForExpr= ruleForExpr EOF ;
    public final EObject entryRuleForExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:581:2: (iv_ruleForExpr= ruleForExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:582:2: iv_ruleForExpr= ruleForExpr EOF
            {
             newCompositeNode(grammarAccess.getForExprRule()); 
            pushFollow(FOLLOW_ruleForExpr_in_entryRuleForExpr1354);
            iv_ruleForExpr=ruleForExpr();

            state._fsp--;

             current =iv_ruleForExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForExpr1364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForExpr"


    // $ANTLR start "ruleForExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:589:1: ruleForExpr returns [EObject current=null] : ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) ;
    public final EObject ruleForExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_for_0_0 = null;

        EObject lv_return_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:592:28: ( ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:593:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:593:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:593:2: ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:593:2: ( (lv_for_0_0= ruleSimpleForClause ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:594:1: (lv_for_0_0= ruleSimpleForClause )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:594:1: (lv_for_0_0= ruleSimpleForClause )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:595:3: lv_for_0_0= ruleSimpleForClause
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getForSimpleForClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleForClause_in_ruleForExpr1410);
            lv_for_0_0=ruleSimpleForClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExprRule());
            	        }
                   		set(
                   			current, 
                   			"for",
                    		lv_for_0_0, 
                    		"SimpleForClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleForExpr1422); 

                	newLeafNode(otherlv_1, grammarAccess.getForExprAccess().getReturnKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:615:1: ( (lv_return_2_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:616:1: (lv_return_2_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:616:1: (lv_return_2_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:617:3: lv_return_2_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getReturnExprSingleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleForExpr1443);
            lv_return_2_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExprRule());
            	        }
                   		set(
                   			current, 
                   			"return",
                    		lv_return_2_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForExpr"


    // $ANTLR start "entryRuleSimpleForClause"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:641:1: entryRuleSimpleForClause returns [EObject current=null] : iv_ruleSimpleForClause= ruleSimpleForClause EOF ;
    public final EObject entryRuleSimpleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleForClause = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:642:2: (iv_ruleSimpleForClause= ruleSimpleForClause EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:643:2: iv_ruleSimpleForClause= ruleSimpleForClause EOF
            {
             newCompositeNode(grammarAccess.getSimpleForClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause1479);
            iv_ruleSimpleForClause=ruleSimpleForClause();

            state._fsp--;

             current =iv_ruleSimpleForClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleForClause1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleForClause"


    // $ANTLR start "ruleSimpleForClause"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:650:1: ruleSimpleForClause returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* ) ;
    public final EObject ruleSimpleForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_variable_7_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:653:28: ( (otherlv_0= 'for' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:654:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:654:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:654:3: otherlv_0= 'for' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSimpleForClause1526); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleForClauseAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSimpleForClause1538); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleForClauseAccess().getDollarSignKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:662:1: ( (lv_variable_2_0= ruleVarName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:663:1: (lv_variable_2_0= ruleVarName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:663:1: (lv_variable_2_0= ruleVarName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:664:3: lv_variable_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleSimpleForClause1559);
            lv_variable_2_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSimpleForClause1571); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleForClauseAccess().getInKeyword_3());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:684:1: ( (lv_expression_4_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:685:1: (lv_expression_4_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:685:1: (lv_expression_4_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:686:3: lv_expression_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getExpressionExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleSimpleForClause1592);
            lv_expression_4_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:702:2: (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:702:4: otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSimpleForClause1605); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSimpleForClauseAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleSimpleForClause1617); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSimpleForClauseAccess().getDollarSignKeyword_5_1());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:710:1: ( (lv_variable_7_0= ruleVarName ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:711:1: (lv_variable_7_0= ruleVarName )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:711:1: (lv_variable_7_0= ruleVarName )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:712:3: lv_variable_7_0= ruleVarName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getVariableVarNameParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarName_in_ruleSimpleForClause1638);
            	    lv_variable_7_0=ruleVarName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_7_0, 
            	            		"VarName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSimpleForClause1650); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSimpleForClauseAccess().getInKeyword_5_3());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:732:1: ( (lv_expression_9_0= ruleExprSingle ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:733:1: (lv_expression_9_0= ruleExprSingle )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:733:1: (lv_expression_9_0= ruleExprSingle )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:734:3: lv_expression_9_0= ruleExprSingle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getExpressionExprSingleParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprSingle_in_ruleSimpleForClause1671);
            	    lv_expression_9_0=ruleExprSingle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expression",
            	            		lv_expression_9_0, 
            	            		"ExprSingle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleForClause"


    // $ANTLR start "entryRuleVarName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:758:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:759:2: (iv_ruleVarName= ruleVarName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:760:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName1709);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName1719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:767:1: ruleVarName returns [EObject current=null] : this_QName_0= ruleQName ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:770:28: (this_QName_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:772:5: this_QName_0= ruleQName
            {
             
                    newCompositeNode(grammarAccess.getVarNameAccess().getQNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleVarName1765);
            this_QName_0=ruleQName();

            state._fsp--;

             
                    current = this_QName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleQuantifiedExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:788:1: entryRuleQuantifiedExpr returns [EObject current=null] : iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF ;
    public final EObject entryRuleQuantifiedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:789:2: (iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:790:2: iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedExprRule()); 
            pushFollow(FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr1799);
            iv_ruleQuantifiedExpr=ruleQuantifiedExpr();

            state._fsp--;

             current =iv_ruleQuantifiedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedExpr1809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifiedExpr"


    // $ANTLR start "ruleQuantifiedExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:797:1: ruleQuantifiedExpr returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) ) otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* otherlv_10= 'satisfies' ( (lv_satisfies_11_0= ruleExprSingle ) ) ) ;
    public final EObject ruleQuantifiedExpr() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_1=null;
        Token lv_quantifier_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_variable_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_satisfies_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:800:28: ( ( ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) ) otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* otherlv_10= 'satisfies' ( (lv_satisfies_11_0= ruleExprSingle ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:801:1: ( ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) ) otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* otherlv_10= 'satisfies' ( (lv_satisfies_11_0= ruleExprSingle ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:801:1: ( ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) ) otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* otherlv_10= 'satisfies' ( (lv_satisfies_11_0= ruleExprSingle ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:801:2: ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) ) otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExprSingle ) ) (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )* otherlv_10= 'satisfies' ( (lv_satisfies_11_0= ruleExprSingle ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:801:2: ( ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:802:1: ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:802:1: ( (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:803:1: (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:803:1: (lv_quantifier_0_1= 'some' | lv_quantifier_0_2= 'every' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:804:3: lv_quantifier_0_1= 'some'
                    {
                    lv_quantifier_0_1=(Token)match(input,21,FOLLOW_21_in_ruleQuantifiedExpr1854); 

                            newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifiedExprAccess().getQuantifierSomeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifiedExprRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:816:8: lv_quantifier_0_2= 'every'
                    {
                    lv_quantifier_0_2=(Token)match(input,22,FOLLOW_22_in_ruleQuantifiedExpr1883); 

                            newLeafNode(lv_quantifier_0_2, grammarAccess.getQuantifiedExprAccess().getQuantifierEveryKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifiedExprRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleQuantifiedExpr1911); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifiedExprAccess().getDollarSignKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:835:1: ( (lv_variable_2_0= ruleVarName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:836:1: (lv_variable_2_0= ruleVarName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:836:1: (lv_variable_2_0= ruleVarName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:837:3: lv_variable_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleQuantifiedExpr1932);
            lv_variable_2_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleQuantifiedExpr1944); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantifiedExprAccess().getInKeyword_3());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:857:1: ( (lv_expression_4_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:858:1: (lv_expression_4_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:858:1: (lv_expression_4_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:859:3: lv_expression_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getExpressionExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1965);
            lv_expression_4_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:875:2: (otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:875:4: otherlv_5= ',' otherlv_6= '$' ( (lv_variable_7_0= ruleVarName ) ) otherlv_8= 'in' ( (lv_expression_9_0= ruleExprSingle ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleQuantifiedExpr1978); 

            	        	newLeafNode(otherlv_5, grammarAccess.getQuantifiedExprAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleQuantifiedExpr1990); 

            	        	newLeafNode(otherlv_6, grammarAccess.getQuantifiedExprAccess().getDollarSignKeyword_5_1());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:883:1: ( (lv_variable_7_0= ruleVarName ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:884:1: (lv_variable_7_0= ruleVarName )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:884:1: (lv_variable_7_0= ruleVarName )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:885:3: lv_variable_7_0= ruleVarName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getVariableVarNameParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarName_in_ruleQuantifiedExpr2011);
            	    lv_variable_7_0=ruleVarName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_7_0, 
            	            		"VarName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleQuantifiedExpr2023); 

            	        	newLeafNode(otherlv_8, grammarAccess.getQuantifiedExprAccess().getInKeyword_5_3());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:905:1: ( (lv_expression_9_0= ruleExprSingle ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:906:1: (lv_expression_9_0= ruleExprSingle )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:906:1: (lv_expression_9_0= ruleExprSingle )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:907:3: lv_expression_9_0= ruleExprSingle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getExpressionExprSingleParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr2044);
            	    lv_expression_9_0=ruleExprSingle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expression",
            	            		lv_expression_9_0, 
            	            		"ExprSingle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleQuantifiedExpr2058); 

                	newLeafNode(otherlv_10, grammarAccess.getQuantifiedExprAccess().getSatisfiesKeyword_6());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:927:1: ( (lv_satisfies_11_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:928:1: (lv_satisfies_11_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:928:1: (lv_satisfies_11_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:929:3: lv_satisfies_11_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getSatisfiesExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr2079);
            lv_satisfies_11_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		set(
                   			current, 
                   			"satisfies",
                    		lv_satisfies_11_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifiedExpr"


    // $ANTLR start "entryRuleIfExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:953:1: entryRuleIfExpr returns [EObject current=null] : iv_ruleIfExpr= ruleIfExpr EOF ;
    public final EObject entryRuleIfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:954:2: (iv_ruleIfExpr= ruleIfExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:955:2: iv_ruleIfExpr= ruleIfExpr EOF
            {
             newCompositeNode(grammarAccess.getIfExprRule()); 
            pushFollow(FOLLOW_ruleIfExpr_in_entryRuleIfExpr2115);
            iv_ruleIfExpr=ruleIfExpr();

            state._fsp--;

             current =iv_ruleIfExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpr2125); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpr"


    // $ANTLR start "ruleIfExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:962:1: ruleIfExpr returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) ;
    public final EObject ruleIfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:965:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:966:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:966:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:966:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIfExpr2162); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExprAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleIfExpr2174); 

                	newLeafNode(otherlv_1, grammarAccess.getIfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:974:1: ( (lv_if_2_0= ruleExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:975:1: (lv_if_2_0= ruleExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:975:1: (lv_if_2_0= ruleExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:976:3: lv_if_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getIfExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfExpr2195);
            lv_if_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"if",
                    		lv_if_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleIfExpr2207); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExprAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleIfExpr2219); 

                	newLeafNode(otherlv_4, grammarAccess.getIfExprAccess().getThenKeyword_4());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1000:1: ( (lv_then_5_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1001:1: (lv_then_5_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1001:1: (lv_then_5_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1002:3: lv_then_5_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getThenExprSingleParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr2240);
            lv_then_5_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"then",
                    		lv_then_5_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleIfExpr2252); 

                	newLeafNode(otherlv_6, grammarAccess.getIfExprAccess().getElseKeyword_6());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1022:1: ( (lv_else_7_0= ruleExprSingle ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1023:1: (lv_else_7_0= ruleExprSingle )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1023:1: (lv_else_7_0= ruleExprSingle )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1024:3: lv_else_7_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getElseExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr2273);
            lv_else_7_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"else",
                    		lv_else_7_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1048:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1049:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1050:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr2309);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr2319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1057:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_or_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_or_0_0 = null;

        EObject lv_or_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1060:28: ( ( ( (lv_or_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1061:1: ( ( (lv_or_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1061:1: ( ( (lv_or_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1061:2: ( (lv_or_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1061:2: ( (lv_or_0_0= ruleAndExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1062:1: (lv_or_0_0= ruleAndExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1062:1: (lv_or_0_0= ruleAndExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1063:3: lv_or_0_0= ruleAndExpr
            {
             
            	        newCompositeNode(grammarAccess.getOrExprAccess().getOrAndExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr2365);
            lv_or_0_0=ruleAndExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	        }
                   		add(
                   			current, 
                   			"or",
                    		lv_or_0_0, 
                    		"AndExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1079:2: (otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1079:4: otherlv_1= 'or' ( (lv_or_2_0= ruleAndExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleOrExpr2378); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOrExprAccess().getOrKeyword_1_0());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1083:1: ( (lv_or_2_0= ruleAndExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1084:1: (lv_or_2_0= ruleAndExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1084:1: (lv_or_2_0= ruleAndExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1085:3: lv_or_2_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getOrAndExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr2399);
            	    lv_or_2_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"or",
            	            		lv_or_2_0, 
            	            		"AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1109:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1110:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1111:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr2437);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr2447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1118:1: ruleAndExpr returns [EObject current=null] : ( ( (lv_and_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_and_0_0 = null;

        EObject lv_and_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1121:28: ( ( ( (lv_and_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1122:1: ( ( (lv_and_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1122:1: ( ( (lv_and_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1122:2: ( (lv_and_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1122:2: ( (lv_and_0_0= ruleComparisonExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1123:1: (lv_and_0_0= ruleComparisonExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1123:1: (lv_and_0_0= ruleComparisonExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1124:3: lv_and_0_0= ruleComparisonExpr
            {
             
            	        newCompositeNode(grammarAccess.getAndExprAccess().getAndComparisonExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr2493);
            lv_and_0_0=ruleComparisonExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	        }
                   		add(
                   			current, 
                   			"and",
                    		lv_and_0_0, 
                    		"ComparisonExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1140:2: (otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1140:4: otherlv_1= 'and' ( (lv_and_2_0= ruleComparisonExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAndExpr2506); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExprAccess().getAndKeyword_1_0());
            	        
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1144:1: ( (lv_and_2_0= ruleComparisonExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1145:1: (lv_and_2_0= ruleComparisonExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1145:1: (lv_and_2_0= ruleComparisonExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1146:3: lv_and_2_0= ruleComparisonExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getAndComparisonExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr2527);
            	    lv_and_2_0=ruleComparisonExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"and",
            	            		lv_and_2_0, 
            	            		"ComparisonExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleComparisonExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1170:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1171:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1172:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr2565);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpr2575); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpr"


    // $ANTLR start "ruleComparisonExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1179:1: ruleComparisonExpr returns [EObject current=null] : ( ( (lv_operand1_0_0= ruleRangeExpr ) ) ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )? ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_operand1_0_0 = null;

        Enumerator lv_value_1_0 = null;

        Enumerator lv_general_2_0 = null;

        Enumerator lv_node_3_0 = null;

        EObject lv_range_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1182:28: ( ( ( (lv_operand1_0_0= ruleRangeExpr ) ) ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1183:1: ( ( (lv_operand1_0_0= ruleRangeExpr ) ) ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1183:1: ( ( (lv_operand1_0_0= ruleRangeExpr ) ) ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1183:2: ( (lv_operand1_0_0= ruleRangeExpr ) ) ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1183:2: ( (lv_operand1_0_0= ruleRangeExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1184:1: (lv_operand1_0_0= ruleRangeExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1184:1: (lv_operand1_0_0= ruleRangeExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1185:3: lv_operand1_0_0= ruleRangeExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOperand1RangeExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr2621);
            lv_operand1_0_0=ruleRangeExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"operand1",
                    		lv_operand1_0_0, 
                    		"RangeExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1201:2: ( ( (lv_value_1_0= ruleValueComp ) ) | ( (lv_general_2_0= ruleGeneralComp ) ) | ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) ) )?
            int alt9=4;
            switch ( input.LA(1) ) {
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt9=1;
                    }
                    break;
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    {
                    alt9=2;
                    }
                    break;
                case 77:
                case 78:
                case 79:
                    {
                    alt9=3;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1201:3: ( (lv_value_1_0= ruleValueComp ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1201:3: ( (lv_value_1_0= ruleValueComp ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1202:1: (lv_value_1_0= ruleValueComp )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1202:1: (lv_value_1_0= ruleValueComp )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1203:3: lv_value_1_0= ruleValueComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getValueValueCompEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueComp_in_ruleComparisonExpr2643);
                    lv_value_1_0=ruleValueComp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"ValueComp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1220:6: ( (lv_general_2_0= ruleGeneralComp ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1220:6: ( (lv_general_2_0= ruleGeneralComp ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1221:1: (lv_general_2_0= ruleGeneralComp )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1221:1: (lv_general_2_0= ruleGeneralComp )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1222:3: lv_general_2_0= ruleGeneralComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getGeneralGeneralCompEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGeneralComp_in_ruleComparisonExpr2670);
                    lv_general_2_0=ruleGeneralComp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"general",
                            		lv_general_2_0, 
                            		"GeneralComp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1239:6: ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1239:6: ( ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1239:7: ( (lv_node_3_0= ruleNodeComp ) ) ( (lv_range_4_0= ruleRangeExpr ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1239:7: ( (lv_node_3_0= ruleNodeComp ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1240:1: (lv_node_3_0= ruleNodeComp )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1240:1: (lv_node_3_0= ruleNodeComp )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1241:3: lv_node_3_0= ruleNodeComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getNodeNodeCompEnumRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeComp_in_ruleComparisonExpr2698);
                    lv_node_3_0=ruleNodeComp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"node",
                            		lv_node_3_0, 
                            		"NodeComp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1257:2: ( (lv_range_4_0= ruleRangeExpr ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1258:1: (lv_range_4_0= ruleRangeExpr )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1258:1: (lv_range_4_0= ruleRangeExpr )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1259:3: lv_range_4_0= ruleRangeExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRangeRangeExprParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr2719);
                    lv_range_4_0=ruleRangeExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"range",
                            		lv_range_4_0, 
                            		"RangeExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpr"


    // $ANTLR start "entryRuleRangeExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1283:1: entryRuleRangeExpr returns [EObject current=null] : iv_ruleRangeExpr= ruleRangeExpr EOF ;
    public final EObject entryRuleRangeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1284:2: (iv_ruleRangeExpr= ruleRangeExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1285:2: iv_ruleRangeExpr= ruleRangeExpr EOF
            {
             newCompositeNode(grammarAccess.getRangeExprRule()); 
            pushFollow(FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr2758);
            iv_ruleRangeExpr=ruleRangeExpr();

            state._fsp--;

             current =iv_ruleRangeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeExpr2768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeExpr"


    // $ANTLR start "ruleRangeExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1292:1: ruleRangeExpr returns [EObject current=null] : ( ( (lv_range_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) ;
    public final EObject ruleRangeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_range_0_0 = null;

        EObject lv_to_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1295:28: ( ( ( (lv_range_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1296:1: ( ( (lv_range_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1296:1: ( ( (lv_range_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1296:2: ( (lv_range_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1296:2: ( (lv_range_0_0= ruleAdditiveExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1297:1: (lv_range_0_0= ruleAdditiveExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1297:1: (lv_range_0_0= ruleAdditiveExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1298:3: lv_range_0_0= ruleAdditiveExpr
            {
             
            	        newCompositeNode(grammarAccess.getRangeExprAccess().getRangeAdditiveExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr2814);
            lv_range_0_0=ruleAdditiveExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeExprRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_0_0, 
                    		"AdditiveExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1314:2: (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1314:4: otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleRangeExpr2827); 

                        	newLeafNode(otherlv_1, grammarAccess.getRangeExprAccess().getToKeyword_1_0());
                        
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1318:1: ( (lv_to_2_0= ruleAdditiveExpr ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1319:1: (lv_to_2_0= ruleAdditiveExpr )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1319:1: (lv_to_2_0= ruleAdditiveExpr )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1320:3: lv_to_2_0= ruleAdditiveExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeExprAccess().getToAdditiveExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr2848);
                    lv_to_2_0=ruleAdditiveExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRangeExprRule());
                    	        }
                           		set(
                           			current, 
                           			"to",
                            		lv_to_2_0, 
                            		"AdditiveExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1344:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1345:2: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1346:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExprRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr2886);
            iv_ruleAdditiveExpr=ruleAdditiveExpr();

            state._fsp--;

             current =iv_ruleAdditiveExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpr2896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1353:1: ruleAdditiveExpr returns [EObject current=null] : ( ( (lv_add_0_0= ruleMultiplicativeExpr ) ) ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_add_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_add_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1356:28: ( ( ( (lv_add_0_0= ruleMultiplicativeExpr ) ) ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1357:1: ( ( (lv_add_0_0= ruleMultiplicativeExpr ) ) ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1357:1: ( ( (lv_add_0_0= ruleMultiplicativeExpr ) ) ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1357:2: ( (lv_add_0_0= ruleMultiplicativeExpr ) ) ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1357:2: ( (lv_add_0_0= ruleMultiplicativeExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1358:1: (lv_add_0_0= ruleMultiplicativeExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1358:1: (lv_add_0_0= ruleMultiplicativeExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1359:3: lv_add_0_0= ruleMultiplicativeExpr
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getAddMultiplicativeExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2942);
            lv_add_0_0=ruleMultiplicativeExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	        }
                   		add(
                   			current, 
                   			"add",
                    		lv_add_0_0, 
                    		"MultiplicativeExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1375:2: ( ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=63 && LA11_0<=64)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1375:3: ( (lv_operator_1_0= ruleAdditive ) ) ( (lv_add_2_0= ruleMultiplicativeExpr ) )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1375:3: ( (lv_operator_1_0= ruleAdditive ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1376:1: (lv_operator_1_0= ruleAdditive )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1376:1: (lv_operator_1_0= ruleAdditive )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1377:3: lv_operator_1_0= ruleAdditive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getOperatorAdditiveEnumRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditive_in_ruleAdditiveExpr2964);
            	    lv_operator_1_0=ruleAdditive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operator",
            	            		lv_operator_1_0, 
            	            		"Additive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1393:2: ( (lv_add_2_0= ruleMultiplicativeExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1394:1: (lv_add_2_0= ruleMultiplicativeExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1394:1: (lv_add_2_0= ruleMultiplicativeExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1395:3: lv_add_2_0= ruleMultiplicativeExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getAddMultiplicativeExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2985);
            	    lv_add_2_0=ruleMultiplicativeExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"add",
            	            		lv_add_2_0, 
            	            		"MultiplicativeExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1419:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1420:2: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1421:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExprRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr3023);
            iv_ruleMultiplicativeExpr=ruleMultiplicativeExpr();

            state._fsp--;

             current =iv_ruleMultiplicativeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpr3033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1428:1: ruleMultiplicativeExpr returns [EObject current=null] : ( ( (lv_multiply_0_0= ruleUnionExpr ) ) ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_multiply_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_multiply_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1431:28: ( ( ( (lv_multiply_0_0= ruleUnionExpr ) ) ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1432:1: ( ( (lv_multiply_0_0= ruleUnionExpr ) ) ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1432:1: ( ( (lv_multiply_0_0= ruleUnionExpr ) ) ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1432:2: ( (lv_multiply_0_0= ruleUnionExpr ) ) ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1432:2: ( (lv_multiply_0_0= ruleUnionExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1433:1: (lv_multiply_0_0= ruleUnionExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1433:1: (lv_multiply_0_0= ruleUnionExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1434:3: lv_multiply_0_0= ruleUnionExpr
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getMultiplyUnionExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr3079);
            lv_multiply_0_0=ruleUnionExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	        }
                   		add(
                   			current, 
                   			"multiply",
                    		lv_multiply_0_0, 
                    		"UnionExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1450:2: ( ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=92 && LA12_0<=94)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1450:3: ( (lv_operator_1_0= ruleMultiplicative ) ) ( (lv_multiply_2_0= ruleUnionExpr ) )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1450:3: ( (lv_operator_1_0= ruleMultiplicative ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1451:1: (lv_operator_1_0= ruleMultiplicative )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1451:1: (lv_operator_1_0= ruleMultiplicative )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1452:3: lv_operator_1_0= ruleMultiplicative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getOperatorMultiplicativeEnumRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicative_in_ruleMultiplicativeExpr3101);
            	    lv_operator_1_0=ruleMultiplicative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operator",
            	            		lv_operator_1_0, 
            	            		"Multiplicative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1468:2: ( (lv_multiply_2_0= ruleUnionExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1469:1: (lv_multiply_2_0= ruleUnionExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1469:1: (lv_multiply_2_0= ruleUnionExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1470:3: lv_multiply_2_0= ruleUnionExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getMultiplyUnionExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr3122);
            	    lv_multiply_2_0=ruleUnionExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multiply",
            	            		lv_multiply_2_0, 
            	            		"UnionExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnionExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1494:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1495:2: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1496:2: iv_ruleUnionExpr= ruleUnionExpr EOF
            {
             newCompositeNode(grammarAccess.getUnionExprRule()); 
            pushFollow(FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr3160);
            iv_ruleUnionExpr=ruleUnionExpr();

            state._fsp--;

             current =iv_ruleUnionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionExpr3170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionExpr"


    // $ANTLR start "ruleUnionExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1503:1: ruleUnionExpr returns [EObject current=null] : ( ( (lv_union_0_0= ruleIntersectExceptExpr ) ) ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_union_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_union_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1506:28: ( ( ( (lv_union_0_0= ruleIntersectExceptExpr ) ) ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1507:1: ( ( (lv_union_0_0= ruleIntersectExceptExpr ) ) ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1507:1: ( ( (lv_union_0_0= ruleIntersectExceptExpr ) ) ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1507:2: ( (lv_union_0_0= ruleIntersectExceptExpr ) ) ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1507:2: ( (lv_union_0_0= ruleIntersectExceptExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1508:1: (lv_union_0_0= ruleIntersectExceptExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1508:1: (lv_union_0_0= ruleIntersectExceptExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1509:3: lv_union_0_0= ruleIntersectExceptExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnionExprAccess().getUnionIntersectExceptExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr3216);
            lv_union_0_0=ruleIntersectExceptExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	        }
                   		add(
                   			current, 
                   			"union",
                    		lv_union_0_0, 
                    		"IntersectExceptExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1525:2: ( ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=61 && LA13_0<=62)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1525:3: ( (lv_operator_1_0= ruleUnion ) ) ( (lv_union_2_0= ruleIntersectExceptExpr ) )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1525:3: ( (lv_operator_1_0= ruleUnion ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1526:1: (lv_operator_1_0= ruleUnion )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1526:1: (lv_operator_1_0= ruleUnion )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1527:3: lv_operator_1_0= ruleUnion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionExprAccess().getOperatorUnionEnumRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnion_in_ruleUnionExpr3238);
            	    lv_operator_1_0=ruleUnion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operator",
            	            		lv_operator_1_0, 
            	            		"Union");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1543:2: ( (lv_union_2_0= ruleIntersectExceptExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1544:1: (lv_union_2_0= ruleIntersectExceptExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1544:1: (lv_union_2_0= ruleIntersectExceptExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1545:3: lv_union_2_0= ruleIntersectExceptExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionExprAccess().getUnionIntersectExceptExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr3259);
            	    lv_union_2_0=ruleIntersectExceptExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"union",
            	            		lv_union_2_0, 
            	            		"IntersectExceptExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionExpr"


    // $ANTLR start "entryRuleIntersectExceptExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1569:1: entryRuleIntersectExceptExpr returns [EObject current=null] : iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF ;
    public final EObject entryRuleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectExceptExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1570:2: (iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1571:2: iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF
            {
             newCompositeNode(grammarAccess.getIntersectExceptExprRule()); 
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr3297);
            iv_ruleIntersectExceptExpr=ruleIntersectExceptExpr();

            state._fsp--;

             current =iv_ruleIntersectExceptExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntersectExceptExpr3307); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntersectExceptExpr"


    // $ANTLR start "ruleIntersectExceptExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1578:1: ruleIntersectExceptExpr returns [EObject current=null] : ( ( (lv_intersect_0_0= ruleInstanceofExpr ) ) ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )* ) ;
    public final EObject ruleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_intersect_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_intersect_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1581:28: ( ( ( (lv_intersect_0_0= ruleInstanceofExpr ) ) ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1582:1: ( ( (lv_intersect_0_0= ruleInstanceofExpr ) ) ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1582:1: ( ( (lv_intersect_0_0= ruleInstanceofExpr ) ) ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1582:2: ( (lv_intersect_0_0= ruleInstanceofExpr ) ) ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1582:2: ( (lv_intersect_0_0= ruleInstanceofExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1583:1: (lv_intersect_0_0= ruleInstanceofExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1583:1: (lv_intersect_0_0= ruleInstanceofExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1584:3: lv_intersect_0_0= ruleInstanceofExpr
            {
             
            	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getIntersectInstanceofExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr3353);
            lv_intersect_0_0=ruleInstanceofExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	        }
                   		add(
                   			current, 
                   			"intersect",
                    		lv_intersect_0_0, 
                    		"InstanceofExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1600:2: ( ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=59 && LA14_0<=60)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1600:3: ( (lv_operator_1_0= ruleIntersectExcept ) ) ( (lv_intersect_2_0= ruleInstanceofExpr ) )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1600:3: ( (lv_operator_1_0= ruleIntersectExcept ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1601:1: (lv_operator_1_0= ruleIntersectExcept )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1601:1: (lv_operator_1_0= ruleIntersectExcept )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1602:3: lv_operator_1_0= ruleIntersectExcept
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getOperatorIntersectExceptEnumRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntersectExcept_in_ruleIntersectExceptExpr3375);
            	    lv_operator_1_0=ruleIntersectExcept();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operator",
            	            		lv_operator_1_0, 
            	            		"IntersectExcept");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1618:2: ( (lv_intersect_2_0= ruleInstanceofExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1619:1: (lv_intersect_2_0= ruleInstanceofExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1619:1: (lv_intersect_2_0= ruleInstanceofExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1620:3: lv_intersect_2_0= ruleInstanceofExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getIntersectInstanceofExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr3396);
            	    lv_intersect_2_0=ruleInstanceofExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intersect",
            	            		lv_intersect_2_0, 
            	            		"InstanceofExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntersectExceptExpr"


    // $ANTLR start "entryRuleInstanceofExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1644:1: entryRuleInstanceofExpr returns [EObject current=null] : iv_ruleInstanceofExpr= ruleInstanceofExpr EOF ;
    public final EObject entryRuleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceofExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1645:2: (iv_ruleInstanceofExpr= ruleInstanceofExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1646:2: iv_ruleInstanceofExpr= ruleInstanceofExpr EOF
            {
             newCompositeNode(grammarAccess.getInstanceofExprRule()); 
            pushFollow(FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr3434);
            iv_ruleInstanceofExpr=ruleInstanceofExpr();

            state._fsp--;

             current =iv_ruleInstanceofExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceofExpr3444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceofExpr"


    // $ANTLR start "ruleInstanceofExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1653:1: ruleInstanceofExpr returns [EObject current=null] : ( ( (lv_treat_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_treat_0_0 = null;

        EObject lv_instanceOf_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1656:28: ( ( ( (lv_treat_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1657:1: ( ( (lv_treat_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1657:1: ( ( (lv_treat_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1657:2: ( (lv_treat_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1657:2: ( (lv_treat_0_0= ruleTreatExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1658:1: (lv_treat_0_0= ruleTreatExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1658:1: (lv_treat_0_0= ruleTreatExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1659:3: lv_treat_0_0= ruleTreatExpr
            {
             
            	        newCompositeNode(grammarAccess.getInstanceofExprAccess().getTreatTreatExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr3490);
            lv_treat_0_0=ruleTreatExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceofExprRule());
            	        }
                   		set(
                   			current, 
                   			"treat",
                    		lv_treat_0_0, 
                    		"TreatExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1675:2: (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1675:4: otherlv_1= 'instance' otherlv_2= 'of' ( (lv_instanceOf_3_0= ruleSequenceType ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleInstanceofExpr3503); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstanceofExprAccess().getInstanceKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInstanceofExpr3515); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstanceofExprAccess().getOfKeyword_1_1());
                        
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1683:1: ( (lv_instanceOf_3_0= ruleSequenceType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1684:1: (lv_instanceOf_3_0= ruleSequenceType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1684:1: (lv_instanceOf_3_0= ruleSequenceType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1685:3: lv_instanceOf_3_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceofExprAccess().getInstanceOfSequenceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleInstanceofExpr3536);
                    lv_instanceOf_3_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceofExprRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceOf",
                            		lv_instanceOf_3_0, 
                            		"SequenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceofExpr"


    // $ANTLR start "entryRuleTreatExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1709:1: entryRuleTreatExpr returns [EObject current=null] : iv_ruleTreatExpr= ruleTreatExpr EOF ;
    public final EObject entryRuleTreatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1710:2: (iv_ruleTreatExpr= ruleTreatExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1711:2: iv_ruleTreatExpr= ruleTreatExpr EOF
            {
             newCompositeNode(grammarAccess.getTreatExprRule()); 
            pushFollow(FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr3574);
            iv_ruleTreatExpr=ruleTreatExpr();

            state._fsp--;

             current =iv_ruleTreatExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatExpr3584); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTreatExpr"


    // $ANTLR start "ruleTreatExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1718:1: ruleTreatExpr returns [EObject current=null] : ( ( (lv_castable_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleTreatExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_castable_0_0 = null;

        EObject lv_treatAs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1721:28: ( ( ( (lv_castable_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1722:1: ( ( (lv_castable_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1722:1: ( ( (lv_castable_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1722:2: ( (lv_castable_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1722:2: ( (lv_castable_0_0= ruleCastableExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1723:1: (lv_castable_0_0= ruleCastableExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1723:1: (lv_castable_0_0= ruleCastableExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1724:3: lv_castable_0_0= ruleCastableExpr
            {
             
            	        newCompositeNode(grammarAccess.getTreatExprAccess().getCastableCastableExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCastableExpr_in_ruleTreatExpr3630);
            lv_castable_0_0=ruleCastableExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTreatExprRule());
            	        }
                   		set(
                   			current, 
                   			"castable",
                    		lv_castable_0_0, 
                    		"CastableExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1740:2: (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1740:4: otherlv_1= 'treat' otherlv_2= 'as' ( (lv_treatAs_3_0= ruleSequenceType ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTreatExpr3643); 

                        	newLeafNode(otherlv_1, grammarAccess.getTreatExprAccess().getTreatKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTreatExpr3655); 

                        	newLeafNode(otherlv_2, grammarAccess.getTreatExprAccess().getAsKeyword_1_1());
                        
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1748:1: ( (lv_treatAs_3_0= ruleSequenceType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1749:1: (lv_treatAs_3_0= ruleSequenceType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1749:1: (lv_treatAs_3_0= ruleSequenceType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1750:3: lv_treatAs_3_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreatExprAccess().getTreatAsSequenceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleTreatExpr3676);
                    lv_treatAs_3_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreatExprRule());
                    	        }
                           		set(
                           			current, 
                           			"treatAs",
                            		lv_treatAs_3_0, 
                            		"SequenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreatExpr"


    // $ANTLR start "entryRuleSequenceType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1774:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1775:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1776:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
             newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType3714);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;

             current =iv_ruleSequenceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType3724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceType"


    // $ANTLR start "ruleSequenceType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1783:1: ruleSequenceType returns [EObject current=null] : ( () ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) ) ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;

        Enumerator lv_occurrence_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1786:28: ( ( () ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1787:1: ( () ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1787:1: ( () ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1787:2: () ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1787:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceTypeAccess().getSequenceTypeAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1793:2: ( (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_NCNAME||LA18_0==37||(LA18_0>=47 && LA18_0<=53)||(LA18_0>=55 && LA18_0<=56)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1793:3: (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1793:3: (otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1793:5: otherlv_1= 'empty-sequence' otherlv_2= '(' otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSequenceType3772); 

                        	newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getEmptySequenceKeyword_1_0_0());
                        
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSequenceType3784); 

                        	newLeafNode(otherlv_2, grammarAccess.getSequenceTypeAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSequenceType3796); 

                        	newLeafNode(otherlv_3, grammarAccess.getSequenceTypeAccess().getRightParenthesisKeyword_1_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1806:6: ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1806:6: ( ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )? )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1806:7: ( (lv_type_4_0= ruleItemType ) ) ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )?
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1806:7: ( (lv_type_4_0= ruleItemType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1807:1: (lv_type_4_0= ruleItemType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1807:1: (lv_type_4_0= ruleItemType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1808:3: lv_type_4_0= ruleItemType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getTypeItemTypeParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleItemType_in_ruleSequenceType3825);
                    lv_type_4_0=ruleItemType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"ItemType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1824:2: ( (lv_occurrence_5_0= ruleOccurrenceIndicator ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==40) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==63) ) {
                        int LA17_2 = input.LA(2);

                        if ( (LA17_2==EOF||(LA17_2>=16 && LA17_2<=17)||LA17_2==23||LA17_2==26||(LA17_2>=28 && LA17_2<=32)||LA17_2==42||(LA17_2>=59 && LA17_2<=79)||(LA17_2>=92 && LA17_2<=94)) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1825:1: (lv_occurrence_5_0= ruleOccurrenceIndicator )
                            {
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1825:1: (lv_occurrence_5_0= ruleOccurrenceIndicator )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1826:3: lv_occurrence_5_0= ruleOccurrenceIndicator
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getOccurrenceOccurrenceIndicatorEnumRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOccurrenceIndicator_in_ruleSequenceType3846);
                            lv_occurrence_5_0=ruleOccurrenceIndicator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"occurrence",
                                    		lv_occurrence_5_0, 
                                    		"OccurrenceIndicator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceType"


    // $ANTLR start "entryRuleItemType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1850:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1851:2: (iv_ruleItemType= ruleItemType EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1852:2: iv_ruleItemType= ruleItemType EOF
            {
             newCompositeNode(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_ruleItemType_in_entryRuleItemType3885);
            iv_ruleItemType=ruleItemType();

            state._fsp--;

             current =iv_ruleItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemType3895); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1859:1: ruleItemType returns [EObject current=null] : ( () ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) ) ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_kindTest_1_0 = null;

        EObject lv_atomicType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1862:28: ( ( () ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1863:1: ( () ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1863:1: ( () ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1863:2: () ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1863:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1864:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getItemTypeAccess().getItemTypeAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1869:2: ( ( (lv_kindTest_1_0= ruleKindTest ) ) | (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_atomicType_5_0= ruleAtomicType ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case RULE_NCNAME:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1869:3: ( (lv_kindTest_1_0= ruleKindTest ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1869:3: ( (lv_kindTest_1_0= ruleKindTest ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1870:1: (lv_kindTest_1_0= ruleKindTest )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1870:1: (lv_kindTest_1_0= ruleKindTest )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1871:3: lv_kindTest_1_0= ruleKindTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getKindTestKindTestParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKindTest_in_ruleItemType3951);
                    lv_kindTest_1_0=ruleKindTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"kindTest",
                            		lv_kindTest_1_0, 
                            		"KindTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1888:6: (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1888:6: (otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1888:8: otherlv_2= 'item' otherlv_3= '(' otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleItemType3970); 

                        	newLeafNode(otherlv_2, grammarAccess.getItemTypeAccess().getItemKeyword_1_1_0());
                        
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleItemType3982); 

                        	newLeafNode(otherlv_3, grammarAccess.getItemTypeAccess().getLeftParenthesisKeyword_1_1_1());
                        
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleItemType3994); 

                        	newLeafNode(otherlv_4, grammarAccess.getItemTypeAccess().getRightParenthesisKeyword_1_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1901:6: ( (lv_atomicType_5_0= ruleAtomicType ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1901:6: ( (lv_atomicType_5_0= ruleAtomicType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1902:1: (lv_atomicType_5_0= ruleAtomicType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1902:1: (lv_atomicType_5_0= ruleAtomicType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1903:3: lv_atomicType_5_0= ruleAtomicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getAtomicTypeAtomicTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicType_in_ruleItemType4022);
                    lv_atomicType_5_0=ruleAtomicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"atomicType",
                            		lv_atomicType_5_0, 
                            		"AtomicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleAtomicType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1927:1: entryRuleAtomicType returns [EObject current=null] : iv_ruleAtomicType= ruleAtomicType EOF ;
    public final EObject entryRuleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicType = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1928:2: (iv_ruleAtomicType= ruleAtomicType EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1929:2: iv_ruleAtomicType= ruleAtomicType EOF
            {
             newCompositeNode(grammarAccess.getAtomicTypeRule()); 
            pushFollow(FOLLOW_ruleAtomicType_in_entryRuleAtomicType4059);
            iv_ruleAtomicType=ruleAtomicType();

            state._fsp--;

             current =iv_ruleAtomicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicType4069); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicType"


    // $ANTLR start "ruleAtomicType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1936:1: ruleAtomicType returns [EObject current=null] : this_QName_0= ruleQName ;
    public final EObject ruleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1939:28: (this_QName_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1941:5: this_QName_0= ruleQName
            {
             
                    newCompositeNode(grammarAccess.getAtomicTypeAccess().getQNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleAtomicType4115);
            this_QName_0=ruleQName();

            state._fsp--;

             
                    current = this_QName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicType"


    // $ANTLR start "entryRuleCastableExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1957:1: entryRuleCastableExpr returns [EObject current=null] : iv_ruleCastableExpr= ruleCastableExpr EOF ;
    public final EObject entryRuleCastableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastableExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1958:2: (iv_ruleCastableExpr= ruleCastableExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1959:2: iv_ruleCastableExpr= ruleCastableExpr EOF
            {
             newCompositeNode(grammarAccess.getCastableExprRule()); 
            pushFollow(FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr4149);
            iv_ruleCastableExpr=ruleCastableExpr();

            state._fsp--;

             current =iv_ruleCastableExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastableExpr4159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastableExpr"


    // $ANTLR start "ruleCastableExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1966:1: ruleCastableExpr returns [EObject current=null] : ( ( (lv_cast_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastableExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_cast_0_0 = null;

        EObject lv_castableAs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1969:28: ( ( ( (lv_cast_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1970:1: ( ( (lv_cast_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1970:1: ( ( (lv_cast_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1970:2: ( (lv_cast_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1970:2: ( (lv_cast_0_0= ruleCastExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1971:1: (lv_cast_0_0= ruleCastExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1971:1: (lv_cast_0_0= ruleCastExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1972:3: lv_cast_0_0= ruleCastExpr
            {
             
            	        newCompositeNode(grammarAccess.getCastableExprAccess().getCastCastExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCastExpr_in_ruleCastableExpr4205);
            lv_cast_0_0=ruleCastExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastableExprRule());
            	        }
                   		set(
                   			current, 
                   			"cast",
                    		lv_cast_0_0, 
                    		"CastExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1988:2: (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1988:4: otherlv_1= 'castable' otherlv_2= 'as' ( (lv_castableAs_3_0= ruleSingleType ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleCastableExpr4218); 

                        	newLeafNode(otherlv_1, grammarAccess.getCastableExprAccess().getCastableKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleCastableExpr4230); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastableExprAccess().getAsKeyword_1_1());
                        
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1996:1: ( (lv_castableAs_3_0= ruleSingleType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1997:1: (lv_castableAs_3_0= ruleSingleType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1997:1: (lv_castableAs_3_0= ruleSingleType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1998:3: lv_castableAs_3_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastableExprAccess().getCastableAsSingleTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastableExpr4251);
                    lv_castableAs_3_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastableExprRule());
                    	        }
                           		set(
                           			current, 
                           			"castableAs",
                            		lv_castableAs_3_0, 
                            		"SingleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastableExpr"


    // $ANTLR start "entryRuleCastExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2022:1: entryRuleCastExpr returns [EObject current=null] : iv_ruleCastExpr= ruleCastExpr EOF ;
    public final EObject entryRuleCastExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2023:2: (iv_ruleCastExpr= ruleCastExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2024:2: iv_ruleCastExpr= ruleCastExpr EOF
            {
             newCompositeNode(grammarAccess.getCastExprRule()); 
            pushFollow(FOLLOW_ruleCastExpr_in_entryRuleCastExpr4289);
            iv_ruleCastExpr=ruleCastExpr();

            state._fsp--;

             current =iv_ruleCastExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastExpr4299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpr"


    // $ANTLR start "ruleCastExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2031:1: ruleCastExpr returns [EObject current=null] : ( ( (lv_cast_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_cast_0_0 = null;

        EObject lv_castAs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2034:28: ( ( ( (lv_cast_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2035:1: ( ( (lv_cast_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2035:1: ( ( (lv_cast_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2035:2: ( (lv_cast_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2035:2: ( (lv_cast_0_0= ruleUnaryExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2036:1: (lv_cast_0_0= ruleUnaryExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2036:1: (lv_cast_0_0= ruleUnaryExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2037:3: lv_cast_0_0= ruleUnaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getCastExprAccess().getCastUnaryExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCastExpr4345);
            lv_cast_0_0=ruleUnaryExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastExprRule());
            	        }
                   		set(
                   			current, 
                   			"cast",
                    		lv_cast_0_0, 
                    		"UnaryExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2053:2: (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2053:4: otherlv_1= 'cast' otherlv_2= 'as' ( (lv_castAs_3_0= ruleSingleType ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleCastExpr4358); 

                        	newLeafNode(otherlv_1, grammarAccess.getCastExprAccess().getCastKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleCastExpr4370); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastExprAccess().getAsKeyword_1_1());
                        
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2061:1: ( (lv_castAs_3_0= ruleSingleType ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2062:1: (lv_castAs_3_0= ruleSingleType )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2062:1: (lv_castAs_3_0= ruleSingleType )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2063:3: lv_castAs_3_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastExprAccess().getCastAsSingleTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastExpr4391);
                    lv_castAs_3_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastExprRule());
                    	        }
                           		set(
                           			current, 
                           			"castAs",
                            		lv_castAs_3_0, 
                            		"SingleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastExpr"


    // $ANTLR start "entryRuleValueExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2087:1: entryRuleValueExpr returns [EObject current=null] : iv_ruleValueExpr= ruleValueExpr EOF ;
    public final EObject entryRuleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2088:2: (iv_ruleValueExpr= ruleValueExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2089:2: iv_ruleValueExpr= ruleValueExpr EOF
            {
             newCompositeNode(grammarAccess.getValueExprRule()); 
            pushFollow(FOLLOW_ruleValueExpr_in_entryRuleValueExpr4429);
            iv_ruleValueExpr=ruleValueExpr();

            state._fsp--;

             current =iv_ruleValueExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpr4439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExpr"


    // $ANTLR start "ruleValueExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2096:1: ruleValueExpr returns [EObject current=null] : ( (lv_path_0_0= rulePathExpr ) ) ;
    public final EObject ruleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2099:28: ( ( (lv_path_0_0= rulePathExpr ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2100:1: ( (lv_path_0_0= rulePathExpr ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2100:1: ( (lv_path_0_0= rulePathExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2101:1: (lv_path_0_0= rulePathExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2101:1: (lv_path_0_0= rulePathExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2102:3: lv_path_0_0= rulePathExpr
            {
             
            	        newCompositeNode(grammarAccess.getValueExprAccess().getPathPathExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePathExpr_in_ruleValueExpr4484);
            lv_path_0_0=rulePathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueExprRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"PathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueExpr"


    // $ANTLR start "entryRuleSingleType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2126:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2127:2: (iv_ruleSingleType= ruleSingleType EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2128:2: iv_ruleSingleType= ruleSingleType EOF
            {
             newCompositeNode(grammarAccess.getSingleTypeRule()); 
            pushFollow(FOLLOW_ruleSingleType_in_entryRuleSingleType4519);
            iv_ruleSingleType=ruleSingleType();

            state._fsp--;

             current =iv_ruleSingleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleType4529); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2135:1: ruleSingleType returns [EObject current=null] : ( ( (lv_type_0_0= ruleAtomicType ) ) ( (lv_question_1_0= '?' ) )? ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        Token lv_question_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2138:28: ( ( ( (lv_type_0_0= ruleAtomicType ) ) ( (lv_question_1_0= '?' ) )? ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2139:1: ( ( (lv_type_0_0= ruleAtomicType ) ) ( (lv_question_1_0= '?' ) )? )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2139:1: ( ( (lv_type_0_0= ruleAtomicType ) ) ( (lv_question_1_0= '?' ) )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2139:2: ( (lv_type_0_0= ruleAtomicType ) ) ( (lv_question_1_0= '?' ) )?
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2139:2: ( (lv_type_0_0= ruleAtomicType ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2140:1: (lv_type_0_0= ruleAtomicType )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2140:1: (lv_type_0_0= ruleAtomicType )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2141:3: lv_type_0_0= ruleAtomicType
            {
             
            	        newCompositeNode(grammarAccess.getSingleTypeAccess().getTypeAtomicTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicType_in_ruleSingleType4575);
            lv_type_0_0=ruleAtomicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AtomicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2157:2: ( (lv_question_1_0= '?' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2158:1: (lv_question_1_0= '?' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2158:1: (lv_question_1_0= '?' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2159:3: lv_question_1_0= '?'
                    {
                    lv_question_1_0=(Token)match(input,40,FOLLOW_40_in_ruleSingleType4593); 

                            newLeafNode(lv_question_1_0, grammarAccess.getSingleTypeAccess().getQuestionQuestionMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleTypeRule());
                    	        }
                           		setWithLastConsumed(current, "question", true, "?");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entryRuleRelativePathExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2180:1: entryRuleRelativePathExpr returns [EObject current=null] : iv_ruleRelativePathExpr= ruleRelativePathExpr EOF ;
    public final EObject entryRuleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativePathExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2181:2: (iv_ruleRelativePathExpr= ruleRelativePathExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2182:2: iv_ruleRelativePathExpr= ruleRelativePathExpr EOF
            {
             newCompositeNode(grammarAccess.getRelativePathExprRule()); 
            pushFollow(FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr4643);
            iv_ruleRelativePathExpr=ruleRelativePathExpr();

            state._fsp--;

             current =iv_ruleRelativePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativePathExpr4653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativePathExpr"


    // $ANTLR start "ruleRelativePathExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2189:1: ruleRelativePathExpr returns [EObject current=null] : ( ( (lv_step_0_0= ruleStepExpr ) ) ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )* ) ;
    public final EObject ruleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_step_0_0 = null;

        Enumerator lv_separator_1_0 = null;

        EObject lv_step_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2192:28: ( ( ( (lv_step_0_0= ruleStepExpr ) ) ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2193:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2193:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2193:2: ( (lv_step_0_0= ruleStepExpr ) ) ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2193:2: ( (lv_step_0_0= ruleStepExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2194:1: (lv_step_0_0= ruleStepExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2194:1: (lv_step_0_0= ruleStepExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2195:3: lv_step_0_0= ruleStepExpr
            {
             
            	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getStepStepExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4699);
            lv_step_0_0=ruleStepExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativePathExprRule());
            	        }
                   		add(
                   			current, 
                   			"step",
                    		lv_step_0_0, 
                    		"StepExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2211:2: ( ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=57 && LA23_0<=58)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2211:3: ( (lv_separator_1_0= ruleSeparator ) ) ( (lv_step_2_0= ruleStepExpr ) )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2211:3: ( (lv_separator_1_0= ruleSeparator ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2212:1: (lv_separator_1_0= ruleSeparator )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2212:1: (lv_separator_1_0= ruleSeparator )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2213:3: lv_separator_1_0= ruleSeparator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getSeparatorSeparatorEnumRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSeparator_in_ruleRelativePathExpr4721);
            	    lv_separator_1_0=ruleSeparator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelativePathExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"separator",
            	            		lv_separator_1_0, 
            	            		"Separator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2229:2: ( (lv_step_2_0= ruleStepExpr ) )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2230:1: (lv_step_2_0= ruleStepExpr )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2230:1: (lv_step_2_0= ruleStepExpr )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2231:3: lv_step_2_0= ruleStepExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getStepStepExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4742);
            	    lv_step_2_0=ruleStepExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelativePathExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"step",
            	            		lv_step_2_0, 
            	            		"StepExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativePathExpr"


    // $ANTLR start "entryRulePredicate"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2257:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2258:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2259:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate4782);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate4792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2266:1: rulePredicate returns [EObject current=null] : (otherlv_0= '[' ( (lv_predicate_1_0= ruleExpr ) ) otherlv_2= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_predicate_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2269:28: ( (otherlv_0= '[' ( (lv_predicate_1_0= ruleExpr ) ) otherlv_2= ']' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2270:1: (otherlv_0= '[' ( (lv_predicate_1_0= ruleExpr ) ) otherlv_2= ']' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2270:1: (otherlv_0= '[' ( (lv_predicate_1_0= ruleExpr ) ) otherlv_2= ']' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2270:3: otherlv_0= '[' ( (lv_predicate_1_0= ruleExpr ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulePredicate4829); 

                	newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2274:1: ( (lv_predicate_1_0= ruleExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2275:1: (lv_predicate_1_0= ruleExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2275:1: (lv_predicate_1_0= ruleExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2276:3: lv_predicate_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicateExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_rulePredicate4850);
            lv_predicate_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_rulePredicate4862); 

                	newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleReverseStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2304:1: entryRuleReverseStep returns [EObject current=null] : iv_ruleReverseStep= ruleReverseStep EOF ;
    public final EObject entryRuleReverseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseStep = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2305:2: (iv_ruleReverseStep= ruleReverseStep EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2306:2: iv_ruleReverseStep= ruleReverseStep EOF
            {
             newCompositeNode(grammarAccess.getReverseStepRule()); 
            pushFollow(FOLLOW_ruleReverseStep_in_entryRuleReverseStep4898);
            iv_ruleReverseStep=ruleReverseStep();

            state._fsp--;

             current =iv_ruleReverseStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReverseStep4908); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReverseStep"


    // $ANTLR start "ruleReverseStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2313:1: ruleReverseStep returns [EObject current=null] : ( ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) ) ) ;
    public final EObject ruleReverseStep() throws RecognitionException {
        EObject current = null;

        EObject lv_axis_0_0 = null;

        EObject lv_test_1_0 = null;

        AntlrDatatypeRuleToken lv_abbrev_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2316:28: ( ( ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:1: ( ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:1: ( ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=80 && LA24_0<=84)) ) {
                alt24=1;
            }
            else if ( (LA24_0==44) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:2: ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:2: ( ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:3: ( (lv_axis_0_0= ruleReverseAxis ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2317:3: ( (lv_axis_0_0= ruleReverseAxis ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2318:1: (lv_axis_0_0= ruleReverseAxis )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2318:1: (lv_axis_0_0= ruleReverseAxis )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2319:3: lv_axis_0_0= ruleReverseAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getReverseStepAccess().getAxisReverseAxisParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReverseAxis_in_ruleReverseStep4955);
                    lv_axis_0_0=ruleReverseAxis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReverseStepRule());
                    	        }
                           		set(
                           			current, 
                           			"axis",
                            		lv_axis_0_0, 
                            		"ReverseAxis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2335:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2336:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2336:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2337:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getReverseStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleReverseStep4976);
                    lv_test_1_0=ruleNodeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReverseStepRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_1_0, 
                            		"NodeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2354:6: ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2354:6: ( (lv_abbrev_2_0= ruleAbbrevReverseStep ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2355:1: (lv_abbrev_2_0= ruleAbbrevReverseStep )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2355:1: (lv_abbrev_2_0= ruleAbbrevReverseStep )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2356:3: lv_abbrev_2_0= ruleAbbrevReverseStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getReverseStepAccess().getAbbrevAbbrevReverseStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbbrevReverseStep_in_ruleReverseStep5004);
                    lv_abbrev_2_0=ruleAbbrevReverseStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReverseStepRule());
                    	        }
                           		set(
                           			current, 
                           			"abbrev",
                            		lv_abbrev_2_0, 
                            		"AbbrevReverseStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReverseStep"


    // $ANTLR start "entryRuleReverseAxis"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2380:1: entryRuleReverseAxis returns [EObject current=null] : iv_ruleReverseAxis= ruleReverseAxis EOF ;
    public final EObject entryRuleReverseAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseAxis = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2381:2: (iv_ruleReverseAxis= ruleReverseAxis EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2382:2: iv_ruleReverseAxis= ruleReverseAxis EOF
            {
             newCompositeNode(grammarAccess.getReverseAxisRule()); 
            pushFollow(FOLLOW_ruleReverseAxis_in_entryRuleReverseAxis5040);
            iv_ruleReverseAxis=ruleReverseAxis();

            state._fsp--;

             current =iv_ruleReverseAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReverseAxis5050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReverseAxis"


    // $ANTLR start "ruleReverseAxis"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2389:1: ruleReverseAxis returns [EObject current=null] : ( ( (lv_axis_0_0= ruleReverseAxisEnum ) ) otherlv_1= '::' ) ;
    public final EObject ruleReverseAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_axis_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2392:28: ( ( ( (lv_axis_0_0= ruleReverseAxisEnum ) ) otherlv_1= '::' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2393:1: ( ( (lv_axis_0_0= ruleReverseAxisEnum ) ) otherlv_1= '::' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2393:1: ( ( (lv_axis_0_0= ruleReverseAxisEnum ) ) otherlv_1= '::' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2393:2: ( (lv_axis_0_0= ruleReverseAxisEnum ) ) otherlv_1= '::'
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2393:2: ( (lv_axis_0_0= ruleReverseAxisEnum ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2394:1: (lv_axis_0_0= ruleReverseAxisEnum )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2394:1: (lv_axis_0_0= ruleReverseAxisEnum )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2395:3: lv_axis_0_0= ruleReverseAxisEnum
            {
             
            	        newCompositeNode(grammarAccess.getReverseAxisAccess().getAxisReverseAxisEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleReverseAxisEnum_in_ruleReverseAxis5096);
            lv_axis_0_0=ruleReverseAxisEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReverseAxisRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_0_0, 
                    		"ReverseAxisEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleReverseAxis5108); 

                	newLeafNode(otherlv_1, grammarAccess.getReverseAxisAccess().getColonColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReverseAxis"


    // $ANTLR start "entryRuleAbbrevReverseStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2423:1: entryRuleAbbrevReverseStep returns [String current=null] : iv_ruleAbbrevReverseStep= ruleAbbrevReverseStep EOF ;
    public final String entryRuleAbbrevReverseStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbbrevReverseStep = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2424:2: (iv_ruleAbbrevReverseStep= ruleAbbrevReverseStep EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2425:2: iv_ruleAbbrevReverseStep= ruleAbbrevReverseStep EOF
            {
             newCompositeNode(grammarAccess.getAbbrevReverseStepRule()); 
            pushFollow(FOLLOW_ruleAbbrevReverseStep_in_entryRuleAbbrevReverseStep5145);
            iv_ruleAbbrevReverseStep=ruleAbbrevReverseStep();

            state._fsp--;

             current =iv_ruleAbbrevReverseStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbbrevReverseStep5156); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbbrevReverseStep"


    // $ANTLR start "ruleAbbrevReverseStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2432:1: ruleAbbrevReverseStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '..' ;
    public final AntlrDatatypeRuleToken ruleAbbrevReverseStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2435:28: (kw= '..' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2437:2: kw= '..'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleAbbrevReverseStep5193); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAbbrevReverseStepAccess().getFullStopFullStopKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbbrevReverseStep"


    // $ANTLR start "entryRuleNodeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2450:1: entryRuleNodeTest returns [EObject current=null] : iv_ruleNodeTest= ruleNodeTest EOF ;
    public final EObject entryRuleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2451:2: (iv_ruleNodeTest= ruleNodeTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2452:2: iv_ruleNodeTest= ruleNodeTest EOF
            {
             newCompositeNode(grammarAccess.getNodeTestRule()); 
            pushFollow(FOLLOW_ruleNodeTest_in_entryRuleNodeTest5232);
            iv_ruleNodeTest=ruleNodeTest();

            state._fsp--;

             current =iv_ruleNodeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTest5242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTest"


    // $ANTLR start "ruleNodeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2459:1: ruleNodeTest returns [EObject current=null] : (this_KindTest_0= ruleKindTest | this_NameTest_1= ruleNameTest ) ;
    public final EObject ruleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject this_KindTest_0 = null;

        EObject this_NameTest_1 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2462:28: ( (this_KindTest_0= ruleKindTest | this_NameTest_1= ruleNameTest ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2463:1: (this_KindTest_0= ruleKindTest | this_NameTest_1= ruleNameTest )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2463:1: (this_KindTest_0= ruleKindTest | this_NameTest_1= ruleNameTest )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=47 && LA25_0<=53)||(LA25_0>=55 && LA25_0<=56)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_NCNAME||LA25_0==54) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2464:5: this_KindTest_0= ruleKindTest
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTestAccess().getKindTestParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKindTest_in_ruleNodeTest5289);
                    this_KindTest_0=ruleKindTest();

                    state._fsp--;

                     
                            current = this_KindTest_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2474:5: this_NameTest_1= ruleNameTest
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTestAccess().getNameTestParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNameTest_in_ruleNodeTest5316);
                    this_NameTest_1=ruleNameTest();

                    state._fsp--;

                     
                            current = this_NameTest_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTest"


    // $ANTLR start "entryRuleNameTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2490:1: entryRuleNameTest returns [EObject current=null] : iv_ruleNameTest= ruleNameTest EOF ;
    public final EObject entryRuleNameTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2491:2: (iv_ruleNameTest= ruleNameTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2492:2: iv_ruleNameTest= ruleNameTest EOF
            {
             newCompositeNode(grammarAccess.getNameTestRule()); 
            pushFollow(FOLLOW_ruleNameTest_in_entryRuleNameTest5351);
            iv_ruleNameTest=ruleNameTest();

            state._fsp--;

             current =iv_ruleNameTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameTest5361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameTest"


    // $ANTLR start "ruleNameTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2499:1: ruleNameTest returns [EObject current=null] : (this_QName_0= ruleQName | this_Wildcard_1= ruleWildcard ) ;
    public final EObject ruleNameTest() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;

        EObject this_Wildcard_1 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2502:28: ( (this_QName_0= ruleQName | this_Wildcard_1= ruleWildcard ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2503:1: (this_QName_0= ruleQName | this_Wildcard_1= ruleWildcard )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2503:1: (this_QName_0= ruleQName | this_Wildcard_1= ruleWildcard )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NCNAME) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==15) ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==RULE_NCNAME) ) {
                        alt26=1;
                    }
                    else if ( (LA26_3==54) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_1==EOF||(LA26_1>=16 && LA26_1<=17)||LA26_1==23||LA26_1==26||(LA26_1>=28 && LA26_1<=32)||LA26_1==34||(LA26_1>=38 && LA26_1<=39)||(LA26_1>=41 && LA26_1<=42)||(LA26_1>=57 && LA26_1<=79)||(LA26_1>=92 && LA26_1<=94)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2504:5: this_QName_0= ruleQName
                    {
                     
                            newCompositeNode(grammarAccess.getNameTestAccess().getQNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleNameTest5408);
                    this_QName_0=ruleQName();

                    state._fsp--;

                     
                            current = this_QName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2514:5: this_Wildcard_1= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getNameTestAccess().getWildcardParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWildcard_in_ruleNameTest5435);
                    this_Wildcard_1=ruleWildcard();

                    state._fsp--;

                     
                            current = this_Wildcard_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameTest"


    // $ANTLR start "entryRuleForwardStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2530:1: entryRuleForwardStep returns [EObject current=null] : iv_ruleForwardStep= ruleForwardStep EOF ;
    public final EObject entryRuleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStep = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2531:2: (iv_ruleForwardStep= ruleForwardStep EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2532:2: iv_ruleForwardStep= ruleForwardStep EOF
            {
             newCompositeNode(grammarAccess.getForwardStepRule()); 
            pushFollow(FOLLOW_ruleForwardStep_in_entryRuleForwardStep5470);
            iv_ruleForwardStep=ruleForwardStep();

            state._fsp--;

             current =iv_ruleForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardStep5480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForwardStep"


    // $ANTLR start "ruleForwardStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2539:1: ruleForwardStep returns [EObject current=null] : ( ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) ) ) ;
    public final EObject ruleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject lv_axis_0_0 = null;

        EObject lv_test_1_0 = null;

        EObject lv_abbrev_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2542:28: ( ( ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:1: ( ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:1: ( ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==43) ) {
                    alt27=1;
                }
                else if ( (LA27_2==25) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NCNAME:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:2: ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:2: ( ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:3: ( (lv_axis_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2543:3: ( (lv_axis_0_0= ruleForwardAxis ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2544:1: (lv_axis_0_0= ruleForwardAxis )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2544:1: (lv_axis_0_0= ruleForwardAxis )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2545:3: lv_axis_0_0= ruleForwardAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getAxisForwardAxisParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardAxis_in_ruleForwardStep5527);
                    lv_axis_0_0=ruleForwardAxis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"axis",
                            		lv_axis_0_0, 
                            		"ForwardAxis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2561:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2562:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2562:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2563:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleForwardStep5548);
                    lv_test_1_0=ruleNodeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_1_0, 
                            		"NodeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2580:6: ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2580:6: ( (lv_abbrev_2_0= ruleAbbrevForwardStep ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2581:1: (lv_abbrev_2_0= ruleAbbrevForwardStep )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2581:1: (lv_abbrev_2_0= ruleAbbrevForwardStep )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2582:3: lv_abbrev_2_0= ruleAbbrevForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getAbbrevAbbrevForwardStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep5576);
                    lv_abbrev_2_0=ruleAbbrevForwardStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"abbrev",
                            		lv_abbrev_2_0, 
                            		"AbbrevForwardStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardStep"


    // $ANTLR start "entryRuleForwardAxis"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2606:1: entryRuleForwardAxis returns [EObject current=null] : iv_ruleForwardAxis= ruleForwardAxis EOF ;
    public final EObject entryRuleForwardAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardAxis = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2607:2: (iv_ruleForwardAxis= ruleForwardAxis EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2608:2: iv_ruleForwardAxis= ruleForwardAxis EOF
            {
             newCompositeNode(grammarAccess.getForwardAxisRule()); 
            pushFollow(FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis5612);
            iv_ruleForwardAxis=ruleForwardAxis();

            state._fsp--;

             current =iv_ruleForwardAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardAxis5622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForwardAxis"


    // $ANTLR start "ruleForwardAxis"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2615:1: ruleForwardAxis returns [EObject current=null] : ( ( (lv_axis_0_0= ruleForwardAxisEnum ) ) otherlv_1= '::' ) ;
    public final EObject ruleForwardAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_axis_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2618:28: ( ( ( (lv_axis_0_0= ruleForwardAxisEnum ) ) otherlv_1= '::' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2619:1: ( ( (lv_axis_0_0= ruleForwardAxisEnum ) ) otherlv_1= '::' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2619:1: ( ( (lv_axis_0_0= ruleForwardAxisEnum ) ) otherlv_1= '::' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2619:2: ( (lv_axis_0_0= ruleForwardAxisEnum ) ) otherlv_1= '::'
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2619:2: ( (lv_axis_0_0= ruleForwardAxisEnum ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2620:1: (lv_axis_0_0= ruleForwardAxisEnum )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2620:1: (lv_axis_0_0= ruleForwardAxisEnum )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2621:3: lv_axis_0_0= ruleForwardAxisEnum
            {
             
            	        newCompositeNode(grammarAccess.getForwardAxisAccess().getAxisForwardAxisEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleForwardAxisEnum_in_ruleForwardAxis5668);
            lv_axis_0_0=ruleForwardAxisEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForwardAxisRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_0_0, 
                    		"ForwardAxisEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleForwardAxis5680); 

                	newLeafNode(otherlv_1, grammarAccess.getForwardAxisAccess().getColonColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardAxis"


    // $ANTLR start "entryRuleAbbrevForwardStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2649:1: entryRuleAbbrevForwardStep returns [EObject current=null] : iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF ;
    public final EObject entryRuleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbrevForwardStep = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2650:2: (iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2651:2: iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF
            {
             newCompositeNode(grammarAccess.getAbbrevForwardStepRule()); 
            pushFollow(FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep5716);
            iv_ruleAbbrevForwardStep=ruleAbbrevForwardStep();

            state._fsp--;

             current =iv_ruleAbbrevForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbbrevForwardStep5726); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbbrevForwardStep"


    // $ANTLR start "ruleAbbrevForwardStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2658:1: ruleAbbrevForwardStep returns [EObject current=null] : ( ( (lv_at_0_0= '@' ) )? ( (lv_test_1_0= ruleNodeTest ) ) ) ;
    public final EObject ruleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        Token lv_at_0_0=null;
        EObject lv_test_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2661:28: ( ( ( (lv_at_0_0= '@' ) )? ( (lv_test_1_0= ruleNodeTest ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2662:1: ( ( (lv_at_0_0= '@' ) )? ( (lv_test_1_0= ruleNodeTest ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2662:1: ( ( (lv_at_0_0= '@' ) )? ( (lv_test_1_0= ruleNodeTest ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2662:2: ( (lv_at_0_0= '@' ) )? ( (lv_test_1_0= ruleNodeTest ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2662:2: ( (lv_at_0_0= '@' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2663:1: (lv_at_0_0= '@' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2663:1: (lv_at_0_0= '@' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2664:3: lv_at_0_0= '@'
                    {
                    lv_at_0_0=(Token)match(input,45,FOLLOW_45_in_ruleAbbrevForwardStep5769); 

                            newLeafNode(lv_at_0_0, grammarAccess.getAbbrevForwardStepAccess().getAtCommercialAtKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbbrevForwardStepRule());
                    	        }
                           		setWithLastConsumed(current, "at", true, "@");
                    	    

                    }


                    }
                    break;

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2677:3: ( (lv_test_1_0= ruleNodeTest ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2678:1: (lv_test_1_0= ruleNodeTest )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2678:1: (lv_test_1_0= ruleNodeTest )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2679:3: lv_test_1_0= ruleNodeTest
            {
             
            	        newCompositeNode(grammarAccess.getAbbrevForwardStepAccess().getTestNodeTestParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5804);
            lv_test_1_0=ruleNodeTest();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbbrevForwardStepRule());
            	        }
                   		set(
                   			current, 
                   			"test",
                    		lv_test_1_0, 
                    		"NodeTest");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbbrevForwardStep"


    // $ANTLR start "entryRuleLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2703:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2704:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2705:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5840);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2712:1: ruleLiteral returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_StringLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2715:28: ( (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2716:1: (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2716:1: (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_DOUBLE)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2717:5: this_NumericLiteral_0= ruleNumericLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumericLiteral_in_ruleLiteral5897);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;

                     
                            current = this_NumericLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2727:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5924);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2743:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2744:2: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2745:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral5959);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericLiteral5969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2752:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_DoubleLiteral_2= ruleDoubleLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2755:28: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_DoubleLiteral_2= ruleDoubleLiteral ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2756:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_DoubleLiteral_2= ruleDoubleLiteral )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2756:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_DecimalLiteral_1= ruleDecimalLiteral | this_DoubleLiteral_2= ruleDoubleLiteral )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt30=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt30=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2757:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleNumericLiteral6016);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2767:5: this_DecimalLiteral_1= ruleDecimalLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNumericLiteralAccess().getDecimalLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalLiteral_in_ruleNumericLiteral6043);
                    this_DecimalLiteral_1=ruleDecimalLiteral();

                    state._fsp--;

                     
                            current = this_DecimalLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2777:5: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNumericLiteralAccess().getDoubleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_ruleNumericLiteral6070);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleVarRef"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2793:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2794:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2795:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef6105);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef6115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2802:1: ruleVarRef returns [EObject current=null] : (otherlv_0= '$' ( (lv_var_1_0= ruleVarName ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2805:28: ( (otherlv_0= '$' ( (lv_var_1_0= ruleVarName ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2806:1: (otherlv_0= '$' ( (lv_var_1_0= ruleVarName ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2806:1: (otherlv_0= '$' ( (lv_var_1_0= ruleVarName ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2806:3: otherlv_0= '$' ( (lv_var_1_0= ruleVarName ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVarRef6152); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getDollarSignKeyword_0());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2810:1: ( (lv_var_1_0= ruleVarName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2811:1: (lv_var_1_0= ruleVarName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2811:1: (lv_var_1_0= ruleVarName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2812:3: lv_var_1_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getVarRefAccess().getVarVarNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleVarRef6173);
            lv_var_1_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarRefRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleParenthesizedExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2836:1: entryRuleParenthesizedExpr returns [EObject current=null] : iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF ;
    public final EObject entryRuleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2837:2: (iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2838:2: iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            pushFollow(FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr6209);
            iv_ruleParenthesizedExpr=ruleParenthesizedExpr();

            state._fsp--;

             current =iv_ruleParenthesizedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpr6219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpr"


    // $ANTLR start "ruleParenthesizedExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2845:1: ruleParenthesizedExpr returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpr ) )? otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2848:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpr ) )? otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2849:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpr ) )? otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2849:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpr ) )? otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2849:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpr ) )? otherlv_3= ')'
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2849:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2850:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParenthesizedExprAccess().getParenthesizedExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleParenthesizedExpr6265); 

                	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2859:1: ( (lv_expression_2_0= ruleExpr ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_NCNAME||LA31_0==18||(LA31_0>=21 && LA31_0<=22)||LA31_0==24||(LA31_0>=44 && LA31_0<=45)||(LA31_0>=47 && LA31_0<=58)||(LA31_0>=80 && LA31_0<=91)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2860:1: (lv_expression_2_0= ruleExpr )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2860:1: (lv_expression_2_0= ruleExpr )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2861:3: lv_expression_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExpressionExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleParenthesizedExpr6286);
                    lv_expression_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParenthesizedExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleParenthesizedExpr6299); 

                	newLeafNode(otherlv_3, grammarAccess.getParenthesizedExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpr"


    // $ANTLR start "entryRuleContextItemExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2889:1: entryRuleContextItemExpr returns [EObject current=null] : iv_ruleContextItemExpr= ruleContextItemExpr EOF ;
    public final EObject entryRuleContextItemExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextItemExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2890:2: (iv_ruleContextItemExpr= ruleContextItemExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2891:2: iv_ruleContextItemExpr= ruleContextItemExpr EOF
            {
             newCompositeNode(grammarAccess.getContextItemExprRule()); 
            pushFollow(FOLLOW_ruleContextItemExpr_in_entryRuleContextItemExpr6335);
            iv_ruleContextItemExpr=ruleContextItemExpr();

            state._fsp--;

             current =iv_ruleContextItemExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextItemExpr6345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextItemExpr"


    // $ANTLR start "ruleContextItemExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2898:1: ruleContextItemExpr returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleContextItemExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2901:28: ( ( () otherlv_1= '.' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2902:1: ( () otherlv_1= '.' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2902:1: ( () otherlv_1= '.' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2902:2: () otherlv_1= '.'
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2902:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2903:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContextItemExprAccess().getContextItemExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleContextItemExpr6391); 

                	newLeafNode(otherlv_1, grammarAccess.getContextItemExprAccess().getFullStopKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextItemExpr"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2920:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2921:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2922:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6427);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall6437); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2929:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_function_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_function_0_0 = null;

        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2932:28: ( ( ( (lv_function_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2933:1: ( ( (lv_function_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2933:1: ( ( (lv_function_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2933:2: ( (lv_function_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')'
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2933:2: ( (lv_function_0_0= ruleQName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2934:1: (lv_function_0_0= ruleQName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2934:1: (lv_function_0_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2935:3: lv_function_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionQNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleFunctionCall6483);
            lv_function_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFunctionCall6495); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2955:1: ( ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NCNAME||LA33_0==18||(LA33_0>=21 && LA33_0<=22)||LA33_0==24||(LA33_0>=44 && LA33_0<=45)||(LA33_0>=47 && LA33_0<=58)||(LA33_0>=80 && LA33_0<=91)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2955:2: ( (lv_parameter_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )*
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2955:2: ( (lv_parameter_2_0= ruleExprSingle ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2956:1: (lv_parameter_2_0= ruleExprSingle )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2956:1: (lv_parameter_2_0= ruleExprSingle )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2957:3: lv_parameter_2_0= ruleExprSingle
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterExprSingleParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall6517);
                    lv_parameter_2_0=ruleExprSingle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameter",
                            		lv_parameter_2_0, 
                            		"ExprSingle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2973:2: (otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2973:4: otherlv_3= ',' ( (lv_parameter_4_0= ruleExprSingle ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFunctionCall6530); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2977:1: ( (lv_parameter_4_0= ruleExprSingle ) )
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2978:1: (lv_parameter_4_0= ruleExprSingle )
                    	    {
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2978:1: (lv_parameter_4_0= ruleExprSingle )
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:2979:3: lv_parameter_4_0= ruleExprSingle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterExprSingleParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall6551);
                    	    lv_parameter_4_0=ruleExprSingle();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_4_0, 
                    	            		"ExprSingle");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCall6567); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleKindTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3007:1: entryRuleKindTest returns [EObject current=null] : iv_ruleKindTest= ruleKindTest EOF ;
    public final EObject entryRuleKindTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3008:2: (iv_ruleKindTest= ruleKindTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3009:2: iv_ruleKindTest= ruleKindTest EOF
            {
             newCompositeNode(grammarAccess.getKindTestRule()); 
            pushFollow(FOLLOW_ruleKindTest_in_entryRuleKindTest6603);
            iv_ruleKindTest=ruleKindTest();

            state._fsp--;

             current =iv_ruleKindTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKindTest6613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKindTest"


    // $ANTLR start "ruleKindTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3016:1: ruleKindTest returns [EObject current=null] : (this_DocumentTest_0= ruleDocumentTest | this_ElementTest_1= ruleElementTest | this_AttributeTest_2= ruleAttributeTest | this_SchemaElementTest_3= ruleSchemaElementTest | this_SchemaAttributeTest_4= ruleSchemaAttributeTest | this_PITest_5= rulePITest | this_CommentTest_6= ruleCommentTest | this_TextTest_7= ruleTextTest | this_AnyKindTest_8= ruleAnyKindTest ) ;
    public final EObject ruleKindTest() throws RecognitionException {
        EObject current = null;

        EObject this_DocumentTest_0 = null;

        EObject this_ElementTest_1 = null;

        EObject this_AttributeTest_2 = null;

        EObject this_SchemaElementTest_3 = null;

        EObject this_SchemaAttributeTest_4 = null;

        EObject this_PITest_5 = null;

        EObject this_CommentTest_6 = null;

        EObject this_TextTest_7 = null;

        EObject this_AnyKindTest_8 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3019:28: ( (this_DocumentTest_0= ruleDocumentTest | this_ElementTest_1= ruleElementTest | this_AttributeTest_2= ruleAttributeTest | this_SchemaElementTest_3= ruleSchemaElementTest | this_SchemaAttributeTest_4= ruleSchemaAttributeTest | this_PITest_5= rulePITest | this_CommentTest_6= ruleCommentTest | this_TextTest_7= ruleTextTest | this_AnyKindTest_8= ruleAnyKindTest ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3020:1: (this_DocumentTest_0= ruleDocumentTest | this_ElementTest_1= ruleElementTest | this_AttributeTest_2= ruleAttributeTest | this_SchemaElementTest_3= ruleSchemaElementTest | this_SchemaAttributeTest_4= ruleSchemaAttributeTest | this_PITest_5= rulePITest | this_CommentTest_6= ruleCommentTest | this_TextTest_7= ruleTextTest | this_AnyKindTest_8= ruleAnyKindTest )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3020:1: (this_DocumentTest_0= ruleDocumentTest | this_ElementTest_1= ruleElementTest | this_AttributeTest_2= ruleAttributeTest | this_SchemaElementTest_3= ruleSchemaElementTest | this_SchemaAttributeTest_4= ruleSchemaAttributeTest | this_PITest_5= rulePITest | this_CommentTest_6= ruleCommentTest | this_TextTest_7= ruleTextTest | this_AnyKindTest_8= ruleAnyKindTest )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt34=1;
                }
                break;
            case 55:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            case 53:
                {
                alt34=4;
                }
                break;
            case 52:
                {
                alt34=5;
                }
                break;
            case 51:
                {
                alt34=6;
                }
                break;
            case 50:
                {
                alt34=7;
                }
                break;
            case 49:
                {
                alt34=8;
                }
                break;
            case 47:
                {
                alt34=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3021:5: this_DocumentTest_0= ruleDocumentTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getDocumentTestParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDocumentTest_in_ruleKindTest6660);
                    this_DocumentTest_0=ruleDocumentTest();

                    state._fsp--;

                     
                            current = this_DocumentTest_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3031:5: this_ElementTest_1= ruleElementTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getElementTestParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementTest_in_ruleKindTest6687);
                    this_ElementTest_1=ruleElementTest();

                    state._fsp--;

                     
                            current = this_ElementTest_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3041:5: this_AttributeTest_2= ruleAttributeTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getAttributeTestParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAttributeTest_in_ruleKindTest6714);
                    this_AttributeTest_2=ruleAttributeTest();

                    state._fsp--;

                     
                            current = this_AttributeTest_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3051:5: this_SchemaElementTest_3= ruleSchemaElementTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getSchemaElementTestParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleKindTest6741);
                    this_SchemaElementTest_3=ruleSchemaElementTest();

                    state._fsp--;

                     
                            current = this_SchemaElementTest_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3061:5: this_SchemaAttributeTest_4= ruleSchemaAttributeTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getSchemaAttributeTestParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest6768);
                    this_SchemaAttributeTest_4=ruleSchemaAttributeTest();

                    state._fsp--;

                     
                            current = this_SchemaAttributeTest_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3071:5: this_PITest_5= rulePITest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getPITestParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePITest_in_ruleKindTest6795);
                    this_PITest_5=rulePITest();

                    state._fsp--;

                     
                            current = this_PITest_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3081:5: this_CommentTest_6= ruleCommentTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getCommentTestParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCommentTest_in_ruleKindTest6822);
                    this_CommentTest_6=ruleCommentTest();

                    state._fsp--;

                     
                            current = this_CommentTest_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3091:5: this_TextTest_7= ruleTextTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getTextTestParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleTextTest_in_ruleKindTest6849);
                    this_TextTest_7=ruleTextTest();

                    state._fsp--;

                     
                            current = this_TextTest_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3101:5: this_AnyKindTest_8= ruleAnyKindTest
                    {
                     
                            newCompositeNode(grammarAccess.getKindTestAccess().getAnyKindTestParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleAnyKindTest_in_ruleKindTest6876);
                    this_AnyKindTest_8=ruleAnyKindTest();

                    state._fsp--;

                     
                            current = this_AnyKindTest_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKindTest"


    // $ANTLR start "entryRuleElementDeclaration"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3117:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3118:2: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3119:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration6911);
            iv_ruleElementDeclaration=ruleElementDeclaration();

            state._fsp--;

             current =iv_ruleElementDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration6921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3126:1: ruleElementDeclaration returns [EObject current=null] : this_ElementName_0= ruleElementName ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ElementName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3129:28: (this_ElementName_0= ruleElementName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3131:5: this_ElementName_0= ruleElementName
            {
             
                    newCompositeNode(grammarAccess.getElementDeclarationAccess().getElementNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleElementName_in_ruleElementDeclaration6967);
            this_ElementName_0=ruleElementName();

            state._fsp--;

             
                    current = this_ElementName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleAttributeName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3147:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3148:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3149:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName7001);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName7011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3156:1: ruleAttributeName returns [EObject current=null] : this_QName_0= ruleQName ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3159:28: (this_QName_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3161:5: this_QName_0= ruleQName
            {
             
                    newCompositeNode(grammarAccess.getAttributeNameAccess().getQNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleAttributeName7057);
            this_QName_0=ruleQName();

            state._fsp--;

             
                    current = this_QName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleElementName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3177:1: entryRuleElementName returns [EObject current=null] : iv_ruleElementName= ruleElementName EOF ;
    public final EObject entryRuleElementName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3178:2: (iv_ruleElementName= ruleElementName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3179:2: iv_ruleElementName= ruleElementName EOF
            {
             newCompositeNode(grammarAccess.getElementNameRule()); 
            pushFollow(FOLLOW_ruleElementName_in_entryRuleElementName7091);
            iv_ruleElementName=ruleElementName();

            state._fsp--;

             current =iv_ruleElementName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementName7101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementName"


    // $ANTLR start "ruleElementName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3186:1: ruleElementName returns [EObject current=null] : this_QName_0= ruleQName ;
    public final EObject ruleElementName() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3189:28: (this_QName_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3191:5: this_QName_0= ruleQName
            {
             
                    newCompositeNode(grammarAccess.getElementNameAccess().getQNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleElementName7147);
            this_QName_0=ruleQName();

            state._fsp--;

             
                    current = this_QName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementName"


    // $ANTLR start "entryRuleTypeName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3207:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3208:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3209:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName7181);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName7191); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3216:1: ruleTypeName returns [EObject current=null] : this_QName_0= ruleQName ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3219:28: (this_QName_0= ruleQName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3221:5: this_QName_0= ruleQName
            {
             
                    newCompositeNode(grammarAccess.getTypeNameAccess().getQNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleTypeName7237);
            this_QName_0=ruleQName();

            state._fsp--;

             
                    current = this_QName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleAnyKindTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3237:1: entryRuleAnyKindTest returns [EObject current=null] : iv_ruleAnyKindTest= ruleAnyKindTest EOF ;
    public final EObject entryRuleAnyKindTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyKindTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3238:2: (iv_ruleAnyKindTest= ruleAnyKindTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3239:2: iv_ruleAnyKindTest= ruleAnyKindTest EOF
            {
             newCompositeNode(grammarAccess.getAnyKindTestRule()); 
            pushFollow(FOLLOW_ruleAnyKindTest_in_entryRuleAnyKindTest7271);
            iv_ruleAnyKindTest=ruleAnyKindTest();

            state._fsp--;

             current =iv_ruleAnyKindTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyKindTest7281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyKindTest"


    // $ANTLR start "ruleAnyKindTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3246:1: ruleAnyKindTest returns [EObject current=null] : ( () (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' ) ) ;
    public final EObject ruleAnyKindTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3249:28: ( ( () (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3250:1: ( () (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3250:1: ( () (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3250:2: () (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3250:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3251:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyKindTestAccess().getAnyKindTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3256:2: (otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3256:4: otherlv_1= 'node' otherlv_2= '(' otherlv_3= ')'
            {
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAnyKindTest7328); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyKindTestAccess().getNodeKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAnyKindTest7340); 

                	newLeafNode(otherlv_2, grammarAccess.getAnyKindTestAccess().getLeftParenthesisKeyword_1_1());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleAnyKindTest7352); 

                	newLeafNode(otherlv_3, grammarAccess.getAnyKindTestAccess().getRightParenthesisKeyword_1_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyKindTest"


    // $ANTLR start "entryRuleDocumentTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3276:1: entryRuleDocumentTest returns [EObject current=null] : iv_ruleDocumentTest= ruleDocumentTest EOF ;
    public final EObject entryRuleDocumentTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3277:2: (iv_ruleDocumentTest= ruleDocumentTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3278:2: iv_ruleDocumentTest= ruleDocumentTest EOF
            {
             newCompositeNode(grammarAccess.getDocumentTestRule()); 
            pushFollow(FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest7389);
            iv_ruleDocumentTest=ruleDocumentTest();

            state._fsp--;

             current =iv_ruleDocumentTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTest7399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentTest"


    // $ANTLR start "ruleDocumentTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3285:1: ruleDocumentTest returns [EObject current=null] : ( () (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) ) ;
    public final EObject ruleDocumentTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elementTest_3_0 = null;

        EObject lv_schemaElementTest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3288:28: ( ( () (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3289:1: ( () (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3289:1: ( () (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3289:2: () (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3289:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3290:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDocumentTestAccess().getDocumentTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3295:2: (otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3295:4: otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleDocumentTest7446); 

                	newLeafNode(otherlv_1, grammarAccess.getDocumentTestAccess().getDocumentNodeKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDocumentTest7458); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentTestAccess().getLeftParenthesisKeyword_1_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3303:1: ( ( (lv_elementTest_3_0= ruleElementTest ) ) | ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            else if ( (LA35_0==53) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3303:2: ( (lv_elementTest_3_0= ruleElementTest ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3303:2: ( (lv_elementTest_3_0= ruleElementTest ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3304:1: (lv_elementTest_3_0= ruleElementTest )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3304:1: (lv_elementTest_3_0= ruleElementTest )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3305:3: lv_elementTest_3_0= ruleElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getElementTestElementTestParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementTest_in_ruleDocumentTest7480);
                    lv_elementTest_3_0=ruleElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentTestRule());
                    	        }
                           		set(
                           			current, 
                           			"elementTest",
                            		lv_elementTest_3_0, 
                            		"ElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3322:6: ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3322:6: ( (lv_schemaElementTest_4_0= ruleSchemaElementTest ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3323:1: (lv_schemaElementTest_4_0= ruleSchemaElementTest )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3323:1: (lv_schemaElementTest_4_0= ruleSchemaElementTest )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3324:3: lv_schemaElementTest_4_0= ruleSchemaElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getSchemaElementTestSchemaElementTestParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest7507);
                    lv_schemaElementTest_4_0=ruleSchemaElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentTestRule());
                    	        }
                           		set(
                           			current, 
                           			"schemaElementTest",
                            		lv_schemaElementTest_4_0, 
                            		"SchemaElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleDocumentTest7521); 

                	newLeafNode(otherlv_5, grammarAccess.getDocumentTestAccess().getRightParenthesisKeyword_1_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentTest"


    // $ANTLR start "entryRuleTextTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3352:1: entryRuleTextTest returns [EObject current=null] : iv_ruleTextTest= ruleTextTest EOF ;
    public final EObject entryRuleTextTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3353:2: (iv_ruleTextTest= ruleTextTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3354:2: iv_ruleTextTest= ruleTextTest EOF
            {
             newCompositeNode(grammarAccess.getTextTestRule()); 
            pushFollow(FOLLOW_ruleTextTest_in_entryRuleTextTest7558);
            iv_ruleTextTest=ruleTextTest();

            state._fsp--;

             current =iv_ruleTextTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextTest7568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextTest"


    // $ANTLR start "ruleTextTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3361:1: ruleTextTest returns [EObject current=null] : ( () (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' ) ) ;
    public final EObject ruleTextTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3364:28: ( ( () (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3365:1: ( () (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3365:1: ( () (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3365:2: () (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3365:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3366:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextTestAccess().getTextTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3371:2: (otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3371:4: otherlv_1= 'text' otherlv_2= '(' otherlv_3= ')'
            {
            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleTextTest7615); 

                	newLeafNode(otherlv_1, grammarAccess.getTextTestAccess().getTextKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTextTest7627); 

                	newLeafNode(otherlv_2, grammarAccess.getTextTestAccess().getLeftParenthesisKeyword_1_1());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTextTest7639); 

                	newLeafNode(otherlv_3, grammarAccess.getTextTestAccess().getRightParenthesisKeyword_1_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextTest"


    // $ANTLR start "entryRuleCommentTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3391:1: entryRuleCommentTest returns [EObject current=null] : iv_ruleCommentTest= ruleCommentTest EOF ;
    public final EObject entryRuleCommentTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3392:2: (iv_ruleCommentTest= ruleCommentTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3393:2: iv_ruleCommentTest= ruleCommentTest EOF
            {
             newCompositeNode(grammarAccess.getCommentTestRule()); 
            pushFollow(FOLLOW_ruleCommentTest_in_entryRuleCommentTest7676);
            iv_ruleCommentTest=ruleCommentTest();

            state._fsp--;

             current =iv_ruleCommentTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentTest7686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentTest"


    // $ANTLR start "ruleCommentTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3400:1: ruleCommentTest returns [EObject current=null] : ( () (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' ) ) ;
    public final EObject ruleCommentTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3403:28: ( ( () (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3404:1: ( () (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3404:1: ( () (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3404:2: () (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3404:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3405:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCommentTestAccess().getCommentTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3410:2: (otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3410:4: otherlv_1= 'comment' otherlv_2= '(' otherlv_3= ')'
            {
            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleCommentTest7733); 

                	newLeafNode(otherlv_1, grammarAccess.getCommentTestAccess().getCommentKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleCommentTest7745); 

                	newLeafNode(otherlv_2, grammarAccess.getCommentTestAccess().getLeftParenthesisKeyword_1_1());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCommentTest7757); 

                	newLeafNode(otherlv_3, grammarAccess.getCommentTestAccess().getRightParenthesisKeyword_1_2());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentTest"


    // $ANTLR start "entryRulePITest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3430:1: entryRulePITest returns [EObject current=null] : iv_rulePITest= rulePITest EOF ;
    public final EObject entryRulePITest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePITest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3431:2: (iv_rulePITest= rulePITest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3432:2: iv_rulePITest= rulePITest EOF
            {
             newCompositeNode(grammarAccess.getPITestRule()); 
            pushFollow(FOLLOW_rulePITest_in_entryRulePITest7794);
            iv_rulePITest=rulePITest();

            state._fsp--;

             current =iv_rulePITest; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePITest7804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePITest"


    // $ANTLR start "rulePITest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3439:1: rulePITest returns [EObject current=null] : ( () (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' ) ) ;
    public final EObject rulePITest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_string_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3442:28: ( ( () (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3443:1: ( () (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3443:1: ( () (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3443:2: () (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3443:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3444:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPITestAccess().getPITestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3449:2: (otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3449:4: otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )? otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,51,FOLLOW_51_in_rulePITest7851); 

                	newLeafNode(otherlv_1, grammarAccess.getPITestAccess().getProcessingInstructionKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulePITest7863); 

                	newLeafNode(otherlv_2, grammarAccess.getPITestAccess().getLeftParenthesisKeyword_1_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3457:1: ( ( (lv_name_3_0= RULE_NCNAME ) ) | ( (lv_string_4_0= ruleStringLiteral ) ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_NCNAME) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3457:2: ( (lv_name_3_0= RULE_NCNAME ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3457:2: ( (lv_name_3_0= RULE_NCNAME ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3458:1: (lv_name_3_0= RULE_NCNAME )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3458:1: (lv_name_3_0= RULE_NCNAME )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3459:3: lv_name_3_0= RULE_NCNAME
                    {
                    lv_name_3_0=(Token)match(input,RULE_NCNAME,FOLLOW_RULE_NCNAME_in_rulePITest7881); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getPITestAccess().getNameNCNAMETerminalRuleCall_1_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPITestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"NCNAME");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3476:6: ( (lv_string_4_0= ruleStringLiteral ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3476:6: ( (lv_string_4_0= ruleStringLiteral ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3477:1: (lv_string_4_0= ruleStringLiteral )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3477:1: (lv_string_4_0= ruleStringLiteral )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3478:3: lv_string_4_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPITestAccess().getStringStringLiteralParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePITest7913);
                    lv_string_4_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPITestRule());
                    	        }
                           		set(
                           			current, 
                           			"string",
                            		lv_string_4_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulePITest7927); 

                	newLeafNode(otherlv_5, grammarAccess.getPITestAccess().getRightParenthesisKeyword_1_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePITest"


    // $ANTLR start "entryRuleSchemaAttributeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3506:1: entryRuleSchemaAttributeTest returns [EObject current=null] : iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF ;
    public final EObject entryRuleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaAttributeTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3507:2: (iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3508:2: iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaAttributeTestRule()); 
            pushFollow(FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest7964);
            iv_ruleSchemaAttributeTest=ruleSchemaAttributeTest();

            state._fsp--;

             current =iv_ruleSchemaAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaAttributeTest7974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaAttributeTest"


    // $ANTLR start "ruleSchemaAttributeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3515:1: ruleSchemaAttributeTest returns [EObject current=null] : (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributeDeclaration_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3518:28: ( (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3519:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3519:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3519:3: otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleSchemaAttributeTest8011); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaAttributeTestAccess().getSchemaAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSchemaAttributeTest8023); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaAttributeTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3527:1: ( (lv_attributeDeclaration_2_0= ruleAttributeDeclaration ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3528:1: (lv_attributeDeclaration_2_0= ruleAttributeDeclaration )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3528:1: (lv_attributeDeclaration_2_0= ruleAttributeDeclaration )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3529:3: lv_attributeDeclaration_2_0= ruleAttributeDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaAttributeTestAccess().getAttributeDeclarationAttributeDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest8044);
            lv_attributeDeclaration_2_0=ruleAttributeDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaAttributeTestRule());
            	        }
                   		set(
                   			current, 
                   			"attributeDeclaration",
                    		lv_attributeDeclaration_2_0, 
                    		"AttributeDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSchemaAttributeTest8056); 

                	newLeafNode(otherlv_3, grammarAccess.getSchemaAttributeTestAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaAttributeTest"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3557:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3558:2: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3559:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration8092);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;

             current =iv_ruleAttributeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDeclaration8102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3566:1: ruleAttributeDeclaration returns [EObject current=null] : this_AttributeName_0= ruleAttributeName ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeName_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3569:28: (this_AttributeName_0= ruleAttributeName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3571:5: this_AttributeName_0= ruleAttributeName
            {
             
                    newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getAttributeNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration8148);
            this_AttributeName_0=ruleAttributeName();

            state._fsp--;

             
                    current = this_AttributeName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleSchemaElementTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3587:1: entryRuleSchemaElementTest returns [EObject current=null] : iv_ruleSchemaElementTest= ruleSchemaElementTest EOF ;
    public final EObject entryRuleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaElementTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3588:2: (iv_ruleSchemaElementTest= ruleSchemaElementTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3589:2: iv_ruleSchemaElementTest= ruleSchemaElementTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaElementTestRule()); 
            pushFollow(FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest8182);
            iv_ruleSchemaElementTest=ruleSchemaElementTest();

            state._fsp--;

             current =iv_ruleSchemaElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaElementTest8192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaElementTest"


    // $ANTLR start "ruleSchemaElementTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3596:1: ruleSchemaElementTest returns [EObject current=null] : (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementDeclaration_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3599:28: ( (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3600:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3600:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3600:3: otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleSchemaElementTest8229); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaElementTestAccess().getSchemaElementKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSchemaElementTest8241); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaElementTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3608:1: ( (lv_elementDeclaration_2_0= ruleElementDeclaration ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3609:1: (lv_elementDeclaration_2_0= ruleElementDeclaration )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3609:1: (lv_elementDeclaration_2_0= ruleElementDeclaration )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3610:3: lv_elementDeclaration_2_0= ruleElementDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaElementTestAccess().getElementDeclarationElementDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest8262);
            lv_elementDeclaration_2_0=ruleElementDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaElementTestRule());
            	        }
                   		set(
                   			current, 
                   			"elementDeclaration",
                    		lv_elementDeclaration_2_0, 
                    		"ElementDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSchemaElementTest8274); 

                	newLeafNode(otherlv_3, grammarAccess.getSchemaElementTestAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaElementTest"


    // $ANTLR start "entryRuleUnaryExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3638:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3639:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3640:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr8310);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr8320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3647:1: ruleUnaryExpr returns [EObject current=null] : ( (lv_unary_0_0= ruleValueExpr ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_unary_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3650:28: ( ( (lv_unary_0_0= ruleValueExpr ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3651:1: ( (lv_unary_0_0= ruleValueExpr ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3651:1: ( (lv_unary_0_0= ruleValueExpr ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3652:1: (lv_unary_0_0= ruleValueExpr )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3652:1: (lv_unary_0_0= ruleValueExpr )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3653:3: lv_unary_0_0= ruleValueExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryValueExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValueExpr_in_ruleUnaryExpr8365);
            lv_unary_0_0=ruleValueExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"unary",
                    		lv_unary_0_0, 
                    		"ValueExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3677:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3678:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3679:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard8400);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard8410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3686:1: ruleWildcard returns [EObject current=null] : ( ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' ) | ( (lv_any_3_0= '*' ) ) ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_any_3_0=null;

         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3689:28: ( ( ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' ) | ( (lv_any_3_0= '*' ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:1: ( ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' ) | ( (lv_any_3_0= '*' ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:1: ( ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' ) | ( (lv_any_3_0= '*' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NCNAME) ) {
                alt37=1;
            }
            else if ( (LA37_0==54) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:2: ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:2: ( ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:3: ( (lv_prefix_0_0= RULE_NCNAME ) ) otherlv_1= ':' otherlv_2= '*'
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3690:3: ( (lv_prefix_0_0= RULE_NCNAME ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3691:1: (lv_prefix_0_0= RULE_NCNAME )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3691:1: (lv_prefix_0_0= RULE_NCNAME )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3692:3: lv_prefix_0_0= RULE_NCNAME
                    {
                    lv_prefix_0_0=(Token)match(input,RULE_NCNAME,FOLLOW_RULE_NCNAME_in_ruleWildcard8453); 

                    			newLeafNode(lv_prefix_0_0, grammarAccess.getWildcardAccess().getPrefixNCNAMETerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWildcardRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prefix",
                            		lv_prefix_0_0, 
                            		"NCNAME");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWildcard8470); 

                        	newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getColonKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleWildcard8482); 

                        	newLeafNode(otherlv_2, grammarAccess.getWildcardAccess().getAsteriskKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3717:6: ( (lv_any_3_0= '*' ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3717:6: ( (lv_any_3_0= '*' ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3718:1: (lv_any_3_0= '*' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3718:1: (lv_any_3_0= '*' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3719:3: lv_any_3_0= '*'
                    {
                    lv_any_3_0=(Token)match(input,54,FOLLOW_54_in_ruleWildcard8507); 

                            newLeafNode(lv_any_3_0, grammarAccess.getWildcardAccess().getAnyAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWildcardRule());
                    	        }
                           		setWithLastConsumed(current, "any", lv_any_3_0, "*");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleElementTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3740:1: entryRuleElementTest returns [EObject current=null] : iv_ruleElementTest= ruleElementTest EOF ;
    public final EObject entryRuleElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3741:2: (iv_ruleElementTest= ruleElementTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3742:2: iv_ruleElementTest= ruleElementTest EOF
            {
             newCompositeNode(grammarAccess.getElementTestRule()); 
            pushFollow(FOLLOW_ruleElementTest_in_entryRuleElementTest8556);
            iv_ruleElementTest=ruleElementTest();

            state._fsp--;

             current =iv_ruleElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementTest8566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementTest"


    // $ANTLR start "ruleElementTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3749:1: ruleElementTest returns [EObject current=null] : ( () (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' ) ) ;
    public final EObject ruleElementTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_question_6_0=null;
        Token otherlv_7=null;
        EObject lv_elementNameOrWildcard_3_0 = null;

        EObject lv_typeName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3752:28: ( ( () (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3753:1: ( () (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3753:1: ( () (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3753:2: () (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3753:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3754:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementTestAccess().getElementTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3759:2: (otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3759:4: otherlv_1= 'elementx' otherlv_2= '(' ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )? otherlv_7= ')'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleElementTest8613); 

                	newLeafNode(otherlv_1, grammarAccess.getElementTestAccess().getElementxKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleElementTest8625); 

                	newLeafNode(otherlv_2, grammarAccess.getElementTestAccess().getLeftParenthesisKeyword_1_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3767:1: ( ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NCNAME) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3767:2: ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )?
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3767:2: ( (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3768:1: (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3768:1: (lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3769:3: lv_elementNameOrWildcard_3_0= ruleElementNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTestAccess().getElementNameOrWildcardElementNameOrWildcardParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest8647);
                    lv_elementNameOrWildcard_3_0=ruleElementNameOrWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTestRule());
                    	        }
                           		set(
                           			current, 
                           			"elementNameOrWildcard",
                            		lv_elementNameOrWildcard_3_0, 
                            		"ElementNameOrWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3785:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )? )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==16) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3785:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) ( (lv_question_6_0= '?' ) )?
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementTest8660); 

                                	newLeafNode(otherlv_4, grammarAccess.getElementTestAccess().getCommaKeyword_1_2_1_0());
                                
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3789:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3790:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3790:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3791:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getElementTestAccess().getTypeNameTypeNameParserRuleCall_1_2_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleElementTest8681);
                            lv_typeName_5_0=ruleTypeName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getElementTestRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"typeName",
                                    		lv_typeName_5_0, 
                                    		"TypeName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3807:2: ( (lv_question_6_0= '?' ) )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==40) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3808:1: (lv_question_6_0= '?' )
                                    {
                                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3808:1: (lv_question_6_0= '?' )
                                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3809:3: lv_question_6_0= '?'
                                    {
                                    lv_question_6_0=(Token)match(input,40,FOLLOW_40_in_ruleElementTest8699); 

                                            newLeafNode(lv_question_6_0, grammarAccess.getElementTestAccess().getQuestionQuestionMarkKeyword_1_2_1_2_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getElementTestRule());
                                    	        }
                                           		setWithLastConsumed(current, "question", true, "?");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleElementTest8729); 

                	newLeafNode(otherlv_7, grammarAccess.getElementTestAccess().getRightParenthesisKeyword_1_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementTest"


    // $ANTLR start "entryRuleAttributeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3834:1: entryRuleAttributeTest returns [EObject current=null] : iv_ruleAttributeTest= ruleAttributeTest EOF ;
    public final EObject entryRuleAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeTest = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3835:2: (iv_ruleAttributeTest= ruleAttributeTest EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3836:2: iv_ruleAttributeTest= ruleAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getAttributeTestRule()); 
            pushFollow(FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest8766);
            iv_ruleAttributeTest=ruleAttributeTest();

            state._fsp--;

             current =iv_ruleAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeTest8776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeTest"


    // $ANTLR start "ruleAttributeTest"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3843:1: ruleAttributeTest returns [EObject current=null] : ( () (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) ) ;
    public final EObject ruleAttributeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributeNameOrWildcard_3_0 = null;

        EObject lv_typeName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3846:28: ( ( () (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3847:1: ( () (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3847:1: ( () (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3847:2: () (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3847:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3848:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeTestAccess().getAttributeTestAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3853:2: (otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3853:4: otherlv_1= 'attributex' otherlv_2= '(' ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')'
            {
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleAttributeTest8823); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeTestAccess().getAttributexKeyword_1_0());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAttributeTest8835); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeTestAccess().getLeftParenthesisKeyword_1_1());
                
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3861:1: ( ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_NCNAME) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3861:2: ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3861:2: ( (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3862:1: (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3862:1: (lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3863:3: lv_attributeNameOrWildcard_3_0= ruleAttribNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeTestAccess().getAttributeNameOrWildcardAttribNameOrWildcardParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest8857);
                    lv_attributeNameOrWildcard_3_0=ruleAttribNameOrWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeNameOrWildcard",
                            		lv_attributeNameOrWildcard_3_0, 
                            		"AttribNameOrWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3879:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==16) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3879:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAttributeTest8870); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttributeTestAccess().getCommaKeyword_1_2_1_0());
                                
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3883:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3884:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3884:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3885:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeTestAccess().getTypeNameTypeNameParserRuleCall_1_2_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleAttributeTest8891);
                            lv_typeName_5_0=ruleTypeName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeTestRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"typeName",
                                    		lv_typeName_5_0, 
                                    		"TypeName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleAttributeTest8907); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeTestAccess().getRightParenthesisKeyword_1_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeTest"


    // $ANTLR start "entryRuleAxisStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3913:1: entryRuleAxisStep returns [EObject current=null] : iv_ruleAxisStep= ruleAxisStep EOF ;
    public final EObject entryRuleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxisStep = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3914:2: (iv_ruleAxisStep= ruleAxisStep EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3915:2: iv_ruleAxisStep= ruleAxisStep EOF
            {
             newCompositeNode(grammarAccess.getAxisStepRule()); 
            pushFollow(FOLLOW_ruleAxisStep_in_entryRuleAxisStep8944);
            iv_ruleAxisStep=ruleAxisStep();

            state._fsp--;

             current =iv_ruleAxisStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxisStep8954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxisStep"


    // $ANTLR start "ruleAxisStep"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3922:1: ruleAxisStep returns [EObject current=null] : ( ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) ) ( (lv_predicate_2_0= rulePredicate ) )* ) ;
    public final EObject ruleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject lv_reverseStep_0_0 = null;

        EObject lv_forwardStep_1_0 = null;

        EObject lv_predicate_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3925:28: ( ( ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) ) ( (lv_predicate_2_0= rulePredicate ) )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:1: ( ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) ) ( (lv_predicate_2_0= rulePredicate ) )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:1: ( ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) ) ( (lv_predicate_2_0= rulePredicate ) )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:2: ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) ) ( (lv_predicate_2_0= rulePredicate ) )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:2: ( ( (lv_reverseStep_0_0= ruleReverseStep ) ) | ( (lv_forwardStep_1_0= ruleForwardStep ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44||(LA43_0>=80 && LA43_0<=84)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_NCNAME||LA43_0==45||(LA43_0>=47 && LA43_0<=56)||(LA43_0>=85 && LA43_0<=91)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:3: ( (lv_reverseStep_0_0= ruleReverseStep ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3926:3: ( (lv_reverseStep_0_0= ruleReverseStep ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3927:1: (lv_reverseStep_0_0= ruleReverseStep )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3927:1: (lv_reverseStep_0_0= ruleReverseStep )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3928:3: lv_reverseStep_0_0= ruleReverseStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getReverseStepReverseStepParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReverseStep_in_ruleAxisStep9001);
                    lv_reverseStep_0_0=ruleReverseStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
                    	        }
                           		set(
                           			current, 
                           			"reverseStep",
                            		lv_reverseStep_0_0, 
                            		"ReverseStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3945:6: ( (lv_forwardStep_1_0= ruleForwardStep ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3945:6: ( (lv_forwardStep_1_0= ruleForwardStep ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3946:1: (lv_forwardStep_1_0= ruleForwardStep )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3946:1: (lv_forwardStep_1_0= ruleForwardStep )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3947:3: lv_forwardStep_1_0= ruleForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getForwardStepForwardStepParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardStep_in_ruleAxisStep9028);
                    lv_forwardStep_1_0=ruleForwardStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
                    	        }
                           		set(
                           			current, 
                           			"forwardStep",
                            		lv_forwardStep_1_0, 
                            		"ForwardStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3963:3: ( (lv_predicate_2_0= rulePredicate ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==41) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3964:1: (lv_predicate_2_0= rulePredicate )
            	    {
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3964:1: (lv_predicate_2_0= rulePredicate )
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3965:3: lv_predicate_2_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAxisStepAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicate_in_ruleAxisStep9050);
            	    lv_predicate_2_0=rulePredicate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"predicate",
            	            		lv_predicate_2_0, 
            	            		"Predicate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxisStep"


    // $ANTLR start "entryRuleStepExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3989:1: entryRuleStepExpr returns [EObject current=null] : iv_ruleStepExpr= ruleStepExpr EOF ;
    public final EObject entryRuleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3990:2: (iv_ruleStepExpr= ruleStepExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3991:2: iv_ruleStepExpr= ruleStepExpr EOF
            {
             newCompositeNode(grammarAccess.getStepExprRule()); 
            pushFollow(FOLLOW_ruleStepExpr_in_entryRuleStepExpr9087);
            iv_ruleStepExpr=ruleStepExpr();

            state._fsp--;

             current =iv_ruleStepExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepExpr9097); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepExpr"


    // $ANTLR start "ruleStepExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:3998:1: ruleStepExpr returns [EObject current=null] : this_AxisStep_0= ruleAxisStep ;
    public final EObject ruleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AxisStep_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4001:28: (this_AxisStep_0= ruleAxisStep )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4003:5: this_AxisStep_0= ruleAxisStep
            {
             
                    newCompositeNode(grammarAccess.getStepExprAccess().getAxisStepParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAxisStep_in_ruleStepExpr9143);
            this_AxisStep_0=ruleAxisStep();

            state._fsp--;

             
                    current = this_AxisStep_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepExpr"


    // $ANTLR start "entryRulePathExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4021:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4022:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4023:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr9179);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr9189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathExpr"


    // $ANTLR start "rulePathExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4030:1: rulePathExpr returns [EObject current=null] : ( ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? ) | ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) ) | ( (lv_relativePath_4_0= ruleRelativePathExpr ) ) ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token lv_separator_0_0=null;
        Token lv_separator_2_0=null;
        EObject lv_relativePath_1_0 = null;

        EObject lv_relativePath_3_0 = null;

        EObject lv_relativePath_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4033:28: ( ( ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? ) | ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) ) | ( (lv_relativePath_4_0= ruleRelativePathExpr ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:1: ( ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? ) | ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) ) | ( (lv_relativePath_4_0= ruleRelativePathExpr ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:1: ( ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? ) | ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) ) | ( (lv_relativePath_4_0= ruleRelativePathExpr ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt46=1;
                }
                break;
            case 58:
                {
                alt46=2;
                }
                break;
            case RULE_NCNAME:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:2: ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:2: ( ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )? )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:3: ( (lv_separator_0_0= '/' ) ) ( (lv_relativePath_1_0= ruleRelativePathExpr ) )?
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4034:3: ( (lv_separator_0_0= '/' ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4035:1: (lv_separator_0_0= '/' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4035:1: (lv_separator_0_0= '/' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4036:3: lv_separator_0_0= '/'
                    {
                    lv_separator_0_0=(Token)match(input,57,FOLLOW_57_in_rulePathExpr9233); 

                            newLeafNode(lv_separator_0_0, grammarAccess.getPathExprAccess().getSeparatorSolidusKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathExprRule());
                    	        }
                           		setWithLastConsumed(current, "separator", lv_separator_0_0, "/");
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4049:2: ( (lv_relativePath_1_0= ruleRelativePathExpr ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_NCNAME||(LA45_0>=44 && LA45_0<=45)||(LA45_0>=47 && LA45_0<=56)||(LA45_0>=80 && LA45_0<=91)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4050:1: (lv_relativePath_1_0= ruleRelativePathExpr )
                            {
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4050:1: (lv_relativePath_1_0= ruleRelativePathExpr )
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4051:3: lv_relativePath_1_0= ruleRelativePathExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathRelativePathExprParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr9267);
                            lv_relativePath_1_0=ruleRelativePathExpr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPathExprRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"relativePath",
                                    		lv_relativePath_1_0, 
                                    		"RelativePathExpr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4068:6: ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4068:6: ( ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4068:7: ( (lv_separator_2_0= '//' ) ) ( (lv_relativePath_3_0= ruleRelativePathExpr ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4068:7: ( (lv_separator_2_0= '//' ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4069:1: (lv_separator_2_0= '//' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4069:1: (lv_separator_2_0= '//' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4070:3: lv_separator_2_0= '//'
                    {
                    lv_separator_2_0=(Token)match(input,58,FOLLOW_58_in_rulePathExpr9294); 

                            newLeafNode(lv_separator_2_0, grammarAccess.getPathExprAccess().getSeparatorSolidusSolidusKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathExprRule());
                    	        }
                           		setWithLastConsumed(current, "separator", lv_separator_2_0, "//");
                    	    

                    }


                    }

                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4083:2: ( (lv_relativePath_3_0= ruleRelativePathExpr ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4084:1: (lv_relativePath_3_0= ruleRelativePathExpr )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4084:1: (lv_relativePath_3_0= ruleRelativePathExpr )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4085:3: lv_relativePath_3_0= ruleRelativePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathRelativePathExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr9328);
                    lv_relativePath_3_0=ruleRelativePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExprRule());
                    	        }
                           		set(
                           			current, 
                           			"relativePath",
                            		lv_relativePath_3_0, 
                            		"RelativePathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4102:6: ( (lv_relativePath_4_0= ruleRelativePathExpr ) )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4102:6: ( (lv_relativePath_4_0= ruleRelativePathExpr ) )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4103:1: (lv_relativePath_4_0= ruleRelativePathExpr )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4103:1: (lv_relativePath_4_0= ruleRelativePathExpr )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4104:3: lv_relativePath_4_0= ruleRelativePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathRelativePathExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr9356);
                    lv_relativePath_4_0=ruleRelativePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExprRule());
                    	        }
                           		set(
                           			current, 
                           			"relativePath",
                            		lv_relativePath_4_0, 
                            		"RelativePathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathExpr"


    // $ANTLR start "entryRuleAttribNameOrWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4128:1: entryRuleAttribNameOrWildcard returns [EObject current=null] : iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF ;
    public final EObject entryRuleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribNameOrWildcard = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4129:2: (iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4130:2: iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getAttribNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard9392);
            iv_ruleAttribNameOrWildcard=ruleAttribNameOrWildcard();

            state._fsp--;

             current =iv_ruleAttribNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribNameOrWildcard9402); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribNameOrWildcard"


    // $ANTLR start "ruleAttribNameOrWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4137:1: ruleAttribNameOrWildcard returns [EObject current=null] : ( () ( (lv_attributeName_1_0= ruleAttributeName ) ) ) ;
    public final EObject ruleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4140:28: ( ( () ( (lv_attributeName_1_0= ruleAttributeName ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4141:1: ( () ( (lv_attributeName_1_0= ruleAttributeName ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4141:1: ( () ( (lv_attributeName_1_0= ruleAttributeName ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4141:2: () ( (lv_attributeName_1_0= ruleAttributeName ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4141:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4142:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttribNameOrWildcardAccess().getAttribNameOrWildcardAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4147:2: ( (lv_attributeName_1_0= ruleAttributeName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4148:1: (lv_attributeName_1_0= ruleAttributeName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4148:1: (lv_attributeName_1_0= ruleAttributeName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4149:3: lv_attributeName_1_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getAttribNameOrWildcardAccess().getAttributeNameAttributeNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard9457);
            lv_attributeName_1_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttribNameOrWildcardRule());
            	        }
                   		set(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_1_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribNameOrWildcard"


    // $ANTLR start "entryRuleElementNameOrWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4173:1: entryRuleElementNameOrWildcard returns [EObject current=null] : iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF ;
    public final EObject entryRuleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementNameOrWildcard = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4174:2: (iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4175:2: iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getElementNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard9493);
            iv_ruleElementNameOrWildcard=ruleElementNameOrWildcard();

            state._fsp--;

             current =iv_ruleElementNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementNameOrWildcard9503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementNameOrWildcard"


    // $ANTLR start "ruleElementNameOrWildcard"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4182:1: ruleElementNameOrWildcard returns [EObject current=null] : ( () ( (lv_elementName_1_0= ruleElementName ) ) ) ;
    public final EObject ruleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject lv_elementName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4185:28: ( ( () ( (lv_elementName_1_0= ruleElementName ) ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4186:1: ( () ( (lv_elementName_1_0= ruleElementName ) ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4186:1: ( () ( (lv_elementName_1_0= ruleElementName ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4186:2: () ( (lv_elementName_1_0= ruleElementName ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4186:2: ()
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4187:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementNameOrWildcardAccess().getElementNameOrWildcardAction_0(),
                        current);
                

            }

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4192:2: ( (lv_elementName_1_0= ruleElementName ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4193:1: (lv_elementName_1_0= ruleElementName )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4193:1: (lv_elementName_1_0= ruleElementName )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4194:3: lv_elementName_1_0= ruleElementName
            {
             
            	        newCompositeNode(grammarAccess.getElementNameOrWildcardAccess().getElementNameElementNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleElementName_in_ruleElementNameOrWildcard9558);
            lv_elementName_1_0=ruleElementName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementNameOrWildcardRule());
            	        }
                   		set(
                   			current, 
                   			"elementName",
                    		lv_elementName_1_0, 
                    		"ElementName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementNameOrWildcard"


    // $ANTLR start "entryRulePrimaryExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4218:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4219:2: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4220:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr9594);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr9604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4227:1: rulePrimaryExpr returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ParenthesizedExpr_2= ruleParenthesizedExpr | this_ContextItemExpr_3= ruleContextItemExpr | this_FunctionCall_4= ruleFunctionCall ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_ParenthesizedExpr_2 = null;

        EObject this_ContextItemExpr_3 = null;

        EObject this_FunctionCall_4 = null;


         enterRule(); 
            
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4230:28: ( (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ParenthesizedExpr_2= ruleParenthesizedExpr | this_ContextItemExpr_3= ruleContextItemExpr | this_FunctionCall_4= ruleFunctionCall ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4231:1: (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ParenthesizedExpr_2= ruleParenthesizedExpr | this_ContextItemExpr_3= ruleContextItemExpr | this_FunctionCall_4= ruleFunctionCall )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4231:1: (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ParenthesizedExpr_2= ruleParenthesizedExpr | this_ContextItemExpr_3= ruleContextItemExpr | this_FunctionCall_4= ruleFunctionCall )
            int alt47=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_DOUBLE:
            case RULE_STRING:
                {
                alt47=1;
                }
                break;
            case 19:
                {
                alt47=2;
                }
                break;
            case 25:
                {
                alt47=3;
                }
                break;
            case 46:
                {
                alt47=4;
                }
                break;
            case RULE_NCNAME:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4232:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExprAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpr9651);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4242:5: this_VarRef_1= ruleVarRef
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExprAccess().getVarRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarRef_in_rulePrimaryExpr9678);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;

                     
                            current = this_VarRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4252:5: this_ParenthesizedExpr_2= ruleParenthesizedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExprAccess().getParenthesizedExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr9705);
                    this_ParenthesizedExpr_2=ruleParenthesizedExpr();

                    state._fsp--;

                     
                            current = this_ParenthesizedExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4262:5: this_ContextItemExpr_3= ruleContextItemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExprAccess().getContextItemExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleContextItemExpr_in_rulePrimaryExpr9732);
                    this_ContextItemExpr_3=ruleContextItemExpr();

                    state._fsp--;

                     
                            current = this_ContextItemExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4272:5: this_FunctionCall_4= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExprAccess().getFunctionCallParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpr9759);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "ruleIntersectExcept"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4288:1: ruleIntersectExcept returns [Enumerator current=null] : ( (enumLiteral_0= 'intersect' ) | (enumLiteral_1= 'except' ) ) ;
    public final Enumerator ruleIntersectExcept() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4290:28: ( ( (enumLiteral_0= 'intersect' ) | (enumLiteral_1= 'except' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4291:1: ( (enumLiteral_0= 'intersect' ) | (enumLiteral_1= 'except' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4291:1: ( (enumLiteral_0= 'intersect' ) | (enumLiteral_1= 'except' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            else if ( (LA48_0==60) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4291:2: (enumLiteral_0= 'intersect' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4291:2: (enumLiteral_0= 'intersect' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4291:4: enumLiteral_0= 'intersect'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleIntersectExcept9808); 

                            current = grammarAccess.getIntersectExceptAccess().getIntersectEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntersectExceptAccess().getIntersectEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4297:6: (enumLiteral_1= 'except' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4297:6: (enumLiteral_1= 'except' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4297:8: enumLiteral_1= 'except'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleIntersectExcept9825); 

                            current = grammarAccess.getIntersectExceptAccess().getExceptEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntersectExceptAccess().getExceptEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntersectExcept"


    // $ANTLR start "ruleUnion"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4307:1: ruleUnion returns [Enumerator current=null] : ( (enumLiteral_0= 'union' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleUnion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4309:28: ( ( (enumLiteral_0= 'union' ) | (enumLiteral_1= '|' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4310:1: ( (enumLiteral_0= 'union' ) | (enumLiteral_1= '|' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4310:1: ( (enumLiteral_0= 'union' ) | (enumLiteral_1= '|' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            else if ( (LA49_0==62) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4310:2: (enumLiteral_0= 'union' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4310:2: (enumLiteral_0= 'union' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4310:4: enumLiteral_0= 'union'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleUnion9870); 

                            current = grammarAccess.getUnionAccess().getUnionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnionAccess().getUnionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4316:6: (enumLiteral_1= '|' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4316:6: (enumLiteral_1= '|' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4316:8: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleUnion9887); 

                            current = grammarAccess.getUnionAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnionAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnion"


    // $ANTLR start "ruleAdditive"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4326:1: ruleAdditive returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditive() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4328:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4329:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4329:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==63) ) {
                alt50=1;
            }
            else if ( (LA50_0==64) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4329:2: (enumLiteral_0= '+' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4329:2: (enumLiteral_0= '+' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4329:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleAdditive9932); 

                            current = grammarAccess.getAdditiveAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditiveAccess().getPlusEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4335:6: (enumLiteral_1= '-' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4335:6: (enumLiteral_1= '-' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4335:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleAdditive9949); 

                            current = grammarAccess.getAdditiveAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditiveAccess().getMinusEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditive"


    // $ANTLR start "ruleGeneralComp"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4345:1: ruleGeneralComp returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator ruleGeneralComp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4347:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4348:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4348:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt51=1;
                }
                break;
            case 66:
                {
                alt51=2;
                }
                break;
            case 67:
                {
                alt51=3;
                }
                break;
            case 68:
                {
                alt51=4;
                }
                break;
            case 69:
                {
                alt51=5;
                }
                break;
            case 70:
                {
                alt51=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4348:2: (enumLiteral_0= '=' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4348:2: (enumLiteral_0= '=' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4348:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleGeneralComp9994); 

                            current = grammarAccess.getGeneralCompAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGeneralCompAccess().getEqEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4354:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4354:6: (enumLiteral_1= '!=' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4354:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleGeneralComp10011); 

                            current = grammarAccess.getGeneralCompAccess().getNeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGeneralCompAccess().getNeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4360:6: (enumLiteral_2= '<' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4360:6: (enumLiteral_2= '<' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4360:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleGeneralComp10028); 

                            current = grammarAccess.getGeneralCompAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGeneralCompAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4366:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4366:6: (enumLiteral_3= '<=' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4366:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleGeneralComp10045); 

                            current = grammarAccess.getGeneralCompAccess().getLeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGeneralCompAccess().getLeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4372:6: (enumLiteral_4= '>' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4372:6: (enumLiteral_4= '>' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4372:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleGeneralComp10062); 

                            current = grammarAccess.getGeneralCompAccess().getGtEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getGeneralCompAccess().getGtEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4378:6: (enumLiteral_5= '>=' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4378:6: (enumLiteral_5= '>=' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4378:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleGeneralComp10079); 

                            current = grammarAccess.getGeneralCompAccess().getGeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getGeneralCompAccess().getGeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralComp"


    // $ANTLR start "ruleValueComp"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4388:1: ruleValueComp returns [Enumerator current=null] : ( (enumLiteral_0= 'eq' ) | (enumLiteral_1= 'ne' ) | (enumLiteral_2= 'lt' ) | (enumLiteral_3= 'le' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'ge' ) ) ;
    public final Enumerator ruleValueComp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4390:28: ( ( (enumLiteral_0= 'eq' ) | (enumLiteral_1= 'ne' ) | (enumLiteral_2= 'lt' ) | (enumLiteral_3= 'le' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'ge' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4391:1: ( (enumLiteral_0= 'eq' ) | (enumLiteral_1= 'ne' ) | (enumLiteral_2= 'lt' ) | (enumLiteral_3= 'le' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'ge' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4391:1: ( (enumLiteral_0= 'eq' ) | (enumLiteral_1= 'ne' ) | (enumLiteral_2= 'lt' ) | (enumLiteral_3= 'le' ) | (enumLiteral_4= 'gt' ) | (enumLiteral_5= 'ge' ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt52=1;
                }
                break;
            case 72:
                {
                alt52=2;
                }
                break;
            case 73:
                {
                alt52=3;
                }
                break;
            case 74:
                {
                alt52=4;
                }
                break;
            case 75:
                {
                alt52=5;
                }
                break;
            case 76:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4391:2: (enumLiteral_0= 'eq' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4391:2: (enumLiteral_0= 'eq' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4391:4: enumLiteral_0= 'eq'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleValueComp10124); 

                            current = grammarAccess.getValueCompAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getValueCompAccess().getEqEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4397:6: (enumLiteral_1= 'ne' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4397:6: (enumLiteral_1= 'ne' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4397:8: enumLiteral_1= 'ne'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleValueComp10141); 

                            current = grammarAccess.getValueCompAccess().getNeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getValueCompAccess().getNeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4403:6: (enumLiteral_2= 'lt' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4403:6: (enumLiteral_2= 'lt' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4403:8: enumLiteral_2= 'lt'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_73_in_ruleValueComp10158); 

                            current = grammarAccess.getValueCompAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getValueCompAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4409:6: (enumLiteral_3= 'le' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4409:6: (enumLiteral_3= 'le' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4409:8: enumLiteral_3= 'le'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_74_in_ruleValueComp10175); 

                            current = grammarAccess.getValueCompAccess().getLeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getValueCompAccess().getLeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4415:6: (enumLiteral_4= 'gt' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4415:6: (enumLiteral_4= 'gt' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4415:8: enumLiteral_4= 'gt'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_75_in_ruleValueComp10192); 

                            current = grammarAccess.getValueCompAccess().getGtEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getValueCompAccess().getGtEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4421:6: (enumLiteral_5= 'ge' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4421:6: (enumLiteral_5= 'ge' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4421:8: enumLiteral_5= 'ge'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_76_in_ruleValueComp10209); 

                            current = grammarAccess.getValueCompAccess().getGeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getValueCompAccess().getGeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueComp"


    // $ANTLR start "ruleNodeComp"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4431:1: ruleNodeComp returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= '<<' ) | (enumLiteral_2= '>>' ) ) ;
    public final Enumerator ruleNodeComp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4433:28: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= '<<' ) | (enumLiteral_2= '>>' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4434:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= '<<' ) | (enumLiteral_2= '>>' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4434:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= '<<' ) | (enumLiteral_2= '>>' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt53=1;
                }
                break;
            case 78:
                {
                alt53=2;
                }
                break;
            case 79:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4434:2: (enumLiteral_0= 'is' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4434:2: (enumLiteral_0= 'is' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4434:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleNodeComp10254); 

                            current = grammarAccess.getNodeCompAccess().getIsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNodeCompAccess().getIsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4440:6: (enumLiteral_1= '<<' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4440:6: (enumLiteral_1= '<<' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4440:8: enumLiteral_1= '<<'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleNodeComp10271); 

                            current = grammarAccess.getNodeCompAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNodeCompAccess().getLeftEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4446:6: (enumLiteral_2= '>>' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4446:6: (enumLiteral_2= '>>' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4446:8: enumLiteral_2= '>>'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleNodeComp10288); 

                            current = grammarAccess.getNodeCompAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNodeCompAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeComp"


    // $ANTLR start "ruleSeparator"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4456:1: ruleSeparator returns [Enumerator current=null] : ( (enumLiteral_0= '//' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleSeparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4458:28: ( ( (enumLiteral_0= '//' ) | (enumLiteral_1= '/' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4459:1: ( (enumLiteral_0= '//' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4459:1: ( (enumLiteral_0= '//' ) | (enumLiteral_1= '/' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            else if ( (LA54_0==57) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4459:2: (enumLiteral_0= '//' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4459:2: (enumLiteral_0= '//' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4459:4: enumLiteral_0= '//'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleSeparator10333); 

                            current = grammarAccess.getSeparatorAccess().getDoubleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSeparatorAccess().getDoubleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4465:6: (enumLiteral_1= '/' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4465:6: (enumLiteral_1= '/' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4465:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleSeparator10350); 

                            current = grammarAccess.getSeparatorAccess().getSingleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSeparatorAccess().getSingleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "ruleReverseAxisEnum"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4475:1: ruleReverseAxisEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'ancestor' ) | (enumLiteral_2= 'preceding-sibling' ) | (enumLiteral_3= 'preceding' ) | (enumLiteral_4= 'ancestor-or-self' ) ) ;
    public final Enumerator ruleReverseAxisEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4477:28: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'ancestor' ) | (enumLiteral_2= 'preceding-sibling' ) | (enumLiteral_3= 'preceding' ) | (enumLiteral_4= 'ancestor-or-self' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4478:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'ancestor' ) | (enumLiteral_2= 'preceding-sibling' ) | (enumLiteral_3= 'preceding' ) | (enumLiteral_4= 'ancestor-or-self' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4478:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'ancestor' ) | (enumLiteral_2= 'preceding-sibling' ) | (enumLiteral_3= 'preceding' ) | (enumLiteral_4= 'ancestor-or-self' ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt55=1;
                }
                break;
            case 81:
                {
                alt55=2;
                }
                break;
            case 82:
                {
                alt55=3;
                }
                break;
            case 83:
                {
                alt55=4;
                }
                break;
            case 84:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4478:2: (enumLiteral_0= 'parent' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4478:2: (enumLiteral_0= 'parent' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4478:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleReverseAxisEnum10395); 

                            current = grammarAccess.getReverseAxisEnumAccess().getParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getReverseAxisEnumAccess().getParentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4484:6: (enumLiteral_1= 'ancestor' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4484:6: (enumLiteral_1= 'ancestor' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4484:8: enumLiteral_1= 'ancestor'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleReverseAxisEnum10412); 

                            current = grammarAccess.getReverseAxisEnumAccess().getAncestorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getReverseAxisEnumAccess().getAncestorEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4490:6: (enumLiteral_2= 'preceding-sibling' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4490:6: (enumLiteral_2= 'preceding-sibling' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4490:8: enumLiteral_2= 'preceding-sibling'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_82_in_ruleReverseAxisEnum10429); 

                            current = grammarAccess.getReverseAxisEnumAccess().getPrecedingSiblingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getReverseAxisEnumAccess().getPrecedingSiblingEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4496:6: (enumLiteral_3= 'preceding' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4496:6: (enumLiteral_3= 'preceding' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4496:8: enumLiteral_3= 'preceding'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_83_in_ruleReverseAxisEnum10446); 

                            current = grammarAccess.getReverseAxisEnumAccess().getPrecedingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getReverseAxisEnumAccess().getPrecedingEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4502:6: (enumLiteral_4= 'ancestor-or-self' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4502:6: (enumLiteral_4= 'ancestor-or-self' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4502:8: enumLiteral_4= 'ancestor-or-self'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_84_in_ruleReverseAxisEnum10463); 

                            current = grammarAccess.getReverseAxisEnumAccess().getAncestorOrSelfEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getReverseAxisEnumAccess().getAncestorOrSelfEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReverseAxisEnum"


    // $ANTLR start "ruleForwardAxisEnum"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4512:1: ruleForwardAxisEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'child' ) | (enumLiteral_1= 'descendant' ) | (enumLiteral_2= 'attributex' ) | (enumLiteral_3= 'self' ) | (enumLiteral_4= 'descendant-or-self' ) | (enumLiteral_5= 'following-sibling' ) | (enumLiteral_6= 'following' ) | (enumLiteral_7= 'namespace' ) ) ;
    public final Enumerator ruleForwardAxisEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4514:28: ( ( (enumLiteral_0= 'child' ) | (enumLiteral_1= 'descendant' ) | (enumLiteral_2= 'attributex' ) | (enumLiteral_3= 'self' ) | (enumLiteral_4= 'descendant-or-self' ) | (enumLiteral_5= 'following-sibling' ) | (enumLiteral_6= 'following' ) | (enumLiteral_7= 'namespace' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4515:1: ( (enumLiteral_0= 'child' ) | (enumLiteral_1= 'descendant' ) | (enumLiteral_2= 'attributex' ) | (enumLiteral_3= 'self' ) | (enumLiteral_4= 'descendant-or-self' ) | (enumLiteral_5= 'following-sibling' ) | (enumLiteral_6= 'following' ) | (enumLiteral_7= 'namespace' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4515:1: ( (enumLiteral_0= 'child' ) | (enumLiteral_1= 'descendant' ) | (enumLiteral_2= 'attributex' ) | (enumLiteral_3= 'self' ) | (enumLiteral_4= 'descendant-or-self' ) | (enumLiteral_5= 'following-sibling' ) | (enumLiteral_6= 'following' ) | (enumLiteral_7= 'namespace' ) )
            int alt56=8;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt56=1;
                }
                break;
            case 86:
                {
                alt56=2;
                }
                break;
            case 56:
                {
                alt56=3;
                }
                break;
            case 87:
                {
                alt56=4;
                }
                break;
            case 88:
                {
                alt56=5;
                }
                break;
            case 89:
                {
                alt56=6;
                }
                break;
            case 90:
                {
                alt56=7;
                }
                break;
            case 91:
                {
                alt56=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4515:2: (enumLiteral_0= 'child' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4515:2: (enumLiteral_0= 'child' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4515:4: enumLiteral_0= 'child'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleForwardAxisEnum10508); 

                            current = grammarAccess.getForwardAxisEnumAccess().getChildEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getForwardAxisEnumAccess().getChildEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4521:6: (enumLiteral_1= 'descendant' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4521:6: (enumLiteral_1= 'descendant' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4521:8: enumLiteral_1= 'descendant'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleForwardAxisEnum10525); 

                            current = grammarAccess.getForwardAxisEnumAccess().getDescendantEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getForwardAxisEnumAccess().getDescendantEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4527:6: (enumLiteral_2= 'attributex' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4527:6: (enumLiteral_2= 'attributex' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4527:8: enumLiteral_2= 'attributex'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxisEnum10542); 

                            current = grammarAccess.getForwardAxisEnumAccess().getAttributexEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getForwardAxisEnumAccess().getAttributexEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4533:6: (enumLiteral_3= 'self' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4533:6: (enumLiteral_3= 'self' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4533:8: enumLiteral_3= 'self'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_87_in_ruleForwardAxisEnum10559); 

                            current = grammarAccess.getForwardAxisEnumAccess().getSelfEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getForwardAxisEnumAccess().getSelfEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4539:6: (enumLiteral_4= 'descendant-or-self' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4539:6: (enumLiteral_4= 'descendant-or-self' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4539:8: enumLiteral_4= 'descendant-or-self'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_88_in_ruleForwardAxisEnum10576); 

                            current = grammarAccess.getForwardAxisEnumAccess().getDescendantOrSelfEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getForwardAxisEnumAccess().getDescendantOrSelfEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4545:6: (enumLiteral_5= 'following-sibling' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4545:6: (enumLiteral_5= 'following-sibling' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4545:8: enumLiteral_5= 'following-sibling'
                    {
                    enumLiteral_5=(Token)match(input,89,FOLLOW_89_in_ruleForwardAxisEnum10593); 

                            current = grammarAccess.getForwardAxisEnumAccess().getFollowingSiblingEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getForwardAxisEnumAccess().getFollowingSiblingEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4551:6: (enumLiteral_6= 'following' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4551:6: (enumLiteral_6= 'following' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4551:8: enumLiteral_6= 'following'
                    {
                    enumLiteral_6=(Token)match(input,90,FOLLOW_90_in_ruleForwardAxisEnum10610); 

                            current = grammarAccess.getForwardAxisEnumAccess().getFollowingEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getForwardAxisEnumAccess().getFollowingEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4557:6: (enumLiteral_7= 'namespace' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4557:6: (enumLiteral_7= 'namespace' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4557:8: enumLiteral_7= 'namespace'
                    {
                    enumLiteral_7=(Token)match(input,91,FOLLOW_91_in_ruleForwardAxisEnum10627); 

                            current = grammarAccess.getForwardAxisEnumAccess().getNamespaceEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getForwardAxisEnumAccess().getNamespaceEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardAxisEnum"


    // $ANTLR start "ruleOccurrenceIndicator"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4567:1: ruleOccurrenceIndicator returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) ) ;
    public final Enumerator ruleOccurrenceIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4569:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4570:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4570:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==40) ) {
                alt57=1;
            }
            else if ( (LA57_0==63) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4570:2: (enumLiteral_0= '?' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4570:2: (enumLiteral_0= '?' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4570:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleOccurrenceIndicator10672); 

                            current = grammarAccess.getOccurrenceIndicatorAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOccurrenceIndicatorAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4576:6: (enumLiteral_1= '+' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4576:6: (enumLiteral_1= '+' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4576:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleOccurrenceIndicator10689); 

                            current = grammarAccess.getOccurrenceIndicatorAccess().getOneOrMoreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOccurrenceIndicatorAccess().getOneOrMoreEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurrenceIndicator"


    // $ANTLR start "ruleMultiplicative"
    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4586:1: ruleMultiplicative returns [Enumerator current=null] : ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'idiv' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMultiplicative() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4588:28: ( ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'idiv' ) | (enumLiteral_2= 'mod' ) ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4589:1: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'idiv' ) | (enumLiteral_2= 'mod' ) )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4589:1: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'idiv' ) | (enumLiteral_2= 'mod' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt58=1;
                }
                break;
            case 93:
                {
                alt58=2;
                }
                break;
            case 94:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4589:2: (enumLiteral_0= 'div' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4589:2: (enumLiteral_0= 'div' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4589:4: enumLiteral_0= 'div'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleMultiplicative10734); 

                            current = grammarAccess.getMultiplicativeAccess().getDivEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeAccess().getDivEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4595:6: (enumLiteral_1= 'idiv' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4595:6: (enumLiteral_1= 'idiv' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4595:8: enumLiteral_1= 'idiv'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleMultiplicative10751); 

                            current = grammarAccess.getMultiplicativeAccess().getIdivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeAccess().getIdivEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4601:6: (enumLiteral_2= 'mod' )
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4601:6: (enumLiteral_2= 'mod' )
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4601:8: enumLiteral_2= 'mod'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleMultiplicative10768); 

                            current = grammarAccess.getMultiplicativeAccess().getModEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeAccess().getModEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicative"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXPath_in_entryRuleXPath75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPath85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleXPath130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteral_in_entryRuleDecimalLiteral256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalLiteral266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteral307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleDoubleLiteral398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_ruleQName586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_ruleQName613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_entryRulePrefixedName648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixedName658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rulePrefixedName704 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrefixedName716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleLocalPart_in_rulePrefixedName737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnprefixedName783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalPart_in_ruleUnprefixedName828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NCNAME_in_rulePrefix914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalPart_in_entryRuleLocalPart959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalPart970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NCNAME_in_ruleLocalPart1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr1109 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleExpr1122 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr1143 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_entryRuleExprSingle1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSingle1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_ruleExprSingle1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_ruleExprSingle1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleExprSingle1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_entryRuleForExpr1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForExpr1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_ruleForExpr1410 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForExpr1422 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleForExpr1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleForClause1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleForClause1526 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSimpleForClause1538 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleSimpleForClause1559 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSimpleForClause1571 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleSimpleForClause1592 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleForClause1605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSimpleForClause1617 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleSimpleForClause1638 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSimpleForClause1650 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleSimpleForClause1671 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleVarName1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedExpr1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuantifiedExpr1854 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifiedExpr1883 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantifiedExpr1911 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleQuantifiedExpr1932 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuantifiedExpr1944 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1965 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleQuantifiedExpr1978 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantifiedExpr1990 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleQuantifiedExpr2011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuantifiedExpr2023 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr2044 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifiedExpr2058 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_entryRuleIfExpr2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpr2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIfExpr2162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIfExpr2174 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfExpr2195 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIfExpr2207 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfExpr2219 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr2240 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfExpr2252 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr2309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr2365 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleOrExpr2378 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr2399 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr2493 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAndExpr2506 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr2527 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr2565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr2621 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleValueComp_in_ruleComparisonExpr2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralComp_in_ruleComparisonExpr2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeComp_in_ruleComparisonExpr2698 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr2758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeExpr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr2814 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleRangeExpr2827 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpr2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2942 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAdditive_in_ruleAdditiveExpr2964 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2985 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr3023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpr3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr3079 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_ruleMultiplicative_in_ruleMultiplicativeExpr3101 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr3122 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionExpr3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr3216 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_ruleUnion_in_ruleUnionExpr3238 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr3259 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntersectExceptExpr3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr3353 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleIntersectExcept_in_ruleIntersectExceptExpr3375 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr3396 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceofExpr3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr3490 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleInstanceofExpr3503 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInstanceofExpr3515 = new BitSet(new long[]{0x01BF803000000100L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleInstanceofExpr3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatExpr3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_ruleTreatExpr3630 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTreatExpr3643 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTreatExpr3655 = new BitSet(new long[]{0x01BF803000000100L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleTreatExpr3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType3714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSequenceType3772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSequenceType3784 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSequenceType3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_ruleSequenceType3825 = new BitSet(new long[]{0x8000010000000002L});
    public static final BitSet FOLLOW_ruleOccurrenceIndicator_in_ruleSequenceType3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_entryRuleItemType3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemType3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleItemType3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleItemType3970 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleItemType3982 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleItemType3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleItemType4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_entryRuleAtomicType4059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicType4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleAtomicType4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastableExpr4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_ruleCastableExpr4205 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleCastableExpr4218 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCastableExpr4230 = new BitSet(new long[]{0x01BF803000000100L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastableExpr4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_entryRuleCastExpr4289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastExpr4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCastExpr4345 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleCastExpr4358 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCastExpr4370 = new BitSet(new long[]{0x01BF803000000100L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastExpr4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpr_in_entryRuleValueExpr4429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpr4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleValueExpr4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleType_in_entryRuleSingleType4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleType4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleSingleType4575 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleSingleType4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr4643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativePathExpr4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4699 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleSeparator_in_ruleRelativePathExpr4721 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4742 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePredicate4829 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePredicate4850 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePredicate4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_entryRuleReverseStep4898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReverseStep4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseAxis_in_ruleReverseStep4955 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleReverseStep4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevReverseStep_in_ruleReverseStep5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseAxis_in_entryRuleReverseAxis5040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReverseAxis5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseAxisEnum_in_ruleReverseAxis5096 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleReverseAxis5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevReverseStep_in_entryRuleAbbrevReverseStep5145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbbrevReverseStep5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAbbrevReverseStep5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTest_in_entryRuleNodeTest5232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTest5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleNodeTest5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_ruleNodeTest5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_entryRuleNameTest5351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameTest5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNameTest5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleNameTest5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardStep_in_entryRuleForwardStep5470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardStep5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_ruleForwardStep5527 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleForwardStep5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis5612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardAxis5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxisEnum_in_ruleForwardAxis5668 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleForwardAxis5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbbrevForwardStep5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAbbrevForwardStep5769 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_ruleLiteral5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral5959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericLiteral5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleNumericLiteral6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteral_in_ruleNumericLiteral6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_ruleNumericLiteral6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef6105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVarRef6152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarRef6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr6209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpr6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleParenthesizedExpr6265 = new BitSet(new long[]{0x07FFB00005640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleParenthesizedExpr6286 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParenthesizedExpr6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextItemExpr_in_entryRuleContextItemExpr6335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextItemExpr6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleContextItemExpr6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleFunctionCall6483 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionCall6495 = new BitSet(new long[]{0x07FFB00005640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall6517 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionCall6530 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall6551 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCall6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_entryRuleKindTest6603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKindTest6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_ruleKindTest6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleKindTest6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_ruleKindTest6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleKindTest6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_ruleKindTest6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentTest_in_ruleKindTest6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextTest_in_ruleKindTest6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyKindTest_in_ruleKindTest6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration6911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementDeclaration6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName7001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleAttributeName7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_entryRuleElementName7091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementName7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleElementName7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName7181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleTypeName7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyKindTest_in_entryRuleAnyKindTest7271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyKindTest7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAnyKindTest7328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAnyKindTest7340 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAnyKindTest7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest7389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTest7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDocumentTest7446 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDocumentTest7458 = new BitSet(new long[]{0x00A0000004000000L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleDocumentTest7480 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest7507 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDocumentTest7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextTest_in_entryRuleTextTest7558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextTest7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTextTest7615 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTextTest7627 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTextTest7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentTest_in_entryRuleCommentTest7676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentTest7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCommentTest7733 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommentTest7745 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommentTest7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_entryRulePITest7794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePITest7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePITest7851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePITest7863 = new BitSet(new long[]{0x0000000004000180L});
    public static final BitSet FOLLOW_RULE_NCNAME_in_rulePITest7881 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePITest7913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePITest7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest7964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaAttributeTest7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSchemaAttributeTest8011 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSchemaAttributeTest8023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest8044 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSchemaAttributeTest8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration8092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDeclaration8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest8182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaElementTest8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSchemaElementTest8229 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSchemaElementTest8241 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest8262 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSchemaElementTest8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr8310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpr_in_ruleUnaryExpr8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard8400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NCNAME_in_ruleWildcard8453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWildcard8470 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleWildcard8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleWildcard8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_entryRuleElementTest8556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementTest8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleElementTest8613 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleElementTest8625 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest8647 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleElementTest8660 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleElementTest8681 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_40_in_ruleElementTest8699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleElementTest8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest8766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeTest8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAttributeTest8823 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeTest8835 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest8857 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleAttributeTest8870 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleAttributeTest8891 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttributeTest8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_entryRuleAxisStep8944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxisStep8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_ruleAxisStep9001 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleForwardStep_in_ruleAxisStep9028 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAxisStep9050 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_entryRuleStepExpr9087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepExpr9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_ruleStepExpr9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr9179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePathExpr9233 = new BitSet(new long[]{0x07FFB00001640102L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePathExpr9294 = new BitSet(new long[]{0x07FFB00001640100L,0x000000000FFF0000L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard9392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribNameOrWildcard9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard9493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementNameOrWildcard9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementNameOrWildcard9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr9594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpr9651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rulePrimaryExpr9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextItemExpr_in_rulePrimaryExpr9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpr9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIntersectExcept9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIntersectExcept9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUnion9870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleUnion9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAdditive9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAdditive9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleGeneralComp9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleGeneralComp10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleGeneralComp10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleGeneralComp10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleGeneralComp10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleGeneralComp10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleValueComp10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleValueComp10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleValueComp10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleValueComp10175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleValueComp10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleValueComp10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleNodeComp10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleNodeComp10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleNodeComp10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSeparator10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSeparator10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleReverseAxisEnum10395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleReverseAxisEnum10412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleReverseAxisEnum10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleReverseAxisEnum10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleReverseAxisEnum10463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleForwardAxisEnum10508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleForwardAxisEnum10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxisEnum10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleForwardAxisEnum10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleForwardAxisEnum10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleForwardAxisEnum10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleForwardAxisEnum10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleForwardAxisEnum10627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOccurrenceIndicator10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOccurrenceIndicator10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleMultiplicative10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleMultiplicative10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleMultiplicative10768 = new BitSet(new long[]{0x0000000000000002L});

}