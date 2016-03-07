package net.certware.argument.analysis.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisDSLLexer extends Lexer {
    public static final int RULE_UNSATISFIABLE=6;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_SATISFIABLE=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalAnalysisDSLLexer() {;} 
    public InternalAnalysisDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnalysisDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAnalysisDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:11:7: ( '(' )
            // InternalAnalysisDSL.g:11:9: '('
            {
            match('('); 

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
            // InternalAnalysisDSL.g:12:7: ( ')' )
            // InternalAnalysisDSL.g:12:9: ')'
            {
            match(')'); 

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
            // InternalAnalysisDSL.g:13:7: ( ',' )
            // InternalAnalysisDSL.g:13:9: ','
            {
            match(','); 

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
            // InternalAnalysisDSL.g:14:7: ( '-' )
            // InternalAnalysisDSL.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:1176:13: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalAnalysisDSL.g:1176:15: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalAnalysisDSL.g:1176:15: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAnalysisDSL.g:1176:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalAnalysisDSL.g:1176:20: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalAnalysisDSL.g:1176:29: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAnalysisDSL.g:1176:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:1178:17: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAnalysisDSL.g:1178:19: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // InternalAnalysisDSL.g:1178:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnalysisDSL.g:
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_SATISFIABLE"
    public final void mRULE_SATISFIABLE() throws RecognitionException {
        try {
            int _type = RULE_SATISFIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:1180:18: ( 'SATISFIABLE' )
            // InternalAnalysisDSL.g:1180:20: 'SATISFIABLE'
            {
            match("SATISFIABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SATISFIABLE"

    // $ANTLR start "RULE_UNSATISFIABLE"
    public final void mRULE_UNSATISFIABLE() throws RecognitionException {
        try {
            int _type = RULE_UNSATISFIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:1182:20: ( 'UNSATISFIABLE' )
            // InternalAnalysisDSL.g:1182:22: 'UNSATISFIABLE'
            {
            match("UNSATISFIABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSATISFIABLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisDSL.g:1184:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAnalysisDSL.g:1184:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAnalysisDSL.g:1184:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnalysisDSL.g:1184:11: '^'
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

            // InternalAnalysisDSL.g:1184:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnalysisDSL.g:
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
            // InternalAnalysisDSL.g:1186:10: ( ( '0' .. '9' )+ )
            // InternalAnalysisDSL.g:1186:12: ( '0' .. '9' )+
            {
            // InternalAnalysisDSL.g:1186:12: ( '0' .. '9' )+
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
            	    // InternalAnalysisDSL.g:1186:13: '0' .. '9'
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
            // InternalAnalysisDSL.g:1188:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAnalysisDSL.g:1188:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAnalysisDSL.g:1188:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAnalysisDSL.g:1188:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAnalysisDSL.g:1188:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAnalysisDSL.g:1188:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisDSL.g:1188:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAnalysisDSL.g:1188:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAnalysisDSL.g:1188:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAnalysisDSL.g:1188:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisDSL.g:1188:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAnalysisDSL.g:1190:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAnalysisDSL.g:1190:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAnalysisDSL.g:1190:24: ( options {greedy=false; } : . )*
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
            	    // InternalAnalysisDSL.g:1190:52: .
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
            // InternalAnalysisDSL.g:1192:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAnalysisDSL.g:1192:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAnalysisDSL.g:1192:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnalysisDSL.g:1192:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAnalysisDSL.g:1192:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAnalysisDSL.g:1192:41: ( '\\r' )? '\\n'
                    {
                    // InternalAnalysisDSL.g:1192:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAnalysisDSL.g:1192:41: '\\r'
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
            // InternalAnalysisDSL.g:1194:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAnalysisDSL.g:1194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAnalysisDSL.g:1194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalAnalysisDSL.g:
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
            // InternalAnalysisDSL.g:1196:16: ( . )
            // InternalAnalysisDSL.g:1196:18: .
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
        // InternalAnalysisDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | RULE_NUMBER | RULE_IDENTIFIER | RULE_SATISFIABLE | RULE_UNSATISFIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=15;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalAnalysisDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalAnalysisDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalAnalysisDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalAnalysisDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalAnalysisDSL.g:1:34: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 6 :
                // InternalAnalysisDSL.g:1:46: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 7 :
                // InternalAnalysisDSL.g:1:62: RULE_SATISFIABLE
                {
                mRULE_SATISFIABLE(); 

                }
                break;
            case 8 :
                // InternalAnalysisDSL.g:1:79: RULE_UNSATISFIABLE
                {
                mRULE_UNSATISFIABLE(); 

                }
                break;
            case 9 :
                // InternalAnalysisDSL.g:1:98: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // InternalAnalysisDSL.g:1:106: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // InternalAnalysisDSL.g:1:115: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalAnalysisDSL.g:1:127: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // InternalAnalysisDSL.g:1:143: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalAnalysisDSL.g:1:159: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalAnalysisDSL.g:1:167: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\5\uffff\2\25\1\30\2\33\1\20\1\uffff\3\20\10\uffff\1\25\1\uffff\1\30\1\33\1\uffff\1\33\4\uffff\20\33\1\63\1\33\1\uffff\1\33\1\66\1\uffff";
    static final String DFA15_eofS =
        "\67\uffff";
    static final String DFA15_minS =
        "\1\0\4\uffff\3\60\1\101\1\116\1\101\1\uffff\2\0\1\52\10\uffff\1\60\1\uffff\1\60\1\124\1\uffff\1\123\4\uffff\1\111\1\101\1\123\1\124\1\106\2\111\1\123\1\101\1\106\1\102\1\111\1\114\1\101\1\105\1\102\1\60\1\114\1\uffff\1\105\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\4\uffff\2\71\1\172\1\101\1\116\1\172\1\uffff\2\uffff\1\57\10\uffff\1\71\1\uffff\1\172\1\124\1\uffff\1\123\4\uffff\1\111\1\101\1\123\1\124\1\106\2\111\1\123\1\101\1\106\1\102\1\111\1\114\1\101\1\105\1\102\1\172\1\114\1\uffff\1\105\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\11\3\uffff\1\16\1\17\1\1\1\2\1\3\1\4\1\5\1\12\1\uffff\1\6\2\uffff\1\11\1\uffff\1\13\1\14\1\15\1\16\22\uffff\1\7\2\uffff\1\10";
    static final String DFA15_specialS =
        "\1\1\13\uffff\1\2\1\0\51\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\1\1\1\2\2\20\1\3\1\4\1\20\1\16\1\5\11\6\7\20\22\13\1\10\1\13\1\11\5\13\3\20\1\12\1\13\1\20\32\7\uff85\20",
            "",
            "",
            "",
            "",
            "\12\26",
            "\12\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32",
            "\1\34",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\35",
            "\0\35",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\27",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\41",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\64",
            "",
            "\1\65",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | RULE_NUMBER | RULE_IDENTIFIER | RULE_SATISFIABLE | RULE_UNSATISFIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_13 = input.LA(1);

                        s = -1;
                        if ( ((LA15_13>='\u0000' && LA15_13<='\uFFFF')) ) {s = 29;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='(') ) {s = 1;}

                        else if ( (LA15_0==')') ) {s = 2;}

                        else if ( (LA15_0==',') ) {s = 3;}

                        else if ( (LA15_0=='-') ) {s = 4;}

                        else if ( (LA15_0=='0') ) {s = 5;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 6;}

                        else if ( ((LA15_0>='a' && LA15_0<='z')) ) {s = 7;}

                        else if ( (LA15_0=='S') ) {s = 8;}

                        else if ( (LA15_0=='U') ) {s = 9;}

                        else if ( (LA15_0=='^') ) {s = 10;}

                        else if ( ((LA15_0>='A' && LA15_0<='R')||LA15_0=='T'||(LA15_0>='V' && LA15_0<='Z')||LA15_0=='_') ) {s = 11;}

                        else if ( (LA15_0=='\"') ) {s = 12;}

                        else if ( (LA15_0=='\'') ) {s = 13;}

                        else if ( (LA15_0=='/') ) {s = 14;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 15;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='.'||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_12 = input.LA(1);

                        s = -1;
                        if ( ((LA15_12>='\u0000' && LA15_12<='\uFFFF')) ) {s = 29;}

                        else s = 16;

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