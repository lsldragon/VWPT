package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstForth1000 extends JPanel {

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

	public VstForth1000() throws IOException {

		JButton button = new JButton("Level4");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "31");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "32");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "33");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "34");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "35");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "36");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "37");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "38");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "39");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "40");

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

	String questionStrings[] = { "<html><font size=6>1. COMPOUND: They made a new <b>compound</b>.</html>",
			"<html><font size=6>2. LATTER: I agree with the <b>latter</b>.</html>",
			"<html><font size=6>3. CANDID: Please be <b>candid</b>.</html>",
			"<html><font size=6>4. TUMMY: Look at my <b>tummy</b>.</html>",
			"<html><font size=6>5. QUIZ: We made a <b>quiz</b>.</html>.",
			"<html><font size=6>6. INPUT: We need more <b>input</b>.</html>",
			"<html><font size=6>7. CRAB: Do you like <b>crabs?</b></html>",
			"<html><font size=6>8. VOCABULARY: You will need more <b>vocabulary</b>.</html>",
			"<html><font size=6>9. REMEDY: We found a good <b>remedy</b>.</html>",
			"<html><font size=6>10. ALLEGE: They <b>alleged</b> it.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("claimed it without proof");
		questions.add("stole the ideas for it from someone else");
		questions.add("provided facts to prove it");
		questions.add("argued against the facts that supported it");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("way to fix a problem");
		questions.add("place to eat in public");
		questions.add("way to prepare food");
		questions.add("rule about numbers");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("words");
		questions.add("skill");
		questions.add("money");
		questions.add("guns");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("sea creatures that walk sideways");
		questions.add("very thin small cakes");
		questions.add("tight, hard collars");
		questions.add("large black insects that sing at night");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("information, power, etc. put into something");
		questions.add("workers");
		questions.add("artificial filling for a whole in wood");
		questions.add("money");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("thing to hold arrows");
		questions.add("serious mistake");
		questions.add("set of questions");
		questions.add("box for birds to make nests in");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("cloth to cover the head");
		questions.add("stomach");
		questions.add("small furry animal");
		questions.add("thumb");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("be careful");
		questions.add("show sympathy");
		questions.add("show fairness to both sides");
		questions.add("say what you really think");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("man from the church");
		questions.add("reason given");
		questions.add("last one");
		questions.add("answer");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("agreement");
		questions.add("thing made of two or more parts");
		questions.add("group of people forming a business");
		questions.add("guess based on past experience");

		return questions;
	}
}
