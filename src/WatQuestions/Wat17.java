package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat17 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "cloudy", "loud", "nice", "secret", "colour", "knife", "place", "rock" }; // �洢ѡ��

	String questionString = "17. dull"; // ���ڴ洢����
	String questionNumber = "w17"; // ���ڴ洢��� w ��������vst

	public Wat17() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
