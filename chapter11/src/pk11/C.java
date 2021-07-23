package pk11;

public class C {
	// 라이브러리 다른패키지를 참고한다
	public void method() {
		A a=new A();
		a.field="value";
		a.method();
	}

	public static void main(String[] args) {
		C c=new C();
	}

}
