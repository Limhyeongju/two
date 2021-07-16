package frame;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMenuf extends JPanel{
	
	public FrameMenuf() {
		setBackground(new Color(255, 241, 54));
		setLayout(null);
		setSize(600, 800);
		
			//하단 버튼 세팅
			JPanel bottomSet = new JPanel();
			bottomSet.setBounds(0, 660, 600, 100);
			bottomSet.setBackground(Color.yellow);
			bottomSet.setLayout(null);
			
			JButton btnBook = new JButton("예매하기");
			btnBook.setSize(183, 87);
			btnBook.setLocation(15, 0);
			btnBook.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
			btnBook.setVisible(true);
			bottomSet.add(btnBook);
	   
			JButton btnCheck = new JButton("예매확인");
			btnCheck.setSize(183, 87);
			btnCheck.setLocation(208, 0);
			btnCheck.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
			bottomSet.add(btnCheck);
			btnCheck.setVisible(true);
	   
			JButton btnSol = new JButton("출발지정보");
			btnSol.setSize(183, 87);
			btnSol.setLocation(401, 0);
			btnSol.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
			bottomSet.add(btnSol);
			btnSol.setVisible(true);
	
			add(bottomSet);

		TextArea story = new TextArea("                           버스 예매시 주의사항\n\n"+
				"1.한번 예매한 좌석은 변경과 환불이 어려울수 있습니다.\n\n"+"2.버스기사에게 대들시 소지하신 귤을 뺏길수 있습니다.\n\n"
				+ "3.본 버스는 휴게소 이용이 불가능합니다.\n\n" +"4.본 버스의 승차비용은 오직 귤로만 결제할수있습니다.\n\n"
				+"5.버스에서 음주와 흡연적발시 경고없이 추방조치합니다.\n\n"+"6.버스안에서의 과도한 수면은 목적지 도착이 어려워질수 있습니다.\n\n"
				+ "7.버스에서 기물파손시 솔데스크측에서 배상을 요구할수있습니다.\n\n"+"8.기사님에게 주는 사랑은 목적지 도착이 빨라질수 있습니다.\n\n" 
				+"9.자세한 사항은 개발팀에게 물어봐도 알려주지 않습니다."
   	 	);
	
		story.setBounds(25, 40, 555, 600);
		story.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		add(story);
   
		btnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelectf());
			}
		});
   		
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMyPage());
			}
		});
		
		btnSol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			FrameStartingPoint t=new FrameStartingPoint();
			t.StartingPoint();
			}
		});
   
	}

}


	
	


		
