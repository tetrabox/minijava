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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'int'", "'boolean'", "';'", "','", "'.'", "'this'", "'new'", "'true'", "'false'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
    // InternalMiniJava.g:71:1: ruleProgram returns [EObject current=null] : (this_Class_0= ruleClass | ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject lv_classes_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:77:2: ( (this_Class_0= ruleClass | ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )* ) )
            // InternalMiniJava.g:78:2: (this_Class_0= ruleClass | ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )* )
            {
            // InternalMiniJava.g:78:2: (this_Class_0= ruleClass | ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:79:3: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Class_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:88:3: ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )*
                    {
                    // InternalMiniJava.g:88:3: ( ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) && (synpred1_InternalMiniJava())) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMiniJava.g:89:4: ( ( ruleClass ) )=> (lv_classes_1_0= ruleClass )
                    	    {
                    	    // InternalMiniJava.g:93:4: (lv_classes_1_0= ruleClass )
                    	    // InternalMiniJava.g:94:5: lv_classes_1_0= ruleClass
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_classes_1_0=ruleClass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElementForParent(grammarAccess.getProgramRule());
                    	      					}
                    	      					add(
                    	      						current,
                    	      						"classes",
                    	      						lv_classes_1_0,
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:115:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMiniJava.g:115:46: (iv_ruleClass= ruleClass EOF )
            // InternalMiniJava.g:116:2: iv_ruleClass= ruleClass EOF
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
    // InternalMiniJava.g:122:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* ( (lv_main_7_0= ruleMain ) )? otherlv_8= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_fields_5_0 = null;

        EObject lv_methods_6_0 = null;

        EObject lv_main_7_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:128:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* ( (lv_main_7_0= ruleMain ) )? otherlv_8= '}' ) )
            // InternalMiniJava.g:129:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* ( (lv_main_7_0= ruleMain ) )? otherlv_8= '}' )
            {
            // InternalMiniJava.g:129:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* ( (lv_main_7_0= ruleMain ) )? otherlv_8= '}' )
            // InternalMiniJava.g:130:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_methods_6_0= ruleMethod ) )* ( (lv_main_7_0= ruleMain ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
              		
            }
            // InternalMiniJava.g:134:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:135:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:135:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:136:5: lv_name_1_0= RULE_ID
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

            // InternalMiniJava.g:152:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:153:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMiniJava.g:157:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMiniJava.g:158:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMiniJava.g:158:5: (otherlv_3= RULE_ID )
                    // InternalMiniJava.g:159:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMiniJava.g:175:3: ( (lv_fields_5_0= ruleField ) )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_ID) ) {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==26) ) {
                            alt4=1;
                        }


                    }


                    }
                    break;
                case 25:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==26) ) {
                            alt4=1;
                        }


                    }


                    }
                    break;
                case 20:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (LA4_3==RULE_ID) ) {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==26) ) {
                            alt4=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (LA4_4==RULE_ID) ) {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==26) ) {
                            alt4=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalMiniJava.g:176:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalMiniJava.g:176:4: (lv_fields_5_0= ruleField )
            	    // InternalMiniJava.g:177:5: lv_fields_5_0= ruleField
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
            	    break loop4;
                }
            } while (true);

            // InternalMiniJava.g:194:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==20||(LA5_0>=24 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMiniJava.g:195:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalMiniJava.g:195:4: (lv_methods_6_0= ruleMethod )
            	    // InternalMiniJava.g:196:5: lv_methods_6_0= ruleMethod
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
            	    break loop5;
                }
            } while (true);

            // InternalMiniJava.g:213:3: ( (lv_main_7_0= ruleMain ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:214:4: (lv_main_7_0= ruleMain )
                    {
                    // InternalMiniJava.g:214:4: (lv_main_7_0= ruleMain )
                    // InternalMiniJava.g:215:5: lv_main_7_0= ruleMain
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassAccess().getMainMainParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_main_7_0=ruleMain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassRule());
                      					}
                      					set(
                      						current,
                      						"main",
                      						lv_main_7_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.Main");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
              		
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


    // $ANTLR start "entryRuleMain"
    // InternalMiniJava.g:240:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMiniJava.g:240:45: (iv_ruleMain= ruleMain EOF )
            // InternalMiniJava.g:241:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMiniJava.g:247:1: ruleMain returns [EObject current=null] : (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' ( (lv_body_10_0= ruleMethodBody ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_ID_8=null;
        Token otherlv_9=null;
        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:253:2: ( (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' ( (lv_body_10_0= ruleMethodBody ) ) ) )
            // InternalMiniJava.g:254:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' ( (lv_body_10_0= ruleMethodBody ) ) )
            {
            // InternalMiniJava.g:254:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' ( (lv_body_10_0= ruleMethodBody ) ) )
            // InternalMiniJava.g:255:3: otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' ( (lv_body_10_0= ruleMethodBody ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getPublicKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getStaticKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMainAccess().getVoidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMainAccess().getMainKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMainAccess().getLeftParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMainAccess().getStringKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMainAccess().getLeftSquareBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMainAccess().getRightSquareBracketKeyword_7());
              		
            }
            this_ID_8=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_8, grammarAccess.getMainAccess().getIDTerminalRuleCall_8());
              		
            }
            otherlv_9=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMainAccess().getRightParenthesisKeyword_9());
              		
            }
            // InternalMiniJava.g:295:3: ( (lv_body_10_0= ruleMethodBody ) )
            // InternalMiniJava.g:296:4: (lv_body_10_0= ruleMethodBody )
            {
            // InternalMiniJava.g:296:4: (lv_body_10_0= ruleMethodBody )
            // InternalMiniJava.g:297:5: lv_body_10_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMainAccess().getBodyMethodBodyParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMainRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"org.tetrabox.minijava.xtext.MiniJava.MethodBody");
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:318:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMiniJava.g:318:45: (iv_ruleType= ruleType EOF )
            // InternalMiniJava.g:319:2: iv_ruleType= ruleType EOF
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
    // InternalMiniJava.g:325:1: ruleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_ClassType_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:331:2: ( (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) )
            // InternalMiniJava.g:332:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            {
            // InternalMiniJava.g:332:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20||(LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:333:3: this_BasicType_0= ruleBasicType
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
                    // InternalMiniJava.g:342:3: this_ClassType_1= ruleClassType
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
    // InternalMiniJava.g:354:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalMiniJava.g:354:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalMiniJava.g:355:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalMiniJava.g:361:1: ruleBasicType returns [EObject current=null] : ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_basic_0_1=null;
        Token lv_basic_0_2=null;
        Token lv_basic_0_3=null;


        	enterRule();

        try {
            // InternalMiniJava.g:367:2: ( ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) ) )
            // InternalMiniJava.g:368:2: ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) )
            {
            // InternalMiniJava.g:368:2: ( ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) ) )
            // InternalMiniJava.g:369:3: ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) )
            {
            // InternalMiniJava.g:369:3: ( (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' ) )
            // InternalMiniJava.g:370:4: (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' )
            {
            // InternalMiniJava.g:370:4: (lv_basic_0_1= 'int' | lv_basic_0_2= 'boolean' | lv_basic_0_3= 'String' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:371:5: lv_basic_0_1= 'int'
                    {
                    lv_basic_0_1=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMiniJava.g:382:5: lv_basic_0_2= 'boolean'
                    {
                    lv_basic_0_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMiniJava.g:393:5: lv_basic_0_3= 'String'
                    {
                    lv_basic_0_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:409:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalMiniJava.g:409:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalMiniJava.g:410:2: iv_ruleClassType= ruleClassType EOF
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
    // InternalMiniJava.g:416:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:422:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:423:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:423:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:424:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:424:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:425:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:439:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMiniJava.g:439:46: (iv_ruleField= ruleField EOF )
            // InternalMiniJava.g:440:2: iv_ruleField= ruleField EOF
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
    // InternalMiniJava.g:446:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:452:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:453:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:453:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMiniJava.g:454:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMiniJava.g:454:3: ( (lv_type_0_0= ruleType ) )
            // InternalMiniJava.g:455:4: (lv_type_0_0= ruleType )
            {
            // InternalMiniJava.g:455:4: (lv_type_0_0= ruleType )
            // InternalMiniJava.g:456:5: lv_type_0_0= ruleType
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

            // InternalMiniJava.g:473:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:474:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:474:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:475:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:499:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava.g:499:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava.g:500:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMiniJava.g:506:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:512:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:513:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:513:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:514:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:514:3: ( (lv_type_0_0= ruleType ) )
            // InternalMiniJava.g:515:4: (lv_type_0_0= ruleType )
            {
            // InternalMiniJava.g:515:4: (lv_type_0_0= ruleType )
            // InternalMiniJava.g:516:5: lv_type_0_0= ruleType
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

            // InternalMiniJava.g:533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:534:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:535:5: lv_name_1_0= RULE_ID
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
    // InternalMiniJava.g:555:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMiniJava.g:555:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMiniJava.g:556:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalMiniJava.g:562:1: ruleMethod returns [EObject current=null] : ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleMethodBody ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_returntype_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:568:2: ( ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleMethodBody ) ) ) )
            // InternalMiniJava.g:569:2: ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleMethodBody ) ) )
            {
            // InternalMiniJava.g:569:2: ( ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleMethodBody ) ) )
            // InternalMiniJava.g:570:3: ( (lv_returntype_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleMethodBody ) )
            {
            // InternalMiniJava.g:570:3: ( (lv_returntype_0_0= ruleType ) )
            // InternalMiniJava.g:571:4: (lv_returntype_0_0= ruleType )
            {
            // InternalMiniJava.g:571:4: (lv_returntype_0_0= ruleType )
            // InternalMiniJava.g:572:5: lv_returntype_0_0= ruleType
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

            // InternalMiniJava.g:589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:590:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:591:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:611:3: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==20||(LA10_0>=24 && LA10_0<=25)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:612:4: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // InternalMiniJava.g:612:4: ( (lv_params_3_0= ruleParameter ) )
                    // InternalMiniJava.g:613:5: (lv_params_3_0= ruleParameter )
                    {
                    // InternalMiniJava.g:613:5: (lv_params_3_0= ruleParameter )
                    // InternalMiniJava.g:614:6: lv_params_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalMiniJava.g:631:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMiniJava.g:632:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:636:5: ( (lv_params_5_0= ruleParameter ) )
                    	    // InternalMiniJava.g:637:6: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // InternalMiniJava.g:637:6: (lv_params_5_0= ruleParameter )
                    	    // InternalMiniJava.g:638:7: lv_params_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMiniJava.g:661:3: ( (lv_body_7_0= ruleMethodBody ) )
            // InternalMiniJava.g:662:4: (lv_body_7_0= ruleMethodBody )
            {
            // InternalMiniJava.g:662:4: (lv_body_7_0= ruleMethodBody )
            // InternalMiniJava.g:663:5: lv_body_7_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.tetrabox.minijava.xtext.MiniJava.MethodBody");
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodBody"
    // InternalMiniJava.g:684:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // InternalMiniJava.g:684:51: (iv_ruleMethodBody= ruleMethodBody EOF )
            // InternalMiniJava.g:685:2: iv_ruleMethodBody= ruleMethodBody EOF
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
    // InternalMiniJava.g:691:1: ruleMethodBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' otherlv_3= '}' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:697:2: ( (otherlv_0= '{' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' otherlv_3= '}' ) )
            // InternalMiniJava.g:698:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' otherlv_3= '}' )
            {
            // InternalMiniJava.g:698:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' otherlv_3= '}' )
            // InternalMiniJava.g:699:3: otherlv_0= '{' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMiniJava.g:703:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMiniJava.g:704:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMiniJava.g:704:4: (lv_expression_1_0= ruleExpression )
            // InternalMiniJava.g:705:5: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodBodyAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodBodyAccess().getSemicolonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodBodyAccess().getRightCurlyBracketKeyword_3());
              		
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
    // InternalMiniJava.g:734:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:734:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:735:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMiniJava.g:741:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:747:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* ) )
            // InternalMiniJava.g:748:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* )
            {
            // InternalMiniJava.g:748:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )* )
            // InternalMiniJava.g:749:3: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:757:3: ( () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava.g:758:4: () otherlv_2= '.' ( (lv_message_3_0= ruleMessage ) )
            	    {
            	    // InternalMiniJava.g:758:4: ()
            	    // InternalMiniJava.g:759:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:769:4: ( (lv_message_3_0= ruleMessage ) )
            	    // InternalMiniJava.g:770:5: (lv_message_3_0= ruleMessage )
            	    {
            	    // InternalMiniJava.g:770:5: (lv_message_3_0= ruleMessage )
            	    // InternalMiniJava.g:771:6: lv_message_3_0= ruleMessage
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getMessageMessageParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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
            	    break loop11;
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
    // InternalMiniJava.g:793:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMiniJava.g:793:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMiniJava.g:794:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMiniJava.g:800:1: ruleMessage returns [EObject current=null] : (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;

        EObject this_FieldSelection_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:806:2: ( (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection ) )
            // InternalMiniJava.g:807:2: (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection )
            {
            // InternalMiniJava.g:807:2: (this_MethodCall_0= ruleMethodCall | this_FieldSelection_1= ruleFieldSelection )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==23||(LA12_1>=26 && LA12_1<=28)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==19) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:808:3: this_MethodCall_0= ruleMethodCall
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
                    // InternalMiniJava.g:817:3: this_FieldSelection_1= ruleFieldSelection
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
    // InternalMiniJava.g:829:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMiniJava.g:829:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMiniJava.g:830:2: iv_ruleMethodCall= ruleMethodCall EOF
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
    // InternalMiniJava.g:836:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalMiniJava.g:842:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) )
            // InternalMiniJava.g:843:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            {
            // InternalMiniJava.g:843:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            // InternalMiniJava.g:844:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')'
            {
            // InternalMiniJava.g:844:3: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:845:4: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:845:4: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:846:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getNameMethodCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:861:3: ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==19||(LA14_0>=29 && LA14_0<=32)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:862:4: ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    {
                    // InternalMiniJava.g:862:4: ( (lv_args_2_0= ruleArgument ) )
                    // InternalMiniJava.g:863:5: (lv_args_2_0= ruleArgument )
                    {
                    // InternalMiniJava.g:863:5: (lv_args_2_0= ruleArgument )
                    // InternalMiniJava.g:864:6: lv_args_2_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalMiniJava.g:881:4: (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMiniJava.g:882:5: otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:886:5: ( (lv_args_4_0= ruleArgument ) )
                    	    // InternalMiniJava.g:887:6: (lv_args_4_0= ruleArgument )
                    	    {
                    	    // InternalMiniJava.g:887:6: (lv_args_4_0= ruleArgument )
                    	    // InternalMiniJava.g:888:7: lv_args_4_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:915:1: entryRuleFieldSelection returns [EObject current=null] : iv_ruleFieldSelection= ruleFieldSelection EOF ;
    public final EObject entryRuleFieldSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelection = null;


        try {
            // InternalMiniJava.g:915:55: (iv_ruleFieldSelection= ruleFieldSelection EOF )
            // InternalMiniJava.g:916:2: iv_ruleFieldSelection= ruleFieldSelection EOF
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
    // InternalMiniJava.g:922:1: ruleFieldSelection returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFieldSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:928:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:929:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:929:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:930:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:930:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:931:4: otherlv_0= RULE_ID
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
    // InternalMiniJava.g:945:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalMiniJava.g:945:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalMiniJava.g:946:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalMiniJava.g:952:1: ruleTerminalExpression returns [EObject current=null] : (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) ;
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
            // InternalMiniJava.g:958:2: ( (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) )
            // InternalMiniJava.g:959:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            {
            // InternalMiniJava.g:959:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:960:3: this_This_0= ruleThis
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
                    // InternalMiniJava.g:969:3: this_Variable_1= ruleVariable
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
                    // InternalMiniJava.g:978:3: this_New_2= ruleNew
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
                    // InternalMiniJava.g:987:3: ( ( '(' )=>this_Cast_3= ruleCast )
                    {
                    // InternalMiniJava.g:987:3: ( ( '(' )=>this_Cast_3= ruleCast )
                    // InternalMiniJava.g:988:4: ( '(' )=>this_Cast_3= ruleCast
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
                    // InternalMiniJava.g:999:3: this_Constant_4= ruleConstant
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
                    // InternalMiniJava.g:1008:3: this_Paren_5= ruleParen
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
    // InternalMiniJava.g:1020:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // InternalMiniJava.g:1020:45: (iv_ruleThis= ruleThis EOF )
            // InternalMiniJava.g:1021:2: iv_ruleThis= ruleThis EOF
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
    // InternalMiniJava.g:1027:1: ruleThis returns [EObject current=null] : ( (lv_variable_0_0= 'this' ) ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1033:2: ( ( (lv_variable_0_0= 'this' ) ) )
            // InternalMiniJava.g:1034:2: ( (lv_variable_0_0= 'this' ) )
            {
            // InternalMiniJava.g:1034:2: ( (lv_variable_0_0= 'this' ) )
            // InternalMiniJava.g:1035:3: (lv_variable_0_0= 'this' )
            {
            // InternalMiniJava.g:1035:3: (lv_variable_0_0= 'this' )
            // InternalMiniJava.g:1036:4: lv_variable_0_0= 'this'
            {
            lv_variable_0_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:1051:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMiniJava.g:1051:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMiniJava.g:1052:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMiniJava.g:1058:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1064:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMiniJava.g:1065:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMiniJava.g:1065:2: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:1066:3: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:1066:3: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:1067:4: otherlv_0= RULE_ID
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
    // InternalMiniJava.g:1081:1: entryRuleNew returns [EObject current=null] : iv_ruleNew= ruleNew EOF ;
    public final EObject entryRuleNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNew = null;


        try {
            // InternalMiniJava.g:1081:44: (iv_ruleNew= ruleNew EOF )
            // InternalMiniJava.g:1082:2: iv_ruleNew= ruleNew EOF
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
    // InternalMiniJava.g:1088:1: ruleNew returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalMiniJava.g:1094:2: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalMiniJava.g:1095:2: (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalMiniJava.g:1095:2: (otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalMiniJava.g:1096:3: otherlv_0= 'new' ( (lv_type_1_0= ruleClassType ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNewAccess().getNewKeyword_0());
              		
            }
            // InternalMiniJava.g:1100:3: ( (lv_type_1_0= ruleClassType ) )
            // InternalMiniJava.g:1101:4: (lv_type_1_0= ruleClassType )
            {
            // InternalMiniJava.g:1101:4: (lv_type_1_0= ruleClassType )
            // InternalMiniJava.g:1102:5: lv_type_1_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNewAccess().getTypeClassTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,19,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNewAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:1123:3: ( ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==19||(LA17_0>=29 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1124:4: ( (lv_args_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )*
                    {
                    // InternalMiniJava.g:1124:4: ( (lv_args_3_0= ruleArgument ) )
                    // InternalMiniJava.g:1125:5: (lv_args_3_0= ruleArgument )
                    {
                    // InternalMiniJava.g:1125:5: (lv_args_3_0= ruleArgument )
                    // InternalMiniJava.g:1126:6: lv_args_3_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalMiniJava.g:1143:4: (otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMiniJava.g:1144:5: otherlv_4= ',' ( (lv_args_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getNewAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:1148:5: ( (lv_args_5_0= ruleArgument ) )
                    	    // InternalMiniJava.g:1149:6: (lv_args_5_0= ruleArgument )
                    	    {
                    	    // InternalMiniJava.g:1149:6: (lv_args_5_0= ruleArgument )
                    	    // InternalMiniJava.g:1150:7: lv_args_5_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:1177:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // InternalMiniJava.g:1177:45: (iv_ruleCast= ruleCast EOF )
            // InternalMiniJava.g:1178:2: iv_ruleCast= ruleCast EOF
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
    // InternalMiniJava.g:1184:1: ruleCast returns [EObject current=null] : ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_object_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1190:2: ( ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) ) )
            // InternalMiniJava.g:1191:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) )
            {
            // InternalMiniJava.g:1191:2: ( ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) ) )
            // InternalMiniJava.g:1192:3: ( ( '(' )=>otherlv_0= '(' ) ( (lv_type_1_0= ruleClassType ) ) otherlv_2= ')' ( (lv_object_3_0= ruleTerminalExpression ) )
            {
            // InternalMiniJava.g:1192:3: ( ( '(' )=>otherlv_0= '(' )
            // InternalMiniJava.g:1193:4: ( '(' )=>otherlv_0= '('
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getCastAccess().getLeftParenthesisKeyword_0());
              			
            }

            }

            // InternalMiniJava.g:1199:3: ( (lv_type_1_0= ruleClassType ) )
            // InternalMiniJava.g:1200:4: (lv_type_1_0= ruleClassType )
            {
            // InternalMiniJava.g:1200:4: (lv_type_1_0= ruleClassType )
            // InternalMiniJava.g:1201:5: lv_type_1_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCastAccess().getTypeClassTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,23,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCastAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:1222:3: ( (lv_object_3_0= ruleTerminalExpression ) )
            // InternalMiniJava.g:1223:4: (lv_object_3_0= ruleTerminalExpression )
            {
            // InternalMiniJava.g:1223:4: (lv_object_3_0= ruleTerminalExpression )
            // InternalMiniJava.g:1224:5: lv_object_3_0= ruleTerminalExpression
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
    // InternalMiniJava.g:1245:1: entryRuleParen returns [EObject current=null] : iv_ruleParen= ruleParen EOF ;
    public final EObject entryRuleParen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParen = null;


        try {
            // InternalMiniJava.g:1245:46: (iv_ruleParen= ruleParen EOF )
            // InternalMiniJava.g:1246:2: iv_ruleParen= ruleParen EOF
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
    // InternalMiniJava.g:1252:1: ruleParen returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1258:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalMiniJava.g:1259:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalMiniJava.g:1259:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalMiniJava.g:1260:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:1280:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMiniJava.g:1280:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMiniJava.g:1281:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalMiniJava.g:1287:1: ruleConstant returns [EObject current=null] : (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstant_0 = null;

        EObject this_BoolConstant_1 = null;

        EObject this_StringConstant_2 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1293:2: ( (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) )
            // InternalMiniJava.g:1294:2: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            {
            // InternalMiniJava.g:1294:2: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case 31:
            case 32:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1295:3: this_IntConstant_0= ruleIntConstant
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
                    // InternalMiniJava.g:1304:3: this_BoolConstant_1= ruleBoolConstant
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
                    // InternalMiniJava.g:1313:3: this_StringConstant_2= ruleStringConstant
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
    // InternalMiniJava.g:1325:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // InternalMiniJava.g:1325:55: (iv_ruleStringConstant= ruleStringConstant EOF )
            // InternalMiniJava.g:1326:2: iv_ruleStringConstant= ruleStringConstant EOF
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
    // InternalMiniJava.g:1332:1: ruleStringConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1338:2: ( ( (lv_constant_0_0= RULE_STRING ) ) )
            // InternalMiniJava.g:1339:2: ( (lv_constant_0_0= RULE_STRING ) )
            {
            // InternalMiniJava.g:1339:2: ( (lv_constant_0_0= RULE_STRING ) )
            // InternalMiniJava.g:1340:3: (lv_constant_0_0= RULE_STRING )
            {
            // InternalMiniJava.g:1340:3: (lv_constant_0_0= RULE_STRING )
            // InternalMiniJava.g:1341:4: lv_constant_0_0= RULE_STRING
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
    // InternalMiniJava.g:1360:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // InternalMiniJava.g:1360:52: (iv_ruleIntConstant= ruleIntConstant EOF )
            // InternalMiniJava.g:1361:2: iv_ruleIntConstant= ruleIntConstant EOF
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
    // InternalMiniJava.g:1367:1: ruleIntConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1373:2: ( ( (lv_constant_0_0= RULE_INT ) ) )
            // InternalMiniJava.g:1374:2: ( (lv_constant_0_0= RULE_INT ) )
            {
            // InternalMiniJava.g:1374:2: ( (lv_constant_0_0= RULE_INT ) )
            // InternalMiniJava.g:1375:3: (lv_constant_0_0= RULE_INT )
            {
            // InternalMiniJava.g:1375:3: (lv_constant_0_0= RULE_INT )
            // InternalMiniJava.g:1376:4: lv_constant_0_0= RULE_INT
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
    // InternalMiniJava.g:1395:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // InternalMiniJava.g:1395:53: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // InternalMiniJava.g:1396:2: iv_ruleBoolConstant= ruleBoolConstant EOF
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
    // InternalMiniJava.g:1402:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_1=null;
        Token lv_constant_0_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1408:2: ( ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) )
            // InternalMiniJava.g:1409:2: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            {
            // InternalMiniJava.g:1409:2: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            // InternalMiniJava.g:1410:3: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            {
            // InternalMiniJava.g:1410:3: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            // InternalMiniJava.g:1411:4: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            {
            // InternalMiniJava.g:1411:4: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniJava.g:1412:5: lv_constant_0_1= 'true'
                    {
                    lv_constant_0_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMiniJava.g:1423:5: lv_constant_0_2= 'false'
                    {
                    lv_constant_0_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalMiniJava.g:1439:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMiniJava.g:1439:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMiniJava.g:1440:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMiniJava.g:1446:1: ruleArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1452:2: (this_Expression_0= ruleExpression )
            // InternalMiniJava.g:1453:2: this_Expression_0= ruleExpression
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
        // InternalMiniJava.g:89:4: ( ( ruleClass ) )
        // InternalMiniJava.g:89:5: ( ruleClass )
        {
        // InternalMiniJava.g:89:5: ( ruleClass )
        // InternalMiniJava.g:90:5: ruleClass
        {
        pushFollow(FOLLOW_2);
        ruleClass();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMiniJava

    // $ANTLR start synpred2_InternalMiniJava
    public final void synpred2_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:988:4: ( '(' )
        // InternalMiniJava.g:988:5: '('
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMiniJava

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
    public final boolean synpred2_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\40\3\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\3\uffff\1\4\1\6";
    static final String dfa_5s = "\4\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\5\14\uffff\1\4\11\uffff\1\1\1\3\2\5",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "959:2: (this_This_0= ruleThis | this_Variable_1= ruleVariable | this_New_2= ruleNew | ( ( '(' )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMiniJava()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000310C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003900010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001E0080070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0880070L});

}