package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat1 extends JPanel {


	private static final long serialVersionUID = 4483674763714811462L;

	JPanel watJPanel = null;

	String[] choices1 = { "enjoyable", "expensive", "free", "loud", "education", "face", "music", "weather" };  // �洢ѡ��

	String questionString = "1. beautiful"; // ���ڴ洢����
	String questionNumber = "w1"; // ���ڴ洢��� w ��������vst

	public Wat1() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
