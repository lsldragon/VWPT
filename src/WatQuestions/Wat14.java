package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat14 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "crowded", "hot", "noisy", "thick", "forest", "handle", "smoke", "weather" }; // �洢ѡ��

	String questionString = "14. dense"; // ���ڴ洢����
	String questionNumber = "w14"; // ���ڴ洢��� w ��������vst

	public Wat14() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
