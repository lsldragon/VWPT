package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat25 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clever", "fair", "rough", "valuable", "behaviour", "drawing", "oil", "trade" }; // �洢ѡ��

	String questionString = "25. crude"; // ���ڴ洢����
	String questionNumber = "w25"; // ���ڴ洢��� w ��������vst

	public Wat25() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
