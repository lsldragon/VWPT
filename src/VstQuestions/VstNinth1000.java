package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstNinth1000 extends JPanel {

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

	public VstNinth1000() throws IOException {

		JButton button = new JButton("Level9");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "81");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "82");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "83");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "84");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "85");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "86");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "87");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "88");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "89");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "90");

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

	String questionStrings[] = { "<html><font size=6>1. HALLMARK: Does it have a <b>hallmark</b>?</html>",
			"<html><font size=6>2. PURITAN: He is a <b>puritan</b>.</html>",
			"<html><font size=6>3. MONOLOGUE: Now he has a <b>monologue</b>.</html>",
			"<html><font size=6>4. WEIR: We looked at the <b>weir</b>.</html>",
			"<html><font size=6>5. WHIM: He had lots of <b>whims</b>.</html>.",
			"<html><font size=6>6. PERTURB: I was <b>perturbed</b>.</html>",
			"<html><font size=6>7. REGENT: They chose a <b>regent</b>.</html>",
			"<html><font size=6>8. OCTOPUS: They saw an <b>octopus</b>.</html>",
			"<html><font size=6>9. FEN: The story is set in the <b>fens</b>.</html>",
			"<html><font size=6>10. LINTEL: He painted the <b>lintel</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("beam over the top of a door or window");
		questions.add("small boat used for getting to land from a big boat");
		questions.add("beautiful tree with spreading branches and green fruit");
		questions.add("board showing the scene in a theatre");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("low land partly covered by water");
		questions.add("a piece of high land with few trees");
		questions.add("a block of poor quality houses in a city");
		questions.add("a time long ago");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("a large bird that hunts at night");
		questions.add("a ship that can go under water");
		questions.add("a machine that flies by means of turning blades");
		questions.add("a sea creature with eight legs");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("an irresponsible person");
		questions.add("a person to run a meeting for a time");
		questions.add("a ruler acting in place of the king");
		questions.add("a person to represent them");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("made to agree");
		questions.add("worried");
		questions.add("very puzzled");
		questions.add("very wet");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("old gold coins");
		questions.add("female horses");
		questions.add("strange ideas with no motive");
		questions.add("sore red lumps");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("person who behaves strangely");
		questions.add("wet, muddy place with water plants");
		questions.add("old metal musical instrument played by blowing");
		questions.add("thing built across a river to control the water");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("single piece of glass to hold over his eye to help him see better");
		questions.add("long turn at talking without being interrrupted");
		questions.add("position with all the power");
		questions.add("picture made by joining letters together in interesting ways");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("person who likes attention");
		questions.add("person with strict morals");
		questions.add("person with a moving home");
		questions.add("person who hates spending money");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("stamp to show when to use it by");
		questions.add("stamp to show the quality");
		questions.add("mark to show it is approved by the royal family");
		questions.add("mark or stain to prevent copying");

		return questions;
	}
}
