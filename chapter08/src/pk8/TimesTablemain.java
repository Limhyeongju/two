package pk8;

import java.util.Scanner;

public class TimesTablemain {

	public static void main(String[] args) {
		Scanner ex=new Scanner(System.in);
		
		int num; //매개 변수가 필요해서
		TimesTable tt= new TimesTable();
		
		System.out.print("단을 입력하세요");
		num=ex.nextInt();
		tt.showTable(num);
		
				
		
	}

}
