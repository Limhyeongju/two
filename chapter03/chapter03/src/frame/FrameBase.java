package frame;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame {
	private static FrameBase instance;
	
	public FrameBase(JPanel e) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		setTitle("KYURIVERSE");
		setLayout(null); // 자동조정방지
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 800);
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//생성자
	public static void getInstance(JPanel e) {
		instance = new FrameBase(e);
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		instance.revalidate();
		instance.repaint();
	}//getInstance()
	
}
