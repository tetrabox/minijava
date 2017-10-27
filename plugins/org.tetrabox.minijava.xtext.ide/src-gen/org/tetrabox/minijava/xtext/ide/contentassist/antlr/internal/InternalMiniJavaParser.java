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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'String'", "'true'", "'false'", "'class'", "'{'", "'}'", "'extends'", "'public'", "'static'", "'void'", "'main'", "'('", "'['", "']'", "')'", "';'", "','", "'.'", "'new'", "'this'"
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
    // InternalMiniJava.g:63:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:67:2: ( ( ( rule__Program__Alternatives ) ) )
            // InternalMiniJava.g:68:2: ( ( rule__Program__Alternatives ) )
            {
            // InternalMiniJava.g:68:2: ( ( rule__Program__Alternatives ) )
            // InternalMiniJava.g:69:3: ( rule__Program__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:70:3: ( rule__Program__Alternatives )
            // InternalMiniJava.g:70:4: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleClass"
    // InternalMiniJava.g:79:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMiniJava.g:80:1: ( ruleClass EOF )
            // InternalMiniJava.g:81:1: ruleClass EOF
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
    // InternalMiniJava.g:88:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:92:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMiniJava.g:93:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMiniJava.g:93:2: ( ( rule__Class__Group__0 ) )
            // InternalMiniJava.g:94:3: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalMiniJava.g:95:3: ( rule__Class__Group__0 )
            // InternalMiniJava.g:95:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleMain"
    // InternalMiniJava.g:104:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalMiniJava.g:105:1: ( ruleMain EOF )
            // InternalMiniJava.g:106:1: ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMiniJava.g:113:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:117:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalMiniJava.g:118:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalMiniJava.g:118:2: ( ( rule__Main__Group__0 ) )
            // InternalMiniJava.g:119:3: ( rule__Main__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup()); 
            }
            // InternalMiniJava.g:120:3: ( rule__Main__Group__0 )
            // InternalMiniJava.g:120:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getGroup()); 
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:129:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMiniJava.g:130:1: ( ruleType EOF )
            // InternalMiniJava.g:131:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMiniJava.g:138:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:142:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMiniJava.g:143:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMiniJava.g:143:2: ( ( rule__Type__Alternatives ) )
            // InternalMiniJava.g:144:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:145:3: ( rule__Type__Alternatives )
            // InternalMiniJava.g:145:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBasicType"
    // InternalMiniJava.g:154:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalMiniJava.g:155:1: ( ruleBasicType EOF )
            // InternalMiniJava.g:156:1: ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalMiniJava.g:163:1: ruleBasicType : ( ( rule__BasicType__BasicAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:167:2: ( ( ( rule__BasicType__BasicAssignment ) ) )
            // InternalMiniJava.g:168:2: ( ( rule__BasicType__BasicAssignment ) )
            {
            // InternalMiniJava.g:168:2: ( ( rule__BasicType__BasicAssignment ) )
            // InternalMiniJava.g:169:3: ( rule__BasicType__BasicAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBasicAssignment()); 
            }
            // InternalMiniJava.g:170:3: ( rule__BasicType__BasicAssignment )
            // InternalMiniJava.g:170:4: rule__BasicType__BasicAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__BasicAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getBasicAssignment()); 
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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // InternalMiniJava.g:179:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // InternalMiniJava.g:180:1: ( ruleClassType EOF )
            // InternalMiniJava.g:181:1: ruleClassType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeRule()); 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalMiniJava.g:188:1: ruleClassType : ( ( rule__ClassType__ClassrefAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:192:2: ( ( ( rule__ClassType__ClassrefAssignment ) ) )
            // InternalMiniJava.g:193:2: ( ( rule__ClassType__ClassrefAssignment ) )
            {
            // InternalMiniJava.g:193:2: ( ( rule__ClassType__ClassrefAssignment ) )
            // InternalMiniJava.g:194:3: ( rule__ClassType__ClassrefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassrefAssignment()); 
            }
            // InternalMiniJava.g:195:3: ( rule__ClassType__ClassrefAssignment )
            // InternalMiniJava.g:195:4: rule__ClassType__ClassrefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassType__ClassrefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassrefAssignment()); 
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
    // $ANTLR end "ruleClassType"


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


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:229:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:230:1: ( ruleParameter EOF )
            // InternalMiniJava.g:231:1: ruleParameter EOF
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
    // InternalMiniJava.g:238:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:242:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMiniJava.g:243:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMiniJava.g:243:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMiniJava.g:244:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalMiniJava.g:245:3: ( rule__Parameter__Group__0 )
            // InternalMiniJava.g:245:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
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


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:254:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMiniJava.g:255:1: ( ruleMethod EOF )
            // InternalMiniJava.g:256:1: ruleMethod EOF
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
    // InternalMiniJava.g:263:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:267:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMiniJava.g:268:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMiniJava.g:268:2: ( ( rule__Method__Group__0 ) )
            // InternalMiniJava.g:269:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalMiniJava.g:270:3: ( rule__Method__Group__0 )
            // InternalMiniJava.g:270:4: rule__Method__Group__0
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


    // $ANTLR start "entryRuleMethodBody"
    // InternalMiniJava.g:279:1: entryRuleMethodBody : ruleMethodBody EOF ;
    public final void entryRuleMethodBody() throws RecognitionException {
        try {
            // InternalMiniJava.g:280:1: ( ruleMethodBody EOF )
            // InternalMiniJava.g:281:1: ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyRule()); 
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
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // InternalMiniJava.g:288:1: ruleMethodBody : ( ( rule__MethodBody__Group__0 ) ) ;
    public final void ruleMethodBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:292:2: ( ( ( rule__MethodBody__Group__0 ) ) )
            // InternalMiniJava.g:293:2: ( ( rule__MethodBody__Group__0 ) )
            {
            // InternalMiniJava.g:293:2: ( ( rule__MethodBody__Group__0 ) )
            // InternalMiniJava.g:294:3: ( rule__MethodBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getGroup()); 
            }
            // InternalMiniJava.g:295:3: ( rule__MethodBody__Group__0 )
            // InternalMiniJava.g:295:4: rule__MethodBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:304:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:305:1: ( ruleExpression EOF )
            // InternalMiniJava.g:306:1: ruleExpression EOF
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
    // InternalMiniJava.g:313:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:317:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMiniJava.g:318:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMiniJava.g:318:2: ( ( rule__Expression__Group__0 ) )
            // InternalMiniJava.g:319:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalMiniJava.g:320:3: ( rule__Expression__Group__0 )
            // InternalMiniJava.g:320:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
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


    // $ANTLR start "entryRuleMessage"
    // InternalMiniJava.g:329:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMiniJava.g:330:1: ( ruleMessage EOF )
            // InternalMiniJava.g:331:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalMiniJava.g:338:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:342:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalMiniJava.g:343:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalMiniJava.g:343:2: ( ( rule__Message__Alternatives ) )
            // InternalMiniJava.g:344:3: ( rule__Message__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:345:3: ( rule__Message__Alternatives )
            // InternalMiniJava.g:345:4: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:354:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMiniJava.g:355:1: ( ruleMethodCall EOF )
            // InternalMiniJava.g:356:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMiniJava.g:363:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:367:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMiniJava.g:368:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMiniJava.g:368:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMiniJava.g:369:3: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // InternalMiniJava.g:370:3: ( rule__MethodCall__Group__0 )
            // InternalMiniJava.g:370:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleFieldSelection"
    // InternalMiniJava.g:379:1: entryRuleFieldSelection : ruleFieldSelection EOF ;
    public final void entryRuleFieldSelection() throws RecognitionException {
        try {
            // InternalMiniJava.g:380:1: ( ruleFieldSelection EOF )
            // InternalMiniJava.g:381:1: ruleFieldSelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectionRule()); 
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
    // $ANTLR end "entryRuleFieldSelection"


    // $ANTLR start "ruleFieldSelection"
    // InternalMiniJava.g:388:1: ruleFieldSelection : ( ( rule__FieldSelection__NameAssignment ) ) ;
    public final void ruleFieldSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:392:2: ( ( ( rule__FieldSelection__NameAssignment ) ) )
            // InternalMiniJava.g:393:2: ( ( rule__FieldSelection__NameAssignment ) )
            {
            // InternalMiniJava.g:393:2: ( ( rule__FieldSelection__NameAssignment ) )
            // InternalMiniJava.g:394:3: ( rule__FieldSelection__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionAccess().getNameAssignment()); 
            }
            // InternalMiniJava.g:395:3: ( rule__FieldSelection__NameAssignment )
            // InternalMiniJava.g:395:4: rule__FieldSelection__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelection__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectionAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleFieldSelection"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:404:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:405:1: ( ruleTerminalExpression EOF )
            // InternalMiniJava.g:406:1: ruleTerminalExpression EOF
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
    // InternalMiniJava.g:413:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:417:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalMiniJava.g:418:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalMiniJava.g:418:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalMiniJava.g:419:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:420:3: ( rule__TerminalExpression__Alternatives )
            // InternalMiniJava.g:420:4: rule__TerminalExpression__Alternatives
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


    // $ANTLR start "entryRuleThis"
    // InternalMiniJava.g:429:1: entryRuleThis : ruleThis EOF ;
    public final void entryRuleThis() throws RecognitionException {
        try {
            // InternalMiniJava.g:430:1: ( ruleThis EOF )
            // InternalMiniJava.g:431:1: ruleThis EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleThis();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThisRule()); 
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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // InternalMiniJava.g:438:1: ruleThis : ( ( rule__This__VariableAssignment ) ) ;
    public final void ruleThis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:442:2: ( ( ( rule__This__VariableAssignment ) ) )
            // InternalMiniJava.g:443:2: ( ( rule__This__VariableAssignment ) )
            {
            // InternalMiniJava.g:443:2: ( ( rule__This__VariableAssignment ) )
            // InternalMiniJava.g:444:3: ( rule__This__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableAssignment()); 
            }
            // InternalMiniJava.g:445:3: ( rule__This__VariableAssignment )
            // InternalMiniJava.g:445:4: rule__This__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__This__VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThisAccess().getVariableAssignment()); 
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
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleVariable"
    // InternalMiniJava.g:454:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMiniJava.g:455:1: ( ruleVariable EOF )
            // InternalMiniJava.g:456:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMiniJava.g:463:1: ruleVariable : ( ( rule__Variable__ParamrefAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:467:2: ( ( ( rule__Variable__ParamrefAssignment ) ) )
            // InternalMiniJava.g:468:2: ( ( rule__Variable__ParamrefAssignment ) )
            {
            // InternalMiniJava.g:468:2: ( ( rule__Variable__ParamrefAssignment ) )
            // InternalMiniJava.g:469:3: ( rule__Variable__ParamrefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getParamrefAssignment()); 
            }
            // InternalMiniJava.g:470:3: ( rule__Variable__ParamrefAssignment )
            // InternalMiniJava.g:470:4: rule__Variable__ParamrefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParamrefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getParamrefAssignment()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleNew"
    // InternalMiniJava.g:479:1: entryRuleNew : ruleNew EOF ;
    public final void entryRuleNew() throws RecognitionException {
        try {
            // InternalMiniJava.g:480:1: ( ruleNew EOF )
            // InternalMiniJava.g:481:1: ruleNew EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNew();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewRule()); 
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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // InternalMiniJava.g:488:1: ruleNew : ( ( rule__New__Group__0 ) ) ;
    public final void ruleNew() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:492:2: ( ( ( rule__New__Group__0 ) ) )
            // InternalMiniJava.g:493:2: ( ( rule__New__Group__0 ) )
            {
            // InternalMiniJava.g:493:2: ( ( rule__New__Group__0 ) )
            // InternalMiniJava.g:494:3: ( rule__New__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup()); 
            }
            // InternalMiniJava.g:495:3: ( rule__New__Group__0 )
            // InternalMiniJava.g:495:4: rule__New__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__New__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getGroup()); 
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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleCast"
    // InternalMiniJava.g:504:1: entryRuleCast : ruleCast EOF ;
    public final void entryRuleCast() throws RecognitionException {
        try {
            // InternalMiniJava.g:505:1: ( ruleCast EOF )
            // InternalMiniJava.g:506:1: ruleCast EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastRule()); 
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
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // InternalMiniJava.g:513:1: ruleCast : ( ( rule__Cast__Group__0 ) ) ;
    public final void ruleCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:517:2: ( ( ( rule__Cast__Group__0 ) ) )
            // InternalMiniJava.g:518:2: ( ( rule__Cast__Group__0 ) )
            {
            // InternalMiniJava.g:518:2: ( ( rule__Cast__Group__0 ) )
            // InternalMiniJava.g:519:3: ( rule__Cast__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getGroup()); 
            }
            // InternalMiniJava.g:520:3: ( rule__Cast__Group__0 )
            // InternalMiniJava.g:520:4: rule__Cast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cast__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getGroup()); 
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
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleParen"
    // InternalMiniJava.g:529:1: entryRuleParen : ruleParen EOF ;
    public final void entryRuleParen() throws RecognitionException {
        try {
            // InternalMiniJava.g:530:1: ( ruleParen EOF )
            // InternalMiniJava.g:531:1: ruleParen EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParen();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenRule()); 
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
    // $ANTLR end "entryRuleParen"


    // $ANTLR start "ruleParen"
    // InternalMiniJava.g:538:1: ruleParen : ( ( rule__Paren__Group__0 ) ) ;
    public final void ruleParen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:542:2: ( ( ( rule__Paren__Group__0 ) ) )
            // InternalMiniJava.g:543:2: ( ( rule__Paren__Group__0 ) )
            {
            // InternalMiniJava.g:543:2: ( ( rule__Paren__Group__0 ) )
            // InternalMiniJava.g:544:3: ( rule__Paren__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getGroup()); 
            }
            // InternalMiniJava.g:545:3: ( rule__Paren__Group__0 )
            // InternalMiniJava.g:545:4: rule__Paren__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paren__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenAccess().getGroup()); 
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
    // $ANTLR end "ruleParen"


    // $ANTLR start "entryRuleConstant"
    // InternalMiniJava.g:554:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:555:1: ( ruleConstant EOF )
            // InternalMiniJava.g:556:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMiniJava.g:563:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:567:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalMiniJava.g:568:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalMiniJava.g:568:2: ( ( rule__Constant__Alternatives ) )
            // InternalMiniJava.g:569:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:570:3: ( rule__Constant__Alternatives )
            // InternalMiniJava.g:570:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleStringConstant"
    // InternalMiniJava.g:579:1: entryRuleStringConstant : ruleStringConstant EOF ;
    public final void entryRuleStringConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:580:1: ( ruleStringConstant EOF )
            // InternalMiniJava.g:581:1: ruleStringConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringConstantRule()); 
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
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // InternalMiniJava.g:588:1: ruleStringConstant : ( ( rule__StringConstant__ConstantAssignment ) ) ;
    public final void ruleStringConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:592:2: ( ( ( rule__StringConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:593:2: ( ( rule__StringConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:593:2: ( ( rule__StringConstant__ConstantAssignment ) )
            // InternalMiniJava.g:594:3: ( rule__StringConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:595:3: ( rule__StringConstant__ConstantAssignment )
            // InternalMiniJava.g:595:4: rule__StringConstant__ConstantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringConstant__ConstantAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringConstantAccess().getConstantAssignment()); 
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
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntConstant"
    // InternalMiniJava.g:604:1: entryRuleIntConstant : ruleIntConstant EOF ;
    public final void entryRuleIntConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:605:1: ( ruleIntConstant EOF )
            // InternalMiniJava.g:606:1: ruleIntConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntConstantRule()); 
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
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // InternalMiniJava.g:613:1: ruleIntConstant : ( ( rule__IntConstant__ConstantAssignment ) ) ;
    public final void ruleIntConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:617:2: ( ( ( rule__IntConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:618:2: ( ( rule__IntConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:618:2: ( ( rule__IntConstant__ConstantAssignment ) )
            // InternalMiniJava.g:619:3: ( rule__IntConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:620:3: ( rule__IntConstant__ConstantAssignment )
            // InternalMiniJava.g:620:4: rule__IntConstant__ConstantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntConstant__ConstantAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntConstantAccess().getConstantAssignment()); 
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
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleBoolConstant"
    // InternalMiniJava.g:629:1: entryRuleBoolConstant : ruleBoolConstant EOF ;
    public final void entryRuleBoolConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:630:1: ( ruleBoolConstant EOF )
            // InternalMiniJava.g:631:1: ruleBoolConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolConstantRule()); 
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
    // $ANTLR end "entryRuleBoolConstant"


    // $ANTLR start "ruleBoolConstant"
    // InternalMiniJava.g:638:1: ruleBoolConstant : ( ( rule__BoolConstant__ConstantAssignment ) ) ;
    public final void ruleBoolConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:642:2: ( ( ( rule__BoolConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:643:2: ( ( rule__BoolConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:643:2: ( ( rule__BoolConstant__ConstantAssignment ) )
            // InternalMiniJava.g:644:3: ( rule__BoolConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:645:3: ( rule__BoolConstant__ConstantAssignment )
            // InternalMiniJava.g:645:4: rule__BoolConstant__ConstantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BoolConstant__ConstantAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolConstantAccess().getConstantAssignment()); 
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
    // $ANTLR end "ruleBoolConstant"


    // $ANTLR start "entryRuleArgument"
    // InternalMiniJava.g:654:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMiniJava.g:655:1: ( ruleArgument EOF )
            // InternalMiniJava.g:656:1: ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMiniJava.g:663:1: ruleArgument : ( ruleExpression ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:667:2: ( ( ruleExpression ) )
            // InternalMiniJava.g:668:2: ( ruleExpression )
            {
            // InternalMiniJava.g:668:2: ( ruleExpression )
            // InternalMiniJava.g:669:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "rule__Program__Alternatives"
    // InternalMiniJava.g:678:1: rule__Program__Alternatives : ( ( ruleClass ) | ( ( rule__Program__ClassesAssignment_1 )* ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:682:1: ( ( ruleClass ) | ( ( rule__Program__ClassesAssignment_1 )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred1_InternalMiniJava()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:683:2: ( ruleClass )
                    {
                    // InternalMiniJava.g:683:2: ( ruleClass )
                    // InternalMiniJava.g:684:3: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getClassParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:689:2: ( ( rule__Program__ClassesAssignment_1 )* )
                    {
                    // InternalMiniJava.g:689:2: ( ( rule__Program__ClassesAssignment_1 )* )
                    // InternalMiniJava.g:690:3: ( rule__Program__ClassesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getClassesAssignment_1()); 
                    }
                    // InternalMiniJava.g:691:3: ( rule__Program__ClassesAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMiniJava.g:691:4: rule__Program__ClassesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Program__ClassesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getClassesAssignment_1()); 
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
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMiniJava.g:699:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleClassType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:703:1: ( ( ruleBasicType ) | ( ruleClassType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
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
                    // InternalMiniJava.g:704:2: ( ruleBasicType )
                    {
                    // InternalMiniJava.g:704:2: ( ruleBasicType )
                    // InternalMiniJava.g:705:3: ruleBasicType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:710:2: ( ruleClassType )
                    {
                    // InternalMiniJava.g:710:2: ( ruleClassType )
                    // InternalMiniJava.g:711:3: ruleClassType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BasicType__BasicAlternatives_0"
    // InternalMiniJava.g:720:1: rule__BasicType__BasicAlternatives_0 : ( ( 'int' ) | ( 'boolean' ) | ( 'String' ) );
    public final void rule__BasicType__BasicAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:724:1: ( ( 'int' ) | ( 'boolean' ) | ( 'String' ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:725:2: ( 'int' )
                    {
                    // InternalMiniJava.g:725:2: ( 'int' )
                    // InternalMiniJava.g:726:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getBasicIntKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getBasicIntKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:731:2: ( 'boolean' )
                    {
                    // InternalMiniJava.g:731:2: ( 'boolean' )
                    // InternalMiniJava.g:732:3: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getBasicBooleanKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getBasicBooleanKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:737:2: ( 'String' )
                    {
                    // InternalMiniJava.g:737:2: ( 'String' )
                    // InternalMiniJava.g:738:3: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getBasicStringKeyword_0_2()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getBasicStringKeyword_0_2()); 
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
    // $ANTLR end "rule__BasicType__BasicAlternatives_0"


    // $ANTLR start "rule__Message__Alternatives"
    // InternalMiniJava.g:747:1: rule__Message__Alternatives : ( ( ruleMethodCall ) | ( ruleFieldSelection ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:751:1: ( ( ruleMethodCall ) | ( ruleFieldSelection ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==24) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=27 && LA5_1<=30)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:752:2: ( ruleMethodCall )
                    {
                    // InternalMiniJava.g:752:2: ( ruleMethodCall )
                    // InternalMiniJava.g:753:3: ruleMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getMethodCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getMethodCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:758:2: ( ruleFieldSelection )
                    {
                    // InternalMiniJava.g:758:2: ( ruleFieldSelection )
                    // InternalMiniJava.g:759:3: ruleFieldSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getFieldSelectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldSelection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getFieldSelectionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalMiniJava.g:768:1: rule__TerminalExpression__Alternatives : ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:772:1: ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:773:2: ( ruleThis )
                    {
                    // InternalMiniJava.g:773:2: ( ruleThis )
                    // InternalMiniJava.g:774:3: ruleThis
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getThisParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleThis();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getThisParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:779:2: ( ruleVariable )
                    {
                    // InternalMiniJava.g:779:2: ( ruleVariable )
                    // InternalMiniJava.g:780:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getVariableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:785:2: ( ruleNew )
                    {
                    // InternalMiniJava.g:785:2: ( ruleNew )
                    // InternalMiniJava.g:786:3: ruleNew
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getNewParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNew();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getNewParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:791:2: ( ( ruleCast ) )
                    {
                    // InternalMiniJava.g:791:2: ( ( ruleCast ) )
                    // InternalMiniJava.g:792:3: ( ruleCast )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
                    }
                    // InternalMiniJava.g:793:3: ( ruleCast )
                    // InternalMiniJava.g:793:4: ruleCast
                    {
                    pushFollow(FOLLOW_2);
                    ruleCast();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:797:2: ( ruleConstant )
                    {
                    // InternalMiniJava.g:797:2: ( ruleConstant )
                    // InternalMiniJava.g:798:3: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getConstantParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getConstantParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:803:2: ( ruleParen )
                    {
                    // InternalMiniJava.g:803:2: ( ruleParen )
                    // InternalMiniJava.g:804:3: ruleParen
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getParenParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParen();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getParenParserRuleCall_5()); 
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


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalMiniJava.g:813:1: rule__Constant__Alternatives : ( ( ruleIntConstant ) | ( ruleBoolConstant ) | ( ruleStringConstant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:817:1: ( ( ruleIntConstant ) | ( ruleBoolConstant ) | ( ruleStringConstant ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 14:
            case 15:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalMiniJava.g:818:2: ( ruleIntConstant )
                    {
                    // InternalMiniJava.g:818:2: ( ruleIntConstant )
                    // InternalMiniJava.g:819:3: ruleIntConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:824:2: ( ruleBoolConstant )
                    {
                    // InternalMiniJava.g:824:2: ( ruleBoolConstant )
                    // InternalMiniJava.g:825:3: ruleBoolConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolConstantParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getBoolConstantParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:830:2: ( ruleStringConstant )
                    {
                    // InternalMiniJava.g:830:2: ( ruleStringConstant )
                    // InternalMiniJava.g:831:3: ruleStringConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2()); 
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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__BoolConstant__ConstantAlternatives_0"
    // InternalMiniJava.g:840:1: rule__BoolConstant__ConstantAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolConstant__ConstantAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:844:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:845:2: ( 'true' )
                    {
                    // InternalMiniJava.g:845:2: ( 'true' )
                    // InternalMiniJava.g:846:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolConstantAccess().getConstantTrueKeyword_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolConstantAccess().getConstantTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:851:2: ( 'false' )
                    {
                    // InternalMiniJava.g:851:2: ( 'false' )
                    // InternalMiniJava.g:852:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolConstantAccess().getConstantFalseKeyword_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolConstantAccess().getConstantFalseKeyword_0_1()); 
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
    // $ANTLR end "rule__BoolConstant__ConstantAlternatives_0"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMiniJava.g:861:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:865:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMiniJava.g:866:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMiniJava.g:873:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:877:1: ( ( 'class' ) )
            // InternalMiniJava.g:878:1: ( 'class' )
            {
            // InternalMiniJava.g:878:1: ( 'class' )
            // InternalMiniJava.g:879:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:888:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:892:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMiniJava.g:893:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:900:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:904:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalMiniJava.g:905:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:905:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalMiniJava.g:906:2: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:907:2: ( rule__Class__NameAssignment_1 )
            // InternalMiniJava.g:907:3: rule__Class__NameAssignment_1
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
    // InternalMiniJava.g:915:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:919:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMiniJava.g:920:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:927:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:931:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalMiniJava.g:932:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalMiniJava.g:932:1: ( ( rule__Class__Group_2__0 )? )
            // InternalMiniJava.g:933:2: ( rule__Class__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_2()); 
            }
            // InternalMiniJava.g:934:2: ( rule__Class__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:934:3: rule__Class__Group_2__0
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
    // InternalMiniJava.g:942:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:946:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMiniJava.g:947:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMiniJava.g:954:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:958:1: ( ( '{' ) )
            // InternalMiniJava.g:959:1: ( '{' )
            {
            // InternalMiniJava.g:959:1: ( '{' )
            // InternalMiniJava.g:960:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:969:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:973:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMiniJava.g:974:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMiniJava.g:981:1: rule__Class__Group__4__Impl : ( ( rule__Class__FieldsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:985:1: ( ( ( rule__Class__FieldsAssignment_4 )* ) )
            // InternalMiniJava.g:986:1: ( ( rule__Class__FieldsAssignment_4 )* )
            {
            // InternalMiniJava.g:986:1: ( ( rule__Class__FieldsAssignment_4 )* )
            // InternalMiniJava.g:987:2: ( rule__Class__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getFieldsAssignment_4()); 
            }
            // InternalMiniJava.g:988:2: ( rule__Class__FieldsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==28) ) {
                            alt10=1;
                        }


                    }


                    }
                    break;
                case 12:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==28) ) {
                            alt10=1;
                        }


                    }


                    }
                    break;
                case 13:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (LA10_3==RULE_ID) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==28) ) {
                            alt10=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (LA10_4==RULE_ID) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==28) ) {
                            alt10=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:988:3: rule__Class__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__FieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getFieldsAssignment_4()); 
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
    // InternalMiniJava.g:996:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1000:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMiniJava.g:1001:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // InternalMiniJava.g:1008:1: rule__Class__Group__5__Impl : ( ( rule__Class__MethodsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1012:1: ( ( ( rule__Class__MethodsAssignment_5 )* ) )
            // InternalMiniJava.g:1013:1: ( ( rule__Class__MethodsAssignment_5 )* )
            {
            // InternalMiniJava.g:1013:1: ( ( rule__Class__MethodsAssignment_5 )* )
            // InternalMiniJava.g:1014:2: ( rule__Class__MethodsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMethodsAssignment_5()); 
            }
            // InternalMiniJava.g:1015:2: ( rule__Class__MethodsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=13)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava.g:1015:3: rule__Class__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__MethodsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMethodsAssignment_5()); 
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


    // $ANTLR start "rule__Class__Group__6"
    // InternalMiniJava.g:1023:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1027:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMiniJava.g:1028:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalMiniJava.g:1035:1: rule__Class__Group__6__Impl : ( ( rule__Class__MainAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1039:1: ( ( ( rule__Class__MainAssignment_6 )? ) )
            // InternalMiniJava.g:1040:1: ( ( rule__Class__MainAssignment_6 )? )
            {
            // InternalMiniJava.g:1040:1: ( ( rule__Class__MainAssignment_6 )? )
            // InternalMiniJava.g:1041:2: ( rule__Class__MainAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMainAssignment_6()); 
            }
            // InternalMiniJava.g:1042:2: ( rule__Class__MainAssignment_6 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1042:3: rule__Class__MainAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__MainAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMainAssignment_6()); 
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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalMiniJava.g:1050:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1054:1: ( rule__Class__Group__7__Impl )
            // InternalMiniJava.g:1055:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

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
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalMiniJava.g:1061:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1065:1: ( ( '}' ) )
            // InternalMiniJava.g:1066:1: ( '}' )
            {
            // InternalMiniJava.g:1066:1: ( '}' )
            // InternalMiniJava.g:1067:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // InternalMiniJava.g:1077:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1081:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalMiniJava.g:1082:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMiniJava.g:1089:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1093:1: ( ( 'extends' ) )
            // InternalMiniJava.g:1094:1: ( 'extends' )
            {
            // InternalMiniJava.g:1094:1: ( 'extends' )
            // InternalMiniJava.g:1095:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1104:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1108:1: ( rule__Class__Group_2__1__Impl )
            // InternalMiniJava.g:1109:2: rule__Class__Group_2__1__Impl
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
    // InternalMiniJava.g:1115:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1119:1: ( ( ( rule__Class__ExtendsAssignment_2_1 ) ) )
            // InternalMiniJava.g:1120:1: ( ( rule__Class__ExtendsAssignment_2_1 ) )
            {
            // InternalMiniJava.g:1120:1: ( ( rule__Class__ExtendsAssignment_2_1 ) )
            // InternalMiniJava.g:1121:2: ( rule__Class__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsAssignment_2_1()); 
            }
            // InternalMiniJava.g:1122:2: ( rule__Class__ExtendsAssignment_2_1 )
            // InternalMiniJava.g:1122:3: rule__Class__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsAssignment_2_1()); 
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


    // $ANTLR start "rule__Main__Group__0"
    // InternalMiniJava.g:1131:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1135:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMiniJava.g:1136:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Main__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalMiniJava.g:1143:1: rule__Main__Group__0__Impl : ( 'public' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1147:1: ( ( 'public' ) )
            // InternalMiniJava.g:1148:1: ( 'public' )
            {
            // InternalMiniJava.g:1148:1: ( 'public' )
            // InternalMiniJava.g:1149:2: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getPublicKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getPublicKeyword_0()); 
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
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalMiniJava.g:1158:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1162:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMiniJava.g:1163:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Main__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalMiniJava.g:1170:1: rule__Main__Group__1__Impl : ( 'static' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1174:1: ( ( 'static' ) )
            // InternalMiniJava.g:1175:1: ( 'static' )
            {
            // InternalMiniJava.g:1175:1: ( 'static' )
            // InternalMiniJava.g:1176:2: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getStaticKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getStaticKeyword_1()); 
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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalMiniJava.g:1185:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1189:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMiniJava.g:1190:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__3();

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
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalMiniJava.g:1197:1: rule__Main__Group__2__Impl : ( 'void' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1201:1: ( ( 'void' ) )
            // InternalMiniJava.g:1202:1: ( 'void' )
            {
            // InternalMiniJava.g:1202:1: ( 'void' )
            // InternalMiniJava.g:1203:2: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getVoidKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getVoidKeyword_2()); 
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
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // InternalMiniJava.g:1212:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1216:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMiniJava.g:1217:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Main__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__4();

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
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // InternalMiniJava.g:1224:1: rule__Main__Group__3__Impl : ( 'main' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1228:1: ( ( 'main' ) )
            // InternalMiniJava.g:1229:1: ( 'main' )
            {
            // InternalMiniJava.g:1229:1: ( 'main' )
            // InternalMiniJava.g:1230:2: 'main'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getMainKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getMainKeyword_3()); 
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
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // InternalMiniJava.g:1239:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1243:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMiniJava.g:1244:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Main__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__5();

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
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // InternalMiniJava.g:1251:1: rule__Main__Group__4__Impl : ( '(' ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1255:1: ( ( '(' ) )
            // InternalMiniJava.g:1256:1: ( '(' )
            {
            // InternalMiniJava.g:1256:1: ( '(' )
            // InternalMiniJava.g:1257:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getLeftParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Main__Group__5"
    // InternalMiniJava.g:1266:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1270:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMiniJava.g:1271:2: rule__Main__Group__5__Impl rule__Main__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Main__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__6();

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
    // $ANTLR end "rule__Main__Group__5"


    // $ANTLR start "rule__Main__Group__5__Impl"
    // InternalMiniJava.g:1278:1: rule__Main__Group__5__Impl : ( 'String' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1282:1: ( ( 'String' ) )
            // InternalMiniJava.g:1283:1: ( 'String' )
            {
            // InternalMiniJava.g:1283:1: ( 'String' )
            // InternalMiniJava.g:1284:2: 'String'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getStringKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getStringKeyword_5()); 
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
    // $ANTLR end "rule__Main__Group__5__Impl"


    // $ANTLR start "rule__Main__Group__6"
    // InternalMiniJava.g:1293:1: rule__Main__Group__6 : rule__Main__Group__6__Impl rule__Main__Group__7 ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1297:1: ( rule__Main__Group__6__Impl rule__Main__Group__7 )
            // InternalMiniJava.g:1298:2: rule__Main__Group__6__Impl rule__Main__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Main__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__7();

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
    // $ANTLR end "rule__Main__Group__6"


    // $ANTLR start "rule__Main__Group__6__Impl"
    // InternalMiniJava.g:1305:1: rule__Main__Group__6__Impl : ( '[' ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1309:1: ( ( '[' ) )
            // InternalMiniJava.g:1310:1: ( '[' )
            {
            // InternalMiniJava.g:1310:1: ( '[' )
            // InternalMiniJava.g:1311:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getLeftSquareBracketKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getLeftSquareBracketKeyword_6()); 
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
    // $ANTLR end "rule__Main__Group__6__Impl"


    // $ANTLR start "rule__Main__Group__7"
    // InternalMiniJava.g:1320:1: rule__Main__Group__7 : rule__Main__Group__7__Impl rule__Main__Group__8 ;
    public final void rule__Main__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1324:1: ( rule__Main__Group__7__Impl rule__Main__Group__8 )
            // InternalMiniJava.g:1325:2: rule__Main__Group__7__Impl rule__Main__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Main__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__8();

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
    // $ANTLR end "rule__Main__Group__7"


    // $ANTLR start "rule__Main__Group__7__Impl"
    // InternalMiniJava.g:1332:1: rule__Main__Group__7__Impl : ( ']' ) ;
    public final void rule__Main__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1336:1: ( ( ']' ) )
            // InternalMiniJava.g:1337:1: ( ']' )
            {
            // InternalMiniJava.g:1337:1: ( ']' )
            // InternalMiniJava.g:1338:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getRightSquareBracketKeyword_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getRightSquareBracketKeyword_7()); 
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
    // $ANTLR end "rule__Main__Group__7__Impl"


    // $ANTLR start "rule__Main__Group__8"
    // InternalMiniJava.g:1347:1: rule__Main__Group__8 : rule__Main__Group__8__Impl rule__Main__Group__9 ;
    public final void rule__Main__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1351:1: ( rule__Main__Group__8__Impl rule__Main__Group__9 )
            // InternalMiniJava.g:1352:2: rule__Main__Group__8__Impl rule__Main__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Main__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__9();

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
    // $ANTLR end "rule__Main__Group__8"


    // $ANTLR start "rule__Main__Group__8__Impl"
    // InternalMiniJava.g:1359:1: rule__Main__Group__8__Impl : ( RULE_ID ) ;
    public final void rule__Main__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1363:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1364:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1364:1: ( RULE_ID )
            // InternalMiniJava.g:1365:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getIDTerminalRuleCall_8()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getIDTerminalRuleCall_8()); 
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
    // $ANTLR end "rule__Main__Group__8__Impl"


    // $ANTLR start "rule__Main__Group__9"
    // InternalMiniJava.g:1374:1: rule__Main__Group__9 : rule__Main__Group__9__Impl rule__Main__Group__10 ;
    public final void rule__Main__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1378:1: ( rule__Main__Group__9__Impl rule__Main__Group__10 )
            // InternalMiniJava.g:1379:2: rule__Main__Group__9__Impl rule__Main__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Main__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__10();

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
    // $ANTLR end "rule__Main__Group__9"


    // $ANTLR start "rule__Main__Group__9__Impl"
    // InternalMiniJava.g:1386:1: rule__Main__Group__9__Impl : ( ')' ) ;
    public final void rule__Main__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1390:1: ( ( ')' ) )
            // InternalMiniJava.g:1391:1: ( ')' )
            {
            // InternalMiniJava.g:1391:1: ( ')' )
            // InternalMiniJava.g:1392:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getRightParenthesisKeyword_9()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getRightParenthesisKeyword_9()); 
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
    // $ANTLR end "rule__Main__Group__9__Impl"


    // $ANTLR start "rule__Main__Group__10"
    // InternalMiniJava.g:1401:1: rule__Main__Group__10 : rule__Main__Group__10__Impl ;
    public final void rule__Main__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1405:1: ( rule__Main__Group__10__Impl )
            // InternalMiniJava.g:1406:2: rule__Main__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__10__Impl();

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
    // $ANTLR end "rule__Main__Group__10"


    // $ANTLR start "rule__Main__Group__10__Impl"
    // InternalMiniJava.g:1412:1: rule__Main__Group__10__Impl : ( ( rule__Main__BodyAssignment_10 ) ) ;
    public final void rule__Main__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1416:1: ( ( ( rule__Main__BodyAssignment_10 ) ) )
            // InternalMiniJava.g:1417:1: ( ( rule__Main__BodyAssignment_10 ) )
            {
            // InternalMiniJava.g:1417:1: ( ( rule__Main__BodyAssignment_10 ) )
            // InternalMiniJava.g:1418:2: ( rule__Main__BodyAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getBodyAssignment_10()); 
            }
            // InternalMiniJava.g:1419:2: ( rule__Main__BodyAssignment_10 )
            // InternalMiniJava.g:1419:3: rule__Main__BodyAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Main__BodyAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getBodyAssignment_10()); 
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
    // $ANTLR end "rule__Main__Group__10__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMiniJava.g:1428:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1432:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMiniJava.g:1433:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMiniJava.g:1440:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1444:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:1445:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1445:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalMiniJava.g:1446:2: ( rule__Field__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            }
            // InternalMiniJava.g:1447:2: ( rule__Field__TypeAssignment_0 )
            // InternalMiniJava.g:1447:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
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
    // InternalMiniJava.g:1455:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1459:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMiniJava.g:1460:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMiniJava.g:1467:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1471:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1472:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1472:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalMiniJava.g:1473:2: ( rule__Field__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1474:2: ( rule__Field__NameAssignment_1 )
            // InternalMiniJava.g:1474:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_1()); 
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
    // InternalMiniJava.g:1482:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1486:1: ( rule__Field__Group__2__Impl )
            // InternalMiniJava.g:1487:2: rule__Field__Group__2__Impl
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
    // InternalMiniJava.g:1493:1: rule__Field__Group__2__Impl : ( ';' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1497:1: ( ( ';' ) )
            // InternalMiniJava.g:1498:1: ( ';' )
            {
            // InternalMiniJava.g:1498:1: ( ';' )
            // InternalMiniJava.g:1499:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMiniJava.g:1509:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1513:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMiniJava.g:1514:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMiniJava.g:1521:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1525:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:1526:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1526:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMiniJava.g:1527:2: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // InternalMiniJava.g:1528:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMiniJava.g:1528:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMiniJava.g:1536:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1540:1: ( rule__Parameter__Group__1__Impl )
            // InternalMiniJava.g:1541:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMiniJava.g:1547:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1551:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1552:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1552:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMiniJava.g:1553:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1554:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMiniJava.g:1554:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMiniJava.g:1563:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1567:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMiniJava.g:1568:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMiniJava.g:1575:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturntypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1579:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) )
            // InternalMiniJava.g:1580:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1580:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // InternalMiniJava.g:1581:2: ( rule__Method__ReturntypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            }
            // InternalMiniJava.g:1582:2: ( rule__Method__ReturntypeAssignment_0 )
            // InternalMiniJava.g:1582:3: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturntypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
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
    // InternalMiniJava.g:1590:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1594:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMiniJava.g:1595:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:1602:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1606:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1607:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1607:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalMiniJava.g:1608:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1609:2: ( rule__Method__NameAssignment_1 )
            // InternalMiniJava.g:1609:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_1()); 
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
    // InternalMiniJava.g:1617:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1621:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMiniJava.g:1622:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMiniJava.g:1629:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1633:1: ( ( '(' ) )
            // InternalMiniJava.g:1634:1: ( '(' )
            {
            // InternalMiniJava.g:1634:1: ( '(' )
            // InternalMiniJava.g:1635:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1644:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1648:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMiniJava.g:1649:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMiniJava.g:1656:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1660:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalMiniJava.g:1661:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalMiniJava.g:1661:1: ( ( rule__Method__Group_3__0 )? )
            // InternalMiniJava.g:1662:2: ( rule__Method__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:1663:2: ( rule__Method__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=11 && LA13_0<=13)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:1663:3: rule__Method__Group_3__0
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
    // InternalMiniJava.g:1671:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1675:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMiniJava.g:1676:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMiniJava.g:1683:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1687:1: ( ( ')' ) )
            // InternalMiniJava.g:1688:1: ( ')' )
            {
            // InternalMiniJava.g:1688:1: ( ')' )
            // InternalMiniJava.g:1689:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1698:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1702:1: ( rule__Method__Group__5__Impl )
            // InternalMiniJava.g:1703:2: rule__Method__Group__5__Impl
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
    // InternalMiniJava.g:1709:1: rule__Method__Group__5__Impl : ( ( rule__Method__BodyAssignment_5 ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1713:1: ( ( ( rule__Method__BodyAssignment_5 ) ) )
            // InternalMiniJava.g:1714:1: ( ( rule__Method__BodyAssignment_5 ) )
            {
            // InternalMiniJava.g:1714:1: ( ( rule__Method__BodyAssignment_5 ) )
            // InternalMiniJava.g:1715:2: ( rule__Method__BodyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyAssignment_5()); 
            }
            // InternalMiniJava.g:1716:2: ( rule__Method__BodyAssignment_5 )
            // InternalMiniJava.g:1716:3: rule__Method__BodyAssignment_5
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
    // InternalMiniJava.g:1725:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1729:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalMiniJava.g:1730:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMiniJava.g:1737:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParamsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1741:1: ( ( ( rule__Method__ParamsAssignment_3_0 ) ) )
            // InternalMiniJava.g:1742:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            {
            // InternalMiniJava.g:1742:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            // InternalMiniJava.g:1743:2: ( rule__Method__ParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }
            // InternalMiniJava.g:1744:2: ( rule__Method__ParamsAssignment_3_0 )
            // InternalMiniJava.g:1744:3: rule__Method__ParamsAssignment_3_0
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
    // InternalMiniJava.g:1752:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1756:1: ( rule__Method__Group_3__1__Impl )
            // InternalMiniJava.g:1757:2: rule__Method__Group_3__1__Impl
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
    // InternalMiniJava.g:1763:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1767:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalMiniJava.g:1768:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalMiniJava.g:1768:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalMiniJava.g:1769:2: ( rule__Method__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }
            // InternalMiniJava.g:1770:2: ( rule__Method__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:1770:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMiniJava.g:1779:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1783:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalMiniJava.g:1784:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMiniJava.g:1791:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1795:1: ( ( ',' ) )
            // InternalMiniJava.g:1796:1: ( ',' )
            {
            // InternalMiniJava.g:1796:1: ( ',' )
            // InternalMiniJava.g:1797:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1806:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1810:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalMiniJava.g:1811:2: rule__Method__Group_3_1__1__Impl
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
    // InternalMiniJava.g:1817:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1821:1: ( ( ( rule__Method__ParamsAssignment_3_1_1 ) ) )
            // InternalMiniJava.g:1822:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            {
            // InternalMiniJava.g:1822:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            // InternalMiniJava.g:1823:2: ( rule__Method__ParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }
            // InternalMiniJava.g:1824:2: ( rule__Method__ParamsAssignment_3_1_1 )
            // InternalMiniJava.g:1824:3: rule__Method__ParamsAssignment_3_1_1
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


    // $ANTLR start "rule__MethodBody__Group__0"
    // InternalMiniJava.g:1833:1: rule__MethodBody__Group__0 : rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 ;
    public final void rule__MethodBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1837:1: ( rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 )
            // InternalMiniJava.g:1838:2: rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MethodBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__1();

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
    // $ANTLR end "rule__MethodBody__Group__0"


    // $ANTLR start "rule__MethodBody__Group__0__Impl"
    // InternalMiniJava.g:1845:1: rule__MethodBody__Group__0__Impl : ( '{' ) ;
    public final void rule__MethodBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1849:1: ( ( '{' ) )
            // InternalMiniJava.g:1850:1: ( '{' )
            {
            // InternalMiniJava.g:1850:1: ( '{' )
            // InternalMiniJava.g:1851:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__MethodBody__Group__0__Impl"


    // $ANTLR start "rule__MethodBody__Group__1"
    // InternalMiniJava.g:1860:1: rule__MethodBody__Group__1 : rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 ;
    public final void rule__MethodBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1864:1: ( rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 )
            // InternalMiniJava.g:1865:2: rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MethodBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__2();

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
    // $ANTLR end "rule__MethodBody__Group__1"


    // $ANTLR start "rule__MethodBody__Group__1__Impl"
    // InternalMiniJava.g:1872:1: rule__MethodBody__Group__1__Impl : ( ( rule__MethodBody__ExpressionAssignment_1 ) ) ;
    public final void rule__MethodBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1876:1: ( ( ( rule__MethodBody__ExpressionAssignment_1 ) ) )
            // InternalMiniJava.g:1877:1: ( ( rule__MethodBody__ExpressionAssignment_1 ) )
            {
            // InternalMiniJava.g:1877:1: ( ( rule__MethodBody__ExpressionAssignment_1 ) )
            // InternalMiniJava.g:1878:2: ( rule__MethodBody__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getExpressionAssignment_1()); 
            }
            // InternalMiniJava.g:1879:2: ( rule__MethodBody__ExpressionAssignment_1 )
            // InternalMiniJava.g:1879:3: rule__MethodBody__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__MethodBody__Group__1__Impl"


    // $ANTLR start "rule__MethodBody__Group__2"
    // InternalMiniJava.g:1887:1: rule__MethodBody__Group__2 : rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3 ;
    public final void rule__MethodBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1891:1: ( rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3 )
            // InternalMiniJava.g:1892:2: rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__MethodBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__3();

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
    // $ANTLR end "rule__MethodBody__Group__2"


    // $ANTLR start "rule__MethodBody__Group__2__Impl"
    // InternalMiniJava.g:1899:1: rule__MethodBody__Group__2__Impl : ( ';' ) ;
    public final void rule__MethodBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1903:1: ( ( ';' ) )
            // InternalMiniJava.g:1904:1: ( ';' )
            {
            // InternalMiniJava.g:1904:1: ( ';' )
            // InternalMiniJava.g:1905:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__MethodBody__Group__2__Impl"


    // $ANTLR start "rule__MethodBody__Group__3"
    // InternalMiniJava.g:1914:1: rule__MethodBody__Group__3 : rule__MethodBody__Group__3__Impl ;
    public final void rule__MethodBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1918:1: ( rule__MethodBody__Group__3__Impl )
            // InternalMiniJava.g:1919:2: rule__MethodBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__3__Impl();

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
    // $ANTLR end "rule__MethodBody__Group__3"


    // $ANTLR start "rule__MethodBody__Group__3__Impl"
    // InternalMiniJava.g:1925:1: rule__MethodBody__Group__3__Impl : ( '}' ) ;
    public final void rule__MethodBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1929:1: ( ( '}' ) )
            // InternalMiniJava.g:1930:1: ( '}' )
            {
            // InternalMiniJava.g:1930:1: ( '}' )
            // InternalMiniJava.g:1931:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__MethodBody__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMiniJava.g:1941:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1945:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMiniJava.g:1946:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMiniJava.g:1953:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1957:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:1958:1: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:1958:1: ( ruleTerminalExpression )
            // InternalMiniJava.g:1959:2: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMiniJava.g:1968:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1972:1: ( rule__Expression__Group__1__Impl )
            // InternalMiniJava.g:1973:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMiniJava.g:1979:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1983:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalMiniJava.g:1984:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalMiniJava.g:1984:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalMiniJava.g:1985:2: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:1986:2: ( rule__Expression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniJava.g:1986:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMiniJava.g:1995:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1999:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMiniJava.g:2000:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMiniJava.g:2007:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2011:1: ( ( () ) )
            // InternalMiniJava.g:2012:1: ( () )
            {
            // InternalMiniJava.g:2012:1: ( () )
            // InternalMiniJava.g:2013:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getSelectionReceiverAction_1_0()); 
            }
            // InternalMiniJava.g:2014:2: ()
            // InternalMiniJava.g:2014:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getSelectionReceiverAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMiniJava.g:2022:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2026:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMiniJava.g:2027:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMiniJava.g:2034:1: rule__Expression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2038:1: ( ( '.' ) )
            // InternalMiniJava.g:2039:1: ( '.' )
            {
            // InternalMiniJava.g:2039:1: ( '.' )
            // InternalMiniJava.g:2040:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalMiniJava.g:2049:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2053:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMiniJava.g:2054:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalMiniJava.g:2060:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__MessageAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2064:1: ( ( ( rule__Expression__MessageAssignment_1_2 ) ) )
            // InternalMiniJava.g:2065:1: ( ( rule__Expression__MessageAssignment_1_2 ) )
            {
            // InternalMiniJava.g:2065:1: ( ( rule__Expression__MessageAssignment_1_2 ) )
            // InternalMiniJava.g:2066:2: ( rule__Expression__MessageAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMessageAssignment_1_2()); 
            }
            // InternalMiniJava.g:2067:2: ( rule__Expression__MessageAssignment_1_2 )
            // InternalMiniJava.g:2067:3: rule__Expression__MessageAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__MessageAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getMessageAssignment_1_2()); 
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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalMiniJava.g:2076:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2080:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMiniJava.g:2081:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

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
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalMiniJava.g:2088:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2092:1: ( ( ( rule__MethodCall__NameAssignment_0 ) ) )
            // InternalMiniJava.g:2093:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            {
            // InternalMiniJava.g:2093:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            // InternalMiniJava.g:2094:2: ( rule__MethodCall__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
            }
            // InternalMiniJava.g:2095:2: ( rule__MethodCall__NameAssignment_0 )
            // InternalMiniJava.g:2095:3: rule__MethodCall__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalMiniJava.g:2103:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2107:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMiniJava.g:2108:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2();

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
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalMiniJava.g:2115:1: rule__MethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2119:1: ( ( '(' ) )
            // InternalMiniJava.g:2120:1: ( '(' )
            {
            // InternalMiniJava.g:2120:1: ( '(' )
            // InternalMiniJava.g:2121:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // InternalMiniJava.g:2130:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2134:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // InternalMiniJava.g:2135:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3();

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
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // InternalMiniJava.g:2142:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__Group_2__0 )? ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2146:1: ( ( ( rule__MethodCall__Group_2__0 )? ) )
            // InternalMiniJava.g:2147:1: ( ( rule__MethodCall__Group_2__0 )? )
            {
            // InternalMiniJava.g:2147:1: ( ( rule__MethodCall__Group_2__0 )? )
            // InternalMiniJava.g:2148:2: ( rule__MethodCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_2()); 
            }
            // InternalMiniJava.g:2149:2: ( rule__MethodCall__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||(LA16_0>=14 && LA16_0<=15)||LA16_0==24||(LA16_0>=31 && LA16_0<=32)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:2149:3: rule__MethodCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCall__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup_2()); 
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
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__3"
    // InternalMiniJava.g:2157:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2161:1: ( rule__MethodCall__Group__3__Impl )
            // InternalMiniJava.g:2162:2: rule__MethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3__Impl();

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
    // $ANTLR end "rule__MethodCall__Group__3"


    // $ANTLR start "rule__MethodCall__Group__3__Impl"
    // InternalMiniJava.g:2168:1: rule__MethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2172:1: ( ( ')' ) )
            // InternalMiniJava.g:2173:1: ( ')' )
            {
            // InternalMiniJava.g:2173:1: ( ')' )
            // InternalMiniJava.g:2174:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__MethodCall__Group__3__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__0"
    // InternalMiniJava.g:2184:1: rule__MethodCall__Group_2__0 : rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 ;
    public final void rule__MethodCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2188:1: ( rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 )
            // InternalMiniJava.g:2189:2: rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__MethodCall__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1();

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
    // $ANTLR end "rule__MethodCall__Group_2__0"


    // $ANTLR start "rule__MethodCall__Group_2__0__Impl"
    // InternalMiniJava.g:2196:1: rule__MethodCall__Group_2__0__Impl : ( ( rule__MethodCall__ArgsAssignment_2_0 ) ) ;
    public final void rule__MethodCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2200:1: ( ( ( rule__MethodCall__ArgsAssignment_2_0 ) ) )
            // InternalMiniJava.g:2201:1: ( ( rule__MethodCall__ArgsAssignment_2_0 ) )
            {
            // InternalMiniJava.g:2201:1: ( ( rule__MethodCall__ArgsAssignment_2_0 ) )
            // InternalMiniJava.g:2202:2: ( rule__MethodCall__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsAssignment_2_0()); 
            }
            // InternalMiniJava.g:2203:2: ( rule__MethodCall__ArgsAssignment_2_0 )
            // InternalMiniJava.g:2203:3: rule__MethodCall__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ArgsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getArgsAssignment_2_0()); 
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
    // $ANTLR end "rule__MethodCall__Group_2__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__1"
    // InternalMiniJava.g:2211:1: rule__MethodCall__Group_2__1 : rule__MethodCall__Group_2__1__Impl ;
    public final void rule__MethodCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2215:1: ( rule__MethodCall__Group_2__1__Impl )
            // InternalMiniJava.g:2216:2: rule__MethodCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1__Impl();

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
    // $ANTLR end "rule__MethodCall__Group_2__1"


    // $ANTLR start "rule__MethodCall__Group_2__1__Impl"
    // InternalMiniJava.g:2222:1: rule__MethodCall__Group_2__1__Impl : ( ( rule__MethodCall__Group_2_1__0 )* ) ;
    public final void rule__MethodCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2226:1: ( ( ( rule__MethodCall__Group_2_1__0 )* ) )
            // InternalMiniJava.g:2227:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            {
            // InternalMiniJava.g:2227:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            // InternalMiniJava.g:2228:2: ( rule__MethodCall__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
            }
            // InternalMiniJava.g:2229:2: ( rule__MethodCall__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:2229:3: rule__MethodCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MethodCall__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__0"
    // InternalMiniJava.g:2238:1: rule__MethodCall__Group_2_1__0 : rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 ;
    public final void rule__MethodCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2242:1: ( rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 )
            // InternalMiniJava.g:2243:2: rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1
            {
            pushFollow(FOLLOW_22);
            rule__MethodCall__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1();

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
    // $ANTLR end "rule__MethodCall__Group_2_1__0"


    // $ANTLR start "rule__MethodCall__Group_2_1__0__Impl"
    // InternalMiniJava.g:2250:1: rule__MethodCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2254:1: ( ( ',' ) )
            // InternalMiniJava.g:2255:1: ( ',' )
            {
            // InternalMiniJava.g:2255:1: ( ',' )
            // InternalMiniJava.g:2256:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__MethodCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__1"
    // InternalMiniJava.g:2265:1: rule__MethodCall__Group_2_1__1 : rule__MethodCall__Group_2_1__1__Impl ;
    public final void rule__MethodCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2269:1: ( rule__MethodCall__Group_2_1__1__Impl )
            // InternalMiniJava.g:2270:2: rule__MethodCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MethodCall__Group_2_1__1"


    // $ANTLR start "rule__MethodCall__Group_2_1__1__Impl"
    // InternalMiniJava.g:2276:1: rule__MethodCall__Group_2_1__1__Impl : ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__MethodCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2280:1: ( ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) ) )
            // InternalMiniJava.g:2281:1: ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) )
            {
            // InternalMiniJava.g:2281:1: ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) )
            // InternalMiniJava.g:2282:2: ( rule__MethodCall__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalMiniJava.g:2283:2: ( rule__MethodCall__ArgsAssignment_2_1_1 )
            // InternalMiniJava.g:2283:3: rule__MethodCall__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ArgsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getArgsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__MethodCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__New__Group__0"
    // InternalMiniJava.g:2292:1: rule__New__Group__0 : rule__New__Group__0__Impl rule__New__Group__1 ;
    public final void rule__New__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2296:1: ( rule__New__Group__0__Impl rule__New__Group__1 )
            // InternalMiniJava.g:2297:2: rule__New__Group__0__Impl rule__New__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__New__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group__1();

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
    // $ANTLR end "rule__New__Group__0"


    // $ANTLR start "rule__New__Group__0__Impl"
    // InternalMiniJava.g:2304:1: rule__New__Group__0__Impl : ( 'new' ) ;
    public final void rule__New__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2308:1: ( ( 'new' ) )
            // InternalMiniJava.g:2309:1: ( 'new' )
            {
            // InternalMiniJava.g:2309:1: ( 'new' )
            // InternalMiniJava.g:2310:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getNewKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getNewKeyword_0()); 
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
    // $ANTLR end "rule__New__Group__0__Impl"


    // $ANTLR start "rule__New__Group__1"
    // InternalMiniJava.g:2319:1: rule__New__Group__1 : rule__New__Group__1__Impl rule__New__Group__2 ;
    public final void rule__New__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2323:1: ( rule__New__Group__1__Impl rule__New__Group__2 )
            // InternalMiniJava.g:2324:2: rule__New__Group__1__Impl rule__New__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__New__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group__2();

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
    // $ANTLR end "rule__New__Group__1"


    // $ANTLR start "rule__New__Group__1__Impl"
    // InternalMiniJava.g:2331:1: rule__New__Group__1__Impl : ( ( rule__New__TypeAssignment_1 ) ) ;
    public final void rule__New__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2335:1: ( ( ( rule__New__TypeAssignment_1 ) ) )
            // InternalMiniJava.g:2336:1: ( ( rule__New__TypeAssignment_1 ) )
            {
            // InternalMiniJava.g:2336:1: ( ( rule__New__TypeAssignment_1 ) )
            // InternalMiniJava.g:2337:2: ( rule__New__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getTypeAssignment_1()); 
            }
            // InternalMiniJava.g:2338:2: ( rule__New__TypeAssignment_1 )
            // InternalMiniJava.g:2338:3: rule__New__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__New__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__New__Group__1__Impl"


    // $ANTLR start "rule__New__Group__2"
    // InternalMiniJava.g:2346:1: rule__New__Group__2 : rule__New__Group__2__Impl rule__New__Group__3 ;
    public final void rule__New__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2350:1: ( rule__New__Group__2__Impl rule__New__Group__3 )
            // InternalMiniJava.g:2351:2: rule__New__Group__2__Impl rule__New__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__New__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group__3();

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
    // $ANTLR end "rule__New__Group__2"


    // $ANTLR start "rule__New__Group__2__Impl"
    // InternalMiniJava.g:2358:1: rule__New__Group__2__Impl : ( '(' ) ;
    public final void rule__New__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2362:1: ( ( '(' ) )
            // InternalMiniJava.g:2363:1: ( '(' )
            {
            // InternalMiniJava.g:2363:1: ( '(' )
            // InternalMiniJava.g:2364:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__New__Group__2__Impl"


    // $ANTLR start "rule__New__Group__3"
    // InternalMiniJava.g:2373:1: rule__New__Group__3 : rule__New__Group__3__Impl rule__New__Group__4 ;
    public final void rule__New__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2377:1: ( rule__New__Group__3__Impl rule__New__Group__4 )
            // InternalMiniJava.g:2378:2: rule__New__Group__3__Impl rule__New__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__New__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group__4();

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
    // $ANTLR end "rule__New__Group__3"


    // $ANTLR start "rule__New__Group__3__Impl"
    // InternalMiniJava.g:2385:1: rule__New__Group__3__Impl : ( ( rule__New__Group_3__0 )? ) ;
    public final void rule__New__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2389:1: ( ( ( rule__New__Group_3__0 )? ) )
            // InternalMiniJava.g:2390:1: ( ( rule__New__Group_3__0 )? )
            {
            // InternalMiniJava.g:2390:1: ( ( rule__New__Group_3__0 )? )
            // InternalMiniJava.g:2391:2: ( rule__New__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:2392:2: ( rule__New__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||(LA18_0>=14 && LA18_0<=15)||LA18_0==24||(LA18_0>=31 && LA18_0<=32)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:2392:3: rule__New__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__New__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getGroup_3()); 
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
    // $ANTLR end "rule__New__Group__3__Impl"


    // $ANTLR start "rule__New__Group__4"
    // InternalMiniJava.g:2400:1: rule__New__Group__4 : rule__New__Group__4__Impl ;
    public final void rule__New__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2404:1: ( rule__New__Group__4__Impl )
            // InternalMiniJava.g:2405:2: rule__New__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__New__Group__4__Impl();

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
    // $ANTLR end "rule__New__Group__4"


    // $ANTLR start "rule__New__Group__4__Impl"
    // InternalMiniJava.g:2411:1: rule__New__Group__4__Impl : ( ')' ) ;
    public final void rule__New__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2415:1: ( ( ')' ) )
            // InternalMiniJava.g:2416:1: ( ')' )
            {
            // InternalMiniJava.g:2416:1: ( ')' )
            // InternalMiniJava.g:2417:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__New__Group__4__Impl"


    // $ANTLR start "rule__New__Group_3__0"
    // InternalMiniJava.g:2427:1: rule__New__Group_3__0 : rule__New__Group_3__0__Impl rule__New__Group_3__1 ;
    public final void rule__New__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2431:1: ( rule__New__Group_3__0__Impl rule__New__Group_3__1 )
            // InternalMiniJava.g:2432:2: rule__New__Group_3__0__Impl rule__New__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__New__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group_3__1();

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
    // $ANTLR end "rule__New__Group_3__0"


    // $ANTLR start "rule__New__Group_3__0__Impl"
    // InternalMiniJava.g:2439:1: rule__New__Group_3__0__Impl : ( ( rule__New__ArgsAssignment_3_0 ) ) ;
    public final void rule__New__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2443:1: ( ( ( rule__New__ArgsAssignment_3_0 ) ) )
            // InternalMiniJava.g:2444:1: ( ( rule__New__ArgsAssignment_3_0 ) )
            {
            // InternalMiniJava.g:2444:1: ( ( rule__New__ArgsAssignment_3_0 ) )
            // InternalMiniJava.g:2445:2: ( rule__New__ArgsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsAssignment_3_0()); 
            }
            // InternalMiniJava.g:2446:2: ( rule__New__ArgsAssignment_3_0 )
            // InternalMiniJava.g:2446:3: rule__New__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__New__ArgsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getArgsAssignment_3_0()); 
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
    // $ANTLR end "rule__New__Group_3__0__Impl"


    // $ANTLR start "rule__New__Group_3__1"
    // InternalMiniJava.g:2454:1: rule__New__Group_3__1 : rule__New__Group_3__1__Impl ;
    public final void rule__New__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2458:1: ( rule__New__Group_3__1__Impl )
            // InternalMiniJava.g:2459:2: rule__New__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__New__Group_3__1__Impl();

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
    // $ANTLR end "rule__New__Group_3__1"


    // $ANTLR start "rule__New__Group_3__1__Impl"
    // InternalMiniJava.g:2465:1: rule__New__Group_3__1__Impl : ( ( rule__New__Group_3_1__0 )* ) ;
    public final void rule__New__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2469:1: ( ( ( rule__New__Group_3_1__0 )* ) )
            // InternalMiniJava.g:2470:1: ( ( rule__New__Group_3_1__0 )* )
            {
            // InternalMiniJava.g:2470:1: ( ( rule__New__Group_3_1__0 )* )
            // InternalMiniJava.g:2471:2: ( rule__New__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup_3_1()); 
            }
            // InternalMiniJava.g:2472:2: ( rule__New__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:2472:3: rule__New__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__New__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__New__Group_3__1__Impl"


    // $ANTLR start "rule__New__Group_3_1__0"
    // InternalMiniJava.g:2481:1: rule__New__Group_3_1__0 : rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1 ;
    public final void rule__New__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2485:1: ( rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1 )
            // InternalMiniJava.g:2486:2: rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1
            {
            pushFollow(FOLLOW_22);
            rule__New__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__New__Group_3_1__1();

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
    // $ANTLR end "rule__New__Group_3_1__0"


    // $ANTLR start "rule__New__Group_3_1__0__Impl"
    // InternalMiniJava.g:2493:1: rule__New__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__New__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2497:1: ( ( ',' ) )
            // InternalMiniJava.g:2498:1: ( ',' )
            {
            // InternalMiniJava.g:2498:1: ( ',' )
            // InternalMiniJava.g:2499:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__New__Group_3_1__0__Impl"


    // $ANTLR start "rule__New__Group_3_1__1"
    // InternalMiniJava.g:2508:1: rule__New__Group_3_1__1 : rule__New__Group_3_1__1__Impl ;
    public final void rule__New__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2512:1: ( rule__New__Group_3_1__1__Impl )
            // InternalMiniJava.g:2513:2: rule__New__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__New__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__New__Group_3_1__1"


    // $ANTLR start "rule__New__Group_3_1__1__Impl"
    // InternalMiniJava.g:2519:1: rule__New__Group_3_1__1__Impl : ( ( rule__New__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__New__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2523:1: ( ( ( rule__New__ArgsAssignment_3_1_1 ) ) )
            // InternalMiniJava.g:2524:1: ( ( rule__New__ArgsAssignment_3_1_1 ) )
            {
            // InternalMiniJava.g:2524:1: ( ( rule__New__ArgsAssignment_3_1_1 ) )
            // InternalMiniJava.g:2525:2: ( rule__New__ArgsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsAssignment_3_1_1()); 
            }
            // InternalMiniJava.g:2526:2: ( rule__New__ArgsAssignment_3_1_1 )
            // InternalMiniJava.g:2526:3: rule__New__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__New__ArgsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getArgsAssignment_3_1_1()); 
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
    // $ANTLR end "rule__New__Group_3_1__1__Impl"


    // $ANTLR start "rule__Cast__Group__0"
    // InternalMiniJava.g:2535:1: rule__Cast__Group__0 : rule__Cast__Group__0__Impl rule__Cast__Group__1 ;
    public final void rule__Cast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2539:1: ( rule__Cast__Group__0__Impl rule__Cast__Group__1 )
            // InternalMiniJava.g:2540:2: rule__Cast__Group__0__Impl rule__Cast__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Cast__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cast__Group__1();

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
    // $ANTLR end "rule__Cast__Group__0"


    // $ANTLR start "rule__Cast__Group__0__Impl"
    // InternalMiniJava.g:2547:1: rule__Cast__Group__0__Impl : ( ( '(' ) ) ;
    public final void rule__Cast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2551:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:2552:1: ( ( '(' ) )
            {
            // InternalMiniJava.g:2552:1: ( ( '(' ) )
            // InternalMiniJava.g:2553:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0()); 
            }
            // InternalMiniJava.g:2554:2: ( '(' )
            // InternalMiniJava.g:2554:3: '('
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Cast__Group__0__Impl"


    // $ANTLR start "rule__Cast__Group__1"
    // InternalMiniJava.g:2562:1: rule__Cast__Group__1 : rule__Cast__Group__1__Impl rule__Cast__Group__2 ;
    public final void rule__Cast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2566:1: ( rule__Cast__Group__1__Impl rule__Cast__Group__2 )
            // InternalMiniJava.g:2567:2: rule__Cast__Group__1__Impl rule__Cast__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Cast__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cast__Group__2();

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
    // $ANTLR end "rule__Cast__Group__1"


    // $ANTLR start "rule__Cast__Group__1__Impl"
    // InternalMiniJava.g:2574:1: rule__Cast__Group__1__Impl : ( ( rule__Cast__TypeAssignment_1 ) ) ;
    public final void rule__Cast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2578:1: ( ( ( rule__Cast__TypeAssignment_1 ) ) )
            // InternalMiniJava.g:2579:1: ( ( rule__Cast__TypeAssignment_1 ) )
            {
            // InternalMiniJava.g:2579:1: ( ( rule__Cast__TypeAssignment_1 ) )
            // InternalMiniJava.g:2580:2: ( rule__Cast__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getTypeAssignment_1()); 
            }
            // InternalMiniJava.g:2581:2: ( rule__Cast__TypeAssignment_1 )
            // InternalMiniJava.g:2581:3: rule__Cast__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cast__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Cast__Group__1__Impl"


    // $ANTLR start "rule__Cast__Group__2"
    // InternalMiniJava.g:2589:1: rule__Cast__Group__2 : rule__Cast__Group__2__Impl rule__Cast__Group__3 ;
    public final void rule__Cast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2593:1: ( rule__Cast__Group__2__Impl rule__Cast__Group__3 )
            // InternalMiniJava.g:2594:2: rule__Cast__Group__2__Impl rule__Cast__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Cast__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Cast__Group__3();

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
    // $ANTLR end "rule__Cast__Group__2"


    // $ANTLR start "rule__Cast__Group__2__Impl"
    // InternalMiniJava.g:2601:1: rule__Cast__Group__2__Impl : ( ')' ) ;
    public final void rule__Cast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2605:1: ( ( ')' ) )
            // InternalMiniJava.g:2606:1: ( ')' )
            {
            // InternalMiniJava.g:2606:1: ( ')' )
            // InternalMiniJava.g:2607:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Cast__Group__2__Impl"


    // $ANTLR start "rule__Cast__Group__3"
    // InternalMiniJava.g:2616:1: rule__Cast__Group__3 : rule__Cast__Group__3__Impl ;
    public final void rule__Cast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2620:1: ( rule__Cast__Group__3__Impl )
            // InternalMiniJava.g:2621:2: rule__Cast__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cast__Group__3__Impl();

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
    // $ANTLR end "rule__Cast__Group__3"


    // $ANTLR start "rule__Cast__Group__3__Impl"
    // InternalMiniJava.g:2627:1: rule__Cast__Group__3__Impl : ( ( rule__Cast__ObjectAssignment_3 ) ) ;
    public final void rule__Cast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2631:1: ( ( ( rule__Cast__ObjectAssignment_3 ) ) )
            // InternalMiniJava.g:2632:1: ( ( rule__Cast__ObjectAssignment_3 ) )
            {
            // InternalMiniJava.g:2632:1: ( ( rule__Cast__ObjectAssignment_3 ) )
            // InternalMiniJava.g:2633:2: ( rule__Cast__ObjectAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getObjectAssignment_3()); 
            }
            // InternalMiniJava.g:2634:2: ( rule__Cast__ObjectAssignment_3 )
            // InternalMiniJava.g:2634:3: rule__Cast__ObjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cast__ObjectAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getObjectAssignment_3()); 
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
    // $ANTLR end "rule__Cast__Group__3__Impl"


    // $ANTLR start "rule__Paren__Group__0"
    // InternalMiniJava.g:2643:1: rule__Paren__Group__0 : rule__Paren__Group__0__Impl rule__Paren__Group__1 ;
    public final void rule__Paren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2647:1: ( rule__Paren__Group__0__Impl rule__Paren__Group__1 )
            // InternalMiniJava.g:2648:2: rule__Paren__Group__0__Impl rule__Paren__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Paren__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Paren__Group__1();

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
    // $ANTLR end "rule__Paren__Group__0"


    // $ANTLR start "rule__Paren__Group__0__Impl"
    // InternalMiniJava.g:2655:1: rule__Paren__Group__0__Impl : ( '(' ) ;
    public final void rule__Paren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2659:1: ( ( '(' ) )
            // InternalMiniJava.g:2660:1: ( '(' )
            {
            // InternalMiniJava.g:2660:1: ( '(' )
            // InternalMiniJava.g:2661:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Paren__Group__0__Impl"


    // $ANTLR start "rule__Paren__Group__1"
    // InternalMiniJava.g:2670:1: rule__Paren__Group__1 : rule__Paren__Group__1__Impl rule__Paren__Group__2 ;
    public final void rule__Paren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2674:1: ( rule__Paren__Group__1__Impl rule__Paren__Group__2 )
            // InternalMiniJava.g:2675:2: rule__Paren__Group__1__Impl rule__Paren__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Paren__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Paren__Group__2();

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
    // $ANTLR end "rule__Paren__Group__1"


    // $ANTLR start "rule__Paren__Group__1__Impl"
    // InternalMiniJava.g:2682:1: rule__Paren__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Paren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2686:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:2687:1: ( ruleExpression )
            {
            // InternalMiniJava.g:2687:1: ( ruleExpression )
            // InternalMiniJava.g:2688:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenAccess().getExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Paren__Group__1__Impl"


    // $ANTLR start "rule__Paren__Group__2"
    // InternalMiniJava.g:2697:1: rule__Paren__Group__2 : rule__Paren__Group__2__Impl ;
    public final void rule__Paren__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2701:1: ( rule__Paren__Group__2__Impl )
            // InternalMiniJava.g:2702:2: rule__Paren__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paren__Group__2__Impl();

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
    // $ANTLR end "rule__Paren__Group__2"


    // $ANTLR start "rule__Paren__Group__2__Impl"
    // InternalMiniJava.g:2708:1: rule__Paren__Group__2__Impl : ( ')' ) ;
    public final void rule__Paren__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2712:1: ( ( ')' ) )
            // InternalMiniJava.g:2713:1: ( ')' )
            {
            // InternalMiniJava.g:2713:1: ( ')' )
            // InternalMiniJava.g:2714:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Paren__Group__2__Impl"


    // $ANTLR start "rule__Program__ClassesAssignment_1"
    // InternalMiniJava.g:2724:1: rule__Program__ClassesAssignment_1 : ( ruleClass ) ;
    public final void rule__Program__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2728:1: ( ( ruleClass ) )
            // InternalMiniJava.g:2729:2: ( ruleClass )
            {
            // InternalMiniJava.g:2729:2: ( ruleClass )
            // InternalMiniJava.g:2730:3: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Program__ClassesAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalMiniJava.g:2739:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2743:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2744:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2744:2: ( RULE_ID )
            // InternalMiniJava.g:2745:3: RULE_ID
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


    // $ANTLR start "rule__Class__ExtendsAssignment_2_1"
    // InternalMiniJava.g:2754:1: rule__Class__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2758:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2759:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2759:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2760:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsClassCrossReference_2_1_0()); 
            }
            // InternalMiniJava.g:2761:3: ( RULE_ID )
            // InternalMiniJava.g:2762:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsClassIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsClassIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsClassCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Class__ExtendsAssignment_2_1"


    // $ANTLR start "rule__Class__FieldsAssignment_4"
    // InternalMiniJava.g:2773:1: rule__Class__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2777:1: ( ( ruleField ) )
            // InternalMiniJava.g:2778:2: ( ruleField )
            {
            // InternalMiniJava.g:2778:2: ( ruleField )
            // InternalMiniJava.g:2779:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Class__FieldsAssignment_4"


    // $ANTLR start "rule__Class__MethodsAssignment_5"
    // InternalMiniJava.g:2788:1: rule__Class__MethodsAssignment_5 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2792:1: ( ( ruleMethod ) )
            // InternalMiniJava.g:2793:2: ( ruleMethod )
            {
            // InternalMiniJava.g:2793:2: ( ruleMethod )
            // InternalMiniJava.g:2794:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Class__MethodsAssignment_5"


    // $ANTLR start "rule__Class__MainAssignment_6"
    // InternalMiniJava.g:2803:1: rule__Class__MainAssignment_6 : ( ruleMain ) ;
    public final void rule__Class__MainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2807:1: ( ( ruleMain ) )
            // InternalMiniJava.g:2808:2: ( ruleMain )
            {
            // InternalMiniJava.g:2808:2: ( ruleMain )
            // InternalMiniJava.g:2809:3: ruleMain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMainMainParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getMainMainParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Class__MainAssignment_6"


    // $ANTLR start "rule__Main__BodyAssignment_10"
    // InternalMiniJava.g:2818:1: rule__Main__BodyAssignment_10 : ( ruleMethodBody ) ;
    public final void rule__Main__BodyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2822:1: ( ( ruleMethodBody ) )
            // InternalMiniJava.g:2823:2: ( ruleMethodBody )
            {
            // InternalMiniJava.g:2823:2: ( ruleMethodBody )
            // InternalMiniJava.g:2824:3: ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getBodyMethodBodyParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getBodyMethodBodyParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__Main__BodyAssignment_10"


    // $ANTLR start "rule__BasicType__BasicAssignment"
    // InternalMiniJava.g:2833:1: rule__BasicType__BasicAssignment : ( ( rule__BasicType__BasicAlternatives_0 ) ) ;
    public final void rule__BasicType__BasicAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2837:1: ( ( ( rule__BasicType__BasicAlternatives_0 ) ) )
            // InternalMiniJava.g:2838:2: ( ( rule__BasicType__BasicAlternatives_0 ) )
            {
            // InternalMiniJava.g:2838:2: ( ( rule__BasicType__BasicAlternatives_0 ) )
            // InternalMiniJava.g:2839:3: ( rule__BasicType__BasicAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBasicAlternatives_0()); 
            }
            // InternalMiniJava.g:2840:3: ( rule__BasicType__BasicAlternatives_0 )
            // InternalMiniJava.g:2840:4: rule__BasicType__BasicAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__BasicAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getBasicAlternatives_0()); 
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
    // $ANTLR end "rule__BasicType__BasicAssignment"


    // $ANTLR start "rule__ClassType__ClassrefAssignment"
    // InternalMiniJava.g:2848:1: rule__ClassType__ClassrefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__ClassrefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2852:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2853:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2853:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2854:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassrefClassCrossReference_0()); 
            }
            // InternalMiniJava.g:2855:3: ( RULE_ID )
            // InternalMiniJava.g:2856:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassrefClassIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassrefClassIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassrefClassCrossReference_0()); 
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
    // $ANTLR end "rule__ClassType__ClassrefAssignment"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalMiniJava.g:2867:1: rule__Field__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2871:1: ( ( ruleType ) )
            // InternalMiniJava.g:2872:2: ( ruleType )
            {
            // InternalMiniJava.g:2872:2: ( ruleType )
            // InternalMiniJava.g:2873:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalMiniJava.g:2882:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2886:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2887:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2887:2: ( RULE_ID )
            // InternalMiniJava.g:2888:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMiniJava.g:2897:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2901:1: ( ( ruleType ) )
            // InternalMiniJava.g:2902:2: ( ruleType )
            {
            // InternalMiniJava.g:2902:2: ( ruleType )
            // InternalMiniJava.g:2903:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMiniJava.g:2912:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2916:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2917:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2917:2: ( RULE_ID )
            // InternalMiniJava.g:2918:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Method__ReturntypeAssignment_0"
    // InternalMiniJava.g:2927:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2931:1: ( ( ruleType ) )
            // InternalMiniJava.g:2932:2: ( ruleType )
            {
            // InternalMiniJava.g:2932:2: ( ruleType )
            // InternalMiniJava.g:2933:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Method__ReturntypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalMiniJava.g:2942:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2946:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2947:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2947:2: ( RULE_ID )
            // InternalMiniJava.g:2948:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParamsAssignment_3_0"
    // InternalMiniJava.g:2957:1: rule__Method__ParamsAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2961:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:2962:2: ( ruleParameter )
            {
            // InternalMiniJava.g:2962:2: ( ruleParameter )
            // InternalMiniJava.g:2963:3: ruleParameter
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
    // InternalMiniJava.g:2972:1: rule__Method__ParamsAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2976:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:2977:2: ( ruleParameter )
            {
            // InternalMiniJava.g:2977:2: ( ruleParameter )
            // InternalMiniJava.g:2978:3: ruleParameter
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
    // InternalMiniJava.g:2987:1: rule__Method__BodyAssignment_5 : ( ruleMethodBody ) ;
    public final void rule__Method__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2991:1: ( ( ruleMethodBody ) )
            // InternalMiniJava.g:2992:2: ( ruleMethodBody )
            {
            // InternalMiniJava.g:2992:2: ( ruleMethodBody )
            // InternalMiniJava.g:2993:3: ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_5_0()); 
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


    // $ANTLR start "rule__MethodBody__ExpressionAssignment_1"
    // InternalMiniJava.g:3002:1: rule__MethodBody__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__MethodBody__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3006:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3007:2: ( ruleExpression )
            {
            // InternalMiniJava.g:3007:2: ( ruleExpression )
            // InternalMiniJava.g:3008:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MethodBody__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__MessageAssignment_1_2"
    // InternalMiniJava.g:3017:1: rule__Expression__MessageAssignment_1_2 : ( ruleMessage ) ;
    public final void rule__Expression__MessageAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3021:1: ( ( ruleMessage ) )
            // InternalMiniJava.g:3022:2: ( ruleMessage )
            {
            // InternalMiniJava.g:3022:2: ( ruleMessage )
            // InternalMiniJava.g:3023:3: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMessageMessageParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getMessageMessageParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Expression__MessageAssignment_1_2"


    // $ANTLR start "rule__MethodCall__NameAssignment_0"
    // InternalMiniJava.g:3032:1: rule__MethodCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3036:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:3037:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:3037:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:3038:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameMethodCrossReference_0_0()); 
            }
            // InternalMiniJava.g:3039:3: ( RULE_ID )
            // InternalMiniJava.g:3040:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameMethodIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameMethodIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameMethodCrossReference_0_0()); 
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
    // $ANTLR end "rule__MethodCall__NameAssignment_0"


    // $ANTLR start "rule__MethodCall__ArgsAssignment_2_0"
    // InternalMiniJava.g:3051:1: rule__MethodCall__ArgsAssignment_2_0 : ( ruleArgument ) ;
    public final void rule__MethodCall__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3055:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:3056:2: ( ruleArgument )
            {
            // InternalMiniJava.g:3056:2: ( ruleArgument )
            // InternalMiniJava.g:3057:3: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__MethodCall__ArgsAssignment_2_0"


    // $ANTLR start "rule__MethodCall__ArgsAssignment_2_1_1"
    // InternalMiniJava.g:3066:1: rule__MethodCall__ArgsAssignment_2_1_1 : ( ruleArgument ) ;
    public final void rule__MethodCall__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3070:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:3071:2: ( ruleArgument )
            {
            // InternalMiniJava.g:3071:2: ( ruleArgument )
            // InternalMiniJava.g:3072:3: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getArgsArgumentParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__MethodCall__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__FieldSelection__NameAssignment"
    // InternalMiniJava.g:3081:1: rule__FieldSelection__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FieldSelection__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3085:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:3086:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:3086:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:3087:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionAccess().getNameFieldCrossReference_0()); 
            }
            // InternalMiniJava.g:3088:3: ( RULE_ID )
            // InternalMiniJava.g:3089:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionAccess().getNameFieldIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectionAccess().getNameFieldIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectionAccess().getNameFieldCrossReference_0()); 
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
    // $ANTLR end "rule__FieldSelection__NameAssignment"


    // $ANTLR start "rule__This__VariableAssignment"
    // InternalMiniJava.g:3100:1: rule__This__VariableAssignment : ( ( 'this' ) ) ;
    public final void rule__This__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3104:1: ( ( ( 'this' ) ) )
            // InternalMiniJava.g:3105:2: ( ( 'this' ) )
            {
            // InternalMiniJava.g:3105:2: ( ( 'this' ) )
            // InternalMiniJava.g:3106:3: ( 'this' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            }
            // InternalMiniJava.g:3107:3: ( 'this' )
            // InternalMiniJava.g:3108:4: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
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
    // $ANTLR end "rule__This__VariableAssignment"


    // $ANTLR start "rule__Variable__ParamrefAssignment"
    // InternalMiniJava.g:3119:1: rule__Variable__ParamrefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Variable__ParamrefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3123:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:3124:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:3124:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:3125:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getParamrefParameterCrossReference_0()); 
            }
            // InternalMiniJava.g:3126:3: ( RULE_ID )
            // InternalMiniJava.g:3127:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getParamrefParameterIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getParamrefParameterIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getParamrefParameterCrossReference_0()); 
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
    // $ANTLR end "rule__Variable__ParamrefAssignment"


    // $ANTLR start "rule__New__TypeAssignment_1"
    // InternalMiniJava.g:3138:1: rule__New__TypeAssignment_1 : ( ruleClassType ) ;
    public final void rule__New__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3142:1: ( ( ruleClassType ) )
            // InternalMiniJava.g:3143:2: ( ruleClassType )
            {
            // InternalMiniJava.g:3143:2: ( ruleClassType )
            // InternalMiniJava.g:3144:3: ruleClassType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getTypeClassTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getTypeClassTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__New__TypeAssignment_1"


    // $ANTLR start "rule__New__ArgsAssignment_3_0"
    // InternalMiniJava.g:3153:1: rule__New__ArgsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__New__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3157:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:3158:2: ( ruleArgument )
            {
            // InternalMiniJava.g:3158:2: ( ruleArgument )
            // InternalMiniJava.g:3159:3: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__New__ArgsAssignment_3_0"


    // $ANTLR start "rule__New__ArgsAssignment_3_1_1"
    // InternalMiniJava.g:3168:1: rule__New__ArgsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__New__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3172:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:3173:2: ( ruleArgument )
            {
            // InternalMiniJava.g:3173:2: ( ruleArgument )
            // InternalMiniJava.g:3174:3: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewAccess().getArgsArgumentParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__New__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Cast__TypeAssignment_1"
    // InternalMiniJava.g:3183:1: rule__Cast__TypeAssignment_1 : ( ruleClassType ) ;
    public final void rule__Cast__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3187:1: ( ( ruleClassType ) )
            // InternalMiniJava.g:3188:2: ( ruleClassType )
            {
            // InternalMiniJava.g:3188:2: ( ruleClassType )
            // InternalMiniJava.g:3189:3: ruleClassType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getTypeClassTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getTypeClassTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Cast__TypeAssignment_1"


    // $ANTLR start "rule__Cast__ObjectAssignment_3"
    // InternalMiniJava.g:3198:1: rule__Cast__ObjectAssignment_3 : ( ruleTerminalExpression ) ;
    public final void rule__Cast__ObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3202:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:3203:2: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:3203:2: ( ruleTerminalExpression )
            // InternalMiniJava.g:3204:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getObjectTerminalExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastAccess().getObjectTerminalExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Cast__ObjectAssignment_3"


    // $ANTLR start "rule__StringConstant__ConstantAssignment"
    // InternalMiniJava.g:3213:1: rule__StringConstant__ConstantAssignment : ( RULE_STRING ) ;
    public final void rule__StringConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3217:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:3218:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:3218:2: ( RULE_STRING )
            // InternalMiniJava.g:3219:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringConstantAccess().getConstantSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringConstantAccess().getConstantSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringConstant__ConstantAssignment"


    // $ANTLR start "rule__IntConstant__ConstantAssignment"
    // InternalMiniJava.g:3228:1: rule__IntConstant__ConstantAssignment : ( RULE_INT ) ;
    public final void rule__IntConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3232:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:3233:2: ( RULE_INT )
            {
            // InternalMiniJava.g:3233:2: ( RULE_INT )
            // InternalMiniJava.g:3234:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntConstantAccess().getConstantINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntConstantAccess().getConstantINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__IntConstant__ConstantAssignment"


    // $ANTLR start "rule__BoolConstant__ConstantAssignment"
    // InternalMiniJava.g:3243:1: rule__BoolConstant__ConstantAssignment : ( ( rule__BoolConstant__ConstantAlternatives_0 ) ) ;
    public final void rule__BoolConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3247:1: ( ( ( rule__BoolConstant__ConstantAlternatives_0 ) ) )
            // InternalMiniJava.g:3248:2: ( ( rule__BoolConstant__ConstantAlternatives_0 ) )
            {
            // InternalMiniJava.g:3248:2: ( ( rule__BoolConstant__ConstantAlternatives_0 ) )
            // InternalMiniJava.g:3249:3: ( rule__BoolConstant__ConstantAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolConstantAccess().getConstantAlternatives_0()); 
            }
            // InternalMiniJava.g:3250:3: ( rule__BoolConstant__ConstantAlternatives_0 )
            // InternalMiniJava.g:3250:4: rule__BoolConstant__ConstantAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolConstant__ConstantAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolConstantAccess().getConstantAlternatives_0()); 
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
    // $ANTLR end "rule__BoolConstant__ConstantAssignment"

    // $ANTLR start synpred1_InternalMiniJava
    public final void synpred1_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:683:2: ( ( ruleClass ) )
        // InternalMiniJava.g:683:2: ( ruleClass )
        {
        // InternalMiniJava.g:683:2: ( ruleClass )
        // InternalMiniJava.g:684:3: ruleClass
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProgramAccess().getClassParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleClass();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMiniJava

    // $ANTLR start synpred10_InternalMiniJava
    public final void synpred10_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:791:2: ( ( ( ruleCast ) ) )
        // InternalMiniJava.g:791:2: ( ( ruleCast ) )
        {
        // InternalMiniJava.g:791:2: ( ( ruleCast ) )
        // InternalMiniJava.g:792:3: ( ruleCast )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
        }
        // InternalMiniJava.g:793:3: ( ruleCast )
        // InternalMiniJava.g:793:4: ruleCast
        {
        pushFollow(FOLLOW_2);
        ruleCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalMiniJava

    // Delegated rules

    public final boolean synpred10_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\40\3\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\3\uffff\1\4\1\6";
    static final String dfa_5s = "\4\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\5\7\uffff\2\5\10\uffff\1\4\6\uffff\1\3\1\1",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "768:1: rule__TerminalExpression__Alternatives : ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMiniJava()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000143810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008003810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000018100C070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000018900C070L});

}