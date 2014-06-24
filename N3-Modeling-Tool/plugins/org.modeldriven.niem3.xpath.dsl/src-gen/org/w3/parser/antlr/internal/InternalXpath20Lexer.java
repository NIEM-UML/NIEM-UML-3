package org.w3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXpath20Lexer extends Lexer {
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
    public static final int T__90=90;
    public static final int T__15=15;
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

    public InternalXpath20Lexer() {;} 
    public InternalXpath20Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXpath20Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:11:7: ( ':' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:12:7: ( ',' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:13:7: ( 'return' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:13:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:14:7: ( 'for' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:14:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:15:7: ( '$' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:15:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:16:7: ( 'in' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:16:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:17:7: ( 'some' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:17:9: 'some'
            {
            match("some"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:18:7: ( 'every' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:18:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:19:7: ( 'satisfies' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:19:9: 'satisfies'
            {
            match("satisfies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:20:7: ( 'if' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:21:7: ( '(' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:22:7: ( ')' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:23:7: ( 'then' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:23:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:24:7: ( 'else' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:24:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:25:7: ( 'or' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:25:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:26:7: ( 'and' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:26:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:27:7: ( 'to' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:27:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:28:7: ( 'instance' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:28:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:29:7: ( 'of' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:29:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:30:7: ( 'treat' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:30:9: 'treat'
            {
            match("treat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:31:7: ( 'as' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:31:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:32:7: ( 'empty-sequence' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:32:9: 'empty-sequence'
            {
            match("empty-sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:33:7: ( 'item' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:33:9: 'item'
            {
            match("item"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:34:7: ( 'castable' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:34:9: 'castable'
            {
            match("castable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:35:7: ( 'cast' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:35:9: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:36:7: ( '?' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:36:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:37:7: ( '[' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:37:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:38:7: ( ']' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:38:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:39:7: ( '::' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:39:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:40:7: ( '..' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:40:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:41:7: ( '@' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:41:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:42:7: ( '.' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:42:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:43:7: ( 'node' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:43:9: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:44:7: ( 'document-node' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:44:9: 'document-node'
            {
            match("document-node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:45:7: ( 'text' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:45:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:46:7: ( 'comment' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:46:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:47:7: ( 'processing-instruction' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:47:9: 'processing-instruction'
            {
            match("processing-instruction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:48:7: ( 'schema-attribute' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:48:9: 'schema-attribute'
            {
            match("schema-attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:49:7: ( 'schema-element' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:49:9: 'schema-element'
            {
            match("schema-element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:50:7: ( '*' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:50:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:51:7: ( 'elementx' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:51:9: 'elementx'
            {
            match("elementx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:52:7: ( 'attributex' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:52:9: 'attributex'
            {
            match("attributex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:53:7: ( '/' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:53:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:54:7: ( '//' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:54:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:55:7: ( 'intersect' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:55:9: 'intersect'
            {
            match("intersect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:56:7: ( 'except' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:56:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:57:7: ( 'union' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:57:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:58:7: ( '|' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:58:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:59:7: ( '+' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:59:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:60:7: ( '-' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:60:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:61:7: ( '=' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:61:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:62:7: ( '!=' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:62:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:63:7: ( '<' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:63:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:64:7: ( '<=' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:64:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:65:7: ( '>' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:65:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:66:7: ( '>=' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:66:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:67:7: ( 'eq' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:67:9: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:68:7: ( 'ne' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:68:9: 'ne'
            {
            match("ne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:69:7: ( 'lt' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:69:9: 'lt'
            {
            match("lt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:70:7: ( 'le' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:70:9: 'le'
            {
            match("le"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:71:7: ( 'gt' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:71:9: 'gt'
            {
            match("gt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:72:7: ( 'ge' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:72:9: 'ge'
            {
            match("ge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:73:7: ( 'is' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:73:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:74:7: ( '<<' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:74:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:75:7: ( '>>' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:75:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:76:7: ( 'parent' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:76:9: 'parent'
            {
            match("parent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:77:7: ( 'ancestor' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:77:9: 'ancestor'
            {
            match("ancestor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:78:7: ( 'preceding-sibling' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:78:9: 'preceding-sibling'
            {
            match("preceding-sibling"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:79:7: ( 'preceding' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:79:9: 'preceding'
            {
            match("preceding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:80:7: ( 'ancestor-or-self' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:80:9: 'ancestor-or-self'
            {
            match("ancestor-or-self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:81:7: ( 'child' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:81:9: 'child'
            {
            match("child"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:82:7: ( 'descendant' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:82:9: 'descendant'
            {
            match("descendant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:83:7: ( 'self' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:83:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:84:7: ( 'descendant-or-self' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:84:9: 'descendant-or-self'
            {
            match("descendant-or-self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:85:7: ( 'following-sibling' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:85:9: 'following-sibling'
            {
            match("following-sibling"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:86:7: ( 'following' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:86:9: 'following'
            {
            match("following"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:87:7: ( 'namespace' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:87:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:88:7: ( 'div' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:88:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:89:7: ( 'idiv' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:89:9: 'idiv'
            {
            match("idiv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:90:7: ( 'mod' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:90:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:14: ( ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:16: ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:16: ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:17: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:21: ( '0' .. '9' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:33: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:33: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('.'); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:49: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4610:50: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:13: ( ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) ( 'e' | 'E' ) ( '+' | '-' ) ( '0' .. '9' )+ )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:15: ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) ( 'e' | 'E' ) ( '+' | '-' ) ( '0' .. '9' )+
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:15: ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:16: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:20: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:32: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:32: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:48: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:81: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4612:82: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4614:14: ( '(:' ( options {greedy=false; } : . )* ':)' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4614:16: '(:' ( options {greedy=false; } : . )* ':)'
            {
            match("(:"); 

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4614:21: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==':') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==')') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='(')||(LA10_1>='*' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='9')||(LA10_0>=';' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4614:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(":)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_NCNAME"
    public final void mRULE_NCNAME() throws RecognitionException {
        try {
            int _type = RULE_NCNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4616:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4616:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4616:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='-' && LA11_0<='.')||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NCNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4618:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4618:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4618:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4618:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4618:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4620:10: ( ( '0' .. '9' )+ )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4620:12: ( '0' .. '9' )+
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4620:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4620:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4622:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4624:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4624:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4624:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4624:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:41: ( '\\r' )? '\\n'
                    {
                    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4626:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4628:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4628:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4628:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4630:16: ( . )
            // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:4630:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_DECIMAL | RULE_DOUBLE | RULE_COMMENT | RULE_NCNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=91;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:490: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 82 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:503: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 83 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:515: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:528: RULE_NCNAME
                {
                mRULE_NCNAME(); 

                }
                break;
            case 85 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:540: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:548: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:557: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:569: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:585: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:601: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // ../org.modeldriven.niem3.xpath.dsl/src-gen/org/w3/parser/antlr/internal/InternalXpath20.g:1:609: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\1\54\1\uffff\2\57\1\uffff\3\57\1\102\1\uffff\4\57\3\uffff"+
        "\1\125\1\uffff\3\57\1\uffff\1\142\1\57\4\uffff\1\52\1\153\1\156"+
        "\3\57\1\164\1\57\3\52\5\uffff\1\57\1\uffff\2\57\1\uffff\1\177\1"+
        "\u0080\1\57\1\u0082\11\57\1\u008d\3\uffff\1\57\1\u008f\2\57\1\u0092"+
        "\1\u0093\1\57\1\u0096\4\57\4\uffff\1\u009c\2\uffff\1\57\1\u009e"+
        "\6\57\1\uffff\1\u00a7\2\uffff\1\57\13\uffff\1\u00a9\1\u00aa\1\u00ab"+
        "\1\u00ac\1\57\1\uffff\1\164\1\u009c\3\uffff\1\57\1\u00b0\3\57\2"+
        "\uffff\1\57\1\uffff\12\57\1\uffff\1\57\1\uffff\2\57\2\uffff\1\u00c2"+
        "\1\57\1\uffff\4\57\2\uffff\1\57\1\uffff\3\57\1\u00cc\3\57\2\uffff"+
        "\1\57\4\uffff\1\u00d1\1\u009c\1\57\1\uffff\3\57\1\u00d6\1\u00d7"+
        "\1\u00d8\2\57\1\u00db\1\57\1\u00dd\3\57\1\u00e1\1\57\1\u00e3\1\uffff"+
        "\2\57\1\u00e7\2\57\1\u00ea\3\57\1\uffff\4\57\1\uffff\4\57\3\uffff"+
        "\2\57\1\uffff\1\u00f8\1\uffff\3\57\1\uffff\1\u00fc\1\uffff\3\57"+
        "\1\uffff\1\57\1\u0101\1\uffff\6\57\1\u0108\1\u0109\5\57\1\uffff"+
        "\2\57\1\u0111\1\uffff\4\57\1\uffff\5\57\1\u011b\2\uffff\7\57\1\uffff"+
        "\3\57\1\u0127\5\57\1\uffff\1\57\1\u012e\4\57\1\u0133\1\57\1\u0136"+
        "\1\57\1\u0138\1\uffff\5\57\1\u013f\1\uffff\1\u0140\1\u0141\2\57"+
        "\1\uffff\2\57\1\uffff\1\57\1\uffff\1\u0147\3\57\1\u014c\1\57\3\uffff"+
        "\4\57\1\u0152\1\uffff\1\57\1\u0155\2\57\1\uffff\5\57\1\uffff\2\57"+
        "\1\uffff\20\57\1\u016f\5\57\1\u0175\1\u0176\1\57\1\uffff\5\57\2"+
        "\uffff\5\57\1\u0182\1\u0183\3\57\1\u0187\2\uffff\2\57\1\u018a\1"+
        "\uffff\1\u018b\1\57\2\uffff\3\57\1\u0190\1\uffff";
    static final String DFA23_eofS =
        "\u0191\uffff";
    static final String DFA23_minS =
        "\1\0\1\72\1\uffff\2\60\1\uffff\3\60\1\72\1\uffff\4\60\3\uffff\1"+
        "\56\1\uffff\3\60\1\uffff\1\52\1\60\4\uffff\1\75\1\74\1\75\3\60\1"+
        "\56\1\60\1\101\2\0\5\uffff\1\60\1\uffff\2\60\1\uffff\2\55\1\60\1"+
        "\55\11\60\1\55\3\uffff\1\60\1\55\2\60\2\55\1\60\1\55\4\60\4\uffff"+
        "\1\60\2\uffff\1\60\1\55\6\60\1\uffff\1\0\2\uffff\1\60\13\uffff\4"+
        "\55\1\60\1\uffff\1\56\1\60\3\uffff\1\60\1\55\3\60\2\uffff\1\60\1"+
        "\uffff\12\60\1\uffff\1\60\1\uffff\2\60\2\uffff\1\55\1\60\1\uffff"+
        "\4\60\2\uffff\1\60\1\uffff\3\60\1\55\3\60\2\uffff\1\60\4\uffff\1"+
        "\55\2\60\1\uffff\3\60\3\55\2\60\1\55\1\60\1\55\3\60\1\55\1\60\1"+
        "\55\1\uffff\2\60\1\55\2\60\1\55\3\60\1\uffff\4\60\1\uffff\4\60\3"+
        "\uffff\2\60\1\uffff\1\55\1\uffff\1\60\1\55\1\60\1\uffff\1\55\1\uffff"+
        "\3\60\1\uffff\1\60\1\55\1\uffff\6\60\2\55\4\60\1\55\1\uffff\1\60"+
        "\1\163\1\55\1\uffff\4\60\1\uffff\5\60\1\55\2\uffff\4\60\1\141\1"+
        "\60\1\145\1\uffff\3\60\1\55\5\60\1\uffff\1\60\1\55\2\60\1\164\1"+
        "\154\1\55\1\161\1\55\1\60\1\55\1\uffff\1\60\1\55\3\60\1\55\1\uffff"+
        "\2\55\1\164\1\145\1\uffff\1\165\1\157\1\uffff\1\60\1\uffff\1\55"+
        "\1\156\2\60\1\55\1\163\3\uffff\1\162\1\155\1\145\1\162\1\55\1\uffff"+
        "\1\157\2\55\1\163\1\uffff\2\151\1\145\1\156\1\55\1\uffff\1\144\1"+
        "\157\1\uffff\2\151\2\142\1\156\1\143\1\163\1\145\1\162\1\156\1\142"+
        "\1\154\1\165\1\164\2\145\2\55\1\163\1\154\1\151\1\164\2\55\1\154"+
        "\1\uffff\1\163\1\164\1\151\1\156\1\145\2\uffff\1\146\1\145\1\162"+
        "\1\156\1\147\2\55\1\154\1\165\1\147\1\55\2\uffff\1\146\1\143\1\55"+
        "\1\uffff\1\55\1\164\2\uffff\1\151\1\157\1\156\1\55\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\72\1\uffff\2\172\1\uffff\3\172\1\72\1\uffff\4\172\3"+
        "\uffff\1\71\1\uffff\3\172\1\uffff\1\57\1\172\4\uffff\2\75\1\76\3"+
        "\172\1\71\2\172\2\uffff\5\uffff\1\172\1\uffff\2\172\1\uffff\16\172"+
        "\3\uffff\14\172\4\uffff\1\145\2\uffff\10\172\1\uffff\1\uffff\2\uffff"+
        "\1\172\13\uffff\5\172\1\uffff\1\71\1\145\3\uffff\5\172\2\uffff\1"+
        "\172\1\uffff\12\172\1\uffff\1\172\1\uffff\2\172\2\uffff\2\172\1"+
        "\uffff\4\172\2\uffff\1\172\1\uffff\7\172\2\uffff\1\172\4\uffff\1"+
        "\172\1\145\1\172\1\uffff\21\172\1\uffff\11\172\1\uffff\4\172\1\uffff"+
        "\4\172\3\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1"+
        "\uffff\3\172\1\uffff\2\172\1\uffff\15\172\1\uffff\1\172\1\163\1"+
        "\172\1\uffff\4\172\1\uffff\6\172\2\uffff\4\172\1\145\1\172\1\145"+
        "\1\uffff\11\172\1\uffff\4\172\1\164\1\154\1\172\1\161\3\172\1\uffff"+
        "\6\172\1\uffff\2\172\1\164\1\145\1\uffff\1\165\1\157\1\uffff\1\172"+
        "\1\uffff\1\172\1\156\3\172\1\163\3\uffff\1\162\1\155\1\145\1\162"+
        "\1\172\1\uffff\1\157\2\172\1\163\1\uffff\2\151\1\145\1\156\1\55"+
        "\1\uffff\1\144\1\157\1\uffff\2\151\2\142\1\156\1\143\1\163\1\145"+
        "\1\162\1\156\1\142\1\154\1\165\1\164\2\145\1\172\1\55\1\163\1\154"+
        "\1\151\1\164\2\172\1\154\1\uffff\1\163\1\164\1\151\1\156\1\145\2"+
        "\uffff\1\146\1\145\1\162\1\156\1\147\2\172\1\154\1\165\1\147\1\172"+
        "\2\uffff\1\146\1\143\1\172\1\uffff\1\172\1\164\2\uffff\1\151\1\157"+
        "\1\156\1\172\1\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\4\uffff\1\14\4\uffff\1\32\1\33\1\34\1"+
        "\uffff\1\37\3\uffff\1\50\2\uffff\1\60\1\61\1\62\1\63\13\uffff\1"+
        "\132\1\133\1\35\1\1\1\2\1\uffff\1\124\2\uffff\1\5\16\uffff\1\123"+
        "\1\13\1\14\14\uffff\1\32\1\33\1\34\1\36\1\uffff\1\40\1\37\10\uffff"+
        "\1\50\1\uffff\1\130\1\53\1\uffff\1\60\1\61\1\62\1\63\1\64\1\66\1"+
        "\100\1\65\1\70\1\101\1\67\5\uffff\1\126\2\uffff\1\125\1\127\1\132"+
        "\5\uffff\1\6\1\12\1\uffff\1\77\12\uffff\1\71\1\uffff\1\21\2\uffff"+
        "\1\17\1\23\2\uffff\1\25\4\uffff\1\122\1\121\1\uffff\1\72\7\uffff"+
        "\1\131\1\54\1\uffff\1\73\1\74\1\75\1\76\3\uffff\1\4\21\uffff\1\20"+
        "\11\uffff\1\116\4\uffff\1\120\4\uffff\1\27\1\117\1\7\2\uffff\1\111"+
        "\1\uffff\1\16\3\uffff\1\15\1\uffff\1\43\3\uffff\1\31\2\uffff\1\41"+
        "\15\uffff\1\10\3\uffff\1\24\4\uffff\1\107\6\uffff\1\57\1\3\7\uffff"+
        "\1\56\11\uffff\1\102\13\uffff\1\44\6\uffff\1\22\4\uffff\1\51\2\uffff"+
        "\1\103\1\uffff\1\30\6\uffff\1\114\1\55\1\11\5\uffff\1\115\4\uffff"+
        "\1\105\5\uffff\1\52\2\uffff\1\110\31\uffff\1\42\5\uffff\1\47\1\26"+
        "\13\uffff\1\46\1\106\3\uffff\1\113\2\uffff\1\104\1\112\4\uffff\1"+
        "\45";
    static final String DFA23_specialS =
        "\1\2\46\uffff\1\0\1\3\67\uffff\1\1\u0130\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\36\1\47\1\52\1\5\2\52\1"+
            "\50\1\11\1\12\1\27\1\33\1\2\1\34\1\22\1\30\12\44\1\1\1\52\1"+
            "\37\1\35\1\40\1\17\1\23\32\45\1\20\1\52\1\21\1\46\1\45\1\52"+
            "\1\15\1\45\1\16\1\25\1\10\1\4\1\42\1\45\1\6\2\45\1\41\1\43\1"+
            "\24\1\14\1\26\1\45\1\3\1\7\1\13\1\31\5\45\1\52\1\32\uff83\52",
            "\1\53",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\56\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\61\13\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\67\1\60\1"+
            "\64\7\60\1\63\4\60\1\66\1\65\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\71\1\60\1\72\1"+
            "\60\1\73\11\60\1\70\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\75\1\76"+
            "\3\60\1\100\4\60\1\74\1\60\1\77\2\60",
            "\1\101",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\107\2\60"+
            "\1\104\6\60\1\105\2\60\1\106\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\111\13\60"+
            "\1\110\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\112\4\60"+
            "\1\113\1\114\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\115\6\60\1\117"+
            "\6\60\1\116\13\60",
            "",
            "",
            "",
            "\1\123\1\uffff\12\124",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\131\3\60\1\130"+
            "\11\60\1\127\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\133\3\60"+
            "\1\134\5\60\1\132\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\136\20\60\1\135"+
            "\10\60",
            "",
            "\1\141\4\uffff\1\140",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\143\14\60",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\152\1\151",
            "\1\154\1\155",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\160\16\60"+
            "\1\157\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\162\16\60"+
            "\1\161\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\163\13\60",
            "\1\166\1\uffff\12\165",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\32\167\4\uffff\1\167\1\uffff\32\167",
            "\0\170",
            "\0\170",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\172\6\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\174\5\60"+
            "\1\173\10\60",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22"+
            "\60\1\175\1\176\6\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0081\25"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0083\21"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0084\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0085\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u0086\22"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0087\16"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0088\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u008a\15"+
            "\60\1\u0089\7\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u008b\12"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u008c\27"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u008e\25"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0090\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\27\60\1\u0091\2"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0095\1\u0094"+
            "\26\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0097\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0098\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0099\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u009a\21"+
            "\60",
            "",
            "",
            "",
            "",
            "\12\124\13\uffff\1\u009b\37\uffff\1\u009b",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u009d\26"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u009f\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00a0\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00a1\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u00a2\4"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00a4\11"+
            "\60\1\u00a3\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00a5\10"+
            "\60",
            "",
            "\0\u00a6",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00a8\21"+
            "\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00ad\26"+
            "\60",
            "",
            "\1\166\1\uffff\12\165",
            "\12\u00ae\13\uffff\1\u009b\37\uffff\1\u009b",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00af\5"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00b1\16"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b2\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b3\25"+
            "\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00b4\15"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u00b5\4"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b6\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00b7\21"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b8\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u00b9\24"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00ba\10"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00bb\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00bc\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00bd\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00be\25"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00bf\14"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c0\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00c1\6"+
            "\60",
            "",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c3\25"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00c4\10"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00c5\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00c6\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00c7\16"+
            "\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c8\25"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c9\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00ca\5"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00cb\27"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00cd\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00ce\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cf\25"+
            "\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00d0\13"+
            "\60",
            "",
            "",
            "",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\u00ae\13\uffff\1\u009b\37\uffff\1\u009b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00d2\10"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00d3\13"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00d4\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00d5\10"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00d9\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00da\15"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u00dc\1"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00de\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u00df\1"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u00e0\12"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e2\6"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00e4\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00e5\21"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e6"+
            "\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00e8\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00e9\26"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00eb\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00ec\15"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ed\25"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ee\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ef\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f0\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f1\14"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f2\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\26\60\1\u00f3\3"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f4\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00f5\7"+
            "\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u00f6\24"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00f7\31\60",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f9\14"+
            "\60",
            "\1\u00fa\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00fb\6"+
            "\60",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00fd\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00fe\30"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00ff\30"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0100\14"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u0102\12"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0103\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0104\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0105\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u0106\26"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0107\6"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u010a\21"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u010b\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u010c\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u010d\21"+
            "\60",
            "\1\u010e\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u010f\6"+
            "\60",
            "\1\u0110",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0112\13"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u0113\5"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0114\16"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0115\6"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0116\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0117\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u0118\26"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0119\7"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u011a\21"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u011c\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u011d\25"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u011e\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u011f\25"+
            "\60",
            "\1\u0120\3\uffff\1\u0121",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\27\60\1\u0122\2"+
            "\60",
            "\1\u0123",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0124\10"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0125\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0126\25"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0128\27"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0129\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u012a\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u012b\21"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u012c\14"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u012d\23"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u012f\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0130\7"+
            "\60",
            "\1\u0131",
            "\1\u0132",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u0134",
            "\1\u0135\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0137\25"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0139\25"+
            "\60",
            "\1\u013a\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u013b\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u013c\14"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u013d\23"+
            "\60",
            "\1\u013e\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\27\60\1\u0146\2"+
            "\60",
            "",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\u0148",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0149\6"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u014a\23"+
            "\60",
            "\1\u014b\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\u014d",
            "",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\2\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\u0153",
            "\1\u0154\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\u0156\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\u018c",
            "",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\2\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_DECIMAL | RULE_DOUBLE | RULE_COMMENT | RULE_NCNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_39 = input.LA(1);

                        s = -1;
                        if ( ((LA23_39>='\u0000' && LA23_39<='\uFFFF')) ) {s = 120;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_96 = input.LA(1);

                        s = -1;
                        if ( ((LA23_96>='\u0000' && LA23_96<='\uFFFF')) ) {s = 166;}

                        else s = 167;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0==':') ) {s = 1;}

                        else if ( (LA23_0==',') ) {s = 2;}

                        else if ( (LA23_0=='r') ) {s = 3;}

                        else if ( (LA23_0=='f') ) {s = 4;}

                        else if ( (LA23_0=='$') ) {s = 5;}

                        else if ( (LA23_0=='i') ) {s = 6;}

                        else if ( (LA23_0=='s') ) {s = 7;}

                        else if ( (LA23_0=='e') ) {s = 8;}

                        else if ( (LA23_0=='(') ) {s = 9;}

                        else if ( (LA23_0==')') ) {s = 10;}

                        else if ( (LA23_0=='t') ) {s = 11;}

                        else if ( (LA23_0=='o') ) {s = 12;}

                        else if ( (LA23_0=='a') ) {s = 13;}

                        else if ( (LA23_0=='c') ) {s = 14;}

                        else if ( (LA23_0=='?') ) {s = 15;}

                        else if ( (LA23_0=='[') ) {s = 16;}

                        else if ( (LA23_0==']') ) {s = 17;}

                        else if ( (LA23_0=='.') ) {s = 18;}

                        else if ( (LA23_0=='@') ) {s = 19;}

                        else if ( (LA23_0=='n') ) {s = 20;}

                        else if ( (LA23_0=='d') ) {s = 21;}

                        else if ( (LA23_0=='p') ) {s = 22;}

                        else if ( (LA23_0=='*') ) {s = 23;}

                        else if ( (LA23_0=='/') ) {s = 24;}

                        else if ( (LA23_0=='u') ) {s = 25;}

                        else if ( (LA23_0=='|') ) {s = 26;}

                        else if ( (LA23_0=='+') ) {s = 27;}

                        else if ( (LA23_0=='-') ) {s = 28;}

                        else if ( (LA23_0=='=') ) {s = 29;}

                        else if ( (LA23_0=='!') ) {s = 30;}

                        else if ( (LA23_0=='<') ) {s = 31;}

                        else if ( (LA23_0=='>') ) {s = 32;}

                        else if ( (LA23_0=='l') ) {s = 33;}

                        else if ( (LA23_0=='g') ) {s = 34;}

                        else if ( (LA23_0=='m') ) {s = 35;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 36;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||LA23_0=='b'||LA23_0=='h'||(LA23_0>='j' && LA23_0<='k')||LA23_0=='q'||(LA23_0>='v' && LA23_0<='z')) ) {s = 37;}

                        else if ( (LA23_0=='^') ) {s = 38;}

                        else if ( (LA23_0=='\"') ) {s = 39;}

                        else if ( (LA23_0=='\'') ) {s = 40;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 41;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='#'||(LA23_0>='%' && LA23_0<='&')||LA23_0==';'||LA23_0=='\\'||LA23_0=='`'||LA23_0=='{'||(LA23_0>='}' && LA23_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_40 = input.LA(1);

                        s = -1;
                        if ( ((LA23_40>='\u0000' && LA23_40<='\uFFFF')) ) {s = 120;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}