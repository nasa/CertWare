package net.certware.argument.sfp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.argument.sfp.semiFormalProof.Conjunction;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.QuotedAssertion;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.Validation;
import net.certware.argument.sfp.services.SemiFormalProofGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SemiFormalProofSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SemiFormalProofGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SemiFormalProofPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SemiFormalProofPackage.CONJUNCTION:
				if(context == grammarAccess.getConjunctionRule()) {
					sequence_Conjunction(context, (Conjunction) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.ENTAILMENT:
				if(context == grammarAccess.getEntailmentRule()) {
					sequence_Entailment(context, (Entailment) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.JUSTIFICATION:
				if(context == grammarAccess.getJustificationRule()) {
					sequence_Justification(context, (Justification) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.JUSTIFICATIONS:
				if(context == grammarAccess.getJustificationsRule()) {
					sequence_Justifications(context, (Justifications) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.PROOF:
				if(context == grammarAccess.getProofRule()) {
					sequence_Proof(context, (Proof) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.PROOF_STEPS:
				if(context == grammarAccess.getProofStepsRule()) {
					sequence_ProofSteps(context, (ProofSteps) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.QUOTED_ASSERTION:
				if(context == grammarAccess.getQuotedAssertionRule()) {
					sequence_QuotedAssertion(context, (QuotedAssertion) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case SemiFormalProofPackage.VALIDATION:
				if(context == grammarAccess.getValidationRule()) {
					sequence_Validation(context, (Validation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lhs=Numeral rhs=Conjunction)
	 */
	protected void sequence_Conjunction(EObject context, Conjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.CONJUNCTION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.CONJUNCTION__LHS));
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.CONJUNCTION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.CONJUNCTION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConjunctionAccess().getLhsNumeralParserRuleCall_0_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getConjunctionAccess().getRhsConjunctionParserRuleCall_0_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Conjunction tail=Numeral)
	 */
	protected void sequence_Entailment(EObject context, Entailment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.ENTAILMENT__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.ENTAILMENT__HEAD));
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.ENTAILMENT__TAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.ENTAILMENT__TAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntailmentAccess().getHeadConjunctionParserRuleCall_1_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getEntailmentAccess().getTailNumeralParserRuleCall_3_0(), semanticObject.getTail());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     hypothesis?='hypothesis'
	 */
	protected void sequence_Justification(EObject context, Justification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((justifications+=Justification justifications+=Justification*)?)
	 */
	protected void sequence_Justifications(EObject context, Justifications semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((statements+=Statement statements+=Statement*)?)
	 */
	protected void sequence_ProofSteps(EObject context, ProofSteps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=Text justifications=Justifications proofSteps=ProofSteps)
	 */
	protected void sequence_Proof(EObject context, Proof semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.PROOF__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.PROOF__TITLE));
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.PROOF__JUSTIFICATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.PROOF__JUSTIFICATIONS));
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.PROOF__PROOF_STEPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.PROOF__PROOF_STEPS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProofAccess().getTitleTextParserRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getProofAccess().getJustificationsJustificationsParserRuleCall_4_0(), semanticObject.getJustifications());
		feeder.accept(grammarAccess.getProofAccess().getProofStepsProofStepsParserRuleCall_6_0(), semanticObject.getProofSteps());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     text=Text
	 */
	protected void sequence_QuotedAssertion(EObject context, QuotedAssertion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SemiFormalProofPackage.Literals.QUOTED_ASSERTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemiFormalProofPackage.Literals.QUOTED_ASSERTION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuotedAssertionAccess().getTextTextParserRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=Numeral statement=Text justification=Justifications validation=Validation?)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (author=Text timeStamp=Text? state=ValidationKind)
	 */
	protected void sequence_Validation(EObject context, Validation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
