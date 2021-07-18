package chapter04;

public class BitTest_03 {

	public static void main(String[] args) {
		
		int n=0B0000101;//5
		//20이 되도록 쉬프트 연산 (왼쪽 쉬프트)
		System.out.println(n<<2);
		
		//1dl 되도록 오른쪽 쉬프트 연산
		System.out.println(n>>2);
	}

}
