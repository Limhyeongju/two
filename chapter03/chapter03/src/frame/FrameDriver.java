package frame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameDriver extends JPanel{
	
	public void FrameDriver2() {
		
		ImageIcon img = new ImageIcon("teach_cgr.png");
		JLabel jI = new JLabel(img);
		jI.setSize(100,150);

		TextArea driver = new TextArea("버스기사 정보 확인하기" + "\n\n" 
				+"\n◎ 기사님 성함 : 최규리" + "\n\n"
				+"\n◎ 운전 경력 : N년" + "\n\n"
				+"\n◎ 수상이력 : 2021 취업률 100% 달성"+"\n\n",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		Frame f = new Frame();
		f.setTitle("Driver Information");
		f.setSize(600,400);
		f.setLocation(700,400);
		f.setLayout(new GridLayout(1,2));
		f.add(jI);
		f.add(driver);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f.setVisible(false);
				f.dispose();
			}
		});
			
	}
}