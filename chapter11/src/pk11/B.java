package pk11;
//protected 패키지가 다를때 상속에서만 public이다
public class B {
	//같은 패키지 안이므로 객체생성하여 참조
	public void method() {
		A a= new A();
		a.field= "vlaue";
		a.method();
	}
	public static void main(String[] args) {
		B b=new B();
		b.method(); 
		
	}
// private <protected<public 일반메서드는 보여주지않고 상속받은거에만 보여주고 싶을때
	//패키지가 다를때 상속한테만 public, 나머지는 private의 성격을 가진다
}
