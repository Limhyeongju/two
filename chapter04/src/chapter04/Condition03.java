package chapter04;

public class Condition03 {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		boolean result;
		
		result=++a>=b?true:false;
		System.out.println(result);
		
		int n1=10;
		int n2=20;
		//n1에 1을 더하면 n2와 같은지 연산? 같으면 o 다르면 x
		 char n3;
		 n3=n1+1==n2?'o':'x';
		 //n3=++n1==n2?'o':'x';
		//n3=(n1 +=n1)==n2?'o':'x'; 같은결과 가독성의 차이
		System.out.println(n3);
		
		
	}

}
