/*
 * generated by Xtext 2.10.0
 */
package ecs.parser.antlr;

import com.google.inject.Inject;
import ecs.parser.antlr.internal.InternalLangParser;
import ecs.services.LangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LangParser extends AbstractAntlrParser {

	@Inject
	private LangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLangParser createParser(XtextTokenStream stream) {
		return new InternalLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Project";
	}

	public LangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
