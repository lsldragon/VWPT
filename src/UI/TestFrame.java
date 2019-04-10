package UI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import VstQuestions.VstEighth1000;
import VstQuestions.VstEleventh1000;
import VstQuestions.VstFifth1000;
import VstQuestions.VstFirst1000;
import VstQuestions.VstForth1000;
import VstQuestions.VstNinth1000;
import VstQuestions.VstSecond1000;
import VstQuestions.VstSeventh1000;
import VstQuestions.VstSixth1000;
import VstQuestions.VstTenth1000;
import VstQuestions.VstThird1000;
import WatQuestions.Wat1;
import WatQuestions.Wat10;
import WatQuestions.Wat11;
import WatQuestions.Wat12;
import WatQuestions.Wat13;
import WatQuestions.Wat14;
import WatQuestions.Wat15;
import WatQuestions.Wat16;
import WatQuestions.Wat17;
import WatQuestions.Wat18;
import WatQuestions.Wat19;
import WatQuestions.Wat2;
import WatQuestions.Wat20;
import WatQuestions.Wat21;
import WatQuestions.Wat22;
import WatQuestions.Wat23;
import WatQuestions.Wat24;
import WatQuestions.Wat25;
import WatQuestions.Wat26;
import WatQuestions.Wat27;
import WatQuestions.Wat28;
import WatQuestions.Wat29;
import WatQuestions.Wat3;
import WatQuestions.Wat30;
import WatQuestions.Wat31;
import WatQuestions.Wat32;
import WatQuestions.Wat33;
import WatQuestions.Wat34;
import WatQuestions.Wat35;
import WatQuestions.Wat36;
import WatQuestions.Wat37;
import WatQuestions.Wat38;
import WatQuestions.Wat39;
import WatQuestions.Wat4;
import WatQuestions.Wat40;
import WatQuestions.Wat5;
import WatQuestions.Wat6;
import WatQuestions.Wat7;
import WatQuestions.Wat8;
import WatQuestions.Wat9;
//import xdman.ui.laf.XDMProgressBarUI;

