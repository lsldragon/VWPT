package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat32 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "feeling", "interesting", "sharp", "thick", "clothes", "instrument", "skin", "topic" }; // �洢ѡ��

	String questionString = "32. sensitive"; // ���ڴ洢����
	String questionNumber = "w32"; // ���ڴ洢��� w ��������vst

	public Wat32() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}