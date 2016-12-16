package ecs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ecs.services.LangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ctx'", "','", "'['", "']'", "'platform'", "'namespace'", "'alias'", "'comp'", "'unique'", "'='", "'{'", "'}'", "':'", "'*'", "'asIndexKey'", "'asMultiIndexKey'", "'/'", "'sys'", "'init'", "'cleanup'", "'teardown'", "'input'", "'trigger'", "'ensure'", "'exclude'", "'api'", "'destroy'", "'@'", "'enteredGroup'", "'('", "')'", "'leftGroup'", "'enteredOrLeftGroup'", "'create'", "'index'", "'key'", "'group'", "'matcher'", "'allOf'", "'anyOf'", "'noneOf'", "'add'", "'get'", "'has'", "'replace'", "'remove'", "'chain'", "'precondition'", "'proc'", "'params'", "'->'", "'observer'", "'.'", "'procs'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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

        public InternalLangParser(TokenStream input, LangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Project";
       	}

       	@Override
       	protected LangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalLang.g:64:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLang.g:64:48: (iv_ruleProject= ruleProject EOF )
            // InternalLang.g:65:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalLang.g:71:1: ruleProject returns [EObject current=null] : ( ( (lv_platformDefinition_0_0= rulePlatforms ) )? ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_contextDefinition_2_0= ruleContextDefinition ) )? ( (lv_typeAliases_3_0= ruleAlias ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_procedures_5_0= ruleProcedure ) )* ( (lv_observers_6_0= ruleObserver ) )* ( (lv_systems_7_0= ruleSystem ) )* ( (lv_chains_8_0= ruleChain ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        EObject lv_platformDefinition_0_0 = null;

        EObject lv_namespace_1_0 = null;

        EObject lv_contextDefinition_2_0 = null;

        EObject lv_typeAliases_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_procedures_5_0 = null;

        EObject lv_observers_6_0 = null;

        EObject lv_systems_7_0 = null;

        EObject lv_chains_8_0 = null;



        	enterRule();

        try {
            // InternalLang.g:77:2: ( ( ( (lv_platformDefinition_0_0= rulePlatforms ) )? ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_contextDefinition_2_0= ruleContextDefinition ) )? ( (lv_typeAliases_3_0= ruleAlias ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_procedures_5_0= ruleProcedure ) )* ( (lv_observers_6_0= ruleObserver ) )* ( (lv_systems_7_0= ruleSystem ) )* ( (lv_chains_8_0= ruleChain ) )* ) )
            // InternalLang.g:78:2: ( ( (lv_platformDefinition_0_0= rulePlatforms ) )? ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_contextDefinition_2_0= ruleContextDefinition ) )? ( (lv_typeAliases_3_0= ruleAlias ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_procedures_5_0= ruleProcedure ) )* ( (lv_observers_6_0= ruleObserver ) )* ( (lv_systems_7_0= ruleSystem ) )* ( (lv_chains_8_0= ruleChain ) )* )
            {
            // InternalLang.g:78:2: ( ( (lv_platformDefinition_0_0= rulePlatforms ) )? ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_contextDefinition_2_0= ruleContextDefinition ) )? ( (lv_typeAliases_3_0= ruleAlias ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_procedures_5_0= ruleProcedure ) )* ( (lv_observers_6_0= ruleObserver ) )* ( (lv_systems_7_0= ruleSystem ) )* ( (lv_chains_8_0= ruleChain ) )* )
            // InternalLang.g:79:3: ( (lv_platformDefinition_0_0= rulePlatforms ) )? ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_contextDefinition_2_0= ruleContextDefinition ) )? ( (lv_typeAliases_3_0= ruleAlias ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_procedures_5_0= ruleProcedure ) )* ( (lv_observers_6_0= ruleObserver ) )* ( (lv_systems_7_0= ruleSystem ) )* ( (lv_chains_8_0= ruleChain ) )*
            {
            // InternalLang.g:79:3: ( (lv_platformDefinition_0_0= rulePlatforms ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLang.g:80:4: (lv_platformDefinition_0_0= rulePlatforms )
                    {
                    // InternalLang.g:80:4: (lv_platformDefinition_0_0= rulePlatforms )
                    // InternalLang.g:81:5: lv_platformDefinition_0_0= rulePlatforms
                    {

                    					newCompositeNode(grammarAccess.getProjectAccess().getPlatformDefinitionPlatformsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_platformDefinition_0_0=rulePlatforms();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectRule());
                    					}
                    					set(
                    						current,
                    						"platformDefinition",
                    						lv_platformDefinition_0_0,
                    						"ecs.Lang.Platforms");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:98:3: ( (lv_namespace_1_0= ruleNamespace ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLang.g:99:4: (lv_namespace_1_0= ruleNamespace )
                    {
                    // InternalLang.g:99:4: (lv_namespace_1_0= ruleNamespace )
                    // InternalLang.g:100:5: lv_namespace_1_0= ruleNamespace
                    {

                    					newCompositeNode(grammarAccess.getProjectAccess().getNamespaceNamespaceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_namespace_1_0=ruleNamespace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectRule());
                    					}
                    					set(
                    						current,
                    						"namespace",
                    						lv_namespace_1_0,
                    						"ecs.Lang.Namespace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:117:3: ( (lv_contextDefinition_2_0= ruleContextDefinition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLang.g:118:4: (lv_contextDefinition_2_0= ruleContextDefinition )
                    {
                    // InternalLang.g:118:4: (lv_contextDefinition_2_0= ruleContextDefinition )
                    // InternalLang.g:119:5: lv_contextDefinition_2_0= ruleContextDefinition
                    {

                    					newCompositeNode(grammarAccess.getProjectAccess().getContextDefinitionContextDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_contextDefinition_2_0=ruleContextDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectRule());
                    					}
                    					set(
                    						current,
                    						"contextDefinition",
                    						lv_contextDefinition_2_0,
                    						"ecs.Lang.ContextDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:136:3: ( (lv_typeAliases_3_0= ruleAlias ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLang.g:137:4: (lv_typeAliases_3_0= ruleAlias )
            	    {
            	    // InternalLang.g:137:4: (lv_typeAliases_3_0= ruleAlias )
            	    // InternalLang.g:138:5: lv_typeAliases_3_0= ruleAlias
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getTypeAliasesAliasParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_typeAliases_3_0=ruleAlias();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeAliases",
            	    						lv_typeAliases_3_0,
            	    						"ecs.Lang.Alias");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalLang.g:155:3: ( (lv_components_4_0= ruleComponent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLang.g:156:4: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalLang.g:156:4: (lv_components_4_0= ruleComponent )
            	    // InternalLang.g:157:5: lv_components_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getComponentsComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_4_0,
            	    						"ecs.Lang.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalLang.g:174:3: ( (lv_procedures_5_0= ruleProcedure ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==59) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLang.g:175:4: (lv_procedures_5_0= ruleProcedure )
            	    {
            	    // InternalLang.g:175:4: (lv_procedures_5_0= ruleProcedure )
            	    // InternalLang.g:176:5: lv_procedures_5_0= ruleProcedure
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getProceduresProcedureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_procedures_5_0=ruleProcedure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"procedures",
            	    						lv_procedures_5_0,
            	    						"ecs.Lang.Procedure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalLang.g:193:3: ( (lv_observers_6_0= ruleObserver ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==62) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLang.g:194:4: (lv_observers_6_0= ruleObserver )
            	    {
            	    // InternalLang.g:194:4: (lv_observers_6_0= ruleObserver )
            	    // InternalLang.g:195:5: lv_observers_6_0= ruleObserver
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getObserversObserverParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_observers_6_0=ruleObserver();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"observers",
            	    						lv_observers_6_0,
            	    						"ecs.Lang.Observer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalLang.g:212:3: ( (lv_systems_7_0= ruleSystem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLang.g:213:4: (lv_systems_7_0= ruleSystem )
            	    {
            	    // InternalLang.g:213:4: (lv_systems_7_0= ruleSystem )
            	    // InternalLang.g:214:5: lv_systems_7_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getSystemsSystemParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_systems_7_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_7_0,
            	    						"ecs.Lang.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalLang.g:231:3: ( (lv_chains_8_0= ruleChain ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==57) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLang.g:232:4: (lv_chains_8_0= ruleChain )
            	    {
            	    // InternalLang.g:232:4: (lv_chains_8_0= ruleChain )
            	    // InternalLang.g:233:5: lv_chains_8_0= ruleChain
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getChainsChainParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_chains_8_0=ruleChain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chains",
            	    						lv_chains_8_0,
            	    						"ecs.Lang.Chain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleContextDefinition"
    // InternalLang.g:254:1: entryRuleContextDefinition returns [EObject current=null] : iv_ruleContextDefinition= ruleContextDefinition EOF ;
    public final EObject entryRuleContextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefinition = null;


        try {
            // InternalLang.g:254:58: (iv_ruleContextDefinition= ruleContextDefinition EOF )
            // InternalLang.g:255:2: iv_ruleContextDefinition= ruleContextDefinition EOF
            {
             newCompositeNode(grammarAccess.getContextDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextDefinition=ruleContextDefinition();

            state._fsp--;

             current =iv_ruleContextDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextDefinition"


    // $ANTLR start "ruleContextDefinition"
    // InternalLang.g:261:1: ruleContextDefinition returns [EObject current=null] : (otherlv_0= 'ctx' ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+ ) ;
    public final EObject ruleContextDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_names_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:267:2: ( (otherlv_0= 'ctx' ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+ ) )
            // InternalLang.g:268:2: (otherlv_0= 'ctx' ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+ )
            {
            // InternalLang.g:268:2: (otherlv_0= 'ctx' ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+ )
            // InternalLang.g:269:3: otherlv_0= 'ctx' ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContextDefinitionAccess().getCtxKeyword_0());
            		
            // InternalLang.g:273:3: ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalLang.g:274:4: ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalLang.g:274:4: ( (lv_names_1_0= ruleContextName ) )
            	    // InternalLang.g:275:5: (lv_names_1_0= ruleContextName )
            	    {
            	    // InternalLang.g:275:5: (lv_names_1_0= ruleContextName )
            	    // InternalLang.g:276:6: lv_names_1_0= ruleContextName
            	    {

            	    						newCompositeNode(grammarAccess.getContextDefinitionAccess().getNamesContextNameParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_names_1_0=ruleContextName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"names",
            	    							lv_names_1_0,
            	    							"ecs.Lang.ContextName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLang.g:293:4: (otherlv_2= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==12) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalLang.g:294:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            	            					newLeafNode(otherlv_2, grammarAccess.getContextDefinitionAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextDefinition"


    // $ANTLR start "entryRuleContextName"
    // InternalLang.g:304:1: entryRuleContextName returns [EObject current=null] : iv_ruleContextName= ruleContextName EOF ;
    public final EObject entryRuleContextName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextName = null;


        try {
            // InternalLang.g:304:52: (iv_ruleContextName= ruleContextName EOF )
            // InternalLang.g:305:2: iv_ruleContextName= ruleContextName EOF
            {
             newCompositeNode(grammarAccess.getContextNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextName=ruleContextName();

            state._fsp--;

             current =iv_ruleContextName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextName"


    // $ANTLR start "ruleContextName"
    // InternalLang.g:311:1: ruleContextName returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleContextName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:317:2: ( ( (lv_name_0_0= ruleValidID ) ) )
            // InternalLang.g:318:2: ( (lv_name_0_0= ruleValidID ) )
            {
            // InternalLang.g:318:2: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:319:3: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:319:3: (lv_name_0_0= ruleValidID )
            // InternalLang.g:320:4: lv_name_0_0= ruleValidID
            {

            				newCompositeNode(grammarAccess.getContextNameAccess().getNameValidIDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getContextNameRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"ecs.Lang.ValidID");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextName"


    // $ANTLR start "entryRuleContextReference"
    // InternalLang.g:340:1: entryRuleContextReference returns [EObject current=null] : iv_ruleContextReference= ruleContextReference EOF ;
    public final EObject entryRuleContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextReference = null;


        try {
            // InternalLang.g:340:57: (iv_ruleContextReference= ruleContextReference EOF )
            // InternalLang.g:341:2: iv_ruleContextReference= ruleContextReference EOF
            {
             newCompositeNode(grammarAccess.getContextReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextReference=ruleContextReference();

            state._fsp--;

             current =iv_ruleContextReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextReference"


    // $ANTLR start "ruleContextReference"
    // InternalLang.g:347:1: ruleContextReference returns [EObject current=null] : (otherlv_0= '[' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+ otherlv_3= ']' ) ;
    public final EObject ruleContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLang.g:353:2: ( (otherlv_0= '[' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+ otherlv_3= ']' ) )
            // InternalLang.g:354:2: (otherlv_0= '[' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+ otherlv_3= ']' )
            {
            // InternalLang.g:354:2: (otherlv_0= '[' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+ otherlv_3= ']' )
            // InternalLang.g:355:3: otherlv_0= '[' ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+ otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getContextReferenceAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalLang.g:359:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )? )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLang.g:360:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalLang.g:360:4: ( (otherlv_1= RULE_ID ) )
            	    // InternalLang.g:361:5: (otherlv_1= RULE_ID )
            	    {
            	    // InternalLang.g:361:5: (otherlv_1= RULE_ID )
            	    // InternalLang.g:362:6: otherlv_1= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContextReferenceRule());
            	    						}
            	    					
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_1, grammarAccess.getContextReferenceAccess().getContextContextNameCrossReference_1_0_0());
            	    					

            	    }


            	    }

            	    // InternalLang.g:373:4: (otherlv_2= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==12) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalLang.g:374:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            	            					newLeafNode(otherlv_2, grammarAccess.getContextReferenceAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContextReferenceAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextReference"


    // $ANTLR start "entryRulePlatforms"
    // InternalLang.g:388:1: entryRulePlatforms returns [EObject current=null] : iv_rulePlatforms= rulePlatforms EOF ;
    public final EObject entryRulePlatforms() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatforms = null;


        try {
            // InternalLang.g:388:50: (iv_rulePlatforms= rulePlatforms EOF )
            // InternalLang.g:389:2: iv_rulePlatforms= rulePlatforms EOF
            {
             newCompositeNode(grammarAccess.getPlatformsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatforms=rulePlatforms();

            state._fsp--;

             current =iv_rulePlatforms; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatforms"


    // $ANTLR start "rulePlatforms"
    // InternalLang.g:395:1: rulePlatforms returns [EObject current=null] : (otherlv_0= 'platform' ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+ ) ;
    public final EObject rulePlatforms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:401:2: ( (otherlv_0= 'platform' ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+ ) )
            // InternalLang.g:402:2: (otherlv_0= 'platform' ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+ )
            {
            // InternalLang.g:402:2: (otherlv_0= 'platform' ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+ )
            // InternalLang.g:403:3: otherlv_0= 'platform' ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformsAccess().getPlatformKeyword_0());
            		
            // InternalLang.g:407:3: ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalLang.g:408:4: ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalLang.g:408:4: ( (lv_ids_1_0= rulePlatformID ) )
            	    // InternalLang.g:409:5: (lv_ids_1_0= rulePlatformID )
            	    {
            	    // InternalLang.g:409:5: (lv_ids_1_0= rulePlatformID )
            	    // InternalLang.g:410:6: lv_ids_1_0= rulePlatformID
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformsAccess().getIdsPlatformIDParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ids_1_0=rulePlatformID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ids",
            	    							lv_ids_1_0,
            	    							"ecs.Lang.PlatformID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLang.g:427:4: (otherlv_2= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==12) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalLang.g:428:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            	            					newLeafNode(otherlv_2, grammarAccess.getPlatformsAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatforms"


    // $ANTLR start "entryRulePlatformID"
    // InternalLang.g:438:1: entryRulePlatformID returns [EObject current=null] : iv_rulePlatformID= rulePlatformID EOF ;
    public final EObject entryRulePlatformID() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformID = null;


        try {
            // InternalLang.g:438:51: (iv_rulePlatformID= rulePlatformID EOF )
            // InternalLang.g:439:2: iv_rulePlatformID= rulePlatformID EOF
            {
             newCompositeNode(grammarAccess.getPlatformIDRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformID=rulePlatformID();

            state._fsp--;

             current =iv_rulePlatformID; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatformID"


    // $ANTLR start "rulePlatformID"
    // InternalLang.g:445:1: rulePlatformID returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject rulePlatformID() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:451:2: ( ( (lv_name_0_0= ruleValidID ) ) )
            // InternalLang.g:452:2: ( (lv_name_0_0= ruleValidID ) )
            {
            // InternalLang.g:452:2: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:453:3: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:453:3: (lv_name_0_0= ruleValidID )
            // InternalLang.g:454:4: lv_name_0_0= ruleValidID
            {

            				newCompositeNode(grammarAccess.getPlatformIDAccess().getNameValidIDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPlatformIDRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"ecs.Lang.ValidID");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatformID"


    // $ANTLR start "entryRuleNamespace"
    // InternalLang.g:474:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalLang.g:474:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalLang.g:475:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalLang.g:481:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:487:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalLang.g:488:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalLang.g:488:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalLang.g:489:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalLang.g:493:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLang.g:494:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLang.g:494:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLang.g:495:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ecs.Lang.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleAlias"
    // InternalLang.g:516:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalLang.g:516:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalLang.g:517:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalLang.g:523:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_3_0=null;
        EObject lv_contextRef_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_listOfAliases_5_0 = null;

        EObject lv_singleAlias_6_0 = null;



        	enterRule();

        try {
            // InternalLang.g:529:2: ( (otherlv_0= 'alias' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) ) ) )
            // InternalLang.g:530:2: (otherlv_0= 'alias' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) ) )
            {
            // InternalLang.g:530:2: (otherlv_0= 'alias' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) ) )
            // InternalLang.g:531:3: otherlv_0= 'alias' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
            		
            // InternalLang.g:535:3: ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLang.g:536:4: ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )?
                    {
                    // InternalLang.g:536:4: ( (lv_componentAlias_1_0= 'comp' ) )
                    // InternalLang.g:537:5: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:537:5: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:538:6: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,18,FOLLOW_18); 

                    						newLeafNode(lv_componentAlias_1_0, grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasRule());
                    						}
                    						setWithLastConsumed(current, "componentAlias", true, "comp");
                    					

                    }


                    }

                    // InternalLang.g:550:4: ( (lv_contextRef_2_0= ruleContextReference ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==13) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalLang.g:551:5: (lv_contextRef_2_0= ruleContextReference )
                            {
                            // InternalLang.g:551:5: (lv_contextRef_2_0= ruleContextReference )
                            // InternalLang.g:552:6: lv_contextRef_2_0= ruleContextReference
                            {

                            						newCompositeNode(grammarAccess.getAliasAccess().getContextRefContextReferenceParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_contextRef_2_0=ruleContextReference();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAliasRule());
                            						}
                            						set(
                            							current,
                            							"contextRef",
                            							lv_contextRef_2_0,
                            							"ecs.Lang.ContextReference");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalLang.g:569:4: ( (lv_unique_3_0= 'unique' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==19) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalLang.g:570:5: (lv_unique_3_0= 'unique' )
                            {
                            // InternalLang.g:570:5: (lv_unique_3_0= 'unique' )
                            // InternalLang.g:571:6: lv_unique_3_0= 'unique'
                            {
                            lv_unique_3_0=(Token)match(input,19,FOLLOW_11); 

                            						newLeafNode(lv_unique_3_0, grammarAccess.getAliasAccess().getUniqueUniqueKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAliasRule());
                            						}
                            						setWithLastConsumed(current, "unique", true, "unique");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLang.g:584:3: ( (lv_name_4_0= ruleValidID ) )
            // InternalLang.g:585:4: (lv_name_4_0= ruleValidID )
            {
            // InternalLang.g:585:4: (lv_name_4_0= ruleValidID )
            // InternalLang.g:586:5: lv_name_4_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getAliasAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:603:3: ( ( (lv_listOfAliases_5_0= ruleAliasList ) ) | ( (lv_singleAlias_6_0= ruleSingleAlias ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==20) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLang.g:604:4: ( (lv_listOfAliases_5_0= ruleAliasList ) )
                    {
                    // InternalLang.g:604:4: ( (lv_listOfAliases_5_0= ruleAliasList ) )
                    // InternalLang.g:605:5: (lv_listOfAliases_5_0= ruleAliasList )
                    {
                    // InternalLang.g:605:5: (lv_listOfAliases_5_0= ruleAliasList )
                    // InternalLang.g:606:6: lv_listOfAliases_5_0= ruleAliasList
                    {

                    						newCompositeNode(grammarAccess.getAliasAccess().getListOfAliasesAliasListParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_listOfAliases_5_0=ruleAliasList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasRule());
                    						}
                    						set(
                    							current,
                    							"listOfAliases",
                    							lv_listOfAliases_5_0,
                    							"ecs.Lang.AliasList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:624:4: ( (lv_singleAlias_6_0= ruleSingleAlias ) )
                    {
                    // InternalLang.g:624:4: ( (lv_singleAlias_6_0= ruleSingleAlias ) )
                    // InternalLang.g:625:5: (lv_singleAlias_6_0= ruleSingleAlias )
                    {
                    // InternalLang.g:625:5: (lv_singleAlias_6_0= ruleSingleAlias )
                    // InternalLang.g:626:6: lv_singleAlias_6_0= ruleSingleAlias
                    {

                    						newCompositeNode(grammarAccess.getAliasAccess().getSingleAliasSingleAliasParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_singleAlias_6_0=ruleSingleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasRule());
                    						}
                    						set(
                    							current,
                    							"singleAlias",
                    							lv_singleAlias_6_0,
                    							"ecs.Lang.SingleAlias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleSingleAlias"
    // InternalLang.g:648:1: entryRuleSingleAlias returns [EObject current=null] : iv_ruleSingleAlias= ruleSingleAlias EOF ;
    public final EObject entryRuleSingleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAlias = null;


        try {
            // InternalLang.g:648:52: (iv_ruleSingleAlias= ruleSingleAlias EOF )
            // InternalLang.g:649:2: iv_ruleSingleAlias= ruleSingleAlias EOF
            {
             newCompositeNode(grammarAccess.getSingleAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleAlias=ruleSingleAlias();

            state._fsp--;

             current =iv_ruleSingleAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleAlias"


    // $ANTLR start "ruleSingleAlias"
    // InternalLang.g:655:1: ruleSingleAlias returns [EObject current=null] : (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? ) ;
    public final EObject ruleSingleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeAlias_1_0=null;
        Token lv_size_2_0=null;


        	enterRule();

        try {
            // InternalLang.g:661:2: ( (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? ) )
            // InternalLang.g:662:2: (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? )
            {
            // InternalLang.g:662:2: (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? )
            // InternalLang.g:663:3: otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleAliasAccess().getEqualsSignKeyword_0());
            		
            // InternalLang.g:667:3: ( (lv_typeAlias_1_0= RULE_STRING ) )
            // InternalLang.g:668:4: (lv_typeAlias_1_0= RULE_STRING )
            {
            // InternalLang.g:668:4: (lv_typeAlias_1_0= RULE_STRING )
            // InternalLang.g:669:5: lv_typeAlias_1_0= RULE_STRING
            {
            lv_typeAlias_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_typeAlias_1_0, grammarAccess.getSingleAliasAccess().getTypeAliasSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"typeAlias",
            						lv_typeAlias_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLang.g:685:3: ( (lv_size_2_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLang.g:686:4: (lv_size_2_0= RULE_INT )
                    {
                    // InternalLang.g:686:4: (lv_size_2_0= RULE_INT )
                    // InternalLang.g:687:5: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_size_2_0, grammarAccess.getSingleAliasAccess().getSizeINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleAliasRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleAlias"


    // $ANTLR start "entryRuleAliasList"
    // InternalLang.g:707:1: entryRuleAliasList returns [EObject current=null] : iv_ruleAliasList= ruleAliasList EOF ;
    public final EObject entryRuleAliasList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasList = null;


        try {
            // InternalLang.g:707:50: (iv_ruleAliasList= ruleAliasList EOF )
            // InternalLang.g:708:2: iv_ruleAliasList= ruleAliasList EOF
            {
             newCompositeNode(grammarAccess.getAliasListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasList=ruleAliasList();

            state._fsp--;

             current =iv_ruleAliasList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasList"


    // $ANTLR start "ruleAliasList"
    // InternalLang.g:714:1: ruleAliasList returns [EObject current=null] : (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' ) ;
    public final EObject ruleAliasList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:720:2: ( (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' ) )
            // InternalLang.g:721:2: (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' )
            {
            // InternalLang.g:721:2: (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' )
            // InternalLang.g:722:3: otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalLang.g:726:3: ( (lv_rules_1_0= ruleAliasRule ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLang.g:727:4: (lv_rules_1_0= ruleAliasRule )
            	    {
            	    // InternalLang.g:727:4: (lv_rules_1_0= ruleAliasRule )
            	    // InternalLang.g:728:5: lv_rules_1_0= ruleAliasRule
            	    {

            	    					newCompositeNode(grammarAccess.getAliasListAccess().getRulesAliasRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_rules_1_0=ruleAliasRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAliasListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"ecs.Lang.AliasRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAliasListAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasList"


    // $ANTLR start "entryRuleAliasRule"
    // InternalLang.g:753:1: entryRuleAliasRule returns [EObject current=null] : iv_ruleAliasRule= ruleAliasRule EOF ;
    public final EObject entryRuleAliasRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasRule = null;


        try {
            // InternalLang.g:753:50: (iv_ruleAliasRule= ruleAliasRule EOF )
            // InternalLang.g:754:2: iv_ruleAliasRule= ruleAliasRule EOF
            {
             newCompositeNode(grammarAccess.getAliasRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasRule=ruleAliasRule();

            state._fsp--;

             current =iv_ruleAliasRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAliasRule"


    // $ANTLR start "ruleAliasRule"
    // InternalLang.g:760:1: ruleAliasRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? ) ;
    public final EObject ruleAliasRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_typeAlias_2_0=null;
        Token lv_size_3_0=null;
        Token lv_variableSize_4_0=null;


        	enterRule();

        try {
            // InternalLang.g:766:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? ) )
            // InternalLang.g:767:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? )
            {
            // InternalLang.g:767:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? )
            // InternalLang.g:768:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )?
            {
            // InternalLang.g:768:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:769:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:769:4: (otherlv_0= RULE_ID )
            // InternalLang.g:770:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getAliasRuleAccess().getPlatformPlatformIDCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAliasRuleAccess().getColonKeyword_1());
            		
            // InternalLang.g:785:3: ( (lv_typeAlias_2_0= RULE_STRING ) )
            // InternalLang.g:786:4: (lv_typeAlias_2_0= RULE_STRING )
            {
            // InternalLang.g:786:4: (lv_typeAlias_2_0= RULE_STRING )
            // InternalLang.g:787:5: lv_typeAlias_2_0= RULE_STRING
            {
            lv_typeAlias_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_typeAlias_2_0, grammarAccess.getAliasRuleAccess().getTypeAliasSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"typeAlias",
            						lv_typeAlias_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLang.g:803:3: ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLang.g:804:4: ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )?
                    {
                    // InternalLang.g:804:4: ( (lv_size_3_0= RULE_INT ) )
                    // InternalLang.g:805:5: (lv_size_3_0= RULE_INT )
                    {
                    // InternalLang.g:805:5: (lv_size_3_0= RULE_INT )
                    // InternalLang.g:806:6: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_size_3_0, grammarAccess.getAliasRuleAccess().getSizeINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAliasRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalLang.g:822:4: ( (lv_variableSize_4_0= '*' ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==24) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalLang.g:823:5: (lv_variableSize_4_0= '*' )
                            {
                            // InternalLang.g:823:5: (lv_variableSize_4_0= '*' )
                            // InternalLang.g:824:6: lv_variableSize_4_0= '*'
                            {
                            lv_variableSize_4_0=(Token)match(input,24,FOLLOW_2); 

                            						newLeafNode(lv_variableSize_4_0, grammarAccess.getAliasRuleAccess().getVariableSizeAsteriskKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAliasRuleRule());
                            						}
                            						setWithLastConsumed(current, "variableSize", true, "*");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasRule"


    // $ANTLR start "entryRuleComponent"
    // InternalLang.g:841:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalLang.g:841:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalLang.g:842:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalLang.g:848:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'comp' ( (lv_contextRef_1_0= ruleContextReference ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unique_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_index_6_0=null;
        Token lv_multiIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_prefix_13_0=null;
        EObject lv_contextRef_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalLang.g:854:2: ( (otherlv_0= 'comp' ( (lv_contextRef_1_0= ruleContextReference ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) ) ) )
            // InternalLang.g:855:2: (otherlv_0= 'comp' ( (lv_contextRef_1_0= ruleContextReference ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) ) )
            {
            // InternalLang.g:855:2: (otherlv_0= 'comp' ( (lv_contextRef_1_0= ruleContextReference ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) ) )
            // InternalLang.g:856:3: otherlv_0= 'comp' ( (lv_contextRef_1_0= ruleContextReference ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getCompKeyword_0());
            		
            // InternalLang.g:860:3: ( (lv_contextRef_1_0= ruleContextReference ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLang.g:861:4: (lv_contextRef_1_0= ruleContextReference )
                    {
                    // InternalLang.g:861:4: (lv_contextRef_1_0= ruleContextReference )
                    // InternalLang.g:862:5: lv_contextRef_1_0= ruleContextReference
                    {

                    					newCompositeNode(grammarAccess.getComponentAccess().getContextRefContextReferenceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_contextRef_1_0=ruleContextReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentRule());
                    					}
                    					set(
                    						current,
                    						"contextRef",
                    						lv_contextRef_1_0,
                    						"ecs.Lang.ContextReference");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:879:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLang.g:880:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalLang.g:880:4: (lv_unique_2_0= 'unique' )
                    // InternalLang.g:881:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,19,FOLLOW_11); 

                    					newLeafNode(lv_unique_2_0, grammarAccess.getComponentAccess().getUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:893:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalLang.g:894:4: (lv_name_3_0= ruleValidID )
            {
            // InternalLang.g:894:4: (lv_name_3_0= ruleValidID )
            // InternalLang.g:895:5: lv_name_3_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_3_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:912:3: ( ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) ) | (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EOF||LA31_0==18||LA31_0==21||LA31_0==23||LA31_0==28||LA31_0==57||LA31_0==59||LA31_0==62) ) {
                alt31=1;
            }
            else if ( (LA31_0==27) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalLang.g:913:4: ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) )
                    {
                    // InternalLang.g:913:4: ( (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )? | (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==EOF||LA30_0==18||LA30_0==23||LA30_0==28||LA30_0==57||LA30_0==59||LA30_0==62) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==21) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalLang.g:914:5: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )?
                            {
                            // InternalLang.g:914:5: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )? )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==23) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalLang.g:915:6: otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )?
                                    {
                                    otherlv_4=(Token)match(input,23,FOLLOW_14); 

                                    						newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_4_0_0_0());
                                    					
                                    // InternalLang.g:919:6: ( (otherlv_5= RULE_ID ) )
                                    // InternalLang.g:920:7: (otherlv_5= RULE_ID )
                                    {
                                    // InternalLang.g:920:7: (otherlv_5= RULE_ID )
                                    // InternalLang.g:921:8: otherlv_5= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getComponentRule());
                                    								}
                                    							
                                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

                                    								newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getValueTypeAliasCrossReference_4_0_0_1_0());
                                    							

                                    }


                                    }

                                    // InternalLang.g:932:6: ( ( (lv_index_6_0= 'asIndexKey' ) ) | ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) ) )?
                                    int alt26=3;
                                    int LA26_0 = input.LA(1);

                                    if ( (LA26_0==25) ) {
                                        alt26=1;
                                    }
                                    else if ( (LA26_0==26) ) {
                                        alt26=2;
                                    }
                                    switch (alt26) {
                                        case 1 :
                                            // InternalLang.g:933:7: ( (lv_index_6_0= 'asIndexKey' ) )
                                            {
                                            // InternalLang.g:933:7: ( (lv_index_6_0= 'asIndexKey' ) )
                                            // InternalLang.g:934:8: (lv_index_6_0= 'asIndexKey' )
                                            {
                                            // InternalLang.g:934:8: (lv_index_6_0= 'asIndexKey' )
                                            // InternalLang.g:935:9: lv_index_6_0= 'asIndexKey'
                                            {
                                            lv_index_6_0=(Token)match(input,25,FOLLOW_2); 

                                            									newLeafNode(lv_index_6_0, grammarAccess.getComponentAccess().getIndexAsIndexKeyKeyword_4_0_0_2_0_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getComponentRule());
                                            									}
                                            									setWithLastConsumed(current, "index", true, "asIndexKey");
                                            								

                                            }


                                            }


                                            }
                                            break;
                                        case 2 :
                                            // InternalLang.g:948:7: ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) )
                                            {
                                            // InternalLang.g:948:7: ( (lv_multiIndex_7_0= 'asMultiIndexKey' ) )
                                            // InternalLang.g:949:8: (lv_multiIndex_7_0= 'asMultiIndexKey' )
                                            {
                                            // InternalLang.g:949:8: (lv_multiIndex_7_0= 'asMultiIndexKey' )
                                            // InternalLang.g:950:9: lv_multiIndex_7_0= 'asMultiIndexKey'
                                            {
                                            lv_multiIndex_7_0=(Token)match(input,26,FOLLOW_2); 

                                            									newLeafNode(lv_multiIndex_7_0, grammarAccess.getComponentAccess().getMultiIndexAsMultiIndexKeyKeyword_4_0_0_2_1_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getComponentRule());
                                            									}
                                            									setWithLastConsumed(current, "multiIndex", true, "asMultiIndexKey");
                                            								

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLang.g:965:5: (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' )
                            {
                            // InternalLang.g:965:5: (otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}' )
                            // InternalLang.g:966:6: otherlv_8= '{' ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+ otherlv_11= '}'
                            {
                            otherlv_8=(Token)match(input,21,FOLLOW_11); 

                            						newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_0_1_0());
                            					
                            // InternalLang.g:970:6: ( ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )? )+
                            int cnt29=0;
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==RULE_ID||LA29_0==15||LA29_0==17||(LA29_0>=32 && LA29_0<=33)||LA29_0==36||(LA29_0>=45 && LA29_0<=48)||(LA29_0>=57 && LA29_0<=59)||LA29_0==62||LA29_0==64) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalLang.g:971:7: ( (lv_properties_9_0= ruleComponentProperty ) ) (otherlv_10= ',' )?
                            	    {
                            	    // InternalLang.g:971:7: ( (lv_properties_9_0= ruleComponentProperty ) )
                            	    // InternalLang.g:972:8: (lv_properties_9_0= ruleComponentProperty )
                            	    {
                            	    // InternalLang.g:972:8: (lv_properties_9_0= ruleComponentProperty )
                            	    // InternalLang.g:973:9: lv_properties_9_0= ruleComponentProperty
                            	    {

                            	    									newCompositeNode(grammarAccess.getComponentAccess().getPropertiesComponentPropertyParserRuleCall_4_0_1_1_0_0());
                            	    								
                            	    pushFollow(FOLLOW_28);
                            	    lv_properties_9_0=ruleComponentProperty();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getComponentRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"properties",
                            	    										lv_properties_9_0,
                            	    										"ecs.Lang.ComponentProperty");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }

                            	    // InternalLang.g:990:7: (otherlv_10= ',' )?
                            	    int alt28=2;
                            	    int LA28_0 = input.LA(1);

                            	    if ( (LA28_0==12) ) {
                            	        alt28=1;
                            	    }
                            	    switch (alt28) {
                            	        case 1 :
                            	            // InternalLang.g:991:8: otherlv_10= ','
                            	            {
                            	            otherlv_10=(Token)match(input,12,FOLLOW_29); 

                            	            								newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getCommaKeyword_4_0_1_1_1());
                            	            							

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt29 >= 1 ) break loop29;
                                        EarlyExitException eee =
                                            new EarlyExitException(29, input);
                                        throw eee;
                                }
                                cnt29++;
                            } while (true);

                            otherlv_11=(Token)match(input,22,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_0_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:1004:4: (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) )
                    {
                    // InternalLang.g:1004:4: (otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) ) )
                    // InternalLang.g:1005:5: otherlv_12= '/' ( (lv_prefix_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getSolidusKeyword_4_1_0());
                    				
                    // InternalLang.g:1009:5: ( (lv_prefix_13_0= RULE_STRING ) )
                    // InternalLang.g:1010:6: (lv_prefix_13_0= RULE_STRING )
                    {
                    // InternalLang.g:1010:6: (lv_prefix_13_0= RULE_STRING )
                    // InternalLang.g:1011:7: lv_prefix_13_0= RULE_STRING
                    {
                    lv_prefix_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_prefix_13_0, grammarAccess.getComponentAccess().getPrefixSTRINGTerminalRuleCall_4_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_13_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentProperty"
    // InternalLang.g:1033:1: entryRuleComponentProperty returns [EObject current=null] : iv_ruleComponentProperty= ruleComponentProperty EOF ;
    public final EObject entryRuleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentProperty = null;


        try {
            // InternalLang.g:1033:58: (iv_ruleComponentProperty= ruleComponentProperty EOF )
            // InternalLang.g:1034:2: iv_ruleComponentProperty= ruleComponentProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentProperty=ruleComponentProperty();

            state._fsp--;

             current =iv_ruleComponentProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentProperty"


    // $ANTLR start "ruleComponentProperty"
    // InternalLang.g:1040:1: ruleComponentProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleComponentProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1046:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalLang.g:1047:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalLang.g:1047:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalLang.g:1048:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalLang.g:1048:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:1049:4: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:1049:4: (lv_name_0_0= ruleValidID )
            // InternalLang.g:1050:5: lv_name_0_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getComponentPropertyAccess().getNameValidIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentPropertyAccess().getColonKeyword_1());
            		
            // InternalLang.g:1071:3: ( (otherlv_2= RULE_ID ) )
            // InternalLang.g:1072:4: (otherlv_2= RULE_ID )
            {
            // InternalLang.g:1072:4: (otherlv_2= RULE_ID )
            // InternalLang.g:1073:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentPropertyAccess().getTypeAliasCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentProperty"


    // $ANTLR start "entryRuleSystem"
    // InternalLang.g:1088:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalLang.g:1088:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalLang.g:1089:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalLang.g:1095:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'sys' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_init_4_0= 'init' ) )? ( (lv_cleanup_5_0= 'cleanup' ) )? ( (lv_teardown_6_0= 'teardown' ) )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '{' ( (lv_input_9_0= ruleInput ) )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_3_0=null;
        Token lv_init_4_0=null;
        Token lv_cleanup_5_0=null;
        Token lv_teardown_6_0=null;
        Token otherlv_8=null;
        Token otherlv_14=null;
        EObject lv_contextRef_2_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_input_9_0 = null;

        EObject lv_uniqueComp_10_0 = null;

        EObject lv_groups_11_0 = null;

        EObject lv_index_12_0 = null;

        EObject lv_createRules_13_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1101:2: ( (otherlv_0= 'sys' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_init_4_0= 'init' ) )? ( (lv_cleanup_5_0= 'cleanup' ) )? ( (lv_teardown_6_0= 'teardown' ) )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '{' ( (lv_input_9_0= ruleInput ) )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' ) )
            // InternalLang.g:1102:2: (otherlv_0= 'sys' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_init_4_0= 'init' ) )? ( (lv_cleanup_5_0= 'cleanup' ) )? ( (lv_teardown_6_0= 'teardown' ) )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '{' ( (lv_input_9_0= ruleInput ) )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' )
            {
            // InternalLang.g:1102:2: (otherlv_0= 'sys' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_init_4_0= 'init' ) )? ( (lv_cleanup_5_0= 'cleanup' ) )? ( (lv_teardown_6_0= 'teardown' ) )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '{' ( (lv_input_9_0= ruleInput ) )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' )
            // InternalLang.g:1103:3: otherlv_0= 'sys' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_init_4_0= 'init' ) )? ( (lv_cleanup_5_0= 'cleanup' ) )? ( (lv_teardown_6_0= 'teardown' ) )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '{' ( (lv_input_9_0= ruleInput ) )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSysKeyword_0());
            		
            // InternalLang.g:1107:3: ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLang.g:1108:4: ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )?
                    {
                    // InternalLang.g:1108:4: ( (lv_componentAlias_1_0= 'comp' ) )
                    // InternalLang.g:1109:5: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:1109:5: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:1110:6: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,18,FOLLOW_31); 

                    						newLeafNode(lv_componentAlias_1_0, grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(current, "componentAlias", true, "comp");
                    					

                    }


                    }

                    // InternalLang.g:1122:4: ( (lv_contextRef_2_0= ruleContextReference ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==13) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalLang.g:1123:5: (lv_contextRef_2_0= ruleContextReference )
                            {
                            // InternalLang.g:1123:5: (lv_contextRef_2_0= ruleContextReference )
                            // InternalLang.g:1124:6: lv_contextRef_2_0= ruleContextReference
                            {

                            						newCompositeNode(grammarAccess.getSystemAccess().getContextRefContextReferenceParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_32);
                            lv_contextRef_2_0=ruleContextReference();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSystemRule());
                            						}
                            						set(
                            							current,
                            							"contextRef",
                            							lv_contextRef_2_0,
                            							"ecs.Lang.ContextReference");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalLang.g:1141:4: ( (lv_unique_3_0= 'unique' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==19) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalLang.g:1142:5: (lv_unique_3_0= 'unique' )
                            {
                            // InternalLang.g:1142:5: (lv_unique_3_0= 'unique' )
                            // InternalLang.g:1143:6: lv_unique_3_0= 'unique'
                            {
                            lv_unique_3_0=(Token)match(input,19,FOLLOW_33); 

                            						newLeafNode(lv_unique_3_0, grammarAccess.getSystemAccess().getUniqueUniqueKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSystemRule());
                            						}
                            						setWithLastConsumed(current, "unique", true, "unique");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLang.g:1156:3: ( (lv_init_4_0= 'init' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalLang.g:1157:4: (lv_init_4_0= 'init' )
                    {
                    // InternalLang.g:1157:4: (lv_init_4_0= 'init' )
                    // InternalLang.g:1158:5: lv_init_4_0= 'init'
                    {
                    lv_init_4_0=(Token)match(input,29,FOLLOW_34); 

                    					newLeafNode(lv_init_4_0, grammarAccess.getSystemAccess().getInitInitKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "init", true, "init");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1170:3: ( (lv_cleanup_5_0= 'cleanup' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLang.g:1171:4: (lv_cleanup_5_0= 'cleanup' )
                    {
                    // InternalLang.g:1171:4: (lv_cleanup_5_0= 'cleanup' )
                    // InternalLang.g:1172:5: lv_cleanup_5_0= 'cleanup'
                    {
                    lv_cleanup_5_0=(Token)match(input,30,FOLLOW_35); 

                    					newLeafNode(lv_cleanup_5_0, grammarAccess.getSystemAccess().getCleanupCleanupKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "cleanup", true, "cleanup");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1184:3: ( (lv_teardown_6_0= 'teardown' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLang.g:1185:4: (lv_teardown_6_0= 'teardown' )
                    {
                    // InternalLang.g:1185:4: (lv_teardown_6_0= 'teardown' )
                    // InternalLang.g:1186:5: lv_teardown_6_0= 'teardown'
                    {
                    lv_teardown_6_0=(Token)match(input,31,FOLLOW_11); 

                    					newLeafNode(lv_teardown_6_0, grammarAccess.getSystemAccess().getTeardownTeardownKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "teardown", true, "teardown");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1198:3: ( (lv_name_7_0= ruleValidID ) )
            // InternalLang.g:1199:4: (lv_name_7_0= ruleValidID )
            {
            // InternalLang.g:1199:4: (lv_name_7_0= ruleValidID )
            // InternalLang.g:1200:5: lv_name_7_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameValidIDParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_7_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalLang.g:1221:3: ( (lv_input_9_0= ruleInput ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLang.g:1222:4: (lv_input_9_0= ruleInput )
                    {
                    // InternalLang.g:1222:4: (lv_input_9_0= ruleInput )
                    // InternalLang.g:1223:5: lv_input_9_0= ruleInput
                    {

                    					newCompositeNode(grammarAccess.getSystemAccess().getInputInputParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_input_9_0=ruleInput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSystemRule());
                    					}
                    					set(
                    						current,
                    						"input",
                    						lv_input_9_0,
                    						"ecs.Lang.Input");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1240:3: ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==19) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==23) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalLang.g:1241:4: (lv_uniqueComp_10_0= ruleUniqueComponentAccess )
            	    {
            	    // InternalLang.g:1241:4: (lv_uniqueComp_10_0= ruleUniqueComponentAccess )
            	    // InternalLang.g:1242:5: lv_uniqueComp_10_0= ruleUniqueComponentAccess
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getUniqueCompUniqueComponentAccessParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_uniqueComp_10_0=ruleUniqueComponentAccess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueComp",
            	    						lv_uniqueComp_10_0,
            	    						"ecs.Lang.UniqueComponentAccess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalLang.g:1259:3: ( (lv_groups_11_0= ruleGroup ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19||LA40_0==47) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLang.g:1260:4: (lv_groups_11_0= ruleGroup )
            	    {
            	    // InternalLang.g:1260:4: (lv_groups_11_0= ruleGroup )
            	    // InternalLang.g:1261:5: lv_groups_11_0= ruleGroup
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getGroupsGroupParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_groups_11_0=ruleGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_11_0,
            	    						"ecs.Lang.Group");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalLang.g:1278:3: ( (lv_index_12_0= ruleIndex ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLang.g:1279:4: (lv_index_12_0= ruleIndex )
            	    {
            	    // InternalLang.g:1279:4: (lv_index_12_0= ruleIndex )
            	    // InternalLang.g:1280:5: lv_index_12_0= ruleIndex
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getIndexIndexParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_index_12_0=ruleIndex();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"index",
            	    						lv_index_12_0,
            	    						"ecs.Lang.Index");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalLang.g:1297:3: ( (lv_createRules_13_0= ruleCreateRule ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==44) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalLang.g:1298:4: (lv_createRules_13_0= ruleCreateRule )
            	    {
            	    // InternalLang.g:1298:4: (lv_createRules_13_0= ruleCreateRule )
            	    // InternalLang.g:1299:5: lv_createRules_13_0= ruleCreateRule
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getCreateRulesCreateRuleParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_createRules_13_0=ruleCreateRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"createRules",
            	    						lv_createRules_13_0,
            	    						"ecs.Lang.CreateRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleInput"
    // InternalLang.g:1324:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalLang.g:1324:46: (iv_ruleInput= ruleInput EOF )
            // InternalLang.g:1325:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalLang.g:1331:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+ (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )? (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )? (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )? ( (lv_destroy_19_0= 'destroy' ) )? otherlv_20= '}' (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unqiue_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_destroy_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_triggers_5_0 = null;

        EObject lv_apiRules_17_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1337:2: ( (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+ (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )? (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )? (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )? ( (lv_destroy_19_0= 'destroy' ) )? otherlv_20= '}' (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )? ) )
            // InternalLang.g:1338:2: (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+ (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )? (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )? (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )? ( (lv_destroy_19_0= 'destroy' ) )? otherlv_20= '}' (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )? )
            {
            // InternalLang.g:1338:2: (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+ (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )? (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )? (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )? ( (lv_destroy_19_0= 'destroy' ) )? otherlv_20= '}' (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )? )
            // InternalLang.g:1339:3: otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+ (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )? (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )? (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )? ( (lv_destroy_19_0= 'destroy' ) )? otherlv_20= '}' (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalLang.g:1343:3: ( (lv_unqiue_1_0= 'unique' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLang.g:1344:4: (lv_unqiue_1_0= 'unique' )
                    {
                    // InternalLang.g:1344:4: (lv_unqiue_1_0= 'unique' )
                    // InternalLang.g:1345:5: lv_unqiue_1_0= 'unique'
                    {
                    lv_unqiue_1_0=(Token)match(input,19,FOLLOW_36); 

                    					newLeafNode(lv_unqiue_1_0, grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "unqiue", true, "unique");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTriggerKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getColonKeyword_4());
            		
            // InternalLang.g:1369:3: ( ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )? )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==39||(LA45_0>=42 && LA45_0<=43)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalLang.g:1370:4: ( (lv_triggers_5_0= ruleInputTrigger ) ) (otherlv_6= ',' )?
            	    {
            	    // InternalLang.g:1370:4: ( (lv_triggers_5_0= ruleInputTrigger ) )
            	    // InternalLang.g:1371:5: (lv_triggers_5_0= ruleInputTrigger )
            	    {
            	    // InternalLang.g:1371:5: (lv_triggers_5_0= ruleInputTrigger )
            	    // InternalLang.g:1372:6: lv_triggers_5_0= ruleInputTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getInputAccess().getTriggersInputTriggerParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_triggers_5_0=ruleInputTrigger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggers",
            	    							lv_triggers_5_0,
            	    							"ecs.Lang.InputTrigger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLang.g:1389:4: (otherlv_6= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==12) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalLang.g:1390:5: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,12,FOLLOW_45); 

            	            					newLeafNode(otherlv_6, grammarAccess.getInputAccess().getCommaKeyword_5_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // InternalLang.g:1396:3: (otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLang.g:1397:4: otherlv_7= 'ensure' otherlv_8= ':' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getEnsureKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getInputAccess().getColonKeyword_6_1());
                    			
                    // InternalLang.g:1405:4: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )? )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalLang.g:1406:5: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' )?
                    	    {
                    	    // InternalLang.g:1406:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalLang.g:1407:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalLang.g:1407:6: (otherlv_9= RULE_ID )
                    	    // InternalLang.g:1408:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_46); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getInputAccess().getEnsureComponentsAComponentCrossReference_6_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1419:5: (otherlv_10= ',' )?
                    	    int alt46=2;
                    	    int LA46_0 = input.LA(1);

                    	    if ( (LA46_0==12) ) {
                    	        alt46=1;
                    	    }
                    	    switch (alt46) {
                    	        case 1 :
                    	            // InternalLang.g:1420:6: otherlv_10= ','
                    	            {
                    	            otherlv_10=(Token)match(input,12,FOLLOW_47); 

                    	            						newLeafNode(otherlv_10, grammarAccess.getInputAccess().getCommaKeyword_6_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }

            // InternalLang.g:1427:3: (otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+ )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalLang.g:1428:4: otherlv_11= 'exclude' otherlv_12= ':' ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputAccess().getExcludeKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getInputAccess().getColonKeyword_7_1());
                    			
                    // InternalLang.g:1436:4: ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )? )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_ID) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalLang.g:1437:5: ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' )?
                    	    {
                    	    // InternalLang.g:1437:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalLang.g:1438:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalLang.g:1438:6: (otherlv_13= RULE_ID )
                    	    // InternalLang.g:1439:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_48); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getInputAccess().getExcludeComponentsAComponentCrossReference_7_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1450:5: (otherlv_14= ',' )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==12) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // InternalLang.g:1451:6: otherlv_14= ','
                    	            {
                    	            otherlv_14=(Token)match(input,12,FOLLOW_49); 

                    	            						newLeafNode(otherlv_14, grammarAccess.getInputAccess().getCommaKeyword_7_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    }
                    break;

            }

            // InternalLang.g:1458:3: (otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+ )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalLang.g:1459:4: otherlv_15= 'api' otherlv_16= ':' ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getInputAccess().getApiKeyword_8_0());
                    			
                    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getInputAccess().getColonKeyword_8_1());
                    			
                    // InternalLang.g:1467:4: ( ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )? )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalLang.g:1468:5: ( (lv_apiRules_17_0= ruleApiRule ) ) (otherlv_18= ',' )?
                    	    {
                    	    // InternalLang.g:1468:5: ( (lv_apiRules_17_0= ruleApiRule ) )
                    	    // InternalLang.g:1469:6: (lv_apiRules_17_0= ruleApiRule )
                    	    {
                    	    // InternalLang.g:1469:6: (lv_apiRules_17_0= ruleApiRule )
                    	    // InternalLang.g:1470:7: lv_apiRules_17_0= ruleApiRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputAccess().getApiRulesApiRuleParserRuleCall_8_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_apiRules_17_0=ruleApiRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"apiRules",
                    	    								lv_apiRules_17_0,
                    	    								"ecs.Lang.ApiRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1487:5: (otherlv_18= ',' )?
                    	    int alt52=2;
                    	    int LA52_0 = input.LA(1);

                    	    if ( (LA52_0==12) ) {
                    	        alt52=1;
                    	    }
                    	    switch (alt52) {
                    	        case 1 :
                    	            // InternalLang.g:1488:6: otherlv_18= ','
                    	            {
                    	            otherlv_18=(Token)match(input,12,FOLLOW_51); 

                    	            						newLeafNode(otherlv_18, grammarAccess.getInputAccess().getCommaKeyword_8_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    }
                    break;

            }

            // InternalLang.g:1495:3: ( (lv_destroy_19_0= 'destroy' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLang.g:1496:4: (lv_destroy_19_0= 'destroy' )
                    {
                    // InternalLang.g:1496:4: (lv_destroy_19_0= 'destroy' )
                    // InternalLang.g:1497:5: lv_destroy_19_0= 'destroy'
                    {
                    lv_destroy_19_0=(Token)match(input,37,FOLLOW_52); 

                    					newLeafNode(lv_destroy_19_0, grammarAccess.getInputAccess().getDestroyDestroyKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "destroy", true, "destroy");
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_20, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_10());
            		
            // InternalLang.g:1513:3: (otherlv_21= '@' ( (otherlv_22= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalLang.g:1514:4: otherlv_21= '@' ( (otherlv_22= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getInputAccess().getCommercialAtKeyword_11_0());
                    			
                    // InternalLang.g:1518:4: ( (otherlv_22= RULE_ID ) )
                    // InternalLang.g:1519:5: (otherlv_22= RULE_ID )
                    {
                    // InternalLang.g:1519:5: (otherlv_22= RULE_ID )
                    // InternalLang.g:1520:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_22, grammarAccess.getInputAccess().getContextRefContextNameCrossReference_11_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputTrigger"
    // InternalLang.g:1536:1: entryRuleInputTrigger returns [EObject current=null] : iv_ruleInputTrigger= ruleInputTrigger EOF ;
    public final EObject entryRuleInputTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTrigger = null;


        try {
            // InternalLang.g:1536:53: (iv_ruleInputTrigger= ruleInputTrigger EOF )
            // InternalLang.g:1537:2: iv_ruleInputTrigger= ruleInputTrigger EOF
            {
             newCompositeNode(grammarAccess.getInputTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputTrigger=ruleInputTrigger();

            state._fsp--;

             current =iv_ruleInputTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputTrigger"


    // $ANTLR start "ruleInputTrigger"
    // InternalLang.g:1543:1: ruleInputTrigger returns [EObject current=null] : ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' ) | (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' ) | (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' ) ) ;
    public final EObject ruleInputTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalLang.g:1549:2: ( ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' ) | (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' ) | (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' ) ) )
            // InternalLang.g:1550:2: ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' ) | (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' ) | (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' ) )
            {
            // InternalLang.g:1550:2: ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' ) | (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' ) | (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt63=1;
                }
                break;
            case 42:
                {
                alt63=2;
                }
                break;
            case 43:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalLang.g:1551:3: (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )
                    {
                    // InternalLang.g:1551:3: (otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )
                    // InternalLang.g:1552:4: otherlv_0= 'enteredGroup' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+ otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_54); 

                    				newLeafNode(otherlv_0, grammarAccess.getInputTriggerAccess().getEnteredGroupKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalLang.g:1560:4: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_ID) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalLang.g:1561:5: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
                    	    {
                    	    // InternalLang.g:1561:5: ( (otherlv_2= RULE_ID ) )
                    	    // InternalLang.g:1562:6: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalLang.g:1562:6: (otherlv_2= RULE_ID )
                    	    // InternalLang.g:1563:7: otherlv_2= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    							}
                    	    						
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    							newLeafNode(otherlv_2, grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentCrossReference_0_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1574:5: (otherlv_3= ',' )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==12) ) {
                    	        alt57=1;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // InternalLang.g:1575:6: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,12,FOLLOW_56); 

                    	            						newLeafNode(otherlv_3, grammarAccess.getInputTriggerAccess().getCommaKeyword_0_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:1587:3: (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' )
                    {
                    // InternalLang.g:1587:3: (otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')' )
                    // InternalLang.g:1588:4: otherlv_5= 'leftGroup' otherlv_6= '(' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+ otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputTriggerAccess().getLeftGroupKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalLang.g:1596:4: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )? )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalLang.g:1597:5: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' )?
                    	    {
                    	    // InternalLang.g:1597:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalLang.g:1598:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalLang.g:1598:6: (otherlv_7= RULE_ID )
                    	    // InternalLang.g:1599:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getInputTriggerAccess().getLeftAComponentCrossReference_1_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1610:5: (otherlv_8= ',' )?
                    	    int alt59=2;
                    	    int LA59_0 = input.LA(1);

                    	    if ( (LA59_0==12) ) {
                    	        alt59=1;
                    	    }
                    	    switch (alt59) {
                    	        case 1 :
                    	            // InternalLang.g:1611:6: otherlv_8= ','
                    	            {
                    	            otherlv_8=(Token)match(input,12,FOLLOW_56); 

                    	            						newLeafNode(otherlv_8, grammarAccess.getInputTriggerAccess().getCommaKeyword_1_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    otherlv_9=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:1623:3: (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' )
                    {
                    // InternalLang.g:1623:3: (otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')' )
                    // InternalLang.g:1624:4: otherlv_10= 'enteredOrLeftGroup' otherlv_11= '(' ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+ otherlv_14= ')'
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_54); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputTriggerAccess().getEnteredOrLeftGroupKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalLang.g:1632:4: ( ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )? )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ID) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalLang.g:1633:5: ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' )?
                    	    {
                    	    // InternalLang.g:1633:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalLang.g:1634:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalLang.g:1634:6: (otherlv_12= RULE_ID )
                    	    // InternalLang.g:1635:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentCrossReference_2_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1646:5: (otherlv_13= ',' )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( (LA61_0==12) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // InternalLang.g:1647:6: otherlv_13= ','
                    	            {
                    	            otherlv_13=(Token)match(input,12,FOLLOW_56); 

                    	            						newLeafNode(otherlv_13, grammarAccess.getInputTriggerAccess().getCommaKeyword_2_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    otherlv_14=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputTrigger"


    // $ANTLR start "entryRuleCreateRule"
    // InternalLang.g:1662:1: entryRuleCreateRule returns [EObject current=null] : iv_ruleCreateRule= ruleCreateRule EOF ;
    public final EObject entryRuleCreateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateRule = null;


        try {
            // InternalLang.g:1662:51: (iv_ruleCreateRule= ruleCreateRule EOF )
            // InternalLang.g:1663:2: iv_ruleCreateRule= ruleCreateRule EOF
            {
             newCompositeNode(grammarAccess.getCreateRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateRule=ruleCreateRule();

            state._fsp--;

             current =iv_ruleCreateRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCreateRule"


    // $ANTLR start "ruleCreateRule"
    // InternalLang.g:1669:1: ruleCreateRule returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+ (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleCreateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1675:2: ( (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+ (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalLang.g:1676:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+ (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalLang.g:1676:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+ (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalLang.g:1677:3: otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+ (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateRuleAccess().getCreateKeyword_0());
            		
            // InternalLang.g:1681:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLang.g:1682:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLang.g:1682:4: (lv_name_1_0= ruleValidID )
            // InternalLang.g:1683:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getCreateRuleAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateRuleAccess().getColonKeyword_2());
            		
            // InternalLang.g:1704:3: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )? )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalLang.g:1705:4: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' )?
            	    {
            	    // InternalLang.g:1705:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalLang.g:1706:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLang.g:1706:5: (otherlv_3= RULE_ID )
            	    // InternalLang.g:1707:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCreateRuleRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); 

            	    						newLeafNode(otherlv_3, grammarAccess.getCreateRuleAccess().getComponentTypesAComponentCrossReference_3_0_0());
            	    					

            	    }


            	    }

            	    // InternalLang.g:1718:4: (otherlv_4= ',' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==12) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalLang.g:1719:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,12,FOLLOW_58); 

            	            					newLeafNode(otherlv_4, grammarAccess.getCreateRuleAccess().getCommaKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            // InternalLang.g:1725:3: (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==38) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalLang.g:1726:4: otherlv_5= '@' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreateRuleAccess().getCommercialAtKeyword_4_0());
                    			
                    // InternalLang.g:1730:4: ( (otherlv_6= RULE_ID ) )
                    // InternalLang.g:1731:5: (otherlv_6= RULE_ID )
                    {
                    // InternalLang.g:1731:5: (otherlv_6= RULE_ID )
                    // InternalLang.g:1732:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCreateRuleRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getCreateRuleAccess().getContextRefContextNameCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateRule"


    // $ANTLR start "entryRuleIndex"
    // InternalLang.g:1748:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalLang.g:1748:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalLang.g:1749:2: iv_ruleIndex= ruleIndex EOF
            {
             newCompositeNode(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;

             current =iv_ruleIndex; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalLang.g:1755:1: ruleIndex returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'key' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )? otherlv_11= '}' (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )? ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_destroy_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_apiRules_8_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1761:2: ( (otherlv_0= 'index' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'key' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )? otherlv_11= '}' (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )? ) )
            // InternalLang.g:1762:2: (otherlv_0= 'index' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'key' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )? otherlv_11= '}' (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )? )
            {
            // InternalLang.g:1762:2: (otherlv_0= 'index' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'key' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )? otherlv_11= '}' (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )? )
            // InternalLang.g:1763:3: otherlv_0= 'index' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'key' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )? otherlv_11= '}' (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getIndexKeyword_0());
            		
            // InternalLang.g:1767:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLang.g:1768:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLang.g:1768:4: (lv_name_1_0= ruleValidID )
            // InternalLang.g:1769:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getIndexAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexAccess().getKeyKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexAccess().getColonKeyword_4());
            		
            // InternalLang.g:1798:3: ( (otherlv_5= RULE_ID ) )
            // InternalLang.g:1799:4: (otherlv_5= RULE_ID )
            {
            // InternalLang.g:1799:4: (otherlv_5= RULE_ID )
            // InternalLang.g:1800:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_5, grammarAccess.getIndexAccess().getComponentRefComponentCrossReference_5_0());
            				

            }


            }

            // InternalLang.g:1811:3: (otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==36) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalLang.g:1812:4: otherlv_6= 'api' otherlv_7= ':' ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+ ( (lv_destroy_10_0= 'destroy' ) )?
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexAccess().getApiKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexAccess().getColonKeyword_6_1());
                    			
                    // InternalLang.g:1820:4: ( ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )? )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_ID) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalLang.g:1821:5: ( (lv_apiRules_8_0= ruleApiRule ) ) (otherlv_9= ',' )?
                    	    {
                    	    // InternalLang.g:1821:5: ( (lv_apiRules_8_0= ruleApiRule ) )
                    	    // InternalLang.g:1822:6: (lv_apiRules_8_0= ruleApiRule )
                    	    {
                    	    // InternalLang.g:1822:6: (lv_apiRules_8_0= ruleApiRule )
                    	    // InternalLang.g:1823:7: lv_apiRules_8_0= ruleApiRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndexAccess().getApiRulesApiRuleParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_apiRules_8_0=ruleApiRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndexRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"apiRules",
                    	    								lv_apiRules_8_0,
                    	    								"ecs.Lang.ApiRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:1840:5: (otherlv_9= ',' )?
                    	    int alt67=2;
                    	    int LA67_0 = input.LA(1);

                    	    if ( (LA67_0==12) ) {
                    	        alt67=1;
                    	    }
                    	    switch (alt67) {
                    	        case 1 :
                    	            // InternalLang.g:1841:6: otherlv_9= ','
                    	            {
                    	            otherlv_9=(Token)match(input,12,FOLLOW_51); 

                    	            						newLeafNode(otherlv_9, grammarAccess.getIndexAccess().getCommaKeyword_6_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    // InternalLang.g:1847:4: ( (lv_destroy_10_0= 'destroy' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==37) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalLang.g:1848:5: (lv_destroy_10_0= 'destroy' )
                            {
                            // InternalLang.g:1848:5: (lv_destroy_10_0= 'destroy' )
                            // InternalLang.g:1849:6: lv_destroy_10_0= 'destroy'
                            {
                            lv_destroy_10_0=(Token)match(input,37,FOLLOW_52); 

                            						newLeafNode(lv_destroy_10_0, grammarAccess.getIndexAccess().getDestroyDestroyKeyword_6_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getIndexRule());
                            						}
                            						setWithLastConsumed(current, "destroy", true, "destroy");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_11, grammarAccess.getIndexAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalLang.g:1866:3: (otherlv_12= '@' ( (otherlv_13= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==38) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalLang.g:1867:4: otherlv_12= '@' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexAccess().getCommercialAtKeyword_8_0());
                    			
                    // InternalLang.g:1871:4: ( (otherlv_13= RULE_ID ) )
                    // InternalLang.g:1872:5: (otherlv_13= RULE_ID )
                    {
                    // InternalLang.g:1872:5: (otherlv_13= RULE_ID )
                    // InternalLang.g:1873:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_13, grammarAccess.getIndexAccess().getContextRefContextNameCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleUniqueComponentAccess"
    // InternalLang.g:1889:1: entryRuleUniqueComponentAccess returns [EObject current=null] : iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF ;
    public final EObject entryRuleUniqueComponentAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueComponentAccess = null;


        try {
            // InternalLang.g:1889:62: (iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF )
            // InternalLang.g:1890:2: iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF
            {
             newCompositeNode(grammarAccess.getUniqueComponentAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniqueComponentAccess=ruleUniqueComponentAccess();

            state._fsp--;

             current =iv_ruleUniqueComponentAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniqueComponentAccess"


    // $ANTLR start "ruleUniqueComponentAccess"
    // InternalLang.g:1896:1: ruleUniqueComponentAccess returns [EObject current=null] : (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleUniqueComponentAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_apiRule_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1902:2: ( (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalLang.g:1903:2: (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalLang.g:1903:2: (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalLang.g:1904:3: otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueComponentAccessAccess().getUniqueKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueComponentAccessAccess().getColonKeyword_1());
            		
            // InternalLang.g:1912:3: ( (lv_apiRule_2_0= ruleApiRule ) )
            // InternalLang.g:1913:4: (lv_apiRule_2_0= ruleApiRule )
            {
            // InternalLang.g:1913:4: (lv_apiRule_2_0= ruleApiRule )
            // InternalLang.g:1914:5: lv_apiRule_2_0= ruleApiRule
            {

            					newCompositeNode(grammarAccess.getUniqueComponentAccessAccess().getApiRuleApiRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_apiRule_2_0=ruleApiRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniqueComponentAccessRule());
            					}
            					set(
            						current,
            						"apiRule",
            						lv_apiRule_2_0,
            						"ecs.Lang.ApiRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:1931:3: (otherlv_3= '@' ( (otherlv_4= RULE_ID ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalLang.g:1932:4: otherlv_3= '@' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getUniqueComponentAccessAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalLang.g:1936:4: ( (otherlv_4= RULE_ID ) )
                    // InternalLang.g:1937:5: (otherlv_4= RULE_ID )
                    {
                    // InternalLang.g:1937:5: (otherlv_4= RULE_ID )
                    // InternalLang.g:1938:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUniqueComponentAccessRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getUniqueComponentAccessAccess().getContextRefContextNameCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniqueComponentAccess"


    // $ANTLR start "entryRuleGroup"
    // InternalLang.g:1954:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalLang.g:1954:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalLang.g:1955:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalLang.g:1961:1: ruleGroup returns [EObject current=null] : ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )? (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )? (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )? (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )? ( (lv_destroy_23_0= 'destroy' ) )? otherlv_24= '}' (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_group_0_0=null;
        Token lv_unique_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_destroy_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_apiRules_21_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1967:2: ( ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )? (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )? (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )? (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )? ( (lv_destroy_23_0= 'destroy' ) )? otherlv_24= '}' (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )? ) )
            // InternalLang.g:1968:2: ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )? (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )? (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )? (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )? ( (lv_destroy_23_0= 'destroy' ) )? otherlv_24= '}' (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )? )
            {
            // InternalLang.g:1968:2: ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )? (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )? (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )? (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )? ( (lv_destroy_23_0= 'destroy' ) )? otherlv_24= '}' (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )? )
            // InternalLang.g:1969:3: ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )? (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )? (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )? (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )? ( (lv_destroy_23_0= 'destroy' ) )? otherlv_24= '}' (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )?
            {
            // InternalLang.g:1969:3: ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==47) ) {
                alt73=1;
            }
            else if ( (LA73_0==19) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalLang.g:1970:4: ( (lv_group_0_0= 'group' ) )
                    {
                    // InternalLang.g:1970:4: ( (lv_group_0_0= 'group' ) )
                    // InternalLang.g:1971:5: (lv_group_0_0= 'group' )
                    {
                    // InternalLang.g:1971:5: (lv_group_0_0= 'group' )
                    // InternalLang.g:1972:6: lv_group_0_0= 'group'
                    {
                    lv_group_0_0=(Token)match(input,47,FOLLOW_11); 

                    						newLeafNode(lv_group_0_0, grammarAccess.getGroupAccess().getGroupGroupKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    						setWithLastConsumed(current, "group", true, "group");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:1985:4: ( (lv_unique_1_0= 'unique' ) )
                    {
                    // InternalLang.g:1985:4: ( (lv_unique_1_0= 'unique' ) )
                    // InternalLang.g:1986:5: (lv_unique_1_0= 'unique' )
                    {
                    // InternalLang.g:1986:5: (lv_unique_1_0= 'unique' )
                    // InternalLang.g:1987:6: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,19,FOLLOW_11); 

                    						newLeafNode(lv_unique_1_0, grammarAccess.getGroupAccess().getUniqueUniqueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    						setWithLastConsumed(current, "unique", true, "unique");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLang.g:2000:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:2001:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:2001:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:2002:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getMatcherKeyword_3());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_62); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getColonKeyword_4());
            		
            // InternalLang.g:2031:3: (otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==49) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalLang.g:2032:4: otherlv_6= 'allOf' otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+ otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getAllOfKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLang.g:2040:4: ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )? )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==RULE_ID) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalLang.g:2041:5: ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' )?
                    	    {
                    	    // InternalLang.g:2041:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalLang.g:2042:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalLang.g:2042:6: (otherlv_8= RULE_ID )
                    	    // InternalLang.g:2043:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGroupRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_55); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getAllOfComponentsAComponentCrossReference_5_2_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:2054:5: (otherlv_9= ',' )?
                    	    int alt74=2;
                    	    int LA74_0 = input.LA(1);

                    	    if ( (LA74_0==12) ) {
                    	        alt74=1;
                    	    }
                    	    switch (alt74) {
                    	        case 1 :
                    	            // InternalLang.g:2055:6: otherlv_9= ','
                    	            {
                    	            otherlv_9=(Token)match(input,12,FOLLOW_56); 

                    	            						newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getCommaKeyword_5_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    otherlv_10=(Token)match(input,41,FOLLOW_63); 

                    				newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:2066:3: (otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==50) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalLang.g:2067:4: otherlv_11= 'anyOf' otherlv_12= '(' ( (otherlv_13= RULE_ID ) )+ otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_54); 

                    				newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getAnyOfKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalLang.g:2075:4: ( (otherlv_13= RULE_ID ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_ID) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalLang.g:2076:5: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalLang.g:2076:5: (otherlv_13= RULE_ID )
                    	    // InternalLang.g:2077:6: otherlv_13= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGroupRule());
                    	    						}
                    	    					
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_56); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getAnyOfComponentsAComponentCrossReference_6_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    otherlv_14=(Token)match(input,41,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getRightParenthesisKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:2093:3: (otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==51) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalLang.g:2094:4: otherlv_15= 'noneOf' otherlv_16= '(' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_54); 

                    				newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getNoneOfKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalLang.g:2102:4: ( (otherlv_17= RULE_ID ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ID) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalLang.g:2103:5: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalLang.g:2103:5: (otherlv_17= RULE_ID )
                    	    // InternalLang.g:2104:6: otherlv_17= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGroupRule());
                    	    						}
                    	    					
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_56); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getNoneOfComponentsAComponentCrossReference_7_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);

                    otherlv_18=(Token)match(input,41,FOLLOW_65); 

                    				newLeafNode(otherlv_18, grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:2120:3: (otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+ )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==36) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalLang.g:2121:4: otherlv_19= 'api' otherlv_20= ':' ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+
                    {
                    otherlv_19=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getGroupAccess().getApiKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getGroupAccess().getColonKeyword_8_1());
                    			
                    // InternalLang.g:2129:4: ( ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )? )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==RULE_ID) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalLang.g:2130:5: ( (lv_apiRules_21_0= ruleApiRule ) ) (otherlv_22= ',' )?
                    	    {
                    	    // InternalLang.g:2130:5: ( (lv_apiRules_21_0= ruleApiRule ) )
                    	    // InternalLang.g:2131:6: (lv_apiRules_21_0= ruleApiRule )
                    	    {
                    	    // InternalLang.g:2131:6: (lv_apiRules_21_0= ruleApiRule )
                    	    // InternalLang.g:2132:7: lv_apiRules_21_0= ruleApiRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getApiRulesApiRuleParserRuleCall_8_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_apiRules_21_0=ruleApiRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"apiRules",
                    	    								lv_apiRules_21_0,
                    	    								"ecs.Lang.ApiRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:2149:5: (otherlv_22= ',' )?
                    	    int alt81=2;
                    	    int LA81_0 = input.LA(1);

                    	    if ( (LA81_0==12) ) {
                    	        alt81=1;
                    	    }
                    	    switch (alt81) {
                    	        case 1 :
                    	            // InternalLang.g:2150:6: otherlv_22= ','
                    	            {
                    	            otherlv_22=(Token)match(input,12,FOLLOW_51); 

                    	            						newLeafNode(otherlv_22, grammarAccess.getGroupAccess().getCommaKeyword_8_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt82 >= 1 ) break loop82;
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);


                    }
                    break;

            }

            // InternalLang.g:2157:3: ( (lv_destroy_23_0= 'destroy' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==37) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalLang.g:2158:4: (lv_destroy_23_0= 'destroy' )
                    {
                    // InternalLang.g:2158:4: (lv_destroy_23_0= 'destroy' )
                    // InternalLang.g:2159:5: lv_destroy_23_0= 'destroy'
                    {
                    lv_destroy_23_0=(Token)match(input,37,FOLLOW_52); 

                    					newLeafNode(lv_destroy_23_0, grammarAccess.getGroupAccess().getDestroyDestroyKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGroupRule());
                    					}
                    					setWithLastConsumed(current, "destroy", true, "destroy");
                    				

                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_24, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10());
            		
            // InternalLang.g:2175:3: (otherlv_25= '@' ( (otherlv_26= RULE_ID ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==38) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalLang.g:2176:4: otherlv_25= '@' ( (otherlv_26= RULE_ID ) )
                    {
                    otherlv_25=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getGroupAccess().getCommercialAtKeyword_11_0());
                    			
                    // InternalLang.g:2180:4: ( (otherlv_26= RULE_ID ) )
                    // InternalLang.g:2181:5: (otherlv_26= RULE_ID )
                    {
                    // InternalLang.g:2181:5: (otherlv_26= RULE_ID )
                    // InternalLang.g:2182:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_26, grammarAccess.getGroupAccess().getContextRefContextNameCrossReference_11_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleApiRule"
    // InternalLang.g:2198:1: entryRuleApiRule returns [EObject current=null] : iv_ruleApiRule= ruleApiRule EOF ;
    public final EObject entryRuleApiRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiRule = null;


        try {
            // InternalLang.g:2198:48: (iv_ruleApiRule= ruleApiRule EOF )
            // InternalLang.g:2199:2: iv_ruleApiRule= ruleApiRule EOF
            {
             newCompositeNode(grammarAccess.getApiRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApiRule=ruleApiRule();

            state._fsp--;

             current =iv_ruleApiRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApiRule"


    // $ANTLR start "ruleApiRule"
    // InternalLang.g:2205:1: ruleApiRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )? ) ;
    public final EObject ruleApiRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_accesors_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2211:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )? ) )
            // InternalLang.g:2212:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )? )
            {
            // InternalLang.g:2212:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )? )
            // InternalLang.g:2213:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )?
            {
            // InternalLang.g:2213:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:2214:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:2214:4: (otherlv_0= RULE_ID )
            // InternalLang.g:2215:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApiRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(otherlv_0, grammarAccess.getApiRuleAccess().getComponentAComponentCrossReference_0_0());
            				

            }


            }

            // InternalLang.g:2226:3: (otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==40) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalLang.g:2227:4: otherlv_1= '(' ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_67); 

                    				newLeafNode(otherlv_1, grammarAccess.getApiRuleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalLang.g:2231:4: ( ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )? )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=52 && LA87_0<=56)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalLang.g:2232:5: ( (lv_accesors_2_0= ruleComponentApiAccessor ) ) (otherlv_3= ',' )?
                    	    {
                    	    // InternalLang.g:2232:5: ( (lv_accesors_2_0= ruleComponentApiAccessor ) )
                    	    // InternalLang.g:2233:6: (lv_accesors_2_0= ruleComponentApiAccessor )
                    	    {
                    	    // InternalLang.g:2233:6: (lv_accesors_2_0= ruleComponentApiAccessor )
                    	    // InternalLang.g:2234:7: lv_accesors_2_0= ruleComponentApiAccessor
                    	    {

                    	    							newCompositeNode(grammarAccess.getApiRuleAccess().getAccesorsComponentApiAccessorParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
                    	    lv_accesors_2_0=ruleComponentApiAccessor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApiRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"accesors",
                    	    								lv_accesors_2_0,
                    	    								"ecs.Lang.ComponentApiAccessor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalLang.g:2251:5: (otherlv_3= ',' )?
                    	    int alt86=2;
                    	    int LA86_0 = input.LA(1);

                    	    if ( (LA86_0==12) ) {
                    	        alt86=1;
                    	    }
                    	    switch (alt86) {
                    	        case 1 :
                    	            // InternalLang.g:2252:6: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,12,FOLLOW_69); 

                    	            						newLeafNode(otherlv_3, grammarAccess.getApiRuleAccess().getCommaKeyword_1_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt87 >= 1 ) break loop87;
                                EarlyExitException eee =
                                    new EarlyExitException(87, input);
                                throw eee;
                        }
                        cnt87++;
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getApiRuleAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApiRule"


    // $ANTLR start "entryRuleComponentApiAccessor"
    // InternalLang.g:2267:1: entryRuleComponentApiAccessor returns [String current=null] : iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF ;
    public final String entryRuleComponentApiAccessor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentApiAccessor = null;


        try {
            // InternalLang.g:2267:60: (iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF )
            // InternalLang.g:2268:2: iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF
            {
             newCompositeNode(grammarAccess.getComponentApiAccessorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentApiAccessor=ruleComponentApiAccessor();

            state._fsp--;

             current =iv_ruleComponentApiAccessor.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentApiAccessor"


    // $ANTLR start "ruleComponentApiAccessor"
    // InternalLang.g:2274:1: ruleComponentApiAccessor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' ) ;
    public final AntlrDatatypeRuleToken ruleComponentApiAccessor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:2280:2: ( (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' ) )
            // InternalLang.g:2281:2: (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' )
            {
            // InternalLang.g:2281:2: (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt89=1;
                }
                break;
            case 53:
                {
                alt89=2;
                }
                break;
            case 54:
                {
                alt89=3;
                }
                break;
            case 55:
                {
                alt89=4;
                }
                break;
            case 56:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalLang.g:2282:3: kw= 'add'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getAddKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLang.g:2288:3: kw= 'get'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getGetKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLang.g:2294:3: kw= 'has'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getHasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLang.g:2300:3: kw= 'replace'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getReplaceKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLang.g:2306:3: kw= 'remove'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getRemoveKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentApiAccessor"


    // $ANTLR start "entryRuleChain"
    // InternalLang.g:2315:1: entryRuleChain returns [EObject current=null] : iv_ruleChain= ruleChain EOF ;
    public final EObject entryRuleChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain = null;


        try {
            // InternalLang.g:2315:46: (iv_ruleChain= ruleChain EOF )
            // InternalLang.g:2316:2: iv_ruleChain= ruleChain EOF
            {
             newCompositeNode(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChain=ruleChain();

            state._fsp--;

             current =iv_ruleChain; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // InternalLang.g:2322:1: ruleChain returns [EObject current=null] : (otherlv_0= 'chain' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )? ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+ otherlv_13= '}' ) ;
    public final EObject ruleChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_3_0=null;
        Token otherlv_5=null;
        Token lv_precondition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_contextRef_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_uniqueComp_8_0 = null;

        EObject lv_groups_9_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2328:2: ( (otherlv_0= 'chain' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )? ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+ otherlv_13= '}' ) )
            // InternalLang.g:2329:2: (otherlv_0= 'chain' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )? ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+ otherlv_13= '}' )
            {
            // InternalLang.g:2329:2: (otherlv_0= 'chain' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )? ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+ otherlv_13= '}' )
            // InternalLang.g:2330:3: otherlv_0= 'chain' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )? ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+ otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getChainAccess().getChainKeyword_0());
            		
            // InternalLang.g:2334:3: ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==18) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalLang.g:2335:4: ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )?
                    {
                    // InternalLang.g:2335:4: ( (lv_componentAlias_1_0= 'comp' ) )
                    // InternalLang.g:2336:5: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:2336:5: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:2337:6: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,18,FOLLOW_18); 

                    						newLeafNode(lv_componentAlias_1_0, grammarAccess.getChainAccess().getComponentAliasCompKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChainRule());
                    						}
                    						setWithLastConsumed(current, "componentAlias", true, "comp");
                    					

                    }


                    }

                    // InternalLang.g:2349:4: ( (lv_contextRef_2_0= ruleContextReference ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==13) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalLang.g:2350:5: (lv_contextRef_2_0= ruleContextReference )
                            {
                            // InternalLang.g:2350:5: (lv_contextRef_2_0= ruleContextReference )
                            // InternalLang.g:2351:6: lv_contextRef_2_0= ruleContextReference
                            {

                            						newCompositeNode(grammarAccess.getChainAccess().getContextRefContextReferenceParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_contextRef_2_0=ruleContextReference();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getChainRule());
                            						}
                            						set(
                            							current,
                            							"contextRef",
                            							lv_contextRef_2_0,
                            							"ecs.Lang.ContextReference");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalLang.g:2368:4: ( (lv_unique_3_0= 'unique' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==19) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalLang.g:2369:5: (lv_unique_3_0= 'unique' )
                            {
                            // InternalLang.g:2369:5: (lv_unique_3_0= 'unique' )
                            // InternalLang.g:2370:6: lv_unique_3_0= 'unique'
                            {
                            lv_unique_3_0=(Token)match(input,19,FOLLOW_11); 

                            						newLeafNode(lv_unique_3_0, grammarAccess.getChainAccess().getUniqueUniqueKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getChainRule());
                            						}
                            						setWithLastConsumed(current, "unique", true, "unique");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLang.g:2383:3: ( (lv_name_4_0= ruleValidID ) )
            // InternalLang.g:2384:4: (lv_name_4_0= ruleValidID )
            {
            // InternalLang.g:2384:4: (lv_name_4_0= ruleValidID )
            // InternalLang.g:2385:5: lv_name_4_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getChainAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_4_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChainRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_70); 

            			newLeafNode(otherlv_5, grammarAccess.getChainAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLang.g:2406:3: ( ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==58) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalLang.g:2407:4: ( (lv_precondition_6_0= 'precondition' ) ) (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )?
                    {
                    // InternalLang.g:2407:4: ( (lv_precondition_6_0= 'precondition' ) )
                    // InternalLang.g:2408:5: (lv_precondition_6_0= 'precondition' )
                    {
                    // InternalLang.g:2408:5: (lv_precondition_6_0= 'precondition' )
                    // InternalLang.g:2409:6: lv_precondition_6_0= 'precondition'
                    {
                    lv_precondition_6_0=(Token)match(input,58,FOLLOW_71); 

                    						newLeafNode(lv_precondition_6_0, grammarAccess.getChainAccess().getPreconditionPreconditionKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChainRule());
                    						}
                    						setWithLastConsumed(current, "precondition", true, "precondition");
                    					

                    }


                    }

                    // InternalLang.g:2421:4: (otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==21) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalLang.g:2422:5: otherlv_7= '{' ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )* ( (lv_groups_9_0= ruleGroup ) )* otherlv_10= '}'
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_72); 

                            					newLeafNode(otherlv_7, grammarAccess.getChainAccess().getLeftCurlyBracketKeyword_4_1_0());
                            				
                            // InternalLang.g:2426:5: ( (lv_uniqueComp_8_0= ruleUniqueComponentAccess ) )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==19) ) {
                                    int LA93_2 = input.LA(2);

                                    if ( (LA93_2==23) ) {
                                        alt93=1;
                                    }


                                }


                                switch (alt93) {
                            	case 1 :
                            	    // InternalLang.g:2427:6: (lv_uniqueComp_8_0= ruleUniqueComponentAccess )
                            	    {
                            	    // InternalLang.g:2427:6: (lv_uniqueComp_8_0= ruleUniqueComponentAccess )
                            	    // InternalLang.g:2428:7: lv_uniqueComp_8_0= ruleUniqueComponentAccess
                            	    {

                            	    							newCompositeNode(grammarAccess.getChainAccess().getUniqueCompUniqueComponentAccessParserRuleCall_4_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_72);
                            	    lv_uniqueComp_8_0=ruleUniqueComponentAccess();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getChainRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"uniqueComp",
                            	    								lv_uniqueComp_8_0,
                            	    								"ecs.Lang.UniqueComponentAccess");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);

                            // InternalLang.g:2445:5: ( (lv_groups_9_0= ruleGroup ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==19||LA94_0==47) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // InternalLang.g:2446:6: (lv_groups_9_0= ruleGroup )
                            	    {
                            	    // InternalLang.g:2446:6: (lv_groups_9_0= ruleGroup )
                            	    // InternalLang.g:2447:7: lv_groups_9_0= ruleGroup
                            	    {

                            	    							newCompositeNode(grammarAccess.getChainAccess().getGroupsGroupParserRuleCall_4_1_2_0());
                            	    						
                            	    pushFollow(FOLLOW_72);
                            	    lv_groups_9_0=ruleGroup();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getChainRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"groups",
                            	    								lv_groups_9_0,
                            	    								"ecs.Lang.Group");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,22,FOLLOW_14); 

                            					newLeafNode(otherlv_10, grammarAccess.getChainAccess().getRightCurlyBracketKeyword_4_1_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLang.g:2470:3: ( ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_ID) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalLang.g:2471:4: ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    // InternalLang.g:2471:4: ( (otherlv_11= RULE_ID ) )
            	    // InternalLang.g:2472:5: (otherlv_11= RULE_ID )
            	    {
            	    // InternalLang.g:2472:5: (otherlv_11= RULE_ID )
            	    // InternalLang.g:2473:6: otherlv_11= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChainRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_73); 

            	    						newLeafNode(otherlv_11, grammarAccess.getChainAccess().getChildrenASystemCrossReference_5_0_0());
            	    					

            	    }


            	    }

            	    // InternalLang.g:2484:4: (otherlv_12= ',' )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==12) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalLang.g:2485:5: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,12,FOLLOW_23); 

            	            					newLeafNode(otherlv_12, grammarAccess.getChainAccess().getCommaKeyword_5_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getChainAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleProcedure"
    // InternalLang.g:2499:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalLang.g:2499:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalLang.g:2500:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalLang.g:2506:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'proc' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )? ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_contextRef_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_uniqueComp_10_0 = null;

        EObject lv_groups_11_0 = null;

        EObject lv_index_12_0 = null;

        EObject lv_createRules_13_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2512:2: ( (otherlv_0= 'proc' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )? ) )
            // InternalLang.g:2513:2: (otherlv_0= 'proc' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )? )
            {
            // InternalLang.g:2513:2: (otherlv_0= 'proc' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )? )
            // InternalLang.g:2514:3: otherlv_0= 'proc' ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )? ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )* ( (lv_groups_11_0= ruleGroup ) )* ( (lv_index_12_0= ruleIndex ) )* ( (lv_createRules_13_0= ruleCreateRule ) )* otherlv_14= '}' (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcKeyword_0());
            		
            // InternalLang.g:2518:3: ( ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )? )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==18) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalLang.g:2519:4: ( (lv_componentAlias_1_0= 'comp' ) ) ( (lv_contextRef_2_0= ruleContextReference ) )? ( (lv_unique_3_0= 'unique' ) )?
                    {
                    // InternalLang.g:2519:4: ( (lv_componentAlias_1_0= 'comp' ) )
                    // InternalLang.g:2520:5: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:2520:5: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:2521:6: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,18,FOLLOW_18); 

                    						newLeafNode(lv_componentAlias_1_0, grammarAccess.getProcedureAccess().getComponentAliasCompKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureRule());
                    						}
                    						setWithLastConsumed(current, "componentAlias", true, "comp");
                    					

                    }


                    }

                    // InternalLang.g:2533:4: ( (lv_contextRef_2_0= ruleContextReference ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==13) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalLang.g:2534:5: (lv_contextRef_2_0= ruleContextReference )
                            {
                            // InternalLang.g:2534:5: (lv_contextRef_2_0= ruleContextReference )
                            // InternalLang.g:2535:6: lv_contextRef_2_0= ruleContextReference
                            {

                            						newCompositeNode(grammarAccess.getProcedureAccess().getContextRefContextReferenceParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_contextRef_2_0=ruleContextReference();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getProcedureRule());
                            						}
                            						set(
                            							current,
                            							"contextRef",
                            							lv_contextRef_2_0,
                            							"ecs.Lang.ContextReference");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalLang.g:2552:4: ( (lv_unique_3_0= 'unique' ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==19) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalLang.g:2553:5: (lv_unique_3_0= 'unique' )
                            {
                            // InternalLang.g:2553:5: (lv_unique_3_0= 'unique' )
                            // InternalLang.g:2554:6: lv_unique_3_0= 'unique'
                            {
                            lv_unique_3_0=(Token)match(input,19,FOLLOW_11); 

                            						newLeafNode(lv_unique_3_0, grammarAccess.getProcedureAccess().getUniqueUniqueKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getProcedureRule());
                            						}
                            						setWithLastConsumed(current, "unique", true, "unique");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLang.g:2567:3: ( (lv_name_4_0= ruleValidID ) )
            // InternalLang.g:2568:4: (lv_name_4_0= ruleValidID )
            {
            // InternalLang.g:2568:4: (lv_name_4_0= ruleValidID )
            // InternalLang.g:2569:5: lv_name_4_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_4_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_74); 

            			newLeafNode(otherlv_5, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLang.g:2590:3: (otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==60) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalLang.g:2591:4: otherlv_6= 'params' otherlv_7= '{' ( (lv_params_8_0= ruleParameter ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getParamsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalLang.g:2599:4: ( (lv_params_8_0= ruleParameter ) )+
                    int cnt102=0;
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==RULE_ID||LA102_0==15||LA102_0==17||(LA102_0>=32 && LA102_0<=33)||LA102_0==36||(LA102_0>=45 && LA102_0<=48)||(LA102_0>=57 && LA102_0<=59)||LA102_0==62||LA102_0==64) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalLang.g:2600:5: (lv_params_8_0= ruleParameter )
                    	    {
                    	    // InternalLang.g:2600:5: (lv_params_8_0= ruleParameter )
                    	    // InternalLang.g:2601:6: lv_params_8_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getProcedureAccess().getParamsParameterParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_params_8_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProcedureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_8_0,
                    	    							"ecs.Lang.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt102 >= 1 ) break loop102;
                                EarlyExitException eee =
                                    new EarlyExitException(102, input);
                                throw eee;
                        }
                        cnt102++;
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_38); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:2623:3: ( (lv_uniqueComp_10_0= ruleUniqueComponentAccess ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==19) ) {
                    int LA104_2 = input.LA(2);

                    if ( (LA104_2==23) ) {
                        alt104=1;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // InternalLang.g:2624:4: (lv_uniqueComp_10_0= ruleUniqueComponentAccess )
            	    {
            	    // InternalLang.g:2624:4: (lv_uniqueComp_10_0= ruleUniqueComponentAccess )
            	    // InternalLang.g:2625:5: lv_uniqueComp_10_0= ruleUniqueComponentAccess
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getUniqueCompUniqueComponentAccessParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_uniqueComp_10_0=ruleUniqueComponentAccess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueComp",
            	    						lv_uniqueComp_10_0,
            	    						"ecs.Lang.UniqueComponentAccess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // InternalLang.g:2642:3: ( (lv_groups_11_0= ruleGroup ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==19||LA105_0==47) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalLang.g:2643:4: (lv_groups_11_0= ruleGroup )
            	    {
            	    // InternalLang.g:2643:4: (lv_groups_11_0= ruleGroup )
            	    // InternalLang.g:2644:5: lv_groups_11_0= ruleGroup
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getGroupsGroupParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_groups_11_0=ruleGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_11_0,
            	    						"ecs.Lang.Group");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // InternalLang.g:2661:3: ( (lv_index_12_0= ruleIndex ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==45) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalLang.g:2662:4: (lv_index_12_0= ruleIndex )
            	    {
            	    // InternalLang.g:2662:4: (lv_index_12_0= ruleIndex )
            	    // InternalLang.g:2663:5: lv_index_12_0= ruleIndex
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getIndexIndexParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_index_12_0=ruleIndex();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"index",
            	    						lv_index_12_0,
            	    						"ecs.Lang.Index");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // InternalLang.g:2680:3: ( (lv_createRules_13_0= ruleCreateRule ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==44) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalLang.g:2681:4: (lv_createRules_13_0= ruleCreateRule )
            	    {
            	    // InternalLang.g:2681:4: (lv_createRules_13_0= ruleCreateRule )
            	    // InternalLang.g:2682:5: lv_createRules_13_0= ruleCreateRule
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getCreateRulesCreateRuleParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_createRules_13_0=ruleCreateRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"createRules",
            	    						lv_createRules_13_0,
            	    						"ecs.Lang.CreateRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_75); 

            			newLeafNode(otherlv_14, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalLang.g:2703:3: (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==61) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalLang.g:2704:4: otherlv_15= '->' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcedureAccess().getHyphenMinusGreaterThanSignKeyword_10_0());
                    			
                    // InternalLang.g:2708:4: ( (otherlv_16= RULE_ID ) )
                    // InternalLang.g:2709:5: (otherlv_16= RULE_ID )
                    {
                    // InternalLang.g:2709:5: (otherlv_16= RULE_ID )
                    // InternalLang.g:2710:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_16, grammarAccess.getProcedureAccess().getTypeAliasCrossReference_10_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleObserver"
    // InternalLang.g:2726:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalLang.g:2726:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalLang.g:2727:2: iv_ruleObserver= ruleObserver EOF
            {
             newCompositeNode(grammarAccess.getObserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;

             current =iv_ruleObserver; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalLang.g:2733:1: ruleObserver returns [EObject current=null] : (otherlv_0= 'observer' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_observedGroup_3_0= ruleGroup ) ) ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )* ( (lv_groups_5_0= ruleGroup ) )* ( (lv_createRules_6_0= ruleCreateRule ) )* otherlv_7= '}' ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_observedGroup_3_0 = null;

        EObject lv_uniqueComp_4_0 = null;

        EObject lv_groups_5_0 = null;

        EObject lv_createRules_6_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2739:2: ( (otherlv_0= 'observer' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_observedGroup_3_0= ruleGroup ) ) ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )* ( (lv_groups_5_0= ruleGroup ) )* ( (lv_createRules_6_0= ruleCreateRule ) )* otherlv_7= '}' ) )
            // InternalLang.g:2740:2: (otherlv_0= 'observer' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_observedGroup_3_0= ruleGroup ) ) ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )* ( (lv_groups_5_0= ruleGroup ) )* ( (lv_createRules_6_0= ruleCreateRule ) )* otherlv_7= '}' )
            {
            // InternalLang.g:2740:2: (otherlv_0= 'observer' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_observedGroup_3_0= ruleGroup ) ) ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )* ( (lv_groups_5_0= ruleGroup ) )* ( (lv_createRules_6_0= ruleCreateRule ) )* otherlv_7= '}' )
            // InternalLang.g:2741:3: otherlv_0= 'observer' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_observedGroup_3_0= ruleGroup ) ) ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )* ( (lv_groups_5_0= ruleGroup ) )* ( (lv_createRules_6_0= ruleCreateRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getObserverAccess().getObserverKeyword_0());
            		
            // InternalLang.g:2745:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLang.g:2746:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLang.g:2746:4: (lv_name_1_0= ruleValidID )
            // InternalLang.g:2747:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLang.g:2768:3: ( (lv_observedGroup_3_0= ruleGroup ) )
            // InternalLang.g:2769:4: (lv_observedGroup_3_0= ruleGroup )
            {
            // InternalLang.g:2769:4: (lv_observedGroup_3_0= ruleGroup )
            // InternalLang.g:2770:5: lv_observedGroup_3_0= ruleGroup
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getObservedGroupGroupParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_77);
            lv_observedGroup_3_0=ruleGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"observedGroup",
            						lv_observedGroup_3_0,
            						"ecs.Lang.Group");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:2787:3: ( (lv_uniqueComp_4_0= ruleUniqueComponentAccess ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==19) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==23) ) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // InternalLang.g:2788:4: (lv_uniqueComp_4_0= ruleUniqueComponentAccess )
            	    {
            	    // InternalLang.g:2788:4: (lv_uniqueComp_4_0= ruleUniqueComponentAccess )
            	    // InternalLang.g:2789:5: lv_uniqueComp_4_0= ruleUniqueComponentAccess
            	    {

            	    					newCompositeNode(grammarAccess.getObserverAccess().getUniqueCompUniqueComponentAccessParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_77);
            	    lv_uniqueComp_4_0=ruleUniqueComponentAccess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObserverRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueComp",
            	    						lv_uniqueComp_4_0,
            	    						"ecs.Lang.UniqueComponentAccess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // InternalLang.g:2806:3: ( (lv_groups_5_0= ruleGroup ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==19||LA110_0==47) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalLang.g:2807:4: (lv_groups_5_0= ruleGroup )
            	    {
            	    // InternalLang.g:2807:4: (lv_groups_5_0= ruleGroup )
            	    // InternalLang.g:2808:5: lv_groups_5_0= ruleGroup
            	    {

            	    					newCompositeNode(grammarAccess.getObserverAccess().getGroupsGroupParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_77);
            	    lv_groups_5_0=ruleGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObserverRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_5_0,
            	    						"ecs.Lang.Group");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            // InternalLang.g:2825:3: ( (lv_createRules_6_0= ruleCreateRule ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==44) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalLang.g:2826:4: (lv_createRules_6_0= ruleCreateRule )
            	    {
            	    // InternalLang.g:2826:4: (lv_createRules_6_0= ruleCreateRule )
            	    // InternalLang.g:2827:5: lv_createRules_6_0= ruleCreateRule
            	    {

            	    					newCompositeNode(grammarAccess.getObserverAccess().getCreateRulesCreateRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_createRules_6_0=ruleCreateRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObserverRule());
            	    					}
            	    					add(
            	    						current,
            	    						"createRules",
            	    						lv_createRules_6_0,
            	    						"ecs.Lang.CreateRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getObserverAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleParameter"
    // InternalLang.g:2852:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalLang.g:2852:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalLang.g:2853:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLang.g:2859:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2865:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalLang.g:2866:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalLang.g:2866:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalLang.g:2867:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalLang.g:2867:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:2868:4: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:2868:4: (lv_name_0_0= ruleValidID )
            // InternalLang.g:2869:5: lv_name_0_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalLang.g:2890:3: ( (otherlv_2= RULE_ID ) )
            // InternalLang.g:2891:4: (otherlv_2= RULE_ID )
            {
            // InternalLang.g:2891:4: (otherlv_2= RULE_ID )
            // InternalLang.g:2892:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getTypeAliasCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLang.g:2907:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLang.g:2907:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLang.g:2908:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLang.g:2914:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalLang.g:2920:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalLang.g:2921:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalLang.g:2921:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalLang.g:2922:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_78);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLang.g:2932:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==63) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalLang.g:2933:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,63,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_78);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleValidID"
    // InternalLang.g:2953:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalLang.g:2953:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalLang.g:2954:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalLang.g:2960:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'input' | kw= 'trigger' | kw= 'api' | kw= 'matcher' | kw= 'group' | kw= 'alias' | kw= 'platform' | kw= 'chain' | kw= 'precondition' | kw= 'proc' | kw= 'procs' | kw= 'key' | kw= 'index' | kw= 'observer' ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:2966:2: ( (this_ID_0= RULE_ID | kw= 'input' | kw= 'trigger' | kw= 'api' | kw= 'matcher' | kw= 'group' | kw= 'alias' | kw= 'platform' | kw= 'chain' | kw= 'precondition' | kw= 'proc' | kw= 'procs' | kw= 'key' | kw= 'index' | kw= 'observer' ) )
            // InternalLang.g:2967:2: (this_ID_0= RULE_ID | kw= 'input' | kw= 'trigger' | kw= 'api' | kw= 'matcher' | kw= 'group' | kw= 'alias' | kw= 'platform' | kw= 'chain' | kw= 'precondition' | kw= 'proc' | kw= 'procs' | kw= 'key' | kw= 'index' | kw= 'observer' )
            {
            // InternalLang.g:2967:2: (this_ID_0= RULE_ID | kw= 'input' | kw= 'trigger' | kw= 'api' | kw= 'matcher' | kw= 'group' | kw= 'alias' | kw= 'platform' | kw= 'chain' | kw= 'precondition' | kw= 'proc' | kw= 'procs' | kw= 'key' | kw= 'index' | kw= 'observer' )
            int alt113=15;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt113=1;
                }
                break;
            case 32:
                {
                alt113=2;
                }
                break;
            case 33:
                {
                alt113=3;
                }
                break;
            case 36:
                {
                alt113=4;
                }
                break;
            case 48:
                {
                alt113=5;
                }
                break;
            case 47:
                {
                alt113=6;
                }
                break;
            case 17:
                {
                alt113=7;
                }
                break;
            case 15:
                {
                alt113=8;
                }
                break;
            case 57:
                {
                alt113=9;
                }
                break;
            case 58:
                {
                alt113=10;
                }
                break;
            case 59:
                {
                alt113=11;
                }
                break;
            case 64:
                {
                alt113=12;
                }
                break;
            case 46:
                {
                alt113=13;
                }
                break;
            case 45:
                {
                alt113=14;
                }
                break;
            case 62:
                {
                alt113=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalLang.g:2968:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLang.g:2976:3: kw= 'input'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLang.g:2982:3: kw= 'trigger'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getTriggerKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLang.g:2988:3: kw= 'api'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getApiKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLang.g:2994:3: kw= 'matcher'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getMatcherKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLang.g:3000:3: kw= 'group'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getGroupKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalLang.g:3006:3: kw= 'alias'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getAliasKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalLang.g:3012:3: kw= 'platform'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getPlatformKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalLang.g:3018:3: kw= 'chain'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getChainKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalLang.g:3024:3: kw= 'precondition'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getPreconditionKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalLang.g:3030:3: kw= 'proc'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getProcKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalLang.g:3036:3: kw= 'procs'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getProcsKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalLang.g:3042:3: kw= 'key'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getKeyKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalLang.g:3048:3: kw= 'index'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getIndexKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalLang.g:3054:3: kw= 'observer'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getObserverKeyword_14());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\u008b\uffff";
    static final String dfa_2s = "\1\2\1\6\1\uffff\3\6\1\uffff\1\6\1\uffff\17\6\1\uffff\35\6\1\uffff\17\6\2\uffff\17\6\2\uffff\17\6\2\uffff\17\6\22\uffff";
    static final String dfa_3s = "\2\4\1\uffff\3\4\1\uffff\101\4\17\22\2\4\17\22\2\4\17\22\10\4\1\27\11\4";
    static final String dfa_4s = "\2\100\1\uffff\3\100\1\uffff\77\100\1\4\1\100\17\76\1\4\1\100\17\76\1\4\1\100\17\76\1\16\1\100\1\16\1\100\1\16\1\100\1\16\1\100\1\27\1\16\3\100\1\16\1\100\2\27\1\5";
    static final String dfa_5s = "\2\uffff\1\2\3\uffff\1\1\u0084\uffff";
    static final String dfa_6s = "\u008b\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\12\uffff\1\6\1\uffff\1\1\1\2\11\uffff\1\2\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\1\5\1\6\1\3\2\uffff\1\4\1\uffff\1\6",
            "\1\14\7\uffff\1\6\2\uffff\1\22\1\uffff\1\7\1\10\11\uffff\1\6\3\uffff\1\15\1\16\2\uffff\1\17\10\uffff\1\26\1\25\1\21\1\20\10\uffff\1\13\1\23\1\11\2\uffff\1\12\1\uffff\1\24",
            "",
            "\1\34\7\uffff\1\6\2\uffff\1\42\1\uffff\1\27\1\30\11\uffff\1\6\3\uffff\1\35\1\36\2\uffff\1\37\10\uffff\1\46\1\45\1\41\1\40\10\uffff\1\33\1\43\1\31\2\uffff\1\32\1\uffff\1\44",
            "\1\53\7\uffff\1\6\2\uffff\1\61\1\uffff\1\47\1\6\11\uffff\1\6\3\uffff\1\54\1\55\2\uffff\1\56\10\uffff\1\65\1\64\1\60\1\57\10\uffff\1\52\1\62\1\50\2\uffff\1\51\1\uffff\1\63",
            "\1\67\7\uffff\1\6\2\uffff\1\76\1\uffff\1\75\1\66\11\uffff\1\6\3\uffff\1\70\1\71\2\uffff\1\72\10\uffff\1\104\1\103\1\74\1\73\10\uffff\1\77\1\100\1\101\2\uffff\1\105\1\uffff\1\102",
            "",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\110\10\uffff\1\106\1\uffff\1\117\1\uffff\1\116\1\uffff\1\107\14\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\2\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\131\10\uffff\1\127\1\uffff\1\140\1\uffff\1\137\1\uffff\1\130\14\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\152\10\uffff\1\150\1\uffff\1\161\1\uffff\1\160\1\uffff\1\151\14\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\7\uffff\1\6\2\uffff\1\6\1\uffff\2\6\2\uffff\1\2\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\171",
            "\1\110\12\uffff\1\117\1\uffff\1\116\16\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\2\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\173",
            "\1\131\12\uffff\1\140\1\uffff\1\137\16\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\175",
            "\1\152\12\uffff\1\161\1\uffff\1\160\16\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\171\7\uffff\1\177\1\uffff\1\u0080",
            "\1\u0081\12\uffff\1\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\173\7\uffff\1\u0082\1\uffff\1\u0083",
            "\1\6\12\uffff\1\6\1\uffff\1\6\1\uffff\1\2\2\uffff\1\2\11\uffff\2\6\2\uffff\1\6\7\uffff\1\2\1\u0085\1\6\1\u0084\1\6\10\uffff\3\6\1\2\1\uffff\1\6\1\uffff\1\6",
            "\1\175\7\uffff\1\u0086\1\uffff\1\u0087",
            "\1\u0089\12\uffff\1\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\1\6\1\u0088\1\6\2\uffff\1\6\1\uffff\1\6",
            "\1\171\11\uffff\1\u0080",
            "\1\110\12\uffff\1\117\1\uffff\1\116\1\uffff\1\107\14\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\u008a",
            "\1\173\11\uffff\1\u0083",
            "\1\131\12\uffff\1\140\1\uffff\1\137\1\uffff\1\130\14\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\2\12\uffff\1\2\1\uffff\1\2\5\uffff\1\6\10\uffff\2\2\2\uffff\1\2\10\uffff\4\2\10\uffff\3\2\2\uffff\1\2\1\uffff\1\2",
            "\1\2\12\uffff\1\2\1\uffff\1\2\5\uffff\1\6\10\uffff\2\2\2\uffff\1\2\10\uffff\4\2\10\uffff\3\2\2\uffff\1\2\1\uffff\1\2",
            "\1\175\11\uffff\1\u0087",
            "\1\152\12\uffff\1\161\1\uffff\1\160\1\uffff\1\151\14\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\2\20\uffff\1\2\1\uffff\1\6",
            "\1\2\7\uffff\1\2\11\uffff\1\2\1\6",
            "\1\6\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 273:3: ( ( (lv_names_1_0= ruleContextName ) ) (otherlv_2= ',' )? )+";
        }
    }
    static final String dfa_8s = "\1\1\1\uffff\4\6\2\uffff\17\6\1\uffff\37\6\1\uffff\16\6\2\uffff\17\6\2\uffff\17\6\2\uffff\17\6\22\uffff";
    static final String dfa_9s = "\1\4\1\uffff\4\4\1\uffff\101\4\17\22\2\4\17\22\2\4\17\22\10\4\1\27\11\4";
    static final String dfa_10s = "\1\100\1\uffff\4\100\1\uffff\77\100\1\4\1\100\17\76\1\4\1\100\17\76\1\4\1\100\17\76\1\16\1\100\1\16\1\100\1\16\1\100\1\16\1\100\1\27\1\16\3\100\1\16\1\100\2\27\1\5";
    static final String dfa_11s = "\1\uffff\1\2\4\uffff\1\1\u0084\uffff";
    static final String[] dfa_12s = {
            "\1\6\6\uffff\1\1\3\uffff\1\6\1\1\1\2\1\1\11\uffff\1\1\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\1\5\1\6\1\3\2\uffff\1\4\1\uffff\1\6",
            "",
            "\1\10\6\uffff\2\6\2\uffff\1\17\1\6\1\16\1\7\11\uffff\1\6\3\uffff\1\11\1\12\2\uffff\1\13\10\uffff\1\25\1\24\1\15\1\14\10\uffff\1\20\1\21\1\22\2\uffff\1\26\1\uffff\1\23",
            "\1\30\6\uffff\2\6\2\uffff\1\37\1\6\1\36\1\27\11\uffff\1\6\3\uffff\1\31\1\32\2\uffff\1\33\10\uffff\1\45\1\44\1\35\1\34\10\uffff\1\40\1\41\1\42\2\uffff\1\46\1\uffff\1\43",
            "\1\47\6\uffff\2\6\2\uffff\1\56\1\6\1\55\1\6\11\uffff\1\6\3\uffff\1\50\1\51\2\uffff\1\52\10\uffff\1\64\1\63\1\54\1\53\10\uffff\1\57\1\60\1\61\2\uffff\1\65\1\uffff\1\62",
            "\1\73\6\uffff\2\6\2\uffff\1\101\1\6\1\66\1\67\11\uffff\1\6\3\uffff\1\74\1\75\2\uffff\1\76\10\uffff\1\105\1\104\1\100\1\77\10\uffff\1\72\1\102\1\70\2\uffff\1\71\1\uffff\1\103",
            "",
            "\1\110\10\uffff\1\106\1\uffff\1\117\1\uffff\1\116\1\uffff\1\107\14\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\1\uffff\2\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\131\10\uffff\1\127\1\uffff\1\140\1\uffff\1\137\1\uffff\1\130\14\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\152\10\uffff\1\150\1\uffff\1\161\1\uffff\1\160\1\uffff\1\151\14\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\6\6\uffff\2\6\2\uffff\4\6\2\uffff\1\1\6\uffff\1\6\3\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\171",
            "\1\110\12\uffff\1\117\1\uffff\1\116\16\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\1\uffff\1\1\1\172\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\173",
            "\1\131\12\uffff\1\140\1\uffff\1\137\16\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\174\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\175",
            "\1\152\12\uffff\1\161\1\uffff\1\160\16\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\6\2\uffff\1\176\1\uffff\1\6\3\uffff\2\6\34\uffff\1\6\1\uffff\1\6\2\uffff\1\6",
            "\1\171\7\uffff\1\177\1\uffff\1\u0080",
            "\1\u0081\12\uffff\1\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\3\6\2\uffff\1\6\1\uffff\1\6",
            "\1\173\7\uffff\1\u0082\1\uffff\1\u0083",
            "\1\6\12\uffff\1\6\1\uffff\1\6\1\uffff\1\1\2\uffff\1\1\11\uffff\2\6\2\uffff\1\6\7\uffff\1\1\1\u0085\1\6\1\u0084\1\6\10\uffff\3\6\1\1\1\uffff\1\6\1\uffff\1\6",
            "\1\175\7\uffff\1\u0086\1\uffff\1\u0087",
            "\1\u0089\12\uffff\1\6\1\uffff\1\6\16\uffff\2\6\2\uffff\1\6\10\uffff\4\6\10\uffff\1\6\1\u0088\1\6\2\uffff\1\6\1\uffff\1\6",
            "\1\171\11\uffff\1\u0080",
            "\1\110\12\uffff\1\117\1\uffff\1\116\1\uffff\1\107\14\uffff\1\111\1\112\2\uffff\1\113\10\uffff\1\125\1\124\1\115\1\114\10\uffff\1\120\1\121\1\122\2\uffff\1\126\1\uffff\1\123",
            "\1\u008a",
            "\1\173\11\uffff\1\u0083",
            "\1\131\12\uffff\1\140\1\uffff\1\137\1\uffff\1\130\14\uffff\1\132\1\133\2\uffff\1\134\10\uffff\1\146\1\145\1\136\1\135\10\uffff\1\141\1\142\1\143\2\uffff\1\147\1\uffff\1\144",
            "\1\1\12\uffff\1\1\1\uffff\1\1\5\uffff\1\6\10\uffff\2\1\2\uffff\1\1\10\uffff\4\1\10\uffff\3\1\2\uffff\1\1\1\uffff\1\1",
            "\1\1\12\uffff\1\1\1\uffff\1\1\5\uffff\1\6\10\uffff\2\1\2\uffff\1\1\10\uffff\4\1\10\uffff\3\1\2\uffff\1\1\1\uffff\1\1",
            "\1\175\11\uffff\1\u0087",
            "\1\152\12\uffff\1\161\1\uffff\1\160\1\uffff\1\151\14\uffff\1\153\1\154\2\uffff\1\155\10\uffff\1\167\1\166\1\157\1\156\10\uffff\1\162\1\163\1\164\2\uffff\1\170\1\uffff\1\165",
            "\1\1\20\uffff\1\1\1\uffff\1\6",
            "\1\1\7\uffff\1\1\11\uffff\1\1\1\6",
            "\1\6\1\1"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 407:3: ( ( (lv_ids_1_0= rulePlatformID ) ) (otherlv_2= ',' )? )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4A00000010070802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x4A00000010060802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4A00000010060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4A00000010040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4A00000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4200000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x4E01E01300028010L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4E01E01300029012L,0x0000000000000001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x4E01E01300028012L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4E01E01300068010L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4E01E013000AA010L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4E01E013000A8010L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008A00002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4E01E01300429010L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4E01E01300428010L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4E01E013E0068010L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4E01E013E00AA010L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4E01E013E00A8010L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4E01E013E0028010L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4E01E013C0028010L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4E01E01380028010L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000B00100480000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000B00000480000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000300000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000C8000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000CBC00401000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000CBC00400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000003800401010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000003800400010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000003000401010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000003000400010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000401010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000400010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000001010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000001012L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x000E003000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x000C003000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0008003000400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000003000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x01F0020000001000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x01F0020000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000800000480000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000401010L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1000B00000480000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000800000080000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000900000480000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000000000000002L});

}