package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
	  
		//변수 선언
		String select="";
		int money=0;
		
		
		//객체 선언
		Vending ven= new Vending();
		ven.init(); //음료수 세팅 완료
		
		//음료출력  입력 받아showCans 호출 
		System.out.print("돈을 투입하세요 : ");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt();
		ven.showCans(money);
		
		//음료선택후  입력 받아outCan 호출
		System.out.print("음료수를 선택하세요 : ");
		select=scan.next();
		ven.outCan(select);

	}

}
