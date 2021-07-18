package pk5;

import java.util.Scanner;

public class IfExample08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//스캐너클래스에 쓰는 만큼 용량을 할당을 받기에 new가 붙는이유이다
		//scan 부분은 맘대로 가능
		//외우자
		//System.in 이어야 Scanner 안의 것을 맘대로 쓸수 있다
		System.out.print("첫 번째수 :");
		
		double num1=Double.parseDouble(scan.nextLine());
		/*scan은 Scanner에 가서 입력 받을수 있는 메모리를 확보하여
		 num1에 넣어준다 문제가 생겨 형변화가 필요하다*/
		//nextLine(): String
	
		System.out.print("두 번째수 :");
		double num2=Double.parseDouble(scan.nextLine());
		
		if(num2 !=0.0) { //if가 0이 아니라면 double로 받아서 0.0
			System.out.println("결과"+(num1/num2)); 
		} else { System.out.println("0으로 나눌수 없습니다.");
		}
		}
		//0만 제외하면 되기에 바로 else가 온다
		// 위의 경우는 에러처리를 해준것이다. syso로
		// 모든수는 0으로 못나눈다 에러가 나오기 때문에
		// 곱하기 0은 값이 0이므로 에러가 아니다.
		//if 수행문일때는 else를 안써도 된다. 생략가능
	
		
		
	}


