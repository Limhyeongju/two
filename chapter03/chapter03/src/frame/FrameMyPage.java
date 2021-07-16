package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMyPage extends JPanel {
	
	public FrameMyPage() {
		String startPoint="Soldesk";
		
		setBackground(new Color(0xFFD700)); 
		setLayout(null);
		setSize(600, 800);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700)); 
		top.setLayout(new GridLayout(2, 1));
		top.setSize(550, 150);
		top.setLocation(15, 0);
		
		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700)); 
		center.setSize(550, 450);
		center.setLocation(15, 150);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700)); 
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 630);
		
		//예매내역 문구 출력
		JLabel name = new JLabel("예매 내역");
		name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);
		
		/*ArrayList<Integer> al = null;
		al.add(마이버스.getbookingNum)*/
		
		
	   /* JLabel jl3=new JLabel("◎예약번호 : 1" + "\n\n"
				+"\n◎ 출발지 : " + "\n\n"
				+"\n◎ 도착지 : ");
	    jl3.setSize(400,400);
		*/
	    
	    
	    ArrayList<String> db = new ArrayList<String>();
	   
	   db.add("N10234567");
	   db.add("G12345607");
	    
		Choice choice = new Choice();
		//stack으로 쌓아야하나...?
		
		choice.setBounds(25,335,300,100);
		choice.setLocation(100, 70);
		
		/*
		choice.add("G10234567");
		choice.add("N12345670");
		*/
		int flag = 1;
		
		if(choice.getSelectedItem().equals("N12345670")) {
			flag = 1;
		} if(choice.getItem(2).equals("G10234567")) {
			flag = 2;
		}
		
		switch(flag) {
		case 1:
			System.out.println("예매완료");
			JLabel jl1=new JLabel("◎예약번호 : 1" + "\n\n"
					+"\n◎ 출발지 : " + "\n\n"
					+"\n◎ 도착지 : " );
			jl1.setSize(400,400);
			center.add(jl1);
			break;
		case 2:
			System.out.println("예매취소");
		    JLabel jl2=new JLabel("◎예약번호 : 2" + "\n\n"
					+"\n◎ 출발지 : " + "\n\n"
					+"\n◎ 도착지 : " );
		    jl2.setSize(400,400);
			center.add(jl2);
			break;
			
		}
/*
		if(choice.getSelectedItem().equals("N12345670")) {
			System.out.println("예매완료");
			JLabel jl1=new JLabel("◎예약번호 : 1" + "\n\n"
					+"\n◎ 출발지 : " + "\n\n"
					+"\n◎ 도착지 : " );
			jl1.setSize(400,400);
			center.add(jl1);
		} 
		if(choice.getItem(2).equals("G10234567")) {
		System.out.println("예매취소");
	    JLabel jl2=new JLabel("◎예약번호 : 2" + "\n\n"
				+"\n◎ 출발지 : " + "\n\n"
				+"\n◎ 도착지 : " );
	    jl2.setSize(400,400);
		center.add(jl2);
		}
*/
		
		//예매번호 받아서 콤보박스로 출력!
		
/*
		//예매내역 출력 >> txt박스 크기 조정중...ㅠㅠ
		MyBus b = new MyBus();
		TextArea myPage = new TextArea(" " + b);
		center.add(myPage);
		/*myPage.add("◎예약번호 : " + b.getBookingNum() + "\n\n"
				+"\n◎ 출발지 : " + startPoint + "\n\n"
				+"\n◎ 도착지 : " +);
		
				
				"/*al.getBookingNum*//* + "\n\n"
				+"\n◎ 출발지 : 솔데스크(본원)"
				+ "\n◎ 도착지 : " + "카카오" + "\n\n" //Bus b.getComp매개변수로 받아서 get도착지정보 
				+ "◎ 예상 소요 시간 : N분" + "\n\n" //기업정보 만들면 그안에 출발지로부터 소요시간 변수도 넣어서 불러올 예정
				+ "◎ 좌     석 : " + "A5" + "\n\n" //b.getSeat좌석정보
				+ "◎ 금     액 : " + "376,000 귤 (한화 112,800,000 원)", 0, 0,
				TextArea.SCROLLBARS_NONE);
		myPage.setBounds(25, 40, 400, 400);
		//myPage.set
		myPage.setBackground(Color.WHITE);
		myPage.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
				 */

		//하단의 버튼 설정
		JButton btnHome = new JButton("HOME");
		JButton btnExit = new JButton("EXIT");
		JButton btnSave=new JButton("SAVE");

		btnHome.setBackground(new Color(183, 240, 117));
		btnHome.setSize(200, 150);
		btnHome.setLocation(0,0);
		btnHome.setFont(new Font("굴림", Font.BOLD, 26));
		
		btnHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
		//액션 처음으로!
		
		btnExit.setBackground(new Color(183, 240, 117));
		btnExit.setSize(200, 150);
		btnExit.setLocation(196,0);
		btnExit.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 종료!
		
		btnSave.setBackground(new Color(183, 240, 117));
		btnSave.setSize(200, 150);
		btnSave.setLocation(395,0);
		btnSave.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 뭐시기여 그거 텍스트파일로 저장!
		
		top.add(name);
		top.add(choice);
		
		//center.add(myPage);
		
		bottom.add(btnHome);
		bottom.add(btnExit);
		bottom.add(btnSave);
		
		add(top);
		add(center);
		add(bottom);
		
	}
}

//myPage.append(b.getReview());//날짜, 목적지, 매수
/*
//예매내역 불러오기
Frame fr= new Frame();
fr.setTitle("의 예매내역");
fr.setSize(800, 300);
fr.setLocation(700, 200);
//fr.add(review);
fr.setVisible(false);

//리뷰창의 x를 눌렀을 때 System.exit(0)를 하면 예매프로그램 자체가 종료되므로
//dispose()를 통해 서브 프레임만 종료해줘야 한다.
fr.addWindowListener(new WindowAdapter() {
   @Override
   public void windowClosing(WindowEvent e) {
      fr.setVisible(false);
      fr.dispose();//창하나만 닫은것!
   }
});
*/