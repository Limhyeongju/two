package pk7;
//call by reference 참조에 의한 호출


//오버로딩된 생성자가는 디폴트 생성자가 반드시 명시 되어야한다.
//오버로딩은 같은이름이 여러개 같은 클래스내에 
public class FunTest05 {
	int value; //멤버변수 a=10 b=20
	
	//public Funtest05() {}디폴트 생성자 생략되어 있다. 밑에 매서드를 만들었기에
	
	//생성자: 클래스의 초기화
	//생성자는 이름이  디폴트 생성자가를 생략하면 이름은 클래스랑 같은게 온다
	//this는 클래스에 있는 //현재 클래스 자체에 있는 거를 읽어라
	
	FunTest05(int value) { 
		this.value=value;
	}
	public static void swap(FunTest05 x,FunTest05 y) { 
		// 자바에 FunTest05객체가 없기에 만들어줘야한다
		int temp=x.value;
		x.value=y.value;
		y.value=temp;
		System.out.println("swap () 결과값: a="+ x.value+ " b="+y.value);
		
	}
	public static void main(String[] args) {
		
		FunTest05 a=new FunTest05(10); //객체를 만들어 접근해서 값이 달라진다
		System.out.println(a);
		FunTest05 b=new FunTest05(20);
		System.out.println(b);
		System.out.println("================================");
		
		System.out.println("swap () 호출 전 : a="+ a.value+ " b="+b.value);
		System.out.println("================================");
		//객체로 접근하여 호출
		swap(a,b);
		System.out.println("================================");
		//heap메모리 참조후 값이므로 바뀜
		System.out.println("swap () 호출 후 : a="+ a.value+ " b="+b.value);
	}

}
