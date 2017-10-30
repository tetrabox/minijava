package org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'private'", "'protected'", "'public'", "'package'", "';'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'extends'", "'('", "')'", "','", "'='", "'return'", "'if'", "'else'", "'this'", "'super'", "'null'", "'new'"
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

    	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniJava.g:55:1: ( ruleProgram EOF )
            // InternalMiniJava.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMiniJava.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMiniJava.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalMiniJava.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalMiniJava.g:70:3: ( rule__Program__Group__0 )
            // InternalMiniJava.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava.g:79:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMiniJava.g:80:1: ( ruleImport EOF )
            // InternalMiniJava.g:81:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava.g:88:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:92:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMiniJava.g:93:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMiniJava.g:93:2: ( ( rule__Import__Group__0 ) )
            // InternalMiniJava.g:94:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMiniJava.g:95:3: ( rule__Import__Group__0 )
            // InternalMiniJava.g:95:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:104:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMiniJava.g:105:1: ( ruleQualifiedName EOF )
            // InternalMiniJava.g:106:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:113:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:117:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMiniJava.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMiniJava.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMiniJava.g:119:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMiniJava.g:120:3: ( rule__QualifiedName__Group__0 )
            // InternalMiniJava.g:120:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava.g:129:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMiniJava.g:130:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava.g:131:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava.g:138:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:142:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMiniJava.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMiniJava.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMiniJava.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMiniJava.g:145:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMiniJava.g:145:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:154:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMiniJava.g:155:1: ( ruleClass EOF )
            // InternalMiniJava.g:156:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMiniJava.g:163:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:167:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMiniJava.g:168:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMiniJava.g:168:2: ( ( rule__Class__Group__0 ) )
            // InternalMiniJava.g:169:3: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalMiniJava.g:170:3: ( rule__Class__Group__0 )
            // InternalMiniJava.g:170:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:179:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMiniJava.g:180:1: ( ruleMember EOF )
            // InternalMiniJava.g:181:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:188:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:192:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalMiniJava.g:193:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalMiniJava.g:193:2: ( ( rule__Member__Alternatives ) )
            // InternalMiniJava.g:194:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:195:3: ( rule__Member__Alternatives )
            // InternalMiniJava.g:195:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:204:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMiniJava.g:205:1: ( ruleField EOF )
            // InternalMiniJava.g:206:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava.g:213:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:217:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMiniJava.g:218:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMiniJava.g:218:2: ( ( rule__Field__Group__0 ) )
            // InternalMiniJava.g:219:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalMiniJava.g:220:3: ( rule__Field__Group__0 )
            // InternalMiniJava.g:220:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:229:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMiniJava.g:230:1: ( ruleMethod EOF )
            // InternalMiniJava.g:231:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava.g:238:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:242:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMiniJava.g:243:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMiniJava.g:243:2: ( ( rule__Method__Group__0 ) )
            // InternalMiniJava.g:244:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalMiniJava.g:245:3: ( rule__Method__Group__0 )
            // InternalMiniJava.g:245:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:254:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:255:1: ( ruleParameter EOF )
            // InternalMiniJava.g:256:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:263:1: ruleParameter : ( ruleTypedDeclaration ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:267:2: ( ( ruleTypedDeclaration ) )
            // InternalMiniJava.g:268:2: ( ruleTypedDeclaration )
            {
            // InternalMiniJava.g:268:2: ( ruleTypedDeclaration )
            // InternalMiniJava.g:269:3: ruleTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypedDeclarationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypedDeclarationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava.g:279:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMiniJava.g:280:1: ( ruleBlock EOF )
            // InternalMiniJava.g:281:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMiniJava.g:288:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:292:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMiniJava.g:293:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMiniJava.g:293:2: ( ( rule__Block__Group__0 ) )
            // InternalMiniJava.g:294:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalMiniJava.g:295:3: ( rule__Block__Group__0 )
            // InternalMiniJava.g:295:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:304:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:305:1: ( ruleStatement EOF )
            // InternalMiniJava.g:306:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:313:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:317:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:318:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:318:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:319:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:320:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:320:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava.g:329:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:330:1: ( ruleVariableDeclaration EOF )
            // InternalMiniJava.g:331:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava.g:338:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:342:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:343:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:343:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMiniJava.g:344:3: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalMiniJava.g:345:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMiniJava.g:345:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava.g:354:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalMiniJava.g:355:1: ( ruleReturn EOF )
            // InternalMiniJava.g:356:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava.g:363:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:367:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalMiniJava.g:368:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalMiniJava.g:368:2: ( ( rule__Return__Group__0 ) )
            // InternalMiniJava.g:369:3: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // InternalMiniJava.g:370:3: ( rule__Return__Group__0 )
            // InternalMiniJava.g:370:4: rule__Return__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava.g:379:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:380:1: ( ruleIfStatement EOF )
            // InternalMiniJava.g:381:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava.g:388:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:392:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMiniJava.g:393:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMiniJava.g:393:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMiniJava.g:394:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:395:3: ( rule__IfStatement__Group__0 )
            // InternalMiniJava.g:395:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIfBlock"
    // InternalMiniJava.g:404:1: entryRuleIfBlock : ruleIfBlock EOF ;
    public final void entryRuleIfBlock() throws RecognitionException {
        try {
            // InternalMiniJava.g:405:1: ( ruleIfBlock EOF )
            // InternalMiniJava.g:406:1: ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // InternalMiniJava.g:413:1: ruleIfBlock : ( ( rule__IfBlock__Alternatives ) ) ;
    public final void ruleIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:417:2: ( ( ( rule__IfBlock__Alternatives ) ) )
            // InternalMiniJava.g:418:2: ( ( rule__IfBlock__Alternatives ) )
            {
            // InternalMiniJava.g:418:2: ( ( rule__IfBlock__Alternatives ) )
            // InternalMiniJava.g:419:3: ( rule__IfBlock__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfBlockAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:420:3: ( rule__IfBlock__Alternatives )
            // InternalMiniJava.g:420:4: rule__IfBlock__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IfBlock__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfBlockAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava.g:429:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalMiniJava.g:430:1: ( ruleSymbol EOF )
            // InternalMiniJava.g:431:1: ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava.g:438:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:442:2: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalMiniJava.g:443:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalMiniJava.g:443:2: ( ( rule__Symbol__Alternatives ) )
            // InternalMiniJava.g:444:3: ( rule__Symbol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:445:3: ( rule__Symbol__Alternatives )
            // InternalMiniJava.g:445:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava.g:455:1: ruleTypedDeclaration : ( ( rule__TypedDeclaration__Group__0 ) ) ;
    public final void ruleTypedDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:459:2: ( ( ( rule__TypedDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:460:2: ( ( rule__TypedDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:460:2: ( ( rule__TypedDeclaration__Group__0 ) )
            // InternalMiniJava.g:461:3: ( rule__TypedDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getGroup()); 
            }
            // InternalMiniJava.g:462:3: ( rule__TypedDeclaration__Group__0 )
            // InternalMiniJava.g:462:4: rule__TypedDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:471:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:472:1: ( ruleExpression EOF )
            // InternalMiniJava.g:473:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:480:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:484:2: ( ( ruleAssignment ) )
            // InternalMiniJava.g:485:2: ( ruleAssignment )
            {
            // InternalMiniJava.g:485:2: ( ruleAssignment )
            // InternalMiniJava.g:486:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava.g:496:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMiniJava.g:497:1: ( ruleAssignment EOF )
            // InternalMiniJava.g:498:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava.g:505:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:509:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMiniJava.g:510:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMiniJava.g:510:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMiniJava.g:511:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMiniJava.g:512:3: ( rule__Assignment__Group__0 )
            // InternalMiniJava.g:512:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava.g:521:1: entryRuleSelectionExpression : ruleSelectionExpression EOF ;
    public final void entryRuleSelectionExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:522:1: ( ruleSelectionExpression EOF )
            // InternalMiniJava.g:523:1: ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava.g:530:1: ruleSelectionExpression : ( ( rule__SelectionExpression__Group__0 ) ) ;
    public final void ruleSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:534:2: ( ( ( rule__SelectionExpression__Group__0 ) ) )
            // InternalMiniJava.g:535:2: ( ( rule__SelectionExpression__Group__0 ) )
            {
            // InternalMiniJava.g:535:2: ( ( rule__SelectionExpression__Group__0 ) )
            // InternalMiniJava.g:536:3: ( rule__SelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            }
            // InternalMiniJava.g:537:3: ( rule__SelectionExpression__Group__0 )
            // InternalMiniJava.g:537:4: rule__SelectionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:546:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:547:1: ( ruleTerminalExpression EOF )
            // InternalMiniJava.g:548:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava.g:555:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:559:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalMiniJava.g:560:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalMiniJava.g:560:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalMiniJava.g:561:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:562:3: ( rule__TerminalExpression__Alternatives )
            // InternalMiniJava.g:562:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava.g:571:1: ruleAccessLevel : ( ( rule__AccessLevel__Alternatives ) ) ;
    public final void ruleAccessLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:575:1: ( ( ( rule__AccessLevel__Alternatives ) ) )
            // InternalMiniJava.g:576:2: ( ( rule__AccessLevel__Alternatives ) )
            {
            // InternalMiniJava.g:576:2: ( ( rule__AccessLevel__Alternatives ) )
            // InternalMiniJava.g:577:3: ( rule__AccessLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessLevelAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:578:3: ( rule__AccessLevel__Alternatives )
            // InternalMiniJava.g:578:4: rule__AccessLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessLevel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessLevelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessLevel"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalMiniJava.g:586:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:590:1: ( ( ruleField ) | ( ruleMethod ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:591:2: ( ruleField )
                    {
                    // InternalMiniJava.g:591:2: ( ruleField )
                    // InternalMiniJava.g:592:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:597:2: ( ruleMethod )
                    {
                    // InternalMiniJava.g:597:2: ( ruleMethod )
                    // InternalMiniJava.g:598:3: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMiniJava.g:607:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleReturn ) | ( ( rule__Statement__Group_2__0 ) ) | ( ruleIfStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:611:1: ( ( ruleVariableDeclaration ) | ( ruleReturn ) | ( ( rule__Statement__Group_2__0 ) ) | ( ruleIfStatement ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:612:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:612:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:613:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:618:2: ( ruleReturn )
                    {
                    // InternalMiniJava.g:618:2: ( ruleReturn )
                    // InternalMiniJava.g:619:3: ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getReturnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:624:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:624:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalMiniJava.g:625:3: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:626:3: ( rule__Statement__Group_2__0 )
                    // InternalMiniJava.g:626:4: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:630:2: ( ruleIfStatement )
                    {
                    // InternalMiniJava.g:630:2: ( ruleIfStatement )
                    // InternalMiniJava.g:631:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__IfBlock__Alternatives"
    // InternalMiniJava.g:640:1: rule__IfBlock__Alternatives : ( ( ( rule__IfBlock__StatementsAssignment_0 ) ) | ( ruleBlock ) );
    public final void rule__IfBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:644:1: ( ( ( rule__IfBlock__StatementsAssignment_0 ) ) | ( ruleBlock ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=11 && LA3_0<=12)||LA3_0==25||(LA3_0>=29 && LA3_0<=30)||(LA3_0>=32 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:645:2: ( ( rule__IfBlock__StatementsAssignment_0 ) )
                    {
                    // InternalMiniJava.g:645:2: ( ( rule__IfBlock__StatementsAssignment_0 ) )
                    // InternalMiniJava.g:646:3: ( rule__IfBlock__StatementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfBlockAccess().getStatementsAssignment_0()); 
                    }
                    // InternalMiniJava.g:647:3: ( rule__IfBlock__StatementsAssignment_0 )
                    // InternalMiniJava.g:647:4: rule__IfBlock__StatementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfBlock__StatementsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfBlockAccess().getStatementsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:651:2: ( ruleBlock )
                    {
                    // InternalMiniJava.g:651:2: ( ruleBlock )
                    // InternalMiniJava.g:652:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfBlockAccess().getBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfBlockAccess().getBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalMiniJava.g:661:1: rule__Symbol__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleParameter ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:665:1: ( ( ruleVariableDeclaration ) | ( ruleParameter ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:666:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:666:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:667:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:672:2: ( ruleParameter )
                    {
                    // InternalMiniJava.g:672:2: ( ruleParameter )
                    // InternalMiniJava.g:673:3: ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getParameterParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalMiniJava.g:682:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:686:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 11:
            case 12:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            case RULE_ID:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            case 25:
                {
                alt5=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:687:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:687:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalMiniJava.g:688:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:689:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalMiniJava.g:689:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:693:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:693:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalMiniJava.g:694:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:695:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalMiniJava.g:695:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:699:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:699:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalMiniJava.g:700:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:701:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalMiniJava.g:701:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:705:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:705:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalMiniJava.g:706:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalMiniJava.g:707:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalMiniJava.g:707:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:711:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:711:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalMiniJava.g:712:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalMiniJava.g:713:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalMiniJava.g:713:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:717:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:717:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalMiniJava.g:718:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalMiniJava.g:719:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalMiniJava.g:719:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:723:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalMiniJava.g:723:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalMiniJava.g:724:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }
                    // InternalMiniJava.g:725:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalMiniJava.g:725:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:729:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    {
                    // InternalMiniJava.g:729:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    // InternalMiniJava.g:730:3: ( rule__TerminalExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }
                    // InternalMiniJava.g:731:3: ( rule__TerminalExpression__Group_7__0 )
                    // InternalMiniJava.g:731:4: rule__TerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:735:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    {
                    // InternalMiniJava.g:735:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    // InternalMiniJava.g:736:3: ( rule__TerminalExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }
                    // InternalMiniJava.g:737:3: ( rule__TerminalExpression__Group_8__0 )
                    // InternalMiniJava.g:737:4: rule__TerminalExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__ValueAlternatives_2_1_0"
    // InternalMiniJava.g:745:1: rule__TerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__TerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:749:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:750:2: ( 'true' )
                    {
                    // InternalMiniJava.g:750:2: ( 'true' )
                    // InternalMiniJava.g:751:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:756:2: ( 'false' )
                    {
                    // InternalMiniJava.g:756:2: ( 'false' )
                    // InternalMiniJava.g:757:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__AccessLevel__Alternatives"
    // InternalMiniJava.g:766:1: rule__AccessLevel__Alternatives : ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) );
    public final void rule__AccessLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:770:1: ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:771:2: ( ( 'private' ) )
                    {
                    // InternalMiniJava.g:771:2: ( ( 'private' ) )
                    // InternalMiniJava.g:772:3: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }
                    // InternalMiniJava.g:773:3: ( 'private' )
                    // InternalMiniJava.g:773:4: 'private'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:777:2: ( ( 'protected' ) )
                    {
                    // InternalMiniJava.g:777:2: ( ( 'protected' ) )
                    // InternalMiniJava.g:778:3: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }
                    // InternalMiniJava.g:779:3: ( 'protected' )
                    // InternalMiniJava.g:779:4: 'protected'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:783:2: ( ( 'public' ) )
                    {
                    // InternalMiniJava.g:783:2: ( ( 'public' ) )
                    // InternalMiniJava.g:784:3: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                    }
                    // InternalMiniJava.g:785:3: ( 'public' )
                    // InternalMiniJava.g:785:4: 'public'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessLevel__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:793:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:797:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:798:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMiniJava.g:805:1: rule__Program__Group__0__Impl : ( ( rule__Program__Group_0__0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:809:1: ( ( ( rule__Program__Group_0__0 )? ) )
            // InternalMiniJava.g:810:1: ( ( rule__Program__Group_0__0 )? )
            {
            // InternalMiniJava.g:810:1: ( ( rule__Program__Group_0__0 )? )
            // InternalMiniJava.g:811:2: ( rule__Program__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_0()); 
            }
            // InternalMiniJava.g:812:2: ( rule__Program__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:812:3: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMiniJava.g:820:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:824:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMiniJava.g:825:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMiniJava.g:832:1: rule__Program__Group__1__Impl : ( ( rule__Program__ImportsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:836:1: ( ( ( rule__Program__ImportsAssignment_1 )* ) )
            // InternalMiniJava.g:837:1: ( ( rule__Program__ImportsAssignment_1 )* )
            {
            // InternalMiniJava.g:837:1: ( ( rule__Program__ImportsAssignment_1 )* )
            // InternalMiniJava.g:838:2: ( rule__Program__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }
            // InternalMiniJava.g:839:2: ( rule__Program__ImportsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMiniJava.g:839:3: rule__Program__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMiniJava.g:847:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:851:1: ( rule__Program__Group__2__Impl )
            // InternalMiniJava.g:852:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMiniJava.g:858:1: rule__Program__Group__2__Impl : ( ( rule__Program__ClassesAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:862:1: ( ( ( rule__Program__ClassesAssignment_2 )* ) )
            // InternalMiniJava.g:863:1: ( ( rule__Program__ClassesAssignment_2 )* )
            {
            // InternalMiniJava.g:863:1: ( ( rule__Program__ClassesAssignment_2 )* )
            // InternalMiniJava.g:864:2: ( rule__Program__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }
            // InternalMiniJava.g:865:2: ( rule__Program__ClassesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:865:3: rule__Program__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group_0__0"
    // InternalMiniJava.g:874:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:878:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // InternalMiniJava.g:879:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // InternalMiniJava.g:886:1: rule__Program__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:890:1: ( ( 'package' ) )
            // InternalMiniJava.g:891:1: ( 'package' )
            {
            // InternalMiniJava.g:891:1: ( 'package' )
            // InternalMiniJava.g:892:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // InternalMiniJava.g:901:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl rule__Program__Group_0__2 ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:905:1: ( rule__Program__Group_0__1__Impl rule__Program__Group_0__2 )
            // InternalMiniJava.g:906:2: rule__Program__Group_0__1__Impl rule__Program__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // InternalMiniJava.g:913:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__NameAssignment_0_1 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:917:1: ( ( ( rule__Program__NameAssignment_0_1 ) ) )
            // InternalMiniJava.g:918:1: ( ( rule__Program__NameAssignment_0_1 ) )
            {
            // InternalMiniJava.g:918:1: ( ( rule__Program__NameAssignment_0_1 ) )
            // InternalMiniJava.g:919:2: ( rule__Program__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }
            // InternalMiniJava.g:920:2: ( rule__Program__NameAssignment_0_1 )
            // InternalMiniJava.g:920:3: rule__Program__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0__2"
    // InternalMiniJava.g:928:1: rule__Program__Group_0__2 : rule__Program__Group_0__2__Impl ;
    public final void rule__Program__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:932:1: ( rule__Program__Group_0__2__Impl )
            // InternalMiniJava.g:933:2: rule__Program__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2"


    // $ANTLR start "rule__Program__Group_0__2__Impl"
    // InternalMiniJava.g:939:1: rule__Program__Group_0__2__Impl : ( ';' ) ;
    public final void rule__Program__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:943:1: ( ( ';' ) )
            // InternalMiniJava.g:944:1: ( ';' )
            {
            // InternalMiniJava.g:944:1: ( ';' )
            // InternalMiniJava.g:945:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMiniJava.g:955:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:959:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMiniJava.g:960:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMiniJava.g:967:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:971:1: ( ( 'import' ) )
            // InternalMiniJava.g:972:1: ( 'import' )
            {
            // InternalMiniJava.g:972:1: ( 'import' )
            // InternalMiniJava.g:973:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMiniJava.g:982:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:986:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMiniJava.g:987:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMiniJava.g:994:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:998:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMiniJava.g:999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMiniJava.g:999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMiniJava.g:1000:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMiniJava.g:1001:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMiniJava.g:1001:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMiniJava.g:1009:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1013:1: ( rule__Import__Group__2__Impl )
            // InternalMiniJava.g:1014:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMiniJava.g:1020:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1024:1: ( ( ';' ) )
            // InternalMiniJava.g:1025:1: ( ';' )
            {
            // InternalMiniJava.g:1025:1: ( ';' )
            // InternalMiniJava.g:1026:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMiniJava.g:1036:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1040:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMiniJava.g:1041:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMiniJava.g:1048:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1052:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1053:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1053:1: ( RULE_ID )
            // InternalMiniJava.g:1054:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMiniJava.g:1063:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1067:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMiniJava.g:1068:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMiniJava.g:1074:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1078:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMiniJava.g:1079:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMiniJava.g:1079:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMiniJava.g:1080:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:1081:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava.g:1081:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMiniJava.g:1090:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1094:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMiniJava.g:1095:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMiniJava.g:1102:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1106:1: ( ( '.' ) )
            // InternalMiniJava.g:1107:1: ( '.' )
            {
            // InternalMiniJava.g:1107:1: ( '.' )
            // InternalMiniJava.g:1108:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMiniJava.g:1117:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1121:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMiniJava.g:1122:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMiniJava.g:1128:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1132:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1133:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1133:1: ( RULE_ID )
            // InternalMiniJava.g:1134:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMiniJava.g:1144:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1148:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMiniJava.g:1149:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMiniJava.g:1156:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1160:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:1161:1: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:1161:1: ( ruleQualifiedName )
            // InternalMiniJava.g:1162:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMiniJava.g:1171:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1175:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMiniJava.g:1176:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMiniJava.g:1182:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1186:1: ( ( ( '.*' )? ) )
            // InternalMiniJava.g:1187:1: ( ( '.*' )? )
            {
            // InternalMiniJava.g:1187:1: ( ( '.*' )? )
            // InternalMiniJava.g:1188:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMiniJava.g:1189:2: ( '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1189:3: '.*'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMiniJava.g:1198:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1202:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMiniJava.g:1203:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalMiniJava.g:1210:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1214:1: ( ( 'class' ) )
            // InternalMiniJava.g:1215:1: ( 'class' )
            {
            // InternalMiniJava.g:1215:1: ( 'class' )
            // InternalMiniJava.g:1216:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalMiniJava.g:1225:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1229:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMiniJava.g:1230:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalMiniJava.g:1237:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1241:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1242:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1242:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalMiniJava.g:1243:2: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1244:2: ( rule__Class__NameAssignment_1 )
            // InternalMiniJava.g:1244:3: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalMiniJava.g:1252:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1256:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMiniJava.g:1257:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalMiniJava.g:1264:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1268:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalMiniJava.g:1269:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalMiniJava.g:1269:1: ( ( rule__Class__Group_2__0 )? )
            // InternalMiniJava.g:1270:2: ( rule__Class__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_2()); 
            }
            // InternalMiniJava.g:1271:2: ( rule__Class__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:1271:3: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalMiniJava.g:1279:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1283:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMiniJava.g:1284:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalMiniJava.g:1291:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1295:1: ( ( '{' ) )
            // InternalMiniJava.g:1296:1: ( '{' )
            {
            // InternalMiniJava.g:1296:1: ( '{' )
            // InternalMiniJava.g:1297:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalMiniJava.g:1306:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1310:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMiniJava.g:1311:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalMiniJava.g:1318:1: rule__Class__Group__4__Impl : ( ( rule__Class__MembersAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1322:1: ( ( ( rule__Class__MembersAssignment_4 )* ) )
            // InternalMiniJava.g:1323:1: ( ( rule__Class__MembersAssignment_4 )* )
            {
            // InternalMiniJava.g:1323:1: ( ( rule__Class__MembersAssignment_4 )* )
            // InternalMiniJava.g:1324:2: ( rule__Class__MembersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMembersAssignment_4()); 
            }
            // InternalMiniJava.g:1325:2: ( rule__Class__MembersAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=13 && LA14_0<=15)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:1325:3: rule__Class__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__MembersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMembersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalMiniJava.g:1333:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1337:1: ( rule__Class__Group__5__Impl )
            // InternalMiniJava.g:1338:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalMiniJava.g:1344:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1348:1: ( ( '}' ) )
            // InternalMiniJava.g:1349:1: ( '}' )
            {
            // InternalMiniJava.g:1349:1: ( '}' )
            // InternalMiniJava.g:1350:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // InternalMiniJava.g:1360:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1364:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalMiniJava.g:1365:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // InternalMiniJava.g:1372:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1376:1: ( ( 'extends' ) )
            // InternalMiniJava.g:1377:1: ( 'extends' )
            {
            // InternalMiniJava.g:1377:1: ( 'extends' )
            // InternalMiniJava.g:1378:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // InternalMiniJava.g:1387:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1391:1: ( rule__Class__Group_2__1__Impl )
            // InternalMiniJava.g:1392:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // InternalMiniJava.g:1398:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperclassAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1402:1: ( ( ( rule__Class__SuperclassAssignment_2_1 ) ) )
            // InternalMiniJava.g:1403:1: ( ( rule__Class__SuperclassAssignment_2_1 ) )
            {
            // InternalMiniJava.g:1403:1: ( ( rule__Class__SuperclassAssignment_2_1 ) )
            // InternalMiniJava.g:1404:2: ( rule__Class__SuperclassAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperclassAssignment_2_1()); 
            }
            // InternalMiniJava.g:1405:2: ( rule__Class__SuperclassAssignment_2_1 )
            // InternalMiniJava.g:1405:3: rule__Class__SuperclassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperclassAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperclassAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMiniJava.g:1414:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1418:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMiniJava.g:1419:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMiniJava.g:1426:1: rule__Field__Group__0__Impl : ( ( rule__Field__AccessAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1430:1: ( ( ( rule__Field__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:1431:1: ( ( rule__Field__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:1431:1: ( ( rule__Field__AccessAssignment_0 )? )
            // InternalMiniJava.g:1432:2: ( rule__Field__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:1433:2: ( rule__Field__AccessAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=13 && LA15_0<=15)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:1433:3: rule__Field__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMiniJava.g:1441:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1445:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMiniJava.g:1446:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMiniJava.g:1453:1: rule__Field__Group__1__Impl : ( ruleTypedDeclaration ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1457:1: ( ( ruleTypedDeclaration ) )
            // InternalMiniJava.g:1458:1: ( ruleTypedDeclaration )
            {
            // InternalMiniJava.g:1458:1: ( ruleTypedDeclaration )
            // InternalMiniJava.g:1459:2: ruleTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypedDeclarationParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypedDeclarationParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMiniJava.g:1468:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1472:1: ( rule__Field__Group__2__Impl )
            // InternalMiniJava.g:1473:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMiniJava.g:1479:1: rule__Field__Group__2__Impl : ( ';' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1483:1: ( ( ';' ) )
            // InternalMiniJava.g:1484:1: ( ';' )
            {
            // InternalMiniJava.g:1484:1: ( ';' )
            // InternalMiniJava.g:1485:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMiniJava.g:1495:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1499:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMiniJava.g:1500:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMiniJava.g:1507:1: rule__Method__Group__0__Impl : ( ( rule__Method__AccessAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1511:1: ( ( ( rule__Method__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:1512:1: ( ( rule__Method__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:1512:1: ( ( rule__Method__AccessAssignment_0 )? )
            // InternalMiniJava.g:1513:2: ( rule__Method__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:1514:2: ( rule__Method__AccessAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=15)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:1514:3: rule__Method__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMiniJava.g:1522:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1526:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMiniJava.g:1527:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMiniJava.g:1534:1: rule__Method__Group__1__Impl : ( ruleTypedDeclaration ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1538:1: ( ( ruleTypedDeclaration ) )
            // InternalMiniJava.g:1539:1: ( ruleTypedDeclaration )
            {
            // InternalMiniJava.g:1539:1: ( ruleTypedDeclaration )
            // InternalMiniJava.g:1540:2: ruleTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypedDeclarationParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypedDeclarationParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMiniJava.g:1549:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1553:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMiniJava.g:1554:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMiniJava.g:1561:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1565:1: ( ( '(' ) )
            // InternalMiniJava.g:1566:1: ( '(' )
            {
            // InternalMiniJava.g:1566:1: ( '(' )
            // InternalMiniJava.g:1567:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMiniJava.g:1576:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1580:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMiniJava.g:1581:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMiniJava.g:1588:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1592:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalMiniJava.g:1593:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalMiniJava.g:1593:1: ( ( rule__Method__Group_3__0 )? )
            // InternalMiniJava.g:1594:2: ( rule__Method__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:1595:2: ( rule__Method__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1595:3: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMiniJava.g:1603:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1607:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMiniJava.g:1608:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMiniJava.g:1615:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1619:1: ( ( ')' ) )
            // InternalMiniJava.g:1620:1: ( ')' )
            {
            // InternalMiniJava.g:1620:1: ( ')' )
            // InternalMiniJava.g:1621:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMiniJava.g:1630:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1634:1: ( rule__Method__Group__5__Impl )
            // InternalMiniJava.g:1635:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMiniJava.g:1641:1: rule__Method__Group__5__Impl : ( ( rule__Method__BodyAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1645:1: ( ( ( rule__Method__BodyAssignment_5 ) ) )
            // InternalMiniJava.g:1646:1: ( ( rule__Method__BodyAssignment_5 ) )
            {
            // InternalMiniJava.g:1646:1: ( ( rule__Method__BodyAssignment_5 ) )
            // InternalMiniJava.g:1647:2: ( rule__Method__BodyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyAssignment_5()); 
            }
            // InternalMiniJava.g:1648:2: ( rule__Method__BodyAssignment_5 )
            // InternalMiniJava.g:1648:3: rule__Method__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Method__BodyAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalMiniJava.g:1657:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1661:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalMiniJava.g:1662:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalMiniJava.g:1669:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParamsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1673:1: ( ( ( rule__Method__ParamsAssignment_3_0 ) ) )
            // InternalMiniJava.g:1674:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            {
            // InternalMiniJava.g:1674:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            // InternalMiniJava.g:1675:2: ( rule__Method__ParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }
            // InternalMiniJava.g:1676:2: ( rule__Method__ParamsAssignment_3_0 )
            // InternalMiniJava.g:1676:3: rule__Method__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalMiniJava.g:1684:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1688:1: ( rule__Method__Group_3__1__Impl )
            // InternalMiniJava.g:1689:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalMiniJava.g:1695:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1699:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalMiniJava.g:1700:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalMiniJava.g:1700:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalMiniJava.g:1701:2: ( rule__Method__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }
            // InternalMiniJava.g:1702:2: ( rule__Method__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiniJava.g:1702:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // InternalMiniJava.g:1711:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1715:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalMiniJava.g:1716:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // InternalMiniJava.g:1723:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1727:1: ( ( ',' ) )
            // InternalMiniJava.g:1728:1: ( ',' )
            {
            // InternalMiniJava.g:1728:1: ( ',' )
            // InternalMiniJava.g:1729:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // InternalMiniJava.g:1738:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1742:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalMiniJava.g:1743:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // InternalMiniJava.g:1749:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1753:1: ( ( ( rule__Method__ParamsAssignment_3_1_1 ) ) )
            // InternalMiniJava.g:1754:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            {
            // InternalMiniJava.g:1754:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            // InternalMiniJava.g:1755:2: ( rule__Method__ParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }
            // InternalMiniJava.g:1756:2: ( rule__Method__ParamsAssignment_3_1_1 )
            // InternalMiniJava.g:1756:3: rule__Method__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMiniJava.g:1765:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1769:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMiniJava.g:1770:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMiniJava.g:1777:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1781:1: ( ( () ) )
            // InternalMiniJava.g:1782:1: ( () )
            {
            // InternalMiniJava.g:1782:1: ( () )
            // InternalMiniJava.g:1783:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalMiniJava.g:1784:2: ()
            // InternalMiniJava.g:1784:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMiniJava.g:1792:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1796:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMiniJava.g:1797:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMiniJava.g:1804:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1808:1: ( ( '{' ) )
            // InternalMiniJava.g:1809:1: ( '{' )
            {
            // InternalMiniJava.g:1809:1: ( '{' )
            // InternalMiniJava.g:1810:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMiniJava.g:1819:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1823:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMiniJava.g:1824:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMiniJava.g:1831:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1835:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // InternalMiniJava.g:1836:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // InternalMiniJava.g:1836:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // InternalMiniJava.g:1837:2: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // InternalMiniJava.g:1838:2: ( rule__Block__StatementsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||(LA19_0>=11 && LA19_0<=12)||LA19_0==25||(LA19_0>=29 && LA19_0<=30)||(LA19_0>=32 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:1838:3: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Block__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalMiniJava.g:1846:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1850:1: ( rule__Block__Group__3__Impl )
            // InternalMiniJava.g:1851:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMiniJava.g:1857:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1861:1: ( ( '}' ) )
            // InternalMiniJava.g:1862:1: ( '}' )
            {
            // InternalMiniJava.g:1862:1: ( '}' )
            // InternalMiniJava.g:1863:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // InternalMiniJava.g:1873:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1877:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalMiniJava.g:1878:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // InternalMiniJava.g:1885:1: rule__Statement__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1889:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:1890:1: ( ruleExpression )
            {
            // InternalMiniJava.g:1890:1: ( ruleExpression )
            // InternalMiniJava.g:1891:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // InternalMiniJava.g:1900:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1904:1: ( rule__Statement__Group_2__1__Impl )
            // InternalMiniJava.g:1905:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // InternalMiniJava.g:1911:1: rule__Statement__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1915:1: ( ( ';' ) )
            // InternalMiniJava.g:1916:1: ( ';' )
            {
            // InternalMiniJava.g:1916:1: ( ';' )
            // InternalMiniJava.g:1917:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMiniJava.g:1927:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1931:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMiniJava.g:1932:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalMiniJava.g:1939:1: rule__VariableDeclaration__Group__0__Impl : ( ruleTypedDeclaration ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1943:1: ( ( ruleTypedDeclaration ) )
            // InternalMiniJava.g:1944:1: ( ruleTypedDeclaration )
            {
            // InternalMiniJava.g:1944:1: ( ruleTypedDeclaration )
            // InternalMiniJava.g:1945:2: ruleTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypedDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypedDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalMiniJava.g:1954:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1958:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalMiniJava.g:1959:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalMiniJava.g:1966:1: rule__VariableDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1970:1: ( ( '=' ) )
            // InternalMiniJava.g:1971:1: ( '=' )
            {
            // InternalMiniJava.g:1971:1: ( '=' )
            // InternalMiniJava.g:1972:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalMiniJava.g:1981:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1985:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalMiniJava.g:1986:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalMiniJava.g:1993:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1997:1: ( ( ( rule__VariableDeclaration__ExpressionAssignment_2 ) ) )
            // InternalMiniJava.g:1998:1: ( ( rule__VariableDeclaration__ExpressionAssignment_2 ) )
            {
            // InternalMiniJava.g:1998:1: ( ( rule__VariableDeclaration__ExpressionAssignment_2 ) )
            // InternalMiniJava.g:1999:2: ( rule__VariableDeclaration__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_2()); 
            }
            // InternalMiniJava.g:2000:2: ( rule__VariableDeclaration__ExpressionAssignment_2 )
            // InternalMiniJava.g:2000:3: rule__VariableDeclaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalMiniJava.g:2008:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2012:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalMiniJava.g:2013:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalMiniJava.g:2019:1: rule__VariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2023:1: ( ( ';' ) )
            // InternalMiniJava.g:2024:1: ( ';' )
            {
            // InternalMiniJava.g:2024:1: ( ';' )
            // InternalMiniJava.g:2025:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // InternalMiniJava.g:2035:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2039:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalMiniJava.g:2040:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Return__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // InternalMiniJava.g:2047:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2051:1: ( ( 'return' ) )
            // InternalMiniJava.g:2052:1: ( 'return' )
            {
            // InternalMiniJava.g:2052:1: ( 'return' )
            // InternalMiniJava.g:2053:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // InternalMiniJava.g:2062:1: rule__Return__Group__1 : rule__Return__Group__1__Impl rule__Return__Group__2 ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2066:1: ( rule__Return__Group__1__Impl rule__Return__Group__2 )
            // InternalMiniJava.g:2067:2: rule__Return__Group__1__Impl rule__Return__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Return__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Return__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // InternalMiniJava.g:2074:1: rule__Return__Group__1__Impl : ( ( rule__Return__ExpressionAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2078:1: ( ( ( rule__Return__ExpressionAssignment_1 ) ) )
            // InternalMiniJava.g:2079:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            {
            // InternalMiniJava.g:2079:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            // InternalMiniJava.g:2080:2: ( rule__Return__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
            }
            // InternalMiniJava.g:2081:2: ( rule__Return__ExpressionAssignment_1 )
            // InternalMiniJava.g:2081:3: rule__Return__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Return__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__Return__Group__2"
    // InternalMiniJava.g:2089:1: rule__Return__Group__2 : rule__Return__Group__2__Impl ;
    public final void rule__Return__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2093:1: ( rule__Return__Group__2__Impl )
            // InternalMiniJava.g:2094:2: rule__Return__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__2"


    // $ANTLR start "rule__Return__Group__2__Impl"
    // InternalMiniJava.g:2100:1: rule__Return__Group__2__Impl : ( ';' ) ;
    public final void rule__Return__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2104:1: ( ( ';' ) )
            // InternalMiniJava.g:2105:1: ( ';' )
            {
            // InternalMiniJava.g:2105:1: ( ';' )
            // InternalMiniJava.g:2106:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMiniJava.g:2116:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2120:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMiniJava.g:2121:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMiniJava.g:2128:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2132:1: ( ( 'if' ) )
            // InternalMiniJava.g:2133:1: ( 'if' )
            {
            // InternalMiniJava.g:2133:1: ( 'if' )
            // InternalMiniJava.g:2134:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMiniJava.g:2143:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2147:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMiniJava.g:2148:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMiniJava.g:2155:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2159:1: ( ( '(' ) )
            // InternalMiniJava.g:2160:1: ( '(' )
            {
            // InternalMiniJava.g:2160:1: ( '(' )
            // InternalMiniJava.g:2161:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMiniJava.g:2170:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2174:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMiniJava.g:2175:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMiniJava.g:2182:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2186:1: ( ( ( rule__IfStatement__ExpressionAssignment_2 ) ) )
            // InternalMiniJava.g:2187:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            {
            // InternalMiniJava.g:2187:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            // InternalMiniJava.g:2188:2: ( rule__IfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
            }
            // InternalMiniJava.g:2189:2: ( rule__IfStatement__ExpressionAssignment_2 )
            // InternalMiniJava.g:2189:3: rule__IfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMiniJava.g:2197:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2201:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMiniJava.g:2202:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMiniJava.g:2209:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2213:1: ( ( ')' ) )
            // InternalMiniJava.g:2214:1: ( ')' )
            {
            // InternalMiniJava.g:2214:1: ( ')' )
            // InternalMiniJava.g:2215:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMiniJava.g:2224:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2228:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMiniJava.g:2229:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMiniJava.g:2236:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2240:1: ( ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) )
            // InternalMiniJava.g:2241:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            {
            // InternalMiniJava.g:2241:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            // InternalMiniJava.g:2242:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // InternalMiniJava.g:2243:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            // InternalMiniJava.g:2243:3: rule__IfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMiniJava.g:2251:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2255:1: ( rule__IfStatement__Group__5__Impl )
            // InternalMiniJava.g:2256:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMiniJava.g:2262:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2266:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalMiniJava.g:2267:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalMiniJava.g:2267:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalMiniJava.g:2268:2: ( rule__IfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }
            // InternalMiniJava.g:2269:2: ( rule__IfStatement__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred30_InternalMiniJava()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:2269:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalMiniJava.g:2278:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2282:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalMiniJava.g:2283:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalMiniJava.g:2290:1: rule__IfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2294:1: ( ( ( 'else' ) ) )
            // InternalMiniJava.g:2295:1: ( ( 'else' ) )
            {
            // InternalMiniJava.g:2295:1: ( ( 'else' ) )
            // InternalMiniJava.g:2296:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }
            // InternalMiniJava.g:2297:2: ( 'else' )
            // InternalMiniJava.g:2297:3: 'else'
            {
            match(input,31,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalMiniJava.g:2305:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2309:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalMiniJava.g:2310:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalMiniJava.g:2316:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2320:1: ( ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) )
            // InternalMiniJava.g:2321:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            {
            // InternalMiniJava.g:2321:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            // InternalMiniJava.g:2322:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // InternalMiniJava.g:2323:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            // InternalMiniJava.g:2323:3: rule__IfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__TypedDeclaration__Group__0"
    // InternalMiniJava.g:2332:1: rule__TypedDeclaration__Group__0 : rule__TypedDeclaration__Group__0__Impl rule__TypedDeclaration__Group__1 ;
    public final void rule__TypedDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2336:1: ( rule__TypedDeclaration__Group__0__Impl rule__TypedDeclaration__Group__1 )
            // InternalMiniJava.g:2337:2: rule__TypedDeclaration__Group__0__Impl rule__TypedDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TypedDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__Group__0"


    // $ANTLR start "rule__TypedDeclaration__Group__0__Impl"
    // InternalMiniJava.g:2344:1: rule__TypedDeclaration__Group__0__Impl : ( ( rule__TypedDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__TypedDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2348:1: ( ( ( rule__TypedDeclaration__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:2349:1: ( ( rule__TypedDeclaration__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:2349:1: ( ( rule__TypedDeclaration__TypeAssignment_0 ) )
            // InternalMiniJava.g:2350:2: ( rule__TypedDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalMiniJava.g:2351:2: ( rule__TypedDeclaration__TypeAssignment_0 )
            // InternalMiniJava.g:2351:3: rule__TypedDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypedDeclaration__Group__1"
    // InternalMiniJava.g:2359:1: rule__TypedDeclaration__Group__1 : rule__TypedDeclaration__Group__1__Impl ;
    public final void rule__TypedDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2363:1: ( rule__TypedDeclaration__Group__1__Impl )
            // InternalMiniJava.g:2364:2: rule__TypedDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__Group__1"


    // $ANTLR start "rule__TypedDeclaration__Group__1__Impl"
    // InternalMiniJava.g:2370:1: rule__TypedDeclaration__Group__1__Impl : ( ( rule__TypedDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TypedDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2374:1: ( ( ( rule__TypedDeclaration__NameAssignment_1 ) ) )
            // InternalMiniJava.g:2375:1: ( ( rule__TypedDeclaration__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:2375:1: ( ( rule__TypedDeclaration__NameAssignment_1 ) )
            // InternalMiniJava.g:2376:2: ( rule__TypedDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:2377:2: ( rule__TypedDeclaration__NameAssignment_1 )
            // InternalMiniJava.g:2377:3: rule__TypedDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMiniJava.g:2386:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2390:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMiniJava.g:2391:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMiniJava.g:2398:1: rule__Assignment__Group__0__Impl : ( ruleSelectionExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2402:1: ( ( ruleSelectionExpression ) )
            // InternalMiniJava.g:2403:1: ( ruleSelectionExpression )
            {
            // InternalMiniJava.g:2403:1: ( ruleSelectionExpression )
            // InternalMiniJava.g:2404:2: ruleSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getSelectionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMiniJava.g:2413:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2417:1: ( rule__Assignment__Group__1__Impl )
            // InternalMiniJava.g:2418:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMiniJava.g:2424:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )? ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2428:1: ( ( ( rule__Assignment__Group_1__0 )? ) )
            // InternalMiniJava.g:2429:1: ( ( rule__Assignment__Group_1__0 )? )
            {
            // InternalMiniJava.g:2429:1: ( ( rule__Assignment__Group_1__0 )? )
            // InternalMiniJava.g:2430:2: ( rule__Assignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:2431:2: ( rule__Assignment__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMiniJava.g:2431:3: rule__Assignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // InternalMiniJava.g:2440:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2444:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalMiniJava.g:2445:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // InternalMiniJava.g:2452:1: rule__Assignment__Group_1__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2456:1: ( ( () ) )
            // InternalMiniJava.g:2457:1: ( () )
            {
            // InternalMiniJava.g:2457:1: ( () )
            // InternalMiniJava.g:2458:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0()); 
            }
            // InternalMiniJava.g:2459:2: ()
            // InternalMiniJava.g:2459:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // InternalMiniJava.g:2467:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2471:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // InternalMiniJava.g:2472:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // InternalMiniJava.g:2479:1: rule__Assignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2483:1: ( ( '=' ) )
            // InternalMiniJava.g:2484:1: ( '=' )
            {
            // InternalMiniJava.g:2484:1: ( '=' )
            // InternalMiniJava.g:2485:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__2"
    // InternalMiniJava.g:2494:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2498:1: ( rule__Assignment__Group_1__2__Impl )
            // InternalMiniJava.g:2499:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2"


    // $ANTLR start "rule__Assignment__Group_1__2__Impl"
    // InternalMiniJava.g:2505:1: rule__Assignment__Group_1__2__Impl : ( ( rule__Assignment__RightAssignment_1_2 ) ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2509:1: ( ( ( rule__Assignment__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:2510:1: ( ( rule__Assignment__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:2510:1: ( ( rule__Assignment__RightAssignment_1_2 ) )
            // InternalMiniJava.g:2511:2: ( rule__Assignment__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:2512:2: ( rule__Assignment__RightAssignment_1_2 )
            // InternalMiniJava.g:2512:3: rule__Assignment__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__0"
    // InternalMiniJava.g:2521:1: rule__SelectionExpression__Group__0 : rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 ;
    public final void rule__SelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2525:1: ( rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 )
            // InternalMiniJava.g:2526:2: rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0"


    // $ANTLR start "rule__SelectionExpression__Group__0__Impl"
    // InternalMiniJava.g:2533:1: rule__SelectionExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__SelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2537:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:2538:1: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:2538:1: ( ruleTerminalExpression )
            // InternalMiniJava.g:2539:2: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__1"
    // InternalMiniJava.g:2548:1: rule__SelectionExpression__Group__1 : rule__SelectionExpression__Group__1__Impl ;
    public final void rule__SelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2552:1: ( rule__SelectionExpression__Group__1__Impl )
            // InternalMiniJava.g:2553:2: rule__SelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1"


    // $ANTLR start "rule__SelectionExpression__Group__1__Impl"
    // InternalMiniJava.g:2559:1: rule__SelectionExpression__Group__1__Impl : ( ( rule__SelectionExpression__Group_1__0 )* ) ;
    public final void rule__SelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2563:1: ( ( ( rule__SelectionExpression__Group_1__0 )* ) )
            // InternalMiniJava.g:2564:1: ( ( rule__SelectionExpression__Group_1__0 )* )
            {
            // InternalMiniJava.g:2564:1: ( ( rule__SelectionExpression__Group_1__0 )* )
            // InternalMiniJava.g:2565:2: ( rule__SelectionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:2566:2: ( rule__SelectionExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMiniJava.g:2566:3: rule__SelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SelectionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__0"
    // InternalMiniJava.g:2575:1: rule__SelectionExpression__Group_1__0 : rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1 ;
    public final void rule__SelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2579:1: ( rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1 )
            // InternalMiniJava.g:2580:2: rule__SelectionExpression__Group_1__0__Impl rule__SelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1__0__Impl"
    // InternalMiniJava.g:2587:1: rule__SelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2591:1: ( ( () ) )
            // InternalMiniJava.g:2592:1: ( () )
            {
            // InternalMiniJava.g:2592:1: ( () )
            // InternalMiniJava.g:2593:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0()); 
            }
            // InternalMiniJava.g:2594:2: ()
            // InternalMiniJava.g:2594:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__1"
    // InternalMiniJava.g:2602:1: rule__SelectionExpression__Group_1__1 : rule__SelectionExpression__Group_1__1__Impl rule__SelectionExpression__Group_1__2 ;
    public final void rule__SelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2606:1: ( rule__SelectionExpression__Group_1__1__Impl rule__SelectionExpression__Group_1__2 )
            // InternalMiniJava.g:2607:2: rule__SelectionExpression__Group_1__1__Impl rule__SelectionExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1__1__Impl"
    // InternalMiniJava.g:2614:1: rule__SelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__SelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2618:1: ( ( '.' ) )
            // InternalMiniJava.g:2619:1: ( '.' )
            {
            // InternalMiniJava.g:2619:1: ( '.' )
            // InternalMiniJava.g:2620:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__2"
    // InternalMiniJava.g:2629:1: rule__SelectionExpression__Group_1__2 : rule__SelectionExpression__Group_1__2__Impl rule__SelectionExpression__Group_1__3 ;
    public final void rule__SelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2633:1: ( rule__SelectionExpression__Group_1__2__Impl rule__SelectionExpression__Group_1__3 )
            // InternalMiniJava.g:2634:2: rule__SelectionExpression__Group_1__2__Impl rule__SelectionExpression__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__SelectionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__2"


    // $ANTLR start "rule__SelectionExpression__Group_1__2__Impl"
    // InternalMiniJava.g:2641:1: rule__SelectionExpression__Group_1__2__Impl : ( ( rule__SelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__SelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2645:1: ( ( ( rule__SelectionExpression__MemberAssignment_1_2 ) ) )
            // InternalMiniJava.g:2646:1: ( ( rule__SelectionExpression__MemberAssignment_1_2 ) )
            {
            // InternalMiniJava.g:2646:1: ( ( rule__SelectionExpression__MemberAssignment_1_2 ) )
            // InternalMiniJava.g:2647:2: ( rule__SelectionExpression__MemberAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }
            // InternalMiniJava.g:2648:2: ( rule__SelectionExpression__MemberAssignment_1_2 )
            // InternalMiniJava.g:2648:3: rule__SelectionExpression__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__MemberAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1__3"
    // InternalMiniJava.g:2656:1: rule__SelectionExpression__Group_1__3 : rule__SelectionExpression__Group_1__3__Impl ;
    public final void rule__SelectionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2660:1: ( rule__SelectionExpression__Group_1__3__Impl )
            // InternalMiniJava.g:2661:2: rule__SelectionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__3"


    // $ANTLR start "rule__SelectionExpression__Group_1__3__Impl"
    // InternalMiniJava.g:2667:1: rule__SelectionExpression__Group_1__3__Impl : ( ( rule__SelectionExpression__Group_1_3__0 )? ) ;
    public final void rule__SelectionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2671:1: ( ( ( rule__SelectionExpression__Group_1_3__0 )? ) )
            // InternalMiniJava.g:2672:1: ( ( rule__SelectionExpression__Group_1_3__0 )? )
            {
            // InternalMiniJava.g:2672:1: ( ( rule__SelectionExpression__Group_1_3__0 )? )
            // InternalMiniJava.g:2673:2: ( rule__SelectionExpression__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_3()); 
            }
            // InternalMiniJava.g:2674:2: ( rule__SelectionExpression__Group_1_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:2674:3: rule__SelectionExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__0"
    // InternalMiniJava.g:2683:1: rule__SelectionExpression__Group_1_3__0 : rule__SelectionExpression__Group_1_3__0__Impl rule__SelectionExpression__Group_1_3__1 ;
    public final void rule__SelectionExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2687:1: ( rule__SelectionExpression__Group_1_3__0__Impl rule__SelectionExpression__Group_1_3__1 )
            // InternalMiniJava.g:2688:2: rule__SelectionExpression__Group_1_3__0__Impl rule__SelectionExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
            rule__SelectionExpression__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__0__Impl"
    // InternalMiniJava.g:2695:1: rule__SelectionExpression__Group_1_3__0__Impl : ( ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 ) ) ;
    public final void rule__SelectionExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2699:1: ( ( ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 ) ) )
            // InternalMiniJava.g:2700:1: ( ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            {
            // InternalMiniJava.g:2700:1: ( ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            // InternalMiniJava.g:2701:2: ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }
            // InternalMiniJava.g:2702:2: ( rule__SelectionExpression__MethodinvocationAssignment_1_3_0 )
            // InternalMiniJava.g:2702:3: rule__SelectionExpression__MethodinvocationAssignment_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__MethodinvocationAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__1"
    // InternalMiniJava.g:2710:1: rule__SelectionExpression__Group_1_3__1 : rule__SelectionExpression__Group_1_3__1__Impl rule__SelectionExpression__Group_1_3__2 ;
    public final void rule__SelectionExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2714:1: ( rule__SelectionExpression__Group_1_3__1__Impl rule__SelectionExpression__Group_1_3__2 )
            // InternalMiniJava.g:2715:2: rule__SelectionExpression__Group_1_3__1__Impl rule__SelectionExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_27);
            rule__SelectionExpression__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__1__Impl"
    // InternalMiniJava.g:2722:1: rule__SelectionExpression__Group_1_3__1__Impl : ( ( rule__SelectionExpression__Group_1_3_1__0 )? ) ;
    public final void rule__SelectionExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2726:1: ( ( ( rule__SelectionExpression__Group_1_3_1__0 )? ) )
            // InternalMiniJava.g:2727:1: ( ( rule__SelectionExpression__Group_1_3_1__0 )? )
            {
            // InternalMiniJava.g:2727:1: ( ( rule__SelectionExpression__Group_1_3_1__0 )? )
            // InternalMiniJava.g:2728:2: ( rule__SelectionExpression__Group_1_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1()); 
            }
            // InternalMiniJava.g:2729:2: ( rule__SelectionExpression__Group_1_3_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||(LA24_0>=11 && LA24_0<=12)||LA24_0==25||(LA24_0>=32 && LA24_0<=35)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:2729:3: rule__SelectionExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__2"
    // InternalMiniJava.g:2737:1: rule__SelectionExpression__Group_1_3__2 : rule__SelectionExpression__Group_1_3__2__Impl ;
    public final void rule__SelectionExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2741:1: ( rule__SelectionExpression__Group_1_3__2__Impl )
            // InternalMiniJava.g:2742:2: rule__SelectionExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__2"


    // $ANTLR start "rule__SelectionExpression__Group_1_3__2__Impl"
    // InternalMiniJava.g:2748:1: rule__SelectionExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__SelectionExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2752:1: ( ( ')' ) )
            // InternalMiniJava.g:2753:1: ( ')' )
            {
            // InternalMiniJava.g:2753:1: ( ')' )
            // InternalMiniJava.g:2754:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1__0"
    // InternalMiniJava.g:2764:1: rule__SelectionExpression__Group_1_3_1__0 : rule__SelectionExpression__Group_1_3_1__0__Impl rule__SelectionExpression__Group_1_3_1__1 ;
    public final void rule__SelectionExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2768:1: ( rule__SelectionExpression__Group_1_3_1__0__Impl rule__SelectionExpression__Group_1_3_1__1 )
            // InternalMiniJava.g:2769:2: rule__SelectionExpression__Group_1_3_1__0__Impl rule__SelectionExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SelectionExpression__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1__0__Impl"
    // InternalMiniJava.g:2776:1: rule__SelectionExpression__Group_1_3_1__0__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 ) ) ;
    public final void rule__SelectionExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2780:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 ) ) )
            // InternalMiniJava.g:2781:1: ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 ) )
            {
            // InternalMiniJava.g:2781:1: ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 ) )
            // InternalMiniJava.g:2782:2: ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }
            // InternalMiniJava.g:2783:2: ( rule__SelectionExpression__ArgsAssignment_1_3_1_0 )
            // InternalMiniJava.g:2783:3: rule__SelectionExpression__ArgsAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1__1"
    // InternalMiniJava.g:2791:1: rule__SelectionExpression__Group_1_3_1__1 : rule__SelectionExpression__Group_1_3_1__1__Impl ;
    public final void rule__SelectionExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2795:1: ( rule__SelectionExpression__Group_1_3_1__1__Impl )
            // InternalMiniJava.g:2796:2: rule__SelectionExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1__1__Impl"
    // InternalMiniJava.g:2802:1: rule__SelectionExpression__Group_1_3_1__1__Impl : ( ( rule__SelectionExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__SelectionExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2806:1: ( ( ( rule__SelectionExpression__Group_1_3_1_1__0 )* ) )
            // InternalMiniJava.g:2807:1: ( ( rule__SelectionExpression__Group_1_3_1_1__0 )* )
            {
            // InternalMiniJava.g:2807:1: ( ( rule__SelectionExpression__Group_1_3_1_1__0 )* )
            // InternalMiniJava.g:2808:2: ( rule__SelectionExpression__Group_1_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }
            // InternalMiniJava.g:2809:2: ( rule__SelectionExpression__Group_1_3_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMiniJava.g:2809:3: rule__SelectionExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SelectionExpression__Group_1_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1_1__0"
    // InternalMiniJava.g:2818:1: rule__SelectionExpression__Group_1_3_1_1__0 : rule__SelectionExpression__Group_1_3_1_1__0__Impl rule__SelectionExpression__Group_1_3_1_1__1 ;
    public final void rule__SelectionExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2822:1: ( rule__SelectionExpression__Group_1_3_1_1__0__Impl rule__SelectionExpression__Group_1_3_1_1__1 )
            // InternalMiniJava.g:2823:2: rule__SelectionExpression__Group_1_3_1_1__0__Impl rule__SelectionExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__SelectionExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1_1__0__Impl"
    // InternalMiniJava.g:2830:1: rule__SelectionExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__SelectionExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2834:1: ( ( ',' ) )
            // InternalMiniJava.g:2835:1: ( ',' )
            {
            // InternalMiniJava.g:2835:1: ( ',' )
            // InternalMiniJava.g:2836:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1_1__1"
    // InternalMiniJava.g:2845:1: rule__SelectionExpression__Group_1_3_1_1__1 : rule__SelectionExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__SelectionExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2849:1: ( rule__SelectionExpression__Group_1_3_1_1__1__Impl )
            // InternalMiniJava.g:2850:2: rule__SelectionExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_3_1_1__1__Impl"
    // InternalMiniJava.g:2856:1: rule__SelectionExpression__Group_1_3_1_1__1__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) ;
    public final void rule__SelectionExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2860:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) )
            // InternalMiniJava.g:2861:1: ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            {
            // InternalMiniJava.g:2861:1: ( ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            // InternalMiniJava.g:2862:2: ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }
            // InternalMiniJava.g:2863:2: ( rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 )
            // InternalMiniJava.g:2863:3: rule__SelectionExpression__ArgsAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalMiniJava.g:2872:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2876:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalMiniJava.g:2877:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalMiniJava.g:2884:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2888:1: ( ( () ) )
            // InternalMiniJava.g:2889:1: ( () )
            {
            // InternalMiniJava.g:2889:1: ( () )
            // InternalMiniJava.g:2890:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0()); 
            }
            // InternalMiniJava.g:2891:2: ()
            // InternalMiniJava.g:2891:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalMiniJava.g:2899:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2903:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalMiniJava.g:2904:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalMiniJava.g:2910:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2914:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalMiniJava.g:2915:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalMiniJava.g:2915:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalMiniJava.g:2916:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalMiniJava.g:2917:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalMiniJava.g:2917:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalMiniJava.g:2926:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2930:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalMiniJava.g:2931:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalMiniJava.g:2938:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2942:1: ( ( () ) )
            // InternalMiniJava.g:2943:1: ( () )
            {
            // InternalMiniJava.g:2943:1: ( () )
            // InternalMiniJava.g:2944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0()); 
            }
            // InternalMiniJava.g:2945:2: ()
            // InternalMiniJava.g:2945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalMiniJava.g:2953:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2957:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalMiniJava.g:2958:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalMiniJava.g:2964:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2968:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalMiniJava.g:2969:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalMiniJava.g:2969:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalMiniJava.g:2970:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalMiniJava.g:2971:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalMiniJava.g:2971:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalMiniJava.g:2980:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2984:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalMiniJava.g:2985:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalMiniJava.g:2992:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2996:1: ( ( () ) )
            // InternalMiniJava.g:2997:1: ( () )
            {
            // InternalMiniJava.g:2997:1: ( () )
            // InternalMiniJava.g:2998:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }
            // InternalMiniJava.g:2999:2: ()
            // InternalMiniJava.g:2999:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalMiniJava.g:3007:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3011:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalMiniJava.g:3012:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalMiniJava.g:3018:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3022:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalMiniJava.g:3023:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalMiniJava.g:3023:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalMiniJava.g:3024:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalMiniJava.g:3025:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalMiniJava.g:3025:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalMiniJava.g:3034:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3038:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalMiniJava.g:3039:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalMiniJava.g:3046:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3050:1: ( ( () ) )
            // InternalMiniJava.g:3051:1: ( () )
            {
            // InternalMiniJava.g:3051:1: ( () )
            // InternalMiniJava.g:3052:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisAction_3_0()); 
            }
            // InternalMiniJava.g:3053:2: ()
            // InternalMiniJava.g:3053:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalMiniJava.g:3061:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3065:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalMiniJava.g:3066:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalMiniJava.g:3072:1: rule__TerminalExpression__Group_3__1__Impl : ( 'this' ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3076:1: ( ( 'this' ) )
            // InternalMiniJava.g:3077:1: ( 'this' )
            {
            // InternalMiniJava.g:3077:1: ( 'this' )
            // InternalMiniJava.g:3078:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalMiniJava.g:3088:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3092:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalMiniJava.g:3093:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalMiniJava.g:3100:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3104:1: ( ( () ) )
            // InternalMiniJava.g:3105:1: ( () )
            {
            // InternalMiniJava.g:3105:1: ( () )
            // InternalMiniJava.g:3106:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0()); 
            }
            // InternalMiniJava.g:3107:2: ()
            // InternalMiniJava.g:3107:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalMiniJava.g:3115:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3119:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalMiniJava.g:3120:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalMiniJava.g:3126:1: rule__TerminalExpression__Group_4__1__Impl : ( 'super' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3130:1: ( ( 'super' ) )
            // InternalMiniJava.g:3131:1: ( 'super' )
            {
            // InternalMiniJava.g:3131:1: ( 'super' )
            // InternalMiniJava.g:3132:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalMiniJava.g:3142:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3146:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalMiniJava.g:3147:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalMiniJava.g:3154:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3158:1: ( ( () ) )
            // InternalMiniJava.g:3159:1: ( () )
            {
            // InternalMiniJava.g:3159:1: ( () )
            // InternalMiniJava.g:3160:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullAction_5_0()); 
            }
            // InternalMiniJava.g:3161:2: ()
            // InternalMiniJava.g:3161:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalMiniJava.g:3169:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3173:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalMiniJava.g:3174:2: rule__TerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalMiniJava.g:3180:1: rule__TerminalExpression__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3184:1: ( ( 'null' ) )
            // InternalMiniJava.g:3185:1: ( 'null' )
            {
            // InternalMiniJava.g:3185:1: ( 'null' )
            // InternalMiniJava.g:3186:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__0"
    // InternalMiniJava.g:3196:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3200:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalMiniJava.g:3201:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0"


    // $ANTLR start "rule__TerminalExpression__Group_6__0__Impl"
    // InternalMiniJava.g:3208:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3212:1: ( ( () ) )
            // InternalMiniJava.g:3213:1: ( () )
            {
            // InternalMiniJava.g:3213:1: ( () )
            // InternalMiniJava.g:3214:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_6_0()); 
            }
            // InternalMiniJava.g:3215:2: ()
            // InternalMiniJava.g:3215:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalMiniJava.g:3223:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3227:1: ( rule__TerminalExpression__Group_6__1__Impl )
            // InternalMiniJava.g:3228:2: rule__TerminalExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1"


    // $ANTLR start "rule__TerminalExpression__Group_6__1__Impl"
    // InternalMiniJava.g:3234:1: rule__TerminalExpression__Group_6__1__Impl : ( ( rule__TerminalExpression__SymbolAssignment_6_1 ) ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3238:1: ( ( ( rule__TerminalExpression__SymbolAssignment_6_1 ) ) )
            // InternalMiniJava.g:3239:1: ( ( rule__TerminalExpression__SymbolAssignment_6_1 ) )
            {
            // InternalMiniJava.g:3239:1: ( ( rule__TerminalExpression__SymbolAssignment_6_1 ) )
            // InternalMiniJava.g:3240:2: ( rule__TerminalExpression__SymbolAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_6_1()); 
            }
            // InternalMiniJava.g:3241:2: ( rule__TerminalExpression__SymbolAssignment_6_1 )
            // InternalMiniJava.g:3241:3: rule__TerminalExpression__SymbolAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__SymbolAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__0"
    // InternalMiniJava.g:3250:1: rule__TerminalExpression__Group_7__0 : rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 ;
    public final void rule__TerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3254:1: ( rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 )
            // InternalMiniJava.g:3255:2: rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_34);
            rule__TerminalExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0"


    // $ANTLR start "rule__TerminalExpression__Group_7__0__Impl"
    // InternalMiniJava.g:3262:1: rule__TerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3266:1: ( ( () ) )
            // InternalMiniJava.g:3267:1: ( () )
            {
            // InternalMiniJava.g:3267:1: ( () )
            // InternalMiniJava.g:3268:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewAction_7_0()); 
            }
            // InternalMiniJava.g:3269:2: ()
            // InternalMiniJava.g:3269:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__1"
    // InternalMiniJava.g:3277:1: rule__TerminalExpression__Group_7__1 : rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 ;
    public final void rule__TerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3281:1: ( rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 )
            // InternalMiniJava.g:3282:2: rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__1"


    // $ANTLR start "rule__TerminalExpression__Group_7__1__Impl"
    // InternalMiniJava.g:3289:1: rule__TerminalExpression__Group_7__1__Impl : ( 'new' ) ;
    public final void rule__TerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3293:1: ( ( 'new' ) )
            // InternalMiniJava.g:3294:1: ( 'new' )
            {
            // InternalMiniJava.g:3294:1: ( 'new' )
            // InternalMiniJava.g:3295:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__2"
    // InternalMiniJava.g:3304:1: rule__TerminalExpression__Group_7__2 : rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 ;
    public final void rule__TerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3308:1: ( rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 )
            // InternalMiniJava.g:3309:2: rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__2"


    // $ANTLR start "rule__TerminalExpression__Group_7__2__Impl"
    // InternalMiniJava.g:3316:1: rule__TerminalExpression__Group_7__2__Impl : ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) ;
    public final void rule__TerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3320:1: ( ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) )
            // InternalMiniJava.g:3321:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            {
            // InternalMiniJava.g:3321:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            // InternalMiniJava.g:3322:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }
            // InternalMiniJava.g:3323:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            // InternalMiniJava.g:3323:3: rule__TerminalExpression__TypeAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__TypeAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__3"
    // InternalMiniJava.g:3331:1: rule__TerminalExpression__Group_7__3 : rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 ;
    public final void rule__TerminalExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3335:1: ( rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 )
            // InternalMiniJava.g:3336:2: rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4
            {
            pushFollow(FOLLOW_24);
            rule__TerminalExpression__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__3"


    // $ANTLR start "rule__TerminalExpression__Group_7__3__Impl"
    // InternalMiniJava.g:3343:1: rule__TerminalExpression__Group_7__3__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3347:1: ( ( '(' ) )
            // InternalMiniJava.g:3348:1: ( '(' )
            {
            // InternalMiniJava.g:3348:1: ( '(' )
            // InternalMiniJava.g:3349:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__4"
    // InternalMiniJava.g:3358:1: rule__TerminalExpression__Group_7__4 : rule__TerminalExpression__Group_7__4__Impl ;
    public final void rule__TerminalExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3362:1: ( rule__TerminalExpression__Group_7__4__Impl )
            // InternalMiniJava.g:3363:2: rule__TerminalExpression__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__4"


    // $ANTLR start "rule__TerminalExpression__Group_7__4__Impl"
    // InternalMiniJava.g:3369:1: rule__TerminalExpression__Group_7__4__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3373:1: ( ( ')' ) )
            // InternalMiniJava.g:3374:1: ( ')' )
            {
            // InternalMiniJava.g:3374:1: ( ')' )
            // InternalMiniJava.g:3375:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__4__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__0"
    // InternalMiniJava.g:3385:1: rule__TerminalExpression__Group_8__0 : rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 ;
    public final void rule__TerminalExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3389:1: ( rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 )
            // InternalMiniJava.g:3390:2: rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1
            {
            pushFollow(FOLLOW_23);
            rule__TerminalExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__0"


    // $ANTLR start "rule__TerminalExpression__Group_8__0__Impl"
    // InternalMiniJava.g:3397:1: rule__TerminalExpression__Group_8__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3401:1: ( ( '(' ) )
            // InternalMiniJava.g:3402:1: ( '(' )
            {
            // InternalMiniJava.g:3402:1: ( '(' )
            // InternalMiniJava.g:3403:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__1"
    // InternalMiniJava.g:3412:1: rule__TerminalExpression__Group_8__1 : rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2 ;
    public final void rule__TerminalExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3416:1: ( rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2 )
            // InternalMiniJava.g:3417:2: rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2
            {
            pushFollow(FOLLOW_24);
            rule__TerminalExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__1"


    // $ANTLR start "rule__TerminalExpression__Group_8__1__Impl"
    // InternalMiniJava.g:3424:1: rule__TerminalExpression__Group_8__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3428:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3429:1: ( ruleExpression )
            {
            // InternalMiniJava.g:3429:1: ( ruleExpression )
            // InternalMiniJava.g:3430:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__2"
    // InternalMiniJava.g:3439:1: rule__TerminalExpression__Group_8__2 : rule__TerminalExpression__Group_8__2__Impl ;
    public final void rule__TerminalExpression__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3443:1: ( rule__TerminalExpression__Group_8__2__Impl )
            // InternalMiniJava.g:3444:2: rule__TerminalExpression__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__2"


    // $ANTLR start "rule__TerminalExpression__Group_8__2__Impl"
    // InternalMiniJava.g:3450:1: rule__TerminalExpression__Group_8__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3454:1: ( ( ')' ) )
            // InternalMiniJava.g:3455:1: ( ')' )
            {
            // InternalMiniJava.g:3455:1: ( ')' )
            // InternalMiniJava.g:3456:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_0_1"
    // InternalMiniJava.g:3466:1: rule__Program__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Program__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3470:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:3471:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:3471:2: ( ruleQualifiedName )
            // InternalMiniJava.g:3472:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_0_1"


    // $ANTLR start "rule__Program__ImportsAssignment_1"
    // InternalMiniJava.g:3481:1: rule__Program__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Program__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3485:1: ( ( ruleImport ) )
            // InternalMiniJava.g:3486:2: ( ruleImport )
            {
            // InternalMiniJava.g:3486:2: ( ruleImport )
            // InternalMiniJava.g:3487:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ImportsAssignment_1"


    // $ANTLR start "rule__Program__ClassesAssignment_2"
    // InternalMiniJava.g:3496:1: rule__Program__ClassesAssignment_2 : ( ruleClass ) ;
    public final void rule__Program__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3500:1: ( ( ruleClass ) )
            // InternalMiniJava.g:3501:2: ( ruleClass )
            {
            // InternalMiniJava.g:3501:2: ( ruleClass )
            // InternalMiniJava.g:3502:3: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassesAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMiniJava.g:3511:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3515:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava.g:3516:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava.g:3516:2: ( ruleQualifiedNameWithWildcard )
            // InternalMiniJava.g:3517:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalMiniJava.g:3526:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3530:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:3531:2: ( RULE_ID )
            {
            // InternalMiniJava.g:3531:2: ( RULE_ID )
            // InternalMiniJava.g:3532:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__SuperclassAssignment_2_1"
    // InternalMiniJava.g:3541:1: rule__Class__SuperclassAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__SuperclassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3545:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:3546:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:3546:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:3547:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperclassClassCrossReference_2_1_0()); 
            }
            // InternalMiniJava.g:3548:3: ( ruleQualifiedName )
            // InternalMiniJava.g:3549:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperclassClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperclassClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperclassClassCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperclassAssignment_2_1"


    // $ANTLR start "rule__Class__MembersAssignment_4"
    // InternalMiniJava.g:3560:1: rule__Class__MembersAssignment_4 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3564:1: ( ( ruleMember ) )
            // InternalMiniJava.g:3565:2: ( ruleMember )
            {
            // InternalMiniJava.g:3565:2: ( ruleMember )
            // InternalMiniJava.g:3566:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_4"


    // $ANTLR start "rule__Field__AccessAssignment_0"
    // InternalMiniJava.g:3575:1: rule__Field__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Field__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3579:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:3580:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:3580:2: ( ruleAccessLevel )
            // InternalMiniJava.g:3581:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__AccessAssignment_0"


    // $ANTLR start "rule__Method__AccessAssignment_0"
    // InternalMiniJava.g:3590:1: rule__Method__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Method__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3594:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:3595:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:3595:2: ( ruleAccessLevel )
            // InternalMiniJava.g:3596:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AccessAssignment_0"


    // $ANTLR start "rule__Method__ParamsAssignment_3_0"
    // InternalMiniJava.g:3605:1: rule__Method__ParamsAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3609:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:3610:2: ( ruleParameter )
            {
            // InternalMiniJava.g:3610:2: ( ruleParameter )
            // InternalMiniJava.g:3611:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_0"


    // $ANTLR start "rule__Method__ParamsAssignment_3_1_1"
    // InternalMiniJava.g:3620:1: rule__Method__ParamsAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3624:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:3625:2: ( ruleParameter )
            {
            // InternalMiniJava.g:3625:2: ( ruleParameter )
            // InternalMiniJava.g:3626:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__Method__BodyAssignment_5"
    // InternalMiniJava.g:3635:1: rule__Method__BodyAssignment_5 : ( ruleBlock ) ;
    public final void rule__Method__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3639:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:3640:2: ( ruleBlock )
            {
            // InternalMiniJava.g:3640:2: ( ruleBlock )
            // InternalMiniJava.g:3641:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BodyAssignment_5"


    // $ANTLR start "rule__Block__StatementsAssignment_2"
    // InternalMiniJava.g:3650:1: rule__Block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3654:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:3655:2: ( ruleStatement )
            {
            // InternalMiniJava.g:3655:2: ( ruleStatement )
            // InternalMiniJava.g:3656:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_2"


    // $ANTLR start "rule__VariableDeclaration__ExpressionAssignment_2"
    // InternalMiniJava.g:3665:1: rule__VariableDeclaration__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3669:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3670:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3670:2: ( ruleExpression )
            // InternalMiniJava.g:3671:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ExpressionAssignment_2"


    // $ANTLR start "rule__Return__ExpressionAssignment_1"
    // InternalMiniJava.g:3680:1: rule__Return__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Return__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3684:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3685:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3685:2: ( ruleExpression )
            // InternalMiniJava.g:3686:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__ExpressionAssignment_1"


    // $ANTLR start "rule__IfStatement__ExpressionAssignment_2"
    // InternalMiniJava.g:3695:1: rule__IfStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3699:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3700:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3700:2: ( ruleExpression )
            // InternalMiniJava.g:3701:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__IfStatement__ThenBlockAssignment_4"
    // InternalMiniJava.g:3710:1: rule__IfStatement__ThenBlockAssignment_4 : ( ruleIfBlock ) ;
    public final void rule__IfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3714:1: ( ( ruleIfBlock ) )
            // InternalMiniJava.g:3715:2: ( ruleIfBlock )
            {
            // InternalMiniJava.g:3715:2: ( ruleIfBlock )
            // InternalMiniJava.g:3716:3: ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseBlockAssignment_5_1"
    // InternalMiniJava.g:3725:1: rule__IfStatement__ElseBlockAssignment_5_1 : ( ruleIfBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3729:1: ( ( ruleIfBlock ) )
            // InternalMiniJava.g:3730:2: ( ruleIfBlock )
            {
            // InternalMiniJava.g:3730:2: ( ruleIfBlock )
            // InternalMiniJava.g:3731:3: ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__IfBlock__StatementsAssignment_0"
    // InternalMiniJava.g:3740:1: rule__IfBlock__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__IfBlock__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3744:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:3745:2: ( ruleStatement )
            {
            // InternalMiniJava.g:3745:2: ( ruleStatement )
            // InternalMiniJava.g:3746:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfBlockAccess().getStatementsStatementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__StatementsAssignment_0"


    // $ANTLR start "rule__TypedDeclaration__TypeAssignment_0"
    // InternalMiniJava.g:3755:1: rule__TypedDeclaration__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypedDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3759:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:3760:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:3760:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:3761:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getTypeClassCrossReference_0_0()); 
            }
            // InternalMiniJava.g:3762:3: ( ruleQualifiedName )
            // InternalMiniJava.g:3763:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getTypeClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getTypeClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getTypeClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__TypedDeclaration__NameAssignment_1"
    // InternalMiniJava.g:3774:1: rule__TypedDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3778:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:3779:2: ( RULE_ID )
            {
            // InternalMiniJava.g:3779:2: ( RULE_ID )
            // InternalMiniJava.g:3780:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Assignment__RightAssignment_1_2"
    // InternalMiniJava.g:3789:1: rule__Assignment__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Assignment__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3793:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3794:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3794:2: ( ruleExpression )
            // InternalMiniJava.g:3795:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__RightAssignment_1_2"


    // $ANTLR start "rule__SelectionExpression__MemberAssignment_1_2"
    // InternalMiniJava.g:3804:1: rule__SelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__SelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3808:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:3809:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:3809:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:3810:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            }
            // InternalMiniJava.g:3811:3: ( RULE_ID )
            // InternalMiniJava.g:3812:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMemberMemberCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__MemberAssignment_1_2"


    // $ANTLR start "rule__SelectionExpression__MethodinvocationAssignment_1_3_0"
    // InternalMiniJava.g:3823:1: rule__SelectionExpression__MethodinvocationAssignment_1_3_0 : ( ( '(' ) ) ;
    public final void rule__SelectionExpression__MethodinvocationAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3827:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:3828:2: ( ( '(' ) )
            {
            // InternalMiniJava.g:3828:2: ( ( '(' ) )
            // InternalMiniJava.g:3829:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            // InternalMiniJava.g:3830:3: ( '(' )
            // InternalMiniJava.g:3831:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__MethodinvocationAssignment_1_3_0"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_3_1_0"
    // InternalMiniJava.g:3842:1: rule__SelectionExpression__ArgsAssignment_1_3_1_0 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3846:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3847:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3847:2: ( ruleExpression )
            // InternalMiniJava.g:3848:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_3_1_0"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_3_1_1_1"
    // InternalMiniJava.g:3857:1: rule__SelectionExpression__ArgsAssignment_1_3_1_1_1 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3861:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3862:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3862:2: ( ruleExpression )
            // InternalMiniJava.g:3863:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_3_1_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalMiniJava.g:3872:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3876:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:3877:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:3877:2: ( RULE_STRING )
            // InternalMiniJava.g:3878:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalMiniJava.g:3887:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3891:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:3892:2: ( RULE_INT )
            {
            // InternalMiniJava.g:3892:2: ( RULE_INT )
            // InternalMiniJava.g:3893:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalMiniJava.g:3902:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3906:1: ( ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalMiniJava.g:3907:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalMiniJava.g:3907:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalMiniJava.g:3908:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // InternalMiniJava.g:3909:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            // InternalMiniJava.g:3909:4: rule__TerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__SymbolAssignment_6_1"
    // InternalMiniJava.g:3917:1: rule__TerminalExpression__SymbolAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__SymbolAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3921:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:3922:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:3922:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:3923:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_6_1_0()); 
            }
            // InternalMiniJava.g:3924:3: ( RULE_ID )
            // InternalMiniJava.g:3925:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__SymbolAssignment_6_1"


    // $ANTLR start "rule__TerminalExpression__TypeAssignment_7_2"
    // InternalMiniJava.g:3936:1: rule__TerminalExpression__TypeAssignment_7_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TerminalExpression__TypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3940:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:3941:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:3941:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:3942:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClassCrossReference_7_2_0()); 
            }
            // InternalMiniJava.g:3943:3: ( ruleQualifiedName )
            // InternalMiniJava.g:3944:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClassCrossReference_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__TypeAssignment_7_2"

    // $ANTLR start synpred30_InternalMiniJava
    public final void synpred30_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:2269:3: ( rule__IfStatement__Group_5__0 )
        // InternalMiniJava.g:2269:3: rule__IfStatement__Group_5__0
        {
        pushFollow(FOLLOW_2);
        rule__IfStatement__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMiniJava

    // Delegated rules

    public final boolean synpred30_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\4\1\21\1\4\2\uffff";
    static final String dfa_3s = "\1\17\3\4\1\23\1\4\1\31\1\23\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\10\uffff\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\6\16\uffff\1\5",
            "\1\7",
            "\1\11\7\uffff\1\10",
            "\1\6\16\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "586:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String dfa_9s = "\1\43\1\34\3\uffff\1\4\1\uffff\1\34";
    static final String dfa_10s = "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\3\4\uffff\2\3\14\uffff\1\3\3\uffff\1\2\1\4\1\uffff\4\3",
            "\1\6\14\uffff\1\3\1\uffff\1\5\10\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\14\uffff\1\3\1\uffff\1\5\5\uffff\1\3\2\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "607:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleReturn ) | ( ( rule__Statement__Group_2__0 ) ) | ( ruleIfStatement ) );";
        }
    }
    static final String dfa_13s = "\7\uffff";
    static final String dfa_14s = "\3\uffff\1\6\3\uffff";
    static final String dfa_15s = "\3\4\1\34\1\4\2\uffff";
    static final String dfa_16s = "\1\4\1\23\1\4\1\34\1\23\2\uffff";
    static final String dfa_17s = "\5\uffff\1\1\1\2";
    static final String dfa_18s = "\7\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\3\16\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\3\16\uffff\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "661:1: rule__Symbol__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleParameter ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000080E010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000400E010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000F6280F870L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000F6200F872L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000F6240F870L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000F06001870L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});

}