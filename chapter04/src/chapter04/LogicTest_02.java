package chapter04;

public class LogicTest_02 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		boolean flag=(num1>0) && (num2>0);
		System.out.println(flag);
		
		//&& > f
		flag=(num1<0) && (num2>0);
		System.out.println(flag);
		
		// || > t
		flag=(num1>0) || (num2>0);
		System.out.println(flag);
		
		// || > t
		flag=(num1>0) || (num2>0);
		System.out.println(flag);
		
		// != > f
		flag=(num1>0) != (num2>0); //같지 않으면= t /같으면 =f
		System.out.println(flag);
		
		//부정 > f 
		flag=!(num1>0);// 관계연산 회로의 반대
		System.out.println(flag);

	}

}
