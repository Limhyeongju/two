package pk11;

public class ParentChild extends Parent{

	@Override // @오버라이딩입니다 안내의 뜻//생략가능
	public void method2() {
		System.out.println("child-method2()");
		 //마우스 우클릭 오버라이드 매서드 2선택 오버라이드 선택하는법//재정의됨
	}

	public void method3() {
		System.out.println("child-method3()");
		 
	}
	
}
