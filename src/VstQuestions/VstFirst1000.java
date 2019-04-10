package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstFirst1000 extends JPanel {

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

	public VstFirst1000() throws IOException {

		JButton button = new JButton("Level1");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "1");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "2");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "3");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "4");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "5");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "6");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "7");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "8");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "9");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "10");

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

	String questionStrings[] = { "<html>1. SEE: They<b> saw </b>it.</html>",
			"<html>2. TIME: They have a lot of <b> time.</b></html>",
			"<html>3. PERIOD: It was a difficult <b>period.</b></html>",
			"<html>4. FIGURE: Is this the right <b>figure?</b></html>",
			"<html>5. POOR: We are <b>poor</b></html>",
			"<html>6. DRIVE: He <b> drives </b>fast.</html>",
			"<html>7. JUMP: She tried to <b>jump.</b></html>",
			"<html>8. SHOE: Where is your <b>shoe</b>?</html>",
			"<html>9. STANDARD: Her <b>standards</b> are very high.</html>",
			"<html>10. BASIS: This was used as the <b>basis.</b></html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("answer");
		questions.add("place to take a rest");
		questions.add("next step");
		questions.add("main part");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("the bits at the back under her shoes");
		questions.add("the marks she gets in school");
		questions.add("the money she asks for");
		questions.add("the levels she reaches in everything");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("the person who looks after you");
		questions.add("the thing you keep your money in");
		questions.add("the thing you use for writing");
		questions.add("the thing you wear on your foot");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("lie on top of the water");
		questions.add("get off the ground suddenly");
		questions.add("stop the car at the edge of the road");
		questions.add("move very fast");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("swims");
		questions.add("learns");
		questions.add("throws balls");
		questions.add("uses a car");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("have no money");
		questions.add("feel happy");
		questions.add("are very interested");
		questions.add("do not like to work hard");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("answer");
		questions.add("place");
		questions.add("time");
		questions.add("number");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("questions");
		questions.add("time");
		questions.add("thing to do");
		questions.add("book");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("money");
		questions.add("food");
		questions.add("hours");
		questions.add("friends");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("cut");
		questions.add("waited for");
		questions.add("looked at");
		questions.add("started");

		return questions;
	}
}
