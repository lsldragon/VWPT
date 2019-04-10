package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstEleventh1000 extends JPanel {

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

	public VstEleventh1000() throws IOException {

		JButton button = new JButton("Level11");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "101");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "102");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "103");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "104");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "105");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "106");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "107");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "108");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "109");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "110");

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

	String questionStrings[] = { "<html><font size=6>1. EXCRETE: This was <b>excreted</b> recently.</html>",
			"<html><font size=6>2. MUSSEL: They bought <b>mussels</b>.</html>",
			"<html><font size=6>3. YOGA: She has started <b>yoga</b>.</html>",
			"<html><font size=6>4. COUNTERCLAIM: They made a <b>counterclaim</b>.</html>",
			"<html><font size=6>5. PUMA: They saw a <b>puma</b>.</html>.",
			"<html><font size=6>6. PALLOR: His <b>pallor</b> caused them concern.</html>",
			"<html><font size=6>7. APERITIF: She had an <b>aperitif</b>.</html>",
			"<html><font size=6>8. HUTCH: Please clean the <b>hutch</b>.</html>",
			"<html><font size=6>9. EMIR: We saw the <b>emir</b>.</html>",
			"<html><font size=6>10. HESSIAN: She bought some <b>hessian</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("oily pinkish fish");
		questions.add("stuff producing a happy state of mind");
		questions.add("coarse cloth");
		questions.add("strong-tasting root for flavouring food");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("bird with long curved tail feathers");
		questions.add("woman who cares for other people's children in Eastern countries");
		questions.add("Middle Eastern chief with power in his land");
		questions.add("house made of blocks of ice");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("thing with metal bars to keep dirt out of water pipes");
		questions.add("space in the back of a car for bags");
		questions.add("metal piece in middle of a bicycle wheel");
		questions.add("cage for small animals");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("a long chair for lying on with just one place to rest an arm");
		questions.add("a private singing teacher");
		questions.add("a large hat with tall feathers");
		questions.add("a drink taken before a meal");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("his unusually high temperature");
		questions.add("his lack of interest in anything");
		questions.add("his group of friends");
		questions.add("the paleness of his skin");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("small house made of mud bricks");
		questions.add("tree from hot, dry countries");
		questions.add("strong wind that sucks up objects");
		questions.add("large wild cat");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("a demand made by one side in a law case to match the other side's demand");
		questions.add("a request for a shop to take back things with faults");
		questions.add("an agreement between companies to exchange work");
		questions.add("a top cover for a bed");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("handwork done by knotting thread");
		questions.add("a form of exercise for body and mind");
		questions.add("a game where a cork stuck with feathers is hit between two players");
		questions.add("a type of dance from eastern countries");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("small glass balls for playing a game");
		questions.add("shellfish");
		questions.add("large purple fruits");
		questions.add("pieces of soft paper to keep clothes clean when eating");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("pushed or sent out");
		questions.add("made clear");
		questions.add("discovered by a science experiment");
		questions.add("put on a list of illegal things");

		return questions;
	}
}
