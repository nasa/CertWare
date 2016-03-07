package net.certware.argument.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_NUMERIC_CONSTANT=6;
    public static final int RULE_LID=5;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UID=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLLexer() {;} 
    public InternalLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalL.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:11:7: ( '+' )
            // InternalL.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:12:7: ( '-' )
            // InternalL.g:12:9: '-'
            {
            match('-'); 

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
            // InternalL.g:13:7: ( '*' )
            // InternalL.g:13:9: '*'
            {
            match('*'); 

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
            // InternalL.g:14:7: ( '/' )
            // InternalL.g:14:9: '/'
            {
            match('/'); 

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
            // InternalL.g:15:7: ( '%' )
            // InternalL.g:15:9: '%'
            {
            match('%'); 

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
            // InternalL.g:16:7: ( '(' )
            // InternalL.g:16:9: '('
            {
            match('('); 

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
            // InternalL.g:17:7: ( ')' )
            // InternalL.g:17:9: ')'
            {
            match(')'); 

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
            // InternalL.g:18:7: ( ',' )
            // InternalL.g:18:9: ','
            {
            match(','); 

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
            // InternalL.g:19:7: ( 'every' )
            // InternalL.g:19:9: 'every'
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
            // InternalL.g:20:7: ( 'some' )
            // InternalL.g:20:9: 'some'
            {
            match("some"); 


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
            // InternalL.g:21:7: ( 'const' )
            // InternalL.g:21:9: 'const'
            {
            match("const"); 


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
            // InternalL.g:22:7: ( '=' )
            // InternalL.g:22:9: '='
            {
            match('='); 

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
            // InternalL.g:23:7: ( '.' )
            // InternalL.g:23:9: '.'
            {
            match('.'); 

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
            // InternalL.g:24:7: ( 'type' )
            // InternalL.g:24:9: 'type'
            {
            match("type"); 


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
            // InternalL.g:25:7: ( '{' )
            // InternalL.g:25:9: '{'
            {
            match('{'); 

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
            // InternalL.g:26:7: ( '}' )
            // InternalL.g:26:9: '}'
            {
            match('}'); 

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
            // InternalL.g:27:7: ( 'where' )
            // InternalL.g:27:9: 'where'
            {
            match("where"); 


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
            // InternalL.g:28:7: ( 'in' )
            // InternalL.g:28:9: 'in'
            {
            match("in"); 


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
            // InternalL.g:29:7: ( '\\\\' )
            // InternalL.g:29:9: '\\\\'
            {
            match('\\'); 

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
            // InternalL.g:30:7: ( '>' )
            // InternalL.g:30:9: '>'
            {
            match('>'); 

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
            // InternalL.g:31:7: ( '<' )
            // InternalL.g:31:9: '<'
            {
            match('<'); 

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
            // InternalL.g:32:7: ( '>=' )
            // InternalL.g:32:9: '>='
            {
            match(">="); 


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
            // InternalL.g:33:7: ( '<=' )
            // InternalL.g:33:9: '<='
            {
            match("<="); 


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
            // InternalL.g:34:7: ( '!=' )
            // InternalL.g:34:9: '!='
            {
            match("!="); 


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
            // InternalL.g:35:7: ( 'or' )
            // InternalL.g:35:9: 'or'
            {
            match("or"); 


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
            // InternalL.g:36:7: ( 'and' )
            // InternalL.g:36:9: 'and'
            {
            match("and"); 


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
            // InternalL.g:37:7: ( 'not' )
            // InternalL.g:37:9: 'not'
            {
            match("not"); 


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
            // InternalL.g:38:7: ( 'maybe' )
            // InternalL.g:38:9: 'maybe'
            {
            match("maybe"); 


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
            // InternalL.g:39:7: ( '|' )
            // InternalL.g:39:9: '|'
            {
            match('|'); 

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
            // InternalL.g:40:7: ( 'if' )
            // InternalL.g:40:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_LID"
    public final void mRULE_LID() throws RecognitionException {
        try {
            int _type = RULE_LID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:3478:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalL.g:3478:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // InternalL.g:3478:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalL.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LID"

    // $ANTLR start "RULE_UID"
    public final void mRULE_UID() throws RecognitionException {
        try {
            int _type = RULE_UID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:3480:10: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalL.g:3480:12: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalL.g:3480:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalL.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UID"

    // $ANTLR start "RULE_NUMERIC_CONSTANT"
    public final void mRULE_NUMERIC_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:3482:23: ( ( '0' .. '9' )+ )
            // InternalL.g:3482:25: ( '0' .. '9' )+
            {
            // InternalL.g:3482:25: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalL.g:3482:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_CONSTANT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:3484:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalL.g:3484:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalL.g:3484:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalL.g:3484:11: '^'
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

            // InternalL.g:3484:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalL.g:
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
            	    break loop5;
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
            // InternalL.g:3486:10: ( ( '0' .. '9' )+ )
            // InternalL.g:3486:12: ( '0' .. '9' )+
            {
            // InternalL.g:3486:12: ( '0' .. '9' )+
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
            	    // InternalL.g:3486:13: '0' .. '9'
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
            // InternalL.g:3488:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalL.g:3488:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalL.g:3488:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalL.g:3488:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalL.g:3488:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalL.g:3488:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalL.g:3488:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalL.g:3488:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalL.g:3488:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalL.g:3488:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalL.g:3488:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalL.g:3490:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalL.g:3490:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalL.g:3490:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalL.g:3490:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalL.g:3492:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalL.g:3492:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalL.g:3492:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalL.g:3492:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalL.g:3492:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalL.g:3492:41: ( '\\r' )? '\\n'
                    {
                    // InternalL.g:3492:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalL.g:3492:41: '\\r'
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
            // InternalL.g:3494:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalL.g:3494:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalL.g:3494:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalL.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalL.g:3496:16: ( . )
            // InternalL.g:3496:18: .
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
        // InternalL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_LID | RULE_UID | RULE_NUMERIC_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalL.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalL.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalL.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalL.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalL.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalL.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalL.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalL.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalL.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalL.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalL.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalL.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalL.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalL.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalL.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalL.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalL.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalL.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalL.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalL.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalL.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalL.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalL.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalL.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalL.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalL.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalL.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalL.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalL.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalL.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalL.g:1:190: RULE_LID
                {
                mRULE_LID(); 

                }
                break;
            case 32 :
                // InternalL.g:1:199: RULE_UID
                {
                mRULE_UID(); 

                }
                break;
            case 33 :
                // InternalL.g:1:208: RULE_NUMERIC_CONSTANT
                {
                mRULE_NUMERIC_CONSTANT(); 

                }
                break;
            case 34 :
                // InternalL.g:1:230: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalL.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalL.g:1:247: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalL.g:1:259: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalL.g:1:275: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalL.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalL.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\4\uffff\1\52\4\uffff\3\61\2\uffff\1\61\2\uffff\2\61\1\uffff\1\76\1\100\1\44\4\61\1\uffff\1\61\1\110\1\111\1\44\1\uffff\2\44\14\uffff\2\61\1\uffff\2\61\2\uffff\1\61\2\uffff\1\61\1\123\1\124\6\uffff\1\125\3\61\1\uffff\1\110\2\uffff\1\111\3\uffff\5\61\3\uffff\1\136\1\137\2\61\1\142\1\61\1\144\1\61\2\uffff\1\61\1\147\1\uffff\1\150\1\uffff\1\151\1\152\4\uffff";
    static final String DFA15_eofS =
        "\153\uffff";
    static final String DFA15_minS =
        "\1\0\3\uffff\1\52\4\uffff\3\60\2\uffff\1\60\2\uffff\2\60\1\uffff\3\75\4\60\1\uffff\3\60\1\101\1\uffff\2\0\14\uffff\2\60\1\uffff\2\60\2\uffff\1\60\2\uffff\3\60\6\uffff\4\60\1\uffff\1\60\2\uffff\1\60\3\uffff\5\60\3\uffff\10\60\2\uffff\2\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA15_maxS =
        "\1\uffff\3\uffff\1\57\4\uffff\3\172\2\uffff\1\172\2\uffff\2\172\1\uffff\3\75\4\172\1\uffff\2\172\1\71\1\172\1\uffff\2\uffff\14\uffff\2\172\1\uffff\2\172\2\uffff\1\172\2\uffff\3\172\6\uffff\4\172\1\uffff\1\172\2\uffff\1\71\3\uffff\5\172\3\uffff\10\172\2\uffff\2\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\3\uffff\1\14\1\15\1\uffff\1\17\1\20\2\uffff\1\23\7\uffff\1\35\4\uffff\1\42\2\uffff\1\47\1\50\1\1\1\2\1\3\1\45\1\46\1\4\1\5\1\6\1\7\1\10\2\uffff\1\37\2\uffff\1\14\1\15\1\uffff\1\17\1\20\3\uffff\1\23\1\26\1\24\1\27\1\25\1\30\4\uffff\1\35\1\uffff\1\40\1\41\1\uffff\1\42\1\44\1\47\5\uffff\1\22\1\36\1\31\10\uffff\1\32\1\33\2\uffff\1\12\1\uffff\1\16\2\uffff\1\11\1\13\1\21\1\34";
    static final String DFA15_specialS =
        "\1\1\40\uffff\1\0\1\2\110\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\26\1\41\2\44\1\5\1\44\1\42\1\6\1\7\1\3\1\1\1\10\1\2\1\15\1\4\12\36\2\44\1\25\1\14\1\24\2\44\32\35\1\44\1\23\1\44\1\37\1\40\1\44\1\30\1\34\1\13\1\34\1\11\3\34\1\22\3\34\1\32\1\31\1\27\3\34\1\12\1\16\2\34\1\21\3\34\1\17\1\33\1\20\uff82\44",
            "",
            "",
            "",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\57\4\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\62\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\63\13\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\66\1\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\71\22\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\73\7\60\1\72\14\60",
            "",
            "\1\75",
            "\1\77",
            "\1\101",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\102\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\103\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\104\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\105\31\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\112",
            "\32\113\4\uffff\1\113\1\uffff\32\113",
            "",
            "\0\114",
            "\0\114",
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
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\116\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\117\15\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\120\14\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\121\12\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\122\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\126\26\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\127\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\130\1\60",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "",
            "\12\112",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\131\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\132\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\133\7\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\134\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\135\10\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\140\30\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\141\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\143\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\145\25\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\146\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_LID | RULE_UID | RULE_NUMERIC_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) ) {s = 76;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='+') ) {s = 1;}

                        else if ( (LA15_0=='-') ) {s = 2;}

                        else if ( (LA15_0=='*') ) {s = 3;}

                        else if ( (LA15_0=='/') ) {s = 4;}

                        else if ( (LA15_0=='%') ) {s = 5;}

                        else if ( (LA15_0=='(') ) {s = 6;}

                        else if ( (LA15_0==')') ) {s = 7;}

                        else if ( (LA15_0==',') ) {s = 8;}

                        else if ( (LA15_0=='e') ) {s = 9;}

                        else if ( (LA15_0=='s') ) {s = 10;}

                        else if ( (LA15_0=='c') ) {s = 11;}

                        else if ( (LA15_0=='=') ) {s = 12;}

                        else if ( (LA15_0=='.') ) {s = 13;}

                        else if ( (LA15_0=='t') ) {s = 14;}

                        else if ( (LA15_0=='{') ) {s = 15;}

                        else if ( (LA15_0=='}') ) {s = 16;}

                        else if ( (LA15_0=='w') ) {s = 17;}

                        else if ( (LA15_0=='i') ) {s = 18;}

                        else if ( (LA15_0=='\\') ) {s = 19;}

                        else if ( (LA15_0=='>') ) {s = 20;}

                        else if ( (LA15_0=='<') ) {s = 21;}

                        else if ( (LA15_0=='!') ) {s = 22;}

                        else if ( (LA15_0=='o') ) {s = 23;}

                        else if ( (LA15_0=='a') ) {s = 24;}

                        else if ( (LA15_0=='n') ) {s = 25;}

                        else if ( (LA15_0=='m') ) {s = 26;}

                        else if ( (LA15_0=='|') ) {s = 27;}

                        else if ( (LA15_0=='b'||LA15_0=='d'||(LA15_0>='f' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||(LA15_0>='p' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 28;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 29;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 30;}

                        else if ( (LA15_0=='^') ) {s = 31;}

                        else if ( (LA15_0=='_') ) {s = 32;}

                        else if ( (LA15_0=='\"') ) {s = 33;}

                        else if ( (LA15_0=='\'') ) {s = 34;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 35;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||LA15_0=='['||LA15_0==']'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( ((LA15_34>='\u0000' && LA15_34<='\uFFFF')) ) {s = 76;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}