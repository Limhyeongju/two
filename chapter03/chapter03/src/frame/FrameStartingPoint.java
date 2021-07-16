package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameStartingPoint extends JPanel{

	public void StartingPoint() {
		String str="솔데스크 주소 : 서울특별시 종로구 관철동 13-13 "
                + "\n 솔데스크 전화번호 : +82269017001"
                + "\n 버스기사 : 최규리";
		
		Frame f=new Frame("출발지정보");//프레임의 제목
		f.setLayout(null);
		f.setBounds(800,100,600,800); //(x좌표, y좌표, 너비, 높이)
		f.setBackground(Color.yellow);//배경색
		f.setVisible(true); //false는 화면에 보이지 않음
		
		ImageIcon c = new ImageIcon("솔데스크약도2.jpg");
		JLabel l = new JLabel(c);
		l.setBounds(50, 0, 500, 700);
		f.add(l);
		f.setVisible(true);
		
		JPanel bottomSet = new JPanel();

		   bottomSet.setBounds(0, 660, 600, 100);
		   bottomSet.setBackground(Color.yellow);
		   bottomSet.setLayout(null);
		
		
		JButton btnReview = new JButton("정보");
		   
		   btnReview.setSize(183, 87);
		   btnReview.setLocation(15, 0);
		   btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   bottomSet.add(btnReview);
		  
		
		btnReview.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(btnReview, str);				
			}
		});
		JButton btnHome = new JButton("예매확인");

		   
		   btnHome.setSize(183, 87);
		   btnHome.setLocation(208, 0);
		   btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   bottomSet.add(btnHome);
		   btnHome.setVisible(true);
		
		
		JButton btnBuy = new JButton("리뷰보기");

		   
		   btnBuy.setSize(183, 87);
		   btnBuy.setLocation(401, 0);
		   btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		   bottomSet.add(btnBuy);
		   btnBuy.setVisible(true);
		
		
		   f.add(bottomSet);
		   bottomSet.setVisible(true);
		   
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	
	}//stp
}//class
