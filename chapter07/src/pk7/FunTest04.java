package pk7;
// 값에 의한 호출 = call by value 일반적으로 쓰는경우

public class FunTest04 {
	
	public static void swap(int x, int y) {
		//swap 알고리즘
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swap () 결과값: a="+ x+ " b="+y);
	 
	}
	public static void main(String[] args) {
		
		int a=10; int b=20;
		System.out.println("swap () 호출 전 : a="+ a+ " b="+b);
		System.out.println("================================");
		swap(a,b);
		System.out.println("================================");
		System.out.println("swap () 호출 후 : a="+ a+ " b="+b);
		
		//호출전이랑 호출후랑 값이 달라지지 않는다.
		// swap(a,b)  값을 복사해서 위의 메소드에 준다
		// 복사의 원본(a,b의 주소는 그래도 있다)은 그대로 남아 a=10, b=20이 그대로 값이 남는다
		
	}
	
	FunTest05 f5=new FunTest05(5);
	// funtest05과 같은 메모리를 주어 변수를 갖는다
}
