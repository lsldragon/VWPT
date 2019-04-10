package UI;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class UIConstants {

	public static final Font BUTTON_FONT = new Font("KaiTi", Font.BOLD, 25); // 25
	public static final Font VLABEL_FONT = new Font("Consolas", Font.PLAIN, 20); // 25
	public static final Font RADIO_FONT = new Font("Consolas", Font.PLAIN, 20); // 23
	public static final Font PROGRESS_FONT = new Font("Consolas", Font.PLAIN, 20); // 20
	public static final Font CHECKBOX_FONT = new Font("Consolas", Font.PLAIN, 25); // 25
	public static final Font LABEL_FONT = new Font("Consolas", Font.BOLD, 25); // 25

	public static final String OPTION_STRING = "<html><font color=red size=6><B>测试开始后，中途不能停止！</B><html>" + "\r\n"
			+ "<html><font color=blue size=6>本测试分为VST和WAT测试两个部分，其中VST测试共计11道大题(每题10小题),WAT测试共计40题</html> " + "\r\n"
			+ "<html><font color=blue size=6>点击确认即可开始答题</html>" + "\r\n"
			+ "<html><font color=#A52A2A size=6><b>答题结束后,请将桌面的RESULTS文件发送至QQ:1178362914或email: lsldragon@outlook.com</b></html>"
			+ "\r\n" + "<html><font color=#A52A2A size=6><b>谢谢大家！</b></html>";

	public static final String ABOUT_THIS = "<html><font size=6>为了顺利完成双学位的毕业论文，开发了这个测试软件。以下为该软件的相关信息：</html>" + "\r\n"
			+ "<html><font size=5>0. 做这个软件的目的在于目前的VST和WAT测试中并未考虑时间这一因素，所以本软件可记录做题的时间.</html>" + "\r\n"
			+ "<html><font size=5>1. 本软件基于Java语言开发，开发工具为eclipse.</html>" + "\r\n"
			+ "<html><font size=5>2. 本软件为开源软件，如需二次开发请到 GitHub搜索 VWPT.</html>" + "\r\n"
			+ "<html><font size=5>3. 时间原因，代码并没有经过充分优化，参考性并不大，不过提供了解决问题的一种思路.</html>" + "\r\n"
			+ "<html><font size=5>4. 感谢毕业论文指导教师<font color=red><b><u>段士平老师</u></b></>的指导、软件图标的佚名作者、帮助我参与测试的朋友们以及apache-commons-lang3-3.8.1</html>"+ "\r\n"
			+ "<html><font size=5>6. 任何Bug或者建议请反馈至 <font color=#FF1493>QQ:1178362914 email: lsldragon@outlook.com</> </html>";

	public static final String NEXT_STRING = "<html><font size=5 color=red>注<br>意<br>不<br>能<br>回<br>退<br>题<br>目</html>";
	public static final String APP_NAME = "VWPT";

	public static final String THANK_STRING = "<html><font size=6><B>感谢同学们参与测试！点击下方按钮即可退出程序</B><html>";

	public final static Image MAIN_WINDOW_ICON = Toolkit.getDefaultToolkit()
			.getImage(TestFrame.class.getResource("test.png"));

	// 用户桌面文件夹
	public static final String DESKTOPDIR = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();

	// 文件路径
	public static final String FILE_NAME_AND_PATH = DESKTOPDIR + File.separator + "RESULTS";

	public static final int QUESTION_NUMBER = 51; // 11+40
	public static final int PROGRESSBAR_LIMIT = QUESTION_NUMBER - 1;

}
