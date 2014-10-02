package imt.simhya.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkovPopulationModelsLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_FLOAT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators

    public InternalMarkovPopulationModelsLexer() {;} 
    public InternalMarkovPopulationModelsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMarkovPopulationModelsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:11:7: ( 'agent' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:11:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:12:7: ( '{' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:13:7: ( 'actions' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:13:9: 'actions'
            {
            match("actions"); 


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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:14:7: ( '}' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:14:9: '}'
            {
            match('}'); 

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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:15:7: ( 'state' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:15:9: 'state'
            {
            match("state"); 


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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:16:7: ( '-->' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:16:9: '-->'
            {
            match("-->"); 


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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:17:7: ( ':' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:882:10: ( ( '0' .. '9' )+ )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:882:12: ( '0' .. '9' )+
            {
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:882:12: ( '0' .. '9' )+
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
            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:882:13: '0' .. '9'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:12: ( ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ ) )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )
            {
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:15: ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )?
                    {
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:15: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:20: ( RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:20: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:30: ( '.' ( RULE_INT )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:31: '.' ( RULE_INT )+
                            {
                            match('.'); 
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:35: ( RULE_INT )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:35: RULE_INT
                            	    {
                            	    mRULE_INT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:47: ( '-' )? ( RULE_INT )+ '.'
                    {
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:47: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:47: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:52: ( RULE_INT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:52: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 

                    }
                    break;
                case 3 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:66: ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+
                    {
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:66: ( '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:66: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:71: ( RULE_INT )+
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
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:71: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:81: ( '.' ( RULE_INT )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='.') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:82: '.' ( RULE_INT )*
                            {
                            match('.'); 
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:86: ( RULE_INT )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:86: RULE_INT
                            	    {
                            	    mRULE_INT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
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

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:108: ( '-' | '+' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='+'||LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:119: ( RULE_INT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:884:119: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:886:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:886:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:886:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:886:11: '^'
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

            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:886:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:
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
            	    break loop16;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:888:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:890:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:890:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:890:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:890:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:41: ( '\\r' )? '\\n'
                    {
                    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:892:41: '\\r'
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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:894:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:894:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:894:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:896:16: ( . )
            // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:896:18: .
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
        // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=15;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:52: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:61: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 10 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:72: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:80: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:92: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:108: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:124: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../imt.simhya.language.ui/src-gen/imt/simhya/language/ui/contentassist/antlr/internal/InternalMarkovPopulationModels.g:1:132: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA14_eotS =
        "\3\3\1\uffff\1\6\2\uffff\1\3";
    static final String DFA14_eofS =
        "\10\uffff";
    static final String DFA14_minS =
        "\1\55\1\60\1\56\1\uffff\1\60\2\uffff\1\60";
    static final String DFA14_maxS =
        "\2\71\1\145\1\uffff\1\145\2\uffff\1\145";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\uffff\1\3\1\2\1\uffff";
    static final String DFA14_specialS =
        "\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "\12\7\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "\12\7\13\uffff\1\5\37\uffff\1\5"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "884:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )";
        }
    }
    static final String DFA25_eotS =
        "\1\11\1\23\2\uffff\1\23\1\11\1\uffff\1\31\1\20\1\uffff\1\20\1\uffff\3\20\2\uffff\2\23\3\uffff\1\23\3\uffff\1\31\4\uffff\6\23\1\50\1\23\1\52\1\uffff\1\23\1\uffff\1\54\1\uffff";
    static final String DFA25_eofS =
        "\55\uffff";
    static final String DFA25_minS =
        "\1\0\1\143\2\uffff\1\164\1\55\1\uffff\1\56\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\145\1\164\3\uffff\1\141\3\uffff\1\56\4\uffff\1\156\1\151\2\164\1\157\1\145\1\60\1\156\1\60\1\uffff\1\163\1\uffff\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\147\2\uffff\1\164\1\55\1\uffff\1\145\1\71\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\145\1\164\3\uffff\1\141\3\uffff\1\145\4\uffff\1\156\1\151\2\164\1\157\1\145\1\172\1\156\1\172\1\uffff\1\163\1\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\4\2\uffff\1\7\2\uffff\1\11\1\uffff\1\12\3\uffff\1\16\1\17\2\uffff\1\12\1\2\1\4\1\uffff\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16\11\uffff\1\1\1\uffff\1\5\1\uffff\1\3";
    static final String DFA25_specialS =
        "\1\1\13\uffff\1\0\1\2\37\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\5\20\1\5\1\10\1\16\12\7\1\6\6\20\32\13\3\20\1\12\1\13\1\20\1\1\21\13\1\4\7\13\1\2\1\20\1\3\uff82\20",
            "\1\22\3\uffff\1\21",
            "",
            "",
            "\1\26",
            "\1\27",
            "",
            "\1\11\1\uffff\12\32\13\uffff\1\11\37\uffff\1\11",
            "\12\11",
            "",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\0\33",
            "\0\33",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "\1\37",
            "\1\40",
            "",
            "",
            "",
            "\1\41",
            "",
            "",
            "",
            "\1\11\1\uffff\12\32\13\uffff\1\11\37\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\51",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\53",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_12 = input.LA(1);

                        s = -1;
                        if ( ((LA25_12>='\u0000' && LA25_12<='\uFFFF')) ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='a') ) {s = 1;}

                        else if ( (LA25_0=='{') ) {s = 2;}

                        else if ( (LA25_0=='}') ) {s = 3;}

                        else if ( (LA25_0=='s') ) {s = 4;}

                        else if ( (LA25_0=='-') ) {s = 5;}

                        else if ( (LA25_0==':') ) {s = 6;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 7;}

                        else if ( (LA25_0=='.') ) {s = 8;}

                        else if ( (LA25_0=='^') ) {s = 10;}

                        else if ( ((LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='b' && LA25_0<='r')||(LA25_0>='t' && LA25_0<='z')) ) {s = 11;}

                        else if ( (LA25_0=='\"') ) {s = 12;}

                        else if ( (LA25_0=='\'') ) {s = 13;}

                        else if ( (LA25_0=='/') ) {s = 14;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 15;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||(LA25_0>='(' && LA25_0<=',')||(LA25_0>=';' && LA25_0<='@')||(LA25_0>='[' && LA25_0<=']')||LA25_0=='`'||LA25_0=='|'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 16;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_13 = input.LA(1);

                        s = -1;
                        if ( ((LA25_13>='\u0000' && LA25_13<='\uFFFF')) ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}