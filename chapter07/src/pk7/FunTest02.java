package pk7;

public class FunTest02 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		 
		int sum=addNum(num1, num2);//메소드 호출
		System.out.println(num1 +"+" +num2+ "="+sum+"입니다");
	}// void로 선언되면 가져다 쓰기만 하는것, 리턴값으로 쓸수없다.funtest03으로 이어진다
	public static int addNum(int n1, int n2) {
		//위의 변수 num1, num2랑 아무상관없고
		// 위의 경우는 int에 변수2개만 만족하면된다.
		int result=n1+n2;
		return result;//불렀던 곳을 반드시 리턴
	}
	
}
