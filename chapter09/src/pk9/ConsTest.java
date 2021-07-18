package pk9;

public class ConsTest {
	
	private int aa;
	private int bb;
	//생성자를 통해서 멤버변수 세팅
	
	
	public ConsTest (int aa, int bb) {
	this.aa= aa;
	this.bb= bb;
		
	}
	

	public static void main(String[] args) {
		ConsTest ok= new ConsTest(10,20);
		
		System.out.println(ok.aa);
		System.out.println(ok.bb);
		
	}
}
