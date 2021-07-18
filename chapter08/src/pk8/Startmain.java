package pk8;

import java.util.Random;
import java.util.Scanner;

public class Startmain {

	public static void main(String[] args) {
		
	int select;
	String check;
	 
	Start st= new Start();
	
	while (true) { // while (true) 값이틀려도 무한반복 시키기위해서 이다
		System.out.print("숫자입력 : ");
		Scanner scan= new Scanner(System.in);
		select = scan.nextInt();
		check = st.check(select); //null 상태로 들어있으니 체크에 값을 넣어줘야한다
		
		if(check.equals("success")) //String String이기에 equals를 쓴다
			break;
				
	}
		
	}
}
