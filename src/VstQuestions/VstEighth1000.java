package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstEighth1000 extends JPanel {

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

	public VstEighth1000() throws IOException {

		JButton button = new JButton("Level8");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "71");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "72");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "73");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "74");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "75");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "76");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "77");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "78");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "79");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "80");

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

	String questionStrings[] = { "<html><font size=6>1. ERRATIC: He was <b>erratic</b>.</html>",
			"<html><font size=6>2. PALETTE: He lost his <b>palette</b>.</html>",
			"<html><font size=6>3. NULL: His influence was <b>null</b>.</html>",
			"<html><font size=6>4. KINDERGARTEN: This is a good <b>kindergarten</b>.</html>",
			"<html><font size=6>5. ECLIPSE: There was an <b>eclipse</b>.</html>.",
			"<html><font size=6>6. MARROW: This is the <b>marrow</b>.</html>",
			"<html><font size=6>7. LOCUST: There were hundreds of <b>locusts</b>.</html>",
			"<html><font size=6>8. AUTHENTIC: It is <b>authentic</b>.</html>",
			"<html><font size=6>9. CABARET: We saw the <b>cabaret</b>.</html>",
			"<html><font size=6>10. MUMBLE: He started to <b>mumble</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("think deeply");
		questions.add("shake uncontrollably");
		questions.add("stay further behind the others");
		questions.add("speak in an unclear way");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("painting covering a whole wall");
		questions.add("song and dance performance");
		questions.add("small crawling insect");
		questions.add("person who is half fish, half woman");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("real");
		questions.add("very noisy");
		questions.add("old");
		questions.add("like a desert");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("insects with wings");
		questions.add("unpaid helpers");
		questions.add("people who do not eat meat");
		questions.add("brightly coloured wild flowers");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("symbol that brings good luck to a team");
		questions.add("soft centre of a bone");
		questions.add("control for guiding a plane");
		questions.add("increase in salary");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("a strong wind");
		questions.add("a loud noise of something hitting the water");
		questions.add("the killing of a large number of people");
		questions.add("the sun hidden by a planet");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("activity that allows you to forget your worries");
		questions.add("place of learning for children too young for school");
		questions.add("strong, deep bag carried on the back");
		questions.add("place where you may borrow books");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("had good results");
		questions.add("was unhelpful");
		questions.add("had no effect");
		questions.add("was long-lasting");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("basket for carrying fish");
		questions.add("wish to eat foot");
		questions.add("young female companion");
		questions.add("artist's board for mixing paints");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("without fault");
		questions.add("very bad");
		questions.add("very polite");
		questions.add("unsteady");

		return questions;
	}
}
