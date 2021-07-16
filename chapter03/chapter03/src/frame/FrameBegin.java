package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBegin extends JPanel{
	
	public FrameBegin() {
		setBackground(new Color(255, 241, 54));
		setLayout(null);
		setSize(600, 800);
		
		//메인사진
		ImageIcon cinema = new ImageIcon("메인사진.png");
		JLabel lblCinema = new JLabel(cinema);
		lblCinema.setSize(600, 620);
		lblCinema.setLocation(-9,20);
		add(lblCinema);
		
		//로고 사진
		ImageIcon woo = new ImageIcon("reallogo2.png");
		JLabel Woo = new JLabel(woo);
		Woo.setSize(180, 90);
		Woo.setLocation(205,500);
		add(Woo);
		
		//규리버스 로고
		ImageIcon kbus1 = new ImageIcon("규리버스.png");
		JLabel Kbus = new JLabel(kbus1);
		Kbus.setSize(500, 200);
		Kbus.setLocation(40,3);
		add(Kbus);
		
		
		//버튼객체 생성
		JButton btnBook = new JButton("Book");
		JButton btnRev = new JButton("Reveiw");
		
		//버튼 컬러
		btnBook.setBackground(new Color(255, 255, 102)); 
		btnRev.setBackground(new Color(255, 255, 051));
		
		//버튼(start) 사이즈
		btnBook.setSize(300, 150);
		//버튼 위치
		btnBook.setLocation(
				
		((int) getSize().getWidth() / 2) - 310, 
		(int) getLocation().getY() / 2 + 610);
		
		//버튼(start) 폰트 조절
		btnBook.setFont(new Font("굴림", Font.BOLD, 26));
		//버튼(Exit) 사이즈
		btnRev.setSize(300, 150);
		//버튼(Exit) 위치
		btnRev.setLocation(
		
		(int) btnBook.getLocation().getX() + 300, 
		(int) btnBook.getLocation().getY());
		//버튼(Exit) 폰트
		btnRev.setFont(new Font("굴림", Font.BOLD, 26));

		add(btnBook);
		add(btnRev);
		
		//버튼 이벤트(예매하기 / 후기 남기기)
		btnBook.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//FrameMovieSelect 클래스는 아직 없으므로 오류가 난다.
				FrameBase.getInstance(new FrameMenuf());
			}
		});	
	
		btnRev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase.getInstance(new FrameMyPage());
			}
		});

	}//생성자
}
	
	
	
	
	
	
	
	
	
	
	


