package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat26 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "home", "national", "regular", "smooth", "animal", "movement", "policy", "speed" }; // �洢ѡ��

	String questionString = "26. domestic"; // ���ڴ洢����
	String questionNumber = "w26"; // ���ڴ洢��� w ��������vst

	public Wat26() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}