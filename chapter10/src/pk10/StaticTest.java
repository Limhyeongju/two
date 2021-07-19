package pk10;

class StVal{
	int a;
	static int b; //같이 쓰면서 공통적인 결정적인 값
}


public class StaticTest {

	public static void main(String[] args) {
		
		StVal obj1=new StVal();
		StVal obj2=new StVal();
		
		obj1.a=10;
		obj1.b=20;
		
		System.out.println("obj1 a: "+obj1.a+" | obj.1 b: "+obj1.b);
		
		obj2.a=100;
		obj2.b=200;
		
		System.out.println("obj2 a: "+obj2.a+" | obj.2 b: "+obj2.b);
		System.out.println("obj1 a: "+obj1.a+" | obj.1 b: "+obj1.b);
		// static은 공통으로 쓰는값, 값이 변하면 다같이 변한다.  한곳을 바라보면서 사용하는 느낌
		//그래서 밑에거 obj1.b의값이 200이 나온다
		// a는 static선언이 안됬기에 각각쓰고 b는 최종값을 쓴다
		//제일 나중것이 최종값이 된다. 데이터를 쌓아놓고 밑에것부터 쓰는게 아니라 맨위부터 쓰기에
		// final은 한번 선언하면 고정이므로 바뀌지 않는다  공통으로 쓰는값, 값이 변하지 않는다
		
	}

}
