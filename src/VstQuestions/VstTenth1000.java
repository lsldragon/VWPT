package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstTenth1000 extends JPanel {

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

	public VstTenth1000() throws IOException {

		JButton button = new JButton("Level10");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "91");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "92");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "93");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "94");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "95");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "96");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "97");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "98");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "99");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "100");

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

	String questionStrings[] = { "<html><font size=6>1. AWE: They looked at the mountain with <b>awe</b>.</html>",
			"<html><font size=6>2. PEASANTRY: He did a lot for the <b>peasantry</b>.</html>",
			"<html><font size=6>3. EGALITARIAN: This organization is <b>egalitarian</b>.</html>",
			"<html><font size=6>4. MYSTIQUE: He has lost his <b>mystique</b>.</html>",
			"<html><font size=6>5. UPBEAT: I'm feeling really <b>upbeat</b> about it.</html>.",
			"<html><font size=6>6. CRANNY: We found it in the <b>cranny</b>!</html>",
			"<html><font size=6>7. PIGTAIL: Does she have a <b>pigtail</b>?</html>",
			"<html><font size=6>8. CROWBAR: He used a <b>crowbar</b>.</html>",
			"<html><font size=6>9. RUCK: He got hurt in the <b>ruck</b>.</html>",
			"<html><font size=6>10. LECTERN: He stood at the <b>lectern</b>.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("desk to hold a book at a height for reading");
		questions.add("table or block used for church sacrifices");
		questions.add("place where you buy drinks");
		questions.add("very edge");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("hollow between the stomach and the top of the leg");
		questions.add("pushing and shoving");
		questions.add("group of players gathered round the ball in some ball games");
		questions.add("race across a field of snow");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("heavy iron pole with a curved end");
		questions.add("false name");
		questions.add("sharp tool for making holes in leather");
		questions.add("light metal walking stick");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("a rope of hair made by twisting bits together");
		questions.add("a lot of cloth hanging behind a dress");
		questions.add("a plant with pale pink flowers that hang down in bunches");
		questions.add("a lover");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("sale of unwanted objects");
		questions.add("narrow opening");
		questions.add("space to store things under the roof");
		questions.add("large wooden box");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("upset");
		questions.add("good");
		questions.add("hurt");
		questions.add("confused");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("his healthy body");
		questions.add("the secret way he makes other people think he has special power or skill");
		questions.add("the woman who has been his lover while he is married to someone else");
		questions.add("the hair on his top lip");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("does not provide much information to the public");
		questions.add("dislikes change");
		questions.add("frequently asks a court of law for a judgment");
		questions.add("treats everyone who works for it as if they are equal");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("local people");
		questions.add("place of worship");
		questions.add("businessmen's club");
		questions.add("poor farmers");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("worry");
		questions.add("interest");
		questions.add("wonder");
		questions.add("respect");

		return questions;
	}
}
