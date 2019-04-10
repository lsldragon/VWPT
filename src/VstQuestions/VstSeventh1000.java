package VstQuestions;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

import UI.UIConstants;
import UI.VstQuestionsUI;

public class VstSeventh1000 extends JPanel {

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

	public VstSeventh1000() throws IOException {

		JButton button = new JButton("Level7");
		button.setFont(UIConstants.BUTTON_FONT);
		button.setEnabled(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);

		firstLevel1 = new VstQuestionsUI(getFirstQuestionList1(), "61");
		firstLevel2 = new VstQuestionsUI(getFitstQuestionList2(), "62");
		firstLevel3 = new VstQuestionsUI(getFitstQuestionList3(), "63");
		firstLevel4 = new VstQuestionsUI(getFitstQuestionList4(), "64");
		firstLevel5 = new VstQuestionsUI(getFitstQuestionList5(), "65");
		firstLevel6 = new VstQuestionsUI(getFitstQuestionList6(), "66");
		firstLevel7 = new VstQuestionsUI(getFitstQuestionList7(), "67");
		firstLevel8 = new VstQuestionsUI(getFitstQuestionList8(), "68");
		firstLevel9 = new VstQuestionsUI(getFitstQuestionList9(), "69");
		firstLevel10 = new VstQuestionsUI(getFitstQuestionList10(), "70");

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

	String questionStrings[] = { "<html><font size=6>1. OLIVE: We bought <b>olives</b>.</html>",
			"<html><font size=6>2. QUILT: They made a <b>quilt</b>.</html>",
			"<html><font size=6>3. STEALTH: We did it by <b>stealth</b>.</html>",
			"<html><font size=6>4. SHUDDER: The boy <b>shuddered</b>.</html>",
			"<html><font size=6>5. BRISTLE: The <b>bristles</b> are too hard.</html>.",
			"<html><font size=6>6. BLOC: They have joined this <b>bloc</b>.</html>",
			"<html><font size=6>7. DEMOGRAPHY: This book is about <b>demography</b>.</html>",
			"<html><font size=6>8. GIMMICK: That's a good <b>gimmick</b>.</html>",
			"<html><font size=6>9. AZALEA: This <b>azalea</b> is very pretty.</html>",
			"<html><font size=6>10. YOGHURT: This <b>yoghurt</b> is disgusting.</html>" };

	private ArrayList<String> getFitstQuestionList10() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[9]);
		questions.add("grey mud found at the bottom of rivers");
		questions.add("unhealthy, open sore");
		questions.add("thick, soured milk, often with sugar and flavouring");
		questions.add("large purple fruit with soft flesh");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList9() {
		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[8]);
		questions.add("small tree with many flowers growing in groups");
		questions.add("light material made from natural threads");
		questions.add("long piece of material worn by women in India");
		questions.add("sea shell shaped like a fan");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList8() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[7]);
		questions.add("thing for standing on to work high above the ground");
		questions.add("small thing with pockets to hold money");
		questions.add("attention-getting action or thing");
		questions.add("clever plan or trick");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList7() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[6]);
		questions.add("the study of patterns of land ");
		questions.add("the study of the use of pictures to show facts about numbers");
		questions.add("the study of the movement of water");
		questions.add("the study of population");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList6() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[5]);
		questions.add("musical group");
		questions.add("band of thieves");
		questions.add("small group of soldiers who are sent ahead of others");
		questions.add("group of countries sharing a purpose");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList5() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[4]);
		questions.add("questions");
		questions.add("short stiff hairs");
		questions.add("folding beds");
		questions.add("bottoms of the shoes");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList4() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[3]);
		questions.add("spoke with a low voice");
		questions.add("almost fell");
		questions.add("shook");
		questions.add("called out loudly");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList3() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[2]);
		questions.add("spending a large amount of money");
		questions.add("hurting someone so much that they agreed to their demands");
		questions.add("moving secretly with extreme care and quietness");
		questions.add("taking no notice of problems they met");

		return questions;
	}

	private ArrayList<String> getFitstQuestionList2() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[1]);
		questions.add("statement about who should get their property when they die");
		questions.add("firm agreement");
		questions.add("thick warm cover for a bed");
		questions.add("feather pen");

		return questions;
	}

	private ArrayList<String> getFirstQuestionList1() {

		ArrayList<String> questions = new ArrayList<String>();

		questions.add(questionStrings[0]);
		questions.add("oily fruit");
		questions.add("scented pink or white flowers");
		questions.add("men's clothes for swimming");
		questions.add("tools for digging up weeds");

		return questions;
	}
}
