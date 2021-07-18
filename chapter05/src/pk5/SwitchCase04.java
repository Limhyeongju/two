package pk5;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		// 1,3,5,7,8,10,12=>31일
		// 4,6,9,11=> 30일/ 2=> 28일
		
		Scanner scan=new Scanner(System.in);
		//
		
		int month;
		int day;
		System.out.print("월을 입력하세요(1~12):");// 안내문구 
		//print= 실행후 커서가 바로 오른쪽에
		//println= 실행후 커서가 엔터 오른쪽에
		month=scan.nextInt();
		//형이 맞는경우는 형변환을 하면 에러가 난다. 지금같은 경우는 안해도 된다.
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		//case 1, 3, 5, 7, 8, 10, 12: case 중복 사용 생략가능 ver10이상
			day=31;
			break;
		case 4: case 6: case 9: case 11: 
			day=30;
			break;
		case 2: 
			day=28;
			break;
		
		default :
			day=0;
			System.out.println("존재하지 않는 달입니다.");
			
	
		}//switch
	
		
		System.out.println(month+ "월은 "+ day + "일까지 있습니다.");
		
		//밑에 입력한다
		
	}//main

}//class
