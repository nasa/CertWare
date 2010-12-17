package net.certware.argument.sfp.validation;

import java.util.HashSet;
import java.util.Set;

import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.util.Graph;
import net.certware.argument.sfp.util.GraphAlgs;

import org.eclipse.xtext.validation.Check;
 
/**
 * Validation for the semi-formal proof model.
 * Uses the Xtext generated abstract validator and check annotations.
 * @author mrb
 * @since 1.0.3
 */
public class SemiFormalProofJavaValidator extends AbstractSemiFormalProofJavaValidator {

	/**
	 * Justification must have one of its parts.
	 * Issues error of no assertion, entailment, or numeral set in the justification.  
	 * @param justification justification to validate
	 */
	@Check
	public void checkJustificationNonEmpty(Justification justification) {
		if (justification.getAssertion().getText().isEmpty() &&
				justification.getEntailment().eContents().isEmpty() &&
				justification.getNumeral().isEmpty() ) {
			error("Justification has no assertion, entailment, or numeral",
					SemiFormalProofPackage.JUSTIFICATION);
		}
	}

	/**
	 * A proof must have at least one proof step.
	 * Issues error if proof statements list is empty.
	 * @param proof proof to validate
	 */
	@Check
	public void proofHasProofSteps(Proof proof) {
		if ( proof.getProofSteps().getStatements().isEmpty() ) {
			error(String.format("Proof %s has no proof steps", proof.getTitle() ),
					SemiFormalProofPackage.PROOF);
		}
	}
	
	/**
	 * The proof step references must be acyclic.
	 * Issues error if proof statement references contain cycles.
	 * @param proof proof to validate
	 */
	@Check
	public void proofHasNoCycles(Proof proof) {
		if ( proof == null || proof.getProofSteps() == null ) 
			return;
		if ( proof.getProofSteps().getStatements() == null )
			return;
		
		if ( proof.getProofSteps().getStatements().isEmpty() == false ) {
			
			// create a graph with number of vertices equal to statement list count
			int statementCount = proof.getProofSteps().getStatements().size();
			Graph graph = new Graph(statementCount,true);
			
			// load the graph edges according to justification references
			for ( int i = 0; i < statementCount; i++ ) {
				// get the statement from the statement list
				Statement s = proof.getProofSteps().getStatements().get(i);
				graph.insert(s);
				// System.err.println("inserted statement " + s.getStatement());
			}
			
			// now search the graph for cycles
			if ( graph.isClean() ) {
				String message = new String();
				if ( graph.isAcyclic(message) == false) {
					warning(message,SemiFormalProofPackage.PROOF__PROOF_STEPS);
					return;
				}
				
				// no cycles, so now check the entailment structure
				Set context = new HashSet();
				Statement s = proof.getProofSteps().getStatements().get(0);
				GraphAlgs.checkEntailments(proof, s, context);
				if ( context.isEmpty() == false ) {
					warning("Proof steps are acyclic but ill-structured",
							SemiFormalProofPackage.PROOF__PROOF_STEPS);
				}

			} else {
				// System.err.println("Graph is unclean for validation of cycles");
			}
		}
	}
	
}
