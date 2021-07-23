package pk11;

public class D extends A {
	
	public D() {
		super();
		//A a=new A(); //상속에서는 super() 로 대체
		this.field="value"; // this로 생성자를 만든다 this A를 지칭한다.
		this.method();
	}
	public static void main(String[] args) {
		D d=new D();
		d.method();
		
	}
}
