package pk7;

import java.util.Scanner;



public class MethodTest {
	int cnt = 0;
	int input_num = 0;
	
	int[] bread = null;
	int count = 0;
	boolean run=true;
	
	void makeBread() { //public 생략가능
		System.out.println("빵을 만들었습니다.");
	}//mehod1

	void makeBread(int count) { 
		//1번째 빵을 만들었습니다.
		//2번째 빵을 만들었습니다.
		
		for(int i=0; i<count;i++) {
			System.out.println((i+1) +" 번째" +" "+ " 빵을 만들었습니다.");
			
		}
		System.out.println();
		System.out.println("요청하신" +""+ count +"개의 빵이 모두 완성되었습니다.");
	}//method2
	void makeBread(int count, String name) { 
		//1번째 빵을 만들었습니다.
		//2번째 빵을 만들었습니다.
		
		for(int i=0; i<count;i++) { 
			System.out.println((i+1) +"번째" + name +"빵을 만들었습니다.");
			
		}
		System.out.println();
		System.out.println("요청하신 "+ count + " 번째"+ name +"빵을 만들었습니다.");
	}//method3
	
	
	
	
	void order() { //매서드에서 매서드를 호출 할수 있다 중요
		Scanner sc= new Scanner(System.in);
		while(run) {
			System.out.println("1. 빵 개수만 선택| 2. 빵개수와 종류 선택| 3. 종료");
			System.out.println("선택 > ");
			input_num =sc.nextInt() ;
			
			if(input_num ==1) { //누르는 번호가 1번이면
				System.out.println("주문할 빵 갯수 : ");
				cnt=sc.nextInt(); //cnt= 숫자가 들어와야한다
				makeBread(cnt);//매개변수의 특징은 갯수와 타입만 맞으면된다.
			} else if(input_num==2) {
				System.out.println("빵 갯수 : ");
				cnt =sc.nextInt();
				
				System.out.println("빵 이름 : ");
				String name= sc.next(); //이름 문자열이니 문자열로 받아온다 
				makeBread(cnt, name);
			} else if(input_num==3) {
				System.out.println(" 종료 ");
				break;
			}
		}
		
	
			
	
	}
	
	
}
