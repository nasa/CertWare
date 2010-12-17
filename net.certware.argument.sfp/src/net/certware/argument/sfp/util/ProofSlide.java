package net.certware.argument.sfp.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ProofSlide {

	private static JFrame frame;
	private static int countSlideNumber;
	private static JLabel slideLabel;
	private static JLabel commentLabel;
	private static JPanel panel;
	private static int returnVal;
	final static int fontStyle = Font.BOLD;
	final static String fontName = "SansSerif";
	static String temp = "hypothesis";
	static JSeparator sepLine;
	static Vector entailmentList;
	public static int errorno = -1;
	static notepad_gui nObj;
	static JLabel comment = new JLabel();
	static int slideCount, hypoCount;

	public static void initialize(notepad_gui nGui) {

		frame = new JFrame();
		slideLabel = new JLabel();
		commentLabel = new JLabel("If the inference is correct, Press Return Key Otherwise Press Esc");
		panel = new JPanel();
		entailmentList = new Vector();
		countSlideNumber = 0;
		slideCount = 1;
		hypoCount = 0;
		returnVal = 0;
		nObj = nGui;

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.WHITE);

		frame.setUndecorated(true);
		GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice().setFullScreenWindow(frame);

		frame.getContentPane().add(slideLabel, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane(panel,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame.getContentPane().add(commentLabel, BorderLayout.SOUTH);

		slideLabel.setBackground(Color.BLACK);
		slideLabel.setForeground(Color.WHITE);
		commentLabel.setBackground(Color.BLACK);
		commentLabel.setForeground(Color.WHITE);

		slideLabel.setOpaque(true);
		slideLabel.setVerticalAlignment(SwingConstants.TOP);
		slideLabel.setHorizontalAlignment(SwingConstants.CENTER);
		slideLabel.setFont(new Font(fontName, fontStyle, 44));
		slideLabel.setOpaque(true);
		commentLabel.setOpaque(true);
		commentLabel.setVerticalAlignment(SwingConstants.TOP);
		commentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		commentLabel.setFont(new Font(fontName, fontStyle, 32));

		Dimension dim = new Dimension();
		dim = frame.getMaximumSize();
		sepLine = new JSeparator(JSeparator.HORIZONTAL);
		sepLine.setMaximumSize(new Dimension((int) dim.getWidth(), 1));

		hypo_count();

		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent event) {
			}

			public void keyReleased(KeyEvent event) {
				if (event.getKeyChar() == KeyEvent.VK_ESCAPE) {

					destroy();

				} else if (event.getKeyChar() == KeyEvent.VK_ENTER) {
					if (returnVal == -1)
						frame.dispose();
					returnVal = nextSlide();
				}
			}

			public void keyTyped(KeyEvent event) {
			}
		});

	}

	private static void destroy() {
		nObj.setErrorSelection(countSlideNumber - 1);
		nObj.setFocusable(true);
		frame.dispose();
	}

	public static void showFrame(Inference obj) {

		// System.out.println("Show Frame");

		int justificationListSize = obj.arrayofnumbers.length;
		int[] justificationListArray = new int[justificationListSize];
		justificationListArray = (int[]) obj.arrayofnumbers;

		JLabel objLabel = new JLabel(obj.number + ". " + obj.statement);

		// System.out.println("Number :"+obj.statement);
		// System.out.println("Show Frame 0");

		JLabel[] stmtLabel = new JLabel[justificationListSize];

		// System.out.println("size : "+ justificationListSize);

		objLabel.setBackground(Color.BLACK);
		objLabel.setForeground(Color.WHITE);
		objLabel.setOpaque(true);
		objLabel.setFont(new Font(fontName, fontStyle, 35));

		for (int i = 0; i < justificationListSize; i++) {
			int stmtNumber = justificationListArray[i];
			String stmt = ((Inference) Main.inferenceList.get(stmtNumber)).statement;
			stmtLabel[i] = new JLabel(stmtNumber + ".  " + stmt);
			// System.out.println("Statement "+stmtNumber+" "+stmt);
			stmtLabel[i].setBackground(Color.BLACK);
			stmtLabel[i].setForeground(Color.WHITE);
			stmtLabel[i].setOpaque(true);
			stmtLabel[i].setFont(new Font(fontName, fontStyle, 35));

		}

		panel.removeAll();
		panel.add(Box.createVerticalStrut(100));
		for (int j = 0; j < stmtLabel.length; j++) {
			// int stmtNumber = justificationListArray[j];
			panel.add(stmtLabel[j]);
			panel.add(Box.createVerticalStrut(15));
			// if (obj.comment.length >0)
			// {
			// // System.out.println("I am here");
			// for (int k = 0; k < obj.comment.length; k++)
			// {
			// JLabel comment = new JLabel();
			// comment.setBackground(Color.BLACK);
			// comment.setForeground(Color.WHITE);
			// comment.setOpaque(true);
			// comment.setFont(new Font(fontName, fontStyle,22));
			//
			// comment.setText("      ( "+obj.comment[k]+" )");
			// panel.add(comment);
			// panel.add(Box.createVerticalStrut(15));
			// }
			// }

		}

		if (obj.comment.length > 0) {
			for (int k = 0; k < obj.comment.length; k++) {
				JLabel comment = new JLabel();
				comment.setBackground(Color.BLACK);
				comment.setForeground(Color.WHITE);
				comment.setOpaque(true);
				comment.setFont(new Font(fontName, fontStyle, 22));

				comment.setText("      ( " + obj.comment[k] + " )");
				panel.add(comment);
				panel.add(Box.createVerticalStrut(15));
			}
		}

		panel.add(sepLine);
		panel.add(Box.createVerticalStrut(15));
		panel.add(objLabel);
		panel.add(Box.createHorizontalStrut(50));
		panel.repaint();
		// System.out.println("Show Frame 2");

	}

	public static void hypo_count() {
		for (int i = 0; i < Main.inferenceList.size(); i++) {

			Inference temp = ((Inference) Main.inferenceList.get(i));
			if ((temp.comment.length > 0)
					&& (temp.comment[0].equals("hypothesis"))) {
				hypoCount = hypoCount + 1;
			}
		}

	}

	public static int nextSlide() {
		// System.out.println("Next Slide");
		Inference infObj;

		int noOfInferences = Main.inferenceList.size();
		if (countSlideNumber < noOfInferences) {
			infObj = ((Inference) Main.inferenceList.get(countSlideNumber));

			if (check_for_entailments()) {

			} else if ((infObj.comment.length > 0)
					&& (infObj.comment[0].equals("hypothesis"))) {
				// System.out.println("Hypothesis");
				countSlideNumber = countSlideNumber + 1;
				nextSlide();
			} else if (infObj.entailmentHead.length > 0) {
				entailmentList.add(new Integer(countSlideNumber));
				// check_for_entailments();
				countSlideNumber = countSlideNumber + 1;
				nextSlide();
			} else {

				slideLabel.setText("Slide " + slideCount + " of "
						+ (noOfInferences - hypoCount));
				showFrame(infObj);
				slideCount = slideCount + 1;
				// check_for_entailments();
				countSlideNumber = countSlideNumber + 1;

			}
		} else {
			System.out.println("Count Slide ::::" + countSlideNumber);
			check_for_entailments();
			return -1;
		}

		return 0;
	}

	public static boolean check_for_entailments() {

		for (int i = 0; i < entailmentList.size(); i++) {

			Inference infObj = ((Inference) Main.inferenceList
					.get(((Integer) entailmentList.elementAt(i)).intValue()));

			// System.out.println(" Entailment :"+
			// infObj.entailmentHead.length);

			if (infObj.entailmentTail < countSlideNumber) {

				// slideLabel.setText("E N T A I L M E N T");
				slideLabel.setText("Slide " + slideCount + " of "
						+ (Main.inferenceList.size() - hypoCount));
				slideCount = slideCount + 1;
				JLabel objLabel = new JLabel(infObj.statement);
				JLabel arrowLabel = new JLabel("         ------>");

				Inference entailObj = ((Inference) Main.inferenceList.get(infObj.entailmentTail));
				JLabel objLabel1 = new JLabel(entailObj.number + ". " + entailObj.statement);

				JLabel[] stmtLabel = new JLabel[infObj.entailmentHead.length];

				// System.out.println("Length :"+ infObj.entailmentHead.length);
				objLabel.setBackground(Color.BLACK);
				objLabel.setForeground(Color.WHITE);
				objLabel.setOpaque(true);
				objLabel.setFont(new Font(fontName, fontStyle, 35));

				arrowLabel.setBackground(Color.BLACK);
				arrowLabel.setForeground(Color.WHITE);
				arrowLabel.setOpaque(true);
				arrowLabel.setFont(new Font(fontName, fontStyle, 35));

				objLabel1.setBackground(Color.BLACK);
				objLabel1.setForeground(Color.WHITE);
				objLabel1.setOpaque(true);
				objLabel1.setFont(new Font(fontName, fontStyle, 35));

				for (int j = 0; j < infObj.entailmentHead.length; j++) {
					int stmtNumber = infObj.entailmentHead[j];
					String stmt = ((Inference) Main.inferenceList.get(stmtNumber)).statement;
					stmtLabel[j] = new JLabel(stmtNumber + ".  " + stmt);
					// System.out.println("Statement "+stmtNumber+" "+stmt);
					stmtLabel[j].setBackground(Color.BLACK);
					stmtLabel[j].setForeground(Color.WHITE);
					stmtLabel[j].setOpaque(true);
					stmtLabel[j].setFont(new Font(fontName, fontStyle, 35));

				}

				panel.removeAll();
				// System.out.println("Show Frame 1");
				panel.add(Box.createVerticalStrut(100));
				for (int j = 0; j < stmtLabel.length; j++) {
					panel.add(stmtLabel[j]);
					panel.add(Box.createVerticalStrut(15));
				}

				panel.add(arrowLabel);
				panel.add(Box.createVerticalStrut(15));
				panel.add(objLabel1);
				panel.add(sepLine);
				panel.add(Box.createVerticalStrut(15));
				panel.add(objLabel);
				panel.add(Box.createHorizontalStrut(50));
				panel.repaint();
				entailmentList.remove(i);

				return true;
			}

		}
		return false;
	}

}

