package pk11;
//ArrayList를 쓰지않고 매서드를 활용한

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void reading ( ) {
		System.out.println("사람은 책을 읽습니다");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting ( ) {
		System.out.println("호랑이는 사냥을 합니다");
	}
}
class Eagle extends Animal{
	public void move( ) {
		System.out.println("독수리가 하늘을 납니다");
	}
	public void flying ( ) {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다.");
	}
}
public class AnimalTest01 {

	public static void main(String[] args) {
		AnimalTest01 atest=new AnimalTest01();
		atest.moveAnimal(new Human()); //Animal animal= new Human
		atest.moveAnimal(new Tiger()); //Animal animal= new Tiger
		atest.moveAnimal(new Eagle()); //Animal animal= new eagle
		
		
	}
		public void moveAnimal(Animal animal) {
		animal.move();
		}
		
}
