package ecs.ide.contentassist.antlr.internal;

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
import ecs.services.LangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'add'", "'get'", "'has'", "'replace'", "'remove'", "'ctx'", "'{'", "'}'", "'platform'", "'namespace'", "'alias'", "'='", "':'", "'comp'", "'/'", "'sys'", "'input'", "'trigger'", "'api'", "'ensure'", "'exclude'", "'enteredGroup'", "'('", "')'", "'leftGroup'", "'enteredOrLeftGroup'", "'create'", "'unique'", "'matcher'", "'allOf'", "'anyOf'", "'noneOf'", "'parent_sys'", "'extends'", "'.'", "'*'", "'init'", "'destroy'", "'group'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLang.g"; }


    	private LangGrammarAccess grammarAccess;

    	public void setGrammarAccess(LangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProject"
    // InternalLang.g:53:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalLang.g:54:1: ( ruleProject EOF )
            // InternalLang.g:55:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalLang.g:62:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:66:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalLang.g:67:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalLang.g:67:2: ( ( rule__Project__Group__0 ) )
            // InternalLang.g:68:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalLang.g:69:3: ( rule__Project__Group__0 )
            // InternalLang.g:69:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleContextDefinition"
    // InternalLang.g:78:1: entryRuleContextDefinition : ruleContextDefinition EOF ;
    public final void entryRuleContextDefinition() throws RecognitionException {
        try {
            // InternalLang.g:79:1: ( ruleContextDefinition EOF )
            // InternalLang.g:80:1: ruleContextDefinition EOF
            {
             before(grammarAccess.getContextDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextDefinition();

            state._fsp--;

             after(grammarAccess.getContextDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextDefinition"


    // $ANTLR start "ruleContextDefinition"
    // InternalLang.g:87:1: ruleContextDefinition : ( ( rule__ContextDefinition__Group__0 ) ) ;
    public final void ruleContextDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:91:2: ( ( ( rule__ContextDefinition__Group__0 ) ) )
            // InternalLang.g:92:2: ( ( rule__ContextDefinition__Group__0 ) )
            {
            // InternalLang.g:92:2: ( ( rule__ContextDefinition__Group__0 ) )
            // InternalLang.g:93:3: ( rule__ContextDefinition__Group__0 )
            {
             before(grammarAccess.getContextDefinitionAccess().getGroup()); 
            // InternalLang.g:94:3: ( rule__ContextDefinition__Group__0 )
            // InternalLang.g:94:4: rule__ContextDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextDefinition"


    // $ANTLR start "entryRulePlatforms"
    // InternalLang.g:103:1: entryRulePlatforms : rulePlatforms EOF ;
    public final void entryRulePlatforms() throws RecognitionException {
        try {
            // InternalLang.g:104:1: ( rulePlatforms EOF )
            // InternalLang.g:105:1: rulePlatforms EOF
            {
             before(grammarAccess.getPlatformsRule()); 
            pushFollow(FOLLOW_1);
            rulePlatforms();

            state._fsp--;

             after(grammarAccess.getPlatformsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatforms"


    // $ANTLR start "rulePlatforms"
    // InternalLang.g:112:1: rulePlatforms : ( ( rule__Platforms__Group__0 ) ) ;
    public final void rulePlatforms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:116:2: ( ( ( rule__Platforms__Group__0 ) ) )
            // InternalLang.g:117:2: ( ( rule__Platforms__Group__0 ) )
            {
            // InternalLang.g:117:2: ( ( rule__Platforms__Group__0 ) )
            // InternalLang.g:118:3: ( rule__Platforms__Group__0 )
            {
             before(grammarAccess.getPlatformsAccess().getGroup()); 
            // InternalLang.g:119:3: ( rule__Platforms__Group__0 )
            // InternalLang.g:119:4: rule__Platforms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platforms__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatforms"


    // $ANTLR start "entryRulePlatformID"
    // InternalLang.g:128:1: entryRulePlatformID : rulePlatformID EOF ;
    public final void entryRulePlatformID() throws RecognitionException {
        try {
            // InternalLang.g:129:1: ( rulePlatformID EOF )
            // InternalLang.g:130:1: rulePlatformID EOF
            {
             before(grammarAccess.getPlatformIDRule()); 
            pushFollow(FOLLOW_1);
            rulePlatformID();

            state._fsp--;

             after(grammarAccess.getPlatformIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatformID"


    // $ANTLR start "rulePlatformID"
    // InternalLang.g:137:1: rulePlatformID : ( ( rule__PlatformID__NameAssignment ) ) ;
    public final void rulePlatformID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:141:2: ( ( ( rule__PlatformID__NameAssignment ) ) )
            // InternalLang.g:142:2: ( ( rule__PlatformID__NameAssignment ) )
            {
            // InternalLang.g:142:2: ( ( rule__PlatformID__NameAssignment ) )
            // InternalLang.g:143:3: ( rule__PlatformID__NameAssignment )
            {
             before(grammarAccess.getPlatformIDAccess().getNameAssignment()); 
            // InternalLang.g:144:3: ( rule__PlatformID__NameAssignment )
            // InternalLang.g:144:4: rule__PlatformID__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PlatformID__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPlatformIDAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformID"


    // $ANTLR start "entryRuleNamespace"
    // InternalLang.g:153:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalLang.g:154:1: ( ruleNamespace EOF )
            // InternalLang.g:155:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalLang.g:162:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:166:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalLang.g:167:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalLang.g:167:2: ( ( rule__Namespace__Group__0 ) )
            // InternalLang.g:168:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalLang.g:169:3: ( rule__Namespace__Group__0 )
            // InternalLang.g:169:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleAlias"
    // InternalLang.g:178:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalLang.g:179:1: ( ruleAlias EOF )
            // InternalLang.g:180:1: ruleAlias EOF
            {
             before(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalLang.g:187:1: ruleAlias : ( ( rule__Alias__Group__0 ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:191:2: ( ( ( rule__Alias__Group__0 ) ) )
            // InternalLang.g:192:2: ( ( rule__Alias__Group__0 ) )
            {
            // InternalLang.g:192:2: ( ( rule__Alias__Group__0 ) )
            // InternalLang.g:193:3: ( rule__Alias__Group__0 )
            {
             before(grammarAccess.getAliasAccess().getGroup()); 
            // InternalLang.g:194:3: ( rule__Alias__Group__0 )
            // InternalLang.g:194:4: rule__Alias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleSingleAlias"
    // InternalLang.g:203:1: entryRuleSingleAlias : ruleSingleAlias EOF ;
    public final void entryRuleSingleAlias() throws RecognitionException {
        try {
            // InternalLang.g:204:1: ( ruleSingleAlias EOF )
            // InternalLang.g:205:1: ruleSingleAlias EOF
            {
             before(grammarAccess.getSingleAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleAlias();

            state._fsp--;

             after(grammarAccess.getSingleAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleAlias"


    // $ANTLR start "ruleSingleAlias"
    // InternalLang.g:212:1: ruleSingleAlias : ( ( rule__SingleAlias__Group__0 ) ) ;
    public final void ruleSingleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:216:2: ( ( ( rule__SingleAlias__Group__0 ) ) )
            // InternalLang.g:217:2: ( ( rule__SingleAlias__Group__0 ) )
            {
            // InternalLang.g:217:2: ( ( rule__SingleAlias__Group__0 ) )
            // InternalLang.g:218:3: ( rule__SingleAlias__Group__0 )
            {
             before(grammarAccess.getSingleAliasAccess().getGroup()); 
            // InternalLang.g:219:3: ( rule__SingleAlias__Group__0 )
            // InternalLang.g:219:4: rule__SingleAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleAlias"


    // $ANTLR start "entryRuleAliasList"
    // InternalLang.g:228:1: entryRuleAliasList : ruleAliasList EOF ;
    public final void entryRuleAliasList() throws RecognitionException {
        try {
            // InternalLang.g:229:1: ( ruleAliasList EOF )
            // InternalLang.g:230:1: ruleAliasList EOF
            {
             before(grammarAccess.getAliasListRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasList();

            state._fsp--;

             after(grammarAccess.getAliasListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasList"


    // $ANTLR start "ruleAliasList"
    // InternalLang.g:237:1: ruleAliasList : ( ( rule__AliasList__Group__0 ) ) ;
    public final void ruleAliasList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:241:2: ( ( ( rule__AliasList__Group__0 ) ) )
            // InternalLang.g:242:2: ( ( rule__AliasList__Group__0 ) )
            {
            // InternalLang.g:242:2: ( ( rule__AliasList__Group__0 ) )
            // InternalLang.g:243:3: ( rule__AliasList__Group__0 )
            {
             before(grammarAccess.getAliasListAccess().getGroup()); 
            // InternalLang.g:244:3: ( rule__AliasList__Group__0 )
            // InternalLang.g:244:4: rule__AliasList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasList"


    // $ANTLR start "entryRuleAliasRule"
    // InternalLang.g:253:1: entryRuleAliasRule : ruleAliasRule EOF ;
    public final void entryRuleAliasRule() throws RecognitionException {
        try {
            // InternalLang.g:254:1: ( ruleAliasRule EOF )
            // InternalLang.g:255:1: ruleAliasRule EOF
            {
             before(grammarAccess.getAliasRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasRule();

            state._fsp--;

             after(grammarAccess.getAliasRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasRule"


    // $ANTLR start "ruleAliasRule"
    // InternalLang.g:262:1: ruleAliasRule : ( ( rule__AliasRule__Group__0 ) ) ;
    public final void ruleAliasRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:266:2: ( ( ( rule__AliasRule__Group__0 ) ) )
            // InternalLang.g:267:2: ( ( rule__AliasRule__Group__0 ) )
            {
            // InternalLang.g:267:2: ( ( rule__AliasRule__Group__0 ) )
            // InternalLang.g:268:3: ( rule__AliasRule__Group__0 )
            {
             before(grammarAccess.getAliasRuleAccess().getGroup()); 
            // InternalLang.g:269:3: ( rule__AliasRule__Group__0 )
            // InternalLang.g:269:4: rule__AliasRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasRule"


    // $ANTLR start "entryRuleComponent"
    // InternalLang.g:278:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalLang.g:279:1: ( ruleComponent EOF )
            // InternalLang.g:280:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalLang.g:287:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:291:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalLang.g:292:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalLang.g:292:2: ( ( rule__Component__Group__0 ) )
            // InternalLang.g:293:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalLang.g:294:3: ( rule__Component__Group__0 )
            // InternalLang.g:294:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentProperty"
    // InternalLang.g:303:1: entryRuleComponentProperty : ruleComponentProperty EOF ;
    public final void entryRuleComponentProperty() throws RecognitionException {
        try {
            // InternalLang.g:304:1: ( ruleComponentProperty EOF )
            // InternalLang.g:305:1: ruleComponentProperty EOF
            {
             before(grammarAccess.getComponentPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentProperty"


    // $ANTLR start "ruleComponentProperty"
    // InternalLang.g:312:1: ruleComponentProperty : ( ( rule__ComponentProperty__Group__0 ) ) ;
    public final void ruleComponentProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:316:2: ( ( ( rule__ComponentProperty__Group__0 ) ) )
            // InternalLang.g:317:2: ( ( rule__ComponentProperty__Group__0 ) )
            {
            // InternalLang.g:317:2: ( ( rule__ComponentProperty__Group__0 ) )
            // InternalLang.g:318:3: ( rule__ComponentProperty__Group__0 )
            {
             before(grammarAccess.getComponentPropertyAccess().getGroup()); 
            // InternalLang.g:319:3: ( rule__ComponentProperty__Group__0 )
            // InternalLang.g:319:4: rule__ComponentProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentProperty"


    // $ANTLR start "entryRuleSystem"
    // InternalLang.g:328:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalLang.g:329:1: ( ruleSystem EOF )
            // InternalLang.g:330:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalLang.g:337:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:341:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalLang.g:342:2: ( ( rule__System__Group__0 ) )
            {
            // InternalLang.g:342:2: ( ( rule__System__Group__0 ) )
            // InternalLang.g:343:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalLang.g:344:3: ( rule__System__Group__0 )
            // InternalLang.g:344:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleInput"
    // InternalLang.g:353:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalLang.g:354:1: ( ruleInput EOF )
            // InternalLang.g:355:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalLang.g:362:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:366:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalLang.g:367:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalLang.g:367:2: ( ( rule__Input__Group__0 ) )
            // InternalLang.g:368:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalLang.g:369:3: ( rule__Input__Group__0 )
            // InternalLang.g:369:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputTrigger"
    // InternalLang.g:378:1: entryRuleInputTrigger : ruleInputTrigger EOF ;
    public final void entryRuleInputTrigger() throws RecognitionException {
        try {
            // InternalLang.g:379:1: ( ruleInputTrigger EOF )
            // InternalLang.g:380:1: ruleInputTrigger EOF
            {
             before(grammarAccess.getInputTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleInputTrigger();

            state._fsp--;

             after(grammarAccess.getInputTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputTrigger"


    // $ANTLR start "ruleInputTrigger"
    // InternalLang.g:387:1: ruleInputTrigger : ( ( rule__InputTrigger__Alternatives ) ) ;
    public final void ruleInputTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:391:2: ( ( ( rule__InputTrigger__Alternatives ) ) )
            // InternalLang.g:392:2: ( ( rule__InputTrigger__Alternatives ) )
            {
            // InternalLang.g:392:2: ( ( rule__InputTrigger__Alternatives ) )
            // InternalLang.g:393:3: ( rule__InputTrigger__Alternatives )
            {
             before(grammarAccess.getInputTriggerAccess().getAlternatives()); 
            // InternalLang.g:394:3: ( rule__InputTrigger__Alternatives )
            // InternalLang.g:394:4: rule__InputTrigger__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputTrigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputTriggerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputTrigger"


    // $ANTLR start "entryRuleCreateRule"
    // InternalLang.g:403:1: entryRuleCreateRule : ruleCreateRule EOF ;
    public final void entryRuleCreateRule() throws RecognitionException {
        try {
            // InternalLang.g:404:1: ( ruleCreateRule EOF )
            // InternalLang.g:405:1: ruleCreateRule EOF
            {
             before(grammarAccess.getCreateRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateRule();

            state._fsp--;

             after(grammarAccess.getCreateRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCreateRule"


    // $ANTLR start "ruleCreateRule"
    // InternalLang.g:412:1: ruleCreateRule : ( ( rule__CreateRule__Group__0 ) ) ;
    public final void ruleCreateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:416:2: ( ( ( rule__CreateRule__Group__0 ) ) )
            // InternalLang.g:417:2: ( ( rule__CreateRule__Group__0 ) )
            {
            // InternalLang.g:417:2: ( ( rule__CreateRule__Group__0 ) )
            // InternalLang.g:418:3: ( rule__CreateRule__Group__0 )
            {
             before(grammarAccess.getCreateRuleAccess().getGroup()); 
            // InternalLang.g:419:3: ( rule__CreateRule__Group__0 )
            // InternalLang.g:419:4: rule__CreateRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateRule"


    // $ANTLR start "entryRuleUniqueComponentAccess"
    // InternalLang.g:428:1: entryRuleUniqueComponentAccess : ruleUniqueComponentAccess EOF ;
    public final void entryRuleUniqueComponentAccess() throws RecognitionException {
        try {
            // InternalLang.g:429:1: ( ruleUniqueComponentAccess EOF )
            // InternalLang.g:430:1: ruleUniqueComponentAccess EOF
            {
             before(grammarAccess.getUniqueComponentAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleUniqueComponentAccess();

            state._fsp--;

             after(grammarAccess.getUniqueComponentAccessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniqueComponentAccess"


    // $ANTLR start "ruleUniqueComponentAccess"
    // InternalLang.g:437:1: ruleUniqueComponentAccess : ( ( rule__UniqueComponentAccess__Group__0 ) ) ;
    public final void ruleUniqueComponentAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:441:2: ( ( ( rule__UniqueComponentAccess__Group__0 ) ) )
            // InternalLang.g:442:2: ( ( rule__UniqueComponentAccess__Group__0 ) )
            {
            // InternalLang.g:442:2: ( ( rule__UniqueComponentAccess__Group__0 ) )
            // InternalLang.g:443:3: ( rule__UniqueComponentAccess__Group__0 )
            {
             before(grammarAccess.getUniqueComponentAccessAccess().getGroup()); 
            // InternalLang.g:444:3: ( rule__UniqueComponentAccess__Group__0 )
            // InternalLang.g:444:4: rule__UniqueComponentAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniqueComponentAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueComponentAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniqueComponentAccess"


    // $ANTLR start "entryRuleGroup"
    // InternalLang.g:453:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalLang.g:454:1: ( ruleGroup EOF )
            // InternalLang.g:455:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalLang.g:462:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:466:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalLang.g:467:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalLang.g:467:2: ( ( rule__Group__Group__0 ) )
            // InternalLang.g:468:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalLang.g:469:3: ( rule__Group__Group__0 )
            // InternalLang.g:469:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleApiRule"
    // InternalLang.g:478:1: entryRuleApiRule : ruleApiRule EOF ;
    public final void entryRuleApiRule() throws RecognitionException {
        try {
            // InternalLang.g:479:1: ( ruleApiRule EOF )
            // InternalLang.g:480:1: ruleApiRule EOF
            {
             before(grammarAccess.getApiRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleApiRule();

            state._fsp--;

             after(grammarAccess.getApiRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApiRule"


    // $ANTLR start "ruleApiRule"
    // InternalLang.g:487:1: ruleApiRule : ( ( rule__ApiRule__Group__0 ) ) ;
    public final void ruleApiRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:491:2: ( ( ( rule__ApiRule__Group__0 ) ) )
            // InternalLang.g:492:2: ( ( rule__ApiRule__Group__0 ) )
            {
            // InternalLang.g:492:2: ( ( rule__ApiRule__Group__0 ) )
            // InternalLang.g:493:3: ( rule__ApiRule__Group__0 )
            {
             before(grammarAccess.getApiRuleAccess().getGroup()); 
            // InternalLang.g:494:3: ( rule__ApiRule__Group__0 )
            // InternalLang.g:494:4: rule__ApiRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApiRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApiRule"


    // $ANTLR start "entryRuleComponentApiAccessor"
    // InternalLang.g:503:1: entryRuleComponentApiAccessor : ruleComponentApiAccessor EOF ;
    public final void entryRuleComponentApiAccessor() throws RecognitionException {
        try {
            // InternalLang.g:504:1: ( ruleComponentApiAccessor EOF )
            // InternalLang.g:505:1: ruleComponentApiAccessor EOF
            {
             before(grammarAccess.getComponentApiAccessorRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentApiAccessor();

            state._fsp--;

             after(grammarAccess.getComponentApiAccessorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentApiAccessor"


    // $ANTLR start "ruleComponentApiAccessor"
    // InternalLang.g:512:1: ruleComponentApiAccessor : ( ( rule__ComponentApiAccessor__Alternatives ) ) ;
    public final void ruleComponentApiAccessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:516:2: ( ( ( rule__ComponentApiAccessor__Alternatives ) ) )
            // InternalLang.g:517:2: ( ( rule__ComponentApiAccessor__Alternatives ) )
            {
            // InternalLang.g:517:2: ( ( rule__ComponentApiAccessor__Alternatives ) )
            // InternalLang.g:518:3: ( rule__ComponentApiAccessor__Alternatives )
            {
             before(grammarAccess.getComponentApiAccessorAccess().getAlternatives()); 
            // InternalLang.g:519:3: ( rule__ComponentApiAccessor__Alternatives )
            // InternalLang.g:519:4: rule__ComponentApiAccessor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentApiAccessor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentApiAccessorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentApiAccessor"


    // $ANTLR start "entryRuleParentSystem"
    // InternalLang.g:528:1: entryRuleParentSystem : ruleParentSystem EOF ;
    public final void entryRuleParentSystem() throws RecognitionException {
        try {
            // InternalLang.g:529:1: ( ruleParentSystem EOF )
            // InternalLang.g:530:1: ruleParentSystem EOF
            {
             before(grammarAccess.getParentSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleParentSystem();

            state._fsp--;

             after(grammarAccess.getParentSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParentSystem"


    // $ANTLR start "ruleParentSystem"
    // InternalLang.g:537:1: ruleParentSystem : ( ( rule__ParentSystem__Group__0 ) ) ;
    public final void ruleParentSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:541:2: ( ( ( rule__ParentSystem__Group__0 ) ) )
            // InternalLang.g:542:2: ( ( rule__ParentSystem__Group__0 ) )
            {
            // InternalLang.g:542:2: ( ( rule__ParentSystem__Group__0 ) )
            // InternalLang.g:543:3: ( rule__ParentSystem__Group__0 )
            {
             before(grammarAccess.getParentSystemAccess().getGroup()); 
            // InternalLang.g:544:3: ( rule__ParentSystem__Group__0 )
            // InternalLang.g:544:4: rule__ParentSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParentSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParentSystem"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLang.g:553:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLang.g:554:1: ( ruleQualifiedName EOF )
            // InternalLang.g:555:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLang.g:562:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:566:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLang.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLang.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLang.g:568:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLang.g:569:3: ( rule__QualifiedName__Group__0 )
            // InternalLang.g:569:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValidID"
    // InternalLang.g:578:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalLang.g:579:1: ( ruleValidID EOF )
            // InternalLang.g:580:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalLang.g:587:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:591:2: ( ( RULE_ID ) )
            // InternalLang.g:592:2: ( RULE_ID )
            {
            // InternalLang.g:592:2: ( RULE_ID )
            // InternalLang.g:593:3: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "rule__Alias__Alternatives_4"
    // InternalLang.g:602:1: rule__Alias__Alternatives_4 : ( ( ( rule__Alias__ListOfAliasesAssignment_4_0 ) ) | ( ( rule__Alias__SingleAliasAssignment_4_1 ) ) );
    public final void rule__Alias__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:606:1: ( ( ( rule__Alias__ListOfAliasesAssignment_4_0 ) ) | ( ( rule__Alias__SingleAliasAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLang.g:607:2: ( ( rule__Alias__ListOfAliasesAssignment_4_0 ) )
                    {
                    // InternalLang.g:607:2: ( ( rule__Alias__ListOfAliasesAssignment_4_0 ) )
                    // InternalLang.g:608:3: ( rule__Alias__ListOfAliasesAssignment_4_0 )
                    {
                     before(grammarAccess.getAliasAccess().getListOfAliasesAssignment_4_0()); 
                    // InternalLang.g:609:3: ( rule__Alias__ListOfAliasesAssignment_4_0 )
                    // InternalLang.g:609:4: rule__Alias__ListOfAliasesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alias__ListOfAliasesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAliasAccess().getListOfAliasesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:613:2: ( ( rule__Alias__SingleAliasAssignment_4_1 ) )
                    {
                    // InternalLang.g:613:2: ( ( rule__Alias__SingleAliasAssignment_4_1 ) )
                    // InternalLang.g:614:3: ( rule__Alias__SingleAliasAssignment_4_1 )
                    {
                     before(grammarAccess.getAliasAccess().getSingleAliasAssignment_4_1()); 
                    // InternalLang.g:615:3: ( rule__Alias__SingleAliasAssignment_4_1 )
                    // InternalLang.g:615:4: rule__Alias__SingleAliasAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alias__SingleAliasAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAliasAccess().getSingleAliasAssignment_4_1()); 

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
    // $ANTLR end "rule__Alias__Alternatives_4"


    // $ANTLR start "rule__Component__Alternatives_3"
    // InternalLang.g:623:1: rule__Component__Alternatives_3 : ( ( ( rule__Component__Alternatives_3_0 ) ) | ( ( rule__Component__Group_3_1__0 ) ) );
    public final void rule__Component__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:627:1: ( ( ( rule__Component__Alternatives_3_0 ) ) | ( ( rule__Component__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||(LA2_0>=16 && LA2_0<=17)||(LA2_0>=23 && LA2_0<=24)||LA2_0==26||LA2_0==43) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLang.g:628:2: ( ( rule__Component__Alternatives_3_0 ) )
                    {
                    // InternalLang.g:628:2: ( ( rule__Component__Alternatives_3_0 ) )
                    // InternalLang.g:629:3: ( rule__Component__Alternatives_3_0 )
                    {
                     before(grammarAccess.getComponentAccess().getAlternatives_3_0()); 
                    // InternalLang.g:630:3: ( rule__Component__Alternatives_3_0 )
                    // InternalLang.g:630:4: rule__Component__Alternatives_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getAlternatives_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:634:2: ( ( rule__Component__Group_3_1__0 ) )
                    {
                    // InternalLang.g:634:2: ( ( rule__Component__Group_3_1__0 ) )
                    // InternalLang.g:635:3: ( rule__Component__Group_3_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_3_1()); 
                    // InternalLang.g:636:3: ( rule__Component__Group_3_1__0 )
                    // InternalLang.g:636:4: rule__Component__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Component__Alternatives_3"


    // $ANTLR start "rule__Component__Alternatives_3_0"
    // InternalLang.g:644:1: rule__Component__Alternatives_3_0 : ( ( ( rule__Component__Group_3_0_0__0 )? ) | ( ( rule__Component__Group_3_0_1__0 ) ) );
    public final void rule__Component__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:648:1: ( ( ( rule__Component__Group_3_0_0__0 )? ) | ( ( rule__Component__Group_3_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||LA4_0==16||(LA4_0>=23 && LA4_0<=24)||LA4_0==26||LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLang.g:649:2: ( ( rule__Component__Group_3_0_0__0 )? )
                    {
                    // InternalLang.g:649:2: ( ( rule__Component__Group_3_0_0__0 )? )
                    // InternalLang.g:650:3: ( rule__Component__Group_3_0_0__0 )?
                    {
                     before(grammarAccess.getComponentAccess().getGroup_3_0_0()); 
                    // InternalLang.g:651:3: ( rule__Component__Group_3_0_0__0 )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==23) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalLang.g:651:4: rule__Component__Group_3_0_0__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Component__Group_3_0_0__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getComponentAccess().getGroup_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:655:2: ( ( rule__Component__Group_3_0_1__0 ) )
                    {
                    // InternalLang.g:655:2: ( ( rule__Component__Group_3_0_1__0 ) )
                    // InternalLang.g:656:3: ( rule__Component__Group_3_0_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_3_0_1()); 
                    // InternalLang.g:657:3: ( rule__Component__Group_3_0_1__0 )
                    // InternalLang.g:657:4: rule__Component__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_3_0_1()); 

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
    // $ANTLR end "rule__Component__Alternatives_3_0"


    // $ANTLR start "rule__InputTrigger__Alternatives"
    // InternalLang.g:665:1: rule__InputTrigger__Alternatives : ( ( ( rule__InputTrigger__Group_0__0 ) ) | ( ( rule__InputTrigger__Group_1__0 ) ) | ( ( rule__InputTrigger__Group_2__0 ) ) );
    public final void rule__InputTrigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:669:1: ( ( ( rule__InputTrigger__Group_0__0 ) ) | ( ( rule__InputTrigger__Group_1__0 ) ) | ( ( rule__InputTrigger__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLang.g:670:2: ( ( rule__InputTrigger__Group_0__0 ) )
                    {
                    // InternalLang.g:670:2: ( ( rule__InputTrigger__Group_0__0 ) )
                    // InternalLang.g:671:3: ( rule__InputTrigger__Group_0__0 )
                    {
                     before(grammarAccess.getInputTriggerAccess().getGroup_0()); 
                    // InternalLang.g:672:3: ( rule__InputTrigger__Group_0__0 )
                    // InternalLang.g:672:4: rule__InputTrigger__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputTrigger__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputTriggerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:676:2: ( ( rule__InputTrigger__Group_1__0 ) )
                    {
                    // InternalLang.g:676:2: ( ( rule__InputTrigger__Group_1__0 ) )
                    // InternalLang.g:677:3: ( rule__InputTrigger__Group_1__0 )
                    {
                     before(grammarAccess.getInputTriggerAccess().getGroup_1()); 
                    // InternalLang.g:678:3: ( rule__InputTrigger__Group_1__0 )
                    // InternalLang.g:678:4: rule__InputTrigger__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputTrigger__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputTriggerAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:682:2: ( ( rule__InputTrigger__Group_2__0 ) )
                    {
                    // InternalLang.g:682:2: ( ( rule__InputTrigger__Group_2__0 ) )
                    // InternalLang.g:683:3: ( rule__InputTrigger__Group_2__0 )
                    {
                     before(grammarAccess.getInputTriggerAccess().getGroup_2()); 
                    // InternalLang.g:684:3: ( rule__InputTrigger__Group_2__0 )
                    // InternalLang.g:684:4: rule__InputTrigger__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputTrigger__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputTriggerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__InputTrigger__Alternatives"


    // $ANTLR start "rule__Group__Alternatives_0"
    // InternalLang.g:692:1: rule__Group__Alternatives_0 : ( ( ( rule__Group__GroupAssignment_0_0 ) ) | ( ( rule__Group__UniqueAssignment_0_1 ) ) );
    public final void rule__Group__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:696:1: ( ( ( rule__Group__GroupAssignment_0_0 ) ) | ( ( rule__Group__UniqueAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLang.g:697:2: ( ( rule__Group__GroupAssignment_0_0 ) )
                    {
                    // InternalLang.g:697:2: ( ( rule__Group__GroupAssignment_0_0 ) )
                    // InternalLang.g:698:3: ( rule__Group__GroupAssignment_0_0 )
                    {
                     before(grammarAccess.getGroupAccess().getGroupAssignment_0_0()); 
                    // InternalLang.g:699:3: ( rule__Group__GroupAssignment_0_0 )
                    // InternalLang.g:699:4: rule__Group__GroupAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__GroupAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAccess().getGroupAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:703:2: ( ( rule__Group__UniqueAssignment_0_1 ) )
                    {
                    // InternalLang.g:703:2: ( ( rule__Group__UniqueAssignment_0_1 ) )
                    // InternalLang.g:704:3: ( rule__Group__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getGroupAccess().getUniqueAssignment_0_1()); 
                    // InternalLang.g:705:3: ( rule__Group__UniqueAssignment_0_1 )
                    // InternalLang.g:705:4: rule__Group__UniqueAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__UniqueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAccess().getUniqueAssignment_0_1()); 

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
    // $ANTLR end "rule__Group__Alternatives_0"


    // $ANTLR start "rule__ComponentApiAccessor__Alternatives"
    // InternalLang.g:713:1: rule__ComponentApiAccessor__Alternatives : ( ( 'add' ) | ( 'get' ) | ( 'has' ) | ( 'replace' ) | ( 'remove' ) );
    public final void rule__ComponentApiAccessor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:717:1: ( ( 'add' ) | ( 'get' ) | ( 'has' ) | ( 'replace' ) | ( 'remove' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLang.g:718:2: ( 'add' )
                    {
                    // InternalLang.g:718:2: ( 'add' )
                    // InternalLang.g:719:3: 'add'
                    {
                     before(grammarAccess.getComponentApiAccessorAccess().getAddKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComponentApiAccessorAccess().getAddKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:724:2: ( 'get' )
                    {
                    // InternalLang.g:724:2: ( 'get' )
                    // InternalLang.g:725:3: 'get'
                    {
                     before(grammarAccess.getComponentApiAccessorAccess().getGetKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComponentApiAccessorAccess().getGetKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:730:2: ( 'has' )
                    {
                    // InternalLang.g:730:2: ( 'has' )
                    // InternalLang.g:731:3: 'has'
                    {
                     before(grammarAccess.getComponentApiAccessorAccess().getHasKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComponentApiAccessorAccess().getHasKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLang.g:736:2: ( 'replace' )
                    {
                    // InternalLang.g:736:2: ( 'replace' )
                    // InternalLang.g:737:3: 'replace'
                    {
                     before(grammarAccess.getComponentApiAccessorAccess().getReplaceKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComponentApiAccessorAccess().getReplaceKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLang.g:742:2: ( 'remove' )
                    {
                    // InternalLang.g:742:2: ( 'remove' )
                    // InternalLang.g:743:3: 'remove'
                    {
                     before(grammarAccess.getComponentApiAccessorAccess().getRemoveKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComponentApiAccessorAccess().getRemoveKeyword_4()); 

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
    // $ANTLR end "rule__ComponentApiAccessor__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalLang.g:752:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:756:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalLang.g:757:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalLang.g:764:1: rule__Project__Group__0__Impl : ( ( rule__Project__PlatformDefinitionAssignment_0 ) ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:768:1: ( ( ( rule__Project__PlatformDefinitionAssignment_0 ) ) )
            // InternalLang.g:769:1: ( ( rule__Project__PlatformDefinitionAssignment_0 ) )
            {
            // InternalLang.g:769:1: ( ( rule__Project__PlatformDefinitionAssignment_0 ) )
            // InternalLang.g:770:2: ( rule__Project__PlatformDefinitionAssignment_0 )
            {
             before(grammarAccess.getProjectAccess().getPlatformDefinitionAssignment_0()); 
            // InternalLang.g:771:2: ( rule__Project__PlatformDefinitionAssignment_0 )
            // InternalLang.g:771:3: rule__Project__PlatformDefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Project__PlatformDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPlatformDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalLang.g:779:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:783:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalLang.g:784:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalLang.g:791:1: rule__Project__Group__1__Impl : ( ( rule__Project__NamespaceAssignment_1 )? ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:795:1: ( ( ( rule__Project__NamespaceAssignment_1 )? ) )
            // InternalLang.g:796:1: ( ( rule__Project__NamespaceAssignment_1 )? )
            {
            // InternalLang.g:796:1: ( ( rule__Project__NamespaceAssignment_1 )? )
            // InternalLang.g:797:2: ( rule__Project__NamespaceAssignment_1 )?
            {
             before(grammarAccess.getProjectAccess().getNamespaceAssignment_1()); 
            // InternalLang.g:798:2: ( rule__Project__NamespaceAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLang.g:798:3: rule__Project__NamespaceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__NamespaceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalLang.g:806:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:810:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalLang.g:811:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalLang.g:818:1: rule__Project__Group__2__Impl : ( ( rule__Project__TypeAliasesAssignment_2 )* ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:822:1: ( ( ( rule__Project__TypeAliasesAssignment_2 )* ) )
            // InternalLang.g:823:1: ( ( rule__Project__TypeAliasesAssignment_2 )* )
            {
            // InternalLang.g:823:1: ( ( rule__Project__TypeAliasesAssignment_2 )* )
            // InternalLang.g:824:2: ( rule__Project__TypeAliasesAssignment_2 )*
            {
             before(grammarAccess.getProjectAccess().getTypeAliasesAssignment_2()); 
            // InternalLang.g:825:2: ( rule__Project__TypeAliasesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLang.g:825:3: rule__Project__TypeAliasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Project__TypeAliasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getTypeAliasesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalLang.g:833:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:837:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalLang.g:838:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalLang.g:845:1: rule__Project__Group__3__Impl : ( ( rule__Project__ComponentsAssignment_3 )* ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:849:1: ( ( ( rule__Project__ComponentsAssignment_3 )* ) )
            // InternalLang.g:850:1: ( ( rule__Project__ComponentsAssignment_3 )* )
            {
            // InternalLang.g:850:1: ( ( rule__Project__ComponentsAssignment_3 )* )
            // InternalLang.g:851:2: ( rule__Project__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getProjectAccess().getComponentsAssignment_3()); 
            // InternalLang.g:852:2: ( rule__Project__ComponentsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLang.g:852:3: rule__Project__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Project__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getComponentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalLang.g:860:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:864:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalLang.g:865:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalLang.g:872:1: rule__Project__Group__4__Impl : ( ( rule__Project__SystemsAssignment_4 )* ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:876:1: ( ( ( rule__Project__SystemsAssignment_4 )* ) )
            // InternalLang.g:877:1: ( ( rule__Project__SystemsAssignment_4 )* )
            {
            // InternalLang.g:877:1: ( ( rule__Project__SystemsAssignment_4 )* )
            // InternalLang.g:878:2: ( rule__Project__SystemsAssignment_4 )*
            {
             before(grammarAccess.getProjectAccess().getSystemsAssignment_4()); 
            // InternalLang.g:879:2: ( rule__Project__SystemsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLang.g:879:3: rule__Project__SystemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Project__SystemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getSystemsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalLang.g:887:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:891:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalLang.g:892:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalLang.g:899:1: rule__Project__Group__5__Impl : ( ( rule__Project__ParentSystemsAssignment_5 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:903:1: ( ( ( rule__Project__ParentSystemsAssignment_5 )* ) )
            // InternalLang.g:904:1: ( ( rule__Project__ParentSystemsAssignment_5 )* )
            {
            // InternalLang.g:904:1: ( ( rule__Project__ParentSystemsAssignment_5 )* )
            // InternalLang.g:905:2: ( rule__Project__ParentSystemsAssignment_5 )*
            {
             before(grammarAccess.getProjectAccess().getParentSystemsAssignment_5()); 
            // InternalLang.g:906:2: ( rule__Project__ParentSystemsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLang.g:906:3: rule__Project__ParentSystemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Project__ParentSystemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getParentSystemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalLang.g:914:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:918:1: ( rule__Project__Group__6__Impl )
            // InternalLang.g:919:2: rule__Project__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalLang.g:925:1: rule__Project__Group__6__Impl : ( ( rule__Project__ContextDefinitionsAssignment_6 )* ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:929:1: ( ( ( rule__Project__ContextDefinitionsAssignment_6 )* ) )
            // InternalLang.g:930:1: ( ( rule__Project__ContextDefinitionsAssignment_6 )* )
            {
            // InternalLang.g:930:1: ( ( rule__Project__ContextDefinitionsAssignment_6 )* )
            // InternalLang.g:931:2: ( rule__Project__ContextDefinitionsAssignment_6 )*
            {
             before(grammarAccess.getProjectAccess().getContextDefinitionsAssignment_6()); 
            // InternalLang.g:932:2: ( rule__Project__ContextDefinitionsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLang.g:932:3: rule__Project__ContextDefinitionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Project__ContextDefinitionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getContextDefinitionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__ContextDefinition__Group__0"
    // InternalLang.g:941:1: rule__ContextDefinition__Group__0 : rule__ContextDefinition__Group__0__Impl rule__ContextDefinition__Group__1 ;
    public final void rule__ContextDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:945:1: ( rule__ContextDefinition__Group__0__Impl rule__ContextDefinition__Group__1 )
            // InternalLang.g:946:2: rule__ContextDefinition__Group__0__Impl rule__ContextDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ContextDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__0"


    // $ANTLR start "rule__ContextDefinition__Group__0__Impl"
    // InternalLang.g:953:1: rule__ContextDefinition__Group__0__Impl : ( 'ctx' ) ;
    public final void rule__ContextDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:957:1: ( ( 'ctx' ) )
            // InternalLang.g:958:1: ( 'ctx' )
            {
            // InternalLang.g:958:1: ( 'ctx' )
            // InternalLang.g:959:2: 'ctx'
            {
             before(grammarAccess.getContextDefinitionAccess().getCtxKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContextDefinitionAccess().getCtxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContextDefinition__Group__1"
    // InternalLang.g:968:1: rule__ContextDefinition__Group__1 : rule__ContextDefinition__Group__1__Impl rule__ContextDefinition__Group__2 ;
    public final void rule__ContextDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:972:1: ( rule__ContextDefinition__Group__1__Impl rule__ContextDefinition__Group__2 )
            // InternalLang.g:973:2: rule__ContextDefinition__Group__1__Impl rule__ContextDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ContextDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__1"


    // $ANTLR start "rule__ContextDefinition__Group__1__Impl"
    // InternalLang.g:980:1: rule__ContextDefinition__Group__1__Impl : ( ( ( rule__ContextDefinition__NameAssignment_1 ) ) ( ( rule__ContextDefinition__NameAssignment_1 )* ) ) ;
    public final void rule__ContextDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:984:1: ( ( ( ( rule__ContextDefinition__NameAssignment_1 ) ) ( ( rule__ContextDefinition__NameAssignment_1 )* ) ) )
            // InternalLang.g:985:1: ( ( ( rule__ContextDefinition__NameAssignment_1 ) ) ( ( rule__ContextDefinition__NameAssignment_1 )* ) )
            {
            // InternalLang.g:985:1: ( ( ( rule__ContextDefinition__NameAssignment_1 ) ) ( ( rule__ContextDefinition__NameAssignment_1 )* ) )
            // InternalLang.g:986:2: ( ( rule__ContextDefinition__NameAssignment_1 ) ) ( ( rule__ContextDefinition__NameAssignment_1 )* )
            {
            // InternalLang.g:986:2: ( ( rule__ContextDefinition__NameAssignment_1 ) )
            // InternalLang.g:987:3: ( rule__ContextDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getContextDefinitionAccess().getNameAssignment_1()); 
            // InternalLang.g:988:3: ( rule__ContextDefinition__NameAssignment_1 )
            // InternalLang.g:988:4: rule__ContextDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ContextDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextDefinitionAccess().getNameAssignment_1()); 

            }

            // InternalLang.g:991:2: ( ( rule__ContextDefinition__NameAssignment_1 )* )
            // InternalLang.g:992:3: ( rule__ContextDefinition__NameAssignment_1 )*
            {
             before(grammarAccess.getContextDefinitionAccess().getNameAssignment_1()); 
            // InternalLang.g:993:3: ( rule__ContextDefinition__NameAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLang.g:993:4: rule__ContextDefinition__NameAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ContextDefinition__NameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getContextDefinitionAccess().getNameAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContextDefinition__Group__2"
    // InternalLang.g:1002:1: rule__ContextDefinition__Group__2 : rule__ContextDefinition__Group__2__Impl rule__ContextDefinition__Group__3 ;
    public final void rule__ContextDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1006:1: ( rule__ContextDefinition__Group__2__Impl rule__ContextDefinition__Group__3 )
            // InternalLang.g:1007:2: rule__ContextDefinition__Group__2__Impl rule__ContextDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ContextDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__2"


    // $ANTLR start "rule__ContextDefinition__Group__2__Impl"
    // InternalLang.g:1014:1: rule__ContextDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1018:1: ( ( '{' ) )
            // InternalLang.g:1019:1: ( '{' )
            {
            // InternalLang.g:1019:1: ( '{' )
            // InternalLang.g:1020:2: '{'
            {
             before(grammarAccess.getContextDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContextDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContextDefinition__Group__3"
    // InternalLang.g:1029:1: rule__ContextDefinition__Group__3 : rule__ContextDefinition__Group__3__Impl rule__ContextDefinition__Group__4 ;
    public final void rule__ContextDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1033:1: ( rule__ContextDefinition__Group__3__Impl rule__ContextDefinition__Group__4 )
            // InternalLang.g:1034:2: rule__ContextDefinition__Group__3__Impl rule__ContextDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ContextDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__3"


    // $ANTLR start "rule__ContextDefinition__Group__3__Impl"
    // InternalLang.g:1041:1: rule__ContextDefinition__Group__3__Impl : ( ( ( rule__ContextDefinition__ComponentsAssignment_3 ) ) ( ( rule__ContextDefinition__ComponentsAssignment_3 )* ) ) ;
    public final void rule__ContextDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1045:1: ( ( ( ( rule__ContextDefinition__ComponentsAssignment_3 ) ) ( ( rule__ContextDefinition__ComponentsAssignment_3 )* ) ) )
            // InternalLang.g:1046:1: ( ( ( rule__ContextDefinition__ComponentsAssignment_3 ) ) ( ( rule__ContextDefinition__ComponentsAssignment_3 )* ) )
            {
            // InternalLang.g:1046:1: ( ( ( rule__ContextDefinition__ComponentsAssignment_3 ) ) ( ( rule__ContextDefinition__ComponentsAssignment_3 )* ) )
            // InternalLang.g:1047:2: ( ( rule__ContextDefinition__ComponentsAssignment_3 ) ) ( ( rule__ContextDefinition__ComponentsAssignment_3 )* )
            {
            // InternalLang.g:1047:2: ( ( rule__ContextDefinition__ComponentsAssignment_3 ) )
            // InternalLang.g:1048:3: ( rule__ContextDefinition__ComponentsAssignment_3 )
            {
             before(grammarAccess.getContextDefinitionAccess().getComponentsAssignment_3()); 
            // InternalLang.g:1049:3: ( rule__ContextDefinition__ComponentsAssignment_3 )
            // InternalLang.g:1049:4: rule__ContextDefinition__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__ContextDefinition__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContextDefinitionAccess().getComponentsAssignment_3()); 

            }

            // InternalLang.g:1052:2: ( ( rule__ContextDefinition__ComponentsAssignment_3 )* )
            // InternalLang.g:1053:3: ( rule__ContextDefinition__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getContextDefinitionAccess().getComponentsAssignment_3()); 
            // InternalLang.g:1054:3: ( rule__ContextDefinition__ComponentsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLang.g:1054:4: rule__ContextDefinition__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ContextDefinition__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextDefinitionAccess().getComponentsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__3__Impl"


    // $ANTLR start "rule__ContextDefinition__Group__4"
    // InternalLang.g:1063:1: rule__ContextDefinition__Group__4 : rule__ContextDefinition__Group__4__Impl ;
    public final void rule__ContextDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1067:1: ( rule__ContextDefinition__Group__4__Impl )
            // InternalLang.g:1068:2: rule__ContextDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__4"


    // $ANTLR start "rule__ContextDefinition__Group__4__Impl"
    // InternalLang.g:1074:1: rule__ContextDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ContextDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1078:1: ( ( '}' ) )
            // InternalLang.g:1079:1: ( '}' )
            {
            // InternalLang.g:1079:1: ( '}' )
            // InternalLang.g:1080:2: '}'
            {
             before(grammarAccess.getContextDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContextDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__Group__4__Impl"


    // $ANTLR start "rule__Platforms__Group__0"
    // InternalLang.g:1090:1: rule__Platforms__Group__0 : rule__Platforms__Group__0__Impl rule__Platforms__Group__1 ;
    public final void rule__Platforms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1094:1: ( rule__Platforms__Group__0__Impl rule__Platforms__Group__1 )
            // InternalLang.g:1095:2: rule__Platforms__Group__0__Impl rule__Platforms__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Platforms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platforms__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platforms__Group__0"


    // $ANTLR start "rule__Platforms__Group__0__Impl"
    // InternalLang.g:1102:1: rule__Platforms__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platforms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1106:1: ( ( 'platform' ) )
            // InternalLang.g:1107:1: ( 'platform' )
            {
            // InternalLang.g:1107:1: ( 'platform' )
            // InternalLang.g:1108:2: 'platform'
            {
             before(grammarAccess.getPlatformsAccess().getPlatformKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlatformsAccess().getPlatformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platforms__Group__0__Impl"


    // $ANTLR start "rule__Platforms__Group__1"
    // InternalLang.g:1117:1: rule__Platforms__Group__1 : rule__Platforms__Group__1__Impl ;
    public final void rule__Platforms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1121:1: ( rule__Platforms__Group__1__Impl )
            // InternalLang.g:1122:2: rule__Platforms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platforms__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platforms__Group__1"


    // $ANTLR start "rule__Platforms__Group__1__Impl"
    // InternalLang.g:1128:1: rule__Platforms__Group__1__Impl : ( ( ( rule__Platforms__IdsAssignment_1 ) ) ( ( rule__Platforms__IdsAssignment_1 )* ) ) ;
    public final void rule__Platforms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1132:1: ( ( ( ( rule__Platforms__IdsAssignment_1 ) ) ( ( rule__Platforms__IdsAssignment_1 )* ) ) )
            // InternalLang.g:1133:1: ( ( ( rule__Platforms__IdsAssignment_1 ) ) ( ( rule__Platforms__IdsAssignment_1 )* ) )
            {
            // InternalLang.g:1133:1: ( ( ( rule__Platforms__IdsAssignment_1 ) ) ( ( rule__Platforms__IdsAssignment_1 )* ) )
            // InternalLang.g:1134:2: ( ( rule__Platforms__IdsAssignment_1 ) ) ( ( rule__Platforms__IdsAssignment_1 )* )
            {
            // InternalLang.g:1134:2: ( ( rule__Platforms__IdsAssignment_1 ) )
            // InternalLang.g:1135:3: ( rule__Platforms__IdsAssignment_1 )
            {
             before(grammarAccess.getPlatformsAccess().getIdsAssignment_1()); 
            // InternalLang.g:1136:3: ( rule__Platforms__IdsAssignment_1 )
            // InternalLang.g:1136:4: rule__Platforms__IdsAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Platforms__IdsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformsAccess().getIdsAssignment_1()); 

            }

            // InternalLang.g:1139:2: ( ( rule__Platforms__IdsAssignment_1 )* )
            // InternalLang.g:1140:3: ( rule__Platforms__IdsAssignment_1 )*
            {
             before(grammarAccess.getPlatformsAccess().getIdsAssignment_1()); 
            // InternalLang.g:1141:3: ( rule__Platforms__IdsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLang.g:1141:4: rule__Platforms__IdsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Platforms__IdsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPlatformsAccess().getIdsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platforms__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalLang.g:1151:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1155:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalLang.g:1156:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalLang.g:1163:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1167:1: ( ( 'namespace' ) )
            // InternalLang.g:1168:1: ( 'namespace' )
            {
            // InternalLang.g:1168:1: ( 'namespace' )
            // InternalLang.g:1169:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalLang.g:1178:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1182:1: ( rule__Namespace__Group__1__Impl )
            // InternalLang.g:1183:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalLang.g:1189:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1193:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // InternalLang.g:1194:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // InternalLang.g:1194:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // InternalLang.g:1195:2: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // InternalLang.g:1196:2: ( rule__Namespace__NameAssignment_1 )
            // InternalLang.g:1196:3: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Alias__Group__0"
    // InternalLang.g:1205:1: rule__Alias__Group__0 : rule__Alias__Group__0__Impl rule__Alias__Group__1 ;
    public final void rule__Alias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1209:1: ( rule__Alias__Group__0__Impl rule__Alias__Group__1 )
            // InternalLang.g:1210:2: rule__Alias__Group__0__Impl rule__Alias__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Alias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0"


    // $ANTLR start "rule__Alias__Group__0__Impl"
    // InternalLang.g:1217:1: rule__Alias__Group__0__Impl : ( 'alias' ) ;
    public final void rule__Alias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1221:1: ( ( 'alias' ) )
            // InternalLang.g:1222:1: ( 'alias' )
            {
            // InternalLang.g:1222:1: ( 'alias' )
            // InternalLang.g:1223:2: 'alias'
            {
             before(grammarAccess.getAliasAccess().getAliasKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getAliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0__Impl"


    // $ANTLR start "rule__Alias__Group__1"
    // InternalLang.g:1232:1: rule__Alias__Group__1 : rule__Alias__Group__1__Impl rule__Alias__Group__2 ;
    public final void rule__Alias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1236:1: ( rule__Alias__Group__1__Impl rule__Alias__Group__2 )
            // InternalLang.g:1237:2: rule__Alias__Group__1__Impl rule__Alias__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Alias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1"


    // $ANTLR start "rule__Alias__Group__1__Impl"
    // InternalLang.g:1244:1: rule__Alias__Group__1__Impl : ( ( rule__Alias__ComponentAliasAssignment_1 )? ) ;
    public final void rule__Alias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1248:1: ( ( ( rule__Alias__ComponentAliasAssignment_1 )? ) )
            // InternalLang.g:1249:1: ( ( rule__Alias__ComponentAliasAssignment_1 )? )
            {
            // InternalLang.g:1249:1: ( ( rule__Alias__ComponentAliasAssignment_1 )? )
            // InternalLang.g:1250:2: ( rule__Alias__ComponentAliasAssignment_1 )?
            {
             before(grammarAccess.getAliasAccess().getComponentAliasAssignment_1()); 
            // InternalLang.g:1251:2: ( rule__Alias__ComponentAliasAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLang.g:1251:3: rule__Alias__ComponentAliasAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alias__ComponentAliasAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasAccess().getComponentAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1__Impl"


    // $ANTLR start "rule__Alias__Group__2"
    // InternalLang.g:1259:1: rule__Alias__Group__2 : rule__Alias__Group__2__Impl rule__Alias__Group__3 ;
    public final void rule__Alias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1263:1: ( rule__Alias__Group__2__Impl rule__Alias__Group__3 )
            // InternalLang.g:1264:2: rule__Alias__Group__2__Impl rule__Alias__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Alias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__2"


    // $ANTLR start "rule__Alias__Group__2__Impl"
    // InternalLang.g:1271:1: rule__Alias__Group__2__Impl : ( ( rule__Alias__UniqueAssignment_2 )? ) ;
    public final void rule__Alias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1275:1: ( ( ( rule__Alias__UniqueAssignment_2 )? ) )
            // InternalLang.g:1276:1: ( ( rule__Alias__UniqueAssignment_2 )? )
            {
            // InternalLang.g:1276:1: ( ( rule__Alias__UniqueAssignment_2 )? )
            // InternalLang.g:1277:2: ( rule__Alias__UniqueAssignment_2 )?
            {
             before(grammarAccess.getAliasAccess().getUniqueAssignment_2()); 
            // InternalLang.g:1278:2: ( rule__Alias__UniqueAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLang.g:1278:3: rule__Alias__UniqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alias__UniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasAccess().getUniqueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__2__Impl"


    // $ANTLR start "rule__Alias__Group__3"
    // InternalLang.g:1286:1: rule__Alias__Group__3 : rule__Alias__Group__3__Impl rule__Alias__Group__4 ;
    public final void rule__Alias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1290:1: ( rule__Alias__Group__3__Impl rule__Alias__Group__4 )
            // InternalLang.g:1291:2: rule__Alias__Group__3__Impl rule__Alias__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Alias__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__3"


    // $ANTLR start "rule__Alias__Group__3__Impl"
    // InternalLang.g:1298:1: rule__Alias__Group__3__Impl : ( ( rule__Alias__NameAssignment_3 ) ) ;
    public final void rule__Alias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1302:1: ( ( ( rule__Alias__NameAssignment_3 ) ) )
            // InternalLang.g:1303:1: ( ( rule__Alias__NameAssignment_3 ) )
            {
            // InternalLang.g:1303:1: ( ( rule__Alias__NameAssignment_3 ) )
            // InternalLang.g:1304:2: ( rule__Alias__NameAssignment_3 )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment_3()); 
            // InternalLang.g:1305:2: ( rule__Alias__NameAssignment_3 )
            // InternalLang.g:1305:3: rule__Alias__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Alias__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__3__Impl"


    // $ANTLR start "rule__Alias__Group__4"
    // InternalLang.g:1313:1: rule__Alias__Group__4 : rule__Alias__Group__4__Impl ;
    public final void rule__Alias__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1317:1: ( rule__Alias__Group__4__Impl )
            // InternalLang.g:1318:2: rule__Alias__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__4"


    // $ANTLR start "rule__Alias__Group__4__Impl"
    // InternalLang.g:1324:1: rule__Alias__Group__4__Impl : ( ( rule__Alias__Alternatives_4 ) ) ;
    public final void rule__Alias__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1328:1: ( ( ( rule__Alias__Alternatives_4 ) ) )
            // InternalLang.g:1329:1: ( ( rule__Alias__Alternatives_4 ) )
            {
            // InternalLang.g:1329:1: ( ( rule__Alias__Alternatives_4 ) )
            // InternalLang.g:1330:2: ( rule__Alias__Alternatives_4 )
            {
             before(grammarAccess.getAliasAccess().getAlternatives_4()); 
            // InternalLang.g:1331:2: ( rule__Alias__Alternatives_4 )
            // InternalLang.g:1331:3: rule__Alias__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__4__Impl"


    // $ANTLR start "rule__SingleAlias__Group__0"
    // InternalLang.g:1340:1: rule__SingleAlias__Group__0 : rule__SingleAlias__Group__0__Impl rule__SingleAlias__Group__1 ;
    public final void rule__SingleAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1344:1: ( rule__SingleAlias__Group__0__Impl rule__SingleAlias__Group__1 )
            // InternalLang.g:1345:2: rule__SingleAlias__Group__0__Impl rule__SingleAlias__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SingleAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAlias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__0"


    // $ANTLR start "rule__SingleAlias__Group__0__Impl"
    // InternalLang.g:1352:1: rule__SingleAlias__Group__0__Impl : ( '=' ) ;
    public final void rule__SingleAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1356:1: ( ( '=' ) )
            // InternalLang.g:1357:1: ( '=' )
            {
            // InternalLang.g:1357:1: ( '=' )
            // InternalLang.g:1358:2: '='
            {
             before(grammarAccess.getSingleAliasAccess().getEqualsSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSingleAliasAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__0__Impl"


    // $ANTLR start "rule__SingleAlias__Group__1"
    // InternalLang.g:1367:1: rule__SingleAlias__Group__1 : rule__SingleAlias__Group__1__Impl rule__SingleAlias__Group__2 ;
    public final void rule__SingleAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1371:1: ( rule__SingleAlias__Group__1__Impl rule__SingleAlias__Group__2 )
            // InternalLang.g:1372:2: rule__SingleAlias__Group__1__Impl rule__SingleAlias__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SingleAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAlias__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__1"


    // $ANTLR start "rule__SingleAlias__Group__1__Impl"
    // InternalLang.g:1379:1: rule__SingleAlias__Group__1__Impl : ( ( rule__SingleAlias__TypeAliasAssignment_1 ) ) ;
    public final void rule__SingleAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1383:1: ( ( ( rule__SingleAlias__TypeAliasAssignment_1 ) ) )
            // InternalLang.g:1384:1: ( ( rule__SingleAlias__TypeAliasAssignment_1 ) )
            {
            // InternalLang.g:1384:1: ( ( rule__SingleAlias__TypeAliasAssignment_1 ) )
            // InternalLang.g:1385:2: ( rule__SingleAlias__TypeAliasAssignment_1 )
            {
             before(grammarAccess.getSingleAliasAccess().getTypeAliasAssignment_1()); 
            // InternalLang.g:1386:2: ( rule__SingleAlias__TypeAliasAssignment_1 )
            // InternalLang.g:1386:3: rule__SingleAlias__TypeAliasAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAlias__TypeAliasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAliasAccess().getTypeAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__1__Impl"


    // $ANTLR start "rule__SingleAlias__Group__2"
    // InternalLang.g:1394:1: rule__SingleAlias__Group__2 : rule__SingleAlias__Group__2__Impl ;
    public final void rule__SingleAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1398:1: ( rule__SingleAlias__Group__2__Impl )
            // InternalLang.g:1399:2: rule__SingleAlias__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAlias__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__2"


    // $ANTLR start "rule__SingleAlias__Group__2__Impl"
    // InternalLang.g:1405:1: rule__SingleAlias__Group__2__Impl : ( ( rule__SingleAlias__SizeAssignment_2 )? ) ;
    public final void rule__SingleAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1409:1: ( ( ( rule__SingleAlias__SizeAssignment_2 )? ) )
            // InternalLang.g:1410:1: ( ( rule__SingleAlias__SizeAssignment_2 )? )
            {
            // InternalLang.g:1410:1: ( ( rule__SingleAlias__SizeAssignment_2 )? )
            // InternalLang.g:1411:2: ( rule__SingleAlias__SizeAssignment_2 )?
            {
             before(grammarAccess.getSingleAliasAccess().getSizeAssignment_2()); 
            // InternalLang.g:1412:2: ( rule__SingleAlias__SizeAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLang.g:1412:3: rule__SingleAlias__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAlias__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAliasAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__Group__2__Impl"


    // $ANTLR start "rule__AliasList__Group__0"
    // InternalLang.g:1421:1: rule__AliasList__Group__0 : rule__AliasList__Group__0__Impl rule__AliasList__Group__1 ;
    public final void rule__AliasList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1425:1: ( rule__AliasList__Group__0__Impl rule__AliasList__Group__1 )
            // InternalLang.g:1426:2: rule__AliasList__Group__0__Impl rule__AliasList__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AliasList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__0"


    // $ANTLR start "rule__AliasList__Group__0__Impl"
    // InternalLang.g:1433:1: rule__AliasList__Group__0__Impl : ( '{' ) ;
    public final void rule__AliasList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1437:1: ( ( '{' ) )
            // InternalLang.g:1438:1: ( '{' )
            {
            // InternalLang.g:1438:1: ( '{' )
            // InternalLang.g:1439:2: '{'
            {
             before(grammarAccess.getAliasListAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAliasListAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__0__Impl"


    // $ANTLR start "rule__AliasList__Group__1"
    // InternalLang.g:1448:1: rule__AliasList__Group__1 : rule__AliasList__Group__1__Impl rule__AliasList__Group__2 ;
    public final void rule__AliasList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1452:1: ( rule__AliasList__Group__1__Impl rule__AliasList__Group__2 )
            // InternalLang.g:1453:2: rule__AliasList__Group__1__Impl rule__AliasList__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AliasList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__1"


    // $ANTLR start "rule__AliasList__Group__1__Impl"
    // InternalLang.g:1460:1: rule__AliasList__Group__1__Impl : ( ( ( rule__AliasList__RulesAssignment_1 ) ) ( ( rule__AliasList__RulesAssignment_1 )* ) ) ;
    public final void rule__AliasList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1464:1: ( ( ( ( rule__AliasList__RulesAssignment_1 ) ) ( ( rule__AliasList__RulesAssignment_1 )* ) ) )
            // InternalLang.g:1465:1: ( ( ( rule__AliasList__RulesAssignment_1 ) ) ( ( rule__AliasList__RulesAssignment_1 )* ) )
            {
            // InternalLang.g:1465:1: ( ( ( rule__AliasList__RulesAssignment_1 ) ) ( ( rule__AliasList__RulesAssignment_1 )* ) )
            // InternalLang.g:1466:2: ( ( rule__AliasList__RulesAssignment_1 ) ) ( ( rule__AliasList__RulesAssignment_1 )* )
            {
            // InternalLang.g:1466:2: ( ( rule__AliasList__RulesAssignment_1 ) )
            // InternalLang.g:1467:3: ( rule__AliasList__RulesAssignment_1 )
            {
             before(grammarAccess.getAliasListAccess().getRulesAssignment_1()); 
            // InternalLang.g:1468:3: ( rule__AliasList__RulesAssignment_1 )
            // InternalLang.g:1468:4: rule__AliasList__RulesAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__AliasList__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasListAccess().getRulesAssignment_1()); 

            }

            // InternalLang.g:1471:2: ( ( rule__AliasList__RulesAssignment_1 )* )
            // InternalLang.g:1472:3: ( rule__AliasList__RulesAssignment_1 )*
            {
             before(grammarAccess.getAliasListAccess().getRulesAssignment_1()); 
            // InternalLang.g:1473:3: ( rule__AliasList__RulesAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLang.g:1473:4: rule__AliasList__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AliasList__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAliasListAccess().getRulesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__1__Impl"


    // $ANTLR start "rule__AliasList__Group__2"
    // InternalLang.g:1482:1: rule__AliasList__Group__2 : rule__AliasList__Group__2__Impl ;
    public final void rule__AliasList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1486:1: ( rule__AliasList__Group__2__Impl )
            // InternalLang.g:1487:2: rule__AliasList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__2"


    // $ANTLR start "rule__AliasList__Group__2__Impl"
    // InternalLang.g:1493:1: rule__AliasList__Group__2__Impl : ( '}' ) ;
    public final void rule__AliasList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1497:1: ( ( '}' ) )
            // InternalLang.g:1498:1: ( '}' )
            {
            // InternalLang.g:1498:1: ( '}' )
            // InternalLang.g:1499:2: '}'
            {
             before(grammarAccess.getAliasListAccess().getRightCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAliasListAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__Group__2__Impl"


    // $ANTLR start "rule__AliasRule__Group__0"
    // InternalLang.g:1509:1: rule__AliasRule__Group__0 : rule__AliasRule__Group__0__Impl rule__AliasRule__Group__1 ;
    public final void rule__AliasRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1513:1: ( rule__AliasRule__Group__0__Impl rule__AliasRule__Group__1 )
            // InternalLang.g:1514:2: rule__AliasRule__Group__0__Impl rule__AliasRule__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AliasRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__0"


    // $ANTLR start "rule__AliasRule__Group__0__Impl"
    // InternalLang.g:1521:1: rule__AliasRule__Group__0__Impl : ( ( rule__AliasRule__PlatformAssignment_0 ) ) ;
    public final void rule__AliasRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1525:1: ( ( ( rule__AliasRule__PlatformAssignment_0 ) ) )
            // InternalLang.g:1526:1: ( ( rule__AliasRule__PlatformAssignment_0 ) )
            {
            // InternalLang.g:1526:1: ( ( rule__AliasRule__PlatformAssignment_0 ) )
            // InternalLang.g:1527:2: ( rule__AliasRule__PlatformAssignment_0 )
            {
             before(grammarAccess.getAliasRuleAccess().getPlatformAssignment_0()); 
            // InternalLang.g:1528:2: ( rule__AliasRule__PlatformAssignment_0 )
            // InternalLang.g:1528:3: rule__AliasRule__PlatformAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__PlatformAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasRuleAccess().getPlatformAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__0__Impl"


    // $ANTLR start "rule__AliasRule__Group__1"
    // InternalLang.g:1536:1: rule__AliasRule__Group__1 : rule__AliasRule__Group__1__Impl rule__AliasRule__Group__2 ;
    public final void rule__AliasRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1540:1: ( rule__AliasRule__Group__1__Impl rule__AliasRule__Group__2 )
            // InternalLang.g:1541:2: rule__AliasRule__Group__1__Impl rule__AliasRule__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AliasRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__1"


    // $ANTLR start "rule__AliasRule__Group__1__Impl"
    // InternalLang.g:1548:1: rule__AliasRule__Group__1__Impl : ( ':' ) ;
    public final void rule__AliasRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1552:1: ( ( ':' ) )
            // InternalLang.g:1553:1: ( ':' )
            {
            // InternalLang.g:1553:1: ( ':' )
            // InternalLang.g:1554:2: ':'
            {
             before(grammarAccess.getAliasRuleAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAliasRuleAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__1__Impl"


    // $ANTLR start "rule__AliasRule__Group__2"
    // InternalLang.g:1563:1: rule__AliasRule__Group__2 : rule__AliasRule__Group__2__Impl rule__AliasRule__Group__3 ;
    public final void rule__AliasRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1567:1: ( rule__AliasRule__Group__2__Impl rule__AliasRule__Group__3 )
            // InternalLang.g:1568:2: rule__AliasRule__Group__2__Impl rule__AliasRule__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AliasRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__2"


    // $ANTLR start "rule__AliasRule__Group__2__Impl"
    // InternalLang.g:1575:1: rule__AliasRule__Group__2__Impl : ( ( rule__AliasRule__TypeAliasAssignment_2 ) ) ;
    public final void rule__AliasRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1579:1: ( ( ( rule__AliasRule__TypeAliasAssignment_2 ) ) )
            // InternalLang.g:1580:1: ( ( rule__AliasRule__TypeAliasAssignment_2 ) )
            {
            // InternalLang.g:1580:1: ( ( rule__AliasRule__TypeAliasAssignment_2 ) )
            // InternalLang.g:1581:2: ( rule__AliasRule__TypeAliasAssignment_2 )
            {
             before(grammarAccess.getAliasRuleAccess().getTypeAliasAssignment_2()); 
            // InternalLang.g:1582:2: ( rule__AliasRule__TypeAliasAssignment_2 )
            // InternalLang.g:1582:3: rule__AliasRule__TypeAliasAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__TypeAliasAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAliasRuleAccess().getTypeAliasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__2__Impl"


    // $ANTLR start "rule__AliasRule__Group__3"
    // InternalLang.g:1590:1: rule__AliasRule__Group__3 : rule__AliasRule__Group__3__Impl ;
    public final void rule__AliasRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1594:1: ( rule__AliasRule__Group__3__Impl )
            // InternalLang.g:1595:2: rule__AliasRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__3"


    // $ANTLR start "rule__AliasRule__Group__3__Impl"
    // InternalLang.g:1601:1: rule__AliasRule__Group__3__Impl : ( ( rule__AliasRule__Group_3__0 )? ) ;
    public final void rule__AliasRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1605:1: ( ( ( rule__AliasRule__Group_3__0 )? ) )
            // InternalLang.g:1606:1: ( ( rule__AliasRule__Group_3__0 )? )
            {
            // InternalLang.g:1606:1: ( ( rule__AliasRule__Group_3__0 )? )
            // InternalLang.g:1607:2: ( rule__AliasRule__Group_3__0 )?
            {
             before(grammarAccess.getAliasRuleAccess().getGroup_3()); 
            // InternalLang.g:1608:2: ( rule__AliasRule__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLang.g:1608:3: rule__AliasRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group__3__Impl"


    // $ANTLR start "rule__AliasRule__Group_3__0"
    // InternalLang.g:1617:1: rule__AliasRule__Group_3__0 : rule__AliasRule__Group_3__0__Impl rule__AliasRule__Group_3__1 ;
    public final void rule__AliasRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1621:1: ( rule__AliasRule__Group_3__0__Impl rule__AliasRule__Group_3__1 )
            // InternalLang.g:1622:2: rule__AliasRule__Group_3__0__Impl rule__AliasRule__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__AliasRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group_3__0"


    // $ANTLR start "rule__AliasRule__Group_3__0__Impl"
    // InternalLang.g:1629:1: rule__AliasRule__Group_3__0__Impl : ( ( rule__AliasRule__SizeAssignment_3_0 ) ) ;
    public final void rule__AliasRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1633:1: ( ( ( rule__AliasRule__SizeAssignment_3_0 ) ) )
            // InternalLang.g:1634:1: ( ( rule__AliasRule__SizeAssignment_3_0 ) )
            {
            // InternalLang.g:1634:1: ( ( rule__AliasRule__SizeAssignment_3_0 ) )
            // InternalLang.g:1635:2: ( rule__AliasRule__SizeAssignment_3_0 )
            {
             before(grammarAccess.getAliasRuleAccess().getSizeAssignment_3_0()); 
            // InternalLang.g:1636:2: ( rule__AliasRule__SizeAssignment_3_0 )
            // InternalLang.g:1636:3: rule__AliasRule__SizeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__SizeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasRuleAccess().getSizeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group_3__0__Impl"


    // $ANTLR start "rule__AliasRule__Group_3__1"
    // InternalLang.g:1644:1: rule__AliasRule__Group_3__1 : rule__AliasRule__Group_3__1__Impl ;
    public final void rule__AliasRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1648:1: ( rule__AliasRule__Group_3__1__Impl )
            // InternalLang.g:1649:2: rule__AliasRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group_3__1"


    // $ANTLR start "rule__AliasRule__Group_3__1__Impl"
    // InternalLang.g:1655:1: rule__AliasRule__Group_3__1__Impl : ( ( rule__AliasRule__VariableSizeAssignment_3_1 )? ) ;
    public final void rule__AliasRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1659:1: ( ( ( rule__AliasRule__VariableSizeAssignment_3_1 )? ) )
            // InternalLang.g:1660:1: ( ( rule__AliasRule__VariableSizeAssignment_3_1 )? )
            {
            // InternalLang.g:1660:1: ( ( rule__AliasRule__VariableSizeAssignment_3_1 )? )
            // InternalLang.g:1661:2: ( rule__AliasRule__VariableSizeAssignment_3_1 )?
            {
             before(grammarAccess.getAliasRuleAccess().getVariableSizeAssignment_3_1()); 
            // InternalLang.g:1662:2: ( rule__AliasRule__VariableSizeAssignment_3_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLang.g:1662:3: rule__AliasRule__VariableSizeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AliasRule__VariableSizeAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasRuleAccess().getVariableSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalLang.g:1671:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1675:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalLang.g:1676:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalLang.g:1683:1: rule__Component__Group__0__Impl : ( 'comp' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1687:1: ( ( 'comp' ) )
            // InternalLang.g:1688:1: ( 'comp' )
            {
            // InternalLang.g:1688:1: ( 'comp' )
            // InternalLang.g:1689:2: 'comp'
            {
             before(grammarAccess.getComponentAccess().getCompKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCompKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalLang.g:1698:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1702:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalLang.g:1703:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalLang.g:1710:1: rule__Component__Group__1__Impl : ( ( rule__Component__UniqueAssignment_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1714:1: ( ( ( rule__Component__UniqueAssignment_1 )? ) )
            // InternalLang.g:1715:1: ( ( rule__Component__UniqueAssignment_1 )? )
            {
            // InternalLang.g:1715:1: ( ( rule__Component__UniqueAssignment_1 )? )
            // InternalLang.g:1716:2: ( rule__Component__UniqueAssignment_1 )?
            {
             before(grammarAccess.getComponentAccess().getUniqueAssignment_1()); 
            // InternalLang.g:1717:2: ( rule__Component__UniqueAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLang.g:1717:3: rule__Component__UniqueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__UniqueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getUniqueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalLang.g:1725:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1729:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalLang.g:1730:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalLang.g:1737:1: rule__Component__Group__2__Impl : ( ( rule__Component__NameAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1741:1: ( ( ( rule__Component__NameAssignment_2 ) ) )
            // InternalLang.g:1742:1: ( ( rule__Component__NameAssignment_2 ) )
            {
            // InternalLang.g:1742:1: ( ( rule__Component__NameAssignment_2 ) )
            // InternalLang.g:1743:2: ( rule__Component__NameAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2()); 
            // InternalLang.g:1744:2: ( rule__Component__NameAssignment_2 )
            // InternalLang.g:1744:3: rule__Component__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalLang.g:1752:1: rule__Component__Group__3 : rule__Component__Group__3__Impl ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1756:1: ( rule__Component__Group__3__Impl )
            // InternalLang.g:1757:2: rule__Component__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalLang.g:1763:1: rule__Component__Group__3__Impl : ( ( rule__Component__Alternatives_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1767:1: ( ( ( rule__Component__Alternatives_3 ) ) )
            // InternalLang.g:1768:1: ( ( rule__Component__Alternatives_3 ) )
            {
            // InternalLang.g:1768:1: ( ( rule__Component__Alternatives_3 ) )
            // InternalLang.g:1769:2: ( rule__Component__Alternatives_3 )
            {
             before(grammarAccess.getComponentAccess().getAlternatives_3()); 
            // InternalLang.g:1770:2: ( rule__Component__Alternatives_3 )
            // InternalLang.g:1770:3: rule__Component__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group_3_0_0__0"
    // InternalLang.g:1779:1: rule__Component__Group_3_0_0__0 : rule__Component__Group_3_0_0__0__Impl rule__Component__Group_3_0_0__1 ;
    public final void rule__Component__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1783:1: ( rule__Component__Group_3_0_0__0__Impl rule__Component__Group_3_0_0__1 )
            // InternalLang.g:1784:2: rule__Component__Group_3_0_0__0__Impl rule__Component__Group_3_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_0__0"


    // $ANTLR start "rule__Component__Group_3_0_0__0__Impl"
    // InternalLang.g:1791:1: rule__Component__Group_3_0_0__0__Impl : ( ':' ) ;
    public final void rule__Component__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1795:1: ( ( ':' ) )
            // InternalLang.g:1796:1: ( ':' )
            {
            // InternalLang.g:1796:1: ( ':' )
            // InternalLang.g:1797:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_3_0_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__Component__Group_3_0_0__1"
    // InternalLang.g:1806:1: rule__Component__Group_3_0_0__1 : rule__Component__Group_3_0_0__1__Impl ;
    public final void rule__Component__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1810:1: ( rule__Component__Group_3_0_0__1__Impl )
            // InternalLang.g:1811:2: rule__Component__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_0__1"


    // $ANTLR start "rule__Component__Group_3_0_0__1__Impl"
    // InternalLang.g:1817:1: rule__Component__Group_3_0_0__1__Impl : ( ( rule__Component__ValueTypeAssignment_3_0_0_1 ) ) ;
    public final void rule__Component__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1821:1: ( ( ( rule__Component__ValueTypeAssignment_3_0_0_1 ) ) )
            // InternalLang.g:1822:1: ( ( rule__Component__ValueTypeAssignment_3_0_0_1 ) )
            {
            // InternalLang.g:1822:1: ( ( rule__Component__ValueTypeAssignment_3_0_0_1 ) )
            // InternalLang.g:1823:2: ( rule__Component__ValueTypeAssignment_3_0_0_1 )
            {
             before(grammarAccess.getComponentAccess().getValueTypeAssignment_3_0_0_1()); 
            // InternalLang.g:1824:2: ( rule__Component__ValueTypeAssignment_3_0_0_1 )
            // InternalLang.g:1824:3: rule__Component__ValueTypeAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ValueTypeAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getValueTypeAssignment_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__Component__Group_3_0_1__0"
    // InternalLang.g:1833:1: rule__Component__Group_3_0_1__0 : rule__Component__Group_3_0_1__0__Impl rule__Component__Group_3_0_1__1 ;
    public final void rule__Component__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1837:1: ( rule__Component__Group_3_0_1__0__Impl rule__Component__Group_3_0_1__1 )
            // InternalLang.g:1838:2: rule__Component__Group_3_0_1__0__Impl rule__Component__Group_3_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__0"


    // $ANTLR start "rule__Component__Group_3_0_1__0__Impl"
    // InternalLang.g:1845:1: rule__Component__Group_3_0_1__0__Impl : ( '{' ) ;
    public final void rule__Component__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1849:1: ( ( '{' ) )
            // InternalLang.g:1850:1: ( '{' )
            {
            // InternalLang.g:1850:1: ( '{' )
            // InternalLang.g:1851:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_0_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Component__Group_3_0_1__1"
    // InternalLang.g:1860:1: rule__Component__Group_3_0_1__1 : rule__Component__Group_3_0_1__1__Impl rule__Component__Group_3_0_1__2 ;
    public final void rule__Component__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1864:1: ( rule__Component__Group_3_0_1__1__Impl rule__Component__Group_3_0_1__2 )
            // InternalLang.g:1865:2: rule__Component__Group_3_0_1__1__Impl rule__Component__Group_3_0_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__1"


    // $ANTLR start "rule__Component__Group_3_0_1__1__Impl"
    // InternalLang.g:1872:1: rule__Component__Group_3_0_1__1__Impl : ( ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) ) ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* ) ) ;
    public final void rule__Component__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1876:1: ( ( ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) ) ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* ) ) )
            // InternalLang.g:1877:1: ( ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) ) ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* ) )
            {
            // InternalLang.g:1877:1: ( ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) ) ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* ) )
            // InternalLang.g:1878:2: ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) ) ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* )
            {
            // InternalLang.g:1878:2: ( ( rule__Component__PropertiesAssignment_3_0_1_1 ) )
            // InternalLang.g:1879:3: ( rule__Component__PropertiesAssignment_3_0_1_1 )
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_3_0_1_1()); 
            // InternalLang.g:1880:3: ( rule__Component__PropertiesAssignment_3_0_1_1 )
            // InternalLang.g:1880:4: rule__Component__PropertiesAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_11);
            rule__Component__PropertiesAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_3_0_1_1()); 

            }

            // InternalLang.g:1883:2: ( ( rule__Component__PropertiesAssignment_3_0_1_1 )* )
            // InternalLang.g:1884:3: ( rule__Component__PropertiesAssignment_3_0_1_1 )*
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_3_0_1_1()); 
            // InternalLang.g:1885:3: ( rule__Component__PropertiesAssignment_3_0_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLang.g:1885:4: rule__Component__PropertiesAssignment_3_0_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component__PropertiesAssignment_3_0_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_3_0_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Component__Group_3_0_1__2"
    // InternalLang.g:1894:1: rule__Component__Group_3_0_1__2 : rule__Component__Group_3_0_1__2__Impl ;
    public final void rule__Component__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1898:1: ( rule__Component__Group_3_0_1__2__Impl )
            // InternalLang.g:1899:2: rule__Component__Group_3_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__2"


    // $ANTLR start "rule__Component__Group_3_0_1__2__Impl"
    // InternalLang.g:1905:1: rule__Component__Group_3_0_1__2__Impl : ( '}' ) ;
    public final void rule__Component__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1909:1: ( ( '}' ) )
            // InternalLang.g:1910:1: ( '}' )
            {
            // InternalLang.g:1910:1: ( '}' )
            // InternalLang.g:1911:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_0_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__Component__Group_3_1__0"
    // InternalLang.g:1921:1: rule__Component__Group_3_1__0 : rule__Component__Group_3_1__0__Impl rule__Component__Group_3_1__1 ;
    public final void rule__Component__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1925:1: ( rule__Component__Group_3_1__0__Impl rule__Component__Group_3_1__1 )
            // InternalLang.g:1926:2: rule__Component__Group_3_1__0__Impl rule__Component__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_1__0"


    // $ANTLR start "rule__Component__Group_3_1__0__Impl"
    // InternalLang.g:1933:1: rule__Component__Group_3_1__0__Impl : ( '/' ) ;
    public final void rule__Component__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1937:1: ( ( '/' ) )
            // InternalLang.g:1938:1: ( '/' )
            {
            // InternalLang.g:1938:1: ( '/' )
            // InternalLang.g:1939:2: '/'
            {
             before(grammarAccess.getComponentAccess().getSolidusKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getSolidusKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_1__0__Impl"


    // $ANTLR start "rule__Component__Group_3_1__1"
    // InternalLang.g:1948:1: rule__Component__Group_3_1__1 : rule__Component__Group_3_1__1__Impl ;
    public final void rule__Component__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1952:1: ( rule__Component__Group_3_1__1__Impl )
            // InternalLang.g:1953:2: rule__Component__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_1__1"


    // $ANTLR start "rule__Component__Group_3_1__1__Impl"
    // InternalLang.g:1959:1: rule__Component__Group_3_1__1__Impl : ( ( rule__Component__PrefixAssignment_3_1_1 ) ) ;
    public final void rule__Component__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1963:1: ( ( ( rule__Component__PrefixAssignment_3_1_1 ) ) )
            // InternalLang.g:1964:1: ( ( rule__Component__PrefixAssignment_3_1_1 ) )
            {
            // InternalLang.g:1964:1: ( ( rule__Component__PrefixAssignment_3_1_1 ) )
            // InternalLang.g:1965:2: ( rule__Component__PrefixAssignment_3_1_1 )
            {
             before(grammarAccess.getComponentAccess().getPrefixAssignment_3_1_1()); 
            // InternalLang.g:1966:2: ( rule__Component__PrefixAssignment_3_1_1 )
            // InternalLang.g:1966:3: rule__Component__PrefixAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__PrefixAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPrefixAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_1__1__Impl"


    // $ANTLR start "rule__ComponentProperty__Group__0"
    // InternalLang.g:1975:1: rule__ComponentProperty__Group__0 : rule__ComponentProperty__Group__0__Impl rule__ComponentProperty__Group__1 ;
    public final void rule__ComponentProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1979:1: ( rule__ComponentProperty__Group__0__Impl rule__ComponentProperty__Group__1 )
            // InternalLang.g:1980:2: rule__ComponentProperty__Group__0__Impl rule__ComponentProperty__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ComponentProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__0"


    // $ANTLR start "rule__ComponentProperty__Group__0__Impl"
    // InternalLang.g:1987:1: rule__ComponentProperty__Group__0__Impl : ( ( rule__ComponentProperty__NameAssignment_0 ) ) ;
    public final void rule__ComponentProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:1991:1: ( ( ( rule__ComponentProperty__NameAssignment_0 ) ) )
            // InternalLang.g:1992:1: ( ( rule__ComponentProperty__NameAssignment_0 ) )
            {
            // InternalLang.g:1992:1: ( ( rule__ComponentProperty__NameAssignment_0 ) )
            // InternalLang.g:1993:2: ( rule__ComponentProperty__NameAssignment_0 )
            {
             before(grammarAccess.getComponentPropertyAccess().getNameAssignment_0()); 
            // InternalLang.g:1994:2: ( rule__ComponentProperty__NameAssignment_0 )
            // InternalLang.g:1994:3: rule__ComponentProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__0__Impl"


    // $ANTLR start "rule__ComponentProperty__Group__1"
    // InternalLang.g:2002:1: rule__ComponentProperty__Group__1 : rule__ComponentProperty__Group__1__Impl rule__ComponentProperty__Group__2 ;
    public final void rule__ComponentProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2006:1: ( rule__ComponentProperty__Group__1__Impl rule__ComponentProperty__Group__2 )
            // InternalLang.g:2007:2: rule__ComponentProperty__Group__1__Impl rule__ComponentProperty__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__1"


    // $ANTLR start "rule__ComponentProperty__Group__1__Impl"
    // InternalLang.g:2014:1: rule__ComponentProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2018:1: ( ( ':' ) )
            // InternalLang.g:2019:1: ( ':' )
            {
            // InternalLang.g:2019:1: ( ':' )
            // InternalLang.g:2020:2: ':'
            {
             before(grammarAccess.getComponentPropertyAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__1__Impl"


    // $ANTLR start "rule__ComponentProperty__Group__2"
    // InternalLang.g:2029:1: rule__ComponentProperty__Group__2 : rule__ComponentProperty__Group__2__Impl ;
    public final void rule__ComponentProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2033:1: ( rule__ComponentProperty__Group__2__Impl )
            // InternalLang.g:2034:2: rule__ComponentProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__2"


    // $ANTLR start "rule__ComponentProperty__Group__2__Impl"
    // InternalLang.g:2040:1: rule__ComponentProperty__Group__2__Impl : ( ( rule__ComponentProperty__TypeAssignment_2 ) ) ;
    public final void rule__ComponentProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2044:1: ( ( ( rule__ComponentProperty__TypeAssignment_2 ) ) )
            // InternalLang.g:2045:1: ( ( rule__ComponentProperty__TypeAssignment_2 ) )
            {
            // InternalLang.g:2045:1: ( ( rule__ComponentProperty__TypeAssignment_2 ) )
            // InternalLang.g:2046:2: ( rule__ComponentProperty__TypeAssignment_2 )
            {
             before(grammarAccess.getComponentPropertyAccess().getTypeAssignment_2()); 
            // InternalLang.g:2047:2: ( rule__ComponentProperty__TypeAssignment_2 )
            // InternalLang.g:2047:3: rule__ComponentProperty__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentProperty__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__Group__2__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalLang.g:2056:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2060:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalLang.g:2061:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalLang.g:2068:1: rule__System__Group__0__Impl : ( 'sys' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2072:1: ( ( 'sys' ) )
            // InternalLang.g:2073:1: ( 'sys' )
            {
            // InternalLang.g:2073:1: ( 'sys' )
            // InternalLang.g:2074:2: 'sys'
            {
             before(grammarAccess.getSystemAccess().getSysKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSysKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalLang.g:2083:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2087:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalLang.g:2088:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalLang.g:2095:1: rule__System__Group__1__Impl : ( ( rule__System__ComponentAliasAssignment_1 )? ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2099:1: ( ( ( rule__System__ComponentAliasAssignment_1 )? ) )
            // InternalLang.g:2100:1: ( ( rule__System__ComponentAliasAssignment_1 )? )
            {
            // InternalLang.g:2100:1: ( ( rule__System__ComponentAliasAssignment_1 )? )
            // InternalLang.g:2101:2: ( rule__System__ComponentAliasAssignment_1 )?
            {
             before(grammarAccess.getSystemAccess().getComponentAliasAssignment_1()); 
            // InternalLang.g:2102:2: ( rule__System__ComponentAliasAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLang.g:2102:3: rule__System__ComponentAliasAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__ComponentAliasAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getComponentAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalLang.g:2110:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2114:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalLang.g:2115:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalLang.g:2122:1: rule__System__Group__2__Impl : ( ( rule__System__UniqueAssignment_2 )? ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2126:1: ( ( ( rule__System__UniqueAssignment_2 )? ) )
            // InternalLang.g:2127:1: ( ( rule__System__UniqueAssignment_2 )? )
            {
            // InternalLang.g:2127:1: ( ( rule__System__UniqueAssignment_2 )? )
            // InternalLang.g:2128:2: ( rule__System__UniqueAssignment_2 )?
            {
             before(grammarAccess.getSystemAccess().getUniqueAssignment_2()); 
            // InternalLang.g:2129:2: ( rule__System__UniqueAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLang.g:2129:3: rule__System__UniqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__UniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getUniqueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalLang.g:2137:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2141:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalLang.g:2142:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalLang.g:2149:1: rule__System__Group__3__Impl : ( ( rule__System__InitAssignment_3 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2153:1: ( ( ( rule__System__InitAssignment_3 )? ) )
            // InternalLang.g:2154:1: ( ( rule__System__InitAssignment_3 )? )
            {
            // InternalLang.g:2154:1: ( ( rule__System__InitAssignment_3 )? )
            // InternalLang.g:2155:2: ( rule__System__InitAssignment_3 )?
            {
             before(grammarAccess.getSystemAccess().getInitAssignment_3()); 
            // InternalLang.g:2156:2: ( rule__System__InitAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLang.g:2156:3: rule__System__InitAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__InitAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getInitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalLang.g:2164:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2168:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalLang.g:2169:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalLang.g:2176:1: rule__System__Group__4__Impl : ( ( rule__System__NameAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2180:1: ( ( ( rule__System__NameAssignment_4 ) ) )
            // InternalLang.g:2181:1: ( ( rule__System__NameAssignment_4 ) )
            {
            // InternalLang.g:2181:1: ( ( rule__System__NameAssignment_4 ) )
            // InternalLang.g:2182:2: ( rule__System__NameAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_4()); 
            // InternalLang.g:2183:2: ( rule__System__NameAssignment_4 )
            // InternalLang.g:2183:3: rule__System__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalLang.g:2191:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2195:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalLang.g:2196:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalLang.g:2203:1: rule__System__Group__5__Impl : ( '{' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2207:1: ( ( '{' ) )
            // InternalLang.g:2208:1: ( '{' )
            {
            // InternalLang.g:2208:1: ( '{' )
            // InternalLang.g:2209:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalLang.g:2218:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2222:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalLang.g:2223:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalLang.g:2230:1: rule__System__Group__6__Impl : ( ( rule__System__InputAssignment_6 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2234:1: ( ( ( rule__System__InputAssignment_6 )? ) )
            // InternalLang.g:2235:1: ( ( rule__System__InputAssignment_6 )? )
            {
            // InternalLang.g:2235:1: ( ( rule__System__InputAssignment_6 )? )
            // InternalLang.g:2236:2: ( rule__System__InputAssignment_6 )?
            {
             before(grammarAccess.getSystemAccess().getInputAssignment_6()); 
            // InternalLang.g:2237:2: ( rule__System__InputAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLang.g:2237:3: rule__System__InputAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__InputAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getInputAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalLang.g:2245:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2249:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalLang.g:2250:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalLang.g:2257:1: rule__System__Group__7__Impl : ( ( rule__System__UniqueCompAssignment_7 )* ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2261:1: ( ( ( rule__System__UniqueCompAssignment_7 )* ) )
            // InternalLang.g:2262:1: ( ( rule__System__UniqueCompAssignment_7 )* )
            {
            // InternalLang.g:2262:1: ( ( rule__System__UniqueCompAssignment_7 )* )
            // InternalLang.g:2263:2: ( rule__System__UniqueCompAssignment_7 )*
            {
             before(grammarAccess.getSystemAccess().getUniqueCompAssignment_7()); 
            // InternalLang.g:2264:2: ( rule__System__UniqueCompAssignment_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==23) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalLang.g:2264:3: rule__System__UniqueCompAssignment_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__System__UniqueCompAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getUniqueCompAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalLang.g:2272:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2276:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalLang.g:2277:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalLang.g:2284:1: rule__System__Group__8__Impl : ( ( rule__System__GroupsAssignment_8 )* ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2288:1: ( ( ( rule__System__GroupsAssignment_8 )* ) )
            // InternalLang.g:2289:1: ( ( rule__System__GroupsAssignment_8 )* )
            {
            // InternalLang.g:2289:1: ( ( rule__System__GroupsAssignment_8 )* )
            // InternalLang.g:2290:2: ( rule__System__GroupsAssignment_8 )*
            {
             before(grammarAccess.getSystemAccess().getGroupsAssignment_8()); 
            // InternalLang.g:2291:2: ( rule__System__GroupsAssignment_8 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38||LA30_0==49) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLang.g:2291:3: rule__System__GroupsAssignment_8
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__System__GroupsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroupsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group__9"
    // InternalLang.g:2299:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2303:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalLang.g:2304:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // InternalLang.g:2311:1: rule__System__Group__9__Impl : ( ( rule__System__CreateRulesAssignment_9 )* ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2315:1: ( ( ( rule__System__CreateRulesAssignment_9 )* ) )
            // InternalLang.g:2316:1: ( ( rule__System__CreateRulesAssignment_9 )* )
            {
            // InternalLang.g:2316:1: ( ( rule__System__CreateRulesAssignment_9 )* )
            // InternalLang.g:2317:2: ( rule__System__CreateRulesAssignment_9 )*
            {
             before(grammarAccess.getSystemAccess().getCreateRulesAssignment_9()); 
            // InternalLang.g:2318:2: ( rule__System__CreateRulesAssignment_9 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLang.g:2318:3: rule__System__CreateRulesAssignment_9
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__System__CreateRulesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getCreateRulesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group__10"
    // InternalLang.g:2326:1: rule__System__Group__10 : rule__System__Group__10__Impl ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2330:1: ( rule__System__Group__10__Impl )
            // InternalLang.g:2331:2: rule__System__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10"


    // $ANTLR start "rule__System__Group__10__Impl"
    // InternalLang.g:2337:1: rule__System__Group__10__Impl : ( '}' ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2341:1: ( ( '}' ) )
            // InternalLang.g:2342:1: ( '}' )
            {
            // InternalLang.g:2342:1: ( '}' )
            // InternalLang.g:2343:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalLang.g:2353:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2357:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalLang.g:2358:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalLang.g:2365:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2369:1: ( ( 'input' ) )
            // InternalLang.g:2370:1: ( 'input' )
            {
            // InternalLang.g:2370:1: ( 'input' )
            // InternalLang.g:2371:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalLang.g:2380:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2384:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalLang.g:2385:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalLang.g:2392:1: rule__Input__Group__1__Impl : ( ( rule__Input__UnqiueAssignment_1 )? ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2396:1: ( ( ( rule__Input__UnqiueAssignment_1 )? ) )
            // InternalLang.g:2397:1: ( ( rule__Input__UnqiueAssignment_1 )? )
            {
            // InternalLang.g:2397:1: ( ( rule__Input__UnqiueAssignment_1 )? )
            // InternalLang.g:2398:2: ( rule__Input__UnqiueAssignment_1 )?
            {
             before(grammarAccess.getInputAccess().getUnqiueAssignment_1()); 
            // InternalLang.g:2399:2: ( rule__Input__UnqiueAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLang.g:2399:3: rule__Input__UnqiueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__UnqiueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getUnqiueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalLang.g:2407:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2411:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalLang.g:2412:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalLang.g:2419:1: rule__Input__Group__2__Impl : ( '{' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2423:1: ( ( '{' ) )
            // InternalLang.g:2424:1: ( '{' )
            {
            // InternalLang.g:2424:1: ( '{' )
            // InternalLang.g:2425:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalLang.g:2434:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2438:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalLang.g:2439:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalLang.g:2446:1: rule__Input__Group__3__Impl : ( 'trigger' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2450:1: ( ( 'trigger' ) )
            // InternalLang.g:2451:1: ( 'trigger' )
            {
            // InternalLang.g:2451:1: ( 'trigger' )
            // InternalLang.g:2452:2: 'trigger'
            {
             before(grammarAccess.getInputAccess().getTriggerKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getTriggerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalLang.g:2461:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2465:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalLang.g:2466:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalLang.g:2473:1: rule__Input__Group__4__Impl : ( ':' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2477:1: ( ( ':' ) )
            // InternalLang.g:2478:1: ( ':' )
            {
            // InternalLang.g:2478:1: ( ':' )
            // InternalLang.g:2479:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // InternalLang.g:2488:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2492:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // InternalLang.g:2493:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Input__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // InternalLang.g:2500:1: rule__Input__Group__5__Impl : ( ( ( rule__Input__TriggersAssignment_5 ) ) ( ( rule__Input__TriggersAssignment_5 )* ) ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2504:1: ( ( ( ( rule__Input__TriggersAssignment_5 ) ) ( ( rule__Input__TriggersAssignment_5 )* ) ) )
            // InternalLang.g:2505:1: ( ( ( rule__Input__TriggersAssignment_5 ) ) ( ( rule__Input__TriggersAssignment_5 )* ) )
            {
            // InternalLang.g:2505:1: ( ( ( rule__Input__TriggersAssignment_5 ) ) ( ( rule__Input__TriggersAssignment_5 )* ) )
            // InternalLang.g:2506:2: ( ( rule__Input__TriggersAssignment_5 ) ) ( ( rule__Input__TriggersAssignment_5 )* )
            {
            // InternalLang.g:2506:2: ( ( rule__Input__TriggersAssignment_5 ) )
            // InternalLang.g:2507:3: ( rule__Input__TriggersAssignment_5 )
            {
             before(grammarAccess.getInputAccess().getTriggersAssignment_5()); 
            // InternalLang.g:2508:3: ( rule__Input__TriggersAssignment_5 )
            // InternalLang.g:2508:4: rule__Input__TriggersAssignment_5
            {
            pushFollow(FOLLOW_30);
            rule__Input__TriggersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTriggersAssignment_5()); 

            }

            // InternalLang.g:2511:2: ( ( rule__Input__TriggersAssignment_5 )* )
            // InternalLang.g:2512:3: ( rule__Input__TriggersAssignment_5 )*
            {
             before(grammarAccess.getInputAccess().getTriggersAssignment_5()); 
            // InternalLang.g:2513:3: ( rule__Input__TriggersAssignment_5 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32||(LA33_0>=35 && LA33_0<=36)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLang.g:2513:4: rule__Input__TriggersAssignment_5
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Input__TriggersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getTriggersAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__6"
    // InternalLang.g:2522:1: rule__Input__Group__6 : rule__Input__Group__6__Impl rule__Input__Group__7 ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2526:1: ( rule__Input__Group__6__Impl rule__Input__Group__7 )
            // InternalLang.g:2527:2: rule__Input__Group__6__Impl rule__Input__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Input__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6"


    // $ANTLR start "rule__Input__Group__6__Impl"
    // InternalLang.g:2534:1: rule__Input__Group__6__Impl : ( ( rule__Input__Group_6__0 )? ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2538:1: ( ( ( rule__Input__Group_6__0 )? ) )
            // InternalLang.g:2539:1: ( ( rule__Input__Group_6__0 )? )
            {
            // InternalLang.g:2539:1: ( ( rule__Input__Group_6__0 )? )
            // InternalLang.g:2540:2: ( rule__Input__Group_6__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_6()); 
            // InternalLang.g:2541:2: ( rule__Input__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLang.g:2541:3: rule__Input__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__7"
    // InternalLang.g:2549:1: rule__Input__Group__7 : rule__Input__Group__7__Impl rule__Input__Group__8 ;
    public final void rule__Input__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2553:1: ( rule__Input__Group__7__Impl rule__Input__Group__8 )
            // InternalLang.g:2554:2: rule__Input__Group__7__Impl rule__Input__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Input__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7"


    // $ANTLR start "rule__Input__Group__7__Impl"
    // InternalLang.g:2561:1: rule__Input__Group__7__Impl : ( ( rule__Input__Group_7__0 )? ) ;
    public final void rule__Input__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2565:1: ( ( ( rule__Input__Group_7__0 )? ) )
            // InternalLang.g:2566:1: ( ( rule__Input__Group_7__0 )? )
            {
            // InternalLang.g:2566:1: ( ( rule__Input__Group_7__0 )? )
            // InternalLang.g:2567:2: ( rule__Input__Group_7__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_7()); 
            // InternalLang.g:2568:2: ( rule__Input__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalLang.g:2568:3: rule__Input__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7__Impl"


    // $ANTLR start "rule__Input__Group__8"
    // InternalLang.g:2576:1: rule__Input__Group__8 : rule__Input__Group__8__Impl rule__Input__Group__9 ;
    public final void rule__Input__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2580:1: ( rule__Input__Group__8__Impl rule__Input__Group__9 )
            // InternalLang.g:2581:2: rule__Input__Group__8__Impl rule__Input__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8"


    // $ANTLR start "rule__Input__Group__8__Impl"
    // InternalLang.g:2588:1: rule__Input__Group__8__Impl : ( 'api' ) ;
    public final void rule__Input__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2592:1: ( ( 'api' ) )
            // InternalLang.g:2593:1: ( 'api' )
            {
            // InternalLang.g:2593:1: ( 'api' )
            // InternalLang.g:2594:2: 'api'
            {
             before(grammarAccess.getInputAccess().getApiKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getApiKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8__Impl"


    // $ANTLR start "rule__Input__Group__9"
    // InternalLang.g:2603:1: rule__Input__Group__9 : rule__Input__Group__9__Impl rule__Input__Group__10 ;
    public final void rule__Input__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2607:1: ( rule__Input__Group__9__Impl rule__Input__Group__10 )
            // InternalLang.g:2608:2: rule__Input__Group__9__Impl rule__Input__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Input__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__9"


    // $ANTLR start "rule__Input__Group__9__Impl"
    // InternalLang.g:2615:1: rule__Input__Group__9__Impl : ( ':' ) ;
    public final void rule__Input__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2619:1: ( ( ':' ) )
            // InternalLang.g:2620:1: ( ':' )
            {
            // InternalLang.g:2620:1: ( ':' )
            // InternalLang.g:2621:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__9__Impl"


    // $ANTLR start "rule__Input__Group__10"
    // InternalLang.g:2630:1: rule__Input__Group__10 : rule__Input__Group__10__Impl rule__Input__Group__11 ;
    public final void rule__Input__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2634:1: ( rule__Input__Group__10__Impl rule__Input__Group__11 )
            // InternalLang.g:2635:2: rule__Input__Group__10__Impl rule__Input__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__Input__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__10"


    // $ANTLR start "rule__Input__Group__10__Impl"
    // InternalLang.g:2642:1: rule__Input__Group__10__Impl : ( ( ( rule__Input__ApiRulesAssignment_10 ) ) ( ( rule__Input__ApiRulesAssignment_10 )* ) ) ;
    public final void rule__Input__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2646:1: ( ( ( ( rule__Input__ApiRulesAssignment_10 ) ) ( ( rule__Input__ApiRulesAssignment_10 )* ) ) )
            // InternalLang.g:2647:1: ( ( ( rule__Input__ApiRulesAssignment_10 ) ) ( ( rule__Input__ApiRulesAssignment_10 )* ) )
            {
            // InternalLang.g:2647:1: ( ( ( rule__Input__ApiRulesAssignment_10 ) ) ( ( rule__Input__ApiRulesAssignment_10 )* ) )
            // InternalLang.g:2648:2: ( ( rule__Input__ApiRulesAssignment_10 ) ) ( ( rule__Input__ApiRulesAssignment_10 )* )
            {
            // InternalLang.g:2648:2: ( ( rule__Input__ApiRulesAssignment_10 ) )
            // InternalLang.g:2649:3: ( rule__Input__ApiRulesAssignment_10 )
            {
             before(grammarAccess.getInputAccess().getApiRulesAssignment_10()); 
            // InternalLang.g:2650:3: ( rule__Input__ApiRulesAssignment_10 )
            // InternalLang.g:2650:4: rule__Input__ApiRulesAssignment_10
            {
            pushFollow(FOLLOW_11);
            rule__Input__ApiRulesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getApiRulesAssignment_10()); 

            }

            // InternalLang.g:2653:2: ( ( rule__Input__ApiRulesAssignment_10 )* )
            // InternalLang.g:2654:3: ( rule__Input__ApiRulesAssignment_10 )*
            {
             before(grammarAccess.getInputAccess().getApiRulesAssignment_10()); 
            // InternalLang.g:2655:3: ( rule__Input__ApiRulesAssignment_10 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLang.g:2655:4: rule__Input__ApiRulesAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Input__ApiRulesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getApiRulesAssignment_10()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__11"
    // InternalLang.g:2664:1: rule__Input__Group__11 : rule__Input__Group__11__Impl rule__Input__Group__12 ;
    public final void rule__Input__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2668:1: ( rule__Input__Group__11__Impl rule__Input__Group__12 )
            // InternalLang.g:2669:2: rule__Input__Group__11__Impl rule__Input__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Input__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__11"


    // $ANTLR start "rule__Input__Group__11__Impl"
    // InternalLang.g:2676:1: rule__Input__Group__11__Impl : ( ( rule__Input__DestroyAssignment_11 )? ) ;
    public final void rule__Input__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2680:1: ( ( ( rule__Input__DestroyAssignment_11 )? ) )
            // InternalLang.g:2681:1: ( ( rule__Input__DestroyAssignment_11 )? )
            {
            // InternalLang.g:2681:1: ( ( rule__Input__DestroyAssignment_11 )? )
            // InternalLang.g:2682:2: ( rule__Input__DestroyAssignment_11 )?
            {
             before(grammarAccess.getInputAccess().getDestroyAssignment_11()); 
            // InternalLang.g:2683:2: ( rule__Input__DestroyAssignment_11 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLang.g:2683:3: rule__Input__DestroyAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__DestroyAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getDestroyAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__11__Impl"


    // $ANTLR start "rule__Input__Group__12"
    // InternalLang.g:2691:1: rule__Input__Group__12 : rule__Input__Group__12__Impl ;
    public final void rule__Input__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2695:1: ( rule__Input__Group__12__Impl )
            // InternalLang.g:2696:2: rule__Input__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__12"


    // $ANTLR start "rule__Input__Group__12__Impl"
    // InternalLang.g:2702:1: rule__Input__Group__12__Impl : ( '}' ) ;
    public final void rule__Input__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2706:1: ( ( '}' ) )
            // InternalLang.g:2707:1: ( '}' )
            {
            // InternalLang.g:2707:1: ( '}' )
            // InternalLang.g:2708:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__12__Impl"


    // $ANTLR start "rule__Input__Group_6__0"
    // InternalLang.g:2718:1: rule__Input__Group_6__0 : rule__Input__Group_6__0__Impl rule__Input__Group_6__1 ;
    public final void rule__Input__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2722:1: ( rule__Input__Group_6__0__Impl rule__Input__Group_6__1 )
            // InternalLang.g:2723:2: rule__Input__Group_6__0__Impl rule__Input__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0"


    // $ANTLR start "rule__Input__Group_6__0__Impl"
    // InternalLang.g:2730:1: rule__Input__Group_6__0__Impl : ( 'ensure' ) ;
    public final void rule__Input__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2734:1: ( ( 'ensure' ) )
            // InternalLang.g:2735:1: ( 'ensure' )
            {
            // InternalLang.g:2735:1: ( 'ensure' )
            // InternalLang.g:2736:2: 'ensure'
            {
             before(grammarAccess.getInputAccess().getEnsureKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getEnsureKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0__Impl"


    // $ANTLR start "rule__Input__Group_6__1"
    // InternalLang.g:2745:1: rule__Input__Group_6__1 : rule__Input__Group_6__1__Impl rule__Input__Group_6__2 ;
    public final void rule__Input__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2749:1: ( rule__Input__Group_6__1__Impl rule__Input__Group_6__2 )
            // InternalLang.g:2750:2: rule__Input__Group_6__1__Impl rule__Input__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Input__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1"


    // $ANTLR start "rule__Input__Group_6__1__Impl"
    // InternalLang.g:2757:1: rule__Input__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Input__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2761:1: ( ( ':' ) )
            // InternalLang.g:2762:1: ( ':' )
            {
            // InternalLang.g:2762:1: ( ':' )
            // InternalLang.g:2763:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1__Impl"


    // $ANTLR start "rule__Input__Group_6__2"
    // InternalLang.g:2772:1: rule__Input__Group_6__2 : rule__Input__Group_6__2__Impl ;
    public final void rule__Input__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2776:1: ( rule__Input__Group_6__2__Impl )
            // InternalLang.g:2777:2: rule__Input__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__2"


    // $ANTLR start "rule__Input__Group_6__2__Impl"
    // InternalLang.g:2783:1: rule__Input__Group_6__2__Impl : ( ( ( rule__Input__EnsureComponentsAssignment_6_2 ) ) ( ( rule__Input__EnsureComponentsAssignment_6_2 )* ) ) ;
    public final void rule__Input__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2787:1: ( ( ( ( rule__Input__EnsureComponentsAssignment_6_2 ) ) ( ( rule__Input__EnsureComponentsAssignment_6_2 )* ) ) )
            // InternalLang.g:2788:1: ( ( ( rule__Input__EnsureComponentsAssignment_6_2 ) ) ( ( rule__Input__EnsureComponentsAssignment_6_2 )* ) )
            {
            // InternalLang.g:2788:1: ( ( ( rule__Input__EnsureComponentsAssignment_6_2 ) ) ( ( rule__Input__EnsureComponentsAssignment_6_2 )* ) )
            // InternalLang.g:2789:2: ( ( rule__Input__EnsureComponentsAssignment_6_2 ) ) ( ( rule__Input__EnsureComponentsAssignment_6_2 )* )
            {
            // InternalLang.g:2789:2: ( ( rule__Input__EnsureComponentsAssignment_6_2 ) )
            // InternalLang.g:2790:3: ( rule__Input__EnsureComponentsAssignment_6_2 )
            {
             before(grammarAccess.getInputAccess().getEnsureComponentsAssignment_6_2()); 
            // InternalLang.g:2791:3: ( rule__Input__EnsureComponentsAssignment_6_2 )
            // InternalLang.g:2791:4: rule__Input__EnsureComponentsAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__Input__EnsureComponentsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getEnsureComponentsAssignment_6_2()); 

            }

            // InternalLang.g:2794:2: ( ( rule__Input__EnsureComponentsAssignment_6_2 )* )
            // InternalLang.g:2795:3: ( rule__Input__EnsureComponentsAssignment_6_2 )*
            {
             before(grammarAccess.getInputAccess().getEnsureComponentsAssignment_6_2()); 
            // InternalLang.g:2796:3: ( rule__Input__EnsureComponentsAssignment_6_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalLang.g:2796:4: rule__Input__EnsureComponentsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Input__EnsureComponentsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getEnsureComponentsAssignment_6_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__2__Impl"


    // $ANTLR start "rule__Input__Group_7__0"
    // InternalLang.g:2806:1: rule__Input__Group_7__0 : rule__Input__Group_7__0__Impl rule__Input__Group_7__1 ;
    public final void rule__Input__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2810:1: ( rule__Input__Group_7__0__Impl rule__Input__Group_7__1 )
            // InternalLang.g:2811:2: rule__Input__Group_7__0__Impl rule__Input__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__0"


    // $ANTLR start "rule__Input__Group_7__0__Impl"
    // InternalLang.g:2818:1: rule__Input__Group_7__0__Impl : ( 'exclude' ) ;
    public final void rule__Input__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2822:1: ( ( 'exclude' ) )
            // InternalLang.g:2823:1: ( 'exclude' )
            {
            // InternalLang.g:2823:1: ( 'exclude' )
            // InternalLang.g:2824:2: 'exclude'
            {
             before(grammarAccess.getInputAccess().getExcludeKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getExcludeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__0__Impl"


    // $ANTLR start "rule__Input__Group_7__1"
    // InternalLang.g:2833:1: rule__Input__Group_7__1 : rule__Input__Group_7__1__Impl rule__Input__Group_7__2 ;
    public final void rule__Input__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2837:1: ( rule__Input__Group_7__1__Impl rule__Input__Group_7__2 )
            // InternalLang.g:2838:2: rule__Input__Group_7__1__Impl rule__Input__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Input__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__1"


    // $ANTLR start "rule__Input__Group_7__1__Impl"
    // InternalLang.g:2845:1: rule__Input__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Input__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2849:1: ( ( ':' ) )
            // InternalLang.g:2850:1: ( ':' )
            {
            // InternalLang.g:2850:1: ( ':' )
            // InternalLang.g:2851:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__1__Impl"


    // $ANTLR start "rule__Input__Group_7__2"
    // InternalLang.g:2860:1: rule__Input__Group_7__2 : rule__Input__Group_7__2__Impl ;
    public final void rule__Input__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2864:1: ( rule__Input__Group_7__2__Impl )
            // InternalLang.g:2865:2: rule__Input__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__2"


    // $ANTLR start "rule__Input__Group_7__2__Impl"
    // InternalLang.g:2871:1: rule__Input__Group_7__2__Impl : ( ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) ) ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* ) ) ;
    public final void rule__Input__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2875:1: ( ( ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) ) ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* ) ) )
            // InternalLang.g:2876:1: ( ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) ) ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* ) )
            {
            // InternalLang.g:2876:1: ( ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) ) ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* ) )
            // InternalLang.g:2877:2: ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) ) ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* )
            {
            // InternalLang.g:2877:2: ( ( rule__Input__ExcludeComponentsAssignment_7_2 ) )
            // InternalLang.g:2878:3: ( rule__Input__ExcludeComponentsAssignment_7_2 )
            {
             before(grammarAccess.getInputAccess().getExcludeComponentsAssignment_7_2()); 
            // InternalLang.g:2879:3: ( rule__Input__ExcludeComponentsAssignment_7_2 )
            // InternalLang.g:2879:4: rule__Input__ExcludeComponentsAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__Input__ExcludeComponentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getExcludeComponentsAssignment_7_2()); 

            }

            // InternalLang.g:2882:2: ( ( rule__Input__ExcludeComponentsAssignment_7_2 )* )
            // InternalLang.g:2883:3: ( rule__Input__ExcludeComponentsAssignment_7_2 )*
            {
             before(grammarAccess.getInputAccess().getExcludeComponentsAssignment_7_2()); 
            // InternalLang.g:2884:3: ( rule__Input__ExcludeComponentsAssignment_7_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLang.g:2884:4: rule__Input__ExcludeComponentsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Input__ExcludeComponentsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getExcludeComponentsAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_7__2__Impl"


    // $ANTLR start "rule__InputTrigger__Group_0__0"
    // InternalLang.g:2894:1: rule__InputTrigger__Group_0__0 : rule__InputTrigger__Group_0__0__Impl rule__InputTrigger__Group_0__1 ;
    public final void rule__InputTrigger__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2898:1: ( rule__InputTrigger__Group_0__0__Impl rule__InputTrigger__Group_0__1 )
            // InternalLang.g:2899:2: rule__InputTrigger__Group_0__0__Impl rule__InputTrigger__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__InputTrigger__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__0"


    // $ANTLR start "rule__InputTrigger__Group_0__0__Impl"
    // InternalLang.g:2906:1: rule__InputTrigger__Group_0__0__Impl : ( 'enteredGroup' ) ;
    public final void rule__InputTrigger__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2910:1: ( ( 'enteredGroup' ) )
            // InternalLang.g:2911:1: ( 'enteredGroup' )
            {
            // InternalLang.g:2911:1: ( 'enteredGroup' )
            // InternalLang.g:2912:2: 'enteredGroup'
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredGroupKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getEnteredGroupKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__0__Impl"


    // $ANTLR start "rule__InputTrigger__Group_0__1"
    // InternalLang.g:2921:1: rule__InputTrigger__Group_0__1 : rule__InputTrigger__Group_0__1__Impl rule__InputTrigger__Group_0__2 ;
    public final void rule__InputTrigger__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2925:1: ( rule__InputTrigger__Group_0__1__Impl rule__InputTrigger__Group_0__2 )
            // InternalLang.g:2926:2: rule__InputTrigger__Group_0__1__Impl rule__InputTrigger__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__InputTrigger__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__1"


    // $ANTLR start "rule__InputTrigger__Group_0__1__Impl"
    // InternalLang.g:2933:1: rule__InputTrigger__Group_0__1__Impl : ( '(' ) ;
    public final void rule__InputTrigger__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2937:1: ( ( '(' ) )
            // InternalLang.g:2938:1: ( '(' )
            {
            // InternalLang.g:2938:1: ( '(' )
            // InternalLang.g:2939:2: '('
            {
             before(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__1__Impl"


    // $ANTLR start "rule__InputTrigger__Group_0__2"
    // InternalLang.g:2948:1: rule__InputTrigger__Group_0__2 : rule__InputTrigger__Group_0__2__Impl rule__InputTrigger__Group_0__3 ;
    public final void rule__InputTrigger__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2952:1: ( rule__InputTrigger__Group_0__2__Impl rule__InputTrigger__Group_0__3 )
            // InternalLang.g:2953:2: rule__InputTrigger__Group_0__2__Impl rule__InputTrigger__Group_0__3
            {
            pushFollow(FOLLOW_33);
            rule__InputTrigger__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__2"


    // $ANTLR start "rule__InputTrigger__Group_0__2__Impl"
    // InternalLang.g:2960:1: rule__InputTrigger__Group_0__2__Impl : ( ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) ) ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* ) ) ;
    public final void rule__InputTrigger__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2964:1: ( ( ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) ) ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* ) ) )
            // InternalLang.g:2965:1: ( ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) ) ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* ) )
            {
            // InternalLang.g:2965:1: ( ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) ) ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* ) )
            // InternalLang.g:2966:2: ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) ) ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* )
            {
            // InternalLang.g:2966:2: ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 ) )
            // InternalLang.g:2967:3: ( rule__InputTrigger__EnterComponentsAssignment_0_2 )
            {
             before(grammarAccess.getInputTriggerAccess().getEnterComponentsAssignment_0_2()); 
            // InternalLang.g:2968:3: ( rule__InputTrigger__EnterComponentsAssignment_0_2 )
            // InternalLang.g:2968:4: rule__InputTrigger__EnterComponentsAssignment_0_2
            {
            pushFollow(FOLLOW_11);
            rule__InputTrigger__EnterComponentsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getInputTriggerAccess().getEnterComponentsAssignment_0_2()); 

            }

            // InternalLang.g:2971:2: ( ( rule__InputTrigger__EnterComponentsAssignment_0_2 )* )
            // InternalLang.g:2972:3: ( rule__InputTrigger__EnterComponentsAssignment_0_2 )*
            {
             before(grammarAccess.getInputTriggerAccess().getEnterComponentsAssignment_0_2()); 
            // InternalLang.g:2973:3: ( rule__InputTrigger__EnterComponentsAssignment_0_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLang.g:2973:4: rule__InputTrigger__EnterComponentsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InputTrigger__EnterComponentsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getInputTriggerAccess().getEnterComponentsAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__2__Impl"


    // $ANTLR start "rule__InputTrigger__Group_0__3"
    // InternalLang.g:2982:1: rule__InputTrigger__Group_0__3 : rule__InputTrigger__Group_0__3__Impl ;
    public final void rule__InputTrigger__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2986:1: ( rule__InputTrigger__Group_0__3__Impl )
            // InternalLang.g:2987:2: rule__InputTrigger__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__3"


    // $ANTLR start "rule__InputTrigger__Group_0__3__Impl"
    // InternalLang.g:2993:1: rule__InputTrigger__Group_0__3__Impl : ( ')' ) ;
    public final void rule__InputTrigger__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:2997:1: ( ( ')' ) )
            // InternalLang.g:2998:1: ( ')' )
            {
            // InternalLang.g:2998:1: ( ')' )
            // InternalLang.g:2999:2: ')'
            {
             before(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_0_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_0__3__Impl"


    // $ANTLR start "rule__InputTrigger__Group_1__0"
    // InternalLang.g:3009:1: rule__InputTrigger__Group_1__0 : rule__InputTrigger__Group_1__0__Impl rule__InputTrigger__Group_1__1 ;
    public final void rule__InputTrigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3013:1: ( rule__InputTrigger__Group_1__0__Impl rule__InputTrigger__Group_1__1 )
            // InternalLang.g:3014:2: rule__InputTrigger__Group_1__0__Impl rule__InputTrigger__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__InputTrigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__0"


    // $ANTLR start "rule__InputTrigger__Group_1__0__Impl"
    // InternalLang.g:3021:1: rule__InputTrigger__Group_1__0__Impl : ( 'leftGroup' ) ;
    public final void rule__InputTrigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3025:1: ( ( 'leftGroup' ) )
            // InternalLang.g:3026:1: ( 'leftGroup' )
            {
            // InternalLang.g:3026:1: ( 'leftGroup' )
            // InternalLang.g:3027:2: 'leftGroup'
            {
             before(grammarAccess.getInputTriggerAccess().getLeftGroupKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getLeftGroupKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__0__Impl"


    // $ANTLR start "rule__InputTrigger__Group_1__1"
    // InternalLang.g:3036:1: rule__InputTrigger__Group_1__1 : rule__InputTrigger__Group_1__1__Impl rule__InputTrigger__Group_1__2 ;
    public final void rule__InputTrigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3040:1: ( rule__InputTrigger__Group_1__1__Impl rule__InputTrigger__Group_1__2 )
            // InternalLang.g:3041:2: rule__InputTrigger__Group_1__1__Impl rule__InputTrigger__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__InputTrigger__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__1"


    // $ANTLR start "rule__InputTrigger__Group_1__1__Impl"
    // InternalLang.g:3048:1: rule__InputTrigger__Group_1__1__Impl : ( '(' ) ;
    public final void rule__InputTrigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3052:1: ( ( '(' ) )
            // InternalLang.g:3053:1: ( '(' )
            {
            // InternalLang.g:3053:1: ( '(' )
            // InternalLang.g:3054:2: '('
            {
             before(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__1__Impl"


    // $ANTLR start "rule__InputTrigger__Group_1__2"
    // InternalLang.g:3063:1: rule__InputTrigger__Group_1__2 : rule__InputTrigger__Group_1__2__Impl rule__InputTrigger__Group_1__3 ;
    public final void rule__InputTrigger__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3067:1: ( rule__InputTrigger__Group_1__2__Impl rule__InputTrigger__Group_1__3 )
            // InternalLang.g:3068:2: rule__InputTrigger__Group_1__2__Impl rule__InputTrigger__Group_1__3
            {
            pushFollow(FOLLOW_33);
            rule__InputTrigger__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__2"


    // $ANTLR start "rule__InputTrigger__Group_1__2__Impl"
    // InternalLang.g:3075:1: rule__InputTrigger__Group_1__2__Impl : ( ( ( rule__InputTrigger__LeftAssignment_1_2 ) ) ( ( rule__InputTrigger__LeftAssignment_1_2 )* ) ) ;
    public final void rule__InputTrigger__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3079:1: ( ( ( ( rule__InputTrigger__LeftAssignment_1_2 ) ) ( ( rule__InputTrigger__LeftAssignment_1_2 )* ) ) )
            // InternalLang.g:3080:1: ( ( ( rule__InputTrigger__LeftAssignment_1_2 ) ) ( ( rule__InputTrigger__LeftAssignment_1_2 )* ) )
            {
            // InternalLang.g:3080:1: ( ( ( rule__InputTrigger__LeftAssignment_1_2 ) ) ( ( rule__InputTrigger__LeftAssignment_1_2 )* ) )
            // InternalLang.g:3081:2: ( ( rule__InputTrigger__LeftAssignment_1_2 ) ) ( ( rule__InputTrigger__LeftAssignment_1_2 )* )
            {
            // InternalLang.g:3081:2: ( ( rule__InputTrigger__LeftAssignment_1_2 ) )
            // InternalLang.g:3082:3: ( rule__InputTrigger__LeftAssignment_1_2 )
            {
             before(grammarAccess.getInputTriggerAccess().getLeftAssignment_1_2()); 
            // InternalLang.g:3083:3: ( rule__InputTrigger__LeftAssignment_1_2 )
            // InternalLang.g:3083:4: rule__InputTrigger__LeftAssignment_1_2
            {
            pushFollow(FOLLOW_11);
            rule__InputTrigger__LeftAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInputTriggerAccess().getLeftAssignment_1_2()); 

            }

            // InternalLang.g:3086:2: ( ( rule__InputTrigger__LeftAssignment_1_2 )* )
            // InternalLang.g:3087:3: ( rule__InputTrigger__LeftAssignment_1_2 )*
            {
             before(grammarAccess.getInputTriggerAccess().getLeftAssignment_1_2()); 
            // InternalLang.g:3088:3: ( rule__InputTrigger__LeftAssignment_1_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLang.g:3088:4: rule__InputTrigger__LeftAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InputTrigger__LeftAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getInputTriggerAccess().getLeftAssignment_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__2__Impl"


    // $ANTLR start "rule__InputTrigger__Group_1__3"
    // InternalLang.g:3097:1: rule__InputTrigger__Group_1__3 : rule__InputTrigger__Group_1__3__Impl ;
    public final void rule__InputTrigger__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3101:1: ( rule__InputTrigger__Group_1__3__Impl )
            // InternalLang.g:3102:2: rule__InputTrigger__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__3"


    // $ANTLR start "rule__InputTrigger__Group_1__3__Impl"
    // InternalLang.g:3108:1: rule__InputTrigger__Group_1__3__Impl : ( ')' ) ;
    public final void rule__InputTrigger__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3112:1: ( ( ')' ) )
            // InternalLang.g:3113:1: ( ')' )
            {
            // InternalLang.g:3113:1: ( ')' )
            // InternalLang.g:3114:2: ')'
            {
             before(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_1_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_1__3__Impl"


    // $ANTLR start "rule__InputTrigger__Group_2__0"
    // InternalLang.g:3124:1: rule__InputTrigger__Group_2__0 : rule__InputTrigger__Group_2__0__Impl rule__InputTrigger__Group_2__1 ;
    public final void rule__InputTrigger__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3128:1: ( rule__InputTrigger__Group_2__0__Impl rule__InputTrigger__Group_2__1 )
            // InternalLang.g:3129:2: rule__InputTrigger__Group_2__0__Impl rule__InputTrigger__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__InputTrigger__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__0"


    // $ANTLR start "rule__InputTrigger__Group_2__0__Impl"
    // InternalLang.g:3136:1: rule__InputTrigger__Group_2__0__Impl : ( 'enteredOrLeftGroup' ) ;
    public final void rule__InputTrigger__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3140:1: ( ( 'enteredOrLeftGroup' ) )
            // InternalLang.g:3141:1: ( 'enteredOrLeftGroup' )
            {
            // InternalLang.g:3141:1: ( 'enteredOrLeftGroup' )
            // InternalLang.g:3142:2: 'enteredOrLeftGroup'
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredOrLeftGroupKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getEnteredOrLeftGroupKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__0__Impl"


    // $ANTLR start "rule__InputTrigger__Group_2__1"
    // InternalLang.g:3151:1: rule__InputTrigger__Group_2__1 : rule__InputTrigger__Group_2__1__Impl rule__InputTrigger__Group_2__2 ;
    public final void rule__InputTrigger__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3155:1: ( rule__InputTrigger__Group_2__1__Impl rule__InputTrigger__Group_2__2 )
            // InternalLang.g:3156:2: rule__InputTrigger__Group_2__1__Impl rule__InputTrigger__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__InputTrigger__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__1"


    // $ANTLR start "rule__InputTrigger__Group_2__1__Impl"
    // InternalLang.g:3163:1: rule__InputTrigger__Group_2__1__Impl : ( '(' ) ;
    public final void rule__InputTrigger__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3167:1: ( ( '(' ) )
            // InternalLang.g:3168:1: ( '(' )
            {
            // InternalLang.g:3168:1: ( '(' )
            // InternalLang.g:3169:2: '('
            {
             before(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__1__Impl"


    // $ANTLR start "rule__InputTrigger__Group_2__2"
    // InternalLang.g:3178:1: rule__InputTrigger__Group_2__2 : rule__InputTrigger__Group_2__2__Impl rule__InputTrigger__Group_2__3 ;
    public final void rule__InputTrigger__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3182:1: ( rule__InputTrigger__Group_2__2__Impl rule__InputTrigger__Group_2__3 )
            // InternalLang.g:3183:2: rule__InputTrigger__Group_2__2__Impl rule__InputTrigger__Group_2__3
            {
            pushFollow(FOLLOW_33);
            rule__InputTrigger__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__2"


    // $ANTLR start "rule__InputTrigger__Group_2__2__Impl"
    // InternalLang.g:3190:1: rule__InputTrigger__Group_2__2__Impl : ( ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) ) ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* ) ) ;
    public final void rule__InputTrigger__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3194:1: ( ( ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) ) ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* ) ) )
            // InternalLang.g:3195:1: ( ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) ) ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* ) )
            {
            // InternalLang.g:3195:1: ( ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) ) ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* ) )
            // InternalLang.g:3196:2: ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) ) ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* )
            {
            // InternalLang.g:3196:2: ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 ) )
            // InternalLang.g:3197:3: ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAssignment_2_2()); 
            // InternalLang.g:3198:3: ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )
            // InternalLang.g:3198:4: rule__InputTrigger__EnteredOrLeftAssignment_2_2
            {
            pushFollow(FOLLOW_11);
            rule__InputTrigger__EnteredOrLeftAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAssignment_2_2()); 

            }

            // InternalLang.g:3201:2: ( ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )* )
            // InternalLang.g:3202:3: ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )*
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAssignment_2_2()); 
            // InternalLang.g:3203:3: ( rule__InputTrigger__EnteredOrLeftAssignment_2_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalLang.g:3203:4: rule__InputTrigger__EnteredOrLeftAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InputTrigger__EnteredOrLeftAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__2__Impl"


    // $ANTLR start "rule__InputTrigger__Group_2__3"
    // InternalLang.g:3212:1: rule__InputTrigger__Group_2__3 : rule__InputTrigger__Group_2__3__Impl ;
    public final void rule__InputTrigger__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3216:1: ( rule__InputTrigger__Group_2__3__Impl )
            // InternalLang.g:3217:2: rule__InputTrigger__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputTrigger__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__3"


    // $ANTLR start "rule__InputTrigger__Group_2__3__Impl"
    // InternalLang.g:3223:1: rule__InputTrigger__Group_2__3__Impl : ( ')' ) ;
    public final void rule__InputTrigger__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3227:1: ( ( ')' ) )
            // InternalLang.g:3228:1: ( ')' )
            {
            // InternalLang.g:3228:1: ( ')' )
            // InternalLang.g:3229:2: ')'
            {
             before(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_2_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__Group_2__3__Impl"


    // $ANTLR start "rule__CreateRule__Group__0"
    // InternalLang.g:3239:1: rule__CreateRule__Group__0 : rule__CreateRule__Group__0__Impl rule__CreateRule__Group__1 ;
    public final void rule__CreateRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3243:1: ( rule__CreateRule__Group__0__Impl rule__CreateRule__Group__1 )
            // InternalLang.g:3244:2: rule__CreateRule__Group__0__Impl rule__CreateRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CreateRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__0"


    // $ANTLR start "rule__CreateRule__Group__0__Impl"
    // InternalLang.g:3251:1: rule__CreateRule__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3255:1: ( ( 'create' ) )
            // InternalLang.g:3256:1: ( 'create' )
            {
            // InternalLang.g:3256:1: ( 'create' )
            // InternalLang.g:3257:2: 'create'
            {
             before(grammarAccess.getCreateRuleAccess().getCreateKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCreateRuleAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__0__Impl"


    // $ANTLR start "rule__CreateRule__Group__1"
    // InternalLang.g:3266:1: rule__CreateRule__Group__1 : rule__CreateRule__Group__1__Impl rule__CreateRule__Group__2 ;
    public final void rule__CreateRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3270:1: ( rule__CreateRule__Group__1__Impl rule__CreateRule__Group__2 )
            // InternalLang.g:3271:2: rule__CreateRule__Group__1__Impl rule__CreateRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CreateRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__1"


    // $ANTLR start "rule__CreateRule__Group__1__Impl"
    // InternalLang.g:3278:1: rule__CreateRule__Group__1__Impl : ( ( rule__CreateRule__NameAssignment_1 ) ) ;
    public final void rule__CreateRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3282:1: ( ( ( rule__CreateRule__NameAssignment_1 ) ) )
            // InternalLang.g:3283:1: ( ( rule__CreateRule__NameAssignment_1 ) )
            {
            // InternalLang.g:3283:1: ( ( rule__CreateRule__NameAssignment_1 ) )
            // InternalLang.g:3284:2: ( rule__CreateRule__NameAssignment_1 )
            {
             before(grammarAccess.getCreateRuleAccess().getNameAssignment_1()); 
            // InternalLang.g:3285:2: ( rule__CreateRule__NameAssignment_1 )
            // InternalLang.g:3285:3: rule__CreateRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__1__Impl"


    // $ANTLR start "rule__CreateRule__Group__2"
    // InternalLang.g:3293:1: rule__CreateRule__Group__2 : rule__CreateRule__Group__2__Impl rule__CreateRule__Group__3 ;
    public final void rule__CreateRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3297:1: ( rule__CreateRule__Group__2__Impl rule__CreateRule__Group__3 )
            // InternalLang.g:3298:2: rule__CreateRule__Group__2__Impl rule__CreateRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CreateRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__2"


    // $ANTLR start "rule__CreateRule__Group__2__Impl"
    // InternalLang.g:3305:1: rule__CreateRule__Group__2__Impl : ( ':' ) ;
    public final void rule__CreateRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3309:1: ( ( ':' ) )
            // InternalLang.g:3310:1: ( ':' )
            {
            // InternalLang.g:3310:1: ( ':' )
            // InternalLang.g:3311:2: ':'
            {
             before(grammarAccess.getCreateRuleAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCreateRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__2__Impl"


    // $ANTLR start "rule__CreateRule__Group__3"
    // InternalLang.g:3320:1: rule__CreateRule__Group__3 : rule__CreateRule__Group__3__Impl ;
    public final void rule__CreateRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3324:1: ( rule__CreateRule__Group__3__Impl )
            // InternalLang.g:3325:2: rule__CreateRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__3"


    // $ANTLR start "rule__CreateRule__Group__3__Impl"
    // InternalLang.g:3331:1: rule__CreateRule__Group__3__Impl : ( ( ( rule__CreateRule__ComponentTypesAssignment_3 ) ) ( ( rule__CreateRule__ComponentTypesAssignment_3 )* ) ) ;
    public final void rule__CreateRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3335:1: ( ( ( ( rule__CreateRule__ComponentTypesAssignment_3 ) ) ( ( rule__CreateRule__ComponentTypesAssignment_3 )* ) ) )
            // InternalLang.g:3336:1: ( ( ( rule__CreateRule__ComponentTypesAssignment_3 ) ) ( ( rule__CreateRule__ComponentTypesAssignment_3 )* ) )
            {
            // InternalLang.g:3336:1: ( ( ( rule__CreateRule__ComponentTypesAssignment_3 ) ) ( ( rule__CreateRule__ComponentTypesAssignment_3 )* ) )
            // InternalLang.g:3337:2: ( ( rule__CreateRule__ComponentTypesAssignment_3 ) ) ( ( rule__CreateRule__ComponentTypesAssignment_3 )* )
            {
            // InternalLang.g:3337:2: ( ( rule__CreateRule__ComponentTypesAssignment_3 ) )
            // InternalLang.g:3338:3: ( rule__CreateRule__ComponentTypesAssignment_3 )
            {
             before(grammarAccess.getCreateRuleAccess().getComponentTypesAssignment_3()); 
            // InternalLang.g:3339:3: ( rule__CreateRule__ComponentTypesAssignment_3 )
            // InternalLang.g:3339:4: rule__CreateRule__ComponentTypesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__CreateRule__ComponentTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreateRuleAccess().getComponentTypesAssignment_3()); 

            }

            // InternalLang.g:3342:2: ( ( rule__CreateRule__ComponentTypesAssignment_3 )* )
            // InternalLang.g:3343:3: ( rule__CreateRule__ComponentTypesAssignment_3 )*
            {
             before(grammarAccess.getCreateRuleAccess().getComponentTypesAssignment_3()); 
            // InternalLang.g:3344:3: ( rule__CreateRule__ComponentTypesAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalLang.g:3344:4: rule__CreateRule__ComponentTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CreateRule__ComponentTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getCreateRuleAccess().getComponentTypesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__Group__3__Impl"


    // $ANTLR start "rule__UniqueComponentAccess__Group__0"
    // InternalLang.g:3354:1: rule__UniqueComponentAccess__Group__0 : rule__UniqueComponentAccess__Group__0__Impl rule__UniqueComponentAccess__Group__1 ;
    public final void rule__UniqueComponentAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3358:1: ( rule__UniqueComponentAccess__Group__0__Impl rule__UniqueComponentAccess__Group__1 )
            // InternalLang.g:3359:2: rule__UniqueComponentAccess__Group__0__Impl rule__UniqueComponentAccess__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__UniqueComponentAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueComponentAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__0"


    // $ANTLR start "rule__UniqueComponentAccess__Group__0__Impl"
    // InternalLang.g:3366:1: rule__UniqueComponentAccess__Group__0__Impl : ( 'unique' ) ;
    public final void rule__UniqueComponentAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3370:1: ( ( 'unique' ) )
            // InternalLang.g:3371:1: ( 'unique' )
            {
            // InternalLang.g:3371:1: ( 'unique' )
            // InternalLang.g:3372:2: 'unique'
            {
             before(grammarAccess.getUniqueComponentAccessAccess().getUniqueKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUniqueComponentAccessAccess().getUniqueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__0__Impl"


    // $ANTLR start "rule__UniqueComponentAccess__Group__1"
    // InternalLang.g:3381:1: rule__UniqueComponentAccess__Group__1 : rule__UniqueComponentAccess__Group__1__Impl rule__UniqueComponentAccess__Group__2 ;
    public final void rule__UniqueComponentAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3385:1: ( rule__UniqueComponentAccess__Group__1__Impl rule__UniqueComponentAccess__Group__2 )
            // InternalLang.g:3386:2: rule__UniqueComponentAccess__Group__1__Impl rule__UniqueComponentAccess__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__UniqueComponentAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueComponentAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__1"


    // $ANTLR start "rule__UniqueComponentAccess__Group__1__Impl"
    // InternalLang.g:3393:1: rule__UniqueComponentAccess__Group__1__Impl : ( ':' ) ;
    public final void rule__UniqueComponentAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3397:1: ( ( ':' ) )
            // InternalLang.g:3398:1: ( ':' )
            {
            // InternalLang.g:3398:1: ( ':' )
            // InternalLang.g:3399:2: ':'
            {
             before(grammarAccess.getUniqueComponentAccessAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUniqueComponentAccessAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__1__Impl"


    // $ANTLR start "rule__UniqueComponentAccess__Group__2"
    // InternalLang.g:3408:1: rule__UniqueComponentAccess__Group__2 : rule__UniqueComponentAccess__Group__2__Impl ;
    public final void rule__UniqueComponentAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3412:1: ( rule__UniqueComponentAccess__Group__2__Impl )
            // InternalLang.g:3413:2: rule__UniqueComponentAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueComponentAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__2"


    // $ANTLR start "rule__UniqueComponentAccess__Group__2__Impl"
    // InternalLang.g:3419:1: rule__UniqueComponentAccess__Group__2__Impl : ( ( rule__UniqueComponentAccess__ApiRuleAssignment_2 ) ) ;
    public final void rule__UniqueComponentAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3423:1: ( ( ( rule__UniqueComponentAccess__ApiRuleAssignment_2 ) ) )
            // InternalLang.g:3424:1: ( ( rule__UniqueComponentAccess__ApiRuleAssignment_2 ) )
            {
            // InternalLang.g:3424:1: ( ( rule__UniqueComponentAccess__ApiRuleAssignment_2 ) )
            // InternalLang.g:3425:2: ( rule__UniqueComponentAccess__ApiRuleAssignment_2 )
            {
             before(grammarAccess.getUniqueComponentAccessAccess().getApiRuleAssignment_2()); 
            // InternalLang.g:3426:2: ( rule__UniqueComponentAccess__ApiRuleAssignment_2 )
            // InternalLang.g:3426:3: rule__UniqueComponentAccess__ApiRuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UniqueComponentAccess__ApiRuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUniqueComponentAccessAccess().getApiRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalLang.g:3435:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3439:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalLang.g:3440:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalLang.g:3447:1: rule__Group__Group__0__Impl : ( ( rule__Group__Alternatives_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3451:1: ( ( ( rule__Group__Alternatives_0 ) ) )
            // InternalLang.g:3452:1: ( ( rule__Group__Alternatives_0 ) )
            {
            // InternalLang.g:3452:1: ( ( rule__Group__Alternatives_0 ) )
            // InternalLang.g:3453:2: ( rule__Group__Alternatives_0 )
            {
             before(grammarAccess.getGroupAccess().getAlternatives_0()); 
            // InternalLang.g:3454:2: ( rule__Group__Alternatives_0 )
            // InternalLang.g:3454:3: rule__Group__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalLang.g:3462:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3466:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalLang.g:3467:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalLang.g:3474:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3478:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalLang.g:3479:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalLang.g:3479:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalLang.g:3480:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalLang.g:3481:2: ( rule__Group__NameAssignment_1 )
            // InternalLang.g:3481:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalLang.g:3489:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3493:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalLang.g:3494:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalLang.g:3501:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3505:1: ( ( '{' ) )
            // InternalLang.g:3506:1: ( '{' )
            {
            // InternalLang.g:3506:1: ( '{' )
            // InternalLang.g:3507:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalLang.g:3516:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3520:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalLang.g:3521:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalLang.g:3528:1: rule__Group__Group__3__Impl : ( 'matcher' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3532:1: ( ( 'matcher' ) )
            // InternalLang.g:3533:1: ( 'matcher' )
            {
            // InternalLang.g:3533:1: ( 'matcher' )
            // InternalLang.g:3534:2: 'matcher'
            {
             before(grammarAccess.getGroupAccess().getMatcherKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getMatcherKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalLang.g:3543:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3547:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalLang.g:3548:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalLang.g:3555:1: rule__Group__Group__4__Impl : ( ':' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3559:1: ( ( ':' ) )
            // InternalLang.g:3560:1: ( ':' )
            {
            // InternalLang.g:3560:1: ( ':' )
            // InternalLang.g:3561:2: ':'
            {
             before(grammarAccess.getGroupAccess().getColonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalLang.g:3570:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3574:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // InternalLang.g:3575:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalLang.g:3582:1: rule__Group__Group__5__Impl : ( ( rule__Group__Group_5__0 )? ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3586:1: ( ( ( rule__Group__Group_5__0 )? ) )
            // InternalLang.g:3587:1: ( ( rule__Group__Group_5__0 )? )
            {
            // InternalLang.g:3587:1: ( ( rule__Group__Group_5__0 )? )
            // InternalLang.g:3588:2: ( rule__Group__Group_5__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_5()); 
            // InternalLang.g:3589:2: ( rule__Group__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLang.g:3589:3: rule__Group__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // InternalLang.g:3597:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3601:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // InternalLang.g:3602:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Group__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // InternalLang.g:3609:1: rule__Group__Group__6__Impl : ( ( rule__Group__Group_6__0 )? ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3613:1: ( ( ( rule__Group__Group_6__0 )? ) )
            // InternalLang.g:3614:1: ( ( rule__Group__Group_6__0 )? )
            {
            // InternalLang.g:3614:1: ( ( rule__Group__Group_6__0 )? )
            // InternalLang.g:3615:2: ( rule__Group__Group_6__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_6()); 
            // InternalLang.g:3616:2: ( rule__Group__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalLang.g:3616:3: rule__Group__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // InternalLang.g:3624:1: rule__Group__Group__7 : rule__Group__Group__7__Impl rule__Group__Group__8 ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3628:1: ( rule__Group__Group__7__Impl rule__Group__Group__8 )
            // InternalLang.g:3629:2: rule__Group__Group__7__Impl rule__Group__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__Group__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // InternalLang.g:3636:1: rule__Group__Group__7__Impl : ( ( rule__Group__Group_7__0 )? ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3640:1: ( ( ( rule__Group__Group_7__0 )? ) )
            // InternalLang.g:3641:1: ( ( rule__Group__Group_7__0 )? )
            {
            // InternalLang.g:3641:1: ( ( rule__Group__Group_7__0 )? )
            // InternalLang.g:3642:2: ( rule__Group__Group_7__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_7()); 
            // InternalLang.g:3643:2: ( rule__Group__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLang.g:3643:3: rule__Group__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__Group__Group__8"
    // InternalLang.g:3651:1: rule__Group__Group__8 : rule__Group__Group__8__Impl rule__Group__Group__9 ;
    public final void rule__Group__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3655:1: ( rule__Group__Group__8__Impl rule__Group__Group__9 )
            // InternalLang.g:3656:2: rule__Group__Group__8__Impl rule__Group__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Group__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8"


    // $ANTLR start "rule__Group__Group__8__Impl"
    // InternalLang.g:3663:1: rule__Group__Group__8__Impl : ( 'api' ) ;
    public final void rule__Group__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3667:1: ( ( 'api' ) )
            // InternalLang.g:3668:1: ( 'api' )
            {
            // InternalLang.g:3668:1: ( 'api' )
            // InternalLang.g:3669:2: 'api'
            {
             before(grammarAccess.getGroupAccess().getApiKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getApiKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8__Impl"


    // $ANTLR start "rule__Group__Group__9"
    // InternalLang.g:3678:1: rule__Group__Group__9 : rule__Group__Group__9__Impl rule__Group__Group__10 ;
    public final void rule__Group__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3682:1: ( rule__Group__Group__9__Impl rule__Group__Group__10 )
            // InternalLang.g:3683:2: rule__Group__Group__9__Impl rule__Group__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9"


    // $ANTLR start "rule__Group__Group__9__Impl"
    // InternalLang.g:3690:1: rule__Group__Group__9__Impl : ( ':' ) ;
    public final void rule__Group__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3694:1: ( ( ':' ) )
            // InternalLang.g:3695:1: ( ':' )
            {
            // InternalLang.g:3695:1: ( ':' )
            // InternalLang.g:3696:2: ':'
            {
             before(grammarAccess.getGroupAccess().getColonKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9__Impl"


    // $ANTLR start "rule__Group__Group__10"
    // InternalLang.g:3705:1: rule__Group__Group__10 : rule__Group__Group__10__Impl rule__Group__Group__11 ;
    public final void rule__Group__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3709:1: ( rule__Group__Group__10__Impl rule__Group__Group__11 )
            // InternalLang.g:3710:2: rule__Group__Group__10__Impl rule__Group__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__Group__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__10"


    // $ANTLR start "rule__Group__Group__10__Impl"
    // InternalLang.g:3717:1: rule__Group__Group__10__Impl : ( ( ( rule__Group__ApiRulesAssignment_10 ) ) ( ( rule__Group__ApiRulesAssignment_10 )* ) ) ;
    public final void rule__Group__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3721:1: ( ( ( ( rule__Group__ApiRulesAssignment_10 ) ) ( ( rule__Group__ApiRulesAssignment_10 )* ) ) )
            // InternalLang.g:3722:1: ( ( ( rule__Group__ApiRulesAssignment_10 ) ) ( ( rule__Group__ApiRulesAssignment_10 )* ) )
            {
            // InternalLang.g:3722:1: ( ( ( rule__Group__ApiRulesAssignment_10 ) ) ( ( rule__Group__ApiRulesAssignment_10 )* ) )
            // InternalLang.g:3723:2: ( ( rule__Group__ApiRulesAssignment_10 ) ) ( ( rule__Group__ApiRulesAssignment_10 )* )
            {
            // InternalLang.g:3723:2: ( ( rule__Group__ApiRulesAssignment_10 ) )
            // InternalLang.g:3724:3: ( rule__Group__ApiRulesAssignment_10 )
            {
             before(grammarAccess.getGroupAccess().getApiRulesAssignment_10()); 
            // InternalLang.g:3725:3: ( rule__Group__ApiRulesAssignment_10 )
            // InternalLang.g:3725:4: rule__Group__ApiRulesAssignment_10
            {
            pushFollow(FOLLOW_11);
            rule__Group__ApiRulesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getApiRulesAssignment_10()); 

            }

            // InternalLang.g:3728:2: ( ( rule__Group__ApiRulesAssignment_10 )* )
            // InternalLang.g:3729:3: ( rule__Group__ApiRulesAssignment_10 )*
            {
             before(grammarAccess.getGroupAccess().getApiRulesAssignment_10()); 
            // InternalLang.g:3730:3: ( rule__Group__ApiRulesAssignment_10 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalLang.g:3730:4: rule__Group__ApiRulesAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Group__ApiRulesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getApiRulesAssignment_10()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__10__Impl"


    // $ANTLR start "rule__Group__Group__11"
    // InternalLang.g:3739:1: rule__Group__Group__11 : rule__Group__Group__11__Impl rule__Group__Group__12 ;
    public final void rule__Group__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3743:1: ( rule__Group__Group__11__Impl rule__Group__Group__12 )
            // InternalLang.g:3744:2: rule__Group__Group__11__Impl rule__Group__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Group__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__11"


    // $ANTLR start "rule__Group__Group__11__Impl"
    // InternalLang.g:3751:1: rule__Group__Group__11__Impl : ( ( rule__Group__DestroyAssignment_11 )? ) ;
    public final void rule__Group__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3755:1: ( ( ( rule__Group__DestroyAssignment_11 )? ) )
            // InternalLang.g:3756:1: ( ( rule__Group__DestroyAssignment_11 )? )
            {
            // InternalLang.g:3756:1: ( ( rule__Group__DestroyAssignment_11 )? )
            // InternalLang.g:3757:2: ( rule__Group__DestroyAssignment_11 )?
            {
             before(grammarAccess.getGroupAccess().getDestroyAssignment_11()); 
            // InternalLang.g:3758:2: ( rule__Group__DestroyAssignment_11 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==48) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLang.g:3758:3: rule__Group__DestroyAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__DestroyAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getDestroyAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__11__Impl"


    // $ANTLR start "rule__Group__Group__12"
    // InternalLang.g:3766:1: rule__Group__Group__12 : rule__Group__Group__12__Impl ;
    public final void rule__Group__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3770:1: ( rule__Group__Group__12__Impl )
            // InternalLang.g:3771:2: rule__Group__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__12"


    // $ANTLR start "rule__Group__Group__12__Impl"
    // InternalLang.g:3777:1: rule__Group__Group__12__Impl : ( '}' ) ;
    public final void rule__Group__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3781:1: ( ( '}' ) )
            // InternalLang.g:3782:1: ( '}' )
            {
            // InternalLang.g:3782:1: ( '}' )
            // InternalLang.g:3783:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__12__Impl"


    // $ANTLR start "rule__Group__Group_5__0"
    // InternalLang.g:3793:1: rule__Group__Group_5__0 : rule__Group__Group_5__0__Impl rule__Group__Group_5__1 ;
    public final void rule__Group__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3797:1: ( rule__Group__Group_5__0__Impl rule__Group__Group_5__1 )
            // InternalLang.g:3798:2: rule__Group__Group_5__0__Impl rule__Group__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Group__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__0"


    // $ANTLR start "rule__Group__Group_5__0__Impl"
    // InternalLang.g:3805:1: rule__Group__Group_5__0__Impl : ( 'allOf' ) ;
    public final void rule__Group__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3809:1: ( ( 'allOf' ) )
            // InternalLang.g:3810:1: ( 'allOf' )
            {
            // InternalLang.g:3810:1: ( 'allOf' )
            // InternalLang.g:3811:2: 'allOf'
            {
             before(grammarAccess.getGroupAccess().getAllOfKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getAllOfKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__0__Impl"


    // $ANTLR start "rule__Group__Group_5__1"
    // InternalLang.g:3820:1: rule__Group__Group_5__1 : rule__Group__Group_5__1__Impl rule__Group__Group_5__2 ;
    public final void rule__Group__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3824:1: ( rule__Group__Group_5__1__Impl rule__Group__Group_5__2 )
            // InternalLang.g:3825:2: rule__Group__Group_5__1__Impl rule__Group__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__1"


    // $ANTLR start "rule__Group__Group_5__1__Impl"
    // InternalLang.g:3832:1: rule__Group__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Group__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3836:1: ( ( '(' ) )
            // InternalLang.g:3837:1: ( '(' )
            {
            // InternalLang.g:3837:1: ( '(' )
            // InternalLang.g:3838:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__1__Impl"


    // $ANTLR start "rule__Group__Group_5__2"
    // InternalLang.g:3847:1: rule__Group__Group_5__2 : rule__Group__Group_5__2__Impl rule__Group__Group_5__3 ;
    public final void rule__Group__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3851:1: ( rule__Group__Group_5__2__Impl rule__Group__Group_5__3 )
            // InternalLang.g:3852:2: rule__Group__Group_5__2__Impl rule__Group__Group_5__3
            {
            pushFollow(FOLLOW_33);
            rule__Group__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__2"


    // $ANTLR start "rule__Group__Group_5__2__Impl"
    // InternalLang.g:3859:1: rule__Group__Group_5__2__Impl : ( ( ( rule__Group__AllOfComponentsAssignment_5_2 ) ) ( ( rule__Group__AllOfComponentsAssignment_5_2 )* ) ) ;
    public final void rule__Group__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3863:1: ( ( ( ( rule__Group__AllOfComponentsAssignment_5_2 ) ) ( ( rule__Group__AllOfComponentsAssignment_5_2 )* ) ) )
            // InternalLang.g:3864:1: ( ( ( rule__Group__AllOfComponentsAssignment_5_2 ) ) ( ( rule__Group__AllOfComponentsAssignment_5_2 )* ) )
            {
            // InternalLang.g:3864:1: ( ( ( rule__Group__AllOfComponentsAssignment_5_2 ) ) ( ( rule__Group__AllOfComponentsAssignment_5_2 )* ) )
            // InternalLang.g:3865:2: ( ( rule__Group__AllOfComponentsAssignment_5_2 ) ) ( ( rule__Group__AllOfComponentsAssignment_5_2 )* )
            {
            // InternalLang.g:3865:2: ( ( rule__Group__AllOfComponentsAssignment_5_2 ) )
            // InternalLang.g:3866:3: ( rule__Group__AllOfComponentsAssignment_5_2 )
            {
             before(grammarAccess.getGroupAccess().getAllOfComponentsAssignment_5_2()); 
            // InternalLang.g:3867:3: ( rule__Group__AllOfComponentsAssignment_5_2 )
            // InternalLang.g:3867:4: rule__Group__AllOfComponentsAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__Group__AllOfComponentsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAllOfComponentsAssignment_5_2()); 

            }

            // InternalLang.g:3870:2: ( ( rule__Group__AllOfComponentsAssignment_5_2 )* )
            // InternalLang.g:3871:3: ( rule__Group__AllOfComponentsAssignment_5_2 )*
            {
             before(grammarAccess.getGroupAccess().getAllOfComponentsAssignment_5_2()); 
            // InternalLang.g:3872:3: ( rule__Group__AllOfComponentsAssignment_5_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalLang.g:3872:4: rule__Group__AllOfComponentsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Group__AllOfComponentsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getAllOfComponentsAssignment_5_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__2__Impl"


    // $ANTLR start "rule__Group__Group_5__3"
    // InternalLang.g:3881:1: rule__Group__Group_5__3 : rule__Group__Group_5__3__Impl ;
    public final void rule__Group__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3885:1: ( rule__Group__Group_5__3__Impl )
            // InternalLang.g:3886:2: rule__Group__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__3"


    // $ANTLR start "rule__Group__Group_5__3__Impl"
    // InternalLang.g:3892:1: rule__Group__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Group__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3896:1: ( ( ')' ) )
            // InternalLang.g:3897:1: ( ')' )
            {
            // InternalLang.g:3897:1: ( ')' )
            // InternalLang.g:3898:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__3__Impl"


    // $ANTLR start "rule__Group__Group_6__0"
    // InternalLang.g:3908:1: rule__Group__Group_6__0 : rule__Group__Group_6__0__Impl rule__Group__Group_6__1 ;
    public final void rule__Group__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3912:1: ( rule__Group__Group_6__0__Impl rule__Group__Group_6__1 )
            // InternalLang.g:3913:2: rule__Group__Group_6__0__Impl rule__Group__Group_6__1
            {
            pushFollow(FOLLOW_32);
            rule__Group__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__0"


    // $ANTLR start "rule__Group__Group_6__0__Impl"
    // InternalLang.g:3920:1: rule__Group__Group_6__0__Impl : ( 'anyOf' ) ;
    public final void rule__Group__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3924:1: ( ( 'anyOf' ) )
            // InternalLang.g:3925:1: ( 'anyOf' )
            {
            // InternalLang.g:3925:1: ( 'anyOf' )
            // InternalLang.g:3926:2: 'anyOf'
            {
             before(grammarAccess.getGroupAccess().getAnyOfKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getAnyOfKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__0__Impl"


    // $ANTLR start "rule__Group__Group_6__1"
    // InternalLang.g:3935:1: rule__Group__Group_6__1 : rule__Group__Group_6__1__Impl rule__Group__Group_6__2 ;
    public final void rule__Group__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3939:1: ( rule__Group__Group_6__1__Impl rule__Group__Group_6__2 )
            // InternalLang.g:3940:2: rule__Group__Group_6__1__Impl rule__Group__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__1"


    // $ANTLR start "rule__Group__Group_6__1__Impl"
    // InternalLang.g:3947:1: rule__Group__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Group__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3951:1: ( ( '(' ) )
            // InternalLang.g:3952:1: ( '(' )
            {
            // InternalLang.g:3952:1: ( '(' )
            // InternalLang.g:3953:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__1__Impl"


    // $ANTLR start "rule__Group__Group_6__2"
    // InternalLang.g:3962:1: rule__Group__Group_6__2 : rule__Group__Group_6__2__Impl rule__Group__Group_6__3 ;
    public final void rule__Group__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3966:1: ( rule__Group__Group_6__2__Impl rule__Group__Group_6__3 )
            // InternalLang.g:3967:2: rule__Group__Group_6__2__Impl rule__Group__Group_6__3
            {
            pushFollow(FOLLOW_33);
            rule__Group__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__2"


    // $ANTLR start "rule__Group__Group_6__2__Impl"
    // InternalLang.g:3974:1: rule__Group__Group_6__2__Impl : ( ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) ) ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* ) ) ;
    public final void rule__Group__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:3978:1: ( ( ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) ) ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* ) ) )
            // InternalLang.g:3979:1: ( ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) ) ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* ) )
            {
            // InternalLang.g:3979:1: ( ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) ) ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* ) )
            // InternalLang.g:3980:2: ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) ) ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* )
            {
            // InternalLang.g:3980:2: ( ( rule__Group__AnyOfComponentsAssignment_6_2 ) )
            // InternalLang.g:3981:3: ( rule__Group__AnyOfComponentsAssignment_6_2 )
            {
             before(grammarAccess.getGroupAccess().getAnyOfComponentsAssignment_6_2()); 
            // InternalLang.g:3982:3: ( rule__Group__AnyOfComponentsAssignment_6_2 )
            // InternalLang.g:3982:4: rule__Group__AnyOfComponentsAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__Group__AnyOfComponentsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAnyOfComponentsAssignment_6_2()); 

            }

            // InternalLang.g:3985:2: ( ( rule__Group__AnyOfComponentsAssignment_6_2 )* )
            // InternalLang.g:3986:3: ( rule__Group__AnyOfComponentsAssignment_6_2 )*
            {
             before(grammarAccess.getGroupAccess().getAnyOfComponentsAssignment_6_2()); 
            // InternalLang.g:3987:3: ( rule__Group__AnyOfComponentsAssignment_6_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalLang.g:3987:4: rule__Group__AnyOfComponentsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Group__AnyOfComponentsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getAnyOfComponentsAssignment_6_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__2__Impl"


    // $ANTLR start "rule__Group__Group_6__3"
    // InternalLang.g:3996:1: rule__Group__Group_6__3 : rule__Group__Group_6__3__Impl ;
    public final void rule__Group__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4000:1: ( rule__Group__Group_6__3__Impl )
            // InternalLang.g:4001:2: rule__Group__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__3"


    // $ANTLR start "rule__Group__Group_6__3__Impl"
    // InternalLang.g:4007:1: rule__Group__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Group__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4011:1: ( ( ')' ) )
            // InternalLang.g:4012:1: ( ')' )
            {
            // InternalLang.g:4012:1: ( ')' )
            // InternalLang.g:4013:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_6_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_6__3__Impl"


    // $ANTLR start "rule__Group__Group_7__0"
    // InternalLang.g:4023:1: rule__Group__Group_7__0 : rule__Group__Group_7__0__Impl rule__Group__Group_7__1 ;
    public final void rule__Group__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4027:1: ( rule__Group__Group_7__0__Impl rule__Group__Group_7__1 )
            // InternalLang.g:4028:2: rule__Group__Group_7__0__Impl rule__Group__Group_7__1
            {
            pushFollow(FOLLOW_32);
            rule__Group__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__0"


    // $ANTLR start "rule__Group__Group_7__0__Impl"
    // InternalLang.g:4035:1: rule__Group__Group_7__0__Impl : ( 'noneOf' ) ;
    public final void rule__Group__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4039:1: ( ( 'noneOf' ) )
            // InternalLang.g:4040:1: ( 'noneOf' )
            {
            // InternalLang.g:4040:1: ( 'noneOf' )
            // InternalLang.g:4041:2: 'noneOf'
            {
             before(grammarAccess.getGroupAccess().getNoneOfKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNoneOfKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__0__Impl"


    // $ANTLR start "rule__Group__Group_7__1"
    // InternalLang.g:4050:1: rule__Group__Group_7__1 : rule__Group__Group_7__1__Impl rule__Group__Group_7__2 ;
    public final void rule__Group__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4054:1: ( rule__Group__Group_7__1__Impl rule__Group__Group_7__2 )
            // InternalLang.g:4055:2: rule__Group__Group_7__1__Impl rule__Group__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__1"


    // $ANTLR start "rule__Group__Group_7__1__Impl"
    // InternalLang.g:4062:1: rule__Group__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Group__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4066:1: ( ( '(' ) )
            // InternalLang.g:4067:1: ( '(' )
            {
            // InternalLang.g:4067:1: ( '(' )
            // InternalLang.g:4068:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__1__Impl"


    // $ANTLR start "rule__Group__Group_7__2"
    // InternalLang.g:4077:1: rule__Group__Group_7__2 : rule__Group__Group_7__2__Impl rule__Group__Group_7__3 ;
    public final void rule__Group__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4081:1: ( rule__Group__Group_7__2__Impl rule__Group__Group_7__3 )
            // InternalLang.g:4082:2: rule__Group__Group_7__2__Impl rule__Group__Group_7__3
            {
            pushFollow(FOLLOW_33);
            rule__Group__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__2"


    // $ANTLR start "rule__Group__Group_7__2__Impl"
    // InternalLang.g:4089:1: rule__Group__Group_7__2__Impl : ( ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) ) ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* ) ) ;
    public final void rule__Group__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4093:1: ( ( ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) ) ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* ) ) )
            // InternalLang.g:4094:1: ( ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) ) ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* ) )
            {
            // InternalLang.g:4094:1: ( ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) ) ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* ) )
            // InternalLang.g:4095:2: ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) ) ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* )
            {
            // InternalLang.g:4095:2: ( ( rule__Group__NoneOfComponentsAssignment_7_2 ) )
            // InternalLang.g:4096:3: ( rule__Group__NoneOfComponentsAssignment_7_2 )
            {
             before(grammarAccess.getGroupAccess().getNoneOfComponentsAssignment_7_2()); 
            // InternalLang.g:4097:3: ( rule__Group__NoneOfComponentsAssignment_7_2 )
            // InternalLang.g:4097:4: rule__Group__NoneOfComponentsAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__Group__NoneOfComponentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNoneOfComponentsAssignment_7_2()); 

            }

            // InternalLang.g:4100:2: ( ( rule__Group__NoneOfComponentsAssignment_7_2 )* )
            // InternalLang.g:4101:3: ( rule__Group__NoneOfComponentsAssignment_7_2 )*
            {
             before(grammarAccess.getGroupAccess().getNoneOfComponentsAssignment_7_2()); 
            // InternalLang.g:4102:3: ( rule__Group__NoneOfComponentsAssignment_7_2 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalLang.g:4102:4: rule__Group__NoneOfComponentsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Group__NoneOfComponentsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getNoneOfComponentsAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__2__Impl"


    // $ANTLR start "rule__Group__Group_7__3"
    // InternalLang.g:4111:1: rule__Group__Group_7__3 : rule__Group__Group_7__3__Impl ;
    public final void rule__Group__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4115:1: ( rule__Group__Group_7__3__Impl )
            // InternalLang.g:4116:2: rule__Group__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__3"


    // $ANTLR start "rule__Group__Group_7__3__Impl"
    // InternalLang.g:4122:1: rule__Group__Group_7__3__Impl : ( ')' ) ;
    public final void rule__Group__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4126:1: ( ( ')' ) )
            // InternalLang.g:4127:1: ( ')' )
            {
            // InternalLang.g:4127:1: ( ')' )
            // InternalLang.g:4128:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_7__3__Impl"


    // $ANTLR start "rule__ApiRule__Group__0"
    // InternalLang.g:4138:1: rule__ApiRule__Group__0 : rule__ApiRule__Group__0__Impl rule__ApiRule__Group__1 ;
    public final void rule__ApiRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4142:1: ( rule__ApiRule__Group__0__Impl rule__ApiRule__Group__1 )
            // InternalLang.g:4143:2: rule__ApiRule__Group__0__Impl rule__ApiRule__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ApiRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApiRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group__0"


    // $ANTLR start "rule__ApiRule__Group__0__Impl"
    // InternalLang.g:4150:1: rule__ApiRule__Group__0__Impl : ( ( rule__ApiRule__ComponentAssignment_0 ) ) ;
    public final void rule__ApiRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4154:1: ( ( ( rule__ApiRule__ComponentAssignment_0 ) ) )
            // InternalLang.g:4155:1: ( ( rule__ApiRule__ComponentAssignment_0 ) )
            {
            // InternalLang.g:4155:1: ( ( rule__ApiRule__ComponentAssignment_0 ) )
            // InternalLang.g:4156:2: ( rule__ApiRule__ComponentAssignment_0 )
            {
             before(grammarAccess.getApiRuleAccess().getComponentAssignment_0()); 
            // InternalLang.g:4157:2: ( rule__ApiRule__ComponentAssignment_0 )
            // InternalLang.g:4157:3: rule__ApiRule__ComponentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ApiRule__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getApiRuleAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group__0__Impl"


    // $ANTLR start "rule__ApiRule__Group__1"
    // InternalLang.g:4165:1: rule__ApiRule__Group__1 : rule__ApiRule__Group__1__Impl ;
    public final void rule__ApiRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4169:1: ( rule__ApiRule__Group__1__Impl )
            // InternalLang.g:4170:2: rule__ApiRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApiRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group__1"


    // $ANTLR start "rule__ApiRule__Group__1__Impl"
    // InternalLang.g:4176:1: rule__ApiRule__Group__1__Impl : ( ( rule__ApiRule__Group_1__0 )? ) ;
    public final void rule__ApiRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4180:1: ( ( ( rule__ApiRule__Group_1__0 )? ) )
            // InternalLang.g:4181:1: ( ( rule__ApiRule__Group_1__0 )? )
            {
            // InternalLang.g:4181:1: ( ( rule__ApiRule__Group_1__0 )? )
            // InternalLang.g:4182:2: ( rule__ApiRule__Group_1__0 )?
            {
             before(grammarAccess.getApiRuleAccess().getGroup_1()); 
            // InternalLang.g:4183:2: ( rule__ApiRule__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalLang.g:4183:3: rule__ApiRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApiRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApiRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group__1__Impl"


    // $ANTLR start "rule__ApiRule__Group_1__0"
    // InternalLang.g:4192:1: rule__ApiRule__Group_1__0 : rule__ApiRule__Group_1__0__Impl rule__ApiRule__Group_1__1 ;
    public final void rule__ApiRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4196:1: ( rule__ApiRule__Group_1__0__Impl rule__ApiRule__Group_1__1 )
            // InternalLang.g:4197:2: rule__ApiRule__Group_1__0__Impl rule__ApiRule__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ApiRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApiRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__0"


    // $ANTLR start "rule__ApiRule__Group_1__0__Impl"
    // InternalLang.g:4204:1: rule__ApiRule__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ApiRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4208:1: ( ( '(' ) )
            // InternalLang.g:4209:1: ( '(' )
            {
            // InternalLang.g:4209:1: ( '(' )
            // InternalLang.g:4210:2: '('
            {
             before(grammarAccess.getApiRuleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getApiRuleAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__0__Impl"


    // $ANTLR start "rule__ApiRule__Group_1__1"
    // InternalLang.g:4219:1: rule__ApiRule__Group_1__1 : rule__ApiRule__Group_1__1__Impl rule__ApiRule__Group_1__2 ;
    public final void rule__ApiRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4223:1: ( rule__ApiRule__Group_1__1__Impl rule__ApiRule__Group_1__2 )
            // InternalLang.g:4224:2: rule__ApiRule__Group_1__1__Impl rule__ApiRule__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__ApiRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApiRule__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__1"


    // $ANTLR start "rule__ApiRule__Group_1__1__Impl"
    // InternalLang.g:4231:1: rule__ApiRule__Group_1__1__Impl : ( ( ( rule__ApiRule__AccesorsAssignment_1_1 ) ) ( ( rule__ApiRule__AccesorsAssignment_1_1 )* ) ) ;
    public final void rule__ApiRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4235:1: ( ( ( ( rule__ApiRule__AccesorsAssignment_1_1 ) ) ( ( rule__ApiRule__AccesorsAssignment_1_1 )* ) ) )
            // InternalLang.g:4236:1: ( ( ( rule__ApiRule__AccesorsAssignment_1_1 ) ) ( ( rule__ApiRule__AccesorsAssignment_1_1 )* ) )
            {
            // InternalLang.g:4236:1: ( ( ( rule__ApiRule__AccesorsAssignment_1_1 ) ) ( ( rule__ApiRule__AccesorsAssignment_1_1 )* ) )
            // InternalLang.g:4237:2: ( ( rule__ApiRule__AccesorsAssignment_1_1 ) ) ( ( rule__ApiRule__AccesorsAssignment_1_1 )* )
            {
            // InternalLang.g:4237:2: ( ( rule__ApiRule__AccesorsAssignment_1_1 ) )
            // InternalLang.g:4238:3: ( rule__ApiRule__AccesorsAssignment_1_1 )
            {
             before(grammarAccess.getApiRuleAccess().getAccesorsAssignment_1_1()); 
            // InternalLang.g:4239:3: ( rule__ApiRule__AccesorsAssignment_1_1 )
            // InternalLang.g:4239:4: rule__ApiRule__AccesorsAssignment_1_1
            {
            pushFollow(FOLLOW_37);
            rule__ApiRule__AccesorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApiRuleAccess().getAccesorsAssignment_1_1()); 

            }

            // InternalLang.g:4242:2: ( ( rule__ApiRule__AccesorsAssignment_1_1 )* )
            // InternalLang.g:4243:3: ( rule__ApiRule__AccesorsAssignment_1_1 )*
            {
             before(grammarAccess.getApiRuleAccess().getAccesorsAssignment_1_1()); 
            // InternalLang.g:4244:3: ( rule__ApiRule__AccesorsAssignment_1_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=11 && LA53_0<=15)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalLang.g:4244:4: rule__ApiRule__AccesorsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__ApiRule__AccesorsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getApiRuleAccess().getAccesorsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__1__Impl"


    // $ANTLR start "rule__ApiRule__Group_1__2"
    // InternalLang.g:4253:1: rule__ApiRule__Group_1__2 : rule__ApiRule__Group_1__2__Impl ;
    public final void rule__ApiRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4257:1: ( rule__ApiRule__Group_1__2__Impl )
            // InternalLang.g:4258:2: rule__ApiRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApiRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__2"


    // $ANTLR start "rule__ApiRule__Group_1__2__Impl"
    // InternalLang.g:4264:1: rule__ApiRule__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ApiRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4268:1: ( ( ')' ) )
            // InternalLang.g:4269:1: ( ')' )
            {
            // InternalLang.g:4269:1: ( ')' )
            // InternalLang.g:4270:2: ')'
            {
             before(grammarAccess.getApiRuleAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getApiRuleAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__Group_1__2__Impl"


    // $ANTLR start "rule__ParentSystem__Group__0"
    // InternalLang.g:4280:1: rule__ParentSystem__Group__0 : rule__ParentSystem__Group__0__Impl rule__ParentSystem__Group__1 ;
    public final void rule__ParentSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4284:1: ( rule__ParentSystem__Group__0__Impl rule__ParentSystem__Group__1 )
            // InternalLang.g:4285:2: rule__ParentSystem__Group__0__Impl rule__ParentSystem__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ParentSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__0"


    // $ANTLR start "rule__ParentSystem__Group__0__Impl"
    // InternalLang.g:4292:1: rule__ParentSystem__Group__0__Impl : ( 'parent_sys' ) ;
    public final void rule__ParentSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4296:1: ( ( 'parent_sys' ) )
            // InternalLang.g:4297:1: ( 'parent_sys' )
            {
            // InternalLang.g:4297:1: ( 'parent_sys' )
            // InternalLang.g:4298:2: 'parent_sys'
            {
             before(grammarAccess.getParentSystemAccess().getParent_sysKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getParent_sysKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__0__Impl"


    // $ANTLR start "rule__ParentSystem__Group__1"
    // InternalLang.g:4307:1: rule__ParentSystem__Group__1 : rule__ParentSystem__Group__1__Impl rule__ParentSystem__Group__2 ;
    public final void rule__ParentSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4311:1: ( rule__ParentSystem__Group__1__Impl rule__ParentSystem__Group__2 )
            // InternalLang.g:4312:2: rule__ParentSystem__Group__1__Impl rule__ParentSystem__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ParentSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__1"


    // $ANTLR start "rule__ParentSystem__Group__1__Impl"
    // InternalLang.g:4319:1: rule__ParentSystem__Group__1__Impl : ( ( rule__ParentSystem__ComponentAliasAssignment_1 )? ) ;
    public final void rule__ParentSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4323:1: ( ( ( rule__ParentSystem__ComponentAliasAssignment_1 )? ) )
            // InternalLang.g:4324:1: ( ( rule__ParentSystem__ComponentAliasAssignment_1 )? )
            {
            // InternalLang.g:4324:1: ( ( rule__ParentSystem__ComponentAliasAssignment_1 )? )
            // InternalLang.g:4325:2: ( rule__ParentSystem__ComponentAliasAssignment_1 )?
            {
             before(grammarAccess.getParentSystemAccess().getComponentAliasAssignment_1()); 
            // InternalLang.g:4326:2: ( rule__ParentSystem__ComponentAliasAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==24) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalLang.g:4326:3: rule__ParentSystem__ComponentAliasAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParentSystem__ComponentAliasAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParentSystemAccess().getComponentAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__1__Impl"


    // $ANTLR start "rule__ParentSystem__Group__2"
    // InternalLang.g:4334:1: rule__ParentSystem__Group__2 : rule__ParentSystem__Group__2__Impl rule__ParentSystem__Group__3 ;
    public final void rule__ParentSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4338:1: ( rule__ParentSystem__Group__2__Impl rule__ParentSystem__Group__3 )
            // InternalLang.g:4339:2: rule__ParentSystem__Group__2__Impl rule__ParentSystem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ParentSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__2"


    // $ANTLR start "rule__ParentSystem__Group__2__Impl"
    // InternalLang.g:4346:1: rule__ParentSystem__Group__2__Impl : ( ( rule__ParentSystem__UniqueAssignment_2 )? ) ;
    public final void rule__ParentSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4350:1: ( ( ( rule__ParentSystem__UniqueAssignment_2 )? ) )
            // InternalLang.g:4351:1: ( ( rule__ParentSystem__UniqueAssignment_2 )? )
            {
            // InternalLang.g:4351:1: ( ( rule__ParentSystem__UniqueAssignment_2 )? )
            // InternalLang.g:4352:2: ( rule__ParentSystem__UniqueAssignment_2 )?
            {
             before(grammarAccess.getParentSystemAccess().getUniqueAssignment_2()); 
            // InternalLang.g:4353:2: ( rule__ParentSystem__UniqueAssignment_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLang.g:4353:3: rule__ParentSystem__UniqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParentSystem__UniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParentSystemAccess().getUniqueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__2__Impl"


    // $ANTLR start "rule__ParentSystem__Group__3"
    // InternalLang.g:4361:1: rule__ParentSystem__Group__3 : rule__ParentSystem__Group__3__Impl rule__ParentSystem__Group__4 ;
    public final void rule__ParentSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4365:1: ( rule__ParentSystem__Group__3__Impl rule__ParentSystem__Group__4 )
            // InternalLang.g:4366:2: rule__ParentSystem__Group__3__Impl rule__ParentSystem__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ParentSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__3"


    // $ANTLR start "rule__ParentSystem__Group__3__Impl"
    // InternalLang.g:4373:1: rule__ParentSystem__Group__3__Impl : ( ( rule__ParentSystem__NameAssignment_3 ) ) ;
    public final void rule__ParentSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4377:1: ( ( ( rule__ParentSystem__NameAssignment_3 ) ) )
            // InternalLang.g:4378:1: ( ( rule__ParentSystem__NameAssignment_3 ) )
            {
            // InternalLang.g:4378:1: ( ( rule__ParentSystem__NameAssignment_3 ) )
            // InternalLang.g:4379:2: ( rule__ParentSystem__NameAssignment_3 )
            {
             before(grammarAccess.getParentSystemAccess().getNameAssignment_3()); 
            // InternalLang.g:4380:2: ( rule__ParentSystem__NameAssignment_3 )
            // InternalLang.g:4380:3: rule__ParentSystem__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParentSystem__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParentSystemAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__3__Impl"


    // $ANTLR start "rule__ParentSystem__Group__4"
    // InternalLang.g:4388:1: rule__ParentSystem__Group__4 : rule__ParentSystem__Group__4__Impl rule__ParentSystem__Group__5 ;
    public final void rule__ParentSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4392:1: ( rule__ParentSystem__Group__4__Impl rule__ParentSystem__Group__5 )
            // InternalLang.g:4393:2: rule__ParentSystem__Group__4__Impl rule__ParentSystem__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__ParentSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__4"


    // $ANTLR start "rule__ParentSystem__Group__4__Impl"
    // InternalLang.g:4400:1: rule__ParentSystem__Group__4__Impl : ( ( rule__ParentSystem__Group_4__0 )? ) ;
    public final void rule__ParentSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4404:1: ( ( ( rule__ParentSystem__Group_4__0 )? ) )
            // InternalLang.g:4405:1: ( ( rule__ParentSystem__Group_4__0 )? )
            {
            // InternalLang.g:4405:1: ( ( rule__ParentSystem__Group_4__0 )? )
            // InternalLang.g:4406:2: ( rule__ParentSystem__Group_4__0 )?
            {
             before(grammarAccess.getParentSystemAccess().getGroup_4()); 
            // InternalLang.g:4407:2: ( rule__ParentSystem__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==44) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalLang.g:4407:3: rule__ParentSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParentSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParentSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__4__Impl"


    // $ANTLR start "rule__ParentSystem__Group__5"
    // InternalLang.g:4415:1: rule__ParentSystem__Group__5 : rule__ParentSystem__Group__5__Impl rule__ParentSystem__Group__6 ;
    public final void rule__ParentSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4419:1: ( rule__ParentSystem__Group__5__Impl rule__ParentSystem__Group__6 )
            // InternalLang.g:4420:2: rule__ParentSystem__Group__5__Impl rule__ParentSystem__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ParentSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__5"


    // $ANTLR start "rule__ParentSystem__Group__5__Impl"
    // InternalLang.g:4427:1: rule__ParentSystem__Group__5__Impl : ( '{' ) ;
    public final void rule__ParentSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4431:1: ( ( '{' ) )
            // InternalLang.g:4432:1: ( '{' )
            {
            // InternalLang.g:4432:1: ( '{' )
            // InternalLang.g:4433:2: '{'
            {
             before(grammarAccess.getParentSystemAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__5__Impl"


    // $ANTLR start "rule__ParentSystem__Group__6"
    // InternalLang.g:4442:1: rule__ParentSystem__Group__6 : rule__ParentSystem__Group__6__Impl rule__ParentSystem__Group__7 ;
    public final void rule__ParentSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4446:1: ( rule__ParentSystem__Group__6__Impl rule__ParentSystem__Group__7 )
            // InternalLang.g:4447:2: rule__ParentSystem__Group__6__Impl rule__ParentSystem__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ParentSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__6"


    // $ANTLR start "rule__ParentSystem__Group__6__Impl"
    // InternalLang.g:4454:1: rule__ParentSystem__Group__6__Impl : ( ( ( rule__ParentSystem__ChildrenAssignment_6 ) ) ( ( rule__ParentSystem__ChildrenAssignment_6 )* ) ) ;
    public final void rule__ParentSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4458:1: ( ( ( ( rule__ParentSystem__ChildrenAssignment_6 ) ) ( ( rule__ParentSystem__ChildrenAssignment_6 )* ) ) )
            // InternalLang.g:4459:1: ( ( ( rule__ParentSystem__ChildrenAssignment_6 ) ) ( ( rule__ParentSystem__ChildrenAssignment_6 )* ) )
            {
            // InternalLang.g:4459:1: ( ( ( rule__ParentSystem__ChildrenAssignment_6 ) ) ( ( rule__ParentSystem__ChildrenAssignment_6 )* ) )
            // InternalLang.g:4460:2: ( ( rule__ParentSystem__ChildrenAssignment_6 ) ) ( ( rule__ParentSystem__ChildrenAssignment_6 )* )
            {
            // InternalLang.g:4460:2: ( ( rule__ParentSystem__ChildrenAssignment_6 ) )
            // InternalLang.g:4461:3: ( rule__ParentSystem__ChildrenAssignment_6 )
            {
             before(grammarAccess.getParentSystemAccess().getChildrenAssignment_6()); 
            // InternalLang.g:4462:3: ( rule__ParentSystem__ChildrenAssignment_6 )
            // InternalLang.g:4462:4: rule__ParentSystem__ChildrenAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__ParentSystem__ChildrenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParentSystemAccess().getChildrenAssignment_6()); 

            }

            // InternalLang.g:4465:2: ( ( rule__ParentSystem__ChildrenAssignment_6 )* )
            // InternalLang.g:4466:3: ( rule__ParentSystem__ChildrenAssignment_6 )*
            {
             before(grammarAccess.getParentSystemAccess().getChildrenAssignment_6()); 
            // InternalLang.g:4467:3: ( rule__ParentSystem__ChildrenAssignment_6 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalLang.g:4467:4: rule__ParentSystem__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ParentSystem__ChildrenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getParentSystemAccess().getChildrenAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__6__Impl"


    // $ANTLR start "rule__ParentSystem__Group__7"
    // InternalLang.g:4476:1: rule__ParentSystem__Group__7 : rule__ParentSystem__Group__7__Impl ;
    public final void rule__ParentSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4480:1: ( rule__ParentSystem__Group__7__Impl )
            // InternalLang.g:4481:2: rule__ParentSystem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__7"


    // $ANTLR start "rule__ParentSystem__Group__7__Impl"
    // InternalLang.g:4487:1: rule__ParentSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__ParentSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4491:1: ( ( '}' ) )
            // InternalLang.g:4492:1: ( '}' )
            {
            // InternalLang.g:4492:1: ( '}' )
            // InternalLang.g:4493:2: '}'
            {
             before(grammarAccess.getParentSystemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group__7__Impl"


    // $ANTLR start "rule__ParentSystem__Group_4__0"
    // InternalLang.g:4503:1: rule__ParentSystem__Group_4__0 : rule__ParentSystem__Group_4__0__Impl rule__ParentSystem__Group_4__1 ;
    public final void rule__ParentSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4507:1: ( rule__ParentSystem__Group_4__0__Impl rule__ParentSystem__Group_4__1 )
            // InternalLang.g:4508:2: rule__ParentSystem__Group_4__0__Impl rule__ParentSystem__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__ParentSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group_4__0"


    // $ANTLR start "rule__ParentSystem__Group_4__0__Impl"
    // InternalLang.g:4515:1: rule__ParentSystem__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__ParentSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4519:1: ( ( 'extends' ) )
            // InternalLang.g:4520:1: ( 'extends' )
            {
            // InternalLang.g:4520:1: ( 'extends' )
            // InternalLang.g:4521:2: 'extends'
            {
             before(grammarAccess.getParentSystemAccess().getExtendsKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group_4__0__Impl"


    // $ANTLR start "rule__ParentSystem__Group_4__1"
    // InternalLang.g:4530:1: rule__ParentSystem__Group_4__1 : rule__ParentSystem__Group_4__1__Impl ;
    public final void rule__ParentSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4534:1: ( rule__ParentSystem__Group_4__1__Impl )
            // InternalLang.g:4535:2: rule__ParentSystem__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParentSystem__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group_4__1"


    // $ANTLR start "rule__ParentSystem__Group_4__1__Impl"
    // InternalLang.g:4541:1: rule__ParentSystem__Group_4__1__Impl : ( ( rule__ParentSystem__ParentAssignment_4_1 ) ) ;
    public final void rule__ParentSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4545:1: ( ( ( rule__ParentSystem__ParentAssignment_4_1 ) ) )
            // InternalLang.g:4546:1: ( ( rule__ParentSystem__ParentAssignment_4_1 ) )
            {
            // InternalLang.g:4546:1: ( ( rule__ParentSystem__ParentAssignment_4_1 ) )
            // InternalLang.g:4547:2: ( rule__ParentSystem__ParentAssignment_4_1 )
            {
             before(grammarAccess.getParentSystemAccess().getParentAssignment_4_1()); 
            // InternalLang.g:4548:2: ( rule__ParentSystem__ParentAssignment_4_1 )
            // InternalLang.g:4548:3: rule__ParentSystem__ParentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParentSystem__ParentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParentSystemAccess().getParentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLang.g:4557:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4561:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLang.g:4562:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLang.g:4569:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4573:1: ( ( ruleValidID ) )
            // InternalLang.g:4574:1: ( ruleValidID )
            {
            // InternalLang.g:4574:1: ( ruleValidID )
            // InternalLang.g:4575:2: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
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
    // InternalLang.g:4584:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4588:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLang.g:4589:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalLang.g:4595:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4599:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLang.g:4600:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLang.g:4600:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLang.g:4601:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLang.g:4602:2: ( rule__QualifiedName__Group_1__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==45) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalLang.g:4602:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalLang.g:4611:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4615:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLang.g:4616:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalLang.g:4623:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4627:1: ( ( '.' ) )
            // InternalLang.g:4628:1: ( '.' )
            {
            // InternalLang.g:4628:1: ( '.' )
            // InternalLang.g:4629:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalLang.g:4638:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4642:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLang.g:4643:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalLang.g:4649:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4653:1: ( ( ruleValidID ) )
            // InternalLang.g:4654:1: ( ruleValidID )
            {
            // InternalLang.g:4654:1: ( ruleValidID )
            // InternalLang.g:4655:2: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Project__PlatformDefinitionAssignment_0"
    // InternalLang.g:4665:1: rule__Project__PlatformDefinitionAssignment_0 : ( rulePlatforms ) ;
    public final void rule__Project__PlatformDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4669:1: ( ( rulePlatforms ) )
            // InternalLang.g:4670:2: ( rulePlatforms )
            {
            // InternalLang.g:4670:2: ( rulePlatforms )
            // InternalLang.g:4671:3: rulePlatforms
            {
             before(grammarAccess.getProjectAccess().getPlatformDefinitionPlatformsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlatforms();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPlatformDefinitionPlatformsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PlatformDefinitionAssignment_0"


    // $ANTLR start "rule__Project__NamespaceAssignment_1"
    // InternalLang.g:4680:1: rule__Project__NamespaceAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Project__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4684:1: ( ( ruleNamespace ) )
            // InternalLang.g:4685:2: ( ruleNamespace )
            {
            // InternalLang.g:4685:2: ( ruleNamespace )
            // InternalLang.g:4686:3: ruleNamespace
            {
             before(grammarAccess.getProjectAccess().getNamespaceNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getNamespaceNamespaceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NamespaceAssignment_1"


    // $ANTLR start "rule__Project__TypeAliasesAssignment_2"
    // InternalLang.g:4695:1: rule__Project__TypeAliasesAssignment_2 : ( ruleAlias ) ;
    public final void rule__Project__TypeAliasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4699:1: ( ( ruleAlias ) )
            // InternalLang.g:4700:2: ( ruleAlias )
            {
            // InternalLang.g:4700:2: ( ruleAlias )
            // InternalLang.g:4701:3: ruleAlias
            {
             before(grammarAccess.getProjectAccess().getTypeAliasesAliasParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTypeAliasesAliasParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TypeAliasesAssignment_2"


    // $ANTLR start "rule__Project__ComponentsAssignment_3"
    // InternalLang.g:4710:1: rule__Project__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Project__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4714:1: ( ( ruleComponent ) )
            // InternalLang.g:4715:2: ( ruleComponent )
            {
            // InternalLang.g:4715:2: ( ruleComponent )
            // InternalLang.g:4716:3: ruleComponent
            {
             before(grammarAccess.getProjectAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getComponentsComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ComponentsAssignment_3"


    // $ANTLR start "rule__Project__SystemsAssignment_4"
    // InternalLang.g:4725:1: rule__Project__SystemsAssignment_4 : ( ruleSystem ) ;
    public final void rule__Project__SystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4729:1: ( ( ruleSystem ) )
            // InternalLang.g:4730:2: ( ruleSystem )
            {
            // InternalLang.g:4730:2: ( ruleSystem )
            // InternalLang.g:4731:3: ruleSystem
            {
             before(grammarAccess.getProjectAccess().getSystemsSystemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getSystemsSystemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__SystemsAssignment_4"


    // $ANTLR start "rule__Project__ParentSystemsAssignment_5"
    // InternalLang.g:4740:1: rule__Project__ParentSystemsAssignment_5 : ( ruleParentSystem ) ;
    public final void rule__Project__ParentSystemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4744:1: ( ( ruleParentSystem ) )
            // InternalLang.g:4745:2: ( ruleParentSystem )
            {
            // InternalLang.g:4745:2: ( ruleParentSystem )
            // InternalLang.g:4746:3: ruleParentSystem
            {
             before(grammarAccess.getProjectAccess().getParentSystemsParentSystemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParentSystem();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getParentSystemsParentSystemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ParentSystemsAssignment_5"


    // $ANTLR start "rule__Project__ContextDefinitionsAssignment_6"
    // InternalLang.g:4755:1: rule__Project__ContextDefinitionsAssignment_6 : ( ruleContextDefinition ) ;
    public final void rule__Project__ContextDefinitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4759:1: ( ( ruleContextDefinition ) )
            // InternalLang.g:4760:2: ( ruleContextDefinition )
            {
            // InternalLang.g:4760:2: ( ruleContextDefinition )
            // InternalLang.g:4761:3: ruleContextDefinition
            {
             before(grammarAccess.getProjectAccess().getContextDefinitionsContextDefinitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContextDefinition();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getContextDefinitionsContextDefinitionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ContextDefinitionsAssignment_6"


    // $ANTLR start "rule__ContextDefinition__NameAssignment_1"
    // InternalLang.g:4770:1: rule__ContextDefinition__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__ContextDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4774:1: ( ( ruleValidID ) )
            // InternalLang.g:4775:2: ( ruleValidID )
            {
            // InternalLang.g:4775:2: ( ruleValidID )
            // InternalLang.g:4776:3: ruleValidID
            {
             before(grammarAccess.getContextDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getContextDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__NameAssignment_1"


    // $ANTLR start "rule__ContextDefinition__ComponentsAssignment_3"
    // InternalLang.g:4785:1: rule__ContextDefinition__ComponentsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ContextDefinition__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4789:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:4790:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:4790:2: ( ( RULE_ID ) )
            // InternalLang.g:4791:3: ( RULE_ID )
            {
             before(grammarAccess.getContextDefinitionAccess().getComponentsAComponentCrossReference_3_0()); 
            // InternalLang.g:4792:3: ( RULE_ID )
            // InternalLang.g:4793:4: RULE_ID
            {
             before(grammarAccess.getContextDefinitionAccess().getComponentsAComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextDefinitionAccess().getComponentsAComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getContextDefinitionAccess().getComponentsAComponentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextDefinition__ComponentsAssignment_3"


    // $ANTLR start "rule__Platforms__IdsAssignment_1"
    // InternalLang.g:4804:1: rule__Platforms__IdsAssignment_1 : ( rulePlatformID ) ;
    public final void rule__Platforms__IdsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4808:1: ( ( rulePlatformID ) )
            // InternalLang.g:4809:2: ( rulePlatformID )
            {
            // InternalLang.g:4809:2: ( rulePlatformID )
            // InternalLang.g:4810:3: rulePlatformID
            {
             before(grammarAccess.getPlatformsAccess().getIdsPlatformIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformID();

            state._fsp--;

             after(grammarAccess.getPlatformsAccess().getIdsPlatformIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platforms__IdsAssignment_1"


    // $ANTLR start "rule__PlatformID__NameAssignment"
    // InternalLang.g:4819:1: rule__PlatformID__NameAssignment : ( ruleValidID ) ;
    public final void rule__PlatformID__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4823:1: ( ( ruleValidID ) )
            // InternalLang.g:4824:2: ( ruleValidID )
            {
            // InternalLang.g:4824:2: ( ruleValidID )
            // InternalLang.g:4825:3: ruleValidID
            {
             before(grammarAccess.getPlatformIDAccess().getNameValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getPlatformIDAccess().getNameValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformID__NameAssignment"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // InternalLang.g:4834:1: rule__Namespace__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4838:1: ( ( ruleQualifiedName ) )
            // InternalLang.g:4839:2: ( ruleQualifiedName )
            {
            // InternalLang.g:4839:2: ( ruleQualifiedName )
            // InternalLang.g:4840:3: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Alias__ComponentAliasAssignment_1"
    // InternalLang.g:4849:1: rule__Alias__ComponentAliasAssignment_1 : ( ( 'comp' ) ) ;
    public final void rule__Alias__ComponentAliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4853:1: ( ( ( 'comp' ) ) )
            // InternalLang.g:4854:2: ( ( 'comp' ) )
            {
            // InternalLang.g:4854:2: ( ( 'comp' ) )
            // InternalLang.g:4855:3: ( 'comp' )
            {
             before(grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0()); 
            // InternalLang.g:4856:3: ( 'comp' )
            // InternalLang.g:4857:4: 'comp'
            {
             before(grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0()); 

            }

             after(grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__ComponentAliasAssignment_1"


    // $ANTLR start "rule__Alias__UniqueAssignment_2"
    // InternalLang.g:4868:1: rule__Alias__UniqueAssignment_2 : ( ( 'unique' ) ) ;
    public final void rule__Alias__UniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4872:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:4873:2: ( ( 'unique' ) )
            {
            // InternalLang.g:4873:2: ( ( 'unique' ) )
            // InternalLang.g:4874:3: ( 'unique' )
            {
             before(grammarAccess.getAliasAccess().getUniqueUniqueKeyword_2_0()); 
            // InternalLang.g:4875:3: ( 'unique' )
            // InternalLang.g:4876:4: 'unique'
            {
             before(grammarAccess.getAliasAccess().getUniqueUniqueKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getUniqueUniqueKeyword_2_0()); 

            }

             after(grammarAccess.getAliasAccess().getUniqueUniqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__UniqueAssignment_2"


    // $ANTLR start "rule__Alias__NameAssignment_3"
    // InternalLang.g:4887:1: rule__Alias__NameAssignment_3 : ( ruleValidID ) ;
    public final void rule__Alias__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4891:1: ( ( ruleValidID ) )
            // InternalLang.g:4892:2: ( ruleValidID )
            {
            // InternalLang.g:4892:2: ( ruleValidID )
            // InternalLang.g:4893:3: ruleValidID
            {
             before(grammarAccess.getAliasAccess().getNameValidIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getAliasAccess().getNameValidIDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__NameAssignment_3"


    // $ANTLR start "rule__Alias__ListOfAliasesAssignment_4_0"
    // InternalLang.g:4902:1: rule__Alias__ListOfAliasesAssignment_4_0 : ( ruleAliasList ) ;
    public final void rule__Alias__ListOfAliasesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4906:1: ( ( ruleAliasList ) )
            // InternalLang.g:4907:2: ( ruleAliasList )
            {
            // InternalLang.g:4907:2: ( ruleAliasList )
            // InternalLang.g:4908:3: ruleAliasList
            {
             before(grammarAccess.getAliasAccess().getListOfAliasesAliasListParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasList();

            state._fsp--;

             after(grammarAccess.getAliasAccess().getListOfAliasesAliasListParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__ListOfAliasesAssignment_4_0"


    // $ANTLR start "rule__Alias__SingleAliasAssignment_4_1"
    // InternalLang.g:4917:1: rule__Alias__SingleAliasAssignment_4_1 : ( ruleSingleAlias ) ;
    public final void rule__Alias__SingleAliasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4921:1: ( ( ruleSingleAlias ) )
            // InternalLang.g:4922:2: ( ruleSingleAlias )
            {
            // InternalLang.g:4922:2: ( ruleSingleAlias )
            // InternalLang.g:4923:3: ruleSingleAlias
            {
             before(grammarAccess.getAliasAccess().getSingleAliasSingleAliasParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleAlias();

            state._fsp--;

             after(grammarAccess.getAliasAccess().getSingleAliasSingleAliasParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__SingleAliasAssignment_4_1"


    // $ANTLR start "rule__SingleAlias__TypeAliasAssignment_1"
    // InternalLang.g:4932:1: rule__SingleAlias__TypeAliasAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SingleAlias__TypeAliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4936:1: ( ( RULE_STRING ) )
            // InternalLang.g:4937:2: ( RULE_STRING )
            {
            // InternalLang.g:4937:2: ( RULE_STRING )
            // InternalLang.g:4938:3: RULE_STRING
            {
             before(grammarAccess.getSingleAliasAccess().getTypeAliasSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSingleAliasAccess().getTypeAliasSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__TypeAliasAssignment_1"


    // $ANTLR start "rule__SingleAlias__SizeAssignment_2"
    // InternalLang.g:4947:1: rule__SingleAlias__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__SingleAlias__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4951:1: ( ( RULE_INT ) )
            // InternalLang.g:4952:2: ( RULE_INT )
            {
            // InternalLang.g:4952:2: ( RULE_INT )
            // InternalLang.g:4953:3: RULE_INT
            {
             before(grammarAccess.getSingleAliasAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleAliasAccess().getSizeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAlias__SizeAssignment_2"


    // $ANTLR start "rule__AliasList__RulesAssignment_1"
    // InternalLang.g:4962:1: rule__AliasList__RulesAssignment_1 : ( ruleAliasRule ) ;
    public final void rule__AliasList__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4966:1: ( ( ruleAliasRule ) )
            // InternalLang.g:4967:2: ( ruleAliasRule )
            {
            // InternalLang.g:4967:2: ( ruleAliasRule )
            // InternalLang.g:4968:3: ruleAliasRule
            {
             before(grammarAccess.getAliasListAccess().getRulesAliasRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAliasRule();

            state._fsp--;

             after(grammarAccess.getAliasListAccess().getRulesAliasRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasList__RulesAssignment_1"


    // $ANTLR start "rule__AliasRule__PlatformAssignment_0"
    // InternalLang.g:4977:1: rule__AliasRule__PlatformAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AliasRule__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:4981:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:4982:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:4982:2: ( ( RULE_ID ) )
            // InternalLang.g:4983:3: ( RULE_ID )
            {
             before(grammarAccess.getAliasRuleAccess().getPlatformPlatformIDCrossReference_0_0()); 
            // InternalLang.g:4984:3: ( RULE_ID )
            // InternalLang.g:4985:4: RULE_ID
            {
             before(grammarAccess.getAliasRuleAccess().getPlatformPlatformIDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasRuleAccess().getPlatformPlatformIDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAliasRuleAccess().getPlatformPlatformIDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__PlatformAssignment_0"


    // $ANTLR start "rule__AliasRule__TypeAliasAssignment_2"
    // InternalLang.g:4996:1: rule__AliasRule__TypeAliasAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AliasRule__TypeAliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5000:1: ( ( RULE_STRING ) )
            // InternalLang.g:5001:2: ( RULE_STRING )
            {
            // InternalLang.g:5001:2: ( RULE_STRING )
            // InternalLang.g:5002:3: RULE_STRING
            {
             before(grammarAccess.getAliasRuleAccess().getTypeAliasSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAliasRuleAccess().getTypeAliasSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__TypeAliasAssignment_2"


    // $ANTLR start "rule__AliasRule__SizeAssignment_3_0"
    // InternalLang.g:5011:1: rule__AliasRule__SizeAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__AliasRule__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5015:1: ( ( RULE_INT ) )
            // InternalLang.g:5016:2: ( RULE_INT )
            {
            // InternalLang.g:5016:2: ( RULE_INT )
            // InternalLang.g:5017:3: RULE_INT
            {
             before(grammarAccess.getAliasRuleAccess().getSizeINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAliasRuleAccess().getSizeINTTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__SizeAssignment_3_0"


    // $ANTLR start "rule__AliasRule__VariableSizeAssignment_3_1"
    // InternalLang.g:5026:1: rule__AliasRule__VariableSizeAssignment_3_1 : ( ( '*' ) ) ;
    public final void rule__AliasRule__VariableSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5030:1: ( ( ( '*' ) ) )
            // InternalLang.g:5031:2: ( ( '*' ) )
            {
            // InternalLang.g:5031:2: ( ( '*' ) )
            // InternalLang.g:5032:3: ( '*' )
            {
             before(grammarAccess.getAliasRuleAccess().getVariableSizeAsteriskKeyword_3_1_0()); 
            // InternalLang.g:5033:3: ( '*' )
            // InternalLang.g:5034:4: '*'
            {
             before(grammarAccess.getAliasRuleAccess().getVariableSizeAsteriskKeyword_3_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAliasRuleAccess().getVariableSizeAsteriskKeyword_3_1_0()); 

            }

             after(grammarAccess.getAliasRuleAccess().getVariableSizeAsteriskKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasRule__VariableSizeAssignment_3_1"


    // $ANTLR start "rule__Component__UniqueAssignment_1"
    // InternalLang.g:5045:1: rule__Component__UniqueAssignment_1 : ( ( 'unique' ) ) ;
    public final void rule__Component__UniqueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5049:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:5050:2: ( ( 'unique' ) )
            {
            // InternalLang.g:5050:2: ( ( 'unique' ) )
            // InternalLang.g:5051:3: ( 'unique' )
            {
             before(grammarAccess.getComponentAccess().getUniqueUniqueKeyword_1_0()); 
            // InternalLang.g:5052:3: ( 'unique' )
            // InternalLang.g:5053:4: 'unique'
            {
             before(grammarAccess.getComponentAccess().getUniqueUniqueKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getUniqueUniqueKeyword_1_0()); 

            }

             after(grammarAccess.getComponentAccess().getUniqueUniqueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UniqueAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_2"
    // InternalLang.g:5064:1: rule__Component__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Component__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5068:1: ( ( ruleValidID ) )
            // InternalLang.g:5069:2: ( ruleValidID )
            {
            // InternalLang.g:5069:2: ( ruleValidID )
            // InternalLang.g:5070:3: ruleValidID
            {
             before(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_2"


    // $ANTLR start "rule__Component__ValueTypeAssignment_3_0_0_1"
    // InternalLang.g:5079:1: rule__Component__ValueTypeAssignment_3_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__ValueTypeAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5083:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5084:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5084:2: ( ( RULE_ID ) )
            // InternalLang.g:5085:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getValueTypeAliasCrossReference_3_0_0_1_0()); 
            // InternalLang.g:5086:3: ( RULE_ID )
            // InternalLang.g:5087:4: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getValueTypeAliasIDTerminalRuleCall_3_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getValueTypeAliasIDTerminalRuleCall_3_0_0_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getValueTypeAliasCrossReference_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ValueTypeAssignment_3_0_0_1"


    // $ANTLR start "rule__Component__PropertiesAssignment_3_0_1_1"
    // InternalLang.g:5098:1: rule__Component__PropertiesAssignment_3_0_1_1 : ( ruleComponentProperty ) ;
    public final void rule__Component__PropertiesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5102:1: ( ( ruleComponentProperty ) )
            // InternalLang.g:5103:2: ( ruleComponentProperty )
            {
            // InternalLang.g:5103:2: ( ruleComponentProperty )
            // InternalLang.g:5104:3: ruleComponentProperty
            {
             before(grammarAccess.getComponentAccess().getPropertiesComponentPropertyParserRuleCall_3_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPropertiesComponentPropertyParserRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PropertiesAssignment_3_0_1_1"


    // $ANTLR start "rule__Component__PrefixAssignment_3_1_1"
    // InternalLang.g:5113:1: rule__Component__PrefixAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Component__PrefixAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5117:1: ( ( RULE_STRING ) )
            // InternalLang.g:5118:2: ( RULE_STRING )
            {
            // InternalLang.g:5118:2: ( RULE_STRING )
            // InternalLang.g:5119:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getPrefixSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getPrefixSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PrefixAssignment_3_1_1"


    // $ANTLR start "rule__ComponentProperty__NameAssignment_0"
    // InternalLang.g:5128:1: rule__ComponentProperty__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ComponentProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5132:1: ( ( ruleValidID ) )
            // InternalLang.g:5133:2: ( ruleValidID )
            {
            // InternalLang.g:5133:2: ( ruleValidID )
            // InternalLang.g:5134:3: ruleValidID
            {
             before(grammarAccess.getComponentPropertyAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getComponentPropertyAccess().getNameValidIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__NameAssignment_0"


    // $ANTLR start "rule__ComponentProperty__TypeAssignment_2"
    // InternalLang.g:5143:1: rule__ComponentProperty__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentProperty__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5147:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5148:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5148:2: ( ( RULE_ID ) )
            // InternalLang.g:5149:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentPropertyAccess().getTypeAliasCrossReference_2_0()); 
            // InternalLang.g:5150:3: ( RULE_ID )
            // InternalLang.g:5151:4: RULE_ID
            {
             before(grammarAccess.getComponentPropertyAccess().getTypeAliasIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentPropertyAccess().getTypeAliasIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentPropertyAccess().getTypeAliasCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentProperty__TypeAssignment_2"


    // $ANTLR start "rule__System__ComponentAliasAssignment_1"
    // InternalLang.g:5162:1: rule__System__ComponentAliasAssignment_1 : ( ( 'comp' ) ) ;
    public final void rule__System__ComponentAliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5166:1: ( ( ( 'comp' ) ) )
            // InternalLang.g:5167:2: ( ( 'comp' ) )
            {
            // InternalLang.g:5167:2: ( ( 'comp' ) )
            // InternalLang.g:5168:3: ( 'comp' )
            {
             before(grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0()); 
            // InternalLang.g:5169:3: ( 'comp' )
            // InternalLang.g:5170:4: 'comp'
            {
             before(grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0()); 

            }

             after(grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ComponentAliasAssignment_1"


    // $ANTLR start "rule__System__UniqueAssignment_2"
    // InternalLang.g:5181:1: rule__System__UniqueAssignment_2 : ( ( 'unique' ) ) ;
    public final void rule__System__UniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5185:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:5186:2: ( ( 'unique' ) )
            {
            // InternalLang.g:5186:2: ( ( 'unique' ) )
            // InternalLang.g:5187:3: ( 'unique' )
            {
             before(grammarAccess.getSystemAccess().getUniqueUniqueKeyword_2_0()); 
            // InternalLang.g:5188:3: ( 'unique' )
            // InternalLang.g:5189:4: 'unique'
            {
             before(grammarAccess.getSystemAccess().getUniqueUniqueKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getUniqueUniqueKeyword_2_0()); 

            }

             after(grammarAccess.getSystemAccess().getUniqueUniqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__UniqueAssignment_2"


    // $ANTLR start "rule__System__InitAssignment_3"
    // InternalLang.g:5200:1: rule__System__InitAssignment_3 : ( ( 'init' ) ) ;
    public final void rule__System__InitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5204:1: ( ( ( 'init' ) ) )
            // InternalLang.g:5205:2: ( ( 'init' ) )
            {
            // InternalLang.g:5205:2: ( ( 'init' ) )
            // InternalLang.g:5206:3: ( 'init' )
            {
             before(grammarAccess.getSystemAccess().getInitInitKeyword_3_0()); 
            // InternalLang.g:5207:3: ( 'init' )
            // InternalLang.g:5208:4: 'init'
            {
             before(grammarAccess.getSystemAccess().getInitInitKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getInitInitKeyword_3_0()); 

            }

             after(grammarAccess.getSystemAccess().getInitInitKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__InitAssignment_3"


    // $ANTLR start "rule__System__NameAssignment_4"
    // InternalLang.g:5219:1: rule__System__NameAssignment_4 : ( ruleValidID ) ;
    public final void rule__System__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5223:1: ( ( ruleValidID ) )
            // InternalLang.g:5224:2: ( ruleValidID )
            {
            // InternalLang.g:5224:2: ( ruleValidID )
            // InternalLang.g:5225:3: ruleValidID
            {
             before(grammarAccess.getSystemAccess().getNameValidIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameValidIDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_4"


    // $ANTLR start "rule__System__InputAssignment_6"
    // InternalLang.g:5234:1: rule__System__InputAssignment_6 : ( ruleInput ) ;
    public final void rule__System__InputAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5238:1: ( ( ruleInput ) )
            // InternalLang.g:5239:2: ( ruleInput )
            {
            // InternalLang.g:5239:2: ( ruleInput )
            // InternalLang.g:5240:3: ruleInput
            {
             before(grammarAccess.getSystemAccess().getInputInputParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getInputInputParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__InputAssignment_6"


    // $ANTLR start "rule__System__UniqueCompAssignment_7"
    // InternalLang.g:5249:1: rule__System__UniqueCompAssignment_7 : ( ruleUniqueComponentAccess ) ;
    public final void rule__System__UniqueCompAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5253:1: ( ( ruleUniqueComponentAccess ) )
            // InternalLang.g:5254:2: ( ruleUniqueComponentAccess )
            {
            // InternalLang.g:5254:2: ( ruleUniqueComponentAccess )
            // InternalLang.g:5255:3: ruleUniqueComponentAccess
            {
             before(grammarAccess.getSystemAccess().getUniqueCompUniqueComponentAccessParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUniqueComponentAccess();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getUniqueCompUniqueComponentAccessParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__UniqueCompAssignment_7"


    // $ANTLR start "rule__System__GroupsAssignment_8"
    // InternalLang.g:5264:1: rule__System__GroupsAssignment_8 : ( ruleGroup ) ;
    public final void rule__System__GroupsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5268:1: ( ( ruleGroup ) )
            // InternalLang.g:5269:2: ( ruleGroup )
            {
            // InternalLang.g:5269:2: ( ruleGroup )
            // InternalLang.g:5270:3: ruleGroup
            {
             before(grammarAccess.getSystemAccess().getGroupsGroupParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getGroupsGroupParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__GroupsAssignment_8"


    // $ANTLR start "rule__System__CreateRulesAssignment_9"
    // InternalLang.g:5279:1: rule__System__CreateRulesAssignment_9 : ( ruleCreateRule ) ;
    public final void rule__System__CreateRulesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5283:1: ( ( ruleCreateRule ) )
            // InternalLang.g:5284:2: ( ruleCreateRule )
            {
            // InternalLang.g:5284:2: ( ruleCreateRule )
            // InternalLang.g:5285:3: ruleCreateRule
            {
             before(grammarAccess.getSystemAccess().getCreateRulesCreateRuleParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateRule();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getCreateRulesCreateRuleParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__CreateRulesAssignment_9"


    // $ANTLR start "rule__Input__UnqiueAssignment_1"
    // InternalLang.g:5294:1: rule__Input__UnqiueAssignment_1 : ( ( 'unique' ) ) ;
    public final void rule__Input__UnqiueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5298:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:5299:2: ( ( 'unique' ) )
            {
            // InternalLang.g:5299:2: ( ( 'unique' ) )
            // InternalLang.g:5300:3: ( 'unique' )
            {
             before(grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0()); 
            // InternalLang.g:5301:3: ( 'unique' )
            // InternalLang.g:5302:4: 'unique'
            {
             before(grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0()); 

            }

             after(grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__UnqiueAssignment_1"


    // $ANTLR start "rule__Input__TriggersAssignment_5"
    // InternalLang.g:5313:1: rule__Input__TriggersAssignment_5 : ( ruleInputTrigger ) ;
    public final void rule__Input__TriggersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5317:1: ( ( ruleInputTrigger ) )
            // InternalLang.g:5318:2: ( ruleInputTrigger )
            {
            // InternalLang.g:5318:2: ( ruleInputTrigger )
            // InternalLang.g:5319:3: ruleInputTrigger
            {
             before(grammarAccess.getInputAccess().getTriggersInputTriggerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInputTrigger();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTriggersInputTriggerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TriggersAssignment_5"


    // $ANTLR start "rule__Input__EnsureComponentsAssignment_6_2"
    // InternalLang.g:5328:1: rule__Input__EnsureComponentsAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Input__EnsureComponentsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5332:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5333:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5333:2: ( ( RULE_ID ) )
            // InternalLang.g:5334:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getEnsureComponentsAComponentCrossReference_6_2_0()); 
            // InternalLang.g:5335:3: ( RULE_ID )
            // InternalLang.g:5336:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getEnsureComponentsAComponentIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getEnsureComponentsAComponentIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getInputAccess().getEnsureComponentsAComponentCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__EnsureComponentsAssignment_6_2"


    // $ANTLR start "rule__Input__ExcludeComponentsAssignment_7_2"
    // InternalLang.g:5347:1: rule__Input__ExcludeComponentsAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Input__ExcludeComponentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5351:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5352:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5352:2: ( ( RULE_ID ) )
            // InternalLang.g:5353:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getExcludeComponentsAComponentCrossReference_7_2_0()); 
            // InternalLang.g:5354:3: ( RULE_ID )
            // InternalLang.g:5355:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getExcludeComponentsAComponentIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getExcludeComponentsAComponentIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getInputAccess().getExcludeComponentsAComponentCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExcludeComponentsAssignment_7_2"


    // $ANTLR start "rule__Input__ApiRulesAssignment_10"
    // InternalLang.g:5366:1: rule__Input__ApiRulesAssignment_10 : ( ruleApiRule ) ;
    public final void rule__Input__ApiRulesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5370:1: ( ( ruleApiRule ) )
            // InternalLang.g:5371:2: ( ruleApiRule )
            {
            // InternalLang.g:5371:2: ( ruleApiRule )
            // InternalLang.g:5372:3: ruleApiRule
            {
             before(grammarAccess.getInputAccess().getApiRulesApiRuleParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleApiRule();

            state._fsp--;

             after(grammarAccess.getInputAccess().getApiRulesApiRuleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ApiRulesAssignment_10"


    // $ANTLR start "rule__Input__DestroyAssignment_11"
    // InternalLang.g:5381:1: rule__Input__DestroyAssignment_11 : ( ( 'destroy' ) ) ;
    public final void rule__Input__DestroyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5385:1: ( ( ( 'destroy' ) ) )
            // InternalLang.g:5386:2: ( ( 'destroy' ) )
            {
            // InternalLang.g:5386:2: ( ( 'destroy' ) )
            // InternalLang.g:5387:3: ( 'destroy' )
            {
             before(grammarAccess.getInputAccess().getDestroyDestroyKeyword_11_0()); 
            // InternalLang.g:5388:3: ( 'destroy' )
            // InternalLang.g:5389:4: 'destroy'
            {
             before(grammarAccess.getInputAccess().getDestroyDestroyKeyword_11_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getDestroyDestroyKeyword_11_0()); 

            }

             after(grammarAccess.getInputAccess().getDestroyDestroyKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__DestroyAssignment_11"


    // $ANTLR start "rule__InputTrigger__EnterComponentsAssignment_0_2"
    // InternalLang.g:5400:1: rule__InputTrigger__EnterComponentsAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__InputTrigger__EnterComponentsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5404:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5405:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5405:2: ( ( RULE_ID ) )
            // InternalLang.g:5406:3: ( RULE_ID )
            {
             before(grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentCrossReference_0_2_0()); 
            // InternalLang.g:5407:3: ( RULE_ID )
            // InternalLang.g:5408:4: RULE_ID
            {
             before(grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__EnterComponentsAssignment_0_2"


    // $ANTLR start "rule__InputTrigger__LeftAssignment_1_2"
    // InternalLang.g:5419:1: rule__InputTrigger__LeftAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__InputTrigger__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5423:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5424:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5424:2: ( ( RULE_ID ) )
            // InternalLang.g:5425:3: ( RULE_ID )
            {
             before(grammarAccess.getInputTriggerAccess().getLeftAComponentCrossReference_1_2_0()); 
            // InternalLang.g:5426:3: ( RULE_ID )
            // InternalLang.g:5427:4: RULE_ID
            {
             before(grammarAccess.getInputTriggerAccess().getLeftAComponentIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getLeftAComponentIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getInputTriggerAccess().getLeftAComponentCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__LeftAssignment_1_2"


    // $ANTLR start "rule__InputTrigger__EnteredOrLeftAssignment_2_2"
    // InternalLang.g:5438:1: rule__InputTrigger__EnteredOrLeftAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__InputTrigger__EnteredOrLeftAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5442:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5443:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5443:2: ( ( RULE_ID ) )
            // InternalLang.g:5444:3: ( RULE_ID )
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentCrossReference_2_2_0()); 
            // InternalLang.g:5445:3: ( RULE_ID )
            // InternalLang.g:5446:4: RULE_ID
            {
             before(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTrigger__EnteredOrLeftAssignment_2_2"


    // $ANTLR start "rule__CreateRule__NameAssignment_1"
    // InternalLang.g:5457:1: rule__CreateRule__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__CreateRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5461:1: ( ( ruleValidID ) )
            // InternalLang.g:5462:2: ( ruleValidID )
            {
            // InternalLang.g:5462:2: ( ruleValidID )
            // InternalLang.g:5463:3: ruleValidID
            {
             before(grammarAccess.getCreateRuleAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getCreateRuleAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__NameAssignment_1"


    // $ANTLR start "rule__CreateRule__ComponentTypesAssignment_3"
    // InternalLang.g:5472:1: rule__CreateRule__ComponentTypesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CreateRule__ComponentTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5476:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5477:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5477:2: ( ( RULE_ID ) )
            // InternalLang.g:5478:3: ( RULE_ID )
            {
             before(grammarAccess.getCreateRuleAccess().getComponentTypesAComponentCrossReference_3_0()); 
            // InternalLang.g:5479:3: ( RULE_ID )
            // InternalLang.g:5480:4: RULE_ID
            {
             before(grammarAccess.getCreateRuleAccess().getComponentTypesAComponentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateRuleAccess().getComponentTypesAComponentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCreateRuleAccess().getComponentTypesAComponentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateRule__ComponentTypesAssignment_3"


    // $ANTLR start "rule__UniqueComponentAccess__ApiRuleAssignment_2"
    // InternalLang.g:5491:1: rule__UniqueComponentAccess__ApiRuleAssignment_2 : ( ruleApiRule ) ;
    public final void rule__UniqueComponentAccess__ApiRuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5495:1: ( ( ruleApiRule ) )
            // InternalLang.g:5496:2: ( ruleApiRule )
            {
            // InternalLang.g:5496:2: ( ruleApiRule )
            // InternalLang.g:5497:3: ruleApiRule
            {
             before(grammarAccess.getUniqueComponentAccessAccess().getApiRuleApiRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleApiRule();

            state._fsp--;

             after(grammarAccess.getUniqueComponentAccessAccess().getApiRuleApiRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueComponentAccess__ApiRuleAssignment_2"


    // $ANTLR start "rule__Group__GroupAssignment_0_0"
    // InternalLang.g:5506:1: rule__Group__GroupAssignment_0_0 : ( ( 'group' ) ) ;
    public final void rule__Group__GroupAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5510:1: ( ( ( 'group' ) ) )
            // InternalLang.g:5511:2: ( ( 'group' ) )
            {
            // InternalLang.g:5511:2: ( ( 'group' ) )
            // InternalLang.g:5512:3: ( 'group' )
            {
             before(grammarAccess.getGroupAccess().getGroupGroupKeyword_0_0_0()); 
            // InternalLang.g:5513:3: ( 'group' )
            // InternalLang.g:5514:4: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupGroupKeyword_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupGroupKeyword_0_0_0()); 

            }

             after(grammarAccess.getGroupAccess().getGroupGroupKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__GroupAssignment_0_0"


    // $ANTLR start "rule__Group__UniqueAssignment_0_1"
    // InternalLang.g:5525:1: rule__Group__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__Group__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5529:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:5530:2: ( ( 'unique' ) )
            {
            // InternalLang.g:5530:2: ( ( 'unique' ) )
            // InternalLang.g:5531:3: ( 'unique' )
            {
             before(grammarAccess.getGroupAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalLang.g:5532:3: ( 'unique' )
            // InternalLang.g:5533:4: 'unique'
            {
             before(grammarAccess.getGroupAccess().getUniqueUniqueKeyword_0_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getUniqueUniqueKeyword_0_1_0()); 

            }

             after(grammarAccess.getGroupAccess().getUniqueUniqueKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__UniqueAssignment_0_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalLang.g:5544:1: rule__Group__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5548:1: ( ( ruleValidID ) )
            // InternalLang.g:5549:2: ( ruleValidID )
            {
            // InternalLang.g:5549:2: ( ruleValidID )
            // InternalLang.g:5550:3: ruleValidID
            {
             before(grammarAccess.getGroupAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__AllOfComponentsAssignment_5_2"
    // InternalLang.g:5559:1: rule__Group__AllOfComponentsAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Group__AllOfComponentsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5563:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5564:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5564:2: ( ( RULE_ID ) )
            // InternalLang.g:5565:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getAllOfComponentsAComponentCrossReference_5_2_0()); 
            // InternalLang.g:5566:3: ( RULE_ID )
            // InternalLang.g:5567:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getAllOfComponentsAComponentIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getAllOfComponentsAComponentIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getAllOfComponentsAComponentCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__AllOfComponentsAssignment_5_2"


    // $ANTLR start "rule__Group__AnyOfComponentsAssignment_6_2"
    // InternalLang.g:5578:1: rule__Group__AnyOfComponentsAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Group__AnyOfComponentsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5582:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5583:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5583:2: ( ( RULE_ID ) )
            // InternalLang.g:5584:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getAnyOfComponentsAComponentCrossReference_6_2_0()); 
            // InternalLang.g:5585:3: ( RULE_ID )
            // InternalLang.g:5586:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getAnyOfComponentsAComponentIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getAnyOfComponentsAComponentIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getAnyOfComponentsAComponentCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__AnyOfComponentsAssignment_6_2"


    // $ANTLR start "rule__Group__NoneOfComponentsAssignment_7_2"
    // InternalLang.g:5597:1: rule__Group__NoneOfComponentsAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Group__NoneOfComponentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5601:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5602:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5602:2: ( ( RULE_ID ) )
            // InternalLang.g:5603:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getNoneOfComponentsAComponentCrossReference_7_2_0()); 
            // InternalLang.g:5604:3: ( RULE_ID )
            // InternalLang.g:5605:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNoneOfComponentsAComponentIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNoneOfComponentsAComponentIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getNoneOfComponentsAComponentCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NoneOfComponentsAssignment_7_2"


    // $ANTLR start "rule__Group__ApiRulesAssignment_10"
    // InternalLang.g:5616:1: rule__Group__ApiRulesAssignment_10 : ( ruleApiRule ) ;
    public final void rule__Group__ApiRulesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5620:1: ( ( ruleApiRule ) )
            // InternalLang.g:5621:2: ( ruleApiRule )
            {
            // InternalLang.g:5621:2: ( ruleApiRule )
            // InternalLang.g:5622:3: ruleApiRule
            {
             before(grammarAccess.getGroupAccess().getApiRulesApiRuleParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleApiRule();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getApiRulesApiRuleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__ApiRulesAssignment_10"


    // $ANTLR start "rule__Group__DestroyAssignment_11"
    // InternalLang.g:5631:1: rule__Group__DestroyAssignment_11 : ( ( 'destroy' ) ) ;
    public final void rule__Group__DestroyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5635:1: ( ( ( 'destroy' ) ) )
            // InternalLang.g:5636:2: ( ( 'destroy' ) )
            {
            // InternalLang.g:5636:2: ( ( 'destroy' ) )
            // InternalLang.g:5637:3: ( 'destroy' )
            {
             before(grammarAccess.getGroupAccess().getDestroyDestroyKeyword_11_0()); 
            // InternalLang.g:5638:3: ( 'destroy' )
            // InternalLang.g:5639:4: 'destroy'
            {
             before(grammarAccess.getGroupAccess().getDestroyDestroyKeyword_11_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getDestroyDestroyKeyword_11_0()); 

            }

             after(grammarAccess.getGroupAccess().getDestroyDestroyKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__DestroyAssignment_11"


    // $ANTLR start "rule__ApiRule__ComponentAssignment_0"
    // InternalLang.g:5650:1: rule__ApiRule__ComponentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ApiRule__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5654:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5655:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5655:2: ( ( RULE_ID ) )
            // InternalLang.g:5656:3: ( RULE_ID )
            {
             before(grammarAccess.getApiRuleAccess().getComponentAComponentCrossReference_0_0()); 
            // InternalLang.g:5657:3: ( RULE_ID )
            // InternalLang.g:5658:4: RULE_ID
            {
             before(grammarAccess.getApiRuleAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApiRuleAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getApiRuleAccess().getComponentAComponentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__ComponentAssignment_0"


    // $ANTLR start "rule__ApiRule__AccesorsAssignment_1_1"
    // InternalLang.g:5669:1: rule__ApiRule__AccesorsAssignment_1_1 : ( ruleComponentApiAccessor ) ;
    public final void rule__ApiRule__AccesorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5673:1: ( ( ruleComponentApiAccessor ) )
            // InternalLang.g:5674:2: ( ruleComponentApiAccessor )
            {
            // InternalLang.g:5674:2: ( ruleComponentApiAccessor )
            // InternalLang.g:5675:3: ruleComponentApiAccessor
            {
             before(grammarAccess.getApiRuleAccess().getAccesorsComponentApiAccessorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentApiAccessor();

            state._fsp--;

             after(grammarAccess.getApiRuleAccess().getAccesorsComponentApiAccessorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApiRule__AccesorsAssignment_1_1"


    // $ANTLR start "rule__ParentSystem__ComponentAliasAssignment_1"
    // InternalLang.g:5684:1: rule__ParentSystem__ComponentAliasAssignment_1 : ( ( 'comp' ) ) ;
    public final void rule__ParentSystem__ComponentAliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5688:1: ( ( ( 'comp' ) ) )
            // InternalLang.g:5689:2: ( ( 'comp' ) )
            {
            // InternalLang.g:5689:2: ( ( 'comp' ) )
            // InternalLang.g:5690:3: ( 'comp' )
            {
             before(grammarAccess.getParentSystemAccess().getComponentAliasCompKeyword_1_0()); 
            // InternalLang.g:5691:3: ( 'comp' )
            // InternalLang.g:5692:4: 'comp'
            {
             before(grammarAccess.getParentSystemAccess().getComponentAliasCompKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getComponentAliasCompKeyword_1_0()); 

            }

             after(grammarAccess.getParentSystemAccess().getComponentAliasCompKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__ComponentAliasAssignment_1"


    // $ANTLR start "rule__ParentSystem__UniqueAssignment_2"
    // InternalLang.g:5703:1: rule__ParentSystem__UniqueAssignment_2 : ( ( 'unique' ) ) ;
    public final void rule__ParentSystem__UniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5707:1: ( ( ( 'unique' ) ) )
            // InternalLang.g:5708:2: ( ( 'unique' ) )
            {
            // InternalLang.g:5708:2: ( ( 'unique' ) )
            // InternalLang.g:5709:3: ( 'unique' )
            {
             before(grammarAccess.getParentSystemAccess().getUniqueUniqueKeyword_2_0()); 
            // InternalLang.g:5710:3: ( 'unique' )
            // InternalLang.g:5711:4: 'unique'
            {
             before(grammarAccess.getParentSystemAccess().getUniqueUniqueKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getUniqueUniqueKeyword_2_0()); 

            }

             after(grammarAccess.getParentSystemAccess().getUniqueUniqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__UniqueAssignment_2"


    // $ANTLR start "rule__ParentSystem__NameAssignment_3"
    // InternalLang.g:5722:1: rule__ParentSystem__NameAssignment_3 : ( ruleValidID ) ;
    public final void rule__ParentSystem__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5726:1: ( ( ruleValidID ) )
            // InternalLang.g:5727:2: ( ruleValidID )
            {
            // InternalLang.g:5727:2: ( ruleValidID )
            // InternalLang.g:5728:3: ruleValidID
            {
             before(grammarAccess.getParentSystemAccess().getNameValidIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getParentSystemAccess().getNameValidIDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__NameAssignment_3"


    // $ANTLR start "rule__ParentSystem__ParentAssignment_4_1"
    // InternalLang.g:5737:1: rule__ParentSystem__ParentAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParentSystem__ParentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5741:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5742:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5742:2: ( ( RULE_ID ) )
            // InternalLang.g:5743:3: ( RULE_ID )
            {
             before(grammarAccess.getParentSystemAccess().getParentAliasCrossReference_4_1_0()); 
            // InternalLang.g:5744:3: ( RULE_ID )
            // InternalLang.g:5745:4: RULE_ID
            {
             before(grammarAccess.getParentSystemAccess().getParentAliasIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getParentAliasIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getParentSystemAccess().getParentAliasCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__ParentAssignment_4_1"


    // $ANTLR start "rule__ParentSystem__ChildrenAssignment_6"
    // InternalLang.g:5756:1: rule__ParentSystem__ChildrenAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ParentSystem__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLang.g:5760:1: ( ( ( RULE_ID ) ) )
            // InternalLang.g:5761:2: ( ( RULE_ID ) )
            {
            // InternalLang.g:5761:2: ( ( RULE_ID ) )
            // InternalLang.g:5762:3: ( RULE_ID )
            {
             before(grammarAccess.getParentSystemAccess().getChildrenASystemCrossReference_6_0()); 
            // InternalLang.g:5763:3: ( RULE_ID )
            // InternalLang.g:5764:4: RULE_ID
            {
             before(grammarAccess.getParentSystemAccess().getChildrenASystemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParentSystemAccess().getChildrenASystemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getParentSystemAccess().getChildrenASystemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentSystem__ChildrenAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080005310000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004001000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002820000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000804001000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002006008040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001900000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001900000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000070020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000002L});

}