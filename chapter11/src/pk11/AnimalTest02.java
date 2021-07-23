package pk11;

import java.util.ArrayList;

public class AnimalTest02 {

	ArrayList<Animal> aniList=new ArrayList<Animal>();
	
	
	public static void main(String[] args) { //메인은 위든 아래든 상관없다
		AnimalTest02 t=new AnimalTest02();
		System.out.println("addAnimal");
		t.addAnimal();
		System.out.println("-------다운캐스팅-----------");
		System.out.println("testCating");
		t.testCasting();

	}
	public void addAnimal(){
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		//Animal ani1=new Human(); 자동형변환
		
		for(Animal ani:aniList) {//배열의 요소들을 꺼내서 move호출
			ani.move();//오버라이딩된 메서드만 호출
			//부모타입이므로 자식의 메서드는 안보임
		}
	}
	public void testCasting(){
		for(int i=0;i<aniList.size();i++) {
			Animal t=aniList.get(i);
			if(t instanceof Human) {
				Human a=(Human)t;
				a.reading();
			}else if(t instanceof Tiger) {
				Tiger b=(Tiger)t;
				b.hunting();
			}else if(t instanceof Eagle) {
				Eagle c=(Eagle)t;
				c.flying();
			}else {
				System.out.println("지원되지 않는 타입입니다");
			}
		}
		
	}
}



