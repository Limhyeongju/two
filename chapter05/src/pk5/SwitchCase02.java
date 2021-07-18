package pk5;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		//1~4
		//1: 예금 조회 2: 출금 3: 입금 4:이체  그외 : 잘못
		
		int n;//먼저 받을 번호 입력
		n=Integer.parseInt(JOptionPane.showInputDialog("번호입력(1~4"));
		//안내문구는 디테일하게
		
		switch(n) {//번호는 n에 다들어있다.
		case 1:
			System.out.println("예금조회를 선택하셨습니다."); 
			//수행문자체가 출력인경우
			
			break; //break를 걸지 않으면 계속 읽게 된다
		case 2:
			System.out.println("출금을 선택하셨습니다.");
			
			break;
		case 3:
			System.out.println("입금을 선택하셨습니다.");
			
			break;
		case 4:
			System.out.println("이체를 선택하셨습니다.");
			
			break;
		default: System.out.println("잘못 누르셨습니다.");	//경우의 수가 끝났으니 default 사용
		
		}//switch 종료
				System.out.println(n+"선택");
	}//main 종료

}//class 종료
