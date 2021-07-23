package pk11;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	void circle() {
		System.out.println("원입니다.");
	}
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}

	void Rectangle() {
		System.out.println("사각형입니다.");
	}
}
class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Tritangle");
	}
	
	void Triangle() {
		System.out.println("삼각형입니다.");
	}
}


public class ShapeTest {
	//<Shape> Shape를 기준으로 shape 클래스와 shape를 상속받은 모든 클래스
	//< > 이안에는 클래스면 다된다
	//타입도 필요없고 메모리 확보도 할필요가 없다.
	//타입을 제너릭 <   >
	ArrayList<Shape> sList= new ArrayList<Shape>();
	
	
	public static void main(String[] args) {
		ShapeTest stest=new ShapeTest();
		System.out.println("====업 캐스팅 ====");
		stest.addshape();
		System.out.println("====다운 캐스팅 ====");
		stest.testCasting();

	}
	public void addshape() {
		
		sList.add(new Circle());// Circle 객체생성 Circle 땡땡 생략
		sList.add(new Rectangle()); //Rectangl s=new Rectangl()
		sList.add(new Triangle()); //Triangle s= new Triangle()
		
		// 업캐스팅
		//overring 된 메서드 이므로 자식클래스의 draw로 컴파일됨
		for(Shape s:sList) {
			s.draw();
			
		}
	}
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
		Shape 	s=sList.get(i); //일단 shape타입으로 가져옴 (sList 배열 요소 for문으로 죄다 가져온거)
		
			if(s instanceof Circle) {
				Circle c=(Circle)s; 
				//c=s; 가 오류나는 이유 타입이다르다 c=자식 s=부모
				//다운캐스팅 Circle로 형변환		
				c.circle();
				c.draw();
				
			} else if(s instanceof Rectangle) { //instanceof는 다운캐스팅을해준다라는 의미
				Rectangle r=(Rectangle)s;
				r.Rectangle();
				r.draw();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s;
				t.Triangle();
				t.draw();
			}else {
				System.out.println("지원되지 않는 타입입니다");
			}
		}
		
	}

}
