package pk10;

public class BankA {
	// Bank class 
	private String palce;
	private String tell;
	static float interest;
	
	//생성자를 이용하여 Palce, tell set
	
	public BankA (String palce, String tell) {
		this. palce=palce;
		this. tell=tell;
	}
	
	//결과를 출력할 메서드 get
	 public void get() {
		 System.out.println("지점 : "+ palce+"\n"+"전화번호 : "+tell+"\n"+"이자 : "+interest);
	 }
	

}
