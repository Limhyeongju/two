package pk11;

public class ParetExamMain {

	public static void main(String[] args) {
		
		ParetExamChild c1= new ParetExamChild();
		
		System.out.println(c1.getCar());// 자식
		System.out.println(c1.getMoney()+"원"); //부모
		
		//ParetExamChild는 곧 ParetExam
		//왼쪽 객체가 오른쪽 객체 클래스의 인스턴스냐(즉 그 클래스로 만든객체이냐)
		//instanceof 연산자 같은지 아닌지란 의미
		if(c1 instanceof ParetExam) 
			System.out.println("c1은 ParetExam의 자식클래스이다");
			System.out.println("=================================");
			
			ParetExamChild ch= new ParetExamChild();	
			ParetExam p1=new ParetExam();
			
			p1=ch; //자동 형변환 부모클래스에서 자식 클래스
			//ch앞에 (ParetExam) 오버라이딩한 상테에서 부모클래스이 메서드를 사용하기위해서
			//p1=(ParetExam)ch; 자주 쓰이진 않는다
			ch=(ParetExamChild)p1; //자식은 부모의 메서드와 자기자신의 메서드를 모두 사용
			System.out.println(ch.getMoney());
			System.out.println(ch.getCar());
			System.out.println(ch.getStr());
			
			//반면 부모
			p1=ch; //부모에 자식을 대입해도(자동 형변환)
			//부모클래스는 부모클래스의 기능만 사용
			System.out.println(p1.getMoney());
			System.out.println(p1.getStr());
			
			
			System.out.println(((ParetExamChild)p1).getCar());
			//강제로 사용하는것 부모클래스가 자시클래스의 사용 많이 사용되진 않는다
			
	}

}
