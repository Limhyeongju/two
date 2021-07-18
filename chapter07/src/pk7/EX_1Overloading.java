package pk7;

public class EX_1Overloading {
	//필드=멤버변수
	
	//생성자생략(디포트생성자만 사용한다)
	
	//메서드구현
	//메서드 중복허용=Overloading : 클래스에 동일한 이름의 메서드가 존재.
	//Overloading(다형성) : 네이밍을 갖게하여 유지보수 관리의 효율성을 극대화. 면접질문중 하나
	
	public void getReult(int n) {
		System.out.println(n + "은(는) int입니다.");
	}
		
		public void getReult(String n) {
			System.out.println(n + "은(는) String입니다.");
		}
		public void getReult(char n) {
			System.out.println(n + "은(는) char입니다.");
		
	}public void getReult(int n, String str) {
		System.out.println(n + "은(는) int," + str +" 은(는) String 입니다.");
}
	}
