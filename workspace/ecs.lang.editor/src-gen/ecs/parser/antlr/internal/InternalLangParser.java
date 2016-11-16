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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ctx'", "'{'", "'}'", "'platform'", "'namespace'", "'alias'", "'comp'", "'unique'", "'='", "':'", "'*'", "'/'", "'sys'", "'init'", "'input'", "'trigger'", "'ensure'", "'exclude'", "'api'", "'destroy'", "'enteredGroup'", "'('", "')'", "'leftGroup'", "'enteredOrLeftGroup'", "'create'", "'group'", "'matcher'", "'allOf'", "'anyOf'", "'noneOf'", "'add'", "'get'", "'has'", "'replace'", "'remove'", "'parent_sys'", "'extends'", "'.'"
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
    // InternalLang.g:71:1: ruleProject returns [EObject current=null] : ( ( (lv_platformDefinition_0_0= rulePlatforms ) ) ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_typeAliases_2_0= ruleAlias ) )* ( (lv_components_3_0= ruleComponent ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_parentSystems_5_0= ruleParentSystem ) )* ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        EObject lv_platformDefinition_0_0 = null;

        EObject lv_namespace_1_0 = null;

        EObject lv_typeAliases_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_systems_4_0 = null;

        EObject lv_parentSystems_5_0 = null;

        EObject lv_contextDefinitions_6_0 = null;



        	enterRule();

        try {
            // InternalLang.g:77:2: ( ( ( (lv_platformDefinition_0_0= rulePlatforms ) ) ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_typeAliases_2_0= ruleAlias ) )* ( (lv_components_3_0= ruleComponent ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_parentSystems_5_0= ruleParentSystem ) )* ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )* ) )
            // InternalLang.g:78:2: ( ( (lv_platformDefinition_0_0= rulePlatforms ) ) ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_typeAliases_2_0= ruleAlias ) )* ( (lv_components_3_0= ruleComponent ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_parentSystems_5_0= ruleParentSystem ) )* ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )* )
            {
            // InternalLang.g:78:2: ( ( (lv_platformDefinition_0_0= rulePlatforms ) ) ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_typeAliases_2_0= ruleAlias ) )* ( (lv_components_3_0= ruleComponent ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_parentSystems_5_0= ruleParentSystem ) )* ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )* )
            // InternalLang.g:79:3: ( (lv_platformDefinition_0_0= rulePlatforms ) ) ( (lv_namespace_1_0= ruleNamespace ) )? ( (lv_typeAliases_2_0= ruleAlias ) )* ( (lv_components_3_0= ruleComponent ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_parentSystems_5_0= ruleParentSystem ) )* ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )*
            {
            // InternalLang.g:79:3: ( (lv_platformDefinition_0_0= rulePlatforms ) )
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

            // InternalLang.g:98:3: ( (lv_namespace_1_0= ruleNamespace ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
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

            // InternalLang.g:117:3: ( (lv_typeAliases_2_0= ruleAlias ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLang.g:118:4: (lv_typeAliases_2_0= ruleAlias )
            	    {
            	    // InternalLang.g:118:4: (lv_typeAliases_2_0= ruleAlias )
            	    // InternalLang.g:119:5: lv_typeAliases_2_0= ruleAlias
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getTypeAliasesAliasParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_typeAliases_2_0=ruleAlias();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeAliases",
            	    						lv_typeAliases_2_0,
            	    						"ecs.Lang.Alias");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalLang.g:136:3: ( (lv_components_3_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLang.g:137:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalLang.g:137:4: (lv_components_3_0= ruleComponent )
            	    // InternalLang.g:138:5: lv_components_3_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getComponentsComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"ecs.Lang.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalLang.g:155:3: ( (lv_systems_4_0= ruleSystem ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLang.g:156:4: (lv_systems_4_0= ruleSystem )
            	    {
            	    // InternalLang.g:156:4: (lv_systems_4_0= ruleSystem )
            	    // InternalLang.g:157:5: lv_systems_4_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getSystemsSystemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_systems_4_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_4_0,
            	    						"ecs.Lang.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalLang.g:174:3: ( (lv_parentSystems_5_0= ruleParentSystem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==47) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLang.g:175:4: (lv_parentSystems_5_0= ruleParentSystem )
            	    {
            	    // InternalLang.g:175:4: (lv_parentSystems_5_0= ruleParentSystem )
            	    // InternalLang.g:176:5: lv_parentSystems_5_0= ruleParentSystem
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getParentSystemsParentSystemParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_parentSystems_5_0=ruleParentSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parentSystems",
            	    						lv_parentSystems_5_0,
            	    						"ecs.Lang.ParentSystem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalLang.g:193:3: ( (lv_contextDefinitions_6_0= ruleContextDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLang.g:194:4: (lv_contextDefinitions_6_0= ruleContextDefinition )
            	    {
            	    // InternalLang.g:194:4: (lv_contextDefinitions_6_0= ruleContextDefinition )
            	    // InternalLang.g:195:5: lv_contextDefinitions_6_0= ruleContextDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getContextDefinitionsContextDefinitionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_contextDefinitions_6_0=ruleContextDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextDefinitions",
            	    						lv_contextDefinitions_6_0,
            	    						"ecs.Lang.ContextDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalLang.g:216:1: entryRuleContextDefinition returns [EObject current=null] : iv_ruleContextDefinition= ruleContextDefinition EOF ;
    public final EObject entryRuleContextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefinition = null;


        try {
            // InternalLang.g:216:58: (iv_ruleContextDefinition= ruleContextDefinition EOF )
            // InternalLang.g:217:2: iv_ruleContextDefinition= ruleContextDefinition EOF
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
    // InternalLang.g:223:1: ruleContextDefinition returns [EObject current=null] : (otherlv_0= 'ctx' ( (lv_name_1_0= ruleValidID ) )+ otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' ) ;
    public final EObject ruleContextDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:229:2: ( (otherlv_0= 'ctx' ( (lv_name_1_0= ruleValidID ) )+ otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' ) )
            // InternalLang.g:230:2: (otherlv_0= 'ctx' ( (lv_name_1_0= ruleValidID ) )+ otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )
            {
            // InternalLang.g:230:2: (otherlv_0= 'ctx' ( (lv_name_1_0= ruleValidID ) )+ otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )
            // InternalLang.g:231:3: otherlv_0= 'ctx' ( (lv_name_1_0= ruleValidID ) )+ otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getContextDefinitionAccess().getCtxKeyword_0());
            		
            // InternalLang.g:235:3: ( (lv_name_1_0= ruleValidID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLang.g:236:4: (lv_name_1_0= ruleValidID )
            	    {
            	    // InternalLang.g:236:4: (lv_name_1_0= ruleValidID )
            	    // InternalLang.g:237:5: lv_name_1_0= ruleValidID
            	    {

            	    					newCompositeNode(grammarAccess.getContextDefinitionAccess().getNameValidIDParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_name_1_0=ruleValidID();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"name",
            	    						lv_name_1_0,
            	    						"ecs.Lang.ValidID");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getContextDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLang.g:258:3: ( (otherlv_3= RULE_ID ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLang.g:259:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLang.g:259:4: (otherlv_3= RULE_ID )
            	    // InternalLang.g:260:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getContextDefinitionRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_3, grammarAccess.getContextDefinitionAccess().getComponentsAComponentCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContextDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRulePlatforms"
    // InternalLang.g:279:1: entryRulePlatforms returns [EObject current=null] : iv_rulePlatforms= rulePlatforms EOF ;
    public final EObject entryRulePlatforms() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatforms = null;


        try {
            // InternalLang.g:279:50: (iv_rulePlatforms= rulePlatforms EOF )
            // InternalLang.g:280:2: iv_rulePlatforms= rulePlatforms EOF
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
    // InternalLang.g:286:1: rulePlatforms returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_ids_1_0= rulePlatformID ) )+ ) ;
    public final EObject rulePlatforms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ids_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:292:2: ( (otherlv_0= 'platform' ( (lv_ids_1_0= rulePlatformID ) )+ ) )
            // InternalLang.g:293:2: (otherlv_0= 'platform' ( (lv_ids_1_0= rulePlatformID ) )+ )
            {
            // InternalLang.g:293:2: (otherlv_0= 'platform' ( (lv_ids_1_0= rulePlatformID ) )+ )
            // InternalLang.g:294:3: otherlv_0= 'platform' ( (lv_ids_1_0= rulePlatformID ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformsAccess().getPlatformKeyword_0());
            		
            // InternalLang.g:298:3: ( (lv_ids_1_0= rulePlatformID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLang.g:299:4: (lv_ids_1_0= rulePlatformID )
            	    {
            	    // InternalLang.g:299:4: (lv_ids_1_0= rulePlatformID )
            	    // InternalLang.g:300:5: lv_ids_1_0= rulePlatformID
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformsAccess().getIdsPlatformIDParserRuleCall_1_0());
            	    				
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
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalLang.g:321:1: entryRulePlatformID returns [EObject current=null] : iv_rulePlatformID= rulePlatformID EOF ;
    public final EObject entryRulePlatformID() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformID = null;


        try {
            // InternalLang.g:321:51: (iv_rulePlatformID= rulePlatformID EOF )
            // InternalLang.g:322:2: iv_rulePlatformID= rulePlatformID EOF
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
    // InternalLang.g:328:1: rulePlatformID returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject rulePlatformID() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:334:2: ( ( (lv_name_0_0= ruleValidID ) ) )
            // InternalLang.g:335:2: ( (lv_name_0_0= ruleValidID ) )
            {
            // InternalLang.g:335:2: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:336:3: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:336:3: (lv_name_0_0= ruleValidID )
            // InternalLang.g:337:4: lv_name_0_0= ruleValidID
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
    // InternalLang.g:357:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalLang.g:357:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalLang.g:358:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalLang.g:364:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:370:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalLang.g:371:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalLang.g:371:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalLang.g:372:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalLang.g:376:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLang.g:377:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLang.g:377:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLang.g:378:5: lv_name_1_0= ruleQualifiedName
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
    // InternalLang.g:399:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalLang.g:399:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalLang.g:400:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalLang.g:406:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_listOfAliases_4_0 = null;

        EObject lv_singleAlias_5_0 = null;



        	enterRule();

        try {
            // InternalLang.g:412:2: ( (otherlv_0= 'alias' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) ) ) )
            // InternalLang.g:413:2: (otherlv_0= 'alias' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) ) )
            {
            // InternalLang.g:413:2: (otherlv_0= 'alias' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) ) )
            // InternalLang.g:414:3: otherlv_0= 'alias' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
            		
            // InternalLang.g:418:3: ( (lv_componentAlias_1_0= 'comp' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLang.g:419:4: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:419:4: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:420:5: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,17,FOLLOW_14); 

                    					newLeafNode(lv_componentAlias_1_0, grammarAccess.getAliasAccess().getComponentAliasCompKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAliasRule());
                    					}
                    					setWithLastConsumed(current, "componentAlias", true, "comp");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:432:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLang.g:433:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalLang.g:433:4: (lv_unique_2_0= 'unique' )
                    // InternalLang.g:434:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_unique_2_0, grammarAccess.getAliasAccess().getUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAliasRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:446:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalLang.g:447:4: (lv_name_3_0= ruleValidID )
            {
            // InternalLang.g:447:4: (lv_name_3_0= ruleValidID )
            // InternalLang.g:448:5: lv_name_3_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getAliasAccess().getNameValidIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_3_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:465:3: ( ( (lv_listOfAliases_4_0= ruleAliasList ) ) | ( (lv_singleAlias_5_0= ruleSingleAlias ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLang.g:466:4: ( (lv_listOfAliases_4_0= ruleAliasList ) )
                    {
                    // InternalLang.g:466:4: ( (lv_listOfAliases_4_0= ruleAliasList ) )
                    // InternalLang.g:467:5: (lv_listOfAliases_4_0= ruleAliasList )
                    {
                    // InternalLang.g:467:5: (lv_listOfAliases_4_0= ruleAliasList )
                    // InternalLang.g:468:6: lv_listOfAliases_4_0= ruleAliasList
                    {

                    						newCompositeNode(grammarAccess.getAliasAccess().getListOfAliasesAliasListParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_listOfAliases_4_0=ruleAliasList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasRule());
                    						}
                    						set(
                    							current,
                    							"listOfAliases",
                    							lv_listOfAliases_4_0,
                    							"ecs.Lang.AliasList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:486:4: ( (lv_singleAlias_5_0= ruleSingleAlias ) )
                    {
                    // InternalLang.g:486:4: ( (lv_singleAlias_5_0= ruleSingleAlias ) )
                    // InternalLang.g:487:5: (lv_singleAlias_5_0= ruleSingleAlias )
                    {
                    // InternalLang.g:487:5: (lv_singleAlias_5_0= ruleSingleAlias )
                    // InternalLang.g:488:6: lv_singleAlias_5_0= ruleSingleAlias
                    {

                    						newCompositeNode(grammarAccess.getAliasAccess().getSingleAliasSingleAliasParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_singleAlias_5_0=ruleSingleAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasRule());
                    						}
                    						set(
                    							current,
                    							"singleAlias",
                    							lv_singleAlias_5_0,
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
    // InternalLang.g:510:1: entryRuleSingleAlias returns [EObject current=null] : iv_ruleSingleAlias= ruleSingleAlias EOF ;
    public final EObject entryRuleSingleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAlias = null;


        try {
            // InternalLang.g:510:52: (iv_ruleSingleAlias= ruleSingleAlias EOF )
            // InternalLang.g:511:2: iv_ruleSingleAlias= ruleSingleAlias EOF
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
    // InternalLang.g:517:1: ruleSingleAlias returns [EObject current=null] : (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? ) ;
    public final EObject ruleSingleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeAlias_1_0=null;
        Token lv_size_2_0=null;


        	enterRule();

        try {
            // InternalLang.g:523:2: ( (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? ) )
            // InternalLang.g:524:2: (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? )
            {
            // InternalLang.g:524:2: (otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )? )
            // InternalLang.g:525:3: otherlv_0= '=' ( (lv_typeAlias_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleAliasAccess().getEqualsSignKeyword_0());
            		
            // InternalLang.g:529:3: ( (lv_typeAlias_1_0= RULE_STRING ) )
            // InternalLang.g:530:4: (lv_typeAlias_1_0= RULE_STRING )
            {
            // InternalLang.g:530:4: (lv_typeAlias_1_0= RULE_STRING )
            // InternalLang.g:531:5: lv_typeAlias_1_0= RULE_STRING
            {
            lv_typeAlias_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalLang.g:547:3: ( (lv_size_2_0= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLang.g:548:4: (lv_size_2_0= RULE_INT )
                    {
                    // InternalLang.g:548:4: (lv_size_2_0= RULE_INT )
                    // InternalLang.g:549:5: lv_size_2_0= RULE_INT
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
    // InternalLang.g:569:1: entryRuleAliasList returns [EObject current=null] : iv_ruleAliasList= ruleAliasList EOF ;
    public final EObject entryRuleAliasList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasList = null;


        try {
            // InternalLang.g:569:50: (iv_ruleAliasList= ruleAliasList EOF )
            // InternalLang.g:570:2: iv_ruleAliasList= ruleAliasList EOF
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
    // InternalLang.g:576:1: ruleAliasList returns [EObject current=null] : (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' ) ;
    public final EObject ruleAliasList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:582:2: ( (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' ) )
            // InternalLang.g:583:2: (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' )
            {
            // InternalLang.g:583:2: (otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}' )
            // InternalLang.g:584:3: otherlv_0= '{' ( (lv_rules_1_0= ruleAliasRule ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalLang.g:588:3: ( (lv_rules_1_0= ruleAliasRule ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLang.g:589:4: (lv_rules_1_0= ruleAliasRule )
            	    {
            	    // InternalLang.g:589:4: (lv_rules_1_0= ruleAliasRule )
            	    // InternalLang.g:590:5: lv_rules_1_0= ruleAliasRule
            	    {

            	    					newCompositeNode(grammarAccess.getAliasListAccess().getRulesAliasRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalLang.g:615:1: entryRuleAliasRule returns [EObject current=null] : iv_ruleAliasRule= ruleAliasRule EOF ;
    public final EObject entryRuleAliasRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasRule = null;


        try {
            // InternalLang.g:615:50: (iv_ruleAliasRule= ruleAliasRule EOF )
            // InternalLang.g:616:2: iv_ruleAliasRule= ruleAliasRule EOF
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
    // InternalLang.g:622:1: ruleAliasRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? ) ;
    public final EObject ruleAliasRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_typeAlias_2_0=null;
        Token lv_size_3_0=null;
        Token lv_variableSize_4_0=null;


        	enterRule();

        try {
            // InternalLang.g:628:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? ) )
            // InternalLang.g:629:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? )
            {
            // InternalLang.g:629:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )? )
            // InternalLang.g:630:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeAlias_2_0= RULE_STRING ) ) ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )?
            {
            // InternalLang.g:630:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:631:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:631:4: (otherlv_0= RULE_ID )
            // InternalLang.g:632:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getAliasRuleAccess().getPlatformPlatformIDCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAliasRuleAccess().getColonKeyword_1());
            		
            // InternalLang.g:647:3: ( (lv_typeAlias_2_0= RULE_STRING ) )
            // InternalLang.g:648:4: (lv_typeAlias_2_0= RULE_STRING )
            {
            // InternalLang.g:648:4: (lv_typeAlias_2_0= RULE_STRING )
            // InternalLang.g:649:5: lv_typeAlias_2_0= RULE_STRING
            {
            lv_typeAlias_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalLang.g:665:3: ( ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLang.g:666:4: ( (lv_size_3_0= RULE_INT ) ) ( (lv_variableSize_4_0= '*' ) )?
                    {
                    // InternalLang.g:666:4: ( (lv_size_3_0= RULE_INT ) )
                    // InternalLang.g:667:5: (lv_size_3_0= RULE_INT )
                    {
                    // InternalLang.g:667:5: (lv_size_3_0= RULE_INT )
                    // InternalLang.g:668:6: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

                    // InternalLang.g:684:4: ( (lv_variableSize_4_0= '*' ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLang.g:685:5: (lv_variableSize_4_0= '*' )
                            {
                            // InternalLang.g:685:5: (lv_variableSize_4_0= '*' )
                            // InternalLang.g:686:6: lv_variableSize_4_0= '*'
                            {
                            lv_variableSize_4_0=(Token)match(input,21,FOLLOW_2); 

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
    // InternalLang.g:703:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalLang.g:703:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalLang.g:704:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalLang.g:710:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'comp' ( (lv_unique_1_0= 'unique' ) )? ( (lv_name_2_0= ruleValidID ) ) ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unique_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_prefix_9_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalLang.g:716:2: ( (otherlv_0= 'comp' ( (lv_unique_1_0= 'unique' ) )? ( (lv_name_2_0= ruleValidID ) ) ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) ) ) )
            // InternalLang.g:717:2: (otherlv_0= 'comp' ( (lv_unique_1_0= 'unique' ) )? ( (lv_name_2_0= ruleValidID ) ) ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) ) )
            {
            // InternalLang.g:717:2: (otherlv_0= 'comp' ( (lv_unique_1_0= 'unique' ) )? ( (lv_name_2_0= ruleValidID ) ) ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) ) )
            // InternalLang.g:718:3: otherlv_0= 'comp' ( (lv_unique_1_0= 'unique' ) )? ( (lv_name_2_0= ruleValidID ) ) ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getCompKeyword_0());
            		
            // InternalLang.g:722:3: ( (lv_unique_1_0= 'unique' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLang.g:723:4: (lv_unique_1_0= 'unique' )
                    {
                    // InternalLang.g:723:4: (lv_unique_1_0= 'unique' )
                    // InternalLang.g:724:5: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_unique_1_0, grammarAccess.getComponentAccess().getUniqueUniqueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:736:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:737:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:737:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:738:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:755:3: ( ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) ) | (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EOF||(LA21_0>=11 && LA21_0<=12)||LA21_0==17||LA21_0==20||LA21_0==23||LA21_0==47) ) {
                alt21=1;
            }
            else if ( (LA21_0==22) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalLang.g:756:4: ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) )
                    {
                    // InternalLang.g:756:4: ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? | (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==EOF||LA20_0==11||LA20_0==17||LA20_0==20||LA20_0==23||LA20_0==47) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==12) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalLang.g:757:5: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
                            {
                            // InternalLang.g:757:5: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==20) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalLang.g:758:6: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                                    {
                                    otherlv_3=(Token)match(input,20,FOLLOW_9); 

                                    						newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getColonKeyword_3_0_0_0());
                                    					
                                    // InternalLang.g:762:6: ( (otherlv_4= RULE_ID ) )
                                    // InternalLang.g:763:7: (otherlv_4= RULE_ID )
                                    {
                                    // InternalLang.g:763:7: (otherlv_4= RULE_ID )
                                    // InternalLang.g:764:8: otherlv_4= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getComponentRule());
                                    								}
                                    							
                                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                                    								newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getValueTypeAliasCrossReference_3_0_0_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLang.g:777:5: (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' )
                            {
                            // InternalLang.g:777:5: (otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}' )
                            // InternalLang.g:778:6: otherlv_5= '{' ( (lv_properties_6_0= ruleComponentProperty ) )+ otherlv_7= '}'
                            {
                            otherlv_5=(Token)match(input,12,FOLLOW_9); 

                            						newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_0_1_0());
                            					
                            // InternalLang.g:782:6: ( (lv_properties_6_0= ruleComponentProperty ) )+
                            int cnt19=0;
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_ID) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalLang.g:783:7: (lv_properties_6_0= ruleComponentProperty )
                            	    {
                            	    // InternalLang.g:783:7: (lv_properties_6_0= ruleComponentProperty )
                            	    // InternalLang.g:784:8: lv_properties_6_0= ruleComponentProperty
                            	    {

                            	    								newCompositeNode(grammarAccess.getComponentAccess().getPropertiesComponentPropertyParserRuleCall_3_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_11);
                            	    lv_properties_6_0=ruleComponentProperty();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getComponentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"properties",
                            	    									lv_properties_6_0,
                            	    									"ecs.Lang.ComponentProperty");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt19 >= 1 ) break loop19;
                                        EarlyExitException eee =
                                            new EarlyExitException(19, input);
                                        throw eee;
                                }
                                cnt19++;
                            } while (true);

                            otherlv_7=(Token)match(input,13,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_0_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:808:4: (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) )
                    {
                    // InternalLang.g:808:4: (otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) ) )
                    // InternalLang.g:809:5: otherlv_8= '/' ( (lv_prefix_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getSolidusKeyword_3_1_0());
                    				
                    // InternalLang.g:813:5: ( (lv_prefix_9_0= RULE_STRING ) )
                    // InternalLang.g:814:6: (lv_prefix_9_0= RULE_STRING )
                    {
                    // InternalLang.g:814:6: (lv_prefix_9_0= RULE_STRING )
                    // InternalLang.g:815:7: lv_prefix_9_0= RULE_STRING
                    {
                    lv_prefix_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_prefix_9_0, grammarAccess.getComponentAccess().getPrefixSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_9_0,
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
    // InternalLang.g:837:1: entryRuleComponentProperty returns [EObject current=null] : iv_ruleComponentProperty= ruleComponentProperty EOF ;
    public final EObject entryRuleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentProperty = null;


        try {
            // InternalLang.g:837:58: (iv_ruleComponentProperty= ruleComponentProperty EOF )
            // InternalLang.g:838:2: iv_ruleComponentProperty= ruleComponentProperty EOF
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
    // InternalLang.g:844:1: ruleComponentProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleComponentProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:850:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalLang.g:851:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalLang.g:851:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalLang.g:852:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalLang.g:852:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:853:4: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:853:4: (lv_name_0_0= ruleValidID )
            // InternalLang.g:854:5: lv_name_0_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getComponentPropertyAccess().getNameValidIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentPropertyAccess().getColonKeyword_1());
            		
            // InternalLang.g:875:3: ( (otherlv_2= RULE_ID ) )
            // InternalLang.g:876:4: (otherlv_2= RULE_ID )
            {
            // InternalLang.g:876:4: (otherlv_2= RULE_ID )
            // InternalLang.g:877:5: otherlv_2= RULE_ID
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
    // InternalLang.g:892:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalLang.g:892:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalLang.g:893:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalLang.g:899:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_init_3_0= 'init' ) )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_input_6_0= ruleInput ) )? ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )* ( (lv_groups_8_0= ruleGroup ) )* ( (lv_createRules_9_0= ruleCreateRule ) )* otherlv_10= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_2_0=null;
        Token lv_init_3_0=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_input_6_0 = null;

        EObject lv_uniqueComp_7_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_createRules_9_0 = null;



        	enterRule();

        try {
            // InternalLang.g:905:2: ( (otherlv_0= 'sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_init_3_0= 'init' ) )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_input_6_0= ruleInput ) )? ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )* ( (lv_groups_8_0= ruleGroup ) )* ( (lv_createRules_9_0= ruleCreateRule ) )* otherlv_10= '}' ) )
            // InternalLang.g:906:2: (otherlv_0= 'sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_init_3_0= 'init' ) )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_input_6_0= ruleInput ) )? ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )* ( (lv_groups_8_0= ruleGroup ) )* ( (lv_createRules_9_0= ruleCreateRule ) )* otherlv_10= '}' )
            {
            // InternalLang.g:906:2: (otherlv_0= 'sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_init_3_0= 'init' ) )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_input_6_0= ruleInput ) )? ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )* ( (lv_groups_8_0= ruleGroup ) )* ( (lv_createRules_9_0= ruleCreateRule ) )* otherlv_10= '}' )
            // InternalLang.g:907:3: otherlv_0= 'sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_init_3_0= 'init' ) )? ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_input_6_0= ruleInput ) )? ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )* ( (lv_groups_8_0= ruleGroup ) )* ( (lv_createRules_9_0= ruleCreateRule ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSysKeyword_0());
            		
            // InternalLang.g:911:3: ( (lv_componentAlias_1_0= 'comp' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLang.g:912:4: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:912:4: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:913:5: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,17,FOLLOW_22); 

                    					newLeafNode(lv_componentAlias_1_0, grammarAccess.getSystemAccess().getComponentAliasCompKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "componentAlias", true, "comp");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:925:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLang.g:926:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalLang.g:926:4: (lv_unique_2_0= 'unique' )
                    // InternalLang.g:927:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,18,FOLLOW_23); 

                    					newLeafNode(lv_unique_2_0, grammarAccess.getSystemAccess().getUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:939:3: ( (lv_init_3_0= 'init' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLang.g:940:4: (lv_init_3_0= 'init' )
                    {
                    // InternalLang.g:940:4: (lv_init_3_0= 'init' )
                    // InternalLang.g:941:5: lv_init_3_0= 'init'
                    {
                    lv_init_3_0=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(lv_init_3_0, grammarAccess.getSystemAccess().getInitInitKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemRule());
                    					}
                    					setWithLastConsumed(current, "init", true, "init");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:953:3: ( (lv_name_4_0= ruleValidID ) )
            // InternalLang.g:954:4: (lv_name_4_0= ruleValidID )
            {
            // InternalLang.g:954:4: (lv_name_4_0= ruleValidID )
            // InternalLang.g:955:5: lv_name_4_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameValidIDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_4_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLang.g:976:3: ( (lv_input_6_0= ruleInput ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLang.g:977:4: (lv_input_6_0= ruleInput )
                    {
                    // InternalLang.g:977:4: (lv_input_6_0= ruleInput )
                    // InternalLang.g:978:5: lv_input_6_0= ruleInput
                    {

                    					newCompositeNode(grammarAccess.getSystemAccess().getInputInputParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_input_6_0=ruleInput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSystemRule());
                    					}
                    					set(
                    						current,
                    						"input",
                    						lv_input_6_0,
                    						"ecs.Lang.Input");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:995:3: ( (lv_uniqueComp_7_0= ruleUniqueComponentAccess ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==20) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalLang.g:996:4: (lv_uniqueComp_7_0= ruleUniqueComponentAccess )
            	    {
            	    // InternalLang.g:996:4: (lv_uniqueComp_7_0= ruleUniqueComponentAccess )
            	    // InternalLang.g:997:5: lv_uniqueComp_7_0= ruleUniqueComponentAccess
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getUniqueCompUniqueComponentAccessParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_uniqueComp_7_0=ruleUniqueComponentAccess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueComp",
            	    						lv_uniqueComp_7_0,
            	    						"ecs.Lang.UniqueComponentAccess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalLang.g:1014:3: ( (lv_groups_8_0= ruleGroup ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18||LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLang.g:1015:4: (lv_groups_8_0= ruleGroup )
            	    {
            	    // InternalLang.g:1015:4: (lv_groups_8_0= ruleGroup )
            	    // InternalLang.g:1016:5: lv_groups_8_0= ruleGroup
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getGroupsGroupParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_groups_8_0=ruleGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_8_0,
            	    						"ecs.Lang.Group");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalLang.g:1033:3: ( (lv_createRules_9_0= ruleCreateRule ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLang.g:1034:4: (lv_createRules_9_0= ruleCreateRule )
            	    {
            	    // InternalLang.g:1034:4: (lv_createRules_9_0= ruleCreateRule )
            	    // InternalLang.g:1035:5: lv_createRules_9_0= ruleCreateRule
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getCreateRulesCreateRuleParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_createRules_9_0=ruleCreateRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"createRules",
            	    						lv_createRules_9_0,
            	    						"ecs.Lang.CreateRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalLang.g:1060:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalLang.g:1060:46: (iv_ruleInput= ruleInput EOF )
            // InternalLang.g:1061:2: iv_ruleInput= ruleInput EOF
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
    // InternalLang.g:1067:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( (lv_triggers_5_0= ruleInputTrigger ) )+ (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )? otherlv_12= 'api' otherlv_13= ':' ( (lv_apiRules_14_0= ruleApiRule ) )+ ( (lv_destroy_15_0= 'destroy' ) )? otherlv_16= '}' ) ;
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
        Token lv_destroy_15_0=null;
        Token otherlv_16=null;
        EObject lv_triggers_5_0 = null;

        EObject lv_apiRules_14_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1073:2: ( (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( (lv_triggers_5_0= ruleInputTrigger ) )+ (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )? otherlv_12= 'api' otherlv_13= ':' ( (lv_apiRules_14_0= ruleApiRule ) )+ ( (lv_destroy_15_0= 'destroy' ) )? otherlv_16= '}' ) )
            // InternalLang.g:1074:2: (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( (lv_triggers_5_0= ruleInputTrigger ) )+ (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )? otherlv_12= 'api' otherlv_13= ':' ( (lv_apiRules_14_0= ruleApiRule ) )+ ( (lv_destroy_15_0= 'destroy' ) )? otherlv_16= '}' )
            {
            // InternalLang.g:1074:2: (otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( (lv_triggers_5_0= ruleInputTrigger ) )+ (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )? otherlv_12= 'api' otherlv_13= ':' ( (lv_apiRules_14_0= ruleApiRule ) )+ ( (lv_destroy_15_0= 'destroy' ) )? otherlv_16= '}' )
            // InternalLang.g:1075:3: otherlv_0= 'input' ( (lv_unqiue_1_0= 'unique' ) )? otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= ':' ( (lv_triggers_5_0= ruleInputTrigger ) )+ (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )? otherlv_12= 'api' otherlv_13= ':' ( (lv_apiRules_14_0= ruleApiRule ) )+ ( (lv_destroy_15_0= 'destroy' ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalLang.g:1079:3: ( (lv_unqiue_1_0= 'unique' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLang.g:1080:4: (lv_unqiue_1_0= 'unique' )
                    {
                    // InternalLang.g:1080:4: (lv_unqiue_1_0= 'unique' )
                    // InternalLang.g:1081:5: lv_unqiue_1_0= 'unique'
                    {
                    lv_unqiue_1_0=(Token)match(input,18,FOLLOW_24); 

                    					newLeafNode(lv_unqiue_1_0, grammarAccess.getInputAccess().getUnqiueUniqueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "unqiue", true, "unique");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTriggerKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getColonKeyword_4());
            		
            // InternalLang.g:1105:3: ( (lv_triggers_5_0= ruleInputTrigger ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==31||(LA30_0>=34 && LA30_0<=35)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLang.g:1106:4: (lv_triggers_5_0= ruleInputTrigger )
            	    {
            	    // InternalLang.g:1106:4: (lv_triggers_5_0= ruleInputTrigger )
            	    // InternalLang.g:1107:5: lv_triggers_5_0= ruleInputTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getTriggersInputTriggerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalLang.g:1124:3: (otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLang.g:1125:4: otherlv_6= 'ensure' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getEnsureKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getColonKeyword_6_1());
                    			
                    // InternalLang.g:1133:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalLang.g:1134:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalLang.g:1134:5: (otherlv_8= RULE_ID )
                    	    // InternalLang.g:1135:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getInputRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getInputAccess().getEnsureComponentsAComponentCrossReference_6_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    }
                    break;

            }

            // InternalLang.g:1147:3: (otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLang.g:1148:4: otherlv_9= 'exclude' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )+
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getInputAccess().getExcludeKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputAccess().getColonKeyword_7_1());
                    			
                    // InternalLang.g:1156:4: ( (otherlv_11= RULE_ID ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalLang.g:1157:5: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalLang.g:1157:5: (otherlv_11= RULE_ID )
                    	    // InternalLang.g:1158:6: otherlv_11= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getInputRule());
                    	    						}
                    	    					
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_33); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getInputAccess().getExcludeComponentsAComponentCrossReference_7_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getInputAccess().getApiKeyword_8());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getInputAccess().getColonKeyword_9());
            		
            // InternalLang.g:1178:3: ( (lv_apiRules_14_0= ruleApiRule ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLang.g:1179:4: (lv_apiRules_14_0= ruleApiRule )
            	    {
            	    // InternalLang.g:1179:4: (lv_apiRules_14_0= ruleApiRule )
            	    // InternalLang.g:1180:5: lv_apiRules_14_0= ruleApiRule
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getApiRulesApiRuleParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_apiRules_14_0=ruleApiRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"apiRules",
            	    						lv_apiRules_14_0,
            	    						"ecs.Lang.ApiRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // InternalLang.g:1197:3: ( (lv_destroy_15_0= 'destroy' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLang.g:1198:4: (lv_destroy_15_0= 'destroy' )
                    {
                    // InternalLang.g:1198:4: (lv_destroy_15_0= 'destroy' )
                    // InternalLang.g:1199:5: lv_destroy_15_0= 'destroy'
                    {
                    lv_destroy_15_0=(Token)match(input,30,FOLLOW_35); 

                    					newLeafNode(lv_destroy_15_0, grammarAccess.getInputAccess().getDestroyDestroyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "destroy", true, "destroy");
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalLang.g:1219:1: entryRuleInputTrigger returns [EObject current=null] : iv_ruleInputTrigger= ruleInputTrigger EOF ;
    public final EObject entryRuleInputTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTrigger = null;


        try {
            // InternalLang.g:1219:53: (iv_ruleInputTrigger= ruleInputTrigger EOF )
            // InternalLang.g:1220:2: iv_ruleInputTrigger= ruleInputTrigger EOF
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
    // InternalLang.g:1226:1: ruleInputTrigger returns [EObject current=null] : ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' ) | (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' ) | (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' ) ) ;
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


        	enterRule();

        try {
            // InternalLang.g:1232:2: ( ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' ) | (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' ) | (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' ) ) )
            // InternalLang.g:1233:2: ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' ) | (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' ) | (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' ) )
            {
            // InternalLang.g:1233:2: ( (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' ) | (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' ) | (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt40=1;
                }
                break;
            case 34:
                {
                alt40=2;
                }
                break;
            case 35:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalLang.g:1234:3: (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )
                    {
                    // InternalLang.g:1234:3: (otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )
                    // InternalLang.g:1235:4: otherlv_0= 'enteredGroup' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_36); 

                    				newLeafNode(otherlv_0, grammarAccess.getInputTriggerAccess().getEnteredGroupKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalLang.g:1243:4: ( (otherlv_2= RULE_ID ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalLang.g:1244:5: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalLang.g:1244:5: (otherlv_2= RULE_ID )
                    	    // InternalLang.g:1245:6: otherlv_2= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    						}
                    	    					
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getInputTriggerAccess().getEnterComponentsAComponentCrossReference_0_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:1262:3: (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' )
                    {
                    // InternalLang.g:1262:3: (otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')' )
                    // InternalLang.g:1263:4: otherlv_4= 'leftGroup' otherlv_5= '(' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputTriggerAccess().getLeftGroupKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalLang.g:1271:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalLang.g:1272:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalLang.g:1272:5: (otherlv_6= RULE_ID )
                    	    // InternalLang.g:1273:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getInputTriggerAccess().getLeftAComponentCrossReference_1_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:1290:3: (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' )
                    {
                    // InternalLang.g:1290:3: (otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')' )
                    // InternalLang.g:1291:4: otherlv_8= 'enteredOrLeftGroup' otherlv_9= '(' ( (otherlv_10= RULE_ID ) )+ otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getInputTriggerAccess().getEnteredOrLeftGroupKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getInputTriggerAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalLang.g:1299:4: ( (otherlv_10= RULE_ID ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalLang.g:1300:5: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalLang.g:1300:5: (otherlv_10= RULE_ID )
                    	    // InternalLang.g:1301:6: otherlv_10= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getInputTriggerRule());
                    	    						}
                    	    					
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getInputTriggerAccess().getEnteredOrLeftAComponentCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_11=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputTriggerAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // InternalLang.g:1321:1: entryRuleCreateRule returns [EObject current=null] : iv_ruleCreateRule= ruleCreateRule EOF ;
    public final EObject entryRuleCreateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateRule = null;


        try {
            // InternalLang.g:1321:51: (iv_ruleCreateRule= ruleCreateRule EOF )
            // InternalLang.g:1322:2: iv_ruleCreateRule= ruleCreateRule EOF
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
    // InternalLang.g:1328:1: ruleCreateRule returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )+ ) ;
    public final EObject ruleCreateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1334:2: ( (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )+ ) )
            // InternalLang.g:1335:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )+ )
            {
            // InternalLang.g:1335:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )+ )
            // InternalLang.g:1336:3: otherlv_0= 'create' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateRuleAccess().getCreateKeyword_0());
            		
            // InternalLang.g:1340:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLang.g:1341:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLang.g:1341:4: (lv_name_1_0= ruleValidID )
            // InternalLang.g:1342:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getCreateRuleAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateRuleAccess().getColonKeyword_2());
            		
            // InternalLang.g:1363:3: ( (otherlv_3= RULE_ID ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLang.g:1364:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLang.g:1364:4: (otherlv_3= RULE_ID )
            	    // InternalLang.g:1365:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCreateRuleRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCreateRuleAccess().getComponentTypesAComponentCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // $ANTLR end "ruleCreateRule"


    // $ANTLR start "entryRuleUniqueComponentAccess"
    // InternalLang.g:1380:1: entryRuleUniqueComponentAccess returns [EObject current=null] : iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF ;
    public final EObject entryRuleUniqueComponentAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueComponentAccess = null;


        try {
            // InternalLang.g:1380:62: (iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF )
            // InternalLang.g:1381:2: iv_ruleUniqueComponentAccess= ruleUniqueComponentAccess EOF
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
    // InternalLang.g:1387:1: ruleUniqueComponentAccess returns [EObject current=null] : (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) ) ;
    public final EObject ruleUniqueComponentAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_apiRule_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1393:2: ( (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) ) )
            // InternalLang.g:1394:2: (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) )
            {
            // InternalLang.g:1394:2: (otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) ) )
            // InternalLang.g:1395:3: otherlv_0= 'unique' otherlv_1= ':' ( (lv_apiRule_2_0= ruleApiRule ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueComponentAccessAccess().getUniqueKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueComponentAccessAccess().getColonKeyword_1());
            		
            // InternalLang.g:1403:3: ( (lv_apiRule_2_0= ruleApiRule ) )
            // InternalLang.g:1404:4: (lv_apiRule_2_0= ruleApiRule )
            {
            // InternalLang.g:1404:4: (lv_apiRule_2_0= ruleApiRule )
            // InternalLang.g:1405:5: lv_apiRule_2_0= ruleApiRule
            {

            					newCompositeNode(grammarAccess.getUniqueComponentAccessAccess().getApiRuleApiRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalLang.g:1426:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalLang.g:1426:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalLang.g:1427:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalLang.g:1433:1: ruleGroup returns [EObject current=null] : ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )? (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )? (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )? otherlv_18= 'api' otherlv_19= ':' ( (lv_apiRules_20_0= ruleApiRule ) )+ ( (lv_destroy_21_0= 'destroy' ) )? otherlv_22= '}' ) ;
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
        Token lv_destroy_21_0=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_apiRules_20_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1439:2: ( ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )? (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )? (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )? otherlv_18= 'api' otherlv_19= ':' ( (lv_apiRules_20_0= ruleApiRule ) )+ ( (lv_destroy_21_0= 'destroy' ) )? otherlv_22= '}' ) )
            // InternalLang.g:1440:2: ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )? (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )? (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )? otherlv_18= 'api' otherlv_19= ':' ( (lv_apiRules_20_0= ruleApiRule ) )+ ( (lv_destroy_21_0= 'destroy' ) )? otherlv_22= '}' )
            {
            // InternalLang.g:1440:2: ( ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )? (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )? (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )? otherlv_18= 'api' otherlv_19= ':' ( (lv_apiRules_20_0= ruleApiRule ) )+ ( (lv_destroy_21_0= 'destroy' ) )? otherlv_22= '}' )
            // InternalLang.g:1441:3: ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' otherlv_4= 'matcher' otherlv_5= ':' (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )? (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )? (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )? otherlv_18= 'api' otherlv_19= ':' ( (lv_apiRules_20_0= ruleApiRule ) )+ ( (lv_destroy_21_0= 'destroy' ) )? otherlv_22= '}'
            {
            // InternalLang.g:1441:3: ( ( (lv_group_0_0= 'group' ) ) | ( (lv_unique_1_0= 'unique' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            else if ( (LA42_0==18) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalLang.g:1442:4: ( (lv_group_0_0= 'group' ) )
                    {
                    // InternalLang.g:1442:4: ( (lv_group_0_0= 'group' ) )
                    // InternalLang.g:1443:5: (lv_group_0_0= 'group' )
                    {
                    // InternalLang.g:1443:5: (lv_group_0_0= 'group' )
                    // InternalLang.g:1444:6: lv_group_0_0= 'group'
                    {
                    lv_group_0_0=(Token)match(input,37,FOLLOW_9); 

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
                    // InternalLang.g:1457:4: ( (lv_unique_1_0= 'unique' ) )
                    {
                    // InternalLang.g:1457:4: ( (lv_unique_1_0= 'unique' ) )
                    // InternalLang.g:1458:5: (lv_unique_1_0= 'unique' )
                    {
                    // InternalLang.g:1458:5: (lv_unique_1_0= 'unique' )
                    // InternalLang.g:1459:6: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,18,FOLLOW_9); 

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

            // InternalLang.g:1472:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:1473:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:1473:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:1474:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getMatcherKeyword_3());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getColonKeyword_4());
            		
            // InternalLang.g:1503:3: (otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLang.g:1504:4: otherlv_6= 'allOf' otherlv_7= '(' ( (otherlv_8= RULE_ID ) )+ otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getAllOfKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLang.g:1512:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalLang.g:1513:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalLang.g:1513:5: (otherlv_8= RULE_ID )
                    	    // InternalLang.g:1514:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGroupRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getAllOfComponentsAComponentCrossReference_5_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    otherlv_9=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:1530:3: (otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLang.g:1531:4: otherlv_10= 'anyOf' otherlv_11= '(' ( (otherlv_12= RULE_ID ) )+ otherlv_13= ')'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getAnyOfKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalLang.g:1539:4: ( (otherlv_12= RULE_ID ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalLang.g:1540:5: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalLang.g:1540:5: (otherlv_12= RULE_ID )
                    	    // InternalLang.g:1541:6: otherlv_12= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGroupRule());
                    	    						}
                    	    					
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getAnyOfComponentsAComponentCrossReference_6_2_0());
                    	    					

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

                    otherlv_13=(Token)match(input,33,FOLLOW_41); 

                    				newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightParenthesisKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalLang.g:1557:3: (otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLang.g:1558:4: otherlv_14= 'noneOf' otherlv_15= '(' ( (otherlv_16= RULE_ID ) )+ otherlv_17= ')'
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getNoneOfKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalLang.g:1566:4: ( (otherlv_16= RULE_ID ) )+
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
                    	    // InternalLang.g:1567:5: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalLang.g:1567:5: (otherlv_16= RULE_ID )
                    	    // InternalLang.g:1568:6: otherlv_16= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGroupRule());
                    	    						}
                    	    					
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getNoneOfComponentsAComponentCrossReference_7_2_0());
                    	    					

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

                    otherlv_17=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGroupAccess().getApiKeyword_8());
            		
            otherlv_19=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupAccess().getColonKeyword_9());
            		
            // InternalLang.g:1592:3: ( (lv_apiRules_20_0= ruleApiRule ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalLang.g:1593:4: (lv_apiRules_20_0= ruleApiRule )
            	    {
            	    // InternalLang.g:1593:4: (lv_apiRules_20_0= ruleApiRule )
            	    // InternalLang.g:1594:5: lv_apiRules_20_0= ruleApiRule
            	    {

            	    					newCompositeNode(grammarAccess.getGroupAccess().getApiRulesApiRuleParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_apiRules_20_0=ruleApiRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"apiRules",
            	    						lv_apiRules_20_0,
            	    						"ecs.Lang.ApiRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // InternalLang.g:1611:3: ( (lv_destroy_21_0= 'destroy' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalLang.g:1612:4: (lv_destroy_21_0= 'destroy' )
                    {
                    // InternalLang.g:1612:4: (lv_destroy_21_0= 'destroy' )
                    // InternalLang.g:1613:5: lv_destroy_21_0= 'destroy'
                    {
                    lv_destroy_21_0=(Token)match(input,30,FOLLOW_35); 

                    					newLeafNode(lv_destroy_21_0, grammarAccess.getGroupAccess().getDestroyDestroyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGroupRule());
                    					}
                    					setWithLastConsumed(current, "destroy", true, "destroy");
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalLang.g:1633:1: entryRuleApiRule returns [EObject current=null] : iv_ruleApiRule= ruleApiRule EOF ;
    public final EObject entryRuleApiRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiRule = null;


        try {
            // InternalLang.g:1633:48: (iv_ruleApiRule= ruleApiRule EOF )
            // InternalLang.g:1634:2: iv_ruleApiRule= ruleApiRule EOF
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
    // InternalLang.g:1640:1: ruleApiRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )? ) ;
    public final EObject ruleApiRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_accesors_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1646:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )? ) )
            // InternalLang.g:1647:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )? )
            {
            // InternalLang.g:1647:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )? )
            // InternalLang.g:1648:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )?
            {
            // InternalLang.g:1648:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:1649:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:1649:4: (otherlv_0= RULE_ID )
            // InternalLang.g:1650:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApiRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_0, grammarAccess.getApiRuleAccess().getComponentAComponentCrossReference_0_0());
            				

            }


            }

            // InternalLang.g:1661:3: (otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==32) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalLang.g:1662:4: otherlv_1= '(' ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+ otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getApiRuleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalLang.g:1666:4: ( (lv_accesors_2_0= ruleComponentApiAccessor ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=42 && LA51_0<=46)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalLang.g:1667:5: (lv_accesors_2_0= ruleComponentApiAccessor )
                    	    {
                    	    // InternalLang.g:1667:5: (lv_accesors_2_0= ruleComponentApiAccessor )
                    	    // InternalLang.g:1668:6: lv_accesors_2_0= ruleComponentApiAccessor
                    	    {

                    	    						newCompositeNode(grammarAccess.getApiRuleAccess().getAccesorsComponentApiAccessorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_45);
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
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getApiRuleAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // InternalLang.g:1694:1: entryRuleComponentApiAccessor returns [String current=null] : iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF ;
    public final String entryRuleComponentApiAccessor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentApiAccessor = null;


        try {
            // InternalLang.g:1694:60: (iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF )
            // InternalLang.g:1695:2: iv_ruleComponentApiAccessor= ruleComponentApiAccessor EOF
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
    // InternalLang.g:1701:1: ruleComponentApiAccessor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' ) ;
    public final AntlrDatatypeRuleToken ruleComponentApiAccessor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:1707:2: ( (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' ) )
            // InternalLang.g:1708:2: (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' )
            {
            // InternalLang.g:1708:2: (kw= 'add' | kw= 'get' | kw= 'has' | kw= 'replace' | kw= 'remove' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt53=1;
                }
                break;
            case 43:
                {
                alt53=2;
                }
                break;
            case 44:
                {
                alt53=3;
                }
                break;
            case 45:
                {
                alt53=4;
                }
                break;
            case 46:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalLang.g:1709:3: kw= 'add'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getAddKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLang.g:1715:3: kw= 'get'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getGetKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLang.g:1721:3: kw= 'has'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getHasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLang.g:1727:3: kw= 'replace'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentApiAccessorAccess().getReplaceKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLang.g:1733:3: kw= 'remove'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParentSystem"
    // InternalLang.g:1742:1: entryRuleParentSystem returns [EObject current=null] : iv_ruleParentSystem= ruleParentSystem EOF ;
    public final EObject entryRuleParentSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentSystem = null;


        try {
            // InternalLang.g:1742:53: (iv_ruleParentSystem= ruleParentSystem EOF )
            // InternalLang.g:1743:2: iv_ruleParentSystem= ruleParentSystem EOF
            {
             newCompositeNode(grammarAccess.getParentSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParentSystem=ruleParentSystem();

            state._fsp--;

             current =iv_ruleParentSystem; 
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
    // $ANTLR end "entryRuleParentSystem"


    // $ANTLR start "ruleParentSystem"
    // InternalLang.g:1749:1: ruleParentSystem returns [EObject current=null] : (otherlv_0= 'parent_sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) ;
    public final EObject ruleParentSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_componentAlias_1_0=null;
        Token lv_unique_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1755:2: ( (otherlv_0= 'parent_sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) )
            // InternalLang.g:1756:2: (otherlv_0= 'parent_sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            {
            // InternalLang.g:1756:2: (otherlv_0= 'parent_sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // InternalLang.g:1757:3: otherlv_0= 'parent_sys' ( (lv_componentAlias_1_0= 'comp' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParentSystemAccess().getParent_sysKeyword_0());
            		
            // InternalLang.g:1761:3: ( (lv_componentAlias_1_0= 'comp' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==17) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalLang.g:1762:4: (lv_componentAlias_1_0= 'comp' )
                    {
                    // InternalLang.g:1762:4: (lv_componentAlias_1_0= 'comp' )
                    // InternalLang.g:1763:5: lv_componentAlias_1_0= 'comp'
                    {
                    lv_componentAlias_1_0=(Token)match(input,17,FOLLOW_14); 

                    					newLeafNode(lv_componentAlias_1_0, grammarAccess.getParentSystemAccess().getComponentAliasCompKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParentSystemRule());
                    					}
                    					setWithLastConsumed(current, "componentAlias", true, "comp");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1775:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLang.g:1776:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalLang.g:1776:4: (lv_unique_2_0= 'unique' )
                    // InternalLang.g:1777:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_unique_2_0, grammarAccess.getParentSystemAccess().getUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParentSystemRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalLang.g:1789:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalLang.g:1790:4: (lv_name_3_0= ruleValidID )
            {
            // InternalLang.g:1790:4: (lv_name_3_0= ruleValidID )
            // InternalLang.g:1791:5: lv_name_3_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getParentSystemAccess().getNameValidIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ecs.Lang.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLang.g:1808:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalLang.g:1809:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getParentSystemAccess().getExtendsKeyword_4_0());
                    			
                    // InternalLang.g:1813:4: ( (otherlv_5= RULE_ID ) )
                    // InternalLang.g:1814:5: (otherlv_5= RULE_ID )
                    {
                    // InternalLang.g:1814:5: (otherlv_5= RULE_ID )
                    // InternalLang.g:1815:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParentSystemRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_5, grammarAccess.getParentSystemAccess().getParentAliasCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getParentSystemAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLang.g:1831:3: ( (otherlv_7= RULE_ID ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalLang.g:1832:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalLang.g:1832:4: (otherlv_7= RULE_ID )
            	    // InternalLang.g:1833:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getParentSystemRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_7, grammarAccess.getParentSystemAccess().getChildrenASystemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParentSystemAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleParentSystem"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLang.g:1852:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLang.g:1852:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLang.g:1853:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLang.g:1859:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalLang.g:1865:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalLang.g:1866:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalLang.g:1866:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalLang.g:1867:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLang.g:1877:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==49) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalLang.g:1878:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_47);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalLang.g:1898:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalLang.g:1898:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalLang.g:1899:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalLang.g:1905:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalLang.g:1911:2: (this_ID_0= RULE_ID )
            // InternalLang.g:1912:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
            	

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000800000838802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000830802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000820802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000800802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000800000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000501002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001060010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001040010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003002042000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000042000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C80000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000CB8000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000038020000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000030020000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00007C0200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000002L});

}