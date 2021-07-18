package chapter04;

public class BitTest {

	public static void main(String[] args) {
		// bit연산
		int n1=5;
		int n2=10;
		// bit or(|)
		int result=n1|n2;
		System.out.println(result);
		
		//bit xor(^)
		
		  result=n1 ^ n2;
		System.out.println(result);
		
		//bit not(~) 필드
		System.out.println(~n2+1);
		//음수로 가면서 +0이 생기면서 +1을 해준다
		
	}

}
