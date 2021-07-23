package pk11;

public class SportsCar extends Car {

	
	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("spee : "+speed);
		
	}
	//final 처리된 메서드는 Override 불가능
	/*@Override
	public void stop( ) {
		System.out.println("스포츠카를 멈춤");
	}*/

	public static void main(String[] args) {
		SportsCar ac=new SportsCar();
		ac.speedUp();
		ac.stop();

	}

}
