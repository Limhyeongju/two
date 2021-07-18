package pk7;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		try {
			System.out.println("fun()메서드");
			throw new Exception();
			
		} catch (RuntimeException e) { //RuntimeException: 실행중 발생되는 에러
			System.out.println("예외발생");
		} finally {// catch문이 에러가 나든 말든 무조건 실행되는 코드
					// 에러를 잡지 못하더라도
			//네트워크 통신상 문제가 생겨 데이터 베이스에 연결 안될때 사용
			// 코드는 이상 없고 보내야할때
			System.out.println("finally 문장");
		}
	}

	public static void main(String[] args) {

	//fun();
	
		try {
			fun();
		} catch (Exception e) {
			System.err.println("main()의 catch문 문장");

	}
		
}// main
}// class