public class TestFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton nextButton = null;
	JPanel headPanel = null;
	CardLayout cardLayout = null; // for head panel

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension screenSizeDimension = toolkit.getScreenSize();

	private int progressValue = 0;

	private JProgressBar progressBar;

	File file = null;

	FileWriter fileWriter = null;
	BufferedWriter bufferedWriter = null;

	int i = 0; // 记录时间 t 的下标

	public TestFrame() throws IOException {

		cardLayout = new CardLayout();
		headPanel = new JPanel(cardLayout);

		file = new File(UIConstants.FILE_NAME_AND_PATH);
		fileWriter = new FileWriter(file, true);
		bufferedWriter = new BufferedWriter(fileWriter);

		add(creatNorthButtons(), BorderLayout.NORTH);
		add(creatNextButton(), BorderLayout.EAST);
		add(creatCenterPanel(), BorderLayout.CENTER);

		setTitle("Test");
		setUndecorated(true); // 禁用标题框
		setPreferredSize(screenSizeDimension);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// test panel center
	private JScrollPane creatCenterPanel() throws IOException {

		JScrollPane scrollPane = new JScrollPane(headPanel);

		VstFirst1000 vstFirst1000 = new VstFirst1000();
		VstSecond1000 vstSecond1000 = new VstSecond1000();
		VstThird1000 vstThird1000 = new VstThird1000();
		VstForth1000 vstForth1000 = new VstForth1000();
		VstFifth1000 vstFifth1000 = new VstFifth1000();
		VstSixth1000 vstSixth1000 = new VstSixth1000();
		VstSeventh1000 vstSeventh1000 = new VstSeventh1000();
		VstEighth1000 vstEighth1000 = new VstEighth1000();
		VstNinth1000 vstNinth1000 = new VstNinth1000();
		VstTenth1000 vstTenth1000 = new VstTenth1000();
		VstEleventh1000 vstEleventh1000 = new VstEleventh1000();

		Wat1 wat1 = new Wat1();
		Wat2 wat2 = new Wat2();
		Wat3 wat3 = new Wat3();
		Wat4 wat4 = new Wat4();
		Wat5 wat5 = new Wat5();
		Wat6 wat6 = new Wat6();
		Wat7 wat7 = new Wat7();
		Wat8 wat8 = new Wat8();
		Wat9 wat9 = new Wat9();
		Wat10 wat10 = new Wat10();
		Wat11 wat11 = new Wat11();
		Wat12 wat12 = new Wat12();
		Wat13 wat13 = new Wat13();
		Wat14 wat14 = new Wat14();
		Wat15 wat15 = new Wat15();
		Wat16 wat16 = new Wat16();
		Wat17 wat17 = new Wat17();
		Wat18 wat18 = new Wat18();
		Wat19 wat19 = new Wat19();
		Wat20 wat20 = new Wat20();
		Wat21 wat21 = new Wat21();
		Wat22 wat22 = new Wat22();
		Wat23 wat23 = new Wat23();
		Wat24 wat24 = new Wat24();
		Wat25 wat25 = new Wat25();
		Wat26 wat26 = new Wat26();
		Wat27 wat27 = new Wat27();
		Wat28 wat28 = new Wat28();
		Wat29 wat29 = new Wat29();
		Wat30 wat30 = new Wat30();
		Wat31 wat31 = new Wat31();
		Wat32 wat32 = new Wat32();
		Wat33 wat33 = new Wat33();
		Wat34 wat34 = new Wat34();
		Wat35 wat35 = new Wat35();
		Wat36 wat36 = new Wat36();
		Wat37 wat37 = new Wat37();
		Wat38 wat38 = new Wat38();
		Wat39 wat39 = new Wat39();
		Wat40 wat40 = new Wat40();

		headPanel.add(vstFirst1000); // 添加 vst 试题 first 1000
		headPanel.add(vstSecond1000);
		headPanel.add(vstThird1000);
		headPanel.add(vstForth1000);
		headPanel.add(vstFifth1000);
		headPanel.add(vstSixth1000);
		headPanel.add(vstSeventh1000);
		headPanel.add(vstEighth1000);
		headPanel.add(vstNinth1000);
		headPanel.add(vstTenth1000);
		headPanel.add(vstEleventh1000);

		headPanel.add(wat1, "wat1"); // 添加 wat 试题
		headPanel.add(wat2, "wat2");
		headPanel.add(wat3, "wat3");
		headPanel.add(wat4, "wat4");
		headPanel.add(wat5, "wat5");
		headPanel.add(wat6, "wat6");
		headPanel.add(wat7, "wat7");
		headPanel.add(wat8, "wat8");
		headPanel.add(wat9, "wat9");
		headPanel.add(wat10, "wat10");
		headPanel.add(wat11, "wat11");
		headPanel.add(wat12, "wat12");
		headPanel.add(wat13, "wat13");
		headPanel.add(wat14, "wat14");
		headPanel.add(wat15, "wat15");
		headPanel.add(wat16, "wat16");
		headPanel.add(wat17, "wat17");
		headPanel.add(wat18, "wat18");
		headPanel.add(wat19, "wat19");
		headPanel.add(wat20, "wat20");
		headPanel.add(wat21, "wat21");
		headPanel.add(wat22, "wat22");
		headPanel.add(wat23, "wat23");
		headPanel.add(wat24, "wat24");
		headPanel.add(wat25, "wat25");
		headPanel.add(wat26, "wat26");
		headPanel.add(wat27, "wat27");
		headPanel.add(wat28, "wat28");
		headPanel.add(wat29, "wat29");
		headPanel.add(wat30, "wat30");
		headPanel.add(wat31, "wat31");
		headPanel.add(wat32, "wat32");
		headPanel.add(wat33, "wat33");
		headPanel.add(wat34, "wat34");
		headPanel.add(wat35, "wat35");
		headPanel.add(wat36, "wat36");
		headPanel.add(wat37, "wat37");
		headPanel.add(wat38, "wat38");
		headPanel.add(wat39, "wat39");
		headPanel.add(wat40, "wat40");

		headPanel.add(new EndTest(), "end");
		return scrollPane;
	}

	// north buttons
	private JPanel creatNorthButtons() {

		JPanel panel = new JPanel();
		progressBar = new JProgressBar();
		progressBar.setPreferredSize(new Dimension(screenSizeDimension.width, 25));
		progressBar.setFont(UIConstants.PROGRESS_FONT);
		progressBar.setStringPainted(true);

		progressBar.setMaximum(UIConstants.PROGRESSBAR_LIMIT); // 题数-1
		progressBar.setValue(progressValue);

		panel.add(progressBar);

		return panel;

	}

	// next Button
	private JButton creatNextButton() {

		nextButton = new JButton("<html>下<br>一<br>题</html>");
		nextButton.setFont(new Font("KaiTi", Font.PLAIN, 18));
		nextButton.setToolTipText(UIConstants.NEXT_STRING);
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;

				cardLayout.next(headPanel);

				progressValue = progressValue + 1;
				progressBar.setValue(progressValue);
				Watch.splitTimer();
				System.out.println("t" + intToString(i) + "=" + Watch.getSplitTime());
				writeFile("t" + intToString(i) + "=" + doubleToString(Watch.getSplitTime()));

				if (progressValue == UIConstants.QUESTION_NUMBER) { // 题数
					Watch.stopTimer();
					Watch.resetTimer();
					nextButton.setEnabled(false);
					System.out.println("Total Time=" + Watch.getEndTime());
					writeFile("Total Time=" + doubleToString(Watch.getEndTime()));
				}

			}
		});

		return nextButton;
	}

	protected void writeFile(String string) {

		try {
			bufferedWriter.write(string + "\r\n");
			bufferedWriter.flush();
//			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// int to string
	private String intToString(int value) {

		String string = String.valueOf(value);
		return string;
	}

	// double to string
	private String doubleToString(double value) {

		String string = String.valueOf(value);
		return string;
	}
}
