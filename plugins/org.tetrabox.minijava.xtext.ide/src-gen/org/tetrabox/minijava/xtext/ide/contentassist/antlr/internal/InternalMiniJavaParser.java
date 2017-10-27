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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'String'", "'true'", "'false'", "'class'", "'{'", "'}'", "'extends'", "';'", "'('", "')'", "','", "'return'", "'.'", "'new'", "'this'"
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


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:79:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMiniJava.g:80:1: ( ruleType EOF )
            // InternalMiniJava.g:81:1: ruleType EOF
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
    // InternalMiniJava.g:88:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:92:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMiniJava.g:93:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMiniJava.g:93:2: ( ( rule__Type__Alternatives ) )
            // InternalMiniJava.g:94:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:95:3: ( rule__Type__Alternatives )
            // InternalMiniJava.g:95:4: rule__Type__Alternatives
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
    // InternalMiniJava.g:104:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalMiniJava.g:105:1: ( ruleBasicType EOF )
            // InternalMiniJava.g:106:1: ruleBasicType EOF
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
    // InternalMiniJava.g:113:1: ruleBasicType : ( ( rule__BasicType__BasicAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:117:2: ( ( ( rule__BasicType__BasicAssignment ) ) )
            // InternalMiniJava.g:118:2: ( ( rule__BasicType__BasicAssignment ) )
            {
            // InternalMiniJava.g:118:2: ( ( rule__BasicType__BasicAssignment ) )
            // InternalMiniJava.g:119:3: ( rule__BasicType__BasicAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBasicAssignment()); 
            }
            // InternalMiniJava.g:120:3: ( rule__BasicType__BasicAssignment )
            // InternalMiniJava.g:120:4: rule__BasicType__BasicAssignment
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
    // InternalMiniJava.g:129:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // InternalMiniJava.g:130:1: ( ruleClassType EOF )
            // InternalMiniJava.g:131:1: ruleClassType EOF
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
    // InternalMiniJava.g:138:1: ruleClassType : ( ( rule__ClassType__ClassrefAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:142:2: ( ( ( rule__ClassType__ClassrefAssignment ) ) )
            // InternalMiniJava.g:143:2: ( ( rule__ClassType__ClassrefAssignment ) )
            {
            // InternalMiniJava.g:143:2: ( ( rule__ClassType__ClassrefAssignment ) )
            // InternalMiniJava.g:144:3: ( rule__ClassType__ClassrefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassrefAssignment()); 
            }
            // InternalMiniJava.g:145:3: ( rule__ClassType__ClassrefAssignment )
            // InternalMiniJava.g:145:4: rule__ClassType__ClassrefAssignment
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


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:179:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMiniJava.g:180:1: ( ruleField EOF )
            // InternalMiniJava.g:181:1: ruleField EOF
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
    // InternalMiniJava.g:188:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:192:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMiniJava.g:193:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMiniJava.g:193:2: ( ( rule__Field__Group__0 ) )
            // InternalMiniJava.g:194:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalMiniJava.g:195:3: ( rule__Field__Group__0 )
            // InternalMiniJava.g:195:4: rule__Field__Group__0
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
    // InternalMiniJava.g:204:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:205:1: ( ruleParameter EOF )
            // InternalMiniJava.g:206:1: ruleParameter EOF
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
    // InternalMiniJava.g:213:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:217:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMiniJava.g:218:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMiniJava.g:218:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMiniJava.g:219:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalMiniJava.g:220:3: ( rule__Parameter__Group__0 )
            // InternalMiniJava.g:220:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleMethodBody"
    // InternalMiniJava.g:254:1: entryRuleMethodBody : ruleMethodBody EOF ;
    public final void entryRuleMethodBody() throws RecognitionException {
        try {
            // InternalMiniJava.g:255:1: ( ruleMethodBody EOF )
            // InternalMiniJava.g:256:1: ruleMethodBody EOF
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
    // InternalMiniJava.g:263:1: ruleMethodBody : ( ( rule__MethodBody__Group__0 ) ) ;
    public final void ruleMethodBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:267:2: ( ( ( rule__MethodBody__Group__0 ) ) )
            // InternalMiniJava.g:268:2: ( ( rule__MethodBody__Group__0 ) )
            {
            // InternalMiniJava.g:268:2: ( ( rule__MethodBody__Group__0 ) )
            // InternalMiniJava.g:269:3: ( rule__MethodBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getGroup()); 
            }
            // InternalMiniJava.g:270:3: ( rule__MethodBody__Group__0 )
            // InternalMiniJava.g:270:4: rule__MethodBody__Group__0
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
    // InternalMiniJava.g:279:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:280:1: ( ruleExpression EOF )
            // InternalMiniJava.g:281:1: ruleExpression EOF
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
    // InternalMiniJava.g:288:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:292:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMiniJava.g:293:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMiniJava.g:293:2: ( ( rule__Expression__Group__0 ) )
            // InternalMiniJava.g:294:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalMiniJava.g:295:3: ( rule__Expression__Group__0 )
            // InternalMiniJava.g:295:4: rule__Expression__Group__0
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
    // InternalMiniJava.g:304:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMiniJava.g:305:1: ( ruleMessage EOF )
            // InternalMiniJava.g:306:1: ruleMessage EOF
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
    // InternalMiniJava.g:313:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:317:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalMiniJava.g:318:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalMiniJava.g:318:2: ( ( rule__Message__Alternatives ) )
            // InternalMiniJava.g:319:3: ( rule__Message__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:320:3: ( rule__Message__Alternatives )
            // InternalMiniJava.g:320:4: rule__Message__Alternatives
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
    // InternalMiniJava.g:329:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMiniJava.g:330:1: ( ruleMethodCall EOF )
            // InternalMiniJava.g:331:1: ruleMethodCall EOF
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
    // InternalMiniJava.g:338:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:342:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMiniJava.g:343:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMiniJava.g:343:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMiniJava.g:344:3: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // InternalMiniJava.g:345:3: ( rule__MethodCall__Group__0 )
            // InternalMiniJava.g:345:4: rule__MethodCall__Group__0
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
    // InternalMiniJava.g:354:1: entryRuleFieldSelection : ruleFieldSelection EOF ;
    public final void entryRuleFieldSelection() throws RecognitionException {
        try {
            // InternalMiniJava.g:355:1: ( ruleFieldSelection EOF )
            // InternalMiniJava.g:356:1: ruleFieldSelection EOF
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
    // InternalMiniJava.g:363:1: ruleFieldSelection : ( ( rule__FieldSelection__NameAssignment ) ) ;
    public final void ruleFieldSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:367:2: ( ( ( rule__FieldSelection__NameAssignment ) ) )
            // InternalMiniJava.g:368:2: ( ( rule__FieldSelection__NameAssignment ) )
            {
            // InternalMiniJava.g:368:2: ( ( rule__FieldSelection__NameAssignment ) )
            // InternalMiniJava.g:369:3: ( rule__FieldSelection__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionAccess().getNameAssignment()); 
            }
            // InternalMiniJava.g:370:3: ( rule__FieldSelection__NameAssignment )
            // InternalMiniJava.g:370:4: rule__FieldSelection__NameAssignment
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
    // InternalMiniJava.g:379:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:380:1: ( ruleTerminalExpression EOF )
            // InternalMiniJava.g:381:1: ruleTerminalExpression EOF
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
    // InternalMiniJava.g:388:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:392:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalMiniJava.g:393:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalMiniJava.g:393:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalMiniJava.g:394:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:395:3: ( rule__TerminalExpression__Alternatives )
            // InternalMiniJava.g:395:4: rule__TerminalExpression__Alternatives
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
    // InternalMiniJava.g:404:1: entryRuleThis : ruleThis EOF ;
    public final void entryRuleThis() throws RecognitionException {
        try {
            // InternalMiniJava.g:405:1: ( ruleThis EOF )
            // InternalMiniJava.g:406:1: ruleThis EOF
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
    // InternalMiniJava.g:413:1: ruleThis : ( ( rule__This__VariableAssignment ) ) ;
    public final void ruleThis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:417:2: ( ( ( rule__This__VariableAssignment ) ) )
            // InternalMiniJava.g:418:2: ( ( rule__This__VariableAssignment ) )
            {
            // InternalMiniJava.g:418:2: ( ( rule__This__VariableAssignment ) )
            // InternalMiniJava.g:419:3: ( rule__This__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableAssignment()); 
            }
            // InternalMiniJava.g:420:3: ( rule__This__VariableAssignment )
            // InternalMiniJava.g:420:4: rule__This__VariableAssignment
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
    // InternalMiniJava.g:429:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMiniJava.g:430:1: ( ruleVariable EOF )
            // InternalMiniJava.g:431:1: ruleVariable EOF
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
    // InternalMiniJava.g:438:1: ruleVariable : ( ( rule__Variable__ParamrefAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:442:2: ( ( ( rule__Variable__ParamrefAssignment ) ) )
            // InternalMiniJava.g:443:2: ( ( rule__Variable__ParamrefAssignment ) )
            {
            // InternalMiniJava.g:443:2: ( ( rule__Variable__ParamrefAssignment ) )
            // InternalMiniJava.g:444:3: ( rule__Variable__ParamrefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getParamrefAssignment()); 
            }
            // InternalMiniJava.g:445:3: ( rule__Variable__ParamrefAssignment )
            // InternalMiniJava.g:445:4: rule__Variable__ParamrefAssignment
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
    // InternalMiniJava.g:454:1: entryRuleNew : ruleNew EOF ;
    public final void entryRuleNew() throws RecognitionException {
        try {
            // InternalMiniJava.g:455:1: ( ruleNew EOF )
            // InternalMiniJava.g:456:1: ruleNew EOF
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
    // InternalMiniJava.g:463:1: ruleNew : ( ( rule__New__Group__0 ) ) ;
    public final void ruleNew() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:467:2: ( ( ( rule__New__Group__0 ) ) )
            // InternalMiniJava.g:468:2: ( ( rule__New__Group__0 ) )
            {
            // InternalMiniJava.g:468:2: ( ( rule__New__Group__0 ) )
            // InternalMiniJava.g:469:3: ( rule__New__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup()); 
            }
            // InternalMiniJava.g:470:3: ( rule__New__Group__0 )
            // InternalMiniJava.g:470:4: rule__New__Group__0
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
    // InternalMiniJava.g:479:1: entryRuleCast : ruleCast EOF ;
    public final void entryRuleCast() throws RecognitionException {
        try {
            // InternalMiniJava.g:480:1: ( ruleCast EOF )
            // InternalMiniJava.g:481:1: ruleCast EOF
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
    // InternalMiniJava.g:488:1: ruleCast : ( ( rule__Cast__Group__0 ) ) ;
    public final void ruleCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:492:2: ( ( ( rule__Cast__Group__0 ) ) )
            // InternalMiniJava.g:493:2: ( ( rule__Cast__Group__0 ) )
            {
            // InternalMiniJava.g:493:2: ( ( rule__Cast__Group__0 ) )
            // InternalMiniJava.g:494:3: ( rule__Cast__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getGroup()); 
            }
            // InternalMiniJava.g:495:3: ( rule__Cast__Group__0 )
            // InternalMiniJava.g:495:4: rule__Cast__Group__0
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
    // InternalMiniJava.g:504:1: entryRuleParen : ruleParen EOF ;
    public final void entryRuleParen() throws RecognitionException {
        try {
            // InternalMiniJava.g:505:1: ( ruleParen EOF )
            // InternalMiniJava.g:506:1: ruleParen EOF
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
    // InternalMiniJava.g:513:1: ruleParen : ( ( rule__Paren__Group__0 ) ) ;
    public final void ruleParen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:517:2: ( ( ( rule__Paren__Group__0 ) ) )
            // InternalMiniJava.g:518:2: ( ( rule__Paren__Group__0 ) )
            {
            // InternalMiniJava.g:518:2: ( ( rule__Paren__Group__0 ) )
            // InternalMiniJava.g:519:3: ( rule__Paren__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getGroup()); 
            }
            // InternalMiniJava.g:520:3: ( rule__Paren__Group__0 )
            // InternalMiniJava.g:520:4: rule__Paren__Group__0
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
    // InternalMiniJava.g:529:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:530:1: ( ruleConstant EOF )
            // InternalMiniJava.g:531:1: ruleConstant EOF
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
    // InternalMiniJava.g:538:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:542:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalMiniJava.g:543:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalMiniJava.g:543:2: ( ( rule__Constant__Alternatives ) )
            // InternalMiniJava.g:544:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:545:3: ( rule__Constant__Alternatives )
            // InternalMiniJava.g:545:4: rule__Constant__Alternatives
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
    // InternalMiniJava.g:554:1: entryRuleStringConstant : ruleStringConstant EOF ;
    public final void entryRuleStringConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:555:1: ( ruleStringConstant EOF )
            // InternalMiniJava.g:556:1: ruleStringConstant EOF
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
    // InternalMiniJava.g:563:1: ruleStringConstant : ( ( rule__StringConstant__ConstantAssignment ) ) ;
    public final void ruleStringConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:567:2: ( ( ( rule__StringConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:568:2: ( ( rule__StringConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:568:2: ( ( rule__StringConstant__ConstantAssignment ) )
            // InternalMiniJava.g:569:3: ( rule__StringConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:570:3: ( rule__StringConstant__ConstantAssignment )
            // InternalMiniJava.g:570:4: rule__StringConstant__ConstantAssignment
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
    // InternalMiniJava.g:579:1: entryRuleIntConstant : ruleIntConstant EOF ;
    public final void entryRuleIntConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:580:1: ( ruleIntConstant EOF )
            // InternalMiniJava.g:581:1: ruleIntConstant EOF
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
    // InternalMiniJava.g:588:1: ruleIntConstant : ( ( rule__IntConstant__ConstantAssignment ) ) ;
    public final void ruleIntConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:592:2: ( ( ( rule__IntConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:593:2: ( ( rule__IntConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:593:2: ( ( rule__IntConstant__ConstantAssignment ) )
            // InternalMiniJava.g:594:3: ( rule__IntConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:595:3: ( rule__IntConstant__ConstantAssignment )
            // InternalMiniJava.g:595:4: rule__IntConstant__ConstantAssignment
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
    // InternalMiniJava.g:604:1: entryRuleBoolConstant : ruleBoolConstant EOF ;
    public final void entryRuleBoolConstant() throws RecognitionException {
        try {
            // InternalMiniJava.g:605:1: ( ruleBoolConstant EOF )
            // InternalMiniJava.g:606:1: ruleBoolConstant EOF
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
    // InternalMiniJava.g:613:1: ruleBoolConstant : ( ( rule__BoolConstant__ConstantAssignment ) ) ;
    public final void ruleBoolConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:617:2: ( ( ( rule__BoolConstant__ConstantAssignment ) ) )
            // InternalMiniJava.g:618:2: ( ( rule__BoolConstant__ConstantAssignment ) )
            {
            // InternalMiniJava.g:618:2: ( ( rule__BoolConstant__ConstantAssignment ) )
            // InternalMiniJava.g:619:3: ( rule__BoolConstant__ConstantAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolConstantAccess().getConstantAssignment()); 
            }
            // InternalMiniJava.g:620:3: ( rule__BoolConstant__ConstantAssignment )
            // InternalMiniJava.g:620:4: rule__BoolConstant__ConstantAssignment
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
    // InternalMiniJava.g:629:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMiniJava.g:630:1: ( ruleArgument EOF )
            // InternalMiniJava.g:631:1: ruleArgument EOF
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
    // InternalMiniJava.g:638:1: ruleArgument : ( ruleExpression ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:642:2: ( ( ruleExpression ) )
            // InternalMiniJava.g:643:2: ( ruleExpression )
            {
            // InternalMiniJava.g:643:2: ( ruleExpression )
            // InternalMiniJava.g:644:3: ruleExpression
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMiniJava.g:653:1: rule__Type__Alternatives : ( ( ruleBasicType ) | ( ruleClassType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:657:1: ( ( ruleBasicType ) | ( ruleClassType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:658:2: ( ruleBasicType )
                    {
                    // InternalMiniJava.g:658:2: ( ruleBasicType )
                    // InternalMiniJava.g:659:3: ruleBasicType
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
                    // InternalMiniJava.g:664:2: ( ruleClassType )
                    {
                    // InternalMiniJava.g:664:2: ( ruleClassType )
                    // InternalMiniJava.g:665:3: ruleClassType
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
    // InternalMiniJava.g:674:1: rule__BasicType__BasicAlternatives_0 : ( ( 'int' ) | ( 'boolean' ) | ( 'String' ) );
    public final void rule__BasicType__BasicAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:678:1: ( ( 'int' ) | ( 'boolean' ) | ( 'String' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:679:2: ( 'int' )
                    {
                    // InternalMiniJava.g:679:2: ( 'int' )
                    // InternalMiniJava.g:680:3: 'int'
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
                    // InternalMiniJava.g:685:2: ( 'boolean' )
                    {
                    // InternalMiniJava.g:685:2: ( 'boolean' )
                    // InternalMiniJava.g:686:3: 'boolean'
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
                    // InternalMiniJava.g:691:2: ( 'String' )
                    {
                    // InternalMiniJava.g:691:2: ( 'String' )
                    // InternalMiniJava.g:692:3: 'String'
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
    // InternalMiniJava.g:701:1: rule__Message__Alternatives : ( ( ruleMethodCall ) | ( ruleFieldSelection ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:705:1: ( ( ruleMethodCall ) | ( ruleFieldSelection ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==20||(LA3_1>=22 && LA3_1<=23)||LA3_1==25) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:706:2: ( ruleMethodCall )
                    {
                    // InternalMiniJava.g:706:2: ( ruleMethodCall )
                    // InternalMiniJava.g:707:3: ruleMethodCall
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
                    // InternalMiniJava.g:712:2: ( ruleFieldSelection )
                    {
                    // InternalMiniJava.g:712:2: ( ruleFieldSelection )
                    // InternalMiniJava.g:713:3: ruleFieldSelection
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
    // InternalMiniJava.g:722:1: rule__TerminalExpression__Alternatives : ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:726:1: ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:727:2: ( ruleThis )
                    {
                    // InternalMiniJava.g:727:2: ( ruleThis )
                    // InternalMiniJava.g:728:3: ruleThis
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
                    // InternalMiniJava.g:733:2: ( ruleVariable )
                    {
                    // InternalMiniJava.g:733:2: ( ruleVariable )
                    // InternalMiniJava.g:734:3: ruleVariable
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
                    // InternalMiniJava.g:739:2: ( ruleNew )
                    {
                    // InternalMiniJava.g:739:2: ( ruleNew )
                    // InternalMiniJava.g:740:3: ruleNew
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
                    // InternalMiniJava.g:745:2: ( ( ruleCast ) )
                    {
                    // InternalMiniJava.g:745:2: ( ( ruleCast ) )
                    // InternalMiniJava.g:746:3: ( ruleCast )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
                    }
                    // InternalMiniJava.g:747:3: ( ruleCast )
                    // InternalMiniJava.g:747:4: ruleCast
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
                    // InternalMiniJava.g:751:2: ( ruleConstant )
                    {
                    // InternalMiniJava.g:751:2: ( ruleConstant )
                    // InternalMiniJava.g:752:3: ruleConstant
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
                    // InternalMiniJava.g:757:2: ( ruleParen )
                    {
                    // InternalMiniJava.g:757:2: ( ruleParen )
                    // InternalMiniJava.g:758:3: ruleParen
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
    // InternalMiniJava.g:767:1: rule__Constant__Alternatives : ( ( ruleIntConstant ) | ( ruleBoolConstant ) | ( ruleStringConstant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:771:1: ( ( ruleIntConstant ) | ( ruleBoolConstant ) | ( ruleStringConstant ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 14:
            case 15:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
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
                    // InternalMiniJava.g:772:2: ( ruleIntConstant )
                    {
                    // InternalMiniJava.g:772:2: ( ruleIntConstant )
                    // InternalMiniJava.g:773:3: ruleIntConstant
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
                    // InternalMiniJava.g:778:2: ( ruleBoolConstant )
                    {
                    // InternalMiniJava.g:778:2: ( ruleBoolConstant )
                    // InternalMiniJava.g:779:3: ruleBoolConstant
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
                    // InternalMiniJava.g:784:2: ( ruleStringConstant )
                    {
                    // InternalMiniJava.g:784:2: ( ruleStringConstant )
                    // InternalMiniJava.g:785:3: ruleStringConstant
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
    // InternalMiniJava.g:794:1: rule__BoolConstant__ConstantAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolConstant__ConstantAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:798:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
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
                    // InternalMiniJava.g:799:2: ( 'true' )
                    {
                    // InternalMiniJava.g:799:2: ( 'true' )
                    // InternalMiniJava.g:800:3: 'true'
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
                    // InternalMiniJava.g:805:2: ( 'false' )
                    {
                    // InternalMiniJava.g:805:2: ( 'false' )
                    // InternalMiniJava.g:806:3: 'false'
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:815:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:819:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:820:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalMiniJava.g:827:1: rule__Program__Group__0__Impl : ( ( rule__Program__ClassesAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:831:1: ( ( ( rule__Program__ClassesAssignment_0 )* ) )
            // InternalMiniJava.g:832:1: ( ( rule__Program__ClassesAssignment_0 )* )
            {
            // InternalMiniJava.g:832:1: ( ( rule__Program__ClassesAssignment_0 )* )
            // InternalMiniJava.g:833:2: ( rule__Program__ClassesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment_0()); 
            }
            // InternalMiniJava.g:834:2: ( rule__Program__ClassesAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniJava.g:834:3: rule__Program__ClassesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ClassesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment_0()); 
            }

            }


            }

        }
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
    // InternalMiniJava.g:842:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:846:1: ( rule__Program__Group__1__Impl )
            // InternalMiniJava.g:847:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

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
    // InternalMiniJava.g:853:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:857:1: ( ( ( rule__Program__MainAssignment_1 )? ) )
            // InternalMiniJava.g:858:1: ( ( rule__Program__MainAssignment_1 )? )
            {
            // InternalMiniJava.g:858:1: ( ( rule__Program__MainAssignment_1 )? )
            // InternalMiniJava.g:859:2: ( rule__Program__MainAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            }
            // InternalMiniJava.g:860:2: ( rule__Program__MainAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=14 && LA8_0<=15)||LA8_0==21||(LA8_0>=26 && LA8_0<=27)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:860:3: rule__Program__MainAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__MainAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalMiniJava.g:869:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:873:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMiniJava.g:874:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:881:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:885:1: ( ( 'class' ) )
            // InternalMiniJava.g:886:1: ( 'class' )
            {
            // InternalMiniJava.g:886:1: ( 'class' )
            // InternalMiniJava.g:887:2: 'class'
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
    // InternalMiniJava.g:896:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:900:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMiniJava.g:901:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMiniJava.g:908:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:912:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalMiniJava.g:913:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:913:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalMiniJava.g:914:2: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:915:2: ( rule__Class__NameAssignment_1 )
            // InternalMiniJava.g:915:3: rule__Class__NameAssignment_1
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
    // InternalMiniJava.g:923:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:927:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMiniJava.g:928:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMiniJava.g:935:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:939:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalMiniJava.g:940:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalMiniJava.g:940:1: ( ( rule__Class__Group_2__0 )? )
            // InternalMiniJava.g:941:2: ( rule__Class__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_2()); 
            }
            // InternalMiniJava.g:942:2: ( rule__Class__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:942:3: rule__Class__Group_2__0
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
    // InternalMiniJava.g:950:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:954:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMiniJava.g:955:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMiniJava.g:962:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:966:1: ( ( '{' ) )
            // InternalMiniJava.g:967:1: ( '{' )
            {
            // InternalMiniJava.g:967:1: ( '{' )
            // InternalMiniJava.g:968:2: '{'
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
    // InternalMiniJava.g:977:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:981:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMiniJava.g:982:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMiniJava.g:989:1: rule__Class__Group__4__Impl : ( ( rule__Class__FieldsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:993:1: ( ( ( rule__Class__FieldsAssignment_4 )* ) )
            // InternalMiniJava.g:994:1: ( ( rule__Class__FieldsAssignment_4 )* )
            {
            // InternalMiniJava.g:994:1: ( ( rule__Class__FieldsAssignment_4 )* )
            // InternalMiniJava.g:995:2: ( rule__Class__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getFieldsAssignment_4()); 
            }
            // InternalMiniJava.g:996:2: ( rule__Class__FieldsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==20) ) {
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

                        if ( (LA10_6==20) ) {
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

                        if ( (LA10_6==20) ) {
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

                        if ( (LA10_6==20) ) {
                            alt10=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:996:3: rule__Class__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalMiniJava.g:1004:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1008:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMiniJava.g:1009:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMiniJava.g:1016:1: rule__Class__Group__5__Impl : ( ( rule__Class__MethodsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1020:1: ( ( ( rule__Class__MethodsAssignment_5 )* ) )
            // InternalMiniJava.g:1021:1: ( ( rule__Class__MethodsAssignment_5 )* )
            {
            // InternalMiniJava.g:1021:1: ( ( rule__Class__MethodsAssignment_5 )* )
            // InternalMiniJava.g:1022:2: ( rule__Class__MethodsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getMethodsAssignment_5()); 
            }
            // InternalMiniJava.g:1023:2: ( rule__Class__MethodsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=13)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava.g:1023:3: rule__Class__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalMiniJava.g:1031:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1035:1: ( rule__Class__Group__6__Impl )
            // InternalMiniJava.g:1036:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

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
    // InternalMiniJava.g:1042:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1046:1: ( ( '}' ) )
            // InternalMiniJava.g:1047:1: ( '}' )
            {
            // InternalMiniJava.g:1047:1: ( '}' )
            // InternalMiniJava.g:1048:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_2__0"
    // InternalMiniJava.g:1058:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1062:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalMiniJava.g:1063:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:1070:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1074:1: ( ( 'extends' ) )
            // InternalMiniJava.g:1075:1: ( 'extends' )
            {
            // InternalMiniJava.g:1075:1: ( 'extends' )
            // InternalMiniJava.g:1076:2: 'extends'
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
    // InternalMiniJava.g:1085:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1089:1: ( rule__Class__Group_2__1__Impl )
            // InternalMiniJava.g:1090:2: rule__Class__Group_2__1__Impl
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
    // InternalMiniJava.g:1096:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1100:1: ( ( ( rule__Class__ExtendsAssignment_2_1 ) ) )
            // InternalMiniJava.g:1101:1: ( ( rule__Class__ExtendsAssignment_2_1 ) )
            {
            // InternalMiniJava.g:1101:1: ( ( rule__Class__ExtendsAssignment_2_1 ) )
            // InternalMiniJava.g:1102:2: ( rule__Class__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsAssignment_2_1()); 
            }
            // InternalMiniJava.g:1103:2: ( rule__Class__ExtendsAssignment_2_1 )
            // InternalMiniJava.g:1103:3: rule__Class__ExtendsAssignment_2_1
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalMiniJava.g:1112:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1116:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMiniJava.g:1117:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:1124:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1128:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:1129:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1129:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalMiniJava.g:1130:2: ( rule__Field__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            }
            // InternalMiniJava.g:1131:2: ( rule__Field__TypeAssignment_0 )
            // InternalMiniJava.g:1131:3: rule__Field__TypeAssignment_0
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
    // InternalMiniJava.g:1139:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1143:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMiniJava.g:1144:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMiniJava.g:1151:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1155:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1156:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1156:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalMiniJava.g:1157:2: ( rule__Field__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1158:2: ( rule__Field__NameAssignment_1 )
            // InternalMiniJava.g:1158:3: rule__Field__NameAssignment_1
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
    // InternalMiniJava.g:1166:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1170:1: ( rule__Field__Group__2__Impl )
            // InternalMiniJava.g:1171:2: rule__Field__Group__2__Impl
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
    // InternalMiniJava.g:1177:1: rule__Field__Group__2__Impl : ( ';' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1181:1: ( ( ';' ) )
            // InternalMiniJava.g:1182:1: ( ';' )
            {
            // InternalMiniJava.g:1182:1: ( ';' )
            // InternalMiniJava.g:1183:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1193:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1197:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMiniJava.g:1198:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:1205:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1209:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:1210:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1210:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMiniJava.g:1211:2: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // InternalMiniJava.g:1212:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMiniJava.g:1212:3: rule__Parameter__TypeAssignment_0
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
    // InternalMiniJava.g:1220:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1224:1: ( rule__Parameter__Group__1__Impl )
            // InternalMiniJava.g:1225:2: rule__Parameter__Group__1__Impl
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
    // InternalMiniJava.g:1231:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1235:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1236:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1236:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMiniJava.g:1237:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1238:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMiniJava.g:1238:3: rule__Parameter__NameAssignment_1
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
    // InternalMiniJava.g:1247:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1251:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMiniJava.g:1252:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:1259:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturntypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1263:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) )
            // InternalMiniJava.g:1264:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1264:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // InternalMiniJava.g:1265:2: ( rule__Method__ReturntypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            }
            // InternalMiniJava.g:1266:2: ( rule__Method__ReturntypeAssignment_0 )
            // InternalMiniJava.g:1266:3: rule__Method__ReturntypeAssignment_0
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
    // InternalMiniJava.g:1274:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1278:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMiniJava.g:1279:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMiniJava.g:1286:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1290:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1291:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1291:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalMiniJava.g:1292:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:1293:2: ( rule__Method__NameAssignment_1 )
            // InternalMiniJava.g:1293:3: rule__Method__NameAssignment_1
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
    // InternalMiniJava.g:1301:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1305:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMiniJava.g:1306:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:1313:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1317:1: ( ( '(' ) )
            // InternalMiniJava.g:1318:1: ( '(' )
            {
            // InternalMiniJava.g:1318:1: ( '(' )
            // InternalMiniJava.g:1319:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1328:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1332:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMiniJava.g:1333:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:1340:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1344:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalMiniJava.g:1345:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalMiniJava.g:1345:1: ( ( rule__Method__Group_3__0 )? )
            // InternalMiniJava.g:1346:2: ( rule__Method__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:1347:2: ( rule__Method__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=11 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1347:3: rule__Method__Group_3__0
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
    // InternalMiniJava.g:1355:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1359:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMiniJava.g:1360:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMiniJava.g:1367:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1371:1: ( ( ')' ) )
            // InternalMiniJava.g:1372:1: ( ')' )
            {
            // InternalMiniJava.g:1372:1: ( ')' )
            // InternalMiniJava.g:1373:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1382:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1386:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalMiniJava.g:1387:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // InternalMiniJava.g:1394:1: rule__Method__Group__5__Impl : ( '{' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1398:1: ( ( '{' ) )
            // InternalMiniJava.g:1399:1: ( '{' )
            {
            // InternalMiniJava.g:1399:1: ( '{' )
            // InternalMiniJava.g:1400:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Method__Group__6"
    // InternalMiniJava.g:1409:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1413:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalMiniJava.g:1414:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalMiniJava.g:1421:1: rule__Method__Group__6__Impl : ( ( rule__Method__BodyAssignment_6 ) ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1425:1: ( ( ( rule__Method__BodyAssignment_6 ) ) )
            // InternalMiniJava.g:1426:1: ( ( rule__Method__BodyAssignment_6 ) )
            {
            // InternalMiniJava.g:1426:1: ( ( rule__Method__BodyAssignment_6 ) )
            // InternalMiniJava.g:1427:2: ( rule__Method__BodyAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyAssignment_6()); 
            }
            // InternalMiniJava.g:1428:2: ( rule__Method__BodyAssignment_6 )
            // InternalMiniJava.g:1428:3: rule__Method__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Method__BodyAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalMiniJava.g:1436:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1440:1: ( rule__Method__Group__7__Impl )
            // InternalMiniJava.g:1441:2: rule__Method__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__7__Impl();

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
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalMiniJava.g:1447:1: rule__Method__Group__7__Impl : ( '}' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1451:1: ( ( '}' ) )
            // InternalMiniJava.g:1452:1: ( '}' )
            {
            // InternalMiniJava.g:1452:1: ( '}' )
            // InternalMiniJava.g:1453:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalMiniJava.g:1463:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1467:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalMiniJava.g:1468:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:1475:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParamsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1479:1: ( ( ( rule__Method__ParamsAssignment_3_0 ) ) )
            // InternalMiniJava.g:1480:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            {
            // InternalMiniJava.g:1480:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            // InternalMiniJava.g:1481:2: ( rule__Method__ParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            }
            // InternalMiniJava.g:1482:2: ( rule__Method__ParamsAssignment_3_0 )
            // InternalMiniJava.g:1482:3: rule__Method__ParamsAssignment_3_0
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
    // InternalMiniJava.g:1490:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1494:1: ( rule__Method__Group_3__1__Impl )
            // InternalMiniJava.g:1495:2: rule__Method__Group_3__1__Impl
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
    // InternalMiniJava.g:1501:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1505:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalMiniJava.g:1506:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalMiniJava.g:1506:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalMiniJava.g:1507:2: ( rule__Method__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }
            // InternalMiniJava.g:1508:2: ( rule__Method__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniJava.g:1508:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMiniJava.g:1517:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1521:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalMiniJava.g:1522:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMiniJava.g:1529:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1533:1: ( ( ',' ) )
            // InternalMiniJava.g:1534:1: ( ',' )
            {
            // InternalMiniJava.g:1534:1: ( ',' )
            // InternalMiniJava.g:1535:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1544:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1548:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalMiniJava.g:1549:2: rule__Method__Group_3_1__1__Impl
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
    // InternalMiniJava.g:1555:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1559:1: ( ( ( rule__Method__ParamsAssignment_3_1_1 ) ) )
            // InternalMiniJava.g:1560:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            {
            // InternalMiniJava.g:1560:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            // InternalMiniJava.g:1561:2: ( rule__Method__ParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            }
            // InternalMiniJava.g:1562:2: ( rule__Method__ParamsAssignment_3_1_1 )
            // InternalMiniJava.g:1562:3: rule__Method__ParamsAssignment_3_1_1
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
    // InternalMiniJava.g:1571:1: rule__MethodBody__Group__0 : rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 ;
    public final void rule__MethodBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1575:1: ( rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 )
            // InternalMiniJava.g:1576:2: rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMiniJava.g:1583:1: rule__MethodBody__Group__0__Impl : ( 'return' ) ;
    public final void rule__MethodBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1587:1: ( ( 'return' ) )
            // InternalMiniJava.g:1588:1: ( 'return' )
            {
            // InternalMiniJava.g:1588:1: ( 'return' )
            // InternalMiniJava.g:1589:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getReturnKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodBodyAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
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
    // InternalMiniJava.g:1598:1: rule__MethodBody__Group__1 : rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 ;
    public final void rule__MethodBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1602:1: ( rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 )
            // InternalMiniJava.g:1603:2: rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMiniJava.g:1610:1: rule__MethodBody__Group__1__Impl : ( ( rule__MethodBody__ExpressionAssignment_1 ) ) ;
    public final void rule__MethodBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1614:1: ( ( ( rule__MethodBody__ExpressionAssignment_1 ) ) )
            // InternalMiniJava.g:1615:1: ( ( rule__MethodBody__ExpressionAssignment_1 ) )
            {
            // InternalMiniJava.g:1615:1: ( ( rule__MethodBody__ExpressionAssignment_1 ) )
            // InternalMiniJava.g:1616:2: ( rule__MethodBody__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getExpressionAssignment_1()); 
            }
            // InternalMiniJava.g:1617:2: ( rule__MethodBody__ExpressionAssignment_1 )
            // InternalMiniJava.g:1617:3: rule__MethodBody__ExpressionAssignment_1
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
    // InternalMiniJava.g:1625:1: rule__MethodBody__Group__2 : rule__MethodBody__Group__2__Impl ;
    public final void rule__MethodBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1629:1: ( rule__MethodBody__Group__2__Impl )
            // InternalMiniJava.g:1630:2: rule__MethodBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__2__Impl();

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
    // InternalMiniJava.g:1636:1: rule__MethodBody__Group__2__Impl : ( ';' ) ;
    public final void rule__MethodBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1640:1: ( ( ';' ) )
            // InternalMiniJava.g:1641:1: ( ';' )
            {
            // InternalMiniJava.g:1641:1: ( ';' )
            // InternalMiniJava.g:1642:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodBodyAccess().getSemicolonKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMiniJava.g:1652:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1656:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMiniJava.g:1657:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMiniJava.g:1664:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1668:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:1669:1: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:1669:1: ( ruleTerminalExpression )
            // InternalMiniJava.g:1670:2: ruleTerminalExpression
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
    // InternalMiniJava.g:1679:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1683:1: ( rule__Expression__Group__1__Impl )
            // InternalMiniJava.g:1684:2: rule__Expression__Group__1__Impl
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
    // InternalMiniJava.g:1690:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1694:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalMiniJava.g:1695:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalMiniJava.g:1695:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalMiniJava.g:1696:2: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:1697:2: ( rule__Expression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:1697:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMiniJava.g:1706:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1710:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMiniJava.g:1711:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMiniJava.g:1718:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1722:1: ( ( () ) )
            // InternalMiniJava.g:1723:1: ( () )
            {
            // InternalMiniJava.g:1723:1: ( () )
            // InternalMiniJava.g:1724:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getSelectionReceiverAction_1_0()); 
            }
            // InternalMiniJava.g:1725:2: ()
            // InternalMiniJava.g:1725:3: 
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
    // InternalMiniJava.g:1733:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1737:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMiniJava.g:1738:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMiniJava.g:1745:1: rule__Expression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1749:1: ( ( '.' ) )
            // InternalMiniJava.g:1750:1: ( '.' )
            {
            // InternalMiniJava.g:1750:1: ( '.' )
            // InternalMiniJava.g:1751:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1760:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1764:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMiniJava.g:1765:2: rule__Expression__Group_1__2__Impl
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
    // InternalMiniJava.g:1771:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__MessageAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1775:1: ( ( ( rule__Expression__MessageAssignment_1_2 ) ) )
            // InternalMiniJava.g:1776:1: ( ( rule__Expression__MessageAssignment_1_2 ) )
            {
            // InternalMiniJava.g:1776:1: ( ( rule__Expression__MessageAssignment_1_2 ) )
            // InternalMiniJava.g:1777:2: ( rule__Expression__MessageAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMessageAssignment_1_2()); 
            }
            // InternalMiniJava.g:1778:2: ( rule__Expression__MessageAssignment_1_2 )
            // InternalMiniJava.g:1778:3: rule__Expression__MessageAssignment_1_2
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
    // InternalMiniJava.g:1787:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1791:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMiniJava.g:1792:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMiniJava.g:1799:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1803:1: ( ( ( rule__MethodCall__NameAssignment_0 ) ) )
            // InternalMiniJava.g:1804:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            {
            // InternalMiniJava.g:1804:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            // InternalMiniJava.g:1805:2: ( rule__MethodCall__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
            }
            // InternalMiniJava.g:1806:2: ( rule__MethodCall__NameAssignment_0 )
            // InternalMiniJava.g:1806:3: rule__MethodCall__NameAssignment_0
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
    // InternalMiniJava.g:1814:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1818:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMiniJava.g:1819:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMiniJava.g:1826:1: rule__MethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1830:1: ( ( '(' ) )
            // InternalMiniJava.g:1831:1: ( '(' )
            {
            // InternalMiniJava.g:1831:1: ( '(' )
            // InternalMiniJava.g:1832:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1841:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1845:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // InternalMiniJava.g:1846:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMiniJava.g:1853:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__Group_2__0 )? ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1857:1: ( ( ( rule__MethodCall__Group_2__0 )? ) )
            // InternalMiniJava.g:1858:1: ( ( rule__MethodCall__Group_2__0 )? )
            {
            // InternalMiniJava.g:1858:1: ( ( rule__MethodCall__Group_2__0 )? )
            // InternalMiniJava.g:1859:2: ( rule__MethodCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_2()); 
            }
            // InternalMiniJava.g:1860:2: ( rule__MethodCall__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||(LA15_0>=14 && LA15_0<=15)||LA15_0==21||(LA15_0>=26 && LA15_0<=27)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:1860:3: rule__MethodCall__Group_2__0
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
    // InternalMiniJava.g:1868:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1872:1: ( rule__MethodCall__Group__3__Impl )
            // InternalMiniJava.g:1873:2: rule__MethodCall__Group__3__Impl
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
    // InternalMiniJava.g:1879:1: rule__MethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1883:1: ( ( ')' ) )
            // InternalMiniJava.g:1884:1: ( ')' )
            {
            // InternalMiniJava.g:1884:1: ( ')' )
            // InternalMiniJava.g:1885:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1895:1: rule__MethodCall__Group_2__0 : rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 ;
    public final void rule__MethodCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1899:1: ( rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 )
            // InternalMiniJava.g:1900:2: rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:1907:1: rule__MethodCall__Group_2__0__Impl : ( ( rule__MethodCall__ArgsAssignment_2_0 ) ) ;
    public final void rule__MethodCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1911:1: ( ( ( rule__MethodCall__ArgsAssignment_2_0 ) ) )
            // InternalMiniJava.g:1912:1: ( ( rule__MethodCall__ArgsAssignment_2_0 ) )
            {
            // InternalMiniJava.g:1912:1: ( ( rule__MethodCall__ArgsAssignment_2_0 ) )
            // InternalMiniJava.g:1913:2: ( rule__MethodCall__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsAssignment_2_0()); 
            }
            // InternalMiniJava.g:1914:2: ( rule__MethodCall__ArgsAssignment_2_0 )
            // InternalMiniJava.g:1914:3: rule__MethodCall__ArgsAssignment_2_0
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
    // InternalMiniJava.g:1922:1: rule__MethodCall__Group_2__1 : rule__MethodCall__Group_2__1__Impl ;
    public final void rule__MethodCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1926:1: ( rule__MethodCall__Group_2__1__Impl )
            // InternalMiniJava.g:1927:2: rule__MethodCall__Group_2__1__Impl
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
    // InternalMiniJava.g:1933:1: rule__MethodCall__Group_2__1__Impl : ( ( rule__MethodCall__Group_2_1__0 )* ) ;
    public final void rule__MethodCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1937:1: ( ( ( rule__MethodCall__Group_2_1__0 )* ) )
            // InternalMiniJava.g:1938:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            {
            // InternalMiniJava.g:1938:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            // InternalMiniJava.g:1939:2: ( rule__MethodCall__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
            }
            // InternalMiniJava.g:1940:2: ( rule__MethodCall__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:1940:3: rule__MethodCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MethodCall__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMiniJava.g:1949:1: rule__MethodCall__Group_2_1__0 : rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 ;
    public final void rule__MethodCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1953:1: ( rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 )
            // InternalMiniJava.g:1954:2: rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMiniJava.g:1961:1: rule__MethodCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1965:1: ( ( ',' ) )
            // InternalMiniJava.g:1966:1: ( ',' )
            {
            // InternalMiniJava.g:1966:1: ( ',' )
            // InternalMiniJava.g:1967:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:1976:1: rule__MethodCall__Group_2_1__1 : rule__MethodCall__Group_2_1__1__Impl ;
    public final void rule__MethodCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1980:1: ( rule__MethodCall__Group_2_1__1__Impl )
            // InternalMiniJava.g:1981:2: rule__MethodCall__Group_2_1__1__Impl
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
    // InternalMiniJava.g:1987:1: rule__MethodCall__Group_2_1__1__Impl : ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__MethodCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1991:1: ( ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) ) )
            // InternalMiniJava.g:1992:1: ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) )
            {
            // InternalMiniJava.g:1992:1: ( ( rule__MethodCall__ArgsAssignment_2_1_1 ) )
            // InternalMiniJava.g:1993:2: ( rule__MethodCall__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalMiniJava.g:1994:2: ( rule__MethodCall__ArgsAssignment_2_1_1 )
            // InternalMiniJava.g:1994:3: rule__MethodCall__ArgsAssignment_2_1_1
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
    // InternalMiniJava.g:2003:1: rule__New__Group__0 : rule__New__Group__0__Impl rule__New__Group__1 ;
    public final void rule__New__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2007:1: ( rule__New__Group__0__Impl rule__New__Group__1 )
            // InternalMiniJava.g:2008:2: rule__New__Group__0__Impl rule__New__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMiniJava.g:2015:1: rule__New__Group__0__Impl : ( 'new' ) ;
    public final void rule__New__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2019:1: ( ( 'new' ) )
            // InternalMiniJava.g:2020:1: ( 'new' )
            {
            // InternalMiniJava.g:2020:1: ( 'new' )
            // InternalMiniJava.g:2021:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getNewKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2030:1: rule__New__Group__1 : rule__New__Group__1__Impl rule__New__Group__2 ;
    public final void rule__New__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2034:1: ( rule__New__Group__1__Impl rule__New__Group__2 )
            // InternalMiniJava.g:2035:2: rule__New__Group__1__Impl rule__New__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMiniJava.g:2042:1: rule__New__Group__1__Impl : ( ( rule__New__TypeAssignment_1 ) ) ;
    public final void rule__New__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2046:1: ( ( ( rule__New__TypeAssignment_1 ) ) )
            // InternalMiniJava.g:2047:1: ( ( rule__New__TypeAssignment_1 ) )
            {
            // InternalMiniJava.g:2047:1: ( ( rule__New__TypeAssignment_1 ) )
            // InternalMiniJava.g:2048:2: ( rule__New__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getTypeAssignment_1()); 
            }
            // InternalMiniJava.g:2049:2: ( rule__New__TypeAssignment_1 )
            // InternalMiniJava.g:2049:3: rule__New__TypeAssignment_1
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
    // InternalMiniJava.g:2057:1: rule__New__Group__2 : rule__New__Group__2__Impl rule__New__Group__3 ;
    public final void rule__New__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2061:1: ( rule__New__Group__2__Impl rule__New__Group__3 )
            // InternalMiniJava.g:2062:2: rule__New__Group__2__Impl rule__New__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMiniJava.g:2069:1: rule__New__Group__2__Impl : ( '(' ) ;
    public final void rule__New__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2073:1: ( ( '(' ) )
            // InternalMiniJava.g:2074:1: ( '(' )
            {
            // InternalMiniJava.g:2074:1: ( '(' )
            // InternalMiniJava.g:2075:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2084:1: rule__New__Group__3 : rule__New__Group__3__Impl rule__New__Group__4 ;
    public final void rule__New__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2088:1: ( rule__New__Group__3__Impl rule__New__Group__4 )
            // InternalMiniJava.g:2089:2: rule__New__Group__3__Impl rule__New__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMiniJava.g:2096:1: rule__New__Group__3__Impl : ( ( rule__New__Group_3__0 )? ) ;
    public final void rule__New__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2100:1: ( ( ( rule__New__Group_3__0 )? ) )
            // InternalMiniJava.g:2101:1: ( ( rule__New__Group_3__0 )? )
            {
            // InternalMiniJava.g:2101:1: ( ( rule__New__Group_3__0 )? )
            // InternalMiniJava.g:2102:2: ( rule__New__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:2103:2: ( rule__New__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=14 && LA17_0<=15)||LA17_0==21||(LA17_0>=26 && LA17_0<=27)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:2103:3: rule__New__Group_3__0
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
    // InternalMiniJava.g:2111:1: rule__New__Group__4 : rule__New__Group__4__Impl ;
    public final void rule__New__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2115:1: ( rule__New__Group__4__Impl )
            // InternalMiniJava.g:2116:2: rule__New__Group__4__Impl
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
    // InternalMiniJava.g:2122:1: rule__New__Group__4__Impl : ( ')' ) ;
    public final void rule__New__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2126:1: ( ( ')' ) )
            // InternalMiniJava.g:2127:1: ( ')' )
            {
            // InternalMiniJava.g:2127:1: ( ')' )
            // InternalMiniJava.g:2128:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2138:1: rule__New__Group_3__0 : rule__New__Group_3__0__Impl rule__New__Group_3__1 ;
    public final void rule__New__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2142:1: ( rule__New__Group_3__0__Impl rule__New__Group_3__1 )
            // InternalMiniJava.g:2143:2: rule__New__Group_3__0__Impl rule__New__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:2150:1: rule__New__Group_3__0__Impl : ( ( rule__New__ArgsAssignment_3_0 ) ) ;
    public final void rule__New__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2154:1: ( ( ( rule__New__ArgsAssignment_3_0 ) ) )
            // InternalMiniJava.g:2155:1: ( ( rule__New__ArgsAssignment_3_0 ) )
            {
            // InternalMiniJava.g:2155:1: ( ( rule__New__ArgsAssignment_3_0 ) )
            // InternalMiniJava.g:2156:2: ( rule__New__ArgsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsAssignment_3_0()); 
            }
            // InternalMiniJava.g:2157:2: ( rule__New__ArgsAssignment_3_0 )
            // InternalMiniJava.g:2157:3: rule__New__ArgsAssignment_3_0
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
    // InternalMiniJava.g:2165:1: rule__New__Group_3__1 : rule__New__Group_3__1__Impl ;
    public final void rule__New__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2169:1: ( rule__New__Group_3__1__Impl )
            // InternalMiniJava.g:2170:2: rule__New__Group_3__1__Impl
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
    // InternalMiniJava.g:2176:1: rule__New__Group_3__1__Impl : ( ( rule__New__Group_3_1__0 )* ) ;
    public final void rule__New__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2180:1: ( ( ( rule__New__Group_3_1__0 )* ) )
            // InternalMiniJava.g:2181:1: ( ( rule__New__Group_3_1__0 )* )
            {
            // InternalMiniJava.g:2181:1: ( ( rule__New__Group_3_1__0 )* )
            // InternalMiniJava.g:2182:2: ( rule__New__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getGroup_3_1()); 
            }
            // InternalMiniJava.g:2183:2: ( rule__New__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiniJava.g:2183:3: rule__New__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__New__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMiniJava.g:2192:1: rule__New__Group_3_1__0 : rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1 ;
    public final void rule__New__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2196:1: ( rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1 )
            // InternalMiniJava.g:2197:2: rule__New__Group_3_1__0__Impl rule__New__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMiniJava.g:2204:1: rule__New__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__New__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2208:1: ( ( ',' ) )
            // InternalMiniJava.g:2209:1: ( ',' )
            {
            // InternalMiniJava.g:2209:1: ( ',' )
            // InternalMiniJava.g:2210:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2219:1: rule__New__Group_3_1__1 : rule__New__Group_3_1__1__Impl ;
    public final void rule__New__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2223:1: ( rule__New__Group_3_1__1__Impl )
            // InternalMiniJava.g:2224:2: rule__New__Group_3_1__1__Impl
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
    // InternalMiniJava.g:2230:1: rule__New__Group_3_1__1__Impl : ( ( rule__New__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__New__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2234:1: ( ( ( rule__New__ArgsAssignment_3_1_1 ) ) )
            // InternalMiniJava.g:2235:1: ( ( rule__New__ArgsAssignment_3_1_1 ) )
            {
            // InternalMiniJava.g:2235:1: ( ( rule__New__ArgsAssignment_3_1_1 ) )
            // InternalMiniJava.g:2236:2: ( rule__New__ArgsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewAccess().getArgsAssignment_3_1_1()); 
            }
            // InternalMiniJava.g:2237:2: ( rule__New__ArgsAssignment_3_1_1 )
            // InternalMiniJava.g:2237:3: rule__New__ArgsAssignment_3_1_1
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
    // InternalMiniJava.g:2246:1: rule__Cast__Group__0 : rule__Cast__Group__0__Impl rule__Cast__Group__1 ;
    public final void rule__Cast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2250:1: ( rule__Cast__Group__0__Impl rule__Cast__Group__1 )
            // InternalMiniJava.g:2251:2: rule__Cast__Group__0__Impl rule__Cast__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMiniJava.g:2258:1: rule__Cast__Group__0__Impl : ( ( '(' ) ) ;
    public final void rule__Cast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2262:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:2263:1: ( ( '(' ) )
            {
            // InternalMiniJava.g:2263:1: ( ( '(' ) )
            // InternalMiniJava.g:2264:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0()); 
            }
            // InternalMiniJava.g:2265:2: ( '(' )
            // InternalMiniJava.g:2265:3: '('
            {
            match(input,21,FOLLOW_2); if (state.failed) return ;

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
    // InternalMiniJava.g:2273:1: rule__Cast__Group__1 : rule__Cast__Group__1__Impl rule__Cast__Group__2 ;
    public final void rule__Cast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2277:1: ( rule__Cast__Group__1__Impl rule__Cast__Group__2 )
            // InternalMiniJava.g:2278:2: rule__Cast__Group__1__Impl rule__Cast__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMiniJava.g:2285:1: rule__Cast__Group__1__Impl : ( ( rule__Cast__TypeAssignment_1 ) ) ;
    public final void rule__Cast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2289:1: ( ( ( rule__Cast__TypeAssignment_1 ) ) )
            // InternalMiniJava.g:2290:1: ( ( rule__Cast__TypeAssignment_1 ) )
            {
            // InternalMiniJava.g:2290:1: ( ( rule__Cast__TypeAssignment_1 ) )
            // InternalMiniJava.g:2291:2: ( rule__Cast__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getTypeAssignment_1()); 
            }
            // InternalMiniJava.g:2292:2: ( rule__Cast__TypeAssignment_1 )
            // InternalMiniJava.g:2292:3: rule__Cast__TypeAssignment_1
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
    // InternalMiniJava.g:2300:1: rule__Cast__Group__2 : rule__Cast__Group__2__Impl rule__Cast__Group__3 ;
    public final void rule__Cast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2304:1: ( rule__Cast__Group__2__Impl rule__Cast__Group__3 )
            // InternalMiniJava.g:2305:2: rule__Cast__Group__2__Impl rule__Cast__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMiniJava.g:2312:1: rule__Cast__Group__2__Impl : ( ')' ) ;
    public final void rule__Cast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2316:1: ( ( ')' ) )
            // InternalMiniJava.g:2317:1: ( ')' )
            {
            // InternalMiniJava.g:2317:1: ( ')' )
            // InternalMiniJava.g:2318:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2327:1: rule__Cast__Group__3 : rule__Cast__Group__3__Impl ;
    public final void rule__Cast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2331:1: ( rule__Cast__Group__3__Impl )
            // InternalMiniJava.g:2332:2: rule__Cast__Group__3__Impl
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
    // InternalMiniJava.g:2338:1: rule__Cast__Group__3__Impl : ( ( rule__Cast__ObjectAssignment_3 ) ) ;
    public final void rule__Cast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2342:1: ( ( ( rule__Cast__ObjectAssignment_3 ) ) )
            // InternalMiniJava.g:2343:1: ( ( rule__Cast__ObjectAssignment_3 ) )
            {
            // InternalMiniJava.g:2343:1: ( ( rule__Cast__ObjectAssignment_3 ) )
            // InternalMiniJava.g:2344:2: ( rule__Cast__ObjectAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastAccess().getObjectAssignment_3()); 
            }
            // InternalMiniJava.g:2345:2: ( rule__Cast__ObjectAssignment_3 )
            // InternalMiniJava.g:2345:3: rule__Cast__ObjectAssignment_3
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
    // InternalMiniJava.g:2354:1: rule__Paren__Group__0 : rule__Paren__Group__0__Impl rule__Paren__Group__1 ;
    public final void rule__Paren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2358:1: ( rule__Paren__Group__0__Impl rule__Paren__Group__1 )
            // InternalMiniJava.g:2359:2: rule__Paren__Group__0__Impl rule__Paren__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMiniJava.g:2366:1: rule__Paren__Group__0__Impl : ( '(' ) ;
    public final void rule__Paren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2370:1: ( ( '(' ) )
            // InternalMiniJava.g:2371:1: ( '(' )
            {
            // InternalMiniJava.g:2371:1: ( '(' )
            // InternalMiniJava.g:2372:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2381:1: rule__Paren__Group__1 : rule__Paren__Group__1__Impl rule__Paren__Group__2 ;
    public final void rule__Paren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2385:1: ( rule__Paren__Group__1__Impl rule__Paren__Group__2 )
            // InternalMiniJava.g:2386:2: rule__Paren__Group__1__Impl rule__Paren__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMiniJava.g:2393:1: rule__Paren__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__Paren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2397:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:2398:1: ( ruleExpression )
            {
            // InternalMiniJava.g:2398:1: ( ruleExpression )
            // InternalMiniJava.g:2399:2: ruleExpression
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
    // InternalMiniJava.g:2408:1: rule__Paren__Group__2 : rule__Paren__Group__2__Impl ;
    public final void rule__Paren__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2412:1: ( rule__Paren__Group__2__Impl )
            // InternalMiniJava.g:2413:2: rule__Paren__Group__2__Impl
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
    // InternalMiniJava.g:2419:1: rule__Paren__Group__2__Impl : ( ')' ) ;
    public final void rule__Paren__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2423:1: ( ( ')' ) )
            // InternalMiniJava.g:2424:1: ( ')' )
            {
            // InternalMiniJava.g:2424:1: ( ')' )
            // InternalMiniJava.g:2425:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Program__ClassesAssignment_0"
    // InternalMiniJava.g:2435:1: rule__Program__ClassesAssignment_0 : ( ruleClass ) ;
    public final void rule__Program__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2439:1: ( ( ruleClass ) )
            // InternalMiniJava.g:2440:2: ( ruleClass )
            {
            // InternalMiniJava.g:2440:2: ( ruleClass )
            // InternalMiniJava.g:2441:3: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesClassParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassesAssignment_0"


    // $ANTLR start "rule__Program__MainAssignment_1"
    // InternalMiniJava.g:2450:1: rule__Program__MainAssignment_1 : ( ruleExpression ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2454:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:2455:2: ( ruleExpression )
            {
            // InternalMiniJava.g:2455:2: ( ruleExpression )
            // InternalMiniJava.g:2456:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getMainExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getMainExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MainAssignment_1"


    // $ANTLR start "rule__BasicType__BasicAssignment"
    // InternalMiniJava.g:2465:1: rule__BasicType__BasicAssignment : ( ( rule__BasicType__BasicAlternatives_0 ) ) ;
    public final void rule__BasicType__BasicAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2469:1: ( ( ( rule__BasicType__BasicAlternatives_0 ) ) )
            // InternalMiniJava.g:2470:2: ( ( rule__BasicType__BasicAlternatives_0 ) )
            {
            // InternalMiniJava.g:2470:2: ( ( rule__BasicType__BasicAlternatives_0 ) )
            // InternalMiniJava.g:2471:3: ( rule__BasicType__BasicAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBasicAlternatives_0()); 
            }
            // InternalMiniJava.g:2472:3: ( rule__BasicType__BasicAlternatives_0 )
            // InternalMiniJava.g:2472:4: rule__BasicType__BasicAlternatives_0
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
    // InternalMiniJava.g:2480:1: rule__ClassType__ClassrefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__ClassrefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2484:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2485:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2485:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2486:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassrefClassCrossReference_0()); 
            }
            // InternalMiniJava.g:2487:3: ( RULE_ID )
            // InternalMiniJava.g:2488:4: RULE_ID
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


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalMiniJava.g:2499:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2503:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2504:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2504:2: ( RULE_ID )
            // InternalMiniJava.g:2505:3: RULE_ID
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
    // InternalMiniJava.g:2514:1: rule__Class__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2518:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2519:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2519:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2520:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsClassCrossReference_2_1_0()); 
            }
            // InternalMiniJava.g:2521:3: ( RULE_ID )
            // InternalMiniJava.g:2522:4: RULE_ID
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
    // InternalMiniJava.g:2533:1: rule__Class__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2537:1: ( ( ruleField ) )
            // InternalMiniJava.g:2538:2: ( ruleField )
            {
            // InternalMiniJava.g:2538:2: ( ruleField )
            // InternalMiniJava.g:2539:3: ruleField
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
    // InternalMiniJava.g:2548:1: rule__Class__MethodsAssignment_5 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2552:1: ( ( ruleMethod ) )
            // InternalMiniJava.g:2553:2: ( ruleMethod )
            {
            // InternalMiniJava.g:2553:2: ( ruleMethod )
            // InternalMiniJava.g:2554:3: ruleMethod
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


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalMiniJava.g:2563:1: rule__Field__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2567:1: ( ( ruleType ) )
            // InternalMiniJava.g:2568:2: ( ruleType )
            {
            // InternalMiniJava.g:2568:2: ( ruleType )
            // InternalMiniJava.g:2569:3: ruleType
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
    // InternalMiniJava.g:2578:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2582:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2583:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2583:2: ( RULE_ID )
            // InternalMiniJava.g:2584:3: RULE_ID
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
    // InternalMiniJava.g:2593:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2597:1: ( ( ruleType ) )
            // InternalMiniJava.g:2598:2: ( ruleType )
            {
            // InternalMiniJava.g:2598:2: ( ruleType )
            // InternalMiniJava.g:2599:3: ruleType
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
    // InternalMiniJava.g:2608:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2612:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2613:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2613:2: ( RULE_ID )
            // InternalMiniJava.g:2614:3: RULE_ID
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
    // InternalMiniJava.g:2623:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2627:1: ( ( ruleType ) )
            // InternalMiniJava.g:2628:2: ( ruleType )
            {
            // InternalMiniJava.g:2628:2: ( ruleType )
            // InternalMiniJava.g:2629:3: ruleType
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
    // InternalMiniJava.g:2638:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2642:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2643:2: ( RULE_ID )
            {
            // InternalMiniJava.g:2643:2: ( RULE_ID )
            // InternalMiniJava.g:2644:3: RULE_ID
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
    // InternalMiniJava.g:2653:1: rule__Method__ParamsAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2657:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:2658:2: ( ruleParameter )
            {
            // InternalMiniJava.g:2658:2: ( ruleParameter )
            // InternalMiniJava.g:2659:3: ruleParameter
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
    // InternalMiniJava.g:2668:1: rule__Method__ParamsAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2672:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:2673:2: ( ruleParameter )
            {
            // InternalMiniJava.g:2673:2: ( ruleParameter )
            // InternalMiniJava.g:2674:3: ruleParameter
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


    // $ANTLR start "rule__Method__BodyAssignment_6"
    // InternalMiniJava.g:2683:1: rule__Method__BodyAssignment_6 : ( ruleMethodBody ) ;
    public final void rule__Method__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2687:1: ( ( ruleMethodBody ) )
            // InternalMiniJava.g:2688:2: ( ruleMethodBody )
            {
            // InternalMiniJava.g:2688:2: ( ruleMethodBody )
            // InternalMiniJava.g:2689:3: ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BodyAssignment_6"


    // $ANTLR start "rule__MethodBody__ExpressionAssignment_1"
    // InternalMiniJava.g:2698:1: rule__MethodBody__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__MethodBody__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2702:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:2703:2: ( ruleExpression )
            {
            // InternalMiniJava.g:2703:2: ( ruleExpression )
            // InternalMiniJava.g:2704:3: ruleExpression
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
    // InternalMiniJava.g:2713:1: rule__Expression__MessageAssignment_1_2 : ( ruleMessage ) ;
    public final void rule__Expression__MessageAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2717:1: ( ( ruleMessage ) )
            // InternalMiniJava.g:2718:2: ( ruleMessage )
            {
            // InternalMiniJava.g:2718:2: ( ruleMessage )
            // InternalMiniJava.g:2719:3: ruleMessage
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
    // InternalMiniJava.g:2728:1: rule__MethodCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2732:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2733:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2733:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2734:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameMethodCrossReference_0_0()); 
            }
            // InternalMiniJava.g:2735:3: ( RULE_ID )
            // InternalMiniJava.g:2736:4: RULE_ID
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
    // InternalMiniJava.g:2747:1: rule__MethodCall__ArgsAssignment_2_0 : ( ruleArgument ) ;
    public final void rule__MethodCall__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2751:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:2752:2: ( ruleArgument )
            {
            // InternalMiniJava.g:2752:2: ( ruleArgument )
            // InternalMiniJava.g:2753:3: ruleArgument
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
    // InternalMiniJava.g:2762:1: rule__MethodCall__ArgsAssignment_2_1_1 : ( ruleArgument ) ;
    public final void rule__MethodCall__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2766:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:2767:2: ( ruleArgument )
            {
            // InternalMiniJava.g:2767:2: ( ruleArgument )
            // InternalMiniJava.g:2768:3: ruleArgument
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
    // InternalMiniJava.g:2777:1: rule__FieldSelection__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FieldSelection__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2781:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2782:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2782:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2783:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectionAccess().getNameFieldCrossReference_0()); 
            }
            // InternalMiniJava.g:2784:3: ( RULE_ID )
            // InternalMiniJava.g:2785:4: RULE_ID
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
    // InternalMiniJava.g:2796:1: rule__This__VariableAssignment : ( ( 'this' ) ) ;
    public final void rule__This__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2800:1: ( ( ( 'this' ) ) )
            // InternalMiniJava.g:2801:2: ( ( 'this' ) )
            {
            // InternalMiniJava.g:2801:2: ( ( 'this' ) )
            // InternalMiniJava.g:2802:3: ( 'this' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            }
            // InternalMiniJava.g:2803:3: ( 'this' )
            // InternalMiniJava.g:2804:4: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMiniJava.g:2815:1: rule__Variable__ParamrefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Variable__ParamrefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2819:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:2820:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:2820:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:2821:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getParamrefParameterCrossReference_0()); 
            }
            // InternalMiniJava.g:2822:3: ( RULE_ID )
            // InternalMiniJava.g:2823:4: RULE_ID
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
    // InternalMiniJava.g:2834:1: rule__New__TypeAssignment_1 : ( ruleClassType ) ;
    public final void rule__New__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2838:1: ( ( ruleClassType ) )
            // InternalMiniJava.g:2839:2: ( ruleClassType )
            {
            // InternalMiniJava.g:2839:2: ( ruleClassType )
            // InternalMiniJava.g:2840:3: ruleClassType
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
    // InternalMiniJava.g:2849:1: rule__New__ArgsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__New__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2853:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:2854:2: ( ruleArgument )
            {
            // InternalMiniJava.g:2854:2: ( ruleArgument )
            // InternalMiniJava.g:2855:3: ruleArgument
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
    // InternalMiniJava.g:2864:1: rule__New__ArgsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__New__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2868:1: ( ( ruleArgument ) )
            // InternalMiniJava.g:2869:2: ( ruleArgument )
            {
            // InternalMiniJava.g:2869:2: ( ruleArgument )
            // InternalMiniJava.g:2870:3: ruleArgument
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
    // InternalMiniJava.g:2879:1: rule__Cast__TypeAssignment_1 : ( ruleClassType ) ;
    public final void rule__Cast__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2883:1: ( ( ruleClassType ) )
            // InternalMiniJava.g:2884:2: ( ruleClassType )
            {
            // InternalMiniJava.g:2884:2: ( ruleClassType )
            // InternalMiniJava.g:2885:3: ruleClassType
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
    // InternalMiniJava.g:2894:1: rule__Cast__ObjectAssignment_3 : ( ruleTerminalExpression ) ;
    public final void rule__Cast__ObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2898:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:2899:2: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:2899:2: ( ruleTerminalExpression )
            // InternalMiniJava.g:2900:3: ruleTerminalExpression
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
    // InternalMiniJava.g:2909:1: rule__StringConstant__ConstantAssignment : ( RULE_STRING ) ;
    public final void rule__StringConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2913:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:2914:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:2914:2: ( RULE_STRING )
            // InternalMiniJava.g:2915:3: RULE_STRING
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
    // InternalMiniJava.g:2924:1: rule__IntConstant__ConstantAssignment : ( RULE_INT ) ;
    public final void rule__IntConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2928:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:2929:2: ( RULE_INT )
            {
            // InternalMiniJava.g:2929:2: ( RULE_INT )
            // InternalMiniJava.g:2930:3: RULE_INT
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
    // InternalMiniJava.g:2939:1: rule__BoolConstant__ConstantAssignment : ( ( rule__BoolConstant__ConstantAlternatives_0 ) ) ;
    public final void rule__BoolConstant__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2943:1: ( ( ( rule__BoolConstant__ConstantAlternatives_0 ) ) )
            // InternalMiniJava.g:2944:2: ( ( rule__BoolConstant__ConstantAlternatives_0 ) )
            {
            // InternalMiniJava.g:2944:2: ( ( rule__BoolConstant__ConstantAlternatives_0 ) )
            // InternalMiniJava.g:2945:3: ( rule__BoolConstant__ConstantAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolConstantAccess().getConstantAlternatives_0()); 
            }
            // InternalMiniJava.g:2946:3: ( rule__BoolConstant__ConstantAlternatives_0 )
            // InternalMiniJava.g:2946:4: rule__BoolConstant__ConstantAlternatives_0
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

    // $ANTLR start synpred8_InternalMiniJava
    public final void synpred8_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:745:2: ( ( ( ruleCast ) ) )
        // InternalMiniJava.g:745:2: ( ( ruleCast ) )
        {
        // InternalMiniJava.g:745:2: ( ( ruleCast ) )
        // InternalMiniJava.g:746:3: ( ruleCast )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
        }
        // InternalMiniJava.g:747:3: ( ruleCast )
        // InternalMiniJava.g:747:4: ruleCast
        {
        pushFollow(FOLLOW_2);
        ruleCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMiniJava

    // Delegated rules

    public final boolean synpred8_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\33\3\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\3\uffff\1\4\1\6";
    static final String dfa_5s = "\4\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\5\7\uffff\2\5\5\uffff\1\4\4\uffff\1\3\1\1",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "722:1: rule__TerminalExpression__Alternatives : ( ( ruleThis ) | ( ruleVariable ) | ( ruleNew ) | ( ( ruleCast ) ) | ( ruleConstant ) | ( ruleParen ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMiniJava()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C20C070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000043810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000403810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C60C070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});

}