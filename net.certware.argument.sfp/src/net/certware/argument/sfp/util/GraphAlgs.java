package net.certware.argument.sfp.util;

import java.util.HashSet;
import java.util.Set;

import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.core.ui.log.CertWareLog;

/**
 * Graph algorithms.
 * @author nachi
 * @author mrb
 * @since 1.0.3
 */
public class GraphAlgs {

	/*
	static public void check_entailments(Inference infObj, Set disjunct) {
		Set conjunct = new HashSet();

		if (infObj.entailmentHead.length > 0) {
			// System.out.println("Entailment Tail :" + infObj.entailmentTail);
			find_context(infObj.entailmentTail, disjunct);
		}

		for (int j = 0; j < infObj.arrayofnumbers.length; j++) {
			// System.out.println("Array " + infObj.arrayofnumbers[j]);
			Iterator iter = disjunct.iterator();
			while (iter.hasNext()) {
				// System.out.println("Disjunct Array " +
				// iter.next().toString());
			}
			find_context(infObj.arrayofnumbers[j], disjunct);

		}

		for (int i = 0; i < infObj.entailmentHead.length; i++) {
			conjunct.add(new Integer(infObj.entailmentHead[i]));
		}

		disjunct.removeAll(conjunct);
	}
	 */

	static public void checkEntailments(Proof proof, Statement statement, Set<String> disjunct) {
		
		if ( proof == null || statement == null || disjunct == null )
			return;
		
		Set<String> conjunct = new HashSet<String>();

		try {
			if ( statement.getJustification() != null ) {
				Justifications justifications = statement.getJustification();
				if ( justifications.getJustifications().isEmpty() == false ) {

					// build disjunct
					for ( Justification j : justifications.getJustifications() ) {

						// entailment justifications
						Entailment entailment = j.getEntailment();
						if ( entailment != null ) { // justification has an entailment head
							String tail = entailment.getTail();
							findContext(proof, tail, disjunct);
						}

						// numeral justifications
						findContext(proof, j.getNumeral(), disjunct);
					}

					// build conjunct
					for ( Justification j : justifications.getJustifications() ) {
						Entailment entailment = j.getEntailment();
						if ( entailment != null ) {
							conjunct.addAll( ProofUtil.getHeadList(entailment) );
							
						} // non-null entailment
					} // for
				} // not empty
			} // justifications not null

			// remove the conjunct set from the disjunct set
			disjunct.removeAll(conjunct);
			
		} catch( NumberFormatException nfe ) {
			CertWareLog.logWarning(String.format("%s:%s",
					"Entailment check terminated",
					nfe.getMessage()));
		}
	}

	/**
	 * Find a statement in a proof given its id.
	 * Would rather put this in the {@code Proof} class but it will be overwritten there.
	 * @param proof proof to search
	 * @param id statement ID to find
	 * @return statement or null, matching id with {@code equalsIgnoreCase}
	 */
	static public Statement findStatement(Proof proof, String id) {
		Statement rv = null;
		if ( proof != null && proof.getProofSteps() != null && id != null ) {
			for ( Statement s : proof.getProofSteps().getStatements() ) {
				if ( id.equalsIgnoreCase( s.getId() )) { 
					return s;
				}
			}
		}
		return rv;
	}

	/**
	 * Find statement context, adjusting vertex set.
	 * @param proof proof structure
	 * @param id statement ID for context
	 * @param vertices set of vertices
	 */
	static public void findContext(Proof proof, String id, Set<String> vertices) {

		// check incoming
		if ( proof == null || id == null || vertices == null )
			return;
		
		// find the statement
		Statement s = findStatement(proof,id);
		if ( s == null || s.getJustification() == null )
			return;
		
		Justifications justifications = s.getJustification();
		
		for ( Justification j : justifications.getJustifications()) {
			
			// number justification
			if ( j.getNumeral().isEmpty() == false ) {
				findContext(proof,j.getNumeral(),vertices);
				
				// hypothesis justification
			} else if ( j.getAssertion() != null && j.getAssertion().getText().isEmpty() == false ) {
				if ( j.isHypothesis() ) {
					// vertices.add( new Integer(s.getId() ));
					vertices.add( s.getId() ); // TODO does the first line have an ID?
				}
				
				// entailment justification
			} else if ( j.getEntailment() != null && j.getEntailment().getHead() != null ) {
				Set nestedDisjunct = new HashSet();
				checkEntailments(proof,s,nestedDisjunct);
				
				if ( nestedDisjunct.isEmpty() == false ) {
					vertices.addAll(nestedDisjunct);
				}
			}
		}

		/*
		for (int i = 0; i < obj.arrayofnumbers.length; i++) {
			find_context(obj.arrayofnumbers[i], v);
		}
		*/

		/*
		if ((obj.comment.length > 0) && (obj.comment[0].equals("hypothesis"))) {
			v.add(new Integer(obj.number));
		}
		*/

		/*
		if (obj.entailmentHead.length != 0) {
			Set nestedDisjunct = new HashSet();
			check_entailments(obj, nestedDisjunct);
			if (!nestedDisjunct.isEmpty()) {
				Iterator iter = nestedDisjunct.iterator();
				while (iter.hasNext()) {
					// System.out.println("Nested Disjunct Array " +
					// iter.next().toString());
				}
				v.addAll(nestedDisjunct);
			} else {
				// System.out.println("Empty  ");
			}
		}
		*/
	}

}