package pk8;

//접근한정자 실습
public class Accessex {
	
	//멤버변수
	private int aa;// 은닉화 (동일 클래스에서만 사용가능)
	public int bb;// 공통 프로젝트가 달라도 쓸수 있다.
	int cc; //패키지가 같으면 사용가능
	
	public void setA(int a) {//public deflaut생성자가 public 생략가가능하나 가독서으이 이유로
		aa=a; // 완전히 잠그려면 a값을 주지 않거나 public을 private로 변경한다
		//private 이엳 public 메서드를 통해서 외부에서 사용가능
	}
	public void setB(int b) {
		bb=b; 
	}
	public void setC(int c) {
		cc=c; 
	}
	
	public void Disp() {
		 System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
	}
	
	
	
	public static void main(String[] args) {
		
		Accessex obj= new Accessex();
		//obj.setA(10); // 메서드로 변수방 초기화
		//obj.aa= 10; //멤버변수 직접 접근
		obj.setB(20);
		obj.bb= 20;
		//obj.setC(30);
		
		obj.Disp();
		
		

	}

}