/*
 * REFERENCE CODE ************************
 * 
 * 
 * final int fontStyle = Font.BOLD; final String fontName = "SansSerif";
 * 
 * 
 * frame.addKeyListener(new KeyListener() { public void keyPressed(KeyEvent
 * event) { } public void keyReleased(KeyEvent event) { if (event.getKeyChar()
 * == KeyEvent.VK_ESCAPE) { System.exit(0); } else if (event.getKeyChar() ==
 * KeyEvent.VK_ENTER) { nextSlide(); } } public void keyTyped(KeyEvent event) {
 * } } ); frame.setUndecorated(true);
 * 
 * JLabel label = new JLabel(" SLIDE 1 of 7 "); JLabel label1 = new JLabel("1. "
 * + "Suppose that there exist only finitely many primes p1, p2, ... , pj");
 * JLabel label2 = new
 * JLabel("If the inference is correct, Press Return Key Otherwise Press Esc");
 * JLabel label3 = new JLabel("2. " + "Let N = (p1)*(p2)*...*(pj)"); JLabel
 * label4 = new JLabel("3. " +
 * "Let(q1)*(q2)...*(qk) be prime factorization of (N-1)"); JPanel panel = new
 * JPanel();
 * 
 * panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
 * 
 * 
 * label.setBackground(Color.BLACK); label.setForeground(Color.WHITE);
 * label1.setBackground(Color.BLACK); label1.setForeground(Color.WHITE);
 * label2.setBackground(Color.BLACK); label2.setForeground(Color.WHITE);
 * label3.setBackground(Color.BLACK); label3.setForeground(Color.WHITE);
 * label4.setBackground(Color.BLACK); label4.setForeground(Color.WHITE);
 * 
 * 
 * panel.setBackground(Color.BLACK); panel.setForeground(Color.WHITE);
 * 
 * 
 * 
 * label.setOpaque(true); label.setVerticalAlignment(SwingConstants.TOP);
 * label.setHorizontalAlignment(SwingConstants.CENTER); label.setFont(new
 * Font(fontName, fontStyle,44)); label1.setOpaque(true);
 * label2.setOpaque(true); label3.setOpaque(true); label4.setOpaque(true);
 * label1.setFont(new Font(fontName, fontStyle,35)); label3.setFont(new
 * Font(fontName, fontStyle,35)); label4.setFont(new Font(fontName,
 * fontStyle,35)); label2.setVerticalAlignment(SwingConstants.TOP);
 * label2.setHorizontalAlignment(SwingConstants.CENTER); label2.setFont(new
 * Font(fontName, fontStyle,32));
 * 
 * Dimension dim = new Dimension(); dim = frame.getMaximumSize(); JSeparator
 * sepLine = new JSeparator (JSeparator.HORIZONTAL); sepLine.setMaximumSize(new
 * Dimension((int)dim.getWidth(),1)); //System.out.println("width"
 * +dim.getWidth()); panel.add(Box.createVerticalStrut(100)); panel.add(label1);
 * panel.add(Box.createVerticalStrut(15)); panel.add(label3);
 * panel.add(Box.createVerticalStrut(15)); panel.add(sepLine);
 * panel.add(Box.createVerticalStrut(15)); panel.add(label4);
 * panel.add(Box.createHorizontalStrut(50));
 * 
 * 
 * 
 * frame.getContentPane().add(label, BorderLayout.NORTH);
 * frame.getContentPane().add(panel, BorderLayout.CENTER);
 * frame.getContentPane().add(label2, BorderLayout.SOUTH);
 * 
 * frame.pack();
 * 
 * 
 * 
 * GraphicsEnvironment.getLocalGraphicsEnvironment().
 * getDefaultScreenDevice().setFullScreenWindow(frame);
 * 
 * 
 * }
 * 
 * 
 * //GraphicsEnvironment.getLocalGraphicsEnvironment().
 * //getDefaultScreenDevice().setFullScreenWindow(null);
 * 
 * 
 * // for (int k = 0; k <= panel.getComponentCount(); k++) // panel.remove(k);
 * // // //panel.invalidate(); // // //
 * System.out.println(frame.getContentPane().getComponentCount()); //
 * frame.getContentPane().invalidate(); //
 * frame.getContentPane().remove(slideLabel); //
 * frame.getContentPane().remove(panel); //
 * frame.getContentPane().remove(commentLabel); ////
 * //System.out.println(frame.getContentPane().getComponentCount()); //
 * frame.getContentPane().validate();
 * //GraphicsEnvironment.getLocalGraphicsEnvironment().
 * //getDefaultScreenDevice().setFullScreenWindow(null);
 * 
 * 
 * 
 * 
 * //frame.dispose(); //frame = new JFrame();
 * 
 * 
 * 
 * 
 * slideLabel.setBackground(Color.BLACK); slideLabel.setForeground(Color.WHITE);
 * commentLabel.setBackground(Color.BLACK);
 * commentLabel.setForeground(Color.WHITE);
 * 
 * slideLabel.setOpaque(true);
 * slideLabel.setVerticalAlignment(SwingConstants.TOP);
 * slideLabel.setHorizontalAlignment(SwingConstants.CENTER);
 * slideLabel.setFont(new Font(fontName, fontStyle,44));
 * slideLabel.setOpaque(true); commentLabel.setOpaque(true);
 * commentLabel.setVerticalAlignment(SwingConstants.TOP);
 * commentLabel.setHorizontalAlignment(SwingConstants.CENTER);
 * commentLabel.setFont(new Font(fontName, fontStyle,32));
 * 
 * 
 * // System.out.println("Next Slide 1");
 * 
 * //frame.getContentPane().add(slideLabel, BorderLayout.NORTH);
 * //frame.getContentPane().add(panel, BorderLayout.CENTER);
 * //frame.getContentPane().add(commentLabel, BorderLayout.SOUTH);
 * 
 * // frame.pack();
 * 
 * 
 * // System.out.println("Next Slide 2");
 * 
 * //GraphicsEnvironment.getLocalGraphicsEnvironment().
 * //getDefaultScreenDevice().setFullScreenWindow(frame);
 * //frame.getContentPane().validate(); // Dimension dim = new Dimension(); //
 * dim = frame.getMaximumSize(); // JSeparator sepLine = new JSeparator
 * (JSeparator.HORIZONTAL); // sepLine.setMaximumSize(new
 * Dimension((int)dim.getWidth(),1));
 */
/*
 * if (((inference)Main.inferenceList.get(stmtNumber)).comment.length >0) { //
 * System.out.println("I am here"); for (int k = 0; k <
 * ((inference)Main.inferenceList.get(stmtNumber)).comment.length; k++) { JLabel
 * comment = new JLabel(); comment.setBackground(Color.BLACK);
 * comment.setForeground(Color.WHITE); comment.setOpaque(true);
 * comment.setFont(new Font(fontName, fontStyle,22));
 * 
 * comment.setText("      ( "+((inference)Main.inferenceList.get(stmtNumber)).
 * comment[k]+" )"); panel.add(comment); panel.add(Box.createVerticalStrut(15));
 * } }
 */
