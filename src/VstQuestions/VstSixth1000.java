package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstSixth1000 extends JPanel {

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

	public VstSixth1000() throws IOException {

		JButton button = new JButton("Level6");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "51");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "52");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "53");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "54");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "55");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "56");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "57");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "58");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "59");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "60");

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

	String questionStrings[] = { "<html><font size=6>1. DEVIOUS: Your plans are <b>devious</b>.</html>",
			"<html><font size=6>2. PREMIER: The <b>premier</b> spoke for an hour.</html>",
			"<html><font size=6>3. BUTLER: They have a <b>butler</b>.</html>",
			"<html><font size=6>4. ACCESSORY: They gave us some <b>accessories</b>.</html>",
			"<html><font size=6>5. THRESHOLD: They raised the <b>threshold</b>.</html>.",
			"<html><font size=6>6. THESIS: She has completed her <b>thesis</b>.</html>",
			"<html><font size=6>7. STRANGLE: He <b>strangled</b> her.</html>",
			"<html><font size=6>8. CAVALIER: He treated her in a <b>cavalier</b> manner.</html>",
			"<html><font size=6>9. MALIGN: His <b>malign</b> influence is still felt.</html>",
			"<html><font size=6>10. VEER: The car <b>veered</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("went suddenly in another direction");
		questions.add("moved shakily");
		questions.add("make a very load noise");
		questions.add("slid sideways without the wheels turning");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("evil");
		questions.add("good");
		questions.add("very important");
		questions.add("secret");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("without care");
		questions.add("politely");
		questions.add("awkwardly");
		questions.add("as a brother would");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("killed her by pressing her throat");
		questions.add("gave her all the things she wanted");
		questions.add("took her away by force");
		questions.add("admired her greatly");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("long written report of study carried out for a university degree");
		questions.add("talk given by a judge at the end of a trial");
		questions.add("first year of employment after becoming a treacher");
		questions.add("extended course of hospital treatment");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("flag");
		questions.add("point or line where something changes");
		questions.add("roof inside a building");
		questions.add("cost of borrowing money");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("papers allowing us to enter a country");
		questions.add("official orders");
		questions.add("ideas to choose between");
		questions.add("extra pieces");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("man servant");
		questions.add("machine for cutting up trees");
		questions.add("private teacher");
		questions.add("cool dark room under the house");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("person who works in a law court");
		questions.add("university teacher");
		questions.add("adventurer");
		questions.add("head of the government");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("tricky");
		questions.add("well-developed");
		questions.add("not well thought out");
		questions.add("more expensive than necessary");

		return questions;
	}
}
