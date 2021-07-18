package pk7;

public class MethodMain {

	public static void main(String[] args) {
		Method ex=new Method();
		//객체를 만들때 불러올 매서드 이름이 다르면 실행되지 않는다
		//맨처음 만들때 Methodmain으로 불러와서 생긴 오류
		
		ex.makeBread();
		System.out.println("======================");
		ex.makeBread(5);
		System.out.println("======================");
		ex.makeBread(5, "치즈 크림");

	}

}
