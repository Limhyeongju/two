package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import busVO.Bus;
import busVO.CompanyDAO;

public class FrameBusSelect extends JPanel {

	public FrameBusSelect() {

		// JPanel 구조
		setBackground(new Color(0xfad700));
		setLayout(null);
		setSize(600, 2000);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xAAD700));
		top.setLayout(null);
		top.setSize(600, 140);
		top.setLocation(0, 0);

		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700));
		center.setLayout(null);
		center.setSize(600, 480);
		center.setLocation(0, 140);

		// 출발지, 목적지
		TextField start = new TextField("솔데스크");
		start.setBounds(0, 0, 160, 50);
		start.setEditable(false);
		start.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		start.setLocation(70, 40);

		TextField dest = new TextField();

		dest.setBounds(0, 0, 160, 50);
		dest.setLocation(350, 40);
		dest.setFont(new Font("나눔고딕코딩", Font.BOLD, 19));

		add(start);
		add(dest);

		// 목적지 버튼
		ImageIcon icon1 = new ImageIcon("네이버.png");
		Image img1=icon1.getImage();
		Image chImg1=img1.getScaledInstance(160, 200, ABORT);
		ImageIcon iconN=new ImageIcon(chImg1);
		
		JButton btnIcon1 = new JButton(iconN);
		btnIcon1.setSize(160, 200);
		btnIcon1.setLocation(30, 170);
		btnIcon1.setText("네이버");
		btnIcon1.setBackground(new Color(0xFFD700));
		add(btnIcon1);

		ImageIcon icon2 = new ImageIcon("카카오.png");
		Image img2=icon2.getImage();
		Image chImg2=img2.getScaledInstance(160, 200, ABORT);
		ImageIcon iconK=new ImageIcon(chImg2);
		
		JButton btnIcon2 = new JButton(iconK);
		btnIcon2.setSize(160, 200);
		btnIcon2.setLocation(215, 170);
		btnIcon2.setText("카카오");
		btnIcon2.setBackground(new Color(0xFFD700));
		add(btnIcon2);

		ImageIcon icon3 = new ImageIcon("마소.png");
		Image img3=icon3.getImage();
		Image chImg3=img3.getScaledInstance(160, 200, ABORT);
		ImageIcon iconM=new ImageIcon(chImg3);
		
		JButton btnIcon3 = new JButton(iconM);
		btnIcon3.setSize(160, 200);
		btnIcon3.setLocation(400, 170);
		btnIcon3.setText("마이크로소프트");
		btnIcon3.setBackground(new Color(0xFFD700));
		add(btnIcon3);

		ImageIcon icon4 = new ImageIcon("애플.png");
		Image img4=icon4.getImage();
		Image chImg4=img4.getScaledInstance(160, 200, ABORT);
		ImageIcon iconA=new ImageIcon(chImg4);
		
		JButton btnIcon4 = new JButton(iconA);
		btnIcon4.setSize(160, 200);
		btnIcon4.setLocation(30, 395);
		btnIcon4.setText("애플");
		btnIcon4.setBackground(new Color(0xFFD700));
		add(btnIcon4);

		ImageIcon icon5 = new ImageIcon("IBM.png");
		Image img5=icon5.getImage();
		Image chImg5=img5.getScaledInstance(160, 200, ABORT);
		ImageIcon iconI=new ImageIcon(chImg5);
		
		JButton btnIcon5 = new JButton(iconI);
		btnIcon5.setSize(160, 200);
		btnIcon5.setLocation(215, 395);
		btnIcon5.setText("IBM");
		btnIcon5.setBackground(new Color(0xFFD700));
		add(btnIcon5);

		ImageIcon icon6 = new ImageIcon("구글.png");
		Image img6=icon6.getImage();
		Image chImg6=img6.getScaledInstance(160, 200, ABORT);
		ImageIcon iconG=new ImageIcon(chImg6);
		
		JButton btnIcon6 = new JButton(iconG);
		btnIcon6.setSize(160, 200);
		btnIcon6.setLocation(400, 395);
		btnIcon6.setText("구글");
		btnIcon6.setBackground(new Color(0xFFD700));
		add(btnIcon6);

		// 하단의 버튼 설정
		JButton btnPrev = new JButton("< PREV");
		JButton btnExit = new JButton("EXIT");
		JButton btnNext = new JButton("NEXT >");

		btnPrev.setBackground(new Color(183, 240, 117));
		btnPrev.setSize(200, 150);
		btnPrev.setLocation(0, 620);
		btnPrev.setFont(new Font("굴림", Font.BOLD, 26));

		btnExit.setBackground(new Color(183, 240, 117));
		btnExit.setSize(200, 150);
		btnExit.setLocation(196, 620);
		btnExit.setFont(new Font("굴림", Font.BOLD, 26));

		btnNext.setBackground(new Color(183, 240, 117));
		btnNext.setSize(200, 150);
		btnNext.setLocation(395, 620);
		btnNext.setFont(new Font("굴림", Font.BOLD, 26));

		add(btnPrev);
		add(btnExit);
		add(btnNext);

		add(top);
		add(center);

		top.setVisible(true);
		center.setVisible(true);

		// 목적지 버튼 이벤트
		btnIcon1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon1.getText());
				btnIcon1.setBackground(new Color(0xA38A00));
				
				Bus naver=new CompanyDAO().searchCompany("네이버");
				new FrameCompanyInfof(naver);
				
				if(btnIcon2.isBackgroundSet()) {
					btnIcon2.setBackground(new Color(0xFFD700));
				}
				
				if(btnIcon3.isBackgroundSet()) {
					btnIcon3.setBackground(new Color(0xFFD700));
				}
				
				if(btnIcon4.isBackgroundSet()) {
					btnIcon4.setBackground(new Color(0xFFD700));
				}
				
				if(btnIcon5.isBackgroundSet()) {
					btnIcon5.setBackground(new Color(0xFFD700));
				}
				if(btnIcon6.isBackgroundSet()) {
					btnIcon6.setBackground(new Color(0xFFD700));
				}
				
			}
		});

		btnIcon2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon2.getText());
				btnIcon2.setBackground(new Color(0xA38A00));
				
				Bus kakao=new CompanyDAO().searchCompany("카카오");
				new FrameCompanyInfof(kakao);
				
				if(btnIcon1.isBackgroundSet()) {
					btnIcon1.setBackground(new Color(0xFFD700));
				}
				if(btnIcon3.isBackgroundSet()) {
					btnIcon3.setBackground(new Color(0xFFD700));
				}
				if(btnIcon4.isBackgroundSet()) {
					btnIcon4.setBackground(new Color(0xFFD700));
				}
				if(btnIcon5.isBackgroundSet()) {
					btnIcon5.setBackground(new Color(0xFFD700));
				}
				if(btnIcon6.isBackgroundSet()) {
					btnIcon6.setBackground(new Color(0xFFD700));
				}
				
			}
		});

		btnIcon3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon3.getText());
				btnIcon3.setBackground(new Color(0xA38A00));
				
				Bus ms=new CompanyDAO().searchCompany("마이크로소프트");
				new FrameCompanyInfof(ms);
				
				if(btnIcon2.isBackgroundSet()) {
					btnIcon2.setBackground(new Color(0xFFD700));
				}
				if(btnIcon1.isBackgroundSet()) {
					btnIcon1.setBackground(new Color(0xFFD700));
				}
				if(btnIcon4.isBackgroundSet()) {
					btnIcon4.setBackground(new Color(0xFFD700));
				}
				if(btnIcon5.isBackgroundSet()) {
					btnIcon5.setBackground(new Color(0xFFD700));
				}
				if(btnIcon6.isBackgroundSet()) {
					btnIcon6.setBackground(new Color(0xFFD700));
				}
				
			}
		});

		btnIcon4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon4.getText());
				btnIcon4.setBackground(new Color(0xA38A00));
				
				Bus apple=new CompanyDAO().searchCompany("애플");
				new FrameCompanyInfof(apple);
				
				if(btnIcon2.isBackgroundSet()) {
					btnIcon2.setBackground(new Color(0xFFD700));
				}
				if(btnIcon3.isBackgroundSet()) {
					btnIcon3.setBackground(new Color(0xFFD700));
				}
				if(btnIcon1.isBackgroundSet()) {
					btnIcon1.setBackground(new Color(0xFFD700));
				}
				if(btnIcon5.isBackgroundSet()) {
					btnIcon5.setBackground(new Color(0xFFD700));
				}
				if(btnIcon6.isBackgroundSet()) {
					btnIcon6.setBackground(new Color(0xFFD700));
				}
				
			}
		});

		btnIcon5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon5.getText());
				btnIcon5.setBackground(new Color(0xA38A00));
				
				Bus IBM=new CompanyDAO().searchCompany("IBM");
				new FrameCompanyInfof(IBM);
				
				if(btnIcon2.isBackgroundSet()) {
					btnIcon2.setBackground(new Color(0xFFD700));
				}
				if(btnIcon3.isBackgroundSet()) {
					btnIcon3.setBackground(new Color(0xFFD700));
				}
				if(btnIcon4.isBackgroundSet()) {
					btnIcon4.setBackground(new Color(0xFFD700));
				}
				if(btnIcon1.isBackgroundSet()) {
					btnIcon1.setBackground(new Color(0xFFD700));
				}
				if(btnIcon6.isBackgroundSet()) {
					btnIcon6.setBackground(new Color(0xFFD700));
				}
				
			}
		});

		btnIcon6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dest.setText(btnIcon6.getText());
				btnIcon6.setBackground(new Color(0xA38A00));
				
				Bus google=new CompanyDAO().searchCompany("구글");
				new FrameCompanyInfof(google);
				
				if(btnIcon2.isBackgroundSet()) {
					btnIcon2.setBackground(new Color(0xFFD700));
				}
				if(btnIcon3.isBackgroundSet()) {
					btnIcon3.setBackground(new Color(0xFFD700));
				}
				if(btnIcon4.isBackgroundSet()) {
					btnIcon4.setBackground(new Color(0xFFD700));
				}
				if(btnIcon5.isBackgroundSet()) {
					btnIcon5.setBackground(new Color(0xFFD700));
				}
				if(btnIcon1.isBackgroundSet()) {
					btnIcon1.setBackground(new Color(0xFFD700));
				}
			}
		});

		// 하단 버튼 이벤트
		btnPrev.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(ABORT);
			}
		});

		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜 지정 페이지 추가
				FrameBase.getInstance(new FrameDate();
				
			}
		});

	}// 생성자 종료
}// class 종료
