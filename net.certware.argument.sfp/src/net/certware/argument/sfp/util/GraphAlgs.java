package net.certware.argument.sfp.util;

import java.util.HashSet;
import java.util.Set;

import net.certware.argument.sfp.semiFormalProof.Conjunction;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.core.ui.log.CertWareLog;

/**
 * Graph algorithms.
 * 
 * @author nachi
 * @author mrb
 * @since 1.0.3
 */
public class GraphAlgs {


	/*
	static public void DFS_Search(Graph graph, int v, int[] preOrder, Vector nodes) {
		preOrder[v] = 1;

		Vector neighbors = graph.neighbors(v);

		for (int i = 0; i < neighbors.size(); i++) {
			int u = ((Integer) neighbors.elementAt(i)).intValue();

			if ((((Inference) Main.inferenceList.get(u)).comment.length > 0)
					&& (((Inference) Main.inferenceList.get(u)).comment[0].equals(Justification.HYPOTHESIS)) 
					                                                    && preOrder[u] == 0)
				nodes.add((Integer) neighbors.elementAt(i));

			if (preOrder[u] == 0) { // have we not seen vertex u before?
				DFS_Search(graph, u, preOrder, nodes);
			}
		}

		return;
	}
	*/

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

	static public void checkEntailments(Proof proof, Statement statement, Set disjunct) {
		
		// TODO is this working?
		
		Set conjunct = new HashSet();

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

						// number justifications
						String numeral = j.getNumeral();
						findContext(proof, numeral, disjunct);
					} // for

					// build conjunct
					for ( Justification j : justifications.getJustifications() ) {
						Entailment entailment = j.getEntailment();
						if ( entailment != null ) {
							Conjunction c = entailment.getHead();
							while( c != null ) {
								conjunct.add( new Integer(c.getLhs() ) ) ;
								c = c.getRhs();
							}
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
	 * Find statement context, adjusting vertex set.
	 * @param proof proof structure
	 * @param id statement ID for context
	 * @param vertices set of vertices
	 */
	static public void findContext(Proof proof, String id, Set vertices) {

		// check proof
		if ( proof == null )
			return;
		
		// find the statement
		Statement s = proof.findStatement(id);
		if ( s == null || s.getJustification() == null )
			return;
		
		Justifications justifications = s.getJustification();
		
		for ( Justification j : justifications.getJustifications()) {
			
			// number justification
			if ( j.getNumeral().isEmpty() == false ) {
				findContext(proof,j.getNumeral(),vertices);
				
				// hypothesis justification
			} else if ( j.getAssertion() != null && j.getAssertion().getText().isEmpty() == false ) {
				if ( Justification.HYPOTHESIS.equalsIgnoreCase( j.getAssertion().getText() )) {
					vertices.add( new Integer(s.getId() ));
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