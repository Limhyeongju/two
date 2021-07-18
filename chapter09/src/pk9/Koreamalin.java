package pk9;

public class Koreamalin {
	
	public static void main(String[] args) {
		
		korea a= new korea("홍길동", "123456-4567890");
		System.out.println("a.name : "+ a.name);
		System.out.println("a.ssn : "+ a.ssn);
		System.out.println("--------------------------");
		
		korea b= new korea("호진", "444444-4567890");
		System.out.println("b.name : "+ b.name);
		System.out.println("b.ssn : "+ b.ssn);
		System.out.println("--------------------------");
		
		korea c= new korea();
		System.out.println("c.name : "+ c.name);
		System.out.println("c.ssn : "+ c.ssn);
		
		
		
		
		
		
	}
}
