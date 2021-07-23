package pk11;



public class A {
	//가같은 패키지에서는 protected라고 하더라도 public과 같다
	//다른 패키지에서는 상속받은 자식클래스에는 public/ 일반 클래스에서는 privated의 성격을 갖는다
	protected String field;
	
	protected A() {
		
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("filed");
	}
}
