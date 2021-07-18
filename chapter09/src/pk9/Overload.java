package pk9;
//생성자 활용
public class Overload {
	
	private int age;
	private float height;
	private String name;

	public Overload() {
		age=0;
		height=0.0f;
		name="익명";
	}
	
	
	//나이 키
	public Overload(int a, float h) {
		this.age=a;
		height=h;
		name="익명";
	}
	// 나이 키 이름
	public Overload(int a, float h, String n) {
		this.name=n;
		this.age=a;
		this.height=h;
	}
	
	// Disp
	 void Disp( ) {
		System.out.println(" 성명 :"+ name);
		System.out.println(" 나이 :"+ age);
		System.out.println(" 키 :"+  height);
	}
	
}
