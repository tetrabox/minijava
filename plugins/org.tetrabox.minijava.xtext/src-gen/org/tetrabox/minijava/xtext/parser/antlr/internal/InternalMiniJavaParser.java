package org.tetrabox.minijava.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'String'", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "','", "')'", "'return'", "'.'", "'this'", "'new'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava.g"; }



     	private MiniJavaGrammarAccess grammarAccess;

        public InternalMiniJavaParser(TokenStream input, MiniJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MiniJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMiniJava.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMiniJava.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_classes_0_0= ruleClass ) )* ( (lv_main_1_0= ruleExpression ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;

        EObject lv_main_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:77:2: ( ( ( (lv_classes_0_0= ruleClass ) )* ( (lv_main_1_0= ruleExpression ) )? ) )
            // InternalMiniJava.g:78:2: ( ( (lv_classes_0_0= ruleClass ) )* ( (lv_main_1_0= ruleExpression ) )? )
            {
            // InternalMiniJava.g:78:2: ( ( (lv_classes_0_0= ruleClass ) )* ( (lv_main_1_0= ruleExpression ) )? )
            // InternalMiniJava.g:79:3: ( (lv_classes_0_0= ruleClass ) )* ( (lv_main_1_0= ruleExpression ) )?
            {
            // InternalMiniJava.g:79:3: ( (lv_classes_0_0= ruleClass ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniJava.g:80:4: (lv_classes_0_0= ruleClass )
            	    {
            	    // InternalMiniJava.g:80:4: (lv_classes_0_0= ruleClass )
            	    // InternalMiniJava.g:81:5: lv_classes_0_0= ruleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_classes_0_0=ruleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_0_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Class");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMiniJava.g:98:3: ( (lv_main_1_0= ruleExpression ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==19||(LA2_0>=24 && LA2_0<=27)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:99:4: (lv_main_1_0= ruleExpression )
                    {
                    // InternalMiniJava.g:99:4: (lv_main_1_0= ruleExpression )
                    // InternalMiniJava.g:100:5: lv_main_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProgramAccess().getMainExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_main_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProgramRule());
                      					}
                      					set(
                      						current,
                      						"main",
                      						lv_main_1_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:121:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMiniJava.g:121:45: (iv_ruleType= ruleType EOF )
            // InternalMiniJava.g:122:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMiniJava.g:128:1: ruleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_ClassType_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:134:2: ( (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) )
            // InternalMiniJava.g:135:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            {
            // InternalMiniJava.g:135:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:136:3: this_BasicType_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:145:3: this_ClassType_1= ruleClassType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassType_1=ruleClassType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // InternalMiniJava.g:157:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalMiniJava.g:157:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalMiniJava.g:158:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalMiniJava.g:164:1: ruleBasicType returns [EObject current=null] : ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_basic_0_1=null;
        Token lv_basic_0_2=null;
        Token lv_basic_0_3=null;


        	enterRule();

        try {
            // InternalMiniJava.g:170:2: ( ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) ) )
            // InternalMiniJava.g:171:2: ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) )
            {
            // InternalMiniJava.g:171:2: ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) )
            // InternalMiniJava.g:172:3: ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) )
            {
            // InternalMiniJava.g:172:3: ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) )
            // InternalMiniJava.g:173:4: (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' )
            {
            // InternalMiniJava.g:173:4: (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:174:5: lv_basic_0_1= 'int'
                    {
                    lv_basic_0_1=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_basic_0_1, grammarAccess.getBasicTypeAccess().getBasicIntKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "basic", lv_basic_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:185:5: lv_basic_0_2= 'boolean'
                    {
                    lv_basic_0_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_basic_0_2, grammarAccess.getBasicTypeAccess().getBasicBooleanKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "basic", lv_basic_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:196:5: lv_basic_0_3= 'String'
                    {
                    lv_basic_0_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_basic_0_3, grammarAccess.getBasicTypeAccess().getBasicStringKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "basic", lv_basic_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // InternalMiniJava.g:212:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalMiniJava.g:212:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalMiniJava.g:213:2: iv_ruleClassType= ruleClassType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalMiniJava.g:219:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:225:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:226:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:226:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:227:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:227:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:228:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getClassTypeRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getClassrefClassCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:242:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMiniJava.g:242:46: (iv_ruleClass= ruleClass EOF )
            // InternalMiniJava.g:243:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMiniJava.g:249:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_fields_5_0 = null;

        EObject lv_methods_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:255:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) )
            // InternalMiniJava.g:256:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            {
            // InternalMiniJava.g:256:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            // InternalMiniJava.g:257:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
              		
            }
            // InternalMiniJava.g:261:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:262:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:262:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:263:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava.g:279:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:280:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMiniJava.g:284:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMiniJava.g:285:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMiniJava.g:285:5: (otherlv_3= RULE_ID )
                    // InternalMiniJava.g:286:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClassRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsClassCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMiniJava.g:302:3: ( (lv_fields_5_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( (LA6_6==18) ) {
                            alt6=1;
                        }


                    }


                    }
                    break;
                case 12:
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( (LA6_6==18) ) {
                            alt6=1;
                        }


                    }


                    }
                    break;
                case 13:
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( (LA6_6==18) ) {
                            alt6=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_4 = input.LA(2);

                    if ( (LA6_4==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( (LA6_6==18) ) {
                            alt6=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalMiniJava.g:303:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalMiniJava.g:303:4: (lv_fields_5_0= ruleField )
            	    // InternalMiniJava.g:304:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_5_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMiniJava.g:321:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=13)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniJava.g:322:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalMiniJava.g:322:4: (lv_methods_6_0= ruleMethod )
            	    // InternalMiniJava.g:323:5: lv_methods_6_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_methods_6_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"methods",
            	      						lv_methods_6_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Method");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:348:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMiniJava.g:348:46: (iv_ruleField= ruleField EOF )
            // InternalMiniJava.g:349:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava.g:355:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:361:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:362:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:362:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMiniJava.g:363:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMiniJava.g:363:3: ( (lv_type_0_0= ruleType ) )
            // InternalMiniJava.g:364:4: (lv_type_0_0= ruleType )
            {
            // InternalMiniJava.g:364:4: (lv_type_0_0= ruleType )
            // InternalMiniJava.g:365:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:383:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:384:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:408:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava.g:408:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava.g:409:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:415:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:421:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:422:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:422:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:423:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:423:3: ( (lv_type_0_0= ruleType ) )
            // InternalMiniJava.g:424:4: (lv_type_0_0= ruleType )
            {
            // InternalMiniJava.g:424:4: (lv_type_0_0= ruleType )
            // InternalMiniJava.g:425:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:442:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:443:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:443:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:444:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:464:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMiniJava.g:464:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMiniJava.g:465:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava.g:471:1: ruleMethod returns [EObject current=null] : ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleMethodBody ) ) otherlv_9= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_returntype_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:477:2: ( ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleMethodBody ) ) otherlv_9= '}' ) )
            // InternalMiniJava.g:478:2: ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleMethodBody ) ) otherlv_9= '}' )
            {
            // InternalMiniJava.g:478:2: ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleMethodBody ) ) otherlv_9= '}' )
            // InternalMiniJava.g:479:3: ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleMethodBody ) ) otherlv_9= '}'
            {
            // InternalMiniJava.g:479:3: ( (lv_returntype_0_0= ruleType ) )
            // InternalMiniJava.g:480:4: (lv_returntype_0_0= ruleType )
            {
            // InternalMiniJava.g:480:4: (lv_returntype_0_0= ruleType )
            // InternalMiniJava.g:481:5: lv_returntype_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_returntype_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"returntype",
              						lv_returntype_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:498:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:499:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:499:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:500:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:520:3: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=11 && LA9_0<=13)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:521:4: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // InternalMiniJava.g:521:4: ( (lv_params_3_0= ruleParameter ) )
                    // InternalMiniJava.g:522:5: (lv_params_3_0= ruleParameter )
                    {
                    // InternalMiniJava.g:522:5: (lv_params_3_0= ruleParameter )
                    // InternalMiniJava.g:523:6: lv_params_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_params_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:540:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMiniJava.g:541:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:545:5: ( (lv_params_5_0= ruleParameter ) )
                    	    // InternalMiniJava.g:546:6: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // InternalMiniJava.g:546:6: (lv_params_5_0= ruleParameter )
                    	    // InternalMiniJava.g:547:7: lv_params_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_params_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.tetrabox.minijava.xtext.MiniJava.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMiniJava.g:574:3: ( (lv_body_8_0= ruleMethodBody ) )
            // InternalMiniJava.g:575:4: (lv_body_8_0= ruleMethodBody )
            {
            // InternalMiniJava.g:575:4: (lv_body_8_0= ruleMethodBody )
            // InternalMiniJava.g:576:5: lv_body_8_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_body_8_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"org.tetrabox.minijava.xtext.MiniJava.MethodBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodBody"
    // InternalMiniJava.g:601:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // InternalMiniJava.g:601:51: (iv_ruleMethodBody= ruleMethodBody EOF )
            // InternalMiniJava.g:602:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // InternalMiniJava.g:608:1: ruleMethodBody returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:614:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:615:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:615:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // InternalMiniJava.g:616:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodBodyAccess().getReturnKeyword_0());
              		
            }
            // InternalMiniJava.g:620:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMiniJava.g:621:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMiniJava.g:621:4: (lv_expression_1_0= ruleExpression )
            // InternalMiniJava.g:622:5: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodBodyAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodBodyRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodBodyAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:647:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:647:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:648:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:654:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:660:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* ) )
            // InternalMiniJava.g:661:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* )
            {
            // InternalMiniJava.g:661:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* )
            // InternalMiniJava.g:662:3: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:670:3: ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:671:4: () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) )
            	    {
            	    // InternalMiniJava.g:671:4: ()
            	    // InternalMiniJava.g:672:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:682:4: ( (lv_message_3_0= ruleMessage ) )
            	    // InternalMiniJava.g:683:5: (lv_message_3_0= ruleMessage )
            	    {
            	    // InternalMiniJava.g:683:5: (lv_message_3_0= ruleMessage )
            	    // InternalMiniJava.g:684:6: lv_message_3_0= ruleMessage
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getMessageMessageParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_message_3_0=ruleMessage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"message",
            	      							lv_message_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Message");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMessage"
    // InternalMiniJava.g:706:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMiniJava.g:706:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMiniJava.g:707:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalMiniJava.g:713:1: ruleMessage returns [EObject current=null] : (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;

        EObject this_FieldSelection_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:719:2: ( (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection ) )
            // InternalMiniJava.g:720:2: (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection )
            {
            // InternalMiniJava.g:720:2: (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==18||(LA11_1>=20 && LA11_1<=21)||LA11_1==23) ) {
                    alt11=2;
                }
                else if ( (LA11_1==19) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:721:3: this_MethodCall_0= ruleMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMessageAccess().getMethodCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodCall_0=ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MethodCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:730:3: this_FieldSelection_1= ruleFieldSelection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMessageAccess().getFieldSelectionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldSelection_1=ruleFieldSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldSelection_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:742:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMiniJava.g:742:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMiniJava.g:743:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMiniJava.g:749:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:755:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) )
            // InternalMiniJava.g:756:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            {
            // InternalMiniJava.g:756:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            // InternalMiniJava.g:757:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')'
            {
            // InternalMiniJava.g:757:3: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:758:4: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:758:4: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:759:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getNameMethodCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:774:3: ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==19||(LA13_0>=24 && LA13_0<=27)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:775:4: ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    {
                    // InternalMiniJava.g:775:4: ( (lv_args_2_0= ruleArgument ) )
                    // InternalMiniJava.g:776:5: (lv_args_2_0= ruleArgument )
                    {
                    // InternalMiniJava.g:776:5: (lv_args_2_0= ruleArgument )
                    // InternalMiniJava.g:777:6: lv_args_2_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_args_2_0=ruleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Argument");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:794:4: (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMiniJava.g:795:5: otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:799:5: ( (lv_args_4_0= ruleArgument ) )
                    	    // InternalMiniJava.g:800:6: (lv_args_4_0= ruleArgument )
                    	    {
                    	    // InternalMiniJava.g:800:6: (lv_args_4_0= ruleArgument )
                    	    // InternalMiniJava.g:801:7: lv_args_4_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_args_4_0=ruleArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_4_0,
                    	      								"org.tetrabox.minijava.xtext.MiniJava.Argument");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleFieldSelection"
    // InternalMiniJava.g:828:1: entryRuleFieldSelection returns [EObject current=null] : iv_ruleFieldSelection= ruleFieldSelection EOF ;
    public final EObject entryRuleFieldSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelection = null;


        try {
            // InternalMiniJava.g:828:55: (iv_ruleFieldSelection= ruleFieldSelection EOF )
            // InternalMiniJava.g:829:2: iv_ruleFieldSelection= ruleFieldSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldSelectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelection=ruleFieldSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldSelection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldSelection"


    // $ANTLR start "ruleFieldSelection"
    // InternalMiniJava.g:835:1: ruleFieldSelection returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFieldSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:841:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:842:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:842:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:843:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:843:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:844:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFieldSelectionRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getFieldSelectionAccess().getNameFieldCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldSelection"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:858:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalMiniJava.g:858:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalMiniJava.g:859:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava.g:865:1: ruleTerminalExpression returns [EObject current=null] : (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_This_0 = null;

        EObject this_Variable_1 = null;

        EObject this_New_2 = null;

        EObject this_Cast_3 = null;

        EObject this_Constant_4 = null;

        EObject this_Paren_5 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:871:2: ( (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) )
            // InternalMiniJava.g:872:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            {
            // InternalMiniJava.g:872:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:873:3: this_This_0= ruleThis
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getThisParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_This_0=ruleThis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_This_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:882:3: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:891:3: this_New_2= ruleNew
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getNewParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_New_2=ruleNew();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_New_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:900:3: ( ( '(' )=>this_Cast_3= ruleCast )
                    {
                    // InternalMiniJava.g:900:3: ( ( '(' )=>this_Cast_3= ruleCast )
                    // InternalMiniJava.g:901:4: ( '(' )=>this_Cast_3= ruleCast
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Cast_3=ruleCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Cast_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:912:3: this_Constant_4= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getConstantParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constant_4=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constant_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:921:3: this_Paren_5= ruleParen
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getParenParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Paren_5=ruleParen();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Paren_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleThis"
    // InternalMiniJava.g:933:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // InternalMiniJava.g:933:45: (iv_ruleThis= ruleThis EOF )
            // InternalMiniJava.g:934:2: iv_ruleThis= ruleThis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThis=ruleThis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThis; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // InternalMiniJava.g:940:1: ruleThis returns [EObject current=null] : ( (lv_variable_0_0= 'this' ) ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:946:2: ( ( (lv_variable_0_0= 'this' ) ) )
            // InternalMiniJava.g:947:2: ( (lv_variable_0_0= 'this' ) )
            {
            // InternalMiniJava.g:947:2: ( (lv_variable_0_0= 'this' ) )
            // InternalMiniJava.g:948:3: (lv_variable_0_0= 'this' )
            {
            // InternalMiniJava.g:948:3: (lv_variable_0_0= 'this' )
            // InternalMiniJava.g:949:4: lv_variable_0_0= 'this'
            {
            lv_variable_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_variable_0_0, grammarAccess.getThisAccess().getVariableThisKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getThisRule());
              				}
              				setWithLastConsumed(current, "variable", lv_variable_0_0, "this");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleVariable"
    // InternalMiniJava.g:964:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMiniJava.g:964:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMiniJava.g:965:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMiniJava.g:971:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:977:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:978:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:978:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:979:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:979:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:980:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getParamrefParameterCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleNew"
    // InternalMiniJava.g:994:1: entryRuleNew returns [EObject current=null] : iv_ruleNew= ruleNew EOF ;
    public final EObject entryRuleNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNew = null;


        try {
            // InternalMiniJava.g:994:44: (iv_ruleNew= ruleNew EOF )
            // InternalMiniJava.g:995:2: iv_ruleNew= ruleNew EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNew=ruleNew();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNew; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // InternalMiniJava.g:1001:1: ruleNew returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1007:2: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalMiniJava.g:1008:2: (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalMiniJava.g:1008:2: (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalMiniJava.g:1009:3: otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewAccess().getNewKeyword_0());
              		
            }
            // InternalMiniJava.g:1013:3: ( (lv_type_1_0= ruleClassType ) )
            // InternalMiniJava.g:1014:4: (lv_type_1_0= ruleClassType )
            {
            // InternalMiniJava.g:1014:4: (lv_type_1_0= ruleClassType )
            // InternalMiniJava.g:1015:5: lv_type_1_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNewAccess().getTypeClassTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_type_1_0=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNewRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.ClassType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNewAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:1036:3: ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==19||(LA16_0>=24 && LA16_0<=27)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:1037:4: ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )*
                    {
                    // InternalMiniJava.g:1037:4: ( (lv_args_3_0= ruleArgument ) )
                    // InternalMiniJava.g:1038:5: (lv_args_3_0= ruleArgument )
                    {
                    // InternalMiniJava.g:1038:5: (lv_args_3_0= ruleArgument )
                    // InternalMiniJava.g:1039:6: lv_args_3_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_args_3_0=ruleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNewRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Argument");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:1056:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMiniJava.g:1057:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getNewAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:1061:5: ( (lv_args_5_0= ruleArgument ) )
                    	    // InternalMiniJava.g:1062:6: (lv_args_5_0= ruleArgument )
                    	    {
                    	    // InternalMiniJava.g:1062:6: (lv_args_5_0= ruleArgument )
                    	    // InternalMiniJava.g:1063:7: lv_args_5_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_args_5_0=ruleArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNewRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_5_0,
                    	      								"org.tetrabox.minijava.xtext.MiniJava.Argument");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getNewAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleCast"
    // InternalMiniJava.g:1090:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // InternalMiniJava.g:1090:45: (iv_ruleCast= ruleCast EOF )
            // InternalMiniJava.g:1091:2: iv_ruleCast= ruleCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCast=ruleCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // InternalMiniJava.g:1097:1: ruleCast returns [EObject current=null] : ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_object_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1103:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) ) )
            // InternalMiniJava.g:1104:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) )
            {
            // InternalMiniJava.g:1104:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) )
            // InternalMiniJava.g:1105:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) )
            {
            // InternalMiniJava.g:1105:3: ( ( '(' )=>otherlv_0= '(' )
            // InternalMiniJava.g:1106:4: ( '(' )=>otherlv_0= '('
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getCastAccess().getLeftParenthesisKeyword_0());
              			
            }

            }

            // InternalMiniJava.g:1112:3: ( (lv_type_1_0= ruleClassType ) )
            // InternalMiniJava.g:1113:4: (lv_type_1_0= ruleClassType )
            {
            // InternalMiniJava.g:1113:4: (lv_type_1_0= ruleClassType )
            // InternalMiniJava.g:1114:5: lv_type_1_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCastAccess().getTypeClassTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_type_1_0=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCastRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.ClassType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCastAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:1135:3: ( (lv_object_3_0= ruleTerminalExpression ) )
            // InternalMiniJava.g:1136:4: (lv_object_3_0= ruleTerminalExpression )
            {
            // InternalMiniJava.g:1136:4: (lv_object_3_0= ruleTerminalExpression )
            // InternalMiniJava.g:1137:5: lv_object_3_0= ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCastAccess().getObjectTerminalExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_object_3_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCastRule());
              					}
              					set(
              						current,
              						"object",
              						lv_object_3_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TerminalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleParen"
    // InternalMiniJava.g:1158:1: entryRuleParen returns [EObject current=null] : iv_ruleParen= ruleParen EOF ;
    public final EObject entryRuleParen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParen = null;


        try {
            // InternalMiniJava.g:1158:46: (iv_ruleParen= ruleParen EOF )
            // InternalMiniJava.g:1159:2: iv_ruleParen= ruleParen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParen=ruleParen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParen; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParen"


    // $ANTLR start "ruleParen"
    // InternalMiniJava.g:1165:1: ruleParen returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1171:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalMiniJava.g:1172:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalMiniJava.g:1172:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalMiniJava.g:1173:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_18);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParen"


    // $ANTLR start "entryRuleConstant"
    // InternalMiniJava.g:1193:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMiniJava.g:1193:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMiniJava.g:1194:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMiniJava.g:1200:1: ruleConstant returns [EObject current=null] : (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstant_0 = null;

        EObject this_BoolConstant_1 = null;

        EObject this_StringConstant_2 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1206:2: ( (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) )
            // InternalMiniJava.g:1207:2: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            {
            // InternalMiniJava.g:1207:2: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 26:
            case 27:
                {
                alt17=2;
                }
                break;
            case RULE_STRING:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1208:3: this_IntConstant_0= ruleIntConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntConstant_0=ruleIntConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntConstant_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1217:3: this_BoolConstant_1= ruleBoolConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getBoolConstantParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolConstant_1=ruleBoolConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolConstant_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1226:3: this_StringConstant_2= ruleStringConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringConstant_2=ruleStringConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringConstant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleStringConstant"
    // InternalMiniJava.g:1238:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // InternalMiniJava.g:1238:55: (iv_ruleStringConstant= ruleStringConstant EOF )
            // InternalMiniJava.g:1239:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // InternalMiniJava.g:1245:1: ruleStringConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1251:2: ( ( (lv_constant_0_0= RULE_STRING ) ) )
            // InternalMiniJava.g:1252:2: ( (lv_constant_0_0= RULE_STRING ) )
            {
            // InternalMiniJava.g:1252:2: ( (lv_constant_0_0= RULE_STRING ) )
            // InternalMiniJava.g:1253:3: (lv_constant_0_0= RULE_STRING )
            {
            // InternalMiniJava.g:1253:3: (lv_constant_0_0= RULE_STRING )
            // InternalMiniJava.g:1254:4: lv_constant_0_0= RULE_STRING
            {
            lv_constant_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_constant_0_0, grammarAccess.getStringConstantAccess().getConstantSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"constant",
              					lv_constant_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntConstant"
    // InternalMiniJava.g:1273:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // InternalMiniJava.g:1273:52: (iv_ruleIntConstant= ruleIntConstant EOF )
            // InternalMiniJava.g:1274:2: iv_ruleIntConstant= ruleIntConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntConstant=ruleIntConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // InternalMiniJava.g:1280:1: ruleIntConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1286:2: ( ( (lv_constant_0_0= RULE_INT ) ) )
            // InternalMiniJava.g:1287:2: ( (lv_constant_0_0= RULE_INT ) )
            {
            // InternalMiniJava.g:1287:2: ( (lv_constant_0_0= RULE_INT ) )
            // InternalMiniJava.g:1288:3: (lv_constant_0_0= RULE_INT )
            {
            // InternalMiniJava.g:1288:3: (lv_constant_0_0= RULE_INT )
            // InternalMiniJava.g:1289:4: lv_constant_0_0= RULE_INT
            {
            lv_constant_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_constant_0_0, grammarAccess.getIntConstantAccess().getConstantINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"constant",
              					lv_constant_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleBoolConstant"
    // InternalMiniJava.g:1308:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // InternalMiniJava.g:1308:53: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // InternalMiniJava.g:1309:2: iv_ruleBoolConstant= ruleBoolConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolConstant=ruleBoolConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolConstant"


    // $ANTLR start "ruleBoolConstant"
    // InternalMiniJava.g:1315:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_1=null;
        Token lv_constant_0_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1321:2: ( ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) )
            // InternalMiniJava.g:1322:2: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            {
            // InternalMiniJava.g:1322:2: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            // InternalMiniJava.g:1323:3: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            {
            // InternalMiniJava.g:1323:3: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            // InternalMiniJava.g:1324:4: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            {
            // InternalMiniJava.g:1324:4: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1325:5: lv_constant_0_1= 'true'
                    {
                    lv_constant_0_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_constant_0_1, grammarAccess.getBoolConstantAccess().getConstantTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBoolConstantRule());
                      					}
                      					setWithLastConsumed(current, "constant", lv_constant_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1336:5: lv_constant_0_2= 'false'
                    {
                    lv_constant_0_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_constant_0_2, grammarAccess.getBoolConstantAccess().getConstantFalseKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBoolConstantRule());
                      					}
                      					setWithLastConsumed(current, "constant", lv_constant_0_2, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolConstant"


    // $ANTLR start "entryRuleArgument"
    // InternalMiniJava.g:1352:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMiniJava.g:1352:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMiniJava.g:1353:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMiniJava.g:1359:1: ruleArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1365:2: (this_Expression_0= ruleExpression )
            // InternalMiniJava.g:1366:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArgumentAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArgument"

    // $ANTLR start synpred1_InternalMiniJava
    public final void synpred1_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:901:4: ( '(' )
        // InternalMiniJava.g:901:5: '('
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMiniJava

    // Delegated rules

    public final boolean synpred1_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\33\3\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\3\uffff\1\4\1\6";
    static final String dfa_5s = "\4\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\5\14\uffff\1\4\4\uffff\1\1\1\3\2\5",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "872:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000F084072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000023810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000203810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000F080070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F280070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});

}