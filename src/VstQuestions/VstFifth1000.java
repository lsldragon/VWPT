package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstFifth1000 extends JPanel {

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

	public VstFifth1000() throws IOException {

		JButton button = new JButton("Level5");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "41");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "42");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "43");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "44");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "45");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "46");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "47");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "48");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "49");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "50");

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

	String questionStrings[] = { "<html><font size=6>1. DEFICIT: The company had a large <b>deficit</b>.</html>",
			"<html><font size=6>2. WEEP: He <b>wept</b>.</html>",
			"<html><font size=6>3. NUN: We saw a <b>nun</b>.</html>",
			"<html><font size=6>4. HAUNT: The house is <b>haunted</b>.</html>",
			"<html><font size=6>5. COMPOST: We need some <b>compost</b>.</html>.",
			"<html><font size=6>6. CUBE: I need one more <b>cube</b>.</html>",
			"<html><font size=6>7. MINIATURE: It is a <b>miniature</b>.</html>",
			"<html><font size=6>8. PEEL: Shall I <b>peel</b> it?</html>",
			"<html><font size=6>9. FRACTURE: They found a <b>fracture</b>.</html>",
			"<html><font size=6>10. BACTERIUM: They didn't find a single <b>bacterium</b> in it.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("small living thing causing disease");
		questions.add("plant with red or orange flowers");
		questions.add("animal that carries water on its back");
		questions.add("thing that has been stolen and sold to a shop");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("break");
		questions.add("small piece");
		questions.add("short coat");
		questions.add("rare jewel");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("let it sit in water for a long time");
		questions.add("take the skin off it");
		questions.add("make it white");
		questions.add("cut it into thin pieces");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("a very small thing of its kind");
		questions.add("an instrument to look at small objects");
		questions.add("a very small living creature");
		questions.add("a small line to join letters in handwriting");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("sharp thing used for joining things");
		questions.add("solid square block");
		questions.add("tall cup with no saucer");
		questions.add("piece of stiff paper folded in half");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("strong support");
		questions.add("help to feel better");
		questions.add("hard stuff made of stones and sand stuck together");
		questions.add("rotted plant material");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("full of ornaments");
		questions.add("rented");
		questions.add("empty");
		questions.add("full of ghosts");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("long thin creature that lives in the earth");
		questions.add("terrible accident");
		questions.add("woman following a strict religious life");
		questions.add("unexplained bright light in the sky");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("finished his course");
		questions.add("cried");
		questions.add("died");
		questions.add("worried");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("spent more money than it earned");
		questions.add("went down in value");
		questions.add("had a plan for spending that used a lot of money");
		questions.add("had a lot of money in the bank");

		return questions;
	}
}
