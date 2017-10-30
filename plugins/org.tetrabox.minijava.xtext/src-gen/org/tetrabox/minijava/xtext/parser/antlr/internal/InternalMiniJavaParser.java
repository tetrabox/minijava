package org.tetrabox.minijava.xtext.parser.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'.*'", "'class'", "'extends'", "'{'", "'}'", "'('", "','", "')'", "'='", "'return'", "'if'", "'else'", "'true'", "'false'", "'this'", "'super'", "'null'", "'new'", "'private'", "'protected'", "'public'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
    // InternalMiniJava.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMiniJava.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMiniJava.g:66:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalMiniJava.g:72:1: ruleProgram returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleClass ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:78:2: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleClass ) )* ) )
            // InternalMiniJava.g:79:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleClass ) )* )
            {
            // InternalMiniJava.g:79:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleClass ) )* )
            // InternalMiniJava.g:80:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleClass ) )*
            {
            // InternalMiniJava.g:80:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:81:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPackageKeyword_0_0());
                      			
                    }
                    // InternalMiniJava.g:85:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalMiniJava.g:86:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalMiniJava.g:86:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalMiniJava.g:87:6: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMiniJava.g:109:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniJava.g:110:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalMiniJava.g:110:4: (lv_imports_3_0= ruleImport )
            	    // InternalMiniJava.g:111:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMiniJava.g:128:3: ( (lv_classes_4_0= ruleClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava.g:129:4: (lv_classes_4_0= ruleClass )
            	    {
            	    // InternalMiniJava.g:129:4: (lv_classes_4_0= ruleClass )
            	    // InternalMiniJava.g:130:5: lv_classes_4_0= ruleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_4_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Class");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava.g:151:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMiniJava.g:151:47: (iv_ruleImport= ruleImport EOF )
            // InternalMiniJava.g:152:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava.g:158:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:164:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:165:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:165:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalMiniJava.g:166:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalMiniJava.g:170:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava.g:171:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava.g:171:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMiniJava.g:172:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:197:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMiniJava.g:197:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMiniJava.g:198:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:210:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMiniJava.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMiniJava.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMiniJava.g:212:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalMiniJava.g:219:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniJava.g:220:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava.g:237:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMiniJava.g:237:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava.g:238:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava.g:244:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:250:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMiniJava.g:251:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMiniJava.g:251:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMiniJava.g:252:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:262:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:263:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:273:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMiniJava.g:273:46: (iv_ruleClass= ruleClass EOF )
            // InternalMiniJava.g:274:2: iv_ruleClass= ruleClass EOF
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
    // InternalMiniJava.g:280:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:286:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) )
            // InternalMiniJava.g:287:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            {
            // InternalMiniJava.g:287:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            // InternalMiniJava.g:288:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
              		
            }
            // InternalMiniJava.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:293:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:294:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            // InternalMiniJava.g:310:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:311:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMiniJava.g:315:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:316:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:316:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:317:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassAccess().getSuperclassClassCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMiniJava.g:336:3: ( (lv_members_5_0= ruleMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=33 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniJava.g:337:4: (lv_members_5_0= ruleMember )
            	    {
            	    // InternalMiniJava.g:337:4: (lv_members_5_0= ruleMember )
            	    // InternalMiniJava.g:338:5: lv_members_5_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_members_5_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_5_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
              		
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


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:363:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMiniJava.g:363:47: (iv_ruleMember= ruleMember EOF )
            // InternalMiniJava.g:364:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:370:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:376:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalMiniJava.g:377:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalMiniJava.g:377:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:378:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:387:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:399:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMiniJava.g:399:46: (iv_ruleField= ruleField EOF )
            // InternalMiniJava.g:400:2: iv_ruleField= ruleField EOF
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
    // InternalMiniJava.g:406:1: ruleField returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_access_0_0 = null;

        EObject this_TypedDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:412:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= ';' ) )
            // InternalMiniJava.g:413:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= ';' )
            {
            // InternalMiniJava.g:413:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= ';' )
            // InternalMiniJava.g:414:3: ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= ';'
            {
            // InternalMiniJava.g:414:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=35)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:415:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:415:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:416:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFieldRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFieldRule());
              			}
              			newCompositeNode(grammarAccess.getFieldAccess().getTypedDeclarationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            this_TypedDeclaration_1=ruleTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypedDeclaration_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:452:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMiniJava.g:452:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMiniJava.g:453:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalMiniJava.g:459:1: ruleMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_access_0_0 = null;

        EObject this_TypedDeclaration_1 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:465:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) ) )
            // InternalMiniJava.g:466:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) )
            {
            // InternalMiniJava.g:466:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) )
            // InternalMiniJava.g:467:3: ( (lv_access_0_0= ruleAccessLevel ) )? this_TypedDeclaration_1= ruleTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) )
            {
            // InternalMiniJava.g:467:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:468:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:468:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:469:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMethodRule());
              			}
              			newCompositeNode(grammarAccess.getMethodAccess().getTypedDeclarationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
            this_TypedDeclaration_1=ruleTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypedDeclaration_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMiniJava.g:501:3: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:502:4: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // InternalMiniJava.g:502:4: ( (lv_params_3_0= ruleParameter ) )
                    // InternalMiniJava.g:503:5: (lv_params_3_0= ruleParameter )
                    {
                    // InternalMiniJava.g:503:5: (lv_params_3_0= ruleParameter )
                    // InternalMiniJava.g:504:6: lv_params_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalMiniJava.g:521:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMiniJava.g:522:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:526:5: ( (lv_params_5_0= ruleParameter ) )
                    	    // InternalMiniJava.g:527:6: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // InternalMiniJava.g:527:6: (lv_params_5_0= ruleParameter )
                    	    // InternalMiniJava.g:528:7: lv_params_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMiniJava.g:551:3: ( (lv_body_7_0= ruleBlock ) )
            // InternalMiniJava.g:552:4: (lv_body_7_0= ruleBlock )
            {
            // InternalMiniJava.g:552:4: (lv_body_7_0= ruleBlock )
            // InternalMiniJava.g:553:5: lv_body_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleBlock();

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
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
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


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:574:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava.g:574:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava.g:575:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMiniJava.g:581:1: ruleParameter returns [EObject current=null] : this_TypedDeclaration_0= ruleTypedDeclaration[$current] ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_TypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:587:2: (this_TypedDeclaration_0= ruleTypedDeclaration[$current] )
            // InternalMiniJava.g:588:2: this_TypedDeclaration_0= ruleTypedDeclaration[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getParameterRule());
              		}
              		newCompositeNode(grammarAccess.getParameterAccess().getTypedDeclarationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TypedDeclaration_0=ruleTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TypedDeclaration_0;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava.g:602:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMiniJava.g:602:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMiniJava.g:603:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMiniJava.g:609:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:615:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalMiniJava.g:616:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalMiniJava.g:616:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalMiniJava.g:617:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalMiniJava.g:617:3: ()
            // InternalMiniJava.g:618:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMiniJava.g:628:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==20||(LA13_0>=24 && LA13_0<=25)||(LA13_0>=27 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniJava.g:629:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:629:4: (lv_statements_2_0= ruleStatement )
            	    // InternalMiniJava.g:630:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:655:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava.g:655:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava.g:656:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:662:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_VariableDeclaration_0 = null;

        EObject this_Return_1 = null;

        EObject this_Expression_2 = null;

        EObject this_IfStatement_4 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:668:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement ) )
            // InternalMiniJava.g:669:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement )
            {
            // InternalMiniJava.g:669:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:670:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:679:3: this_Return_1= ruleReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Return_1=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Return_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:688:3: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    {
                    // InternalMiniJava.g:688:3: (this_Expression_2= ruleExpression otherlv_3= ';' )
                    // InternalMiniJava.g:689:4: this_Expression_2= ruleExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:703:3: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_4;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava.g:715:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMiniJava.g:715:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMiniJava.g:716:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava.g:722:1: ruleVariableDeclaration returns [EObject current=null] : (this_TypedDeclaration_0= ruleTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TypedDeclaration_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:728:2: ( (this_TypedDeclaration_0= ruleTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalMiniJava.g:729:2: (this_TypedDeclaration_0= ruleTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalMiniJava.g:729:2: (this_TypedDeclaration_0= ruleTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalMiniJava.g:730:3: this_TypedDeclaration_0= ruleTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getVariableDeclarationRule());
              			}
              			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_TypedDeclaration_0=ruleTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMiniJava.g:745:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniJava.g:746:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniJava.g:746:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniJava.g:747:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava.g:772:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalMiniJava.g:772:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalMiniJava.g:773:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava.g:779:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:785:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:786:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:786:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // InternalMiniJava.g:787:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalMiniJava.g:791:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMiniJava.g:792:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMiniJava.g:792:4: (lv_expression_1_0= ruleExpression )
            // InternalMiniJava.g:793:5: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnRule());
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

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava.g:818:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMiniJava.g:818:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMiniJava.g:819:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava.g:825:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:831:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // InternalMiniJava.g:832:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // InternalMiniJava.g:832:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // InternalMiniJava.g:833:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:841:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniJava.g:842:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniJava.g:842:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniJava.g:843:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMiniJava.g:864:3: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // InternalMiniJava.g:865:4: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // InternalMiniJava.g:865:4: (lv_thenBlock_4_0= ruleIfBlock )
            // InternalMiniJava.g:866:5: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_thenBlock_4_0=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.IfBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:883:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred1_InternalMiniJava()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:884:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // InternalMiniJava.g:884:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMiniJava.g:885:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalMiniJava.g:891:4: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // InternalMiniJava.g:892:5: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // InternalMiniJava.g:892:5: (lv_elseBlock_6_0= ruleIfBlock )
                    // InternalMiniJava.g:893:6: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.IfBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIfBlock"
    // InternalMiniJava.g:915:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // InternalMiniJava.g:915:48: (iv_ruleIfBlock= ruleIfBlock EOF )
            // InternalMiniJava.g:916:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
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
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // InternalMiniJava.g:922:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) | this_Block_1= ruleBlock ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_Block_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:928:2: ( ( ( (lv_statements_0_0= ruleStatement ) ) | this_Block_1= ruleBlock ) )
            // InternalMiniJava.g:929:2: ( ( (lv_statements_0_0= ruleStatement ) ) | this_Block_1= ruleBlock )
            {
            // InternalMiniJava.g:929:2: ( ( (lv_statements_0_0= ruleStatement ) ) | this_Block_1= ruleBlock )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==20||(LA16_0>=24 && LA16_0<=25)||(LA16_0>=27 && LA16_0<=32)) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:930:3: ( (lv_statements_0_0= ruleStatement ) )
                    {
                    // InternalMiniJava.g:930:3: ( (lv_statements_0_0= ruleStatement ) )
                    // InternalMiniJava.g:931:4: (lv_statements_0_0= ruleStatement )
                    {
                    // InternalMiniJava.g:931:4: (lv_statements_0_0= ruleStatement )
                    // InternalMiniJava.g:932:5: lv_statements_0_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_statements_0_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIfBlockRule());
                      					}
                      					add(
                      						current,
                      						"statements",
                      						lv_statements_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.Statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:950:3: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIfBlockAccess().getBlockParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_1;
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
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava.g:962:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalMiniJava.g:962:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalMiniJava.g:963:2: iv_ruleSymbol= ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbol; 
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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava.g:969:1: ruleSymbol returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_Parameter_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:975:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Parameter_1= ruleParameter ) )
            // InternalMiniJava.g:976:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Parameter_1= ruleParameter )
            {
            // InternalMiniJava.g:976:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Parameter_1= ruleParameter )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:977:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:986:3: this_Parameter_1= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSymbolAccess().getParameterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parameter_1;
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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava.g:999:1: ruleTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1005:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:1006:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:1006:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:1007:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:1007:3: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:1008:4: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:1008:4: ( ruleQualifiedName )
            // InternalMiniJava.g:1009:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedDeclarationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedDeclarationAccess().getTypeClassCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:1023:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:1024:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:1024:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:1025:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedDeclarationRule());
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
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:1045:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:1045:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:1046:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMiniJava.g:1052:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1058:2: (this_Assignment_0= ruleAssignment )
            // InternalMiniJava.g:1059:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Assignment_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava.g:1070:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMiniJava.g:1070:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMiniJava.g:1071:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava.g:1077:1: ruleAssignment returns [EObject current=null] : (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SelectionExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1083:2: ( (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // InternalMiniJava.g:1084:2: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // InternalMiniJava.g:1084:2: (this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )? )
            // InternalMiniJava.g:1085:3: this_SelectionExpression_0= ruleSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_SelectionExpression_0=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SelectionExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:1093:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1094:4: () otherlv_2= '=' ( (lv_right_3_0= ruleExpression ) )
                    {
                    // InternalMiniJava.g:1094:4: ()
                    // InternalMiniJava.g:1095:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalMiniJava.g:1105:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalMiniJava.g:1106:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1106:5: (lv_right_3_0= ruleExpression )
                    // InternalMiniJava.g:1107:6: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava.g:1129:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // InternalMiniJava.g:1129:60: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // InternalMiniJava.g:1130:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
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
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava.g:1136:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1142:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalMiniJava.g:1143:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalMiniJava.g:1143:2: (this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalMiniJava.g:1144:3: this_TerminalExpression_0= ruleTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:1152:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMiniJava.g:1153:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalMiniJava.g:1153:4: ()
            	    // InternalMiniJava.g:1154:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:1164:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMiniJava.g:1165:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMiniJava.g:1165:5: (otherlv_3= RULE_ID )
            	    // InternalMiniJava.g:1166:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalMiniJava.g:1177:4: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==20) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMiniJava.g:1178:5: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalMiniJava.g:1178:5: ( (lv_methodinvocation_4_0= '(' ) )
            	            // InternalMiniJava.g:1179:6: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // InternalMiniJava.g:1179:6: (lv_methodinvocation_4_0= '(' )
            	            // InternalMiniJava.g:1180:7: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,20,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "methodinvocation", true, "(");
            	              						
            	            }

            	            }


            	            }

            	            // InternalMiniJava.g:1192:5: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==20||(LA20_0>=27 && LA20_0<=32)) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // InternalMiniJava.g:1193:6: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // InternalMiniJava.g:1193:6: ( (lv_args_5_0= ruleExpression ) )
            	                    // InternalMiniJava.g:1194:7: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // InternalMiniJava.g:1194:7: (lv_args_5_0= ruleExpression )
            	                    // InternalMiniJava.g:1195:8: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      								newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0());
            	                      							
            	                    }
            	                    pushFollow(FOLLOW_15);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	                      								}
            	                      								add(
            	                      									current,
            	                      									"args",
            	                      									lv_args_5_0,
            	                      									"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	                      								afterParserOrEnumRuleCall();
            	                      							
            	                    }

            	                    }


            	                    }

            	                    // InternalMiniJava.g:1212:6: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop19:
            	                    do {
            	                        int alt19=2;
            	                        int LA19_0 = input.LA(1);

            	                        if ( (LA19_0==21) ) {
            	                            alt19=1;
            	                        }


            	                        switch (alt19) {
            	                    	case 1 :
            	                    	    // InternalMiniJava.g:1213:7: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      							newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	      						
            	                    	    }
            	                    	    // InternalMiniJava.g:1217:7: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // InternalMiniJava.g:1218:8: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // InternalMiniJava.g:1218:8: (lv_args_7_0= ruleExpression )
            	                    	    // InternalMiniJava.g:1219:9: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    pushFollow(FOLLOW_15);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									if (current==null) {
            	                    	      										current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	                    	      									}
            	                    	      									add(
            	                    	      										current,
            	                    	      										"args",
            	                    	      										lv_args_7_0,
            	                    	      										"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	                    	      									afterParserOrEnumRuleCall();
            	                    	      								
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop19;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_8, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:1248:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalMiniJava.g:1248:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalMiniJava.g:1249:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalMiniJava.g:1255:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_Expression_20 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1261:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' ) ) )
            // InternalMiniJava.g:1262:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' ) )
            {
            // InternalMiniJava.g:1262:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
                {
                alt24=2;
                }
                break;
            case 27:
            case 28:
                {
                alt24=3;
                }
                break;
            case 29:
                {
                alt24=4;
                }
                break;
            case 30:
                {
                alt24=5;
                }
                break;
            case 31:
                {
                alt24=6;
                }
                break;
            case RULE_ID:
                {
                alt24=7;
                }
                break;
            case 32:
                {
                alt24=8;
                }
                break;
            case 20:
                {
                alt24=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:1263:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalMiniJava.g:1263:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalMiniJava.g:1264:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalMiniJava.g:1264:4: ()
                    // InternalMiniJava.g:1265:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:1271:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalMiniJava.g:1272:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalMiniJava.g:1272:5: (lv_value_1_0= RULE_STRING )
                    // InternalMiniJava.g:1273:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1291:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalMiniJava.g:1291:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalMiniJava.g:1292:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalMiniJava.g:1292:4: ()
                    // InternalMiniJava.g:1293:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:1299:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalMiniJava.g:1300:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalMiniJava.g:1300:5: (lv_value_3_0= RULE_INT )
                    // InternalMiniJava.g:1301:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1319:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalMiniJava.g:1319:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalMiniJava.g:1320:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalMiniJava.g:1320:4: ()
                    // InternalMiniJava.g:1321:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:1327:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalMiniJava.g:1328:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalMiniJava.g:1328:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalMiniJava.g:1329:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalMiniJava.g:1329:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==28) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMiniJava.g:1330:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalMiniJava.g:1341:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1356:3: ( () otherlv_7= 'this' )
                    {
                    // InternalMiniJava.g:1356:3: ( () otherlv_7= 'this' )
                    // InternalMiniJava.g:1357:4: () otherlv_7= 'this'
                    {
                    // InternalMiniJava.g:1357:4: ()
                    // InternalMiniJava.g:1358:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getThisAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1370:3: ( () otherlv_9= 'super' )
                    {
                    // InternalMiniJava.g:1370:3: ( () otherlv_9= 'super' )
                    // InternalMiniJava.g:1371:4: () otherlv_9= 'super'
                    {
                    // InternalMiniJava.g:1371:4: ()
                    // InternalMiniJava.g:1372:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1384:3: ( () otherlv_11= 'null' )
                    {
                    // InternalMiniJava.g:1384:3: ( () otherlv_11= 'null' )
                    // InternalMiniJava.g:1385:4: () otherlv_11= 'null'
                    {
                    // InternalMiniJava.g:1385:4: ()
                    // InternalMiniJava.g:1386:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNullAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1398:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalMiniJava.g:1398:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalMiniJava.g:1399:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1399:4: ()
                    // InternalMiniJava.g:1400:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:1406:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMiniJava.g:1407:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMiniJava.g:1407:5: (otherlv_13= RULE_ID )
                    // InternalMiniJava.g:1408:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1421:3: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' )
                    {
                    // InternalMiniJava.g:1421:3: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' )
                    // InternalMiniJava.g:1422:4: () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')'
                    {
                    // InternalMiniJava.g:1422:4: ()
                    // InternalMiniJava.g:1423:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNewAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1());
                      			
                    }
                    // InternalMiniJava.g:1433:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:1434:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:1434:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:1435:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getTypeClassCrossReference_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                      			
                    }
                    otherlv_18=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1459:3: (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' )
                    {
                    // InternalMiniJava.g:1459:3: (otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')' )
                    // InternalMiniJava.g:1460:4: otherlv_19= '(' this_Expression_20= ruleExpression otherlv_21= ')'
                    {
                    otherlv_19=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_Expression_20=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_20;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_21=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_8_2());
                      			
                    }

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


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava.g:1481:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1487:2: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) )
            // InternalMiniJava.g:1488:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            {
            // InternalMiniJava.g:1488:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMiniJava.g:1489:3: (enumLiteral_0= 'private' )
                    {
                    // InternalMiniJava.g:1489:3: (enumLiteral_0= 'private' )
                    // InternalMiniJava.g:1490:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1497:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalMiniJava.g:1497:3: (enumLiteral_1= 'protected' )
                    // InternalMiniJava.g:1498:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1505:3: (enumLiteral_2= 'public' )
                    {
                    // InternalMiniJava.g:1505:3: (enumLiteral_2= 'public' )
                    // InternalMiniJava.g:1506:4: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2());
                      			
                    }

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
    // $ANTLR end "ruleAccessLevel"

    // $ANTLR start synpred1_InternalMiniJava
    public final void synpred1_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:885:5: ( 'else' )
        // InternalMiniJava.g:885:6: 'else'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\4\1\14\1\4\2\uffff";
    static final String dfa_3s = "\1\43\3\4\1\16\1\4\1\24\1\16\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\34\uffff\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\6\11\uffff\1\5",
            "\1\7",
            "\1\11\7\uffff\1\10",
            "\1\6\11\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "377:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String dfa_9s = "\1\40\1\27\3\uffff\1\4\1\uffff\1\27";
    static final String dfa_10s = "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\3\15\uffff\1\3\3\uffff\1\2\1\4\1\uffff\6\3",
            "\1\6\7\uffff\1\3\1\uffff\1\5\10\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\7\uffff\1\3\1\uffff\1\5\5\uffff\1\3\2\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "669:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Return_1= ruleReturn | (this_Expression_2= ruleExpression otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement )";
        }
    }
    static final String dfa_13s = "\7\uffff";
    static final String dfa_14s = "\3\uffff\1\5\3\uffff";
    static final String dfa_15s = "\3\4\1\27\1\4\2\uffff";
    static final String dfa_16s = "\1\4\1\16\1\4\1\27\1\16\2\uffff";
    static final String dfa_17s = "\5\uffff\1\2\1\1";
    static final String dfa_18s = "\7\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\3\11\uffff\1\2",
            "\1\4",
            "\1\6",
            "\1\3\11\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "976:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Parameter_1= ruleParameter )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000E00080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000E00000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000E00400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000FFB180070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000FFB140070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000104002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001F8500070L});

}