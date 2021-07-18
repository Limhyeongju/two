package pk5;

public class WhileTest01 {

	public static void main(String[] args)  {
		//무한 반복 조건에 만족하면 브레이크를 걸어준다
		//지속성이 필요할때 for문(조건이 맞으면 멈추기에)으로 안되는걸 도와준다
	
		
		while(true) {// 무한반복
			int n=(int)(Math.random()*6)+1; //6번돌리고 시작은 1부터 랜덤
			System.out.println(n);
			if(n==6) {
				break;
			}
			
			
		}
			System.out.println("프로그램 종료");
	}

}
