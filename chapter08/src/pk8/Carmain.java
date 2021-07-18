package pk8;

public class Carmain {

	public static void main(String[] args) {
		//객체 생성
		Car a=new Car();
		
		//필드 값 읽기
		System.out.println("제작회사 : " +a.company);
		System.out.println("모델명 : " +a.model);
		System.out.println("색 : "+a.color);
		System.out.println("최고속도 : " +a.maxSpeed);
		System.out.println("현재 속도 : " +a.speed);
		System.out.println("======속도변경 후 출력======");
		a.speed=60;// 필드 값 변경
		System.out.println("속도 변경후  : " +a.speed);
		

	}

}
