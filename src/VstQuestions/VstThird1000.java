package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstThird1000 extends JPanel {

	private static final long serialVersionUID = 1L;

	VstQuestionsUI firstLevel1 = null;
	VstQuestionsUI firstLevel2 = null;
	VstQuestionsUI firstLevel3 = null;
	VstQuestionsUI firstLevel4 = null;
	VstQuestionsUI firstLevel5 = null;
	VstQuestionsUI firstLevel6 = null;
	VstQuestionsUI firstLevel7 = null;
	VstQuestionsUI firstLevel8 = null;
	VstQuestionsUI firstLevel9 = null;
	VstQuestionsUI firstLevel10 = null;

	Box verBox1 = Box.createVerticalBox();
	Box verBox2 = Box.createVerticalBox();
	Box horBox = Box.createHorizontalBox();

	public VstThird1000() throws IOException {
		
		JButton button = new JButton("Level3");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "21");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "22");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "23");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "24");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "25");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "26");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "27");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "28");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "29");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "30");

		verBox1.add(firstLevel1);
		verBox1.add(firstLevel2);
		verBox1.add(firstLevel3);
		verBox1.add(firstLevel4);
		verBox1.add(firstLevel5);
		verBox2.add(firstLevel6);
		verBox2.add(firstLevel7);
		verBox2.add(firstLevel8);
		verBox2.add(firstLevel9);
		verBox2.add(firstLevel10);

		this.add(button);
		this.add(verBox1);
		this.add(verBox2);

	}

	String questionStrings[] = { "<html>1. SOLDIER: He is a <b>soldier</b>.</html>",
			"<html>2. RESTORE: It has been <b>restored</b>.</html>",
			"<html>3. JUG: He was holding a <b>jug</b>.</html>",
			"<html>4. SCRUB: He is <b>scrubbing</b> it.</html>",
			"<html>5. DINOSAUR: The children were pretending to be <b>dinosaurs.</b></html>.",
			"<html>6. STRAP: He broke the <b>strap</b>.</html>",
			"<html>7. PAVE: It was <b>paved.</b></html>",
			"<html>8. DASH: They <b>dashed</b> over it.</html>",
			"<html>9. ROVE: He couldn't stop <b>roving</b>.</html>",
			"<html>10. LONESOME: He felt <b>lonesome</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("ungrateful");
		questions.add("very tired");
		questions.add("lonely");
		questions.add("full of energy");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("getting drunk");
		questions.add("travelling around");
		questions.add("making a musical sound through closed lips");
		questions.add("working hard");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("moved quickly");
		questions.add("moved slowly");
		questions.add("fought");
		questions.add("looked quickly");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("prevented from going through");
		questions.add("divided");
		questions.add("given gold edges");
		questions.add("covered with a hard surface");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("promise");
		questions.add("top cover");
		questions.add("shallow dish for food");
		questions.add("strip of material for holding things together");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("robbers who work at sea");
		questions.add("small creatures with human form but with wings");
		questions.add("large creatures with wings that breathe fire");
		questions.add("animals that lived a long time ago");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("cutting shallow lines into it");
		questions.add("repairing it");
		questions.add("rubbing it hard to clean it");
		questions.add("drawing simple pictures of it");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("a container for pouring liquids");
		questions.add("an informal discussion");
		questions.add("a soft cap");
		questions.add("a weapon that explodes");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("said again");
		questions.add("given to a different person");
		questions.add("given a lower price");
		questions.add("made like new again");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("person in a business");
		questions.add("student");
		questions.add("person who uses metal");
		questions.add("person in the army");

		return questions;
	}
}
