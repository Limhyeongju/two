package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import busVO.Bus;
import busVO.BusDAO;
import busVO.MyBus;

public class FrameReserve extends JPanel{

	public FrameReserve(Bus b) {
		//JPanel 구조
				setBackground(new Color(0xFFD700)); 
				setLayout(null);
				setSize(600, 800);

				JPanel top = new JPanel();
				top.setBackground(new Color(0xFFD700));
				top.setLayout(null);
				top.setSize(600, 300);
				top.setLocation(0, 0);
				
				JPanel center = new JPanel();
				center.setBackground(new Color(0xFFD700)); 
				center.setLayout(new GridLayout(5, 8));
				center.setSize(600, 350);
				center.setLocation(0, 305);
				
				JPanel bottom = new JPanel();
				bottom.setBackground(new Color(0xFFD700)); 
				bottom.setLayout(null);
				bottom.setSize(600, 200);
				bottom.setLocation(0, 660);
				
				//상단에 JPanel(영화 포스터, 영화 제목, 시간대 선택)
				final int busNum = 6;
				int busflag = 0;
				String[] busurl = { 
						"라라랜드.png", "말할수없는비밀.jpg", "인사이드아웃.png", 
						"겨울왕국.png", "당신거기있어줄래요.png", "스파이더맨.png" };

				ImageIcon[] busImg = new ImageIcon[busNum];
				
				for (int i = 0; i < busNum; i++) {
					busImg[i] = new ImageIcon(busurl[i]);
					if (b.getBusName().equals("네이버")) {
						busflag = 0;
					} else if (b.getBusName().equals("카카오")) {
						busflag = 1;
					} else if (b.getBusName().equals("마이크로소프트")) {
						busflag = 2;
					} else if (b.getBusName().equals("애플")) {
						busflag = 3;
					} else if (b.getBusName().equals("IBM")) {
						busflag = 4;
					} else if (b.getBusName().equals("구글")) {
						busflag = 5;
					}
				}//for
				
				JLabel img = new JLabel(busImg[busflag]);
				img.setBounds(50, 15, 175, 248);

				JLabel name = new JLabel(b.getBusName());
				name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
				name.setBounds(260, 35, 300, 175);
				
				Choice busTime = new Choice();
				long time = System.currentTimeMillis();

				SimpleDateFormat dayTime = 
					new SimpleDateFormat("MM월 dd일(EE)");//날짜 받아오기

				String str = dayTime.format( new Date(time) );

				String[] timeSlot = { 
						"시간대 선택", 
						str + " 06:30~08:30", 
						str + " 09:00~11:00", 
						str + " 11:30~13:30",
						str + " 14:00~16:00", 
						str + " 16:30~18:30", 
						str + " 19:00~21:30", 
						str + " 22:00~00:00",
						str + " 00:30~02:30" };

		for (int i = 0; i < timeSlot.length; i++) {
					busTime.add(timeSlot[i]);
				}

				busTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
				busTime.setSize(270, 200);
				busTime.setLocation(260, 200);

				JLabel screen = new JLabel("[좌석   예매]");
				screen.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
				screen.setBounds(180, 223, 240, 120);
				screen.setVisible(false);
				
				//예약 좌석 선택
				ButtonGroup bg = new ButtonGroup();
				final int seatNum = 4 * 5;
				JRadioButton[] seatChoice = new JRadioButton[seatNum];
				String[] seatn = { "1", "2" ,"3","4"};
				String seatAl = "A";
				
				for (int i = 0; i < 5; i++) {
					
					if (i == 1) {
						seatAl = "B";
					} else if (i == 2) {
						seatAl = "C";
					} else if (i == 3) {
						seatAl = "D";
					} else if (i == 4) {
						seatAl = "E";
					}
					
					for (int j = 0; j < 4; j++) {
						seatChoice[(i * 4) + j] = new JRadioButton( seatAl + seatn[j] );
						bg.add(seatChoice[(i * 4) + j]);
						center.add(seatChoice[(i * 4) + j]);
						seatChoice[(i * 4) + j].setVisible(false);
					}

				}//for
				
				//하단의 버튼
				JButton btnBack = new JButton("뒤로가기");

				btnBack.setBackground(new Color(0xA6A6A6));
				btnBack.setSize(183, 87);
				btnBack.setLocation(5, 0);
				btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
				bottom.add(btnBack);

				btnBack.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameDate(b));
					}
				});
				
				JButton btnHome = new JButton("처음 화면으로");

				btnHome.setBackground(new Color(0xA6A6A6));
				btnHome.setSize(183, 87);
				btnHome.setLocation(198, 0);
				btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
				bottom.add(btnHome);

				btnHome.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameBegin());
					}
				});
				
				JButton btnBuy = new JButton("결제하기");

				btnBuy.setBackground(new Color(0xA6A6A6));
				btnBuy.setSize(183, 87);
				btnBuy.setLocation(391, 0);
				btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
				bottom.add(btnBuy);
				
				//결제하기 버튼 유효성 체크
				btnBuy.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						MyBus myM = new MyBus();
						myM.setBusName(b.getBusName());
						myM.setBusTime(busTime.getSelectedItem());
						int seatIndex = -1;
						for (int i = 0; i < seatNum; i++) {
							if (seatChoice[i].isSelected()) {
								seatIndex = i;
							}
						}
						if (busTime.getSelectedItem().equals("시간대 선택")) {
							JOptionPane.showMessageDialog(
									null, "시간을 선택해 주세요");
							
						} else if (seatIndex == -1) {
							JOptionPane.showMessageDialog(
									null, "좌석을 선택해 주세요");
							
						} else {
							myM.setSeatNum(seatChoice[seatIndex].getText());
							FrameBase.getInstance(new FrameBusConfirm(b, myM));
						}
					}
				});//addActionListener
				
				top.add(busTime);
				top.add(img);
				top.add(name);
				top.add(screen);

				add(top);
				add(center);
				add(bottom);
				
				//이미 등록한 예매 정보인지 확인 및 정확한 예매 정보확인
				
				busTime.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						for (int i = 0; i < seatNum; i++) {
							seatChoice[i].setEnabled(true);
						}
				
				//choice가 “시간대 선택”으로 되어 있을때는 좌석메뉴 비활성화
				if (e.getItem().equals("시간대 선택")) {
					
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(false);
						screen.setVisible(false);
					}
					
				} else {
					
					//그렇지 않다면 좌석메뉴 활성
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(true);
						screen.setVisible(true);
					}
				}
				
				BusDAO setSeat = new BusDAO();
				for (int j = 0; j < seatNum; j++) {
					if (setSeat.dupSeat(
							b.getBusName(),
							e.getItem().toString(), 
							seatChoice[j].getText())) {
						
						//이미 예약된 좌석은 비활성화
						seatChoice[j].setEnabled(false);
					}
				}//for
			}//itemStateChanged
		}); //addItemListener
	}//생성자
	}

				
				
				
