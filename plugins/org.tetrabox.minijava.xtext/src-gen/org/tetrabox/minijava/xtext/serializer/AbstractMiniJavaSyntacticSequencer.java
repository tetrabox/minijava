/*
 * generated by Xtext 2.25.0
 */
package org.tetrabox.minijava.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMiniJavaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MiniJavaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MiniJavaGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' expression=Primary
	 *     (rule start) (ambiguity) '-' expression=Primary
	 *     (rule start) (ambiguity) 'new' type=TypeRef
	 *     (rule start) (ambiguity) 'new' type=[Class|ID]
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'super' (rule start)
	 *     (rule start) (ambiguity) 'this' (rule start)
	 *     (rule start) (ambiguity) symbol=[Symbol|ID]
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {ArrayAccess.object=}
	 *     (rule start) (ambiguity) {ArrayLength.array=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {FieldAccess.receiver=}
	 *     (rule start) (ambiguity) {Inequality.left=}
	 *     (rule start) (ambiguity) {Inferior.left=}
	 *     (rule start) (ambiguity) {InferiorOrEqual.left=}
	 *     (rule start) (ambiguity) {MethodCall.receiver=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Superior.left=}
	 *     (rule start) (ambiguity) {SuperiorOrEqual.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {ArrayAccess.object=}
	 *     (rule start) (ambiguity) {ArrayLength.array=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Inequality.left=}
	 *     (rule start) (ambiguity) {Inferior.left=}
	 *     (rule start) (ambiguity) {InferiorOrEqual.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Superior.left=}
	 *     (rule start) (ambiguity) {SuperiorOrEqual.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
