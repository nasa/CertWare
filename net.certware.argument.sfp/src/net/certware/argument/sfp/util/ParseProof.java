package net.certware.argument.sfp.util;

import java.util.*;

/**
 * Parse semi-formal proof. This version assumes the proof argument is a flat
 * text file.
 * 
 * @author nachi
 * @since 1.0.3
 */
public class ParseProof {

	String inputLine;
	int number, entailmentTail;
	int[] arrayofnumbers, entailmentHead;
	String[] comment;
	String stmt;
	Vector tokens = new Vector();

	public ParseProof(String str) {
		inputLine = str;
	}

	public boolean isNumeric(String checkStr) {
		try {
			Integer.parseInt(checkStr);
			return true; // Did not throw, must be a number
		} catch (NumberFormatException err) {
			return false; // Threw, So is not a number
		}
	}

	// int number, period, String quoted statement, either quoted comment, entailment, or comma numbers
	// tokenizer sticks a zero period in front of a line entitled theorem.
	
	public void intialize() throws Exception {

		int j = 0, i, k = 0, arrayLength = 0, count = 0, commentArrayLength = 0, z = 0, entailHead = 0, y = 0;
		boolean entail = false;
		String commentString = "";
		stmt = "";

		number = Integer.parseInt((String) tokens.get(0));

		for (i = 3; (!((String) tokens.get(i)).equals("\"")); i++) {

			// try{
			// if (i < tokens.size() && !((String)tokens.get(i+1)).equals("(")){
			stmt = stmt + " " + ((String) tokens.get(i));
			j++;// }
			// else
			// break;
			/*
			 * } catch (Exception e) {
			 * System.out.println("Exception "+e.getMessage());
			 * 
			 * }
			 */

		}

		// System.out.println("intialize3");

		for (j = i + 2; (!((String) tokens.get(j)).equals(")")); j++) {
			if (((String) tokens.get(j)).equals(",")) {
				if (entail)
					entail = false;
			} else if (((String) tokens.get(j)).equals("\""))
				count++;
			else if (((String) tokens.get(j + 1)).equals("-")
					|| ((String) tokens.get(j + 1)).equals("^"))
				entailHead++;
			else if (isNumeric((String) tokens.get(j)) && ((count % 2) == 0)
					&& !entail)
				arrayLength++;
			else if (((String) tokens.get(j)).equals("-")
					|| ((String) tokens.get(j + 1)).equals(">"))
				entail = true;

		}

		// System.out.println("entailHead "+ entailHead);

		arrayofnumbers = new int[arrayLength];
		entailmentHead = new int[entailHead];
		commentArrayLength = count / 2;
		comment = new String[commentArrayLength];
		boolean commentSet = false;
		entail = false;

		for (j = i + 2; (!((String) tokens.get(j)).equals(")")); j++) {

			if (((String) tokens.get(j)).equals(",")) {
				if (entail) {
					// System.out.println("Entailment Set");
					entailmentTail = Integer.parseInt((String) tokens
							.get(j - 1));
					entail = false;
				}
			} else if (((String) tokens.get(j + 1)).equals("-")
					|| ((String) tokens.get(j + 1)).equals("^")) {
				entailmentHead[y] = Integer.parseInt((String) tokens.get(j));
				// System.out.println("Entailment Head " +entailmentHead[y]);
				y++;
			} else if (((String) tokens.get(j)).equals("-")
					|| ((String) tokens.get(j + 1)).equals(">")) {
				entail = true;
			} else if (isNumeric((String) tokens.get(j)) && !commentSet
					&& !entail) {
				arrayofnumbers[k] = Integer.parseInt((String) tokens.get(j));
				// System.out.println("value "+Integer.parseInt((String)tokens.get(j)));
				k++;
			} else if (((String) tokens.get(j)).equals("\"")) {
				if (!commentString.equals("")) {
					// System.out.println("Comment :"+commentString);
					comment[z] = commentString.trim();
					commentString = "";
					commentSet = false;
					z++;
				}
			} else if (!entail) {
				commentString += ((String) tokens.get(j)) + " ";
				commentSet = true;
				// System.out.println("Comment :"+commentString);
			} else if (isNumeric((String) tokens.get(j)) && entail) {
				// System.out.println("Entailment Set");
				entailmentTail = Integer.parseInt((String) tokens.get(j));
				entail = false;
			}

		}

		// System.out.println("Entailment Tail "+ entailmentTail);

	}

	public void tokenizer() {
		int current_index = 0;
		String token = "", specialtoken = "";
		// System.out.println("Tokenizer "+inputLine);
		while (current_index < inputLine.length()) {
			char c = (inputLine.charAt(current_index));
			if (Character.isLetterOrDigit(c)) {
				token = token + c;
			} else {

				if (c == ':' && token.equalsIgnoreCase("Theorem")) {
					token = "0";
					tokens.add(token);
					tokens.add(".");
					token = "";
					current_index = current_index + 1;
					continue;
				}

				if (token != "") {
					tokens.add(token);
					token = "";
				}
				specialtoken = Character.toString(c);
				if (!Character.isSpaceChar(c)) {
					tokens.add(specialtoken);
					specialtoken = "";
				}
			}
			current_index = current_index + 1;
		}
		if (token != "") {
			tokens.add(token);
			token = "";
		}
	}

}