package pk11;

public class ParentChildMain {

	public static void main(String[] args) {
		
		ParentChild child=new ParentChild();
		child.method1();
		child.method2();// 부모것이 아닌 재정비된 ParentChild게 온다
		//업캐스팅을 하면 부모자식 메서드가 둘다 올수 있다 후에 배움
		child.method3();
		
		System.out.println("---------------------------------");
		
		Parent parent=new Parent();
		parent.method1();
		parent.method2();

	}

}
