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

	/**
	 * Whether the proof's statements are all valid.
	 * @param p proof
	 * @return true if all statements valid, false if null or any statement invalid or unknown
	 */
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
	
	/**
	 * Compute and return the validation state for a proof.
	 * If any statement has no validation, return unknown.
	 * If any statement is unknown, return unknown.
	 * If any statement is invalid, return invalid.
	 * Otherwise, return valid.
	 * @param p proof to scan
	 * @return validation kind enumeration
	 */
	public static ValidationKind getProofValidationKind(Proof p) {
		if ( p == null || p.getProofSteps() == null )
			return ValidationKind.UNKNOWN;

		// any statement not validated, return unknown
		for ( Statement s : p.getProofSteps().getStatements() ) {
			if ( s.getValidation() == null ) {
				return ValidationKind.UNKNOWN;
			}
		}
		
		// any statement invalid, return invalid
		for ( Statement s : p.getProofSteps().getStatements() ) {
			if ( s.getValidation().getState() == ValidationKind.INVALID ) {
				return ValidationKind.INVALID;
			}
		}
		
		// any statement unknown, return unknown
		for ( Statement s : p.getProofSteps().getStatements() ) {
			if ( s.getValidation().getState() == ValidationKind.UNKNOWN ) {
				return ValidationKind.UNKNOWN;
			}
		}

		// otherwise, all statements are valid
		return ValidationKind.VALID;
	}

	/**
	 * Find a statement in a proof given its identifier.
	 * @param p proof containing statement list
	 * @param id statement identifier to find
	 * @return first statement matching ignore case or null
	 */
	public static Statement findStatement( Proof p, String id ) {
		
		if ( p != null && p.getProofSteps() != null && id.isEmpty() == false ) {
			for ( Statement s : p.getProofSteps().getStatements() ) {
				if ( s.getId().equalsIgnoreCase(id))
					return s;
			}
		}
		
		return null;
	}

	/**
	 * Get a list of statements given as premises for a given statement.
	 * @param p proof to search for statement references
	 * @param s statement containing justifications
	 * @return statement list, numeral references only (for now)
	 */
	public static EList<Statement> getStatementPremises(Proof p, Statement s) {
		EList<Statement> premises = new BasicEList<Statement>();

		if ( statementIsHypothesis(s) )
			return premises;
		
		if ( statementIsEpsilon(s) )
			return premises;
		
		
		if ( s != null && s.getJustification() != null && s.getJustification().getJustifications().isEmpty() == false ) {

			// returns only the list of numeral statement references as inference premises, not entailment for deduction
			for ( Justification j : s.getJustification().getJustifications() ) {
				if ( j.getNumeral() != null ) {
					Statement rs = findStatement( p, j.getNumeral() );
					if ( rs != null )
						premises.add(rs);
				}
			}
		}
		return premises;
	}
	

	/**
	 * Get the entailments element for a deduction statement.
	 * @param s statement to search for entailment justifications.
	 * @return entailment list
	 */
	public static EList<Entailment> getStatementEntailments(Statement s) {
		EList<Entailment> entailments = new BasicEList<Entailment>();
		
		if ( s != null && s.getJustification() != null ) {
			for ( Justification j : s.getJustification().getJustifications() ) {
				if ( j.getEntailment() != null ) {
					entailments.add( j.getEntailment() );
				}
			}
		}
		
		return entailments;
	}

	/**
	 * Get the entailment elements for a theorem statement.
	 * @param s statement to search for entailment justifications.
	 * @return entailment list
	 */
	public static EList<Entailment> getTheoremEntailments(Proof p) {
		EList<Entailment> entailments = new BasicEList<Entailment>();
		
		if ( p != null && p.getJustifications() != null ) {
			for ( Justification j : p.getJustifications().getJustifications() ) {
				if ( j.getEntailment() != null ) {
					entailments.add( j.getEntailment() );
				}
			}
		}
		
		return entailments;
	}

	/**
	 * Get a list of statements given as justifications for the theorem.
	 * Includes each justification given as an inference (numeral).
	 * @param p proof to search for statement references
	 * @return statement list from proof, not showing any missing statements from invalid references
	 */
	public static EList<Statement> getTheoremPremises(Proof p) {
		EList<Statement> justifications = new BasicEList<Statement>();
		
		if ( p != null && p.getJustifications() != null ) {
			for ( Justification j : p.getJustifications().getJustifications() ) {
				// inference statements
				if ( j.getNumeral() != null ) {
					Statement rs = findStatement( p, j.getNumeral() );
					if ( rs != null )
						justifications.add(rs);
				} 
				/*
				else 
					// entailment statements
					if ( j.getEntailment() != null ) {
						EList<String> heads = getHeadList(j.getEntailment());

						// add head elements
						for ( String head : heads ) {
							Statement hs = findStatement(p, head);
							if ( hs != null )
								justifications.add(hs);
						}
						
						// add tail
						Statement ts = findStatement( p, j.getEntailment().getTail() );
						if ( ts != null )
							justifications.add(ts);
						
				}
				*/
			} // for justifications
		}
		
		return justifications;
	}
	
	/**
	 * Checks whether a statement's justifications are valid.
	 * @param p proof
	 * @param s statement
	 * @return false if any justification statement is invalid
	 */
	public static boolean justificationsValid(Proof p, Statement s) {
		EList<Statement> dependencies = getStatementPremises(p,s);
		for ( Statement j : dependencies ) {
			if ( j.getValidation() != null && j.getValidation().getState() == ValidationKind.INVALID )
				return false;
		}
		return true;
	}
}
