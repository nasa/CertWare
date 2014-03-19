package net.certware.argument.sfp.validation;

/**
 * Semi-formal proof validation methods.
 * Hooked into Xtext validator through extension point and abstract class code generation.
 * Uses dependency injection to identify methods to invoke.
 * @author mrb
 * @since 1.0.3
 */
import java.util.HashSet;
import java.util.Set;

import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.util.Graph;
import net.certware.argument.sfp.util.GraphAlgs;
import net.certware.argument.sfp.util.ProofUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
					SemiFormalProofPackage.Literals.JUSTIFICATION__ENTAILMENT);
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
					SemiFormalProofPackage.Literals.PROOF__PROOF_STEPS);
		}
	}

	// TODO public void proofHasUnusedSteps(Proof proof)
	
	/**
	 * A proof step statement's justification cannot refer to itself.
	 * Issues warning if statement ID is in the justification numeral list.
	 * @param statement statement to validate
	 */
	@Check
	public void statementJustificationRefersToSelf(Statement statement) {
		if ( statement.getJustification() == null )
			return;

		Justifications justifications = statement.getJustification();
		if ( justifications == null || justifications.getJustifications().isEmpty() )
			return;

		String id = statement.getId();
		for ( Justification j : justifications.getJustifications() ) {
			if ( id.equalsIgnoreCase(j.getNumeral())) {
				warning(String.format("Statement %s justification refers to itself", id), 
						SemiFormalProofPackage.Literals.JUSTIFICATIONS__JUSTIFICATIONS);
			}
		}
	}

	/**
	 * Justification numerical reference must refer to a statement ID.
	 * Issues error if statement ID not found in containing proof.
	 * @param j justification to validate
	 */
	@Check
	public void statementJustificationNumeralValid(Justification j) {

		if ( j.getNumeral() != null ) {

			Proof proof = (Proof)EcoreUtil.getRootContainer(j);
			ProofSteps ps = proof.getProofSteps();

			boolean found = false;
			for ( Statement s : ps.getStatements() ) {
				if ( s.getId().equalsIgnoreCase( j.getNumeral() )) {
					found = true;
					break;
				}
			}

			if ( found == false ) {
				error(String.format("Justification refers to missing statement %s",j.getNumeral()),
						SemiFormalProofPackage.Literals.JUSTIFICATION__NUMERAL);
			}
		}
	}

	/**
	 * Entailment tail must refer to valid statement ID.
	 * Issues warning if tail ID not found in statement list.
	 * @param entailment entailment to validate
	 */
	@Check
	public void entailmentTailExists(Entailment entailment) {
		String tail = entailment.getTail();
		Proof proof = (Proof)EcoreUtil.getRootContainer(entailment);
		if ( proof.getProofSteps() == null )
			return;

		boolean found = false;
		for ( Statement s : proof.getProofSteps().getStatements() ) {
			if ( tail.equalsIgnoreCase(s.getId() )) {
				found = true;
				break;
			}
		}

		if ( found == false ) {
			warning(String.format("Entailment tail refers to missing statement %s",tail),
					SemiFormalProofPackage.Literals.ENTAILMENT__TAIL);
		}
	}

	/**
	 * Entailment head must refer to valid statement IDs.
	 * Issues warning for each head ID not found in statement list.
	 * @param entailment entailment to validate
	 */
	@Check
	public void entailmentHeadExists(Entailment entailment) {
		EList<String> heads = ProofUtil.getHeadList(entailment);
		Proof proof = (Proof)EcoreUtil.getRootContainer(entailment);
		if ( proof.getProofSteps() == null )
			return;

		boolean found = false;
		for ( String id : heads ) {

			for ( Statement s : proof.getProofSteps().getStatements() ) {
				if ( id.equalsIgnoreCase(s.getId() )) {
					found = true;
					break;
				}
			}

			if ( found == false ) {
				warning(String.format("Entailment head refers to missing statement %s",id),
						SemiFormalProofPackage.Literals.ENTAILMENT__HEAD);
			}
		}
	}

	/**
	 * An entailment head or tail cannot include the statement of its declaration.
	 * Issues warning if statement ID is in the entailment head or tail.
	 * @param statement statement to validate
	 */
	@Check
	public void statementWithinEntailment(Statement statement) {
		if ( statement.getJustification() == null )
			return;

		Justifications justifications = statement.getJustification();
		if ( justifications == null || justifications.getJustifications().isEmpty() )
			return;

		String id = statement.getId();
		for ( Justification j : justifications.getJustifications() ) {
			if ( j.getEntailment() == null ) {
				continue;
			}

			Entailment e = j.getEntailment();
			if ( ProofUtil.isTail(e,id) ) {
				warning(String.format("Statement %s entailment tail refers to itself", id),
						SemiFormalProofPackage.Literals.ENTAILMENT__TAIL);
			}
			if ( ProofUtil.isInHead(e,id) ) {
				warning(String.format("Statement %s entailment head contains itself", id),
						SemiFormalProofPackage.Literals.ENTAILMENT__HEAD);
			}
		}
	}

	/**
	 * The proof step references must be acyclic.
	 * Issues error if proof statement references contain cycles.
	 * @param proof proof to validate
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Check
	public void proofHasNoCycles(Proof proof) {
		if ( proof == null || proof.getProofSteps() == null ) 
			return;

		EList<Statement> statements = proof.getProofSteps().getStatements();
		if ( statements == null || statements.isEmpty() ) {
			return;
		}

		// create a graph with number of vertices equal to statement list count
		int statementCount = statements.size();
		Graph graph = new Graph(statementCount,true);

		// load the graph edges according to justification references
		boolean edgeInsertionClean = true;
		try {
			for ( Statement s : statements ) {
				graph.insert(s);
			}
		} catch( ArrayIndexOutOfBoundsException obe) {
			edgeInsertionClean = false;
		}

		// now search the graph for cycles
		if ( edgeInsertionClean ) {
			String result = graph.isAcyclic();
			if ( result != null ) {
				warning(String.format("%s %s", "Proof:", result),
						SemiFormalProofPackage.Literals.PROOF__PROOF_STEPS);
				return;
			}

			// acyclic, so now check the entailment structure by statement
			for ( Statement s : statements ) {
				Set<String> context = new HashSet<String>();
				GraphAlgs.checkEntailments(proof, s, context);
				if ( context.isEmpty() == false ) {
					warning(String.format("Entailment invalid at statement %s context %s",
							s.getId(),
							context.toString()),
							SemiFormalProofPackage.Literals.PROOF__PROOF_STEPS);
				} // if
			} // for
		} else {
			// System.err.println("Graph is unclean for validation of cycles");
		} // clean
	}

}
