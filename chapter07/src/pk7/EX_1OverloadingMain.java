package pk7;

public class EX_1OverloadingMain {

	public static void main(String[] args) {
		//EX_1Overloading 클래스의 객체 ex를 만들어라
		
		EX_1Overloading ex=new EX_1Overloading();

		ex.getReult('A');
		ex.getReult(1);
		ex.getReult("이것");
		ex.getReult(3, " 점심 맛있게드세요");
	}

}
