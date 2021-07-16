package pk3;

public class DoubleEx2 {

	public static void main(String[] args) {
		double d=1;
		d=d+0.1; System.out.println(d);
		d=d+0.1; System.out.println(d);
		d=d+0.1; System.out.println(d);
		//이렇게 만번 치는것이 아니라
		for(int i=0; i<=10000; i++) {
			d=d+0.1;
		}
		System.out.println(d);
	}

}
