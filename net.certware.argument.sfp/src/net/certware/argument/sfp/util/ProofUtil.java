package net.certware.argument.sfp.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import net.certware.argument.sfp.semiFormalProof.Conjunction;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;

/**
 * Proof utilities. 
 * Static methods normally buried in generated classes.
 * We put them here instead owing to Xtext overwrites of the generated model classes.
 * @author mrb
 * @since 1.0.3
 */
public class ProofUtil {

	/**
	 * Whether the given ID is the tail of the entailment statement.
	 * @param e entailment to check
	 * @param id identifier to match entailment tail, ignoring case
	 * @return true if string matches ignoring case, false otherwise; false if entailment null
	 */
	public static boolean isTail(Entailment e, String id) {
		if ( e == null ) {
			return false;
		}
		return e.getTail().equalsIgnoreCase(id);
	}

	/**
	 * Whether the given ID is in the of the entailment statement.
	 * @param e entailment to check
	 * @param id identifier to match entailment head element, ignoring case
	 * @return true if string matches ignoring case, false otherwise; false if entailment null
	 */
	public static boolean isInHead(Entailment e, String id) {
		if ( e != null ) {

			EList<String> heads = getHeadList(e);
			for ( String s : heads ) {
				if ( s.equalsIgnoreCase(id))
					return true;
			}
		}
		return false;
	}

	/**
	 * Generate and return a list of the identifiers appearing in the entailment head.
	 * @param e entailment to iterate
	 * @return list of identifiers appearing on the left-hand side of conjunctions
	 */
	public static EList<String> getHeadList(Entailment e) {
		EList<String> headList = new BasicEList<String>();
		if ( e != null ) {
			Conjunction c = e.getHead();
			while ( c != null ) {
				headList.add( c.getLhs() );
				c = c.getRhs();
			}
		}
		return headList;
	}
	
	/**
	 * Returns true if statement justification includes a hypothesis.
	 * @param s statement
	 * @return true if any justification element includes hypothesis
	 */
	public static boolean statementIsHypothesis(Statement s) {
		if ( s != null && s.getJustification() != null ) {
			EList<Justification> justifications = s.getJustification().getJustifications();
			if ( justifications != null ) {
				for ( Justification j : justifications ) {
					if ( j.isHypothesis() ) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns a comment associated with a statement, if any.
	 * Includes hypothesis and epsilon enumeration types.
	 * @param s statement
	 * @return string of quoted assertion field, hypothesis, epsilon, or empty string (not null)
	 */
	public static String getStatementComment(Statement s) {
		if ( s != null ) {
			Justifications justifications = s.getJustification();
			for ( Justification j : justifications.getJustifications() ) {
				if ( j.isEpsilon() )
					return "epsilon";
				if ( j.isHypothesis() )
					return "hypothesis";
				if ( j.getAssertion() != null && j.getAssertion().getText().isEmpty() == false )
					return j.getAssertion().getText();
			}
		}
		return "";
	}
	
	/**
	 * Returns true if statement justification includes epsilon.
	 * @param s statement
	 * @return true if any justification element includes epsilon
	 */
	public static boolean statementIsEpsilon(Statement s) {
		if ( s != null && s.getJustification() != null ) {
			EList<Justification> justifications = s.getJustification().getJustifications();
			if ( justifications != null ) {
				for ( Justification j : justifications ) {
					if ( j.isHypothesis() ) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean proofValidated(Proof p) {
		if ( p == null || p.getProofSteps() == null )
			return false;
		
		for ( Statement s : p.getProofSteps().getStatements() ) {
			if ( s.getValidation() == null || 
					s.getValidation().getState() == ValidationKind.INVALID ||
					s.getValidation().getState() == ValidationKind.UNKNOWN )
				return false;
		}
		
		return true;
	}

}
