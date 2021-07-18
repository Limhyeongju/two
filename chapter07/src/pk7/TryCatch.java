package pk7;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//int res=num1/num2;
			//System.out.println(res);// 밑에 try catch가 없으면 
				//10나누기 0하면 제로이므로 입력하면 에러가 난다
		try {
			System.out.println(num1/num2);
			//해당작업을 구현
		} catch (Exception e) {// 에러가 나면
			System.out.println("숫자 0를 입력하시면 안됩니다.");
			// 숫자 0를 입력하시면 안됩니다 출력후 끝까지 진행
			//에러시 수행될 행위
			//Exception 모든 에러
			//ArithmeticException 연산 에러
		}
		

		System.out.println("Error 후 컴파일 => 프로그램 수행 끝");
	}

}
