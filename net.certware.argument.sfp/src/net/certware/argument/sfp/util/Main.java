package net.certware.argument.sfp.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.*;

import javax.swing.JOptionPane;

// import notepad.notepad_gui;

public class Main {

	static Vector inferenceList = new Vector();

	public static void initialize() {
		inferenceList.removeAllElements();
	}

	// public static void main(String args[]) throws Exception{
	public static void check_structure(File f1, notepad_gui nGui) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader(f1));
		String str = "";

		while (str != null) {
			str = in.readLine();

			if ((str != null) && (!str.equals(""))) {
				try {

					ParseProof obj1 = new ParseProof(str);
					obj1.tokenizer();
					obj1.intialize();
					Inference infObj = new Inference();
					infObj.number = obj1.number;
					infObj.statement = obj1.stmt;
					infObj.arrayofnumbers = new int[obj1.arrayofnumbers.length];
					infObj.comment = new String[obj1.comment.length];
					infObj.arrayofnumbers = obj1.arrayofnumbers;
					infObj.comment = obj1.comment;
					infObj.entailmentHead = new int[obj1.entailmentHead.length];
					infObj.entailmentHead = obj1.entailmentHead;
					infObj.entailmentTail = obj1.entailmentTail;
					inferenceList.add(infObj);

				}
				/*
				 * catch (ArrayIndexOutOfBoundsException a) {
				 * System.out.println("Message "); a.printStackTrace();
				 * System.out.println("Tail "+ obj1.entailmentTail);
				 * System.out.println
				 * ("inferenceListSize "+inferenceList.size()); }
				 */
				catch (Exception e) {

					inferenceList.removeAllElements();
					in.close();
					JOptionPane.showMessageDialog(
									nGui,
									"The Proof Syntax is incorrect. Please check the syntax",
									"Proof Syntax Incorrect",
									JOptionPane.ERROR_MESSAGE);
					System.out.println("Exception " + e.getMessage());
					return;

				}
			}
		}
		in.close();

		Graph acyclic = new Graph(inferenceList.size(), false);

		/* disabled, no longer using inference
		for (int j = 0; j < inferenceList.size(); j++) {
			// System.out.println("inferenceList size"+ j);
			acyclic.insert((Inference) inferenceList.get(j));
		}
		*/

		/** Graph Acyclic check and entailment verification **/
		String message = new String();
		if (acyclic.isAcyclic(message)) {

			// boolean success = true;
			Set context = new HashSet();
			/*
			 * for (int k = 0; k < inferenceList.size(); k++){
			 * 
			 * inference temp = ((inference)inferenceList.get(k)); if
			 * ((temp.entailmentHead).length != 0){ success =
			 * GraphAlgs.check_entailments(temp); }
			 * 
			 * if (!success){ System.out.println(
			 * "Proof is Acyclic. But structure of the proof is incorrect");
			 * JOptionPane.showMessageDialog(nGui,
			 * "Proof Structure is incorrect. Please check the Structure",
			 * "Proof Structure Incorrect", JOptionPane.ERROR_MESSAGE); return;
			 * }
			 * 
			 * 
			 * }
			 */

			// Inference temp = ((Inference) inferenceList.get(0));
			// GraphAlgs.checkEntailments(temp, context);

			if (!context.isEmpty()) {
				System.out
						.println("Proof is Acyclic. But structure of the proof is incorrect");
				JOptionPane
						.showMessageDialog(
								nGui,
								"Proof Structure is incorrect. Please check the Structure",
								"Proof Structure Incorrect",
								JOptionPane.ERROR_MESSAGE);
				return;
			}

			System.out.println("Proof is Acyclic");
			int option = JOptionPane
					.showConfirmDialog(
							nGui,
							"Proof Structure is Checked. Do you want to continue to Slide Show",
							"choose one", JOptionPane.YES_NO_OPTION);

			if (option == 0) {
				// System.out.println("Slide Show");
				ProofSlide.initialize(nGui);
				ProofSlide.nextSlide();
				return;
			}

		} else {
			System.out.println("Proof is not Acyclic");
			JOptionPane
					.showMessageDialog(
							nGui,
							"Proof Structure is incorrect. Please check the proof for cycles",
							"Proof Structure Incorrect",
							JOptionPane.ERROR_MESSAGE);
		}

		// }catch(Exception e){
		// System.out.println("Exception is caught here "+e.getMessage());
		// System.out.println("Exception Stack trace"+e.getStackTrace());
		// }
	}
}

// Commented to change the entailment verification algorithm
/*
 * PreOrder = new int[acyclic.V()];
 * 
 * for (int k = 0; k < inferenceList.size(); k++){
 * 
 * nodes.removeAllElements(); inference temp =
 * ((inference)inferenceList.get(k)); // System.out.println("Length "+
 * temp.entailmentTail);
 * 
 * for (int i=0; i<acyclic.V(); i++) PreOrder[i] = 0;
 * 
 * if ((temp.entailmentHead).length != 0){
 * 
 * 
 * GraphAlgs.DFS_Search(acyclic, temp.entailmentTail, PreOrder, nodes);
 * 
 * if(nodes.size() != temp.entailmentHead.length){
 * System.out.println("size of nodes "+nodes.size());
 * System.out.println("Proof is Acyclic. But structure of the proof is incorrect"
 * ); System.exit(0);} for (int i = 0; i < temp.entailmentHead.length; i++){ for
 * (int j = 0; j < nodes.size(); j++) { if (((Integer) nodes.get(j)).intValue()
 * == temp.entailmentHead[i]){ nodes.remove(j); continue; } } }
 * 
 * if(nodes.size() != 0){
 * System.out.println("Proof is Acyclic. But structure of the proof is incorrect"
 * ); System.exit(0); }
 * 
 * }
 * 
 * 
 * 
 * }
 */

/*
 * //AdjList A = acyclic.getAdjList(7); //for (int t = A.beg(); !A.end(); t =
 * A.nxt()) // System.out.println("Node Value :"+ t); for (int j = 1; j <
 * inferenceList.size()+1; j++) { GraphDFSc dfsSearch = new
 * GraphDFSc(acyclic,j); }
 * //System.out.println("inferenceList size"+inferenceList.size());
 */