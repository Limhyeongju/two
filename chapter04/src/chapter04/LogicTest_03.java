package chapter04;

public class LogicTest_03 {

	public static void main(String[] args) {
		
		int n1=10;
		int i=2;
		
		boolean v=((n1=n1+10)<10)&&((i=i+2)<10);;
		//i=2, n1=20
		// and 연산은 앞이 거짓이면 무조건 거짓이므로 뒤는 연산하지 않는다
		//boolean value=((i=i+2)<10) && ((num1=num1+10)<10); //i=4,num1=20

		System.out.println(v);
		System.out.println(n1);
		System.out.println(i);
		
	}

}
