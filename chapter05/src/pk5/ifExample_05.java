package pk5;

public class ifExample_05 {

	public static void main(String[] args) {
		
		int age=10;
		int charge=0;
		int i=10;
		
		if(age<8) {
			charge=1000;
		}
		if(age<14) {
			charge=2000;
		}
		if(age<20 && (i+=4)<0) {
			charge=2500;
		}
		
		System.out.println("입장료는"+charge+"원입니다.");
		System.out.println(i);
	}

}
