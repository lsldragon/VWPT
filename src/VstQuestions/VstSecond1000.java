package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstSecond1000 extends JPanel {

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

	public VstSecond1000() throws IOException {
		
		JButton button = new JButton("Level2");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "11");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "12");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "13");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "14");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "15");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "16");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "17");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "18");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "19");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "20");

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

	String questionStrings[] = { "<html>1. MAINTAIN: Can they <b>maintain</b> it?</html>",
			"<html>2. STONE: They sat on a <b>stone.</b></html>",
			"<html>3. UPSET: I am <b>upset.</b></html>",
			"<html>4. DRAWER: The <b>drawer</b> was empty.</html>",
			"<html>5. PATIENCE: He has no <b>patience.</b></html>.",
			"<html>6. NIL: His mark for that question was <b>nil.</b></html>",
			"<html>7. PUB: They went to the <b>pub.</b></html>",
			"<html>8. CIRCLE: Make a <b>circle.</b></html>",
			"<html>9. MICROPHONE: Please use the <b>microphone.</b></html>",
			"<html>10. PRO: He's a <b>pro.</b></html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("someone who is employed to find out important secrets");
		questions.add("a stupid person");
		questions.add("someone who writes for a newspaper");
		questions.add("someone who is paid for playing a sport, etc.");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("machine for making food hot");
		questions.add("machine that makes sounds louder");
		questions.add("machine that makes things look bigger");
		questions.add("small telephone that can be carried around");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("rough picture");
		questions.add("space with nothing in it");
		questions.add("round shape");
		questions.add("large hole");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("place where people drink and talk");
		questions.add("place that looks after money");
		questions.add("cupboard to keep things cold");
		questions.add("animal house");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("very bad");
		questions.add("nothing");
		questions.add("very good");
		questions.add("in the middle");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("will not wait happily");
		questions.add("has no free time");
		questions.add("has no faith");
		questions.add("does not know what is fair");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("sliding box");
		questions.add("place where cars are kept");
		questions.add("cupboard to keep things cold");
		questions.add("animal house");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("tired");
		questions.add("famous");
		questions.add("rich");
		questions.add("unhappy");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("hard thing");
		questions.add("kind of chair");
		questions.add("soft thing on the floor");
		questions.add("part of a tree");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("keep it as it is");
		questions.add("make it larger");
		questions.add("get a better one than ");
		questions.add("get it");

		return questions;
	}
}
