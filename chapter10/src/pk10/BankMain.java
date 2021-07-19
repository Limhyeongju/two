package pk10;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
	String a;
	
	 Bank ga=new Bank("종각역","02-123-4567");
	 Bank.interest=1.51f;
	 // ga.interest=1.51f; 이것도 가능하나 문법적으론 위가 더 맞다
	 ga.getBank();
	 System.out.println("=====================");
	 Bank na=new Bank("서울역","02-456-7890");
	 Bank.interest=1.2f; // 값을 바꾸지 않으면 안써도 된다. 그럼 위의 1.51f로 적용된다
	 					// 같이 쓴다, 한곳을 바라보며 쓴다라는 느낌 
	 na.getBank();
	
	 /* 방법2
		String point=null;
		String tell=null;
		
		Scanner scan = new Scanner(System.in);
		
		point = JOptionPane.showInputDialog("지점명 : ");
		tell = JOptionPane.showInputDialog("전화번호 : ");
		Bank bank = new Bank(point, tell);
		
		System.out.print(point + " 지점의 이자를 입력하세요 > ");
		bank.interest=scan.nextFloat();
		
		bank.getBank();

		 */ // point와 tell을 입력받아 사용하는 방법
	}

}
