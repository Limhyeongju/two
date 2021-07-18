package pk9;

public class Person {

	String name;
	int age;
	
	public Person() { 
		this("이름 없음",1);
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	Person returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person noName=new Person();
		Person Name=new Person("임형주",29);
		//기본생성자 객체
		System.out.println(noName.name);
		System.out.println(noName.age);
		//오버로딩생성자 객체
		System.out.println(Name.name);
		System.out.println(Name.age);
		
		System.out.println(noName.returnSelf());
	}
	
}
